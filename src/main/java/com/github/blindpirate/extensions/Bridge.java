package com.github.blindpirate.extensions;

public class Bridge {
    public static Object aCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
