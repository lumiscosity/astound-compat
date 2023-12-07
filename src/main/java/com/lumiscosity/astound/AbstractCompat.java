package com.lumiscosity.astound;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frogipher.abstractmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import com.github.creoii.greatbigworld.main.registry.GBWBlocks;
import net.minecraft.util.Identifier;

import java.util.Objects;

public class AbstractCompat {
    public static final Block GREAT_BIG_WORLD_ACAI_TRIM = new Block(FabricBlockSettings.copy(GBWBlocks.ACAI.planks()).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block GREAT_BIG_WORLD_ACAI_PANEL = new Block(FabricBlockSettings.copy(GBWBlocks.ACAI.planks()).sounds(BlockSoundGroup.CHERRY_WOOD));

    public static void createAndRegister() {
        makeBlock("great_big_world_acai_trim", GREAT_BIG_WORLD_ACAI_TRIM, "trim");
        makeBlock("great_big_world_acai_panel",GREAT_BIG_WORLD_ACAI_PANEL, "panel");
    }

    private static void makeBlock(String id, Block block, String type) {
        Registry.register(Registries.BLOCK, new Identifier("astound", id), block);
        Registry.register(Registries.ITEM, new Identifier("astound", id), new BlockItem(block, new FabricItemSettings()));
        if (Objects.equals(type, "trim")) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
                content.addAfter(ModBlocks.WARPED_TRIM, block);
            });
        }
        else if (Objects.equals(type, "panel")) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
                content.addAfter(ModBlocks.WARPED_PANEL, block);
            });
        }
    }
}
