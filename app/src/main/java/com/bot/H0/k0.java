package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f1965c;

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f1966e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k0[] f1967f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, H0.k0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, H0.k0] */
    static {
        ?? r02 = new Enum("Min", 0);
        f1965c = r02;
        ?? r12 = new Enum("Max", 1);
        f1966e = r12;
        f1967f = new k0[]{r02, r12};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f1967f.clone();
    }
}
