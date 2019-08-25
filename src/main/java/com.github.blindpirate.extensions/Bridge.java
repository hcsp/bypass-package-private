package com.github.blindpirate.extensions;

public class Bridge {
    public static Object Instance(){
       return new CaptureSystemOutputExtension();
    }
}
