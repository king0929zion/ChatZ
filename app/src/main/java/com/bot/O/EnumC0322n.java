package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: O.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0322n {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0322n f4156c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0322n f4157e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0322n f4158f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0322n f4159g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0322n[] f4160h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, O.n] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, O.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, O.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, O.n] */
    static {
        ?? r02 = new Enum("Up", 0);
        f4156c = r02;
        ?? r12 = new Enum("Drag", 1);
        f4157e = r12;
        ?? r22 = new Enum("Timeout", 2);
        f4158f = r22;
        ?? r32 = new Enum("Cancel", 3);
        f4159g = r32;
        f4160h = new EnumC0322n[]{r02, r12, r22, r32};
    }

    public static EnumC0322n valueOf(String str) {
        return (EnumC0322n) Enum.valueOf(EnumC0322n.class, str);
    }

    public static EnumC0322n[] values() {
        return (EnumC0322n[]) f4160h.clone();
    }
}
