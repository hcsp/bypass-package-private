package com.github.blindpirate.extensions;

public class Bridge {
  public Object newInstance() {
    return new CaptureSystemOutputExtension();
  }
}
