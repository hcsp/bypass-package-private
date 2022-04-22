package com.github.blindpirate.extensions;

public class Bridge {
    public static CaptureSystemOutputExtension getInstance(){
        return new CaptureSystemOutputExtension();
    }
}
