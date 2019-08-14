package com.facebook.lite.verifier;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import p000X.C001500q;

public class Verifier {
    private static boolean sDisabledRuntimeVerification;
    private static final boolean sHasNativeCode;
    private static boolean sTriedDisableRuntimeVerification;

    static {
        boolean z;
        try {
            C001500q.m146C("verifier");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        sHasNativeCode = z;
    }

    public static synchronized boolean didDisableRuntimeVerification() {
        boolean z;
        synchronized (Verifier.class) {
            z = sDisabledRuntimeVerification;
        }
        return z;
    }

    public static synchronized void disableRuntimeVerification(Context context) {
        synchronized (Verifier.class) {
            if (!sTriedDisableRuntimeVerification && sHasNativeCode) {
                switch (VERSION.SDK_INT) {
                    case 23:
                        sDisabledRuntimeVerification = disableRuntimeVerification_6_0_1();
                        break;
                    case 24:
                        sDisabledRuntimeVerification = disableRuntimeVerification_7_0_0();
                        break;
                    case 25:
                        sDisabledRuntimeVerification = disableRuntimeVerification_7_1_2();
                        break;
                    case 26:
                        sDisabledRuntimeVerification = disableRuntimeVerification_8_0_0();
                        break;
                    case 27:
                        sDisabledRuntimeVerification = disableRuntimeVerification_8_1_0();
                        break;
                    default:
                        sDisabledRuntimeVerification = false;
                        sTriedDisableRuntimeVerification = false;
                        break;
                }
                sTriedDisableRuntimeVerification = true;
                if (sTriedDisableRuntimeVerification && !sDisabledRuntimeVerification) {
                    Log.w("Verifier", "Could not disable runtime verification");
                }
            }
        }
    }

    private static native boolean disableRuntimeVerification_6_0_1();

    private static native boolean disableRuntimeVerification_7_0_0();

    private static native boolean disableRuntimeVerification_7_1_2();

    private static native boolean disableRuntimeVerification_8_0_0();

    private static native boolean disableRuntimeVerification_8_1_0();

    public static synchronized boolean triedDisableRuntimeVerification() {
        boolean z;
        synchronized (Verifier.class) {
            z = sTriedDisableRuntimeVerification;
        }
        return z;
    }
}
