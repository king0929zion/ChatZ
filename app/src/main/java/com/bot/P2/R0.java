package P2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: c, reason: collision with root package name */
    public static final R0 f4779c;

    /* renamed from: e, reason: collision with root package name */
    public static final R0 f4780e;

    /* renamed from: f, reason: collision with root package name */
    public static final R0 f4781f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ R0[] f4782g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, P2.R0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, P2.R0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, P2.R0] */
    static {
        ?? r02 = new Enum("IDLE", 0);
        f4779c = r02;
        ?? r12 = new Enum("SPEAKING", 1);
        f4780e = r12;
        ?? r22 = new Enum("ERROR", 2);
        f4781f = r22;
        f4782g = new R0[]{r02, r12, r22};
    }

    public static R0 valueOf(String str) {
        return (R0) Enum.valueOf(R0.class, str);
    }

    public static R0[] values() {
        return (R0[]) f4782g.clone();
    }
}
