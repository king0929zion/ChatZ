package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f11576c;

    /* renamed from: e, reason: collision with root package name */
    public static final m f11577e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f11578f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e1.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e1.m] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f11576c = r02;
        ?? r12 = new Enum("Rtl", 1);
        f11577e = r12;
        f11578f = new m[]{r02, r12};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f11578f.clone();
    }
}
