package S2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: c, reason: collision with root package name */
    public static final J0 f7716c;

    /* renamed from: e, reason: collision with root package name */
    public static final J0 f7717e;

    /* renamed from: f, reason: collision with root package name */
    public static final J0 f7718f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ J0[] f7719g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, S2.J0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, S2.J0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, S2.J0] */
    static {
        ?? r02 = new Enum("LEFT", 0);
        f7716c = r02;
        ?? r12 = new Enum("CENTER", 1);
        f7717e = r12;
        ?? r22 = new Enum("RIGHT", 2);
        f7718f = r22;
        f7719g = new J0[]{r02, r12, r22};
    }

    public static J0 valueOf(String str) {
        return (J0) Enum.valueOf(J0.class, str);
    }

    public static J0[] values() {
        return (J0[]) f7719g.clone();
    }
}
