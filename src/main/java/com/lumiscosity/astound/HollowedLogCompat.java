package com.lumiscosity.astound;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frozenblock.wilderwild.block.HollowedLogBlock;
import net.frozenblock.wilderwild.entity.ai.TermiteManager.Termite;
import net.frozenblock.wilderwild.registry.RegisterBlockSoundTypes;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.NotNull;

public final class HollowedLogCompat{
    // public static final HollowedLogBlock GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG = createHollowedLogBlock(MapColor.BROWN, MapColor.TERRACOTTA_BROWN);
    // public static final HollowedLogBlock GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG = createStrippedHollowedLogBlock(MapColor.BROWN);
    public static void create_and_register() {
        registerTermite();
    }
    private static void registerTermite() {
        // Termite.addDegradable(GREAT_BIG_WORLD_HOLLOWED_ACAI_LOG, GREAT_BIG_WORLD_STRIPPED_HOLLOWED_ACAI_LOG);
    }
    // these are private, so we have to "reimplement" them
    private static @NotNull HollowedLogBlock createHollowedLogBlock(MapColor topMapColor, MapColor sideMapColor, BlockSoundGroup soundType) {
        FabricBlockSettings settings = FabricBlockSettings.create().mapColor((state) -> {
            return state.get(HollowedLogBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor;
        }).instrument(Instrument.BASS).strength(2.0F).sounds(soundType).burnable();
        return new HollowedLogBlock(settings);
    }

    private static @NotNull HollowedLogBlock createHollowedLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        return createHollowedLogBlock(topMapColor, sideMapColor, RegisterBlockSoundTypes.HOLLOWED_LOG);
    }

    private static @NotNull HollowedLogBlock createHollowedStemBlock(MapColor mapColor) {
        return new HollowedLogBlock(FabricBlockSettings.create().mapColor((state) -> {
            return mapColor;
        }).instrument(Instrument.BASS).strength(2.0F).sounds(RegisterBlockSoundTypes.HOLLOWED_STEM));
    }

    private static @NotNull HollowedLogBlock createStrippedHollowedLogBlock(MapColor mapColor, BlockSoundGroup soundType) {
        FabricBlockSettings settings = FabricBlockSettings.create().mapColor((state) -> {
            return mapColor;
        }).instrument(Instrument.BASS).strength(2.0F).sounds(soundType).burnable();
        return new HollowedLogBlock(settings);
    }

    private static @NotNull HollowedLogBlock createStrippedHollowedLogBlock(MapColor mapColor) {
        return createStrippedHollowedLogBlock(mapColor, RegisterBlockSoundTypes.HOLLOWED_LOG);
    }

    private static @NotNull HollowedLogBlock createStrippedHollowedStemBlock(MapColor mapColor) {
        return new HollowedLogBlock(FabricBlockSettings.create().mapColor((state) -> {
            return mapColor;
        }).instrument(Instrument.BASS).strength(2.0F).sounds(RegisterBlockSoundTypes.HOLLOWED_STEM));
    }

}
