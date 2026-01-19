package Q4;

import B0.H;
import F0.F;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class s {
    public H a = new H();

    /* renamed from: b, reason: collision with root package name */
    public A3.c f6575b = new A3.c(20, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6576c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6577d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public F f6578e = new F(2);

    /* renamed from: f, reason: collision with root package name */
    public boolean f6579f = true;

    /* renamed from: g, reason: collision with root package name */
    public C0494b f6580g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6581h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6582i;

    /* renamed from: j, reason: collision with root package name */
    public C0494b f6583j;

    /* renamed from: k, reason: collision with root package name */
    public C0494b f6584k;

    /* renamed from: l, reason: collision with root package name */
    public ProxySelector f6585l;

    /* renamed from: m, reason: collision with root package name */
    public C0494b f6586m;

    /* renamed from: n, reason: collision with root package name */
    public SocketFactory f6587n;

    /* renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f6588o;

    /* renamed from: p, reason: collision with root package name */
    public X509TrustManager f6589p;

    /* renamed from: q, reason: collision with root package name */
    public List f6590q;

    /* renamed from: r, reason: collision with root package name */
    public List f6591r;

    /* renamed from: s, reason: collision with root package name */
    public c5.c f6592s;

    /* renamed from: t, reason: collision with root package name */
    public f f6593t;

    /* renamed from: u, reason: collision with root package name */
    public Y4.l f6594u;

    /* renamed from: v, reason: collision with root package name */
    public int f6595v;

    /* renamed from: w, reason: collision with root package name */
    public int f6596w;

    /* renamed from: x, reason: collision with root package name */
    public int f6597x;

    /* renamed from: y, reason: collision with root package name */
    public long f6598y;

    /* renamed from: z, reason: collision with root package name */
    public A3.c f6599z;

    public s() {
        C0494b c0494b = C0494b.a;
        this.f6580g = c0494b;
        this.f6581h = true;
        this.f6582i = true;
        this.f6583j = C0494b.f6496b;
        this.f6584k = C0494b.f6497c;
        this.f6586m = c0494b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC1276k.e(socketFactory, "getDefault()");
        this.f6587n = socketFactory;
        this.f6590q = t.f6601E;
        this.f6591r = t.f6600D;
        this.f6592s = c5.c.a;
        this.f6593t = f.f6512c;
        this.f6595v = 10000;
        this.f6596w = 10000;
        this.f6597x = 10000;
        this.f6598y = 1024L;
    }
}
