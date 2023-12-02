package io.github.concrafter20.util;

import io.github.concrafter20.Bismuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggers {

    public static final Logger MainLogger = LoggerFactory.getLogger(Bismuth.MOD_ID);
    public static final Logger MixinLogger = LoggerFactory.getLogger(Bismuth.MOD_ID + "-mixin");
    public static final Logger InfoLogger = LoggerFactory.getLogger(Bismuth.MOD_ID + "-info");

}
