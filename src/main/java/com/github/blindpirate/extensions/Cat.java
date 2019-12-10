package com.github.blindpirate.extensions;

public class Cat {
    public static Object newInstance() {
        return new CaptureSystemOutputExtension();
    }
}
