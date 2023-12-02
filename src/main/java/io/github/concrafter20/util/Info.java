package io.github.concrafter20.util;

import net.minecraft.client.MinecraftClient;

public class Info {

    public static final String VERSION_STRING = "dev0.0.3";


    // https://en.wikipedia.org/wiki/X86 read it if you want to die
    // it's not that bad really I did it trust me!
    public static String getProcessorArch() {
        String outputString = "";

        if(MinecraftClient.getInstance().is64Bit()) {
            outputString = "x86_64 or ARM";
        } else if (!MinecraftClient.getInstance().is64Bit()) {
            outputString = "IA-32 or ARM";
        } else {
            outputString = "What are you playing this on? A 16-Bit PC or 8-Bit";
        }

        return outputString;
    }
}
