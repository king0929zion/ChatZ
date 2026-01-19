package N1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    public static final A f3640c;

    /* renamed from: e, reason: collision with root package name */
    public static final A f3641e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ A[] f3642f;

    /* JADX WARN: Type inference failed for: r0v0, types: [N1.A, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [N1.A, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [N1.A, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFERRED", 0);
        f3640c = r02;
        ?? r12 = new Enum("IMMEDIATE", 1);
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
