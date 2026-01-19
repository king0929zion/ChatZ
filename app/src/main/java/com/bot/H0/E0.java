package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: c, reason: collision with root package name */
    public static final E0 f1692c;

    /* renamed from: e, reason: collision with root package name */
    public static final E0 f1693e;

    /* renamed from: f, reason: collision with root package name */
    public static final E0 f1694f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ E0[] f1695g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, H0.E0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, H0.E0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, H0.E0] */
    static {
        ?? r02 = new Enum("ContinueTraversal", 0);
        f1692c = r02;
        ?? r12 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f1693e = r12;
        ?? r22 = new Enum("CancelTraversal", 2);
        f1694f = r22;
        f1695g = new E0[]{r02, r12, r22};
    }

    public static E0 valueOf(String str) {
        return (E0) Enum.valueOf(E0.class, str);
    }

    public static E0[] values() {
        return (E0[]) f1695g.clone();
    }
}
