package com.github.blindpirate.extensions;

import com.github.blindpirate.extensions.CaptureSystemOutputExtension;

public class Ladder {
    public static Object newInstance(){
        return new CaptureSystemOutputExtension();
    }
}
