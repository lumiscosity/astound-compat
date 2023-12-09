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
    public static final Block GREAT_BIG_WORLD_ASPEN_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block GREAT_BIG_WORLD_MAHOGANY_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_ANCIENT_OAK_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_BLIGHTED_BALSA_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_SWAMP_CYPRESS_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_WILLOW_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CINDERSCAPES_SCORCHED_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block CINDERSCAPES_UMBRAL_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block GARDENS_OF_THE_DEAD_SOULBLIGHT_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block GARDENS_OF_THE_DEAD_WHISTLECANE_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block PEARFECTION_CALLERY_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_DARK_AMARANTH_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block PROMENADE_MAPLE_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_PALM_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_SAKURA_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block SNIFFERPLUS_STONE_PINE_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block TRAVERSE_FIR_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_BAOBAB_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_CYPRESS_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_PALM_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));

    // bookshelves
    public static final Block GREAT_BIG_WORLD_ACAI_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block GREAT_BIG_WORLD_ASPEN_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block GREAT_BIG_WORLD_MAHOGANY_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block BIOMEMAKEOVER_ANCIENT_OAK_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block BIOMEMAKEOVER_BLIGHTED_BALSA_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block BIOMEMAKEOVER_SWAMP_CYPRESS_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block BIOMEMAKEOVER_WILLOW_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block CINDERSCAPES_SCORCHED_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block CINDERSCAPES_UMBRAL_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block GARDENS_OF_THE_DEAD_SOULBLIGHT_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block GARDENS_OF_THE_DEAD_WHISTLECANE_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block PEARFECTION_CALLERY_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block PROMENADE_DARK_AMARANTH_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block PROMENADE_MAPLE_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block PROMENADE_PALM_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block PROMENADE_SAKURA_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block SNIFFERPLUS_STONE_PINE_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block TRAVERSE_FIR_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block WILDERWILD_BAOBAB_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block WILDERWILD_CYPRESS_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final Block WILDERWILD_PALM_BOOKSHELF = new Block(FabricBlockSettings.copy(BOOKSHELF).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));

    public static void createAndRegister() {
        makeBlock("great_big_world_acai_ladder", GREAT_BIG_WORLD_ACAI_LADDER, "ladder");
        makeBlock("great_big_world_aspen_ladder", GREAT_BIG_WORLD_ASPEN_LADDER, "ladder");
        makeBlock("great_big_world_mahogany_ladder", GREAT_BIG_WORLD_MAHOGANY_LADDER, "ladder");
        makeBlock("biomemakeover_ancient_oak_ladder", BIOMEMAKEOVER_ANCIENT_OAK_LADDER, "ladder");
        makeBlock("biomemakeover_blighted_balsa_ladder", BIOMEMAKEOVER_BLIGHTED_BALSA_LADDER, "ladder");
        makeBlock("biomemakeover_swamp_cypress_ladder", BIOMEMAKEOVER_SWAMP_CYPRESS_LADDER, "ladder");
        makeBlock("biomemakeover_willow_ladder", BIOMEMAKEOVER_WILLOW_LADDER, "ladder");
        makeBlock("cinderscapes_scorched_ladder", CINDERSCAPES_SCORCHED_LADDER, "ladder");
        makeBlock("cinderscapes_umbral_ladder", CINDERSCAPES_UMBRAL_LADDER, "ladder");
        makeBlock("gardens_of_the_dead_soulblight_ladder", GARDENS_OF_THE_DEAD_SOULBLIGHT_LADDER, "ladder");
        makeBlock("gardens_of_the_dead_whistlecane_ladder", GARDENS_OF_THE_DEAD_WHISTLECANE_LADDER, "ladder");
        makeBlock("pearfection_callery_ladder", PEARFECTION_CALLERY_LADDER, "ladder");
        makeBlock("promenade_dark_amaranth_ladder", PROMENADE_DARK_AMARANTH_LADDER, "ladder");
        makeBlock("promenade_maple_ladder", PROMENADE_MAPLE_LADDER, "ladder");
        makeBlock("promenade_palm_ladder", PROMENADE_PALM_LADDER, "ladder");
        makeBlock("promenade_sakura_ladder", PROMENADE_SAKURA_LADDER, "ladder");
        makeBlock("snifferplus_stone_pine_ladder", SNIFFERPLUS_STONE_PINE_LADDER, "ladder");
        makeBlock("traverse_fir_ladder", TRAVERSE_FIR_LADDER, "ladder");
        makeBlock("wilderwild_baobab_ladder", WILDERWILD_BAOBAB_LADDER, "ladder");
        makeBlock("wilderwild_cypress_ladder", WILDERWILD_CYPRESS_LADDER, "ladder");
        makeBlock("wilderwild_palm_ladder", WILDERWILD_PALM_LADDER, "ladder");
        
        makeBlock("great_big_world_acai_bookshelf", GREAT_BIG_WORLD_ACAI_BOOKSHELF, "bookshelf");
        makeBlock("great_big_world_aspen_bookshelf", GREAT_BIG_WORLD_ASPEN_BOOKSHELF, "bookshelf");
        makeBlock("great_big_world_mahogany_bookshelf", GREAT_BIG_WORLD_MAHOGANY_BOOKSHELF, "bookshelf");
        makeBlock("biomemakeover_ancient_oak_bookshelf", BIOMEMAKEOVER_ANCIENT_OAK_BOOKSHELF, "bookshelf");
        makeBlock("biomemakeover_blighted_balsa_bookshelf", BIOMEMAKEOVER_BLIGHTED_BALSA_BOOKSHELF, "bookshelf");
        makeBlock("biomemakeover_swamp_cypress_bookshelf", BIOMEMAKEOVER_SWAMP_CYPRESS_BOOKSHELF, "bookshelf");
        makeBlock("biomemakeover_willow_bookshelf", BIOMEMAKEOVER_WILLOW_BOOKSHELF, "bookshelf");
        makeBlock("cinderscapes_scorched_bookshelf", CINDERSCAPES_SCORCHED_BOOKSHELF, "bookshelf");
        makeBlock("cinderscapes_umbral_bookshelf", CINDERSCAPES_UMBRAL_BOOKSHELF, "bookshelf");
        makeBlock("gardens_of_the_dead_soulblight_bookshelf", GARDENS_OF_THE_DEAD_SOULBLIGHT_BOOKSHELF, "bookshelf");
        makeBlock("gardens_of_the_dead_whistlecane_bookshelf", GARDENS_OF_THE_DEAD_WHISTLECANE_BOOKSHELF, "bookshelf");
        makeBlock("pearfection_callery_bookshelf", PEARFECTION_CALLERY_BOOKSHELF, "bookshelf");
        makeBlock("promenade_dark_amaranth_bookshelf", PROMENADE_DARK_AMARANTH_BOOKSHELF, "bookshelf");
        makeBlock("promenade_maple_bookshelf", PROMENADE_MAPLE_BOOKSHELF, "bookshelf");
        makeBlock("promenade_palm_bookshelf", PROMENADE_PALM_BOOKSHELF, "bookshelf");
        makeBlock("promenade_sakura_bookshelf", PROMENADE_SAKURA_BOOKSHELF, "bookshelf");
        makeBlock("snifferplus_stone_pine_bookshelf", SNIFFERPLUS_STONE_PINE_BOOKSHELF, "bookshelf");
        makeBlock("traverse_fir_bookshelf", TRAVERSE_FIR_BOOKSHELF, "bookshelf");
        makeBlock("wilderwild_baobab_bookshelf", WILDERWILD_BAOBAB_BOOKSHELF, "bookshelf");
        makeBlock("wilderwild_cypress_bookshelf", WILDERWILD_CYPRESS_BOOKSHELF, "bookshelf");
        makeBlock("wilderwild_palm_bookshelf", WILDERWILD_PALM_BOOKSHELF, "bookshelf");
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
