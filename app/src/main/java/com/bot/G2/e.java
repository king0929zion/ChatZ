package G2;

import org.jsoup.nodes.DocumentType;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f1658c;

    /* renamed from: e, reason: collision with root package name */
    public static final e f1659e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f1660f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e[] f1661g;

                static {
        Enum r02 = new Enum(DocumentType.SYSTEM_KEY, 0);
        f1658c = r02;
        e r12 = new e();
        f1659e = r12;
        e r22 = new e();
        f1660f = r22;
        f1661g = new e[]{r02, r12, r22};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1661g.clone();
    }
}
