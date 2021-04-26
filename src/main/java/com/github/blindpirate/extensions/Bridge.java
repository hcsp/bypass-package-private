package com.github.blindpirate.extensions;

public class Bridge {
    public Object getObject() {
        return new CaptureSystemOutputExtension();
    }
}
