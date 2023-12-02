package com.lumiscosity;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AstoundCompat implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("astound_compat");
	@Override
	public void onInitialize() {
		public static final Block GREAT_BIG_WORLD_ACAI_LADDER = register("great_big_world_acai_ladder", new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD)));
		LOGGER.info("Astound compatibility tweaks loaded!");
	}
}