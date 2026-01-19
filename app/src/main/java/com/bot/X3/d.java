package X3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f9388c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f9389e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, X3.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, X3.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, X3.d] */
    static {
        ?? r02 = new Enum("WARNING", 0);
        f9388c = r02;
        f9389e = new d[]{r02, new Enum("ERROR", 1), new Enum("HIDDEN", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f9389e.clone();
    }
}
