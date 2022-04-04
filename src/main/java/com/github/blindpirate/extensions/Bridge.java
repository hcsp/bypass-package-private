package com.github.blindpirate.extensions;

public class Bridge {
    public CaptureSystemOutputExtension getExtension() {
        return new CaptureSystemOutputExtension();
    }
}
