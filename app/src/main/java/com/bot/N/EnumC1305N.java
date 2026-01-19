package n;

/* renamed from: n.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1305N {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1305N f13031c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1305N[] f13032e;

                static {
        EnumC1305N r02 = new EnumC1305N();
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
