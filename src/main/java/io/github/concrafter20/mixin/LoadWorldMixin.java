package io.github.concrafter20.mixin;

import io.github.concrafter20.util.Loggers;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public abstract class LoadWorldMixin {

	@Shadow public abstract String getServerIp();
	@Shadow public abstract int getServerPort();
	@Shadow public abstract String getServerMotd();

	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		Loggers.MixinLogger.info("Loaded into world a world!");
		Loggers.MixinLogger.info("Server IP: " + this.getServerIp());
		Loggers.MixinLogger.info("Server Port:" + this.getServerPort());
		Loggers.MixinLogger.info("Server MOTD:" + this.getServerMotd());
	}
}