package F4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f1631c;

    /* renamed from: e, reason: collision with root package name */
    public static final i f1632e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f1633f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1634g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ i[] f1635h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, F4.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, F4.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, F4.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, F4.i] */
    static {
        ?? r02 = new Enum("SUCCESSFUL", 0);
        f1631c = r02;
        ?? r12 = new Enum("REREGISTER", 1);
        f1632e = r12;
        ?? r22 = new Enum("CANCELLED", 2);
        f1633f = r22;
        ?? r32 = new Enum("ALREADY_SELECTED", 3);
        f1634g = r32;
        f1635h = new i[]{r02, r12, r22, r32};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f1635h.clone();
    }
}
