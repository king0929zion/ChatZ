package S2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: c, reason: collision with root package name */
    public static final H0 f7704c;

    /* renamed from: e, reason: collision with root package name */
    public static final H0 f7705e;

    /* renamed from: f, reason: collision with root package name */
    public static final H0 f7706f;

    /* renamed from: g, reason: collision with root package name */
    public static final H0 f7707g;

    /* renamed from: h, reason: collision with root package name */
    public static final H0 f7708h;

    /* renamed from: i, reason: collision with root package name */
    public static final H0 f7709i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ H0[] f7710j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, S2.H0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, S2.H0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, S2.H0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, S2.H0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, S2.H0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, S2.H0] */
    static {
        ?? r02 = new Enum("IDENTIFIER", 0);
        f7704c = r02;
        ?? r12 = new Enum("STRING", 1);
        f7705e = r12;
        ?? r22 = new Enum("NUMBER", 2);
        f7706f = r22;
        ?? r32 = new Enum("SYMBOL", 3);
        f7707g = r32;
        ?? r42 = new Enum("WHITESPACE", 4);
        f7708h = r42;
        ?? r5 = new Enum("COMMENT", 5);
        f7709i = r5;
        f7710j = new H0[]{r02, r12, r22, r32, r42, r5};
    }

    public static H0 valueOf(String str) {
        return (H0) Enum.valueOf(H0.class, str);
    }

    public static H0[] values() {
        return (H0[]) f7710j.clone();
    }
}
