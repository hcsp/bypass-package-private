package com.github.blindpirate.extensions;

public class Bridge {
    public Bridge() {

    }

    public static CaptureSystemOutputExtension newInstance () {
        return new CaptureSystemOutputExtension();
    }
}
