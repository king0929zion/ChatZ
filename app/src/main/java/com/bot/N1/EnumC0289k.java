package N1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: N1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0289k {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0289k f3751c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0289k f3752e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0289k f3753f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0289k[] f3754g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, N1.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, N1.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, N1.k] */
    static {
        ?? r02 = new Enum("NO_OP", 0);
        f3751c = r02;
        ?? r12 = new Enum("ADD", 1);
        f3752e = r12;
        ?? r22 = new Enum("REMOVE", 2);
        f3753f = r22;
        f3754g = new EnumC0289k[]{r02, r12, r22};
    }

    public static EnumC0289k valueOf(String str) {
        return (EnumC0289k) Enum.valueOf(EnumC0289k.class, str);
    }

    public static EnumC0289k[] values() {
        return (EnumC0289k[]) f3754g.clone();
    }
}
