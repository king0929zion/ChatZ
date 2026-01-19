package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: O.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0301c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0301c0 f4086c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0301c0 f4087e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0301c0 f4088f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0301c0[] f4089g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, O.c0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, O.c0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, O.c0] */
    static {
        ?? r02 = new Enum("Left", 0);
        f4086c = r02;
        ?? r12 = new Enum("Middle", 1);
        f4087e = r12;
        ?? r22 = new Enum("Right", 2);
        f4088f = r22;
        f4089g = new EnumC0301c0[]{r02, r12, r22};
    }

    public static EnumC0301c0 valueOf(String str) {
        return (EnumC0301c0) Enum.valueOf(EnumC0301c0.class, str);
    }

    public static EnumC0301c0[] values() {
        return (EnumC0301c0[]) f4089g.clone();
    }
}
