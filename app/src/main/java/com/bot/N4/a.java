package N4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3879c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3880e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f3881f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N4.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N4.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, N4.a] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f3879c = r02;
        ?? r12 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r22 = new Enum("POLYMORPHIC", 2);
        f3880e = r22;
        f3881f = new a[]{r02, r12, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3881f.clone();
    }
}
