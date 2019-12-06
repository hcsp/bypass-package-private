package com.github.blindpirate.extensions;

public class Channel {
    public static Object newInstance() {
        return new CaptureSystemOutputExtension();
    }
}
