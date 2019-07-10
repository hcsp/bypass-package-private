package com.github.blindpirate.extensions;

public class Extension {
    public static Object getCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
