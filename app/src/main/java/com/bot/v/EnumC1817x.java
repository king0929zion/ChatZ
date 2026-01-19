package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1817x {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1817x f15365c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1817x f15366e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1817x f15367f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1817x[] f15368g;

    /* JADX WARN: Type inference failed for: r0v0, types: [v.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v.x, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.x, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Vertical", 0);
        f15365c = r02;
        ?? r12 = new Enum("Horizontal", 1);
        f15366e = r12;
        ?? r22 = new Enum("Both", 2);
        f15367f = r22;
        f15368g = new EnumC1817x[]{r02, r12, r22};
    }

    public static EnumC1817x valueOf(String str) {
        return (EnumC1817x) Enum.valueOf(EnumC1817x.class, str);
    }

    public static EnumC1817x[] values() {
        return (EnumC1817x[]) f15368g.clone();
    }
}
