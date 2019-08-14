package p000X;

import android.content.Context;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: X.007 reason: invalid class name */
public final class AnonymousClass007 extends ClassLoader implements AnonymousClass008 {

    /* renamed from: G */
    private static final ClassLoader f13G;

    /* renamed from: H */
    public static final Field f14H;

    /* renamed from: I */
    private static final ClassLoader f15I;

    /* renamed from: J */
    private static byte f16J;

    /* renamed from: K */
    public static AnonymousClass007 f17K;

    /* renamed from: B */
    public final ClassLoader f18B = f13G;

    /* renamed from: C */
    public DexFile[] f19C;

    /* renamed from: D */
    public DexFile[] f20D = new DexFile[0];

    /* renamed from: E */
    private final DexFile[] f21E;

    /* renamed from: F */
    private final DexFile[] f22F;

    static {
        try {
            f13G = AnonymousClass007.class.getClassLoader();
            Field declaredField = ClassLoader.class.getDeclaredField("parent");
            f14H = declaredField;
            declaredField.setAccessible(true);
            f15I = (ClassLoader) f14H.get(f13G);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private AnonymousClass007(Context context) {
        super(f15I);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.f18B);
            Field declaredField2 = Class.forName("dalvik.system.DexPathList").getDeclaredField("dexElements");
            declaredField2.setAccessible(true);
            Object[] objArr = (Object[]) declaredField2.get(obj);
            Field declaredField3 = Class.forName("dalvik.system.DexPathList$Element").getDeclaredField("dexFile");
            declaredField3.setAccessible(true);
            String str = context.getApplicationInfo().sourceDir;
            for (Object obj2 : objArr) {
                DexFile dexFile = (DexFile) declaredField3.get(obj2);
                if (str.equals(dexFile.getName())) {
                    arrayList.add(dexFile);
                } else {
                    arrayList2.add(dexFile);
                }
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (Exception unused) {
        }
        this.f22F = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        this.f21E = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        m3C();
    }

    /* renamed from: B */
    public static synchronized AnonymousClass007 m2B(Context context) {
        AnonymousClass007 r0;
        RuntimeException runtimeException;
        synchronized (AnonymousClass007.class) {
            synchronized (AnonymousClass007.class) {
                if (f17K == null) {
                    try {
                        Class.forName("com.facebook.common.dextricks.DexFileLoadOld");
                        Class.forName("com.facebook.common.dextricks.DexFileLoadNew");
                        AnonymousClass007 r2 = new AnonymousClass007(context);
                        try {
                            f14H.set(r2.f18B, r2);
                            f17K = r2;
                        } catch (IllegalAccessException e) {
                            runtimeException = new RuntimeException(e);
                            throw runtimeException;
                        }
                    } catch (ClassNotFoundException e2) {
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    }
                }
            }
            r0 = f17K;
        }
        return r0;
    }

    /* renamed from: C */
    private synchronized void m3C() {
        int i = 0;
        synchronized (this) {
            DexFile[] dexFileArr = new DexFile[(this.f22F.length + this.f20D.length + this.f21E.length + 1)];
            dexFileArr[0] = null;
            int i2 = 1;
            int i3 = 0;
            while (i3 < this.f22F.length) {
                dexFileArr[i2] = this.f22F[i3];
                i3++;
                i2++;
            }
            int i4 = 0;
            while (i4 < this.f20D.length) {
                dexFileArr[i2] = this.f20D[i4];
                i4++;
                i2++;
            }
            while (i < this.f21E.length) {
                dexFileArr[i2] = this.f21E[i];
                i++;
                i2++;
            }
            this.f19C = dexFileArr;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = com.facebook.common.dextricks.DexFileLoadOld.m334B(r2, r3, r4);
        f16J = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r1 = r2.loadClass(r3, r4);
        f16J = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001e */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Class m4D(dalvik.system.DexFile r2, java.lang.String r3, java.lang.ClassLoader r4) {
        /*
            byte r0 = f16J
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0007;
                case 2: goto L_0x000c;
                case 3: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            return r1
        L_0x0007:
            java.lang.Class r1 = com.facebook.common.dextricks.DexFileLoadNew.m333B(r2, r3, r4)
            return r1
        L_0x000c:
            java.lang.Class r1 = com.facebook.common.dextricks.DexFileLoadOld.m334B(r2, r3, r4)
            return r1
        L_0x0011:
            java.lang.Class r1 = r2.loadClass(r3, r4)
            return r1
        L_0x0016:
            java.lang.Class r1 = com.facebook.common.dextricks.DexFileLoadNew.m333B(r2, r3, r4)     // Catch:{ NoSuchMethodError -> 0x001e }
            r0 = 1
            f16J = r0     // Catch:{ NoSuchMethodError -> 0x001e }
            return r1
        L_0x001e:
            java.lang.Class r1 = com.facebook.common.dextricks.DexFileLoadOld.m334B(r2, r3, r4)     // Catch:{ NoSuchMethodError -> 0x0026 }
            r0 = 2
            f16J = r0     // Catch:{ NoSuchMethodError -> 0x0026 }
            return r1
        L_0x0026:
            java.lang.Class r1 = r2.loadClass(r3, r4)
            r0 = 3
            f16J = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass007.m4D(dalvik.system.DexFile, java.lang.String, java.lang.ClassLoader):java.lang.Class");
    }

    /* renamed from: E */
    private Class m5E(DexFile[] dexFileArr, String str) {
        int i = 0;
        while (i < dexFileArr.length) {
            Class D = m4D(dexFileArr[i], str, this.f18B);
            i++;
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    /* renamed from: YE */
    public final void mo4YE(File file, File file2) {
        ArrayList arrayList = new ArrayList(this.f20D.length + 1);
        for (DexFile add : this.f20D) {
            arrayList.add(add);
        }
        arrayList.add(DexFile.loadDex(file.getAbsolutePath(), file2.getAbsolutePath(), 0));
        this.f20D = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        m3C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class findClass(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 1
            dalvik.system.DexFile[] r3 = r7.f19C
            r0 = 0
            r1 = r3[r0]
            if (r1 == 0) goto L_0x0011
            java.lang.ClassLoader r0 = r7.f18B
            java.lang.Class r4 = m4D(r1, r8, r0)
            if (r4 == 0) goto L_0x0011
        L_0x0010:
            return r4
        L_0x0011:
            r5 = 1
        L_0x0012:
            int r0 = r3.length
            if (r5 >= r0) goto L_0x0027
            r2 = r3[r5]
            java.lang.ClassLoader r0 = r7.f18B
            java.lang.Class r4 = m4D(r2, r8, r0)
            if (r4 == 0) goto L_0x0024
            if (r5 <= r6) goto L_0x0010
            r3 = r7
            monitor-enter(r3)
            goto L_0x0053
        L_0x0024:
            int r5 = r5 + 1
            goto L_0x0012
        L_0x0027:
            dalvik.system.DexFile[] r0 = r7.f22F
            java.lang.Class r4 = r7.m5E(r0, r8)
            if (r4 != 0) goto L_0x0010
            dalvik.system.DexFile[] r0 = r7.f20D
            java.lang.Class r4 = r7.m5E(r0, r8)
            if (r4 != 0) goto L_0x0010
            dalvik.system.DexFile[] r0 = r7.f21E
            java.lang.Class r4 = r7.m5E(r0, r8)
            if (r4 != 0) goto L_0x0010
            java.lang.ClassNotFoundException r2 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "ClassLoaderWithDexPromotion didn't find "
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L_0x0053:
            dalvik.system.DexFile[] r0 = r7.f19C     // Catch:{ all -> 0x0075 }
            r0 = r0[r5]     // Catch:{ all -> 0x0075 }
            if (r0 != r2) goto L_0x0073
            dalvik.system.DexFile[] r1 = r7.f19C     // Catch:{ all -> 0x0075 }
            r0 = 0
            r1[r0] = r2     // Catch:{ all -> 0x0075 }
        L_0x005e:
            if (r5 <= 0) goto L_0x006d
            dalvik.system.DexFile[] r2 = r7.f19C     // Catch:{ all -> 0x0075 }
            dalvik.system.DexFile[] r1 = r7.f19C     // Catch:{ all -> 0x0075 }
            int r0 = r5 + -1
            r0 = r1[r0]     // Catch:{ all -> 0x0075 }
            r2[r5] = r0     // Catch:{ all -> 0x0075 }
            int r5 = r5 + -1
            goto L_0x005e
        L_0x006d:
            dalvik.system.DexFile[] r2 = r7.f19C     // Catch:{ all -> 0x0075 }
            r1 = 0
            r0 = 0
            r2[r1] = r0     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r3)
            return r4
        L_0x0075:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass007.findClass(java.lang.String):java.lang.Class");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00af, code lost:
        if (r1 >= 8) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00df, code lost:
        if (r0 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b1 A[Catch:{ IndexOutOfBoundsException -> 0x00b2 }, FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class loadClass(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            r6 = 0
            r2 = 46
            r5 = 6
            r4 = 5
            r3 = 0
            int r1 = r8.length()     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            if (r1 <= r5) goto L_0x00b2
            r0 = 0
            char r0 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            switch(r0) {
                case 97: goto L_0x0016;
                case 99: goto L_0x0098;
                case 100: goto L_0x00ad;
                case 106: goto L_0x0051;
                case 108: goto L_0x00b1;
                case 111: goto L_0x005a;
                case 115: goto L_0x008e;
                default: goto L_0x0014;
            }     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
        L_0x0014:
            goto L_0x00b2
        L_0x0016:
            r0 = 16
            if (r1 < r0) goto L_0x00b1
            r0 = 8
            char r1 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            r0 = 115(0x73, float:1.61E-43)
            if (r1 != r0) goto L_0x00b1
            r0 = 9
            char r1 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            r0 = 117(0x75, float:1.64E-43)
            if (r1 != r0) goto L_0x00b1
            r0 = 15
            char r0 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            if (r0 != r2) goto L_0x00b1
            r0 = 7
            char r0 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            if (r0 != r2) goto L_0x00b1
            java.lang.String r1 = "ndroid.support"
            r0 = 1
            boolean r0 = r8.startsWith(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = "test."
            r0 = 16
            boolean r0 = r8.startsWith(r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            if (r0 == 0) goto L_0x00b2
            goto L_0x00b1
        L_0x0051:
            r0 = 1
            char r0 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            switch(r0) {
                case 97: goto L_0x00b1;
                case 117: goto L_0x00b1;
                default: goto L_0x0059;
            }     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
        L_0x0059:
            goto L_0x00b2
        L_0x005a:
            if (r1 < r5) goto L_0x00b2
            r0 = 4
            char r0 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            switch(r0) {
                case 97: goto L_0x0065;
                case 106: goto L_0x00b1;
                case 119: goto L_0x0084;
                case 120: goto L_0x00b1;
                default: goto L_0x0064;
            }     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
        L_0x0064:
            goto L_0x00b2
        L_0x0065:
            r0 = 12
            if (r1 < r0) goto L_0x00b2
            r0 = 5
            char r1 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            r0 = 112(0x70, float:1.57E-43)
            if (r1 != r0) goto L_0x00b2
            r0 = 6
            char r1 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            r0 = 97
            if (r1 != r0) goto L_0x00b2
            r0 = 10
            char r0 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            if (r0 != r2) goto L_0x00b2
            goto L_0x00b1
        L_0x0084:
            r0 = 5
            char r1 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            r0 = 51
            if (r1 != r0) goto L_0x00b2
            goto L_0x00b1
        L_0x008e:
            if (r1 < r4) goto L_0x00b2
            r0 = 3
            char r0 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            if (r0 != r2) goto L_0x00b2
            goto L_0x00b1
        L_0x0098:
            if (r1 < r5) goto L_0x00b2
            r0 = 4
            char r1 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            r0 = 97
            if (r1 != r0) goto L_0x00b2
            r0 = 5
            char r1 = r8.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x00b2 }
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 != r0) goto L_0x00b2
            goto L_0x00b1
        L_0x00ad:
            r0 = 8
            if (r1 < r0) goto L_0x00b2
        L_0x00b1:
            r3 = 1
        L_0x00b2:
            if (r3 == 0) goto L_0x00c7
            java.lang.ClassLoader r0 = r7.getParent()
            if (r0 == 0) goto L_0x00c3
            java.lang.ClassLoader r0 = r7.getParent()     // Catch:{ ClassNotFoundException -> 0x00c3 }
            java.lang.Class r0 = r0.loadClass(r8)     // Catch:{ ClassNotFoundException -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            if (r0 != 0) goto L_0x00e2
            r6 = 1
        L_0x00c7:
            java.lang.Class r0 = r7.findClass(r8)     // Catch:{ ClassNotFoundException -> 0x00cc }
            return r0
        L_0x00cc:
            r1 = move-exception
            if (r6 != 0) goto L_0x00e1
            java.lang.ClassLoader r0 = r7.getParent()
            if (r0 == 0) goto L_0x00de
            java.lang.ClassLoader r0 = r7.getParent()     // Catch:{ ClassNotFoundException -> 0x00de }
            java.lang.Class r0 = r0.loadClass(r8)     // Catch:{ ClassNotFoundException -> 0x00de }
            goto L_0x00df
        L_0x00de:
            r0 = 0
        L_0x00df:
            if (r0 != 0) goto L_0x00e2
        L_0x00e1:
            throw r1
        L_0x00e2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.AnonymousClass007.loadClass(java.lang.String, boolean):java.lang.Class");
    }
}
