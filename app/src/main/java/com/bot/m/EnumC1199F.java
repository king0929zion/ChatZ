package m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1199F {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1199F f12714c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1199F f12715e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1199F f12716f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1199F[] f12717g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, m.F] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, m.F] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, m.F] */
    static {
        ?? r02 = new Enum("PreEnter", 0);
        f12714c = r02;
        ?? r12 = new Enum("Visible", 1);
        f12715e = r12;
        ?? r22 = new Enum("PostExit", 2);
        f12716f = r22;
        f12717g = new EnumC1199F[]{r02, r12, r22};
    }

    public static EnumC1199F valueOf(String str) {
        return (EnumC1199F) Enum.valueOf(EnumC1199F.class, str);
    }

    public static EnumC1199F[] values() {
        return (EnumC1199F[]) f12717g.clone();
    }
}
