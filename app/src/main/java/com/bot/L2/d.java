package L2;

import org.jsoup.nodes.DocumentType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, L2.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, L2.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, L2.d] */
    static {
        ?? r02 = new Enum("USER", 0);
        f3069c = r02;
        ?? r12 = new Enum("ASSISTANT", 1);
        f3070e = r12;
        ?? r22 = new Enum(DocumentType.SYSTEM_KEY, 2);
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
