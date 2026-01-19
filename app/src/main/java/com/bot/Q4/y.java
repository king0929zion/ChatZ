package Q4;

import java.io.Closeable;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: c, reason: collision with root package name */
    public final v f6657c;

    /* renamed from: e, reason: collision with root package name */
    public final u f6658e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6659f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6660g;

    /* renamed from: h, reason: collision with root package name */
    public final l f6661h;

    /* renamed from: i, reason: collision with root package name */
    public final n f6662i;

    /* renamed from: j, reason: collision with root package name */
    public final A f6663j;

    /* renamed from: k, reason: collision with root package name */
    public final y f6664k;

    /* renamed from: l, reason: collision with root package name */
    public final y f6665l;

    /* renamed from: m, reason: collision with root package name */
    public final y f6666m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6667n;

    /* renamed from: o, reason: collision with root package name */
    public final long f6668o;

    /* renamed from: p, reason: collision with root package name */
    public final B0.B f6669p;

    /* renamed from: q, reason: collision with root package name */
    public C0495c f6670q;

    public y(v vVar, u uVar, String str, int i6, l lVar, n nVar, A a, y yVar, y yVar2, y yVar3, long j3, long j4, B0.B b5) {
        AbstractC1276k.f(vVar, "request");
        AbstractC1276k.f(uVar, "protocol");
        AbstractC1276k.f(str, "message");
        this.f6657c = vVar;
        this.f6658e = uVar;
        this.f6659f = str;
        this.f6660g = i6;
        this.f6661h = lVar;
        this.f6662i = nVar;
        this.f6663j = a;
        this.f6664k = yVar;
        this.f6665l = yVar2;
        this.f6666m = yVar3;
        this.f6667n = j3;
        this.f6668o = j4;
        this.f6669p = b5;
    }

    public static String c(y yVar, String str) {
        yVar.getClass();
        String a = yVar.f6662i.a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A a = this.f6663j;
        if (a == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        a.close();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q4.x, java.lang.Object] */
    public final x d() {
        ?? obj = new Object();
        obj.a = this.f6657c;
        obj.f6645b = this.f6658e;
        obj.f6646c = this.f6660g;
        obj.f6647d = this.f6659f;
        obj.f6648e = this.f6661h;
        obj.f6649f = this.f6662i.c();
        obj.f6650g = this.f6663j;
        obj.f6651h = this.f6664k;
        obj.f6652i = this.f6665l;
        obj.f6653j = this.f6666m;
        obj.f6654k = this.f6667n;
        obj.f6655l = this.f6668o;
        obj.f6656m = this.f6669p;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f6658e + ", code=" + this.f6660g + ", message=" + this.f6659f + ", url=" + ((p) this.f6657c.f6637c) + '}';
    }
}
