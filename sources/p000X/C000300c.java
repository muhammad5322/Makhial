package p000X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.00c reason: invalid class name and case insensitive filesystem */
public class C000300c implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.startsWith("deathmon_logcat_");
    }
}
