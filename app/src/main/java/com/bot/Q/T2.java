package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class T2 {

    /* renamed from: c, reason: collision with root package name */
    public static final T2 f5525c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ T2[] f5526e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Q.T2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Q.T2] */
    static {
        ?? r02 = new Enum("Dismissed", 0);
        f5525c = r02;
        f5526e = new T2[]{r02, new Enum("ActionPerformed", 1)};
    }

    public static T2 valueOf(String str) {
        return (T2) Enum.valueOf(T2.class, str);
    }

    public static T2[] values() {
        return (T2[]) f5526e.clone();
    }
}
