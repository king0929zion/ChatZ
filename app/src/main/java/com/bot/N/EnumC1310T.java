package n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1310T {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1310T f13041c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1310T f13042e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1310T[] f13043f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n.T] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n.T] */
    static {
        ?? r02 = new Enum("Restart", 0);
        f13041c = r02;
        ?? r12 = new Enum("Reverse", 1);
        f13042e = r12;
        f13043f = new EnumC1310T[]{r02, r12};
    }

    public static EnumC1310T valueOf(String str) {
        return (EnumC1310T) Enum.valueOf(EnumC1310T.class, str);
    }

    public static EnumC1310T[] values() {
        return (EnumC1310T[]) f13043f.clone();
    }
}
