package com.github.blindpirate.extensions;

public class Bridge {
    //静态工厂方法 为何改成object?
    public static Object newInstance(){
        return new CaptureSystemOutputExtension();
    }
}
