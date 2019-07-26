package com.github.blindpirate.extensions;

public class Bridge {
    public Object read(){
        return new CaptureSystemOutputExtension();
    }
}
