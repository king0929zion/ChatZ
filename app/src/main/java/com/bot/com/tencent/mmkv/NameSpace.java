package com.tencent.mmkv;

/* loaded from: classes.dex */
public final class NameSpace {
    private final String rootDir;

    public NameSpace(String str) {
        this.rootDir = str;
    }

    public boolean backupOneToDirectory(String str, String str2) {
        return MMKV.backupOneToDirectory(str, str2, this.rootDir);
    }

    public boolean checkExist(String str) {
        return MMKV.checkExist(str, this.rootDir);
    }

    public String getRootDir() {
        return this.rootDir;
    }

    public boolean isFileValid(String str) {
        return MMKV.isFileValid(str, this.rootDir);
    }

    public MMKV mmkvWithID(String str) {
        return MMKV.checkProcessMode(MMKV.getMMKVWithID(str, 1, null, this.rootDir, 0L), str, 1);
    }

    public boolean removeStorage(String str) {
        return MMKV.removeStorage(str, this.rootDir);
    }

    public boolean restoreOneMMKVFromDirectory(String str, String str2) {
        return MMKV.restoreOneMMKVFromDirectory(str, str2, this.rootDir);
    }

    public MMKV mmkvWithID(String str, int i6) {
        return MMKV.checkProcessMode(MMKV.getMMKVWithID(str, i6, null, this.rootDir, 0L), str, i6);
    }

    public MMKV mmkvWithID(String str, int i6, long j3) {
        return MMKV.checkProcessMode(MMKV.getMMKVWithID(str, i6, null, this.rootDir, j3), str, i6);
    }

    public MMKV mmkvWithID(String str, int i6, String str2) {
        return MMKV.checkProcessMode(MMKV.getMMKVWithID(str, i6, str2, this.rootDir, 0L), str, i6);
    }

    public MMKV mmkvWithID(String str, int i6, String str2, long j3) {
        return MMKV.checkProcessMode(MMKV.getMMKVWithID(str, i6, str2, this.rootDir, j3), str, i6);
    }
}
