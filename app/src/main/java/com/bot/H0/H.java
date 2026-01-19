package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    public static final H f1705c;

    /* renamed from: e, reason: collision with root package name */
    public static final H f1706e;

    /* renamed from: f, reason: collision with root package name */
    public static final H f1707f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ H[] f1708g;

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.H, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [H0.H, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [H0.H, java.lang.Enum] */
    static {
        ?? r02 = new Enum("InMeasureBlock", 0);
        f1705c = r02;
        ?? r12 = new Enum("InLayoutBlock", 1);
        f1706e = r12;
        ?? r22 = new Enum("NotUsed", 2);
        f1707f = r22;
        f1708g = new H[]{r02, r12, r22};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f1708g.clone();
    }
}
