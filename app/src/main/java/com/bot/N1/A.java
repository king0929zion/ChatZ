package N1;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    public static final A f3640c;

    /* renamed from: e, reason: collision with root package name */
    public static final A f3641e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ A[] f3642f;

                static {
        A r02 = new A();
        f3640c = r02;
        A r12 = new A();
        f3641e = r12;
        f3642f = new A[]{r02, r12, new Enum("EXCLUSIVE", 2)};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f3642f.clone();
    }
}
