package androidx.lifecycle;

import e4.C0969b;
import e4.InterfaceC0968a;
import v.AbstractC1787b;

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

                                    static {
        EnumC0841o r02 = new EnumC0841o();
        ON_CREATE = r02;
        EnumC0841o r12 = new EnumC0841o();
        ON_START = r12;
        EnumC0841o r22 = new EnumC0841o();
        ON_RESUME = r22;
        EnumC0841o r32 = new EnumC0841o();
        ON_PAUSE = r32;
        EnumC0841o r42 = new EnumC0841o();
        ON_STOP = r42;
        EnumC0841o r5 = new EnumC0841o();
        ON_DESTROY = r5;
        EnumC0841o r6 = new EnumC0841o();
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
