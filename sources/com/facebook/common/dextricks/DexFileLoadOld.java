package com.facebook.common.dextricks;

import dalvik.system.DexFile;

public final class DexFileLoadOld {
    /* renamed from: B */
    public static Class m334B(DexFile dexFile, String str, ClassLoader classLoader) {
        return dexFile.loadClassBinaryName(str, classLoader);
    }
}
