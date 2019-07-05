package com.github.blindpirate.extensions;

public class Get {
    static CaptureSystemOutputExtension captureSystemOutputExtension = new CaptureSystemOutputExtension();

    public static Object getCapture(){
        return captureSystemOutputExtension;
    }
}
