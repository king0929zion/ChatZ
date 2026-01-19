package X0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f9128c;

    /* renamed from: e, reason: collision with root package name */
    public static final x f9129e;

    /* renamed from: f, reason: collision with root package name */
    public static final x f9130f;

    /* renamed from: g, reason: collision with root package name */
    public static final x f9131g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x[] f9132h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, X0.x] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, X0.x] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, X0.x] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, X0.x] */
    static {
        ?? r02 = new Enum("StartInput", 0);
        f9128c = r02;
        ?? r12 = new Enum("StopInput", 1);
        f9129e = r12;
        ?? r22 = new Enum("ShowKeyboard", 2);
        f9130f = r22;
        ?? r32 = new Enum("HideKeyboard", 3);
        f9131g = r32;
        f9132h = new x[]{r02, r12, r22, r32};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f9132h.clone();
    }
}
