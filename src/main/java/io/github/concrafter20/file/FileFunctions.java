package io.github.concrafter20.file;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.crash.CrashReport;

import java.io.File;

public class FileFunctions {

    // I don't know why you get an error in the Logger? Please create a pull request
    // if you know how to fix it!
    public static void createDummyCrashReport() {
        File file = new File("bismuth/dummyCrashReports/report.log");

        CrashReport report = new CrashReport("Dummy CrashReport initlaized by Bismuth", new Exception());

        MinecraftClient.getInstance().addDetailsToCrashReport(report);

        report.writeToFile(file);
    }

}
