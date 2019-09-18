package com.github.blindpirate.extensions;

public class Bridge {
    public static Object createInstance() {
        return new CaptureSystemOutputExtension();
    }
}
