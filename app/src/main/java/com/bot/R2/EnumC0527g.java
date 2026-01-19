package R2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: R2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0527g {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0527g f6935c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0527g f6936e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0527g f6937f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0527g f6938g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0527g[] f6939h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, R2.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, R2.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, R2.g] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, R2.g] */
    static {
        ?? r02 = new Enum("TODAY", 0);
        f6935c = r02;
        ?? r12 = new Enum("YESTERDAY", 1);
        f6936e = r12;
        ?? r22 = new Enum("THIS_WEEK", 2);
        f6937f = r22;
        ?? r32 = new Enum("THIS_MONTH", 3);
        f6938g = r32;
        f6939h = new EnumC0527g[]{r02, r12, r22, r32};
    }

    public static EnumC0527g valueOf(String str) {
        return (EnumC0527g) Enum.valueOf(EnumC0527g.class, str);
    }

    public static EnumC0527g[] values() {
        return (EnumC0527g[]) f6939h.clone();
    }
}
