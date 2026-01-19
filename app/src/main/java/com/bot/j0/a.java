package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12315c;

    /* renamed from: e, reason: collision with root package name */
    public static final a f12316e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f12317f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j0.a] */
    static {
        ?? r02 = new Enum("SHOW_ORIGINAL", 0);
        f12315c = r02;
        ?? r12 = new Enum("SHOW_TRANSLATED", 1);
        f12316e = r12;
        f12317f = new a[]{r02, r12};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f12317f.clone();
    }
}
