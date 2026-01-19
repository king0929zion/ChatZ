package P2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: P2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0356h {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0356h f4933c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0356h f4934e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0356h f4935f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0356h[] f4936g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, P2.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, P2.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, P2.h] */
    static {
        ?? r02 = new Enum("Disabled", 0);
        f4933c = r02;
        ?? r12 = new Enum("Follow", 1);
        f4934e = r12;
        ?? r22 = new Enum("ManualOnce", 2);
        f4935f = r22;
        f4936g = new EnumC0356h[]{r02, r12, r22};
    }

    public static EnumC0356h valueOf(String str) {
        return (EnumC0356h) Enum.valueOf(EnumC0356h.class, str);
    }

    public static EnumC0356h[] values() {
        return (EnumC0356h[]) f4936g.clone();
    }
}
