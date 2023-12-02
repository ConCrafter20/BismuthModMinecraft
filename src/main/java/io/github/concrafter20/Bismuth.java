package io.github.concrafter20;

import io.github.concrafter20.util.Loggers;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

public class Bismuth implements ModInitializer {
	public static final String MOD_ID = "bismuth";

	@Override
	public void onInitialize() {



		Loggers.MainLogger.info("Bismuth has loaded");
	}
}