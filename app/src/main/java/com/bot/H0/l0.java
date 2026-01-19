package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f1968c;

    /* renamed from: e, reason: collision with root package name */
    public static final l0 f1969e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l0[] f1970f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, H0.l0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, H0.l0] */
    static {
        ?? r02 = new Enum("Width", 0);
        f1968c = r02;
        ?? r12 = new Enum("Height", 1);
        f1969e = r12;
        f1970f = new l0[]{r02, r12};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f1970f.clone();
    }
}
