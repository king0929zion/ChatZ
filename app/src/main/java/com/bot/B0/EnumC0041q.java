package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: B0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0041q {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0041q f475c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0041q f476e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0041q f477f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0041q[] f478g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, B0.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, B0.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, B0.q] */
    static {
        ?? r02 = new Enum("Initial", 0);
        f475c = r02;
        ?? r12 = new Enum("Main", 1);
        f476e = r12;
        ?? r22 = new Enum("Final", 2);
        f477f = r22;
        f478g = new EnumC0041q[]{r02, r12, r22};
    }

    public static EnumC0041q valueOf(String str) {
        return (EnumC0041q) Enum.valueOf(EnumC0041q.class, str);
    }

    public static EnumC0041q[] values() {
        return (EnumC0041q[]) f478g.clone();
    }
}
