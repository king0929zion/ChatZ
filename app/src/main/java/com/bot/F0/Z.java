package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: c, reason: collision with root package name */
    public static final Z f1464c;

    /* renamed from: e, reason: collision with root package name */
    public static final Z f1465e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Z[] f1466f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, F0.Z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, F0.Z] */
    static {
        ?? r02 = new Enum("Width", 0);
        f1464c = r02;
        ?? r12 = new Enum("Height", 1);
        f1465e = r12;
        f1466f = new Z[]{r02, r12};
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) f1466f.clone();
    }
}
