package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: c, reason: collision with root package name */
    public static final F f1696c;

    /* renamed from: e, reason: collision with root package name */
    public static final F f1697e;

    /* renamed from: f, reason: collision with root package name */
    public static final F f1698f;

    /* renamed from: g, reason: collision with root package name */
    public static final F f1699g;

    /* renamed from: h, reason: collision with root package name */
    public static final F f1700h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ F[] f1701i;

    /* JADX WARN: Type inference failed for: r0v0, types: [H0.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [H0.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [H0.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [H0.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [H0.F, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Measuring", 0);
        f1696c = r02;
        ?? r12 = new Enum("LookaheadMeasuring", 1);
        f1697e = r12;
        ?? r22 = new Enum("LayingOut", 2);
        f1698f = r22;
        ?? r32 = new Enum("LookaheadLayingOut", 3);
        f1699g = r32;
        ?? r42 = new Enum("Idle", 4);
        f1700h = r42;
        f1701i = new F[]{r02, r12, r22, r32, r42};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f1701i.clone();
    }
}
