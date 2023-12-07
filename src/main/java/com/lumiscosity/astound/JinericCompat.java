package com.lumiscosity.astound;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Objects;

import static net.minecraft.block.Blocks.BOOKSHELF;
import static net.minecraft.block.Blocks.LADDER;

public class JinericCompat {
    // ladders (also needs a render type set in the client)
    public static final Block GREAT_BIG_WORLD_ACAI_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    // bookshelves
    public static final Block GREAT_BIG_WORLD_ACAI_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));

    public static void createAndRegister() {
        makeBlock("great_big_world_acai_ladder", GREAT_BIG_WORLD_ACAI_LADDER, "ladder");
        makeBlock("great_big_world_acai_bookshelf",GREAT_BIG_WORLD_ACAI_BOOKSHELF, "bookshelf");
    }

    private static void makeBlock(String id, Block block, String type) {
        Registry.register(Registries.BLOCK, new Identifier("astound", id), block);
        Registry.register(Registries.ITEM, new Identifier("astound", id), new BlockItem(block, new FabricItemSettings()));
        if (Objects.equals(type, "ladder")) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
                content.addAfter(LADDER, block);
            });
        }
        else if (Objects.equals(type, "bookshelf")) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
                content.addAfter(BOOKSHELF, block);
            });
        }
    }
}
