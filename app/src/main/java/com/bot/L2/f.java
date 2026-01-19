package L2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f3081c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f3082e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f3083f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f3084g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L2.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L2.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L2.f] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f3081c = r02;
        ?? r12 = new Enum("REASONING", 1);
        f3082e = r12;
        ?? r22 = new Enum("DONE", 2);
        f3083f = r22;
        f3084g = new f[]{r02, r12, r22};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f3084g.clone();
    }
}
