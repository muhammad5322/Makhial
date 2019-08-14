package p000X;

import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/* renamed from: X.01i reason: invalid class name and case insensitive filesystem */
public final class C003201i extends Thread {
    public static final String __redex_internal_original_name = "com.facebook.acra.ErrorReporter$ReportsSenderWorker";

    /* renamed from: B */
    private final AnonymousClass01R f261B;

    /* renamed from: C */
    private final C002601b f262C;

    /* renamed from: D */
    private final AnonymousClass00P[] f263D;

    /* renamed from: E */
    private /* synthetic */ AnonymousClass00G f264E;

    public C003201i(AnonymousClass00G r2, AnonymousClass01R r3, C002601b r4, AnonymousClass00P[] r5) {
        this.f264E = r2;
        super("ReportsSenderWorker");
        this.f261B = r3;
        this.f262C = r4;
        this.f263D = r5;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    public final void mo92A() {
        WakeLock wakeLock = null;
        AnonymousClass00G.f44d.getAndIncrement();
        try {
            AnonymousClass00V r4 = new AnonymousClass00V(this.f264E.f57M);
            String str = "android.permission.WAKE_LOCK";
            boolean z = false;
            PackageManager packageManager = r4.f95B.getPackageManager();
            if (packageManager != null) {
                try {
                    if (packageManager.checkPermission(str, r4.f95B.getPackageName()) == 0) {
                        z = true;
                    }
                } catch (RuntimeException unused) {
                }
            }
            if (z) {
                WakeLock newWakeLock = ((PowerManager) this.f264E.f57M.getSystemService("power")).newWakeLock(1, "ACRA wakelock");
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire();
                wakeLock = newWakeLock;
            }
            if (this.f261B == null) {
                this.f264E.mo19D(this.f263D);
            } else {
                AnonymousClass01R r2 = this.f261B;
                String F = C003301j.m248F(this.f264E.f57M);
                if (F == null) {
                    F = "n/a";
                }
                r2.put("UPLOADED_BY_PROCESS", F);
                AnonymousClass00G.m29K(this.f264E, r2);
                if (this.f262C != null) {
                    this.f262C.f248C.delete();
                }
            }
            if (wakeLock != null && wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Throwable th) {
            if (wakeLock != null && wakeLock.isHeld()) {
                wakeLock.release();
            }
            throw th;
        }
    }

    public final void run() {
        synchronized (this.f264E) {
            try {
                this.f264E.f66V++;
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        try {
            mo92A();
        } catch (Throwable unused) {
        } finally {
            AnonymousClass00G.m28J(this.f262C);
        }
        synchronized (this.f264E) {
            try {
                this.f264E.f66V--;
            } catch (Throwable th2) {
                while (true) {
                    th = th2;
                    break;
                }
            }
        }
        synchronized (this.f264E) {
        }
        return;
        throw th;
    }
}
