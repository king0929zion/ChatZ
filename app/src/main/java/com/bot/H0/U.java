package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static final U f1811c;

    /* renamed from: e, reason: collision with root package name */
    public static final U f1812e;

    /* renamed from: f, reason: collision with root package name */
    public static final U f1813f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ U[] f1814g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, H0.U] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, H0.U] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, H0.U] */
    static {
        ?? r02 = new Enum("IsPlacedInLookahead", 0);
        f1811c = r02;
        ?? r12 = new Enum("IsPlacedInApproach", 1);
        f1812e = r12;
        ?? r22 = new Enum("IsNotPlaced", 2);
        f1813f = r22;
        f1814g = new U[]{r02, r12, r22};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f1814g.clone();
    }
}
