package G2;

import org.jsoup.nodes.DocumentType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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

    /* JADX WARN: Type inference failed for: r0v0, types: [G2.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [G2.e, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [G2.e, java.lang.Enum] */
    static {
        ?? r02 = new Enum(DocumentType.SYSTEM_KEY, 0);
        f1658c = r02;
        ?? r12 = new Enum("LIGHT", 1);
        f1659e = r12;
        ?? r22 = new Enum("DARK", 2);
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
