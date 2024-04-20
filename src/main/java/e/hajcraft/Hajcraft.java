package e.hajcraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import e.hajcraft.block.HajBlocks;


public class Hajcraft implements ModInitializer {
	public static final String MOD_ID = "hajcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger("hajcraft");
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	@Override
	public void onInitialize() {
		HajBlocks.register(); //register method for all blocks and block items :3
		LOGGER.info("Hello Fabric world!");
	}
}