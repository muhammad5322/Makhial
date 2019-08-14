package com.facebook.acra.util;

import java.util.concurrent.atomic.AtomicBoolean;
import p000X.C002901e;
import p000X.C003001f;

public class NativeProcFileReader extends C002901e {
    public static NativeProcFileReader sInstance;
    public static final AtomicBoolean sReadyToUse = new AtomicBoolean(false);

    public NativeProcFileReader() {
        if (!sReadyToUse.get()) {
            throw new IllegalStateException("Class is not ready");
        }
    }

    private native int[] getOpenFDLimitsNative();

    public native int getOpenFDCount();

    public final C003001f getOpenFDLimits() {
        int[] openFDLimitsNative = getOpenFDLimitsNative();
        return new C003001f(openFDLimitsNative[0], openFDLimitsNative[1]);
    }

    public native String getOpenFileDescriptors();
}
