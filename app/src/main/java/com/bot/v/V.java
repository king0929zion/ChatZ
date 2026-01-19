package v;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final V f15272c;

    /* renamed from: e, reason: collision with root package name */
    public static final V f15273e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ V[] f15274f;

            static {
        V r02 = new V();
        f15272c = r02;
        V r12 = new V();
        f15273e = r12;
        f15274f = new V[]{r02, r12};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f15274f.clone();
    }
}
