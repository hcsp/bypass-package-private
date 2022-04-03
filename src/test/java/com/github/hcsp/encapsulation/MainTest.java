package com.github.hcsp.encapsulation;

import org.junit.jupiter.api.Assertions;
import com.github.hcsp.encapsulation.Main;

public class MainTest {
    public void bypassPackagePrivate() {
        Assertions.assertEquals(
                "com.github.blindpirate.extensions.CaptureSystemOutputExtension",
                Main.createCaptureSystemOutputExtension().getClass().getName());
        Assertions.assertTrue(
                org.junit.jupiter.api.extension.BeforeEachCallback.class.isAssignableFrom(
                        Main.createCaptureSystemOutputExtension().getClass()));
    }
}
