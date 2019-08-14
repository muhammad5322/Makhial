package p000X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.00Y reason: invalid class name */
public class AnonymousClass00Y implements FilenameFilter {

    /* renamed from: B */
    private /* synthetic */ String[] f100B;

    public AnonymousClass00Y(String[] strArr) {
        this.f100B = strArr;
    }

    public final boolean accept(File file, String str) {
        for (String endsWith : this.f100B) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }
}
