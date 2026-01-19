package Q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Q.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0417g2 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0417g2 f5819c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0417g2 f5820e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0417g2[] f5821f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Q.g2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Q.g2] */
    static {
        ?? r02 = new Enum("THUMB", 0);
        f5819c = r02;
        ?? r12 = new Enum("TRACK", 1);
        f5820e = r12;
        f5821f = new EnumC0417g2[]{r02, r12};
    }

    public static EnumC0417g2 valueOf(String str) {
        return (EnumC0417g2) Enum.valueOf(EnumC0417g2.class, str);
    }

    public static EnumC0417g2[] values() {
        return (EnumC0417g2[]) f5821f.clone();
    }
}
