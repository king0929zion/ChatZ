package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f11390c;

    /* renamed from: e, reason: collision with root package name */
    public static final j f11391e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j[] f11392f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d1.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d1.j] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f11390c = r02;
        ?? r12 = new Enum("Rtl", 1);
        f11391e = r12;
        f11392f = new j[]{r02, r12};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f11392f.clone();
    }
}
