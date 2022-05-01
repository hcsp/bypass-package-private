package com.github.blindpirate.extensions;


public class Helper {
    private static CaptureSystemOutputExtension captureSystemOutputExtension = new CaptureSystemOutputExtension();

    public CaptureSystemOutputExtension getCaptureSystemOutputExtension() {
        return captureSystemOutputExtension;
    }
}
