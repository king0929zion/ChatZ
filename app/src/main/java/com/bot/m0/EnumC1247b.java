package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1247b {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1247b f12884c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1247b f12885e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1247b f12886f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1247b[] f12887g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m0.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m0.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, m0.b] */
    static {
        ?? r02 = new Enum("None", 0);
        f12884c = r02;
        ?? r12 = new Enum("Cancelled", 1);
        f12885e = r12;
        ?? r22 = new Enum("Redirected", 2);
        f12886f = r22;
        f12887g = new EnumC1247b[]{r02, r12, r22, new Enum("RedirectCancelled", 3)};
    }

    public static EnumC1247b valueOf(String str) {
        return (EnumC1247b) Enum.valueOf(EnumC1247b.class, str);
    }

    public static EnumC1247b[] values() {
        return (EnumC1247b[]) f12887g.clone();
    }
}
