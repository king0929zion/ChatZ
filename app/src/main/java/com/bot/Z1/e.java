package Z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f9864c;

    /* renamed from: e, reason: collision with root package name */
    public static final e f9865e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f9866f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f9867g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f9868h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e[] f9869i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Z1.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Z1.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Z1.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Z1.e] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, Z1.e] */
    static {
        ?? r02 = new Enum("ON_CONFIGURE", 0);
        f9864c = r02;
        ?? r12 = new Enum("ON_CREATE", 1);
        f9865e = r12;
        ?? r22 = new Enum("ON_UPGRADE", 2);
        f9866f = r22;
        ?? r32 = new Enum("ON_DOWNGRADE", 3);
        f9867g = r32;
        ?? r42 = new Enum("ON_OPEN", 4);
        f9868h = r42;
        f9869i = new e[]{r02, r12, r22, r32, r42};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f9869i.clone();
    }
}
