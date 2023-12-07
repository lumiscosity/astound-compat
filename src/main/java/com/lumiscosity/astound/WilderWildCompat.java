package com.lumiscosity.astound;

// import party.lemons.biomemakeover.init.BMBlocks;
// import com.terraformersmc.traverse.init.TraverseBlocks;
// import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
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

public final class WilderWildCompat {
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.WHITE, MapColor.WHITE_GRAY);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.WHITE);
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BROWN);
    public static final HollowedLogBlock CINDERSCAPES_HOLLOWED_SCORCHED_STEM = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BLACK, MapColor.BLACK);
    public static final HollowedLogBlock CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BLACK);
    public static final HollowedLogBlock CINDERSCAPES_HOLLOWED_UMBRAL_STEM = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.PURPLE, MapColor.WHITE);
    public static final HollowedLogBlock CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.PURPLE);

    public static void createAndRegister() {
        registerHLog("great_big_world_hollowed_acai_log", GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
        registerHLog("great_big_world_stripped_hollowed_acai_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        registerHLog("great_big_world_hollowed_aspen_log", GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG);
        registerHLog("great_big_world_stripped_hollowed_aspen_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        registerHLog("great_big_world_hollowed_mahogany_log", GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG);
        registerHLog("great_big_world_stripped_hollowed_mahogany_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        registerHLog("cinderscapes_hollowed_scorched_stem", CINDERSCAPES_HOLLOWED_SCORCHED_STEM, false);
        registerHLog("cinderscapes_stripped_hollowed_scorched_stem", CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM, false);
        registerHLog("cinderscapes_hollowed_umbral_stem", CINDERSCAPES_HOLLOWED_UMBRAL_STEM, false);
        registerHLog("cinderscapes_stripped_hollowed_umbral_stem", CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM, false);
        registerAxe();
        registerCreativeTabs();
        registerStrippable();
        registerTermite();
    }
    private static void registerAxe() {
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.ACAI.log(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.ACAI.strippedLog(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.ASPEN.log(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.ASPEN.strippedLog(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.MAHOGANY.log(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(GBWBlocks.MAHOGANY.strippedLog(), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG, false));
    }

    private static void registerCreativeTabs() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(GBWBlocks.ACAI.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(GBWBlocks.ACAI.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(GBWBlocks.ASPEN.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(GBWBlocks.ASPEN.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(GBWBlocks.MAHOGANY.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(GBWBlocks.MAHOGANY.log().asItem(), GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG);
            content.addAfter(GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        });
    }

    private static void registerStrippable() {
        // GBW has a bug where you can't strip logs at all, so we'll fix it here as well
        StrippableBlockRegistry.register(GBWBlocks.ACAI.log(), GBWBlocks.ACAI.strippedLog());
        StrippableBlockRegistry.register(GBWBlocks.ASPEN.log(), GBWBlocks.ASPEN.strippedLog());
        StrippableBlockRegistry.register(GBWBlocks.MAHOGANY.log(), GBWBlocks.MAHOGANY.strippedLog());

        StrippableBlockRegistry.register(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        StrippableBlockRegistry.register(GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        StrippableBlockRegistry.register(GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
    }

    private static void registerTermite() {
        // also adding base mod logs here
        Termite.addDegradable(GBWBlocks.ACAI.log(), GBWBlocks.ACAI.strippedLog());
        Termite.addDegradable(GBWBlocks.ACAI.strippedLog(), GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        Termite.addDegradable(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        Termite.addDegradable(GBWBlocks.ACAI.wood(), GBWBlocks.ACAI.strippedWood());
        Termite.addDegradable(GBWBlocks.ASPEN.log(), GBWBlocks.ASPEN.strippedLog());
        Termite.addDegradable(GBWBlocks.ASPEN.strippedLog(), GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        Termite.addDegradable(GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        Termite.addDegradable(GBWBlocks.ASPEN.wood(), GBWBlocks.ASPEN.strippedWood());
        Termite.addDegradable(GBWBlocks.MAHOGANY.log(), GBWBlocks.MAHOGANY.strippedLog());
        Termite.addDegradable(GBWBlocks.MAHOGANY.strippedLog(), GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        Termite.addDegradable(GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        Termite.addDegradable(GBWBlocks.MAHOGANY.wood(), GBWBlocks.MAHOGANY.strippedWood());
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
