package com.lumiscosity.astound;

import com.lumiscosity.astound.mixin.HollowedLogInvoker;
import net.frozenblock.wilderwild.block.HollowedLogBlock;
import net.frozenblock.wilderwild.entity.ai.TermiteManager.Termite;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class HollowedLogCompat{
    public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateHollowedLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN);
    public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG = HollowedLogInvoker.invokeCreateStrippedHollowedLogBlock(MapColor.BROWN);

    public static void createAndRegister() {
        register("great_big_world_hollowed_acai_log", GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG);
        register("great_big_world_stripped_hollowed_acai_log", GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
        registerTermite();
    }

    private static void registerTermite() {
        Termite.addDegradable(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
    }

    private static void register(String id, Block block) {
        Registry.register(Registries.BLOCK, new Identifier("astound", id), block);
    }

}
