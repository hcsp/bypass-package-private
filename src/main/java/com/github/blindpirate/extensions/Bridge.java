package com.github.blindpirate.extensions;

public class Bridge {
    //绕过包级私有的限制，创建CaptureSystemOutputExtension对象
    public static CaptureSystemOutputExtension newCaptureSystemOutputExtension(){
        return new CaptureSystemOutputExtension();
    }
}
