package com.facebook.common.dextricks;

import dalvik.system.DexFile;

public final class DexFileLoadNew {
    /* renamed from: B */
    public static Class m333B(DexFile dexFile, String str, ClassLoader classLoader) {
        return dexFile.loadClassBinaryName(str, classLoader, null);
    }
}
