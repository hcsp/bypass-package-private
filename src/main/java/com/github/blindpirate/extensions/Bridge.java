package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newInstancetogetCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}