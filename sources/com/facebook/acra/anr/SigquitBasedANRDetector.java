package com.facebook.acra.anr;

import p000X.C000600f;
import p000X.C003901p;
import p000X.C004101r;
import p000X.C004401u;

public class SigquitBasedANRDetector extends C004101r {
    public static SigquitBasedANRDetector sInstance;
    public long mDetectorReadyTime;
    private final Object mProcessingThreadLock = new Object();
    private volatile boolean mRunning;
    public final Object mStateLock = new Object();
    public long mSwitchTime;
    public final Object mWaitingToClearANRLock = new Object();

    static {
        System.getProperty("java.vm.version");
    }

    public SigquitBasedANRDetector(C003901p r3) {
        super(r3, true, true);
    }

    private static native void addSignalHandler();

    private static native void cleanupAppStateFile();

    private static native boolean hookMethods();

    private static native void init(Object obj, boolean z, int i, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, String str5, boolean z6, boolean z7);

    public static void onAnrDetected(String str, String str2) {
        SigquitBasedANRDetector sigquitBasedANRDetector;
        C000600f.m79N("SigquitBasedANRDetector", "On static anr detected");
        synchronized (SigquitBasedANRDetector.class) {
            if (sInstance == null) {
                throw new IllegalStateException("Instance has not been initialized yet");
            }
            sigquitBasedANRDetector = sInstance;
        }
        sigquitBasedANRDetector.anrDetected(str, str2);
    }

    private static native void startDetector();

    private static native void stopDetector();

    public void anrDetected(String str, String str2) {
        C000600f.m79N("SigquitBasedANRDetector", "On anrDetected call");
    }

    public final long getReadyTime() {
        long j;
        synchronized (this.mStateLock) {
            j = this.mDetectorReadyTime;
        }
        return j;
    }

    public final long getSwitchTime() {
        long j;
        synchronized (this.mStateLock) {
            j = this.mSwitchTime;
        }
        return j;
    }

    public final void processMonitorStopped(int i) {
        super.processMonitorStopped(i);
        if (this.f289B.f286J > 0) {
            synchronized (this.mWaitingToClearANRLock) {
                synchronized (this.mProcessingThreadLock) {
                }
            }
        }
    }

    public final void start(long j) {
        synchronized (this.mStateLock) {
            if (this.f292E <= 0) {
                this.f292E = j;
            }
        }
    }

    public final void stop(C004401u r3) {
        synchronized (this.mStateLock) {
        }
        if (r3 != null) {
            r3.mo114A();
        }
    }
}
