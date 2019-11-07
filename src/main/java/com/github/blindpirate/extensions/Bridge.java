package com.github.blindpirate.extensions;

/**
 * @author Kelvin Chen
 * @date 2019-11-07 20:12:58
 */
public class Bridge {
    public static CaptureSystemOutputExtension builder(){
        return new CaptureSystemOutputExtension();
    }
}
