package com.github.blindpirate.extensions;

/**
 * @Author: GoFocus
 * @Date: 2020-03-22 22:43
 * @Description:
 */
public class ByPass {

    public static Object getObject() {
        return new CaptureSystemOutputExtension();
    }
}
