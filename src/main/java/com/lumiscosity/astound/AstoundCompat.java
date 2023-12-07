package com.lumiscosity.astound;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AstoundCompat implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("astound");

	@Override
	public void onInitialize() {
		AbstractCompat.createAndRegister();
		JinericCompat.createAndRegister();
		WilderWildCompat.createAndRegister();

		LOGGER.info("Astound compatibility tweaks loaded!");
	}


}