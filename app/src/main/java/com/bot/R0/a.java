package R0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6850c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f6851e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f6852f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f6853g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, R0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, R0.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, R0.a] */
    static {
        ?? r02 = new Enum("On", 0);
        f6850c = r02;
        ?? r12 = new Enum("Off", 1);
        f6851e = r12;
        ?? r22 = new Enum("Indeterminate", 2);
        f6852f = r22;
        f6853g = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6853g.clone();
    }
}
