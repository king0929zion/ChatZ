package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: H0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0167w {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0167w f2004c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0167w f2005e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0167w f2006f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0167w f2007g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0167w[] f2008h;

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [H0.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [H0.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [H0.w, java.lang.Enum] */
    static {
        ?? r02 = new Enum("LookaheadMeasurement", 0);
        f2004c = r02;
        ?? r12 = new Enum("LookaheadPlacement", 1);
        f2005e = r12;
        ?? r22 = new Enum("Measurement", 2);
        f2006f = r22;
        ?? r32 = new Enum("Placement", 3);
        f2007g = r32;
        f2008h = new EnumC0167w[]{r02, r12, r22, r32};
    }

    public static EnumC0167w valueOf(String str) {
        return (EnumC0167w) Enum.valueOf(EnumC0167w.class, str);
    }

    public static EnumC0167w[] values() {
        return (EnumC0167w[]) f2008h.clone();
    }
}
