package com.github.blindpirate.extensions;

/**
 * @Author: YangHuiQuan
 * @Description:
 * @Date: 2020/3/4 8:37
 * @version: 1.0
 * @since: JDK 8
 */
public class Bridge {
    public static CaptureSystemOutputExtension newInstance(){
        return new CaptureSystemOutputExtension();
    }
}
