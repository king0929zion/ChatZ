package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0073i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0073i0 f1034c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0073i0 f1035e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0073i0 f1036f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0073i0[] f1037g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, D.i0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, D.i0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, D.i0] */
    static {
        ?? r02 = new Enum("Cursor", 0);
        f1034c = r02;
        ?? r12 = new Enum("SelectionStart", 1);
        f1035e = r12;
        ?? r22 = new Enum("SelectionEnd", 2);
        f1036f = r22;
        f1037g = new EnumC0073i0[]{r02, r12, r22};
    }

    public static EnumC0073i0 valueOf(String str) {
        return (EnumC0073i0) Enum.valueOf(EnumC0073i0.class, str);
    }

    public static EnumC0073i0[] values() {
        return (EnumC0073i0[]) f1037g.clone();
    }
}
