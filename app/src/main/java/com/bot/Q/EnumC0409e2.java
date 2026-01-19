package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Q.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0409e2 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0409e2 f5776c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0409e2 f5777e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0409e2 f5778f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0409e2[] f5779g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Q.e2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Q.e2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Q.e2] */
    static {
        ?? r02 = new Enum("Hidden", 0);
        f5776c = r02;
        ?? r12 = new Enum("Expanded", 1);
        f5777e = r12;
        ?? r22 = new Enum("PartiallyExpanded", 2);
        f5778f = r22;
        f5779g = new EnumC0409e2[]{r02, r12, r22};
    }

    public static EnumC0409e2 valueOf(String str) {
        return (EnumC0409e2) Enum.valueOf(EnumC0409e2.class, str);
    }

    public static EnumC0409e2[] values() {
        return (EnumC0409e2[]) f5779g.clone();
    }
}
