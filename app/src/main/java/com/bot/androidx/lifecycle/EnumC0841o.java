package androidx.lifecycle;

import e4.C0969b;
import e4.InterfaceC0968a;
import v.AbstractC1787b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0841o {
    private static final /* synthetic */ InterfaceC0968a $ENTRIES;
    private static final /* synthetic */ EnumC0841o[] $VALUES;
    public static final C0839m Companion;
    public static final EnumC0841o ON_ANY;
    public static final EnumC0841o ON_CREATE;
    public static final EnumC0841o ON_DESTROY;
    public static final EnumC0841o ON_PAUSE;
    public static final EnumC0841o ON_RESUME;
    public static final EnumC0841o ON_START;
    public static final EnumC0841o ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.o] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r42 = new Enum("ON_STOP", 4);
        ON_STOP = r42;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        EnumC0841o[] enumC0841oArr = {r02, r12, r22, r32, r42, r5, r6};
        $VALUES = enumC0841oArr;
        $ENTRIES = new C0969b(enumC0841oArr);
        Companion = new Object();
    }

    public static EnumC0841o valueOf(String str) {
        return (EnumC0841o) Enum.valueOf(EnumC0841o.class, str);
    }

    public static EnumC0841o[] values() {
        return (EnumC0841o[]) $VALUES.clone();
    }

    public final EnumC0842p a() {
        switch (AbstractC0840n.a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0842p.f10877f;
            case 3:
            case 4:
                return EnumC0842p.f10878g;
            case AbstractC1787b.f15290g /* 5 */:
                return EnumC0842p.f10879h;
            case 6:
                return EnumC0842p.f10875c;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new RuntimeException();
        }
    }
}
