package com.github.blindpirate.extensions;

public class Bridge {
    public static Object newInstance(){
        CaptureSystemOutputExtension a = new CaptureSystemOutputExtension();
        return a;
    }
}
