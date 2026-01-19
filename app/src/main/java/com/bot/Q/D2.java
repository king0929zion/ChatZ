package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class D2 {

    /* renamed from: c, reason: collision with root package name */
    public static final D2 f5208c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ D2[] f5209e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Q.D2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Q.D2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Q.D2] */
    static {
        ?? r02 = new Enum("Short", 0);
        f5208c = r02;
        f5209e = new D2[]{r02, new Enum("Long", 1), new Enum("Indefinite", 2)};
    }

    public static D2 valueOf(String str) {
        return (D2) Enum.valueOf(D2.class, str);
    }

    public static D2[] values() {
        return (D2[]) f5209e.clone();
    }
}
