package io.github.concrafter20.screens;

import io.github.concrafter20.file.FileFunctions;
import io.github.concrafter20.util.Info;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.crash.CrashReport;

public class MainScreen extends Screen {

    private final Screen parent;

    public MainScreen(Screen parent) {
        super(Text.literal("Bismuth Minecraft"));
        this.parent = parent;
    }

    protected void init() {
        this.addDrawableChild(ButtonWidget.builder(
                        Text.translatable("buttons.bismuth.info")
                        , button -> MinecraftClient.getInstance().setScreen(new BismuthInfoScreen(this)))
                .dimensions(width / 2 - 50, 44, 100, 20)
                .build());

        this.addDrawableChild(ButtonWidget.builder(
                Text.translatable("buttons.bismuth.reset_renderer"
                ), button -> MinecraftClient.getInstance().gameRenderer.reset()
        ).dimensions(width / 2 - 75, 69, 150, 20).build());

        this.addDrawableChild(ButtonWidget.builder(
                Text.translatable("buttons.bismuth.crash"),
                        button -> FileFunctions.createDummyCrashReport())
                .dimensions(width / 2 - 50, 94, 100, 20)
                .build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        context.drawCenteredTextWithShadow(this.textRenderer, "Bismuth Minecraft", width / 2, 16, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, "Version: " + Info.VERSION_STRING, width / 2, height - 14, 0xFFFFFF);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public void close() {
        MinecraftClient.getInstance().setScreen(parent);
    }

}
