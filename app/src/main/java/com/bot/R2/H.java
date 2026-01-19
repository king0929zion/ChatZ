package R2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    public static final H f6896c;

    /* renamed from: e, reason: collision with root package name */
    public static final H f6897e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ H[] f6898f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, R2.H] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, R2.H] */
    static {
        ?? r02 = new Enum("Closed", 0);
        f6896c = r02;
        ?? r12 = new Enum("Open", 1);
        f6897e = r12;
        f6898f = new H[]{r02, r12};
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f6898f.clone();
    }
}
