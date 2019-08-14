package com.facebook.acra.util;

public class NoSync {
    private NoSync() {
    }

    private static native boolean disableFSSync(int i, boolean z);
}
