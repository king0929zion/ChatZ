package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: O.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0318l {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0318l f4145c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0318l f4146e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0318l f4147f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0318l[] f4148g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, O.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, O.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, O.l] */
    static {
        ?? r02 = new Enum("CROSSED", 0);
        f4145c = r02;
        ?? r12 = new Enum("NOT_CROSSED", 1);
        f4146e = r12;
        ?? r22 = new Enum("COLLAPSED", 2);
        f4147f = r22;
        f4148g = new EnumC0318l[]{r02, r12, r22};
    }

    public static EnumC0318l valueOf(String str) {
        return (EnumC0318l) Enum.valueOf(EnumC0318l.class, str);
    }

    public static EnumC0318l[] values() {
        return (EnumC0318l[]) f4148g.clone();
    }
}
