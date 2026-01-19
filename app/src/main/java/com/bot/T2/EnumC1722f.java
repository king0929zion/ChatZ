package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1722f {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1722f f14906c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1722f f14907e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1722f[] f14908f;

    /* JADX WARN: Type inference failed for: r0v0, types: [t2.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t2.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("FILL", 0);
        f14906c = r02;
        ?? r12 = new Enum("FIT", 1);
        f14907e = r12;
        f14908f = new EnumC1722f[]{r02, r12};
    }

    public static EnumC1722f valueOf(String str) {
        return (EnumC1722f) Enum.valueOf(EnumC1722f.class, str);
    }

    public static EnumC1722f[] values() {
        return (EnumC1722f[]) f14908f.clone();
    }
}
