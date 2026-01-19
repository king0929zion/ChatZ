package r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: c, reason: collision with root package name */
    public static final X0 f14183c;

    /* renamed from: e, reason: collision with root package name */
    public static final X0 f14184e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ X0[] f14185f;

    /* JADX WARN: Type inference failed for: r0v0, types: [r.X0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r.X0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f14183c = r02;
        ?? r12 = new Enum("Horizontal", 1);
        f14184e = r12;
        f14185f = new X0[]{r02, r12};
    }

    public static X0 valueOf(String str) {
        return (X0) Enum.valueOf(X0.class, str);
    }

    public static X0[] values() {
        return (X0[]) f14185f.clone();
    }
}
