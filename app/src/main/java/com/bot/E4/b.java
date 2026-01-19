package E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1343c;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1344e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f1345f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1346g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1347h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f1348i;

    /* JADX WARN: Type inference failed for: r0v0, types: [E4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [E4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [E4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [E4.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [E4.b, java.lang.Enum] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f1343c = r02;
        ?? r12 = new Enum("BLOCKING", 1);
        f1344e = r12;
        ?? r22 = new Enum("PARKING", 2);
        f1345f = r22;
        ?? r32 = new Enum("DORMANT", 3);
        f1346g = r32;
        ?? r42 = new Enum("TERMINATED", 4);
        f1347h = r42;
        f1348i = new b[]{r02, r12, r22, r32, r42};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1348i.clone();
    }
}
