package com.github.blindpirate.extensions;

public class Bridge {
    public  static  Object newObject(){
        return new CaptureSystemOutputExtension();
    }
}
