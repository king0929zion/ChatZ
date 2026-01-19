package S;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f7413c;

    /* renamed from: e, reason: collision with root package name */
    public static final p f7414e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f7415f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f7416g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f7417h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p[] f7418i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, S.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, S.p] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, S.p] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, S.p] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, S.p] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, S.p] */
    static {
        ?? r02 = new Enum("DefaultSpatial", 0);
        f7413c = r02;
        ?? r12 = new Enum("FastSpatial", 1);
        f7414e = r12;
        ?? r22 = new Enum("SlowSpatial", 2);
        ?? r32 = new Enum("DefaultEffects", 3);
        f7415f = r32;
        ?? r42 = new Enum("FastEffects", 4);
        f7416g = r42;
        ?? r5 = new Enum("SlowEffects", 5);
        f7417h = r5;
        f7418i = new p[]{r02, r12, r22, r32, r42, r5};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f7418i.clone();
    }
}
