package p000X;

import android.os.Process;
import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.00d reason: invalid class name and case insensitive filesystem */
public class C000400d implements UncaughtExceptionHandler {

    /* renamed from: E */
    public static C000400d f107E;

    /* renamed from: B */
    public volatile List f108B = Collections.unmodifiableList(new ArrayList());

    /* renamed from: C */
    private final UncaughtExceptionHandler f109C;

    /* renamed from: D */
    private final Object f110D = new Object();
    private byte[] mOomReservation = null;

    private C000400d(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f109C = uncaughtExceptionHandler;
        this.mOomReservation = new byte[4096];
    }

    /* renamed from: B */
    public static synchronized void m64B(AnonymousClass00H r4, int i) {
        synchronized (C000400d.class) {
            C000400d C = m65C();
            synchronized (C) {
                ArrayList arrayList = new ArrayList(C.f108B);
                C000500e r0 = new C000500e();
                r0.f111B = r4;
                r0.f112C = i;
                arrayList.add(r0);
                Collections.sort(arrayList);
                C.f108B = Collections.unmodifiableList(arrayList);
            }
        }
    }

    /* renamed from: C */
    public static synchronized C000400d m65C() {
        C000400d r0;
        synchronized (C000400d.class) {
            if (f107E == null) {
                synchronized (C000400d.class) {
                    if (f107E != null) {
                        throw new IllegalStateException("Already initialized!");
                    }
                    C000400d r02 = new C000400d(Thread.getDefaultUncaughtExceptionHandler());
                    f107E = r02;
                    Thread.setDefaultUncaughtExceptionHandler(r02);
                    r0 = f107E;
                }
            } else {
                r0 = f107E;
            }
        }
        return r0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed compute block dominance frontier
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:300)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:77)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        Caused by: java.lang.IndexOutOfBoundsException: Index 9 out of bounds for length 9
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeBlockDF(BlockProcessor.java:325)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominanceFrontier(BlockProcessor.java:298)
        	... 14 more
        */
    /* renamed from: D */
    private static void m66D() {
        /*
            int r0 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0008 }
            android.os.Process.killProcess(r0)     // Catch:{ Throwable -> 0x0008 }
            goto L_0x0010     // Catch:{ Throwable -> 0x0008 }
        L_0x0008:
            r2 = move-exception
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)
        L_0x0010:
            r0 = 10
            java.lang.System.exit(r0)     // Catch:{ Throwable -> 0x0016 }
            goto L_0x001e     // Catch:{ Throwable -> 0x0016 }
        L_0x0016:
            r2 = move-exception
            java.lang.String r1 = "ExceptionHandlerManager"
            java.lang.String r0 = "Error during exception handling"
            android.util.Log.e(r1, r0, r2)
        L_0x001e:
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C000400d.m66D():void");
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this.f110D) {
            try {
                Process.setThreadPriority(-10);
            } catch (Exception unused) {
            }
            this.mOomReservation = null;
            List list = this.f108B;
            try {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C000500e) list.get(size)).f111B.mo18CP(th);
                }
                try {
                    if (th instanceof C005702h) {
                        StringBuilder sb = new StringBuilder("Exit: ");
                        sb.append(th.getMessage());
                        Log.w("ExceptionHandlerManager", sb.toString());
                    } else {
                        this.f109C.uncaughtException(thread, th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m66D();
                    throw th;
                }
                m66D();
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (th instanceof C005702h) {
                        StringBuilder sb2 = new StringBuilder("Exit: ");
                        sb2.append(th.getMessage());
                        Log.w("ExceptionHandlerManager", sb2.toString());
                    } else {
                        this.f109C.uncaughtException(thread, th);
                    }
                } catch (Throwable th4) {
                    Log.e("ExceptionHandlerManager", "Error during exception handling", th4);
                }
                m66D();
                throw th;
            }
        }
    }
}
