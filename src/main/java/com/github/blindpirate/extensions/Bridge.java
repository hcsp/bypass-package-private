package com.github.blindpirate.extensions;

public class Bridge {

    public CaptureSystemOutputExtension instance () {
        return  new CaptureSystemOutputExtension();
    }
}
