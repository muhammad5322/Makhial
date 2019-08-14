package p000X;

import android.os.SystemClock;
import com.facebook.acra.anr.SigquitBasedANRDetector;

/* renamed from: X.01u reason: invalid class name and case insensitive filesystem */
public class C004401u implements AnonymousClass01E {

    /* renamed from: F */
    public static C004401u f298F;

    /* renamed from: B */
    private long f299B;

    /* renamed from: C */
    private C004101r f300C;

    /* renamed from: D */
    private boolean f301D;

    /* renamed from: E */
    private SigquitBasedANRDetector f302E;

    public C004401u(C003901p r3, int i) {
        SigquitBasedANRDetector sigquitBasedANRDetector;
        this.f300C = C004501v.m278C(r3, i);
        synchronized (SigquitBasedANRDetector.class) {
            if (SigquitBasedANRDetector.sInstance == null) {
                SigquitBasedANRDetector.sInstance = new SigquitBasedANRDetector(r3);
            }
            sigquitBasedANRDetector = SigquitBasedANRDetector.sInstance;
        }
        this.f302E = sigquitBasedANRDetector;
    }

    /* renamed from: A */
    public final void mo114A() {
        SigquitBasedANRDetector sigquitBasedANRDetector = this.f302E;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (sigquitBasedANRDetector.mStateLock) {
            try {
                sigquitBasedANRDetector.mSwitchTime = uptimeMillis;
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        synchronized (this) {
            try {
                this.f300C = null;
                SigquitBasedANRDetector sigquitBasedANRDetector2 = this.f302E;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                synchronized (sigquitBasedANRDetector2.mStateLock) {
                    sigquitBasedANRDetector2.mDetectorReadyTime = uptimeMillis2;
                }
                if (this.f301D) {
                    this.f302E.start(this.f299B);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* renamed from: Na */
    public final synchronized void mo64Na(AnonymousClass01D r2) {
        if (this.f300C != null) {
            this.f300C.mo64Na(r2);
        }
        this.f302E.mo64Na(r2);
    }

    /* renamed from: aZ */
    public final synchronized void mo65aZ(AnonymousClass01C r2) {
        if (this.f300C != null) {
            this.f300C.f290C = r2;
        }
        this.f302E.f290C = r2;
    }

    public final synchronized void start() {
        this.f299B = SystemClock.uptimeMillis();
        if (this.f300C != null) {
            this.f300C.start(this.f299B);
        } else {
            this.f302E.start(this.f299B);
        }
        this.f301D = true;
    }

    public final synchronized void stop(C004401u r2) {
        if (this.f300C != null) {
            this.f300C.stop(r2);
        } else {
            this.f302E.stop(r2);
        }
        this.f301D = false;
    }
}
