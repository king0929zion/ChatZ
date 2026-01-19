package L2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f3073c;

    /* renamed from: e, reason: collision with root package name */
    public static final e f3074e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f3075f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f3076g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f3077h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f3078i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f3079j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ e[] f3080k;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L2.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L2.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L2.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, L2.e] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, L2.e] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, L2.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, L2.e] */
    static {
        ?? r02 = new Enum("IDLE", 0);
        f3073c = r02;
        ?? r12 = new Enum("LOADING", 1);
        f3074e = r12;
        ?? r22 = new Enum("STREAMING", 2);
        f3075f = r22;
        ?? r32 = new Enum("DONE", 3);
        f3076g = r32;
        ?? r42 = new Enum("ERROR", 4);
        f3077h = r42;
        ?? r5 = new Enum("ABORTED", 5);
        f3078i = r5;
        ?? r6 = new Enum("RETRYING", 6);
        f3079j = r6;
        f3080k = new e[]{r02, r12, r22, r32, r42, r5, r6};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f3080k.clone();
    }
}
