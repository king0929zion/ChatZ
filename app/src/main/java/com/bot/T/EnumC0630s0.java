package T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: T.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0630s0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0630s0 f8205c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0630s0 f8206e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0630s0 f8207f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0630s0 f8208g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0630s0 f8209h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0630s0 f8210i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ EnumC0630s0[] f8211j;

    /* JADX WARN: Type inference failed for: r0v0, types: [T.s0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T.s0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T.s0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T.s0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T.s0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T.s0, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ShutDown", 0);
        f8205c = r02;
        ?? r12 = new Enum("ShuttingDown", 1);
        f8206e = r12;
        ?? r22 = new Enum("Inactive", 2);
        f8207f = r22;
        ?? r32 = new Enum("InactivePendingWork", 3);
        f8208g = r32;
        ?? r42 = new Enum("Idle", 4);
        f8209h = r42;
        ?? r5 = new Enum("PendingWork", 5);
        f8210i = r5;
        f8211j = new EnumC0630s0[]{r02, r12, r22, r32, r42, r5};
    }

    public static EnumC0630s0 valueOf(String str) {
        return (EnumC0630s0) Enum.valueOf(EnumC0630s0.class, str);
    }

    public static EnumC0630s0[] values() {
        return (EnumC0630s0[]) f8211j.clone();
    }
}
