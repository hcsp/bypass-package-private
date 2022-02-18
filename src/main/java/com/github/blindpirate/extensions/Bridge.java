package com.github.blindpirate.extensions;

public class Bridge {
    public static CaptureSystemOutputExtension bridge() {
        return new CaptureSystemOutputExtension();
    }
}