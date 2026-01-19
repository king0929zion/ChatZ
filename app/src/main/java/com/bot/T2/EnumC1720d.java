package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1720d {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1720d f14902c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1720d f14903e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1720d f14904f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1720d[] f14905g;

    /* JADX WARN: Type inference failed for: r0v0, types: [t2.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t2.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [t2.d, java.lang.Enum] */
    static {
        ?? r02 = new Enum("EXACT", 0);
        f14902c = r02;
        ?? r12 = new Enum("INEXACT", 1);
        f14903e = r12;
        ?? r22 = new Enum("AUTOMATIC", 2);
        f14904f = r22;
        f14905g = new EnumC1720d[]{r02, r12, r22};
    }

    public static EnumC1720d valueOf(String str) {
        return (EnumC1720d) Enum.valueOf(EnumC1720d.class, str);
    }

    public static EnumC1720d[] values() {
        return (EnumC1720d[]) f14905g.clone();
    }
}
