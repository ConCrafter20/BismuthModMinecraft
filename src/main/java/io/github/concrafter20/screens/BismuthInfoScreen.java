package io.github.concrafter20.screens;

import io.github.concrafter20.util.Info;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class BismuthInfoScreen extends Screen {

    protected Screen parent;

    public BismuthInfoScreen(Screen parent) {
        super(Text.translatable("screens.bismuth.info"));
        this.parent = parent;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawCenteredTextWithShadow(this.textRenderer, Text.translatable("screens.bismuth.info"), width / 2, 16, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "Game Version: " + MinecraftClient.getInstance().getGameVersion(), width / 2, 36, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "Session ID: " + MinecraftClient.getInstance().getSession().getSessionId(), width / 2, 46, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "UUID or null: " + MinecraftClient.getInstance().getSession().getUuidOrNull(), width / 2, 56, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "Access Token: " + MinecraftClient.getInstance().getSession().getAccessToken(), width / 2, 66, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "Minecraft Window: " + MinecraftClient.getInstance().getWindow(), width / 2, 76, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "Video Mode:  " + MinecraftClient.getInstance().getWindow().getVideoMode(), width / 2, 86, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "Archtitecture:  " + Info.getProcessorArch(), width / 2, 96, 0xFFFFFF);
        super.render(context, mouseX, mouseY, delta);
    }

    public void close() {
        MinecraftClient.getInstance().setScreen(parent);
    }

}
