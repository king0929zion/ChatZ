package M2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f3283c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f3284e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f3285f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, M2.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, M2.f] */
    static {
        ?? r02 = new Enum("TEXT", 0);
        f3283c = r02;
        ?? r12 = new Enum("REASONING", 1);
        f3284e = r12;
        f3285f = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f3285f.clone();
    }
}
