package com.github.blindpirate.extensions;

public class CaptureBridge {
    public static  Object CreateCapture()
    {
        return  new CaptureSystemOutputExtension();
    }

    public class CreateCapture {
    }
}
