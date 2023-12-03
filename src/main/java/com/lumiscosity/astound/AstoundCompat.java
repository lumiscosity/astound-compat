package com.lumiscosity.astound;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.block.Blocks.BOOKSHELF;
import static net.minecraft.block.Blocks.LADDER;

public class AstoundCompat implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("astound");
	// (stripped) hollowed logs

	@Override
	public void onInitialize() {
		RegularBlock.create_and_register();
		HollowedLogCompat.create_and_register();

		LOGGER.info("Astound compatibility tweaks loaded!");
	}


}