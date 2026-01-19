package u4;

import m4.AbstractC1276k;

/* renamed from: u4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769g {

    /* renamed from: d, reason: collision with root package name */
    public static final C1769g f15180d;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final C1767e f15181b;

    /* renamed from: c, reason: collision with root package name */
    public final C1768f f15182c;

    static {
        C1767e c1767e = C1767e.a;
        C1768f c1768f = C1768f.f15179b;
        f15180d = new C1769g(false, c1767e, c1768f);
        new C1769g(true, c1767e, c1768f);
    }

    public C1769g(boolean z5, C1767e c1767e, C1768f c1768f) {
        AbstractC1276k.f(c1767e, "bytes");
        AbstractC1276k.f(c1768f, "number");
        this.a = z5;
        this.f15181b = c1767e;
        this.f15182c = c1768f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.f15181b.a("        ", sb);
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f15182c.a("        ", sb);
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
