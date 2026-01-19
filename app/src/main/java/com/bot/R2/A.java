package R2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    public static final A f6854c;

    /* renamed from: e, reason: collision with root package name */
    public static final A f6855e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ A[] f6856f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, R2.A] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, R2.A] */
    static {
        ?? r02 = new Enum("Normal", 0);
        f6854c = r02;
        ?? r12 = new Enum("Expanded", 1);
        f6855e = r12;
        f6856f = new A[]{r02, r12};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f6856f.clone();
    }
}
