package T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: T.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0613j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0613j0 f8114c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0613j0 f8115e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0613j0 f8116f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0613j0 f8117g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0613j0 f8118h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0613j0 f8119i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0613j0 f8120j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0613j0[] f8121k;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T.j0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T.j0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, T.j0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, T.j0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, T.j0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, T.j0] */
    static {
        ?? r02 = new Enum("Invalid", 0);
        f8114c = r02;
        ?? r12 = new Enum("Cancelled", 1);
        f8115e = r12;
        ?? r22 = new Enum("InitialPending", 2);
        f8116f = r22;
        ?? r32 = new Enum("RecomposePending", 3);
        f8117g = r32;
        ?? r42 = new Enum("Recomposing", 4);
        f8118h = r42;
        ?? r5 = new Enum("ApplyPending", 5);
        f8119i = r5;
        ?? r6 = new Enum("Applied", 6);
        f8120j = r6;
        f8121k = new EnumC0613j0[]{r02, r12, r22, r32, r42, r5, r6};
    }

    public static EnumC0613j0 valueOf(String str) {
        return (EnumC0613j0) Enum.valueOf(EnumC0613j0.class, str);
    }

    public static EnumC0613j0[] values() {
        return (EnumC0613j0[]) f8121k.clone();
    }
}
