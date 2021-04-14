package com.github.blindpirate.extensions;

public class Bridge {
    public static Object x(){
        return new CaptureSystemOutputExtension();
    }
}
