package com.github.blindpirate.extensions;

public class Bridge {
//    public CaptureSystemOutputExtension treatInstance() {
    public Object treatInstance() {
        return new CaptureSystemOutputExtension();
    }
}
