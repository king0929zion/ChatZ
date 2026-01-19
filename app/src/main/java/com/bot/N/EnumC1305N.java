package n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1305N {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1305N f13031c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1305N[] f13032e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n.N] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n.N] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n.N] */
    static {
        ?? r02 = new Enum("Default", 0);
        f13031c = r02;
        f13032e = new EnumC1305N[]{r02, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
    }

    public static EnumC1305N valueOf(String str) {
        return (EnumC1305N) Enum.valueOf(EnumC1305N.class, str);
    }

    public static EnumC1305N[] values() {
        return (EnumC1305N[]) f13032e.clone();
    }
}
