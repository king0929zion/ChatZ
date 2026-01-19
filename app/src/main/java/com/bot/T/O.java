package T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: c, reason: collision with root package name */
    public static final O f8012c;

    /* renamed from: e, reason: collision with root package name */
    public static final O f8013e;

    /* renamed from: f, reason: collision with root package name */
    public static final O f8014f;

    /* renamed from: g, reason: collision with root package name */
    public static final O f8015g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ O[] f8016h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, T.O] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, T.O] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, T.O] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, T.O] */
    static {
        ?? r02 = new Enum("IGNORED", 0);
        f8012c = r02;
        ?? r12 = new Enum("SCHEDULED", 1);
        f8013e = r12;
        ?? r22 = new Enum("DEFERRED", 2);
        f8014f = r22;
        ?? r32 = new Enum("IMMINENT", 3);
        f8015g = r32;
        f8016h = new O[]{r02, r12, r22, r32};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f8016h.clone();
    }
}
