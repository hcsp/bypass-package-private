package com.github.blindpirate.extensions;

public class Bridge {
    public Object newCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }

}
