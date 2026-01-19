package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: F0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0131t {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0131t f1527c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0131t f1528e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0131t[] f1529f;

    /* JADX WARN: Type inference failed for: r0v0, types: [F0.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [F0.t, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Width", 0);
        f1527c = r02;
        ?? r12 = new Enum("Height", 1);
        f1528e = r12;
        f1529f = new EnumC0131t[]{r02, r12};
    }

    public static EnumC0131t valueOf(String str) {
        return (EnumC0131t) Enum.valueOf(EnumC0131t.class, str);
    }

    public static EnumC0131t[] values() {
        return (EnumC0131t[]) f1529f.clone();
    }
}
