package com.github.blindpirate.extensions;

public class Bridge {
    private Bridge() {
    }

    public static CaptureSystemOutputExtension createCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
