package L2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f3092c;

    /* renamed from: e, reason: collision with root package name */
    public static final i f3093e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f3094f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f3095g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f3096h;

    /* JADX WARN: Type inference failed for: r0v0, types: [L2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [L2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [L2.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [L2.i, java.lang.Enum] */
    static {
        ?? r02 = new Enum("PENDING", 0);
        f3092c = r02;
        ?? r12 = new Enum("RUNNING", 1);
        f3093e = r12;
        ?? r22 = new Enum("SUCCESS", 2);
        f3094f = r22;
        ?? r32 = new Enum("FAILED", 3);
        f3095g = r32;
        f3096h = new i[]{r02, r12, r22, r32};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f3096h.clone();
    }
}
