package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f12341c;

    /* renamed from: e, reason: collision with root package name */
    public static final f f12342e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f12343f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j0.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j0.f] */
    static {
        ?? r02 = new Enum("VIEW_APPEAR", 0);
        f12341c = r02;
        ?? r12 = new Enum("VIEW_DISAPPEAR", 1);
        f12342e = r12;
        f12343f = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f12343f.clone();
    }
}
