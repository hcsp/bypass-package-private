package com.github.blindpirate.extensions;

// 因为 Bridge 现在和 createCaptureSystemOutputExtension 包名一样了，因此可以访问该类
public class Bridge {
    public static Object createCaptureSystemOutputExtension() {
        return new CaptureSystemOutputExtension();
    }
}
