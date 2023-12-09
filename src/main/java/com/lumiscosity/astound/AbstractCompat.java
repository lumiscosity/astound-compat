package com.lumiscosity.astound;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frogipher.abstractmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import com.github.creoii.greatbigworld.main.registry.GBWBlocks;
import net.minecraft.util.Identifier;

import java.util.Objects;

import static net.minecraft.block.Blocks.*;

public class AbstractCompat {
    // trims
    public static final Block GREAT_BIG_WORLD_ACAI_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block GREAT_BIG_WORLD_ASPEN_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block GREAT_BIG_WORLD_MAHOGANY_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_ANCIENT_OAK_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_BLIGHTED_BALSA_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_SWAMP_CYPRESS_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_WILLOW_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CINDERSCAPES_SCORCHED_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block CINDERSCAPES_UMBRAL_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block GARDENS_OF_THE_DEAD_SOULBLIGHT_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block GARDENS_OF_THE_DEAD_WHISTLECANE_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block PEARFECTION_CALLERY_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_DARK_AMARANTH_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block PROMENADE_MAPLE_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_PALM_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_SAKURA_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block SNIFFERPLUS_STONE_PINE_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block TRAVERSE_FIR_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_BAOBAB_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_CYPRESS_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_PALM_TRIM = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));

    // panels
    public static final Block GREAT_BIG_WORLD_ACAI_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block GREAT_BIG_WORLD_ASPEN_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block GREAT_BIG_WORLD_MAHOGANY_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_ANCIENT_OAK_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_BLIGHTED_BALSA_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_SWAMP_CYPRESS_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block BIOMEMAKEOVER_WILLOW_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block CINDERSCAPES_SCORCHED_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block CINDERSCAPES_UMBRAL_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block GARDENS_OF_THE_DEAD_SOULBLIGHT_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block GARDENS_OF_THE_DEAD_WHISTLECANE_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block PEARFECTION_CALLERY_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_DARK_AMARANTH_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.NETHER_WOOD));
    public static final Block PROMENADE_MAPLE_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_PALM_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block PROMENADE_SAKURA_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block SNIFFERPLUS_STONE_PINE_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block TRAVERSE_FIR_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_BAOBAB_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_CYPRESS_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));
    public static final Block WILDERWILD_PALM_PANEL = new Block(FabricBlockSettings.copy(OAK_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD));

    public static void createAndRegister() {
        makeBlock("great_big_world_acai_trim", GREAT_BIG_WORLD_ACAI_TRIM, "trim");
        makeBlock("great_big_world_aspen_trim", GREAT_BIG_WORLD_ASPEN_TRIM, "trim");
        makeBlock("great_big_world_mahogany_trim", GREAT_BIG_WORLD_MAHOGANY_TRIM, "trim");
        makeBlock("biomemakeover_ancient_oak_trim", BIOMEMAKEOVER_ANCIENT_OAK_TRIM, "trim");
        makeBlock("biomemakeover_blighted_balsa_trim", BIOMEMAKEOVER_BLIGHTED_BALSA_TRIM, "trim");
        makeBlock("biomemakeover_swamp_cypress_trim", BIOMEMAKEOVER_SWAMP_CYPRESS_TRIM, "trim");
        makeBlock("biomemakeover_willow_trim", BIOMEMAKEOVER_WILLOW_TRIM, "trim");
        makeBlock("cinderscapes_scorched_trim", CINDERSCAPES_SCORCHED_TRIM, "trim");
        makeBlock("cinderscapes_umbral_trim", CINDERSCAPES_UMBRAL_TRIM, "trim");
        makeBlock("gardens_of_the_dead_soulblight_trim", GARDENS_OF_THE_DEAD_SOULBLIGHT_TRIM, "trim");
        makeBlock("gardens_of_the_dead_whistlecane_trim", GARDENS_OF_THE_DEAD_WHISTLECANE_TRIM, "trim");
        makeBlock("pearfection_callery_trim", PEARFECTION_CALLERY_TRIM, "trim");
        makeBlock("promenade_dark_amaranth_trim", PROMENADE_DARK_AMARANTH_TRIM, "trim");
        makeBlock("promenade_maple_trim", PROMENADE_MAPLE_TRIM, "trim");
        makeBlock("promenade_palm_trim", PROMENADE_PALM_TRIM, "trim");
        makeBlock("promenade_sakura_trim", PROMENADE_SAKURA_TRIM, "trim");
        makeBlock("snifferplus_stone_pine_trim", SNIFFERPLUS_STONE_PINE_TRIM, "trim");
        makeBlock("traverse_fir_trim", TRAVERSE_FIR_TRIM, "trim");
        makeBlock("wilderwild_baobab_trim", WILDERWILD_BAOBAB_TRIM, "trim");
        makeBlock("wilderwild_cypress_trim", WILDERWILD_CYPRESS_TRIM, "trim");
        makeBlock("wilderwild_palm_trim", WILDERWILD_PALM_TRIM, "trim");

        makeBlock("great_big_world_acai_panel", GREAT_BIG_WORLD_ACAI_PANEL, "panel");
        makeBlock("great_big_world_aspen_panel", GREAT_BIG_WORLD_ASPEN_PANEL, "panel");
        makeBlock("great_big_world_mahogany_panel", GREAT_BIG_WORLD_MAHOGANY_PANEL, "panel");
        makeBlock("biomemakeover_ancient_oak_panel", BIOMEMAKEOVER_ANCIENT_OAK_PANEL, "panel");
        makeBlock("biomemakeover_blighted_balsa_panel", BIOMEMAKEOVER_BLIGHTED_BALSA_PANEL, "panel");
        makeBlock("biomemakeover_swamp_cypress_panel", BIOMEMAKEOVER_SWAMP_CYPRESS_PANEL, "panel");
        makeBlock("biomemakeover_willow_panel", BIOMEMAKEOVER_WILLOW_PANEL, "panel");
        makeBlock("cinderscapes_scorched_panel", CINDERSCAPES_SCORCHED_PANEL, "panel");
        makeBlock("cinderscapes_umbral_panel", CINDERSCAPES_UMBRAL_PANEL, "panel");
        makeBlock("gardens_of_the_dead_soulblight_panel", GARDENS_OF_THE_DEAD_SOULBLIGHT_PANEL, "panel");
        makeBlock("gardens_of_the_dead_whistlecane_panel", GARDENS_OF_THE_DEAD_WHISTLECANE_PANEL, "panel");
        makeBlock("pearfection_callery_panel", PEARFECTION_CALLERY_PANEL, "panel");
        makeBlock("promenade_dark_amaranth_panel", PROMENADE_DARK_AMARANTH_PANEL, "panel");
        makeBlock("promenade_maple_panel", PROMENADE_MAPLE_PANEL, "panel");
        makeBlock("promenade_palm_panel", PROMENADE_PALM_PANEL, "panel");
        makeBlock("promenade_sakura_panel", PROMENADE_SAKURA_PANEL, "panel");
        makeBlock("snifferplus_stone_pine_panel", SNIFFERPLUS_STONE_PINE_PANEL, "panel");
        makeBlock("traverse_fir_panel", TRAVERSE_FIR_PANEL, "panel");
        makeBlock("wilderwild_baobab_panel", WILDERWILD_BAOBAB_PANEL, "panel");
        makeBlock("wilderwild_cypress_panel", WILDERWILD_CYPRESS_PANEL, "panel");
        makeBlock("wilderwild_palm_panel", WILDERWILD_PALM_PANEL, "panel");
    }
    private static void makeBlock(String id, Block block, String type) {
        Registry.register(Registries.BLOCK, new Identifier("astound", id), block);
        Registry.register(Registries.ITEM, new Identifier("astound", id), new BlockItem(block, new FabricItemSettings()));
        if (Objects.equals(type, "trim")) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                content.addAfter(ModBlocks.WARPED_TRIM, block);
            });
        }
        else if (Objects.equals(type, "panel")) {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
                content.addAfter(ModBlocks.WARPED_PANEL, block);
            });
        }
    }
}
