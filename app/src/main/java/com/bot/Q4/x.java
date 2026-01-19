package Q4;

/* loaded from: classes.dex */
public final class x {
    public v a;

    /* renamed from: b, reason: collision with root package name */
    public u f6645b;

    /* renamed from: d, reason: collision with root package name */
    public String f6647d;

    /* renamed from: e, reason: collision with root package name */
    public l f6648e;

    /* renamed from: g, reason: collision with root package name */
    public A f6650g;

    /* renamed from: h, reason: collision with root package name */
    public y f6651h;

    /* renamed from: i, reason: collision with root package name */
    public y f6652i;

    /* renamed from: j, reason: collision with root package name */
    public y f6653j;

    /* renamed from: k, reason: collision with root package name */
    public long f6654k;

    /* renamed from: l, reason: collision with root package name */
    public long f6655l;

    /* renamed from: m, reason: collision with root package name */
    public B0.B f6656m;

    /* renamed from: c, reason: collision with root package name */
    public int f6646c = -1;

    /* renamed from: f, reason: collision with root package name */
    public m f6649f = new m(0);

    public static void b(y yVar, String str) {
        if (yVar != null) {
            if (yVar.f6663j != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (yVar.f6664k != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (yVar.f6665l != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (yVar.f6666m != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final y a() {
        int i6 = this.f6646c;
        if (i6 < 0) {
            throw new IllegalStateException(("code < 0: " + this.f6646c).toString());
        }
        v vVar = this.a;
        if (vVar == null) {
            throw new IllegalStateException("request == null");
        }
        u uVar = this.f6645b;
        if (uVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f6647d;
        if (str != null) {
            return new y(vVar, uVar, str, i6, this.f6648e, this.f6649f.d(), this.f6650g, this.f6651h, this.f6652i, this.f6653j, this.f6654k, this.f6655l, this.f6656m);
        }
        throw new IllegalStateException("message == null");
    }
}
