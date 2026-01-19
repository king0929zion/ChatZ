package r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.A0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1510A0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1510A0 f13961c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1510A0 f13962e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1510A0 f13963f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1510A0[] f13964g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r.A0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r.A0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, r.A0] */
    static {
        ?? r02 = new Enum("Yes", 0);
        f13961c = r02;
        ?? r12 = new Enum("No", 1);
        f13962e = r12;
        ?? r22 = new Enum("NotInitialized", 2);
        f13963f = r22;
        f13964g = new EnumC1510A0[]{r02, r12, r22};
    }

    public static EnumC1510A0 valueOf(String str) {
        return (EnumC1510A0) Enum.valueOf(EnumC1510A0.class, str);
    }

    public static EnumC1510A0[] values() {
        return (EnumC1510A0[]) f13964g.clone();
    }
}
