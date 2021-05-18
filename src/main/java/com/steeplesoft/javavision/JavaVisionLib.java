package com.steeplesoft.javavision;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.tools.InfoMap;

@Platform(include = "pch.h",
        link = "tvision",
        includepath = "include/")
public class JavaVisionLib {
    public static class TPoint extends Pointer {
        static { Loader.load(); }

        public TPoint() { allocate(); }

        private native void allocate();
    }
    public static class TRect extends Pointer {
        static { Loader.load(); }

        public TRect() { allocate(); }

        private native void allocate();
    }

    public static void main(String[] args) {
        TRect rect = new TRect();
        System.out.println(rect.toString());
    }
}
