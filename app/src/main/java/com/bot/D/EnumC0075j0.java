package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0075j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0075j0 f1042c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0075j0 f1043e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0075j0 f1044f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0075j0[] f1045g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, D.j0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, D.j0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, D.j0] */
    static {
        ?? r02 = new Enum("None", 0);
        f1042c = r02;
        ?? r12 = new Enum("Selection", 1);
        f1043e = r12;
        ?? r22 = new Enum("Cursor", 2);
        f1044f = r22;
        f1045g = new EnumC0075j0[]{r02, r12, r22};
    }

    public static EnumC0075j0 valueOf(String str) {
        return (EnumC0075j0) Enum.valueOf(EnumC0075j0.class, str);
    }

    public static EnumC0075j0[] values() {
        return (EnumC0075j0[]) f1045g.clone();
    }
}
