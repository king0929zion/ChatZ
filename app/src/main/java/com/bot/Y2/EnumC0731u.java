package Y2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Y2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0731u {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0731u f9773c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0731u f9774e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0731u f9775f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0731u f9776g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0731u[] f9777h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Y2.u] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Y2.u] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Y2.u] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Y2.u] */
    static {
        ?? r02 = new Enum("DISCONNECTED", 0);
        f9773c = r02;
        ?? r12 = new Enum("CONNECTING", 1);
        f9774e = r12;
        ?? r22 = new Enum("CONNECTED", 2);
        f9775f = r22;
        ?? r32 = new Enum("ERROR", 3);
        f9776g = r32;
        f9777h = new EnumC0731u[]{r02, r12, r22, r32};
    }

    public static EnumC0731u valueOf(String str) {
        return (EnumC0731u) Enum.valueOf(EnumC0731u.class, str);
    }

    public static EnumC0731u[] values() {
        return (EnumC0731u[]) f9777h.clone();
    }
}
