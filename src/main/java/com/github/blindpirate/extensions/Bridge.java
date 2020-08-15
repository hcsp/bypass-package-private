package com.github.blindpirate.extensions;

public class Bridge {
    public static Object creatCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
