package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    public static final E f382c;

    /* renamed from: e, reason: collision with root package name */
    public static final E f383e;

    /* renamed from: f, reason: collision with root package name */
    public static final E f384f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ E[] f385g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, B0.E] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, B0.E] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, B0.E] */
    static {
        ?? r02 = new Enum("Unknown", 0);
        f382c = r02;
        ?? r12 = new Enum("Dispatching", 1);
        f383e = r12;
        ?? r22 = new Enum("NotDispatching", 2);
        f384f = r22;
        f385g = new E[]{r02, r12, r22};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f385g.clone();
    }
}
