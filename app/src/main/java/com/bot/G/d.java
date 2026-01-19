package G;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public final String f1637b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1638c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.c f1639d;

    public d(Object obj, String str, int i6, l4.c cVar) {
        super(obj);
        this.f1637b = str;
        this.f1638c = i6;
        this.f1639d = cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.f1637b);
        sb.append("\", leadingIcon=");
        return B3.e.q(sb, this.f1638c, ')');
    }
}
