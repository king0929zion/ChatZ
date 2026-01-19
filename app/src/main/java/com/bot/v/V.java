package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class V {

    /* renamed from: c, reason: collision with root package name */
    public static final V f15272c;

    /* renamed from: e, reason: collision with root package name */
    public static final V f15273e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ V[] f15274f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v.V] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v.V] */
    static {
        ?? r02 = new Enum("Min", 0);
        f15272c = r02;
        ?? r12 = new Enum("Max", 1);
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
