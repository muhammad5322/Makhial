package p000X;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.RandomAccessFile;

/* renamed from: X.01l reason: invalid class name and case insensitive filesystem */
public class C003501l {

    /* renamed from: B */
    public RandomAccessFile f271B;

    /* renamed from: C */
    private int f272C;

    /* renamed from: D */
    private int f273D;

    public C003501l(RandomAccessFile randomAccessFile) {
        this.f271B = randomAccessFile;
        randomAccessFile.seek(0);
        if (mo98D() != 1347241037) {
            throw new RuntimeException("Invalid minidump signature");
        }
        this.f271B.skipBytes(4);
        this.f272C = mo98D();
        this.f273D = mo98D();
    }

    /* renamed from: B */
    public static long m255B(C003501l r13) {
        long readLong = r13.f271B.readLong();
        return ((readLong >> 56) & 255) | ((readLong & 255) << 56) | (((readLong >> 8) & 255) << 48) | (((readLong >> 16) & 255) << 40) | (((readLong >> 24) & 255) << 32) | (((readLong >> 32) & 255) << 24) | (((readLong >> 40) & 255) << 16) | (((readLong >> 48) & 255) << 8);
    }

    /* renamed from: C */
    private static JsonReader m256C(JsonReader jsonReader, String str) {
        if (jsonReader == null) {
            return null;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (jsonReader.peek() != JsonToken.NULL) {
                if (nextName.equals(str)) {
                    return jsonReader;
                }
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return null;
    }

    /* renamed from: A */
    public final AnonymousClass02U mo95A(int i) {
        this.f271B.seek((long) this.f273D);
        for (int i2 = 0; i2 < this.f272C; i2++) {
            int D = mo98D();
            int D2 = mo98D();
            int D3 = mo98D();
            if (D == i) {
                return new AnonymousClass02U(D3, D2);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r3 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        throw r1;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo96B(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            java.lang.String r5 = ""
            r0 = -87110918(0xfffffffffacecafa, float:-5.36865E35)
            java.lang.String r5 = r7.mo97C(r0)     // Catch:{ Exception -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r3 = 0
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ Exception -> 0x003e }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ Exception -> 0x003e }
            r0.<init>(r5)     // Catch:{ Exception -> 0x003e }
            r2.<init>(r0)     // Catch:{ Exception -> 0x003e }
            java.lang.String r0 = "global"
            android.util.JsonReader r0 = m256C(r2, r0)     // Catch:{ Throwable -> 0x002b }
            android.util.JsonReader r0 = m256C(r0, r8)     // Catch:{ Throwable -> 0x002b }
            if (r0 == 0) goto L_0x0027
            java.lang.String r3 = r0.nextString()     // Catch:{ Throwable -> 0x002b }
        L_0x0027:
            r2.close()     // Catch:{ Exception -> 0x003e }
            return r3
        L_0x002b:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002d }
        L_0x002d:
            r1 = move-exception
            if (r3 == 0) goto L_0x0034
            r2.close()     // Catch:{ Throwable -> 0x0038 }
            goto L_0x003c
        L_0x0034:
            r2.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            p000X.AnonymousClass01A.m182B(r3, r0)     // Catch:{ Exception -> 0x003e }
        L_0x003c:
            throw r1     // Catch:{ Exception -> 0x003e }
        L_0x003d:
            return r6
        L_0x003e:
            r4 = move-exception
            java.lang.String r3 = "MinidumpReader"
            java.lang.String r2 = "getCustomData error: %s"
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r5
            p000X.C000600f.m75J(r3, r4, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000X.C003501l.mo96B(java.lang.String):java.lang.String");
    }

    /* renamed from: C */
    public final String mo97C(int i) {
        String str;
        AnonymousClass02U A = mo95A(i);
        if (A == null) {
            str = null;
        } else {
            this.f271B.seek((long) A.f371B);
            byte[] bArr = new byte[A.f372C];
            this.f271B.read(bArr);
            str = new String(bArr);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }

    /* renamed from: D */
    public final int mo98D() {
        int readInt = this.f271B.readInt();
        return (readInt >>> 24) | ((readInt & 255) << 24) | ((65280 & readInt) << 8) | ((16711680 & readInt) >> 8);
    }
}
