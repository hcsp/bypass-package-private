package com.github.blindpirate.extensions;

/**
 * @author yaohengfeng
 * @version 1.0
 * @date 2019/12/26 13:21
 */
public class Bridge {

    public static Object newInstance() {
        return new CaptureSystemOutputExtension();
    }
}
