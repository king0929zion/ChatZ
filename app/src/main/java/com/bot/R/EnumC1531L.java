package r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1531L {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1531L f14077c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1531L f14078e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1531L f14079f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1531L[] f14080g;

    /* JADX WARN: Type inference failed for: r0v0, types: [r.L, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [r.L, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r.L, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Yes", 0);
        f14077c = r02;
        ?? r12 = new Enum("No", 1);
        f14078e = r12;
        ?? r22 = new Enum("NotInitialized", 2);
        f14079f = r22;
        f14080g = new EnumC1531L[]{r02, r12, r22};
    }

    public static EnumC1531L valueOf(String str) {
        return (EnumC1531L) Enum.valueOf(EnumC1531L.class, str);
    }

    public static EnumC1531L[] values() {
        return (EnumC1531L[]) f14080g.clone();
    }
}
