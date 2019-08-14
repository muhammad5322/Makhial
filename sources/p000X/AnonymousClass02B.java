package p000X;

import android.os.SystemClock;

/* renamed from: X.02B reason: invalid class name */
public class AnonymousClass02B implements C003701n {

    /* renamed from: B */
    private /* synthetic */ C004101r f341B;

    public AnonymousClass02B(C004101r r1) {
        this.f341B = r1;
    }

    /* renamed from: WU */
    public final void mo99WU() {
        C000600f.m79N("AbstractANRDetector", "Reached max number of checks after error was detected");
        this.f341B.processMonitorStopped(2);
    }

    /* renamed from: XU */
    public final void mo100XU() {
        C000600f.m79N("AbstractANRDetector", "Reached max number of checks before error was detected");
        this.f341B.processMonitorStopped(1);
    }

    /* renamed from: fT */
    public final void mo101fT() {
        synchronized (this.f341B.f294G) {
        }
    }

    /* renamed from: gT */
    public final void mo102gT() {
        synchronized (this.f341B.f294G) {
        }
    }

    /* renamed from: qS */
    public final void mo103qS() {
        C000600f.m71F("AbstractANRDetector", "Failed when checking process error state");
        this.f341B.processMonitorStopped(3);
    }

    /* renamed from: uV */
    public final void mo104uV() {
        C004101r r1 = this.f341B;
        if (r1.mo108C()) {
            AnonymousClass01F r6 = r1.f289B.f278B;
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (r6.f162C) {
                r6.f162C.put("anr_process_error_started_time", Long.toString(uptimeMillis));
                r6.mo68A();
            }
        }
    }
}
