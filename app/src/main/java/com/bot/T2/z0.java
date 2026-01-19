package T2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f8513c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ z0[] f8514e;

    /* JADX WARN: Type inference failed for: r0v0, types: [T2.z0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T2.z0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DOLLAR", 0);
        f8513c = r02;
        f8514e = new z0[]{r02, new Enum("BRACKET", 1)};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f8514e.clone();
    }
}
