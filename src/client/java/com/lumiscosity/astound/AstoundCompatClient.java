package com.lumiscosity.astound;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class AstoundCompatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(AstoundCompat.GREAT_BIG_WORLD_ACAI_LADDER, RenderLayer.getCutout());
    }
}
