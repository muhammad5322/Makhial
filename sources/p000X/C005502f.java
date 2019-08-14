package p000X;

import java.io.FilterWriter;
import java.io.Writer;

/* renamed from: X.02f reason: invalid class name and case insensitive filesystem */
public class C005502f extends FilterWriter {

    /* renamed from: C */
    private static final byte[] f380C = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

    /* renamed from: B */
    private char f381B = 0;

    public C005502f(Writer writer) {
        super(writer);
    }

    /* renamed from: B */
    private void m312B(byte b) {
        this.out.write(37);
        Writer writer = this.out;
        byte[] bArr = f380C;
        writer.write(bArr[(b >> 4) & 15]);
        this.out.write(bArr[b & 15]);
    }

    public final void close() {
        flush();
    }

    public final void flush() {
        if (this.f381B != 0) {
            m312B(63);
            this.f381B = 0;
        }
        super.flush();
    }

    public final void write(int i) {
        int i2;
        boolean z = true;
        char c = (char) i;
        if (this.f381B != 0) {
            boolean z2 = false;
            if ((63488 & c) == 55296) {
                z2 = true;
            }
            if (z2) {
                if ((c & 1024) == 0) {
                    z = false;
                }
                if (z) {
                    int i3 = ((this.f381B << 10) + c) - 56613888;
                    m312B((byte) ((i3 >> 18) | 240));
                    m312B((byte) (((i3 >> 12) & 63) | 128));
                    m312B((byte) (((i3 >> 6) & 63) | 128));
                    m312B((byte) ((i3 & 63) | 128));
                    this.f381B = 0;
                    return;
                }
            }
            m312B(63);
            this.f381B = 0;
            write(c);
        } else if ((c & 65535) < 128) {
            byte b = (byte) c;
            if ((b >= 97 && b <= 122) || ((b >= 65 && b <= 90) || ((b >= 48 && b <= 57) || b == 46 || b == 45 || b == 42 || b == 95))) {
                this.out.write(b);
            } else if (b == 32) {
                this.out.write(43);
            } else {
                m312B(b);
            }
        } else {
            if ((c & 65535) < 2048) {
                i2 = (c >> 6) | 192;
            } else {
                boolean z3 = false;
                if ((63488 & c) == 55296) {
                    z3 = true;
                }
                if (z3) {
                    if ((c & 1024) != 0) {
                        z = false;
                    }
                    if (z) {
                        this.f381B = c;
                        return;
                    } else {
                        m312B(63);
                        return;
                    }
                } else {
                    m312B((byte) ((c >> 12) | 224));
                    i2 = ((c >> 6) & 63) | 128;
                }
            }
            m312B((byte) i2);
            m312B((byte) ((c & '?') | 128));
        }
    }

    public final void write(String str, int i, int i2) {
        synchronized (this.lock) {
            for (int i3 = i; i3 < i + i2; i3++) {
                write(str.charAt(i3));
            }
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        synchronized (this.lock) {
            for (int i3 = i; i3 < i + i2; i3++) {
                write(cArr[i3]);
            }
        }
    }
}
