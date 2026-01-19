package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: O.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0320m {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0320m f4151c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0320m f4152e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0320m f4153f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0320m[] f4154g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, O.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, O.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, O.m] */
    static {
        ?? r02 = new Enum("BEFORE", 0);
        f4151c = r02;
        ?? r12 = new Enum("ON", 1);
        f4152e = r12;
        ?? r22 = new Enum("AFTER", 2);
        f4153f = r22;
        f4154g = new EnumC0320m[]{r02, r12, r22};
    }

    public static EnumC0320m valueOf(String str) {
        return (EnumC0320m) Enum.valueOf(EnumC0320m.class, str);
    }

    public static EnumC0320m[] values() {
        return (EnumC0320m[]) f4154g.clone();
    }
}
