package p000X;

import com.facebook.acra.util.NativeProcFileReader;

/* renamed from: X.01e reason: invalid class name and case insensitive filesystem */
public abstract class C002901e {
    /* renamed from: B */
    public static C002901e m242B() {
        Object obj;
        C002901e r0;
        if (NativeProcFileReader.sReadyToUse.get()) {
            obj = NativeProcFileReader.class;
            synchronized (obj) {
                if (NativeProcFileReader.sInstance == null) {
                    NativeProcFileReader.sInstance = new NativeProcFileReader();
                }
                r0 = NativeProcFileReader.sInstance;
            }
        } else {
            obj = C003101h.class;
            synchronized (obj) {
                if (C003101h.f260D == null) {
                    C003101h.f260D = new C003101h();
                }
                r0 = C003101h.f260D;
            }
        }
        return r0;
    }

    public abstract int getOpenFDCount();

    public abstract C003001f getOpenFDLimits();

    public abstract String getOpenFileDescriptors();
}
