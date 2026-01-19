package N1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static final u f3783c;

    /* renamed from: e, reason: collision with root package name */
    public static final u f3784e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f3785f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u[] f3786g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N1.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N1.u] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, N1.u] */
    static {
        ?? r02 = new Enum("AUTOMATIC", 0);
        f3783c = r02;
        ?? r12 = new Enum("TRUNCATE", 1);
        f3784e = r12;
        ?? r22 = new Enum("WRITE_AHEAD_LOGGING", 2);
        f3785f = r22;
        f3786g = new u[]{r02, r12, r22};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f3786g.clone();
    }
}
