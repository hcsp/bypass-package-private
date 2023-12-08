package com.github.blindpirate.extensions;

public class Bridge {
    public static CaptureSystemOutputExtension getCaptureSystemOutputExtensionInstance() {
        return new CaptureSystemOutputExtension();
    }
}
