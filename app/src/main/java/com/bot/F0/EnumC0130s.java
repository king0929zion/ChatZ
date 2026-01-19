package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: F0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0130s {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0130s f1519c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0130s f1520e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0130s[] f1521f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, F0.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, F0.s] */
    static {
        ?? r02 = new Enum("Min", 0);
        f1519c = r02;
        ?? r12 = new Enum("Max", 1);
        f1520e = r12;
        f1521f = new EnumC0130s[]{r02, r12};
    }

    public static EnumC0130s valueOf(String str) {
        return (EnumC0130s) Enum.valueOf(EnumC0130s.class, str);
    }

    public static EnumC0130s[] values() {
        return (EnumC0130s[]) f1521f.clone();
    }
}
