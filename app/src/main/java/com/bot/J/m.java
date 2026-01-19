package J;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f2806c;

    /* renamed from: e, reason: collision with root package name */
    public static final m f2807e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f2808f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m[] f2809g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, J.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, J.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, J.m] */
    static {
        ?? r02 = new Enum("Uninitialized", 0);
        f2806c = r02;
        ?? r12 = new Enum("Detached", 1);
        f2807e = r12;
        ?? r22 = new Enum("Attached", 2);
        f2808f = r22;
        f2809g = new m[]{r02, r12, r22};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f2809g.clone();
    }
}
