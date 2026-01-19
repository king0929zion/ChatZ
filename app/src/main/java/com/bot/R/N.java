package R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class N {

    /* renamed from: c, reason: collision with root package name */
    public static final N f6711c;

    /* renamed from: e, reason: collision with root package name */
    public static final N f6712e;

    /* renamed from: f, reason: collision with root package name */
    public static final N f6713f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ N[] f6714g;

    /* JADX WARN: Type inference failed for: r0v0, types: [R.N, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [R.N, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [R.N, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Focused", 0);
        f6711c = r02;
        ?? r12 = new Enum("UnfocusedEmpty", 1);
        f6712e = r12;
        ?? r22 = new Enum("UnfocusedNotEmpty", 2);
        f6713f = r22;
        f6714g = new N[]{r02, r12, r22};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f6714g.clone();
    }
}
