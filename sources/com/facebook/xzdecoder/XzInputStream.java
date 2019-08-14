package com.facebook.xzdecoder;

import java.io.IOException;
import java.io.InputStream;
import p000X.C001500q;

public class XzInputStream extends InputStream {
    private int clientOutPos;
    private byte[] inBuf = new byte[32768];
    private InputStream inFile;
    private int inPos;
    private int inSize;
    private byte[] outBuf = new byte[32768];
    private int outPos;
    private long state = initializeState();

    static {
        C001500q.m146C("fb_xzdecoder_static");
        initializeLibrary();
    }

    public XzInputStream(InputStream inputStream) {
        this.inFile = inputStream;
    }

    private void decodeMoreBytes() {
        long decompressStream = decompressStream(this.state, this.inBuf, this.inPos, this.inSize, this.outBuf, 0, this.outBuf.length);
        this.inPos = (int) (decompressStream >>> 32);
        this.outPos = (int) decompressStream;
        this.clientOutPos = 0;
    }

    private static native long decompressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private static native void end(long j);

    private static native void initializeLibrary();

    private static native long initializeState();

    private boolean readMoreInput() {
        this.inSize = 0;
        this.inPos = 0;
        while (this.inSize < 32768) {
            int read = this.inFile.read(this.inBuf, this.inSize, this.inBuf.length - this.inSize);
            if (read == -1) {
                return this.inSize > 0;
            }
            this.inSize = read + this.inSize;
        }
        return true;
    }

    public final void close() {
        this.inFile.close();
        if (this.state != 0) {
            end(this.state);
            this.state = 0;
        }
    }

    public final int read() {
        if (this.state == 0) {
            throw new IOException("Stream closed");
        }
        if (this.clientOutPos == this.outPos) {
            if (this.inPos == this.inSize && !readMoreInput()) {
                return -1;
            }
            decodeMoreBytes();
        }
        byte[] bArr = this.outBuf;
        int i = this.clientOutPos;
        this.clientOutPos = i + 1;
        return bArr[i];
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("buf.length = %d, off = %d, len = %d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (this.state == 0) {
            throw new IOException("Stream closed");
        } else {
            int i4 = i2;
            while (i3 < i2) {
                if (this.clientOutPos < this.outPos) {
                    int min = Math.min(i4, this.outPos - this.clientOutPos);
                    System.arraycopy(this.outBuf, this.clientOutPos, bArr, i, min);
                    this.clientOutPos += min;
                    i4 -= min;
                    i += min;
                    i3 += min;
                } else if (this.inPos != this.inSize || readMoreInput()) {
                    decodeMoreBytes();
                } else if (i3 == 0) {
                    return -1;
                } else {
                    return i3;
                }
            }
            return i3;
        }
    }
}
