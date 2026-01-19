package X3;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f9388c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ d[] f9389e;

                static {
        d r02 = new d();
        f9388c = r02;
        f9389e = new d[]{r02, new Enum("ERROR", 1), new Enum("HIDDEN", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f9389e.clone();
    }
}
