package com.github.blindpirate.extensions;

/**
 * @author JianfeiChen
 * @date 2020/1/3 14:17
 */
public class MyCaptureSystemOutPutExtension{
    public static Object getCaptureSystemOutPutExtension(){
        return new CaptureSystemOutputExtension();
    }
}
