package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0927a {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0927a f11114c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0927a f11115e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0927a f11116f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0927a[] f11117g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c4.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c4.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c4.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f11114c = r02;
        ?? r12 = new Enum("UNDECIDED", 1);
        f11115e = r12;
        ?? r22 = new Enum("RESUMED", 2);
        f11116f = r22;
        f11117g = new EnumC0927a[]{r02, r12, r22};
    }

    public static EnumC0927a valueOf(String str) {
        return (EnumC0927a) Enum.valueOf(EnumC0927a.class, str);
    }

    public static EnumC0927a[] values() {
        return (EnumC0927a[]) f11117g.clone();
    }
}
