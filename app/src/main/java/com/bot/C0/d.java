package C0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f650c;

    /* renamed from: e, reason: collision with root package name */
    public static final d f651e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f652f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, C0.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, C0.d] */
    static {
        ?? r02 = new Enum("Lsq2", 0);
        f650c = r02;
        ?? r12 = new Enum("Impulse", 1);
        f651e = r12;
        f652f = new d[]{r02, r12};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f652f.clone();
    }
}
