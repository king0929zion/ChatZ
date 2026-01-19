package x4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1943z {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1943z f15739c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1943z f15740e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1943z f15741f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1943z f15742g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC1943z[] f15743h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x4.z] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x4.z] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, x4.z] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, x4.z] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15739c = r02;
        ?? r12 = new Enum("LAZY", 1);
        f15740e = r12;
        ?? r22 = new Enum("ATOMIC", 2);
        f15741f = r22;
        ?? r32 = new Enum("UNDISPATCHED", 3);
        f15742g = r32;
        f15743h = new EnumC1943z[]{r02, r12, r22, r32};
    }

    public static EnumC1943z valueOf(String str) {
        return (EnumC1943z) Enum.valueOf(EnumC1943z.class, str);
    }

    public static EnumC1943z[] values() {
        return (EnumC1943z[]) f15743h.clone();
    }
}
