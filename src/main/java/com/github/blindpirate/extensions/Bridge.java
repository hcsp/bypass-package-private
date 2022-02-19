package com.github.blindpirate.extensions;
import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class Bridge {
    public static CaptureSystemOutputExtension newInstance() {
        return new CaptureSystemOutputExtension();
    }
}
