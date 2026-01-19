package L2;

import org.jsoup.nodes.DocumentType;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3069c;

    /* renamed from: e, reason: collision with root package name */
    public static final d f3070e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f3071f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ d[] f3072g;

                static {
        d r02 = new d();
        f3069c = r02;
        d r12 = new d();
        f3070e = r12;
        Enum r22 = new Enum(DocumentType.SYSTEM_KEY, 2);
        f3071f = r22;
        f3072g = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3072g.clone();
    }
}
