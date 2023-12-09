package com.lumiscosity.astound;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.LADDER;

public class AstoundCompatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GREAT_BIG_WORLD_HOLLOWED_ASPEN_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ASPEN_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GREAT_BIG_WORLD_HOLLOWED_MAHOGANY_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GREAT_BIG_WORLD_STRIPPED_HOLLOWED_MAHOGANY_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_HOLLOWED_ANCIENT_OAK_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_STRIPPED_HOLLOWED_ANCIENT_OAK_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_HOLLOWED_BLIGHTED_BALSA_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_STRIPPED_HOLLOWED_BLIGHTED_BALSA_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_HOLLOWED_SWAMP_CYPRESS_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_STRIPPED_HOLLOWED_SWAMP_CYPRESS_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_HOLLOWED_WILLOW_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.BIOMEMAKEOVER_STRIPPED_HOLLOWED_WILLOW_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.CINDERSCAPES_HOLLOWED_SCORCHED_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.CINDERSCAPES_STRIPPED_HOLLOWED_SCORCHED_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.CINDERSCAPES_HOLLOWED_UMBRAL_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.CINDERSCAPES_STRIPPED_HOLLOWED_UMBRAL_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GARDENS_OF_THE_DEAD_HOLLOWED_SOULBLIGHT_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.GARDENS_OF_THE_DEAD_STRIPPED_HOLLOWED_SOULBLIGHT_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PEARFECTION_HOLLOWED_CALLERY_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PEARFECTION_STRIPPED_HOLLOWED_CALLERY_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_HOLLOWED_DARK_AMARANTH_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_STRIPPED_HOLLOWED_DARK_AMARANTH_STEM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_HOLLOWED_MAPLE_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_STRIPPED_HOLLOWED_MAPLE_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_HOLLOWED_PALM_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_STRIPPED_HOLLOWED_PALM_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_HOLLOWED_SAKURA_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.PROMENADE_STRIPPED_HOLLOWED_SAKURA_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.SNIFFERPLUS_HOLLOWED_STONE_PINE_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.SNIFFERPLUS_STRIPPED_HOLLOWED_STONE_PINE_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.TRAVERSE_HOLLOWED_FIR_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WilderWildCompat.TRAVERSE_STRIPPED_HOLLOWED_FIR_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.GREAT_BIG_WORLD_ACAI_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.GREAT_BIG_WORLD_ASPEN_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.GREAT_BIG_WORLD_MAHOGANY_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.BIOMEMAKEOVER_ANCIENT_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.BIOMEMAKEOVER_BLIGHTED_BALSA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.BIOMEMAKEOVER_SWAMP_CYPRESS_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.BIOMEMAKEOVER_WILLOW_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.CINDERSCAPES_SCORCHED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.CINDERSCAPES_UMBRAL_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.GARDENS_OF_THE_DEAD_SOULBLIGHT_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.GARDENS_OF_THE_DEAD_WHISTLECANE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.PEARFECTION_CALLERY_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.PROMENADE_DARK_AMARANTH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.PROMENADE_MAPLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.PROMENADE_PALM_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.PROMENADE_SAKURA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.SNIFFERPLUS_STONE_PINE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.TRAVERSE_FIR_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.WILDERWILD_BAOBAB_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.WILDERWILD_CYPRESS_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(JinericCompat.WILDERWILD_PALM_LADDER, RenderLayer.getCutout());
    }
}
