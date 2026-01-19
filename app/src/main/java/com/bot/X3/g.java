package X3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final g f9390c;

    /* renamed from: e, reason: collision with root package name */
    public static final g f9391e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ g[] f9392f;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, X3.g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, X3.g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, X3.g] */
    static {
        ?? r02 = new Enum("SYNCHRONIZED", 0);
        ?? r12 = new Enum("PUBLICATION", 1);
        f9390c = r12;
        ?? r22 = new Enum("NONE", 2);
        f9391e = r22;
        f9392f = new g[]{r02, r12, r22};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f9392f.clone();
    }
}
