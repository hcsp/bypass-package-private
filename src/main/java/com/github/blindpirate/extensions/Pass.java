package com.github.blindpirate.extensions;

public class Pass {
    public static Object newInstance() {
        return new CaptureSystemOutputExtension();
    }
}
