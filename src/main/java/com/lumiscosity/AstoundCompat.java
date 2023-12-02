package com.lumiscosity;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.LADDER;

public class AstoundCompat implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("astound_compat");
	public static final Block GREAT_BIG_WORLD_ACAI_LADDER = new LadderBlock(FabricBlockSettings.copy(LADDER).sounds(BlockSoundGroup.CHERRY_WOOD));
	@Override
	public void onInitialize() {

		makeBlock("great_big_world_acai_ladder", GREAT_BIG_WORLD_ACAI_LADDER);

		LOGGER.info("Astound compatibility tweaks loaded!");
	}

	private void makeBlock(String id, Block block) {
		Registry.register(Registries.BLOCK, new Identifier("astound", id), block);
		Registry.register(Registries.ITEM, new Identifier("astound", id), new BlockItem(block, new FabricItemSettings()));
	}
}