package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f13823c;

    /* renamed from: e, reason: collision with root package name */
    public static final x0 f13824e;

    /* renamed from: f, reason: collision with root package name */
    public static final x0 f13825f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x0[] f13826g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p.x0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p.x0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, p.x0] */
    static {
        ?? r02 = new Enum("Default", 0);
        f13823c = r02;
        ?? r12 = new Enum("UserInput", 1);
        f13824e = r12;
        ?? r22 = new Enum("PreventUserInput", 2);
        f13825f = r22;
        f13826g = new x0[]{r02, r12, r22};
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f13826g.clone();
    }
}
