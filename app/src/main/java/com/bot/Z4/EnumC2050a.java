package z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2050a {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2050a f16327c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2050a f16328e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2050a f16329f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC2050a[] f16330g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z4.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z4.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z4.a] */
    static {
        ?? r02 = new Enum("SUSPEND", 0);
        f16327c = r02;
        ?? r12 = new Enum("DROP_OLDEST", 1);
        f16328e = r12;
        ?? r22 = new Enum("DROP_LATEST", 2);
        f16329f = r22;
        f16330g = new EnumC2050a[]{r02, r12, r22};
    }

    public static EnumC2050a valueOf(String str) {
        return (EnumC2050a) Enum.valueOf(EnumC2050a.class, str);
    }

    public static EnumC2050a[] values() {
        return (EnumC2050a[]) f16330g.clone();
    }
}
