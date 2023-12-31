package io.github.concrafter20.mixin;

import io.github.concrafter20.screens.MainScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin extends Screen {
    protected TitleScreenMixin(Text title) {
        super(title);
    }

    @Inject(at = @At("RETURN"), method = "initWidgetsNormal")
    private void addCustomMenuButton(int y, int spacingY, CallbackInfo callbackInfo) {
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Bismuth"), button -> MinecraftClient.getInstance().setScreen(new MainScreen(this))).dimensions(this.width / 2 - 155, y, 50, 20).build());
    }
}
