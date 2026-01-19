package v;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f15277c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Y[] f15278e;

            static {
        Y r02 = new Y();
        f15277c = r02;
        f15278e = new Y[]{r02, new Enum("Vertical", 1)};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f15278e.clone();
    }
}
