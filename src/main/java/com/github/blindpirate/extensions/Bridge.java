package com.github.blindpirate.extensions;

import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class Bridge {
    public static Object newInstance() {
        return new CaptureSystemOutputExtension();
    }
}
