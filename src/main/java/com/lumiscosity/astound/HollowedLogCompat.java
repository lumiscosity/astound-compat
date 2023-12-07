package com.lumiscosity.astound;

import com.github.creoii.greatbigworld.main.registry.GBWBlocks;
import com.lumiscosity.astound.mixin.HollowedLogInvoker;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.frozenblock.lib.axe.api.AxeBehaviors;
import net.frozenblock.wilderwild.block.HollowedLogBlock;
import net.frozenblock.wilderwild.entity.ai.TermiteManager.Termite;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class HollowedLogCompat{
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BROWN);

    public static void createAndRegister() {
        registerHLog("great_big_world_hollowed_acai_log", GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
        registerHLog("great_big_world_stripped_hollowed_acai_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        registerAxe();
        registerCreativeTabs();
        registerStrippable();
        registerTermite();
    }
    public static void registerAxe() {
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.ACAI.log(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.ACAI.strippedLog(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG, false));
    }

    public static void registerCreativeTabs() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(GBWBlocks.ACAI.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(GBWBlocks.ACAI.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        });
    }

    private static void registerStrippable() {
        // GBW has a bug where you can't strip logs at all, so we'll fix it here as well
        StrippableBlockRegistry.register(GBWBlocks.ACAI.log(), GBWBlocks.ACAI.strippedLog());
        StrippableBlockRegistry.register(GBWBlocks.ASPEN.log(), GBWBlocks.ASPEN.strippedLog());
        StrippableBlockRegistry.register(GBWBlocks.MAHOGANY.log(), GBWBlocks.MAHOGANY.strippedLog());

        StrippableBlockRegistry.register(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
    }

    private static void registerTermite() {
        // also adding base mod logs here
        Termite.addDegradable(GBWBlocks.ACAI.log(), GBWBlocks.ACAI.strippedLog());
        Termite.addDegradable(GBWBlocks.ACAI.strippedLog(), GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        Termite.addDegradable(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        Termite.addDegradable(GBWBlocks.ACAI.wood(), GBWBlocks.ACAI.strippedWood());
    }

    private static void registerHLog(String id, Block block) {
        registerHLog(id, block, true);
    }
    private static void registerHLog(String id, Block block, Boolean flammability) {
        Registry.register(Registries.BLOCK, new Identifier("astound", id), block);
        Registry.register(Registries.ITEM, new Identifier("astound", id), new BlockItem(block, new FabricItemSettings()));
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(block.asItem(), 300);
        if (flammability) {
            var flammableBlockRegistry = FlammableBlockRegistry.getDefaultInstance();
            flammableBlockRegistry.add(block, 5, 5);
        }
    }
}
