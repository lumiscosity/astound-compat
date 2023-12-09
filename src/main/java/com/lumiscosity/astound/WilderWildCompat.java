package com.lumiscosity.astound;

import net.digitalpear.pearfection.init.PearBlocks;
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

import static com.lumiscosity.astound.CommonShorthands.fromID;

public final class WilderWildCompat {
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.WHITE, MapColor.WHITE_GRAY);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.WHITE);
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BROWN);
    public static final HollowedLogBlock BIOMEMAKEOVER_HOLLOWED_ANCIENT_OAK_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BLACK, MapColor.TERRACOTTA_BLACK);
    public static final HollowedLogBlock BIOMEMAKEOVER_STRIPPED_HOLLOWED_ANCIENT_OAK_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.TERRACOTTA_BLACK);
    public static final HollowedLogBlock BIOMEMAKEOVER_HOLLOWED_BLIGHTED_BALSA_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.TERRACOTTA_BLUE, MapColor.WHITE);
    public static final HollowedLogBlock BIOMEMAKEOVER_STRIPPED_HOLLOWED_BLIGHTED_BALSA_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.WHITE);
    public static final HollowedLogBlock BIOMEMAKEOVER_HOLLOWED_SWAMP_CYPRESS_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.GRAY, MapColor.ORANGE);
    public static final HollowedLogBlock BIOMEMAKEOVER_STRIPPED_HOLLOWED_SWAMP_CYPRESS_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.ORANGE);
    public static final HollowedLogBlock BIOMEMAKEOVER_HOLLOWED_WILLOW_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.LICHEN_GREEN, MapColor.OFF_WHITE);
    public static final HollowedLogBlock BIOMEMAKEOVER_STRIPPED_HOLLOWED_WILLOW_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.OFF_WHITE);
    public static final HollowedLogBlock CINDERSCAPES_HOLLOWED_SCORCHED_STEM = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BLACK, MapColor.BLACK);
    public static final HollowedLogBlock CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BLACK);
    public static final HollowedLogBlock CINDERSCAPES_HOLLOWED_UMBRAL_STEM = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.PURPLE, MapColor.WHITE);
    public static final HollowedLogBlock CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.PURPLE);
    public static final HollowedLogBlock GARDENS_OF_THE_DEAD_HOLLOWED_SOULBLIGHT_STEM = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.OAK_TAN, MapColor.OAK_TAN);
    public static final HollowedLogBlock GARDENS_OF_THE_DEAD_STRIPPED_HOLLOWED_SOULBLIGHT_STEM = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.OAK_TAN);
    public static final HollowedLogBlock PEARFECTION_HOLLOWED_CALLERY_STEM = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.OAK_TAN, MapColor.OAK_TAN);
    public static final HollowedLogBlock PEARFECTION_STRIPPED_HOLLOWED_CALLERY_STEM = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.OAK_TAN);
    public static final HollowedLogBlock PROMENADE_HOLLOWED_DARK_AMARANTH_STEM = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.PURPLE, MapColor.LIGHT_BLUE);
    public static final HollowedLogBlock PROMENADE_STRIPPED_HOLLOWED_DARK_AMARANTH_STEM = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.PURPLE);
    public static final HollowedLogBlock PROMENADE_HOLLOWED_MAPLE_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.LIGHT_BLUE_GRAY, MapColor.LIGHT_GRAY);
    public static final HollowedLogBlock PROMENADE_STRIPPED_HOLLOWED_MAPLE_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.LIGHT_BLUE_GRAY);
    public static final HollowedLogBlock PROMENADE_HOLLOWED_PALM_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BROWN, MapColor.ORANGE);
    public static final HollowedLogBlock PROMENADE_STRIPPED_HOLLOWED_PALM_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.ORANGE);
    public static final HollowedLogBlock PROMENADE_HOLLOWED_SAKURA_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.SPRUCE_BROWN, MapColor.SPRUCE_BROWN);
    public static final HollowedLogBlock PROMENADE_STRIPPED_HOLLOWED_SAKURA_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.SPRUCE_BROWN);
    public static final HollowedLogBlock SNIFFERPLUS_HOLLOWED_STONE_PINE_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.STONE_GRAY, MapColor.LIGHT_GRAY);
    public static final HollowedLogBlock SNIFFERPLUS_STRIPPED_HOLLOWED_STONE_PINE_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.LIGHT_GRAY);
    public static final HollowedLogBlock TRAVERSE_HOLLOWED_FIR_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BLACK, MapColor.SPRUCE_BROWN);
    public static final HollowedLogBlock TRAVERSE_STRIPPED_HOLLOWED_FIR_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.SPRUCE_BROWN);

    public static void createAndRegister() {
        registerHLog("great_big_world_hollowed_acai_log", GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
        registerHLog("great_big_world_stripped_hollowed_acai_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        registerHLog("great_big_world_hollowed_aspen_log", GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG);
        registerHLog("great_big_world_stripped_hollowed_aspen_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        registerHLog("great_big_world_hollowed_mahogany_log", GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG);
        registerHLog("great_big_world_stripped_hollowed_mahogany_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        registerHLog("biomemakeover_hollowed_ancient_oak_log", BIOMEMAKEOVER_HOLLOWED_ANCIENT_OAK_LOG);
        registerHLog("biomemakeover_stripped_hollowed_ancient_oak_log", BIOMEMAKEOVER_STRIPPED_HOLLOWED_ANCIENT_OAK_LOG);
        registerHLog("biomemakeover_hollowed_blighted_balsa_log", BIOMEMAKEOVER_HOLLOWED_BLIGHTED_BALSA_LOG);
        registerHLog("biomemakeover_stripped_hollowed_blighted_balsa_log", BIOMEMAKEOVER_STRIPPED_HOLLOWED_BLIGHTED_BALSA_LOG);
        registerHLog("biomemakeover_hollowed_swamp_cypress_log", BIOMEMAKEOVER_HOLLOWED_SWAMP_CYPRESS_LOG);
        registerHLog("biomemakeover_stripped_hollowed_swamp_cypress_log", BIOMEMAKEOVER_STRIPPED_HOLLOWED_SWAMP_CYPRESS_LOG);
        registerHLog("biomemakeover_hollowed_willow_log", BIOMEMAKEOVER_HOLLOWED_WILLOW_LOG);
        registerHLog("biomemakeover_stripped_hollowed_willow_log", BIOMEMAKEOVER_STRIPPED_HOLLOWED_WILLOW_LOG);
        registerHLog("cinderscapes_hollowed_scorched_stem", CINDERSCAPES_HOLLOWED_SCORCHED_STEM, false);
        registerHLog("cinderscapes_stripped_hollowed_scorched_stem", CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM, false);
        registerHLog("cinderscapes_hollowed_umbral_stem", CINDERSCAPES_HOLLOWED_UMBRAL_STEM, false);
        registerHLog("cinderscapes_stripped_hollowed_umbral_stem", CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM, false);
        registerHLog("gardens_of_the_dead_hollowed_soulblight_stem", GARDENS_OF_THE_DEAD_HOLLOWED_SOULBLIGHT_STEM, false);
        registerHLog("gardens_of_the_dead_stripped_hollowed_soulblight_stem", GARDENS_OF_THE_DEAD_STRIPPED_HOLLOWED_SOULBLIGHT_STEM, false);
        registerHLog("pearfection_hollowed_callery_stem", PEARFECTION_HOLLOWED_CALLERY_STEM, false);
        registerHLog("pearfection_stripped_hollowed_callery_stem", PEARFECTION_STRIPPED_HOLLOWED_CALLERY_STEM, false);
        registerHLog("promenade_hollowed_dark_amaranth_stem", PROMENADE_HOLLOWED_DARK_AMARANTH_STEM);
        registerHLog("promenade_stripped_hollowed_dark_amaranth_stem", PROMENADE_STRIPPED_HOLLOWED_DARK_AMARANTH_STEM);
        registerHLog("promenade_hollowed_maple_log", PROMENADE_HOLLOWED_MAPLE_LOG);
        registerHLog("promenade_stripped_hollowed_maple_log", PROMENADE_STRIPPED_HOLLOWED_MAPLE_LOG);
        registerHLog("promenade_hollowed_palm_log", PROMENADE_HOLLOWED_PALM_LOG);
        registerHLog("promenade_stripped_hollowed_palm_log", PROMENADE_STRIPPED_HOLLOWED_PALM_LOG);
        registerHLog("promenade_hollowed_sakura_log", PROMENADE_HOLLOWED_SAKURA_LOG);
        registerHLog("promenade_stripped_hollowed_sakura_log", PROMENADE_STRIPPED_HOLLOWED_SAKURA_LOG);
        registerHLog("snifferplus_hollowed_stone_pine_log", SNIFFERPLUS_HOLLOWED_STONE_PINE_LOG);
        registerHLog("snifferplus_stripped_hollowed_stone_pine_log", SNIFFERPLUS_STRIPPED_HOLLOWED_STONE_PINE_LOG);
        registerHLog("traverse_hollowed_fir_log", TRAVERSE_HOLLOWED_FIR_LOG);
        registerHLog("traverse_stripped_hollowed_fir_log", TRAVERSE_STRIPPED_HOLLOWED_FIR_LOG);
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
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:ancient_oak_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_HOLLOWED_ANCIENT_OAK_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:stripped_ancient_oak_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_STRIPPED_HOLLOWED_ANCIENT_OAK_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:blighted_balsa_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_HOLLOWED_BLIGHTED_BALSA_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:stripped_blighted_balsa_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_STRIPPED_HOLLOWED_BLIGHTED_BALSA_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:swamp_cypress_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_HOLLOWED_SWAMP_CYPRESS_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:stripped_swamp_cypress_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_STRIPPED_HOLLOWED_SWAMP_CYPRESS_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:willow_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_HOLLOWED_WILLOW_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("biomemakeover:stripped_willow_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, BIOMEMAKEOVER_STRIPPED_HOLLOWED_WILLOW_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("cinderscapes:scorched_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, CINDERSCAPES_HOLLOWED_SCORCHED_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("cinderscapes:stripped_scorched_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("cinderscapes:umbral_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, CINDERSCAPES_HOLLOWED_UMBRAL_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("cinderscapes:stripped_umbral_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("gardens_of_the_dead:soulblight_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GARDENS_OF_THE_DEAD_HOLLOWED_SOULBLIGHT_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("gardens_of_the_dead:stripped_soulblight_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, GARDENS_OF_THE_DEAD_STRIPPED_HOLLOWED_SOULBLIGHT_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(PearBlocks.CALLERY_STEM, (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PEARFECTION_HOLLOWED_CALLERY_STEM, false));
        AxeBehaviors.AXE_BEHAVIORS.put(PearBlocks.STRIPPED_CALLERY_STEM, (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PEARFECTION_STRIPPED_HOLLOWED_CALLERY_STEM, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:dark_amaranth_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_HOLLOWED_DARK_AMARANTH_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:stripped_dark_amaranth_stem"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_STRIPPED_HOLLOWED_DARK_AMARANTH_STEM, true));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:maple_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_HOLLOWED_MAPLE_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:stripped_maple_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_STRIPPED_HOLLOWED_MAPLE_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:palm_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_HOLLOWED_PALM_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:stripped_palm_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_STRIPPED_HOLLOWED_PALM_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:sakura_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_HOLLOWED_SAKURA_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("promenade:stripped_sakura_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, PROMENADE_STRIPPED_HOLLOWED_SAKURA_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("snifferplus:stone_pine_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, SNIFFERPLUS_HOLLOWED_STONE_PINE_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("snifferplus:stripped_stone_pine_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, SNIFFERPLUS_STRIPPED_HOLLOWED_STONE_PINE_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("traverse:fir_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, TRAVERSE_HOLLOWED_FIR_LOG, false));
        AxeBehaviors.AXE_BEHAVIORS.put(fromID("traverse:stripped_fir_log"), (context, level, pos, state, face, horizontal) ->
                HollowedLogBlock.hollow(level, pos, state, face, TRAVERSE_STRIPPED_HOLLOWED_FIR_LOG, false));
    }

    private static void registerCreativeTabs() {
        quickTabs(GBWBlocks.ACAI.log(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        quickTabs(GBWBlocks.ASPEN.log(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        quickTabs(GBWBlocks.MAHOGANY.log(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        quickTabs(fromID("biomemakeover:ancient_oak_log"), BIOMEMAKEOVER_HOLLOWED_ANCIENT_OAK_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_ANCIENT_OAK_LOG);
        quickTabs(fromID("biomemakeover:blighted_balsa_log"), BIOMEMAKEOVER_HOLLOWED_BLIGHTED_BALSA_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_BLIGHTED_BALSA_LOG);
        quickTabs(fromID("biomemakeover:swamp_cypress_log"), BIOMEMAKEOVER_HOLLOWED_SWAMP_CYPRESS_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_SWAMP_CYPRESS_LOG);
        quickTabs(fromID("biomemakeover:willow_log"), BIOMEMAKEOVER_HOLLOWED_WILLOW_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_WILLOW_LOG);
        quickTabs(fromID("cinderscapes:scorched_stem"), CINDERSCAPES_HOLLOWED_SCORCHED_STEM, CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM);
        quickTabs(fromID("cinderscapes:umbral_stem"), CINDERSCAPES_HOLLOWED_UMBRAL_STEM, CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM);
        quickTabs(fromID("gardens_of_the_dead:soulblight_stem"), GARDENS_OF_THE_DEAD_HOLLOWED_SOULBLIGHT_STEM, GARDENS_OF_THE_DEAD_STRIPPED_HOLLOWED_SOULBLIGHT_STEM);
        quickTabs(PearBlocks.CALLERY_STEM, PEARFECTION_HOLLOWED_CALLERY_STEM, PEARFECTION_STRIPPED_HOLLOWED_CALLERY_STEM);
        quickTabs(fromID("promenade:dark_amaranth_stem"), PROMENADE_HOLLOWED_DARK_AMARANTH_STEM, PROMENADE_STRIPPED_HOLLOWED_DARK_AMARANTH_STEM);
        quickTabs(fromID("promenade:maple_log"), PROMENADE_HOLLOWED_MAPLE_LOG, PROMENADE_STRIPPED_HOLLOWED_MAPLE_LOG);
        quickTabs(fromID("promenade:palm_log"), PROMENADE_HOLLOWED_PALM_LOG, PROMENADE_STRIPPED_HOLLOWED_PALM_LOG);
        quickTabs(fromID("promenade:sakura_log"), PROMENADE_HOLLOWED_SAKURA_LOG, PROMENADE_STRIPPED_HOLLOWED_SAKURA_LOG);
        quickTabs(fromID("snifferplus:stone_pine_log"), SNIFFERPLUS_HOLLOWED_STONE_PINE_LOG, SNIFFERPLUS_STRIPPED_HOLLOWED_STONE_PINE_LOG);
        quickTabs(fromID("traverse:fir_log"), TRAVERSE_HOLLOWED_FIR_LOG, TRAVERSE_STRIPPED_HOLLOWED_FIR_LOG);
    }

    private static void registerStrippable() {
        // GBW has a bug where you can't strip logs at all, so we'll fix it here as well
        StrippableBlockRegistry.register(GBWBlocks.ACAI.log(), GBWBlocks.ACAI.strippedLog());
        StrippableBlockRegistry.register(GBWBlocks.ASPEN.log(), GBWBlocks.ASPEN.strippedLog());
        StrippableBlockRegistry.register(GBWBlocks.MAHOGANY.log(), GBWBlocks.MAHOGANY.strippedLog());
        StrippableBlockRegistry.register(GBWBlocks.ACAI.wood(), GBWBlocks.ACAI.strippedWood());
        StrippableBlockRegistry.register(GBWBlocks.ASPEN.wood(), GBWBlocks.ASPEN.strippedWood());
        StrippableBlockRegistry.register(GBWBlocks.MAHOGANY.wood(), GBWBlocks.MAHOGANY.strippedWood());

        StrippableBlockRegistry.register(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        StrippableBlockRegistry.register(GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        StrippableBlockRegistry.register(GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        StrippableBlockRegistry.register(BIOMEMAKEOVER_HOLLOWED_ANCIENT_OAK_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_ANCIENT_OAK_LOG);
        StrippableBlockRegistry.register(BIOMEMAKEOVER_HOLLOWED_BLIGHTED_BALSA_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_BLIGHTED_BALSA_LOG);
        StrippableBlockRegistry.register(BIOMEMAKEOVER_HOLLOWED_SWAMP_CYPRESS_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_SWAMP_CYPRESS_LOG);
        StrippableBlockRegistry.register(BIOMEMAKEOVER_HOLLOWED_WILLOW_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_WILLOW_LOG);
        StrippableBlockRegistry.register(CINDERSCAPES_HOLLOWED_SCORCHED_STEM, CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM);
        StrippableBlockRegistry.register(CINDERSCAPES_HOLLOWED_UMBRAL_STEM, CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM);
        StrippableBlockRegistry.register(GARDENS_OF_THE_DEAD_HOLLOWED_SOULBLIGHT_STEM, GARDENS_OF_THE_DEAD_STRIPPED_HOLLOWED_SOULBLIGHT_STEM);
        StrippableBlockRegistry.register(PEARFECTION_HOLLOWED_CALLERY_STEM, PEARFECTION_STRIPPED_HOLLOWED_CALLERY_STEM);
        StrippableBlockRegistry.register(PROMENADE_HOLLOWED_DARK_AMARANTH_STEM, PROMENADE_STRIPPED_HOLLOWED_DARK_AMARANTH_STEM);
        StrippableBlockRegistry.register(PROMENADE_HOLLOWED_MAPLE_LOG, PROMENADE_STRIPPED_HOLLOWED_MAPLE_LOG);
        StrippableBlockRegistry.register(PROMENADE_HOLLOWED_PALM_LOG, PROMENADE_STRIPPED_HOLLOWED_PALM_LOG);
        StrippableBlockRegistry.register(PROMENADE_HOLLOWED_SAKURA_LOG, PROMENADE_STRIPPED_HOLLOWED_SAKURA_LOG);
        StrippableBlockRegistry.register(SNIFFERPLUS_HOLLOWED_STONE_PINE_LOG, SNIFFERPLUS_STRIPPED_HOLLOWED_STONE_PINE_LOG);
        StrippableBlockRegistry.register(TRAVERSE_HOLLOWED_FIR_LOG, TRAVERSE_STRIPPED_HOLLOWED_FIR_LOG);
    }

    private static void registerTermite() {
        quickTermite(GBWBlocks.ACAI.log(), GBWBlocks.ACAI.strippedLog(), GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        Termite.addDegradable(GBWBlocks.ACAI.wood(), GBWBlocks.ACAI.strippedWood());
        quickTermite(GBWBlocks.ASPEN.log(), GBWBlocks.ASPEN.strippedLog(), GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG);
        Termite.addDegradable(GBWBlocks.ASPEN.wood(), GBWBlocks.ASPEN.strippedWood());
        quickTermite(GBWBlocks.MAHOGANY.log(), GBWBlocks.MAHOGANY.strippedLog(), GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG);
        Termite.addDegradable(GBWBlocks.MAHOGANY.wood(), GBWBlocks.MAHOGANY.strippedWood());
        quickTermite(fromID("biomemakeover:ancient_oak_log"), fromID("biomemakeover:stripped_ancient_oak_log"), BIOMEMAKEOVER_HOLLOWED_ANCIENT_OAK_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_ANCIENT_OAK_LOG);
        Termite.addDegradable(fromID("biomemakeover:ancient_oak_wood"), fromID("biomemakeover:stripped_ancient_oak_wood"));
        quickTermite(fromID("biomemakeover:blighted_balsa_log"), fromID("biomemakeover:stripped_blighted_balsa_log"), BIOMEMAKEOVER_HOLLOWED_BLIGHTED_BALSA_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_BLIGHTED_BALSA_LOG);
        Termite.addDegradable(fromID("biomemakeover:blighted_balsa_wood"), fromID("biomemakeover:stripped_blighted_balsa_wood"));
        quickTermite(fromID("biomemakeover:swamp_cypress_log"), fromID("biomemakeover:stripped_swamp_cypress_log"), BIOMEMAKEOVER_HOLLOWED_SWAMP_CYPRESS_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_SWAMP_CYPRESS_LOG);
        Termite.addDegradable(fromID("biomemakeover:swamp_cypress_wood"), fromID("biomemakeover:stripped_swamp_cypress_wood"));
        quickTermite(fromID("biomemakeover:willow_log"), fromID("biomemakeover:stripped_willow_log"), BIOMEMAKEOVER_HOLLOWED_WILLOW_LOG, BIOMEMAKEOVER_STRIPPED_HOLLOWED_WILLOW_LOG);
        Termite.addDegradable(fromID("biomemakeover:willow_wood"), fromID("biomemakeover:stripped_willow_wood"));
        quickTermite(fromID("cinderscapes:scorched_stem"), fromID("cinderscapes:stripped_scorched_stem"), CINDERSCAPES_HOLLOWED_SCORCHED_STEM, CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM);
        Termite.addDegradable(fromID("cinderscapes:scorched_hyphae"), fromID("cinderscapes:stripped_scorched_hyphae"));
        quickTermite(fromID("cinderscapes:umbral_stem"), fromID("cinderscapes:stripped_umbral_stem"), CINDERSCAPES_HOLLOWED_SCORCHED_STEM, CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM);
        Termite.addDegradable(fromID("cinderscapes:umbral_hyphae"), fromID("cinderscapes:stripped_umbral_hyphae"));
        quickTermite(fromID("gardens_of_the_dead:soulblight_stem"), fromID("gardens_of_the_dead:stripped_soulblight_stem"), GARDENS_OF_THE_DEAD_HOLLOWED_SOULBLIGHT_STEM, GARDENS_OF_THE_DEAD_STRIPPED_HOLLOWED_SOULBLIGHT_STEM);
        Termite.addDegradable(fromID("gardens_of_the_dead:soulblight_hyphae"), fromID("gardens_of_the_dead:stripped_soulblight_hyphae"));
        quickTermite(PearBlocks.CALLERY_STEM, PearBlocks.STRIPPED_CALLERY_STEM, PEARFECTION_HOLLOWED_CALLERY_STEM, PEARFECTION_STRIPPED_HOLLOWED_CALLERY_STEM);
        Termite.addDegradable(PearBlocks.CALLERY_WOOD, PearBlocks.STRIPPED_CALLERY_WOOD);
        quickTermite(fromID("promenade:dark_amaranth_stem"), fromID("promenade:stripped_dark_amaranth_stem"), PROMENADE_HOLLOWED_DARK_AMARANTH_STEM, PROMENADE_STRIPPED_HOLLOWED_DARK_AMARANTH_STEM);
        Termite.addDegradable(fromID("promenade:dark_amaranth_hyphae"), fromID("promenade:stripped_dark_amaranth_hyphae"));
        quickTermite(fromID("promenade:maple_log"), fromID("promenade:stripped_maple_log"), PROMENADE_HOLLOWED_MAPLE_LOG, PROMENADE_STRIPPED_HOLLOWED_MAPLE_LOG);
        Termite.addDegradable(fromID("promenade:maple_wood"), fromID("promenade:stripped_maple_wood"));
        quickTermite(fromID("promenade:palm_log"), fromID("promenade:stripped_palm_log"), PROMENADE_HOLLOWED_PALM_LOG, PROMENADE_STRIPPED_HOLLOWED_PALM_LOG);
        Termite.addDegradable(fromID("promenade:palm_wood"), fromID("promenade:stripped_palm_wood"));
        quickTermite(fromID("promenade:sakura_log"), fromID("promenade:stripped_sakura_log"), PROMENADE_HOLLOWED_SAKURA_LOG, PROMENADE_STRIPPED_HOLLOWED_SAKURA_LOG);
        Termite.addDegradable(fromID("promenade:sakura_wood"), fromID("promenade:stripped_sakura_wood"));
        quickTermite(fromID("snifferplus:stone_pine_log"), fromID("snifferplus:stripped_stone_pine_log"), SNIFFERPLUS_HOLLOWED_STONE_PINE_LOG, SNIFFERPLUS_STRIPPED_HOLLOWED_STONE_PINE_LOG);
        Termite.addDegradable(fromID("snifferplus:stone_pine_wood"), fromID("snifferplus:stripped_stone_pine_wood"));
        quickTermite(fromID("traverse:fir_log"), fromID("traverse:stripped_fir_log"), TRAVERSE_HOLLOWED_FIR_LOG, TRAVERSE_STRIPPED_HOLLOWED_FIR_LOG);
        Termite.addDegradable(fromID("traverse:fir_wood"), fromID("traverse:stripped_fir_wood"));
    }

    private static void quickTermite(Block log, Block slog, Block hlog, Block shlog) {
        Termite.addDegradable(log, slog);
        Termite.addDegradable(slog, shlog);
        Termite.addDegradable(hlog, shlog);
    }

    private static void quickTabs(Block log, Block hlog, Block shlog) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(log, hlog);
            content.addAfter(hlog, shlog);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(log, hlog);
            content.addAfter(hlog, shlog);
        });
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
