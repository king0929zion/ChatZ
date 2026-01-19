package F3;

import I3.m;
import I3.v;
import I3.w;
import b4.InterfaceC0910h;
import i1.AbstractC1087g;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import io.ktor.utils.io.y;
import u3.C1759c;
import u3.C1762f;
import x3.C1885i;
import x4.AbstractC1888A;
import x4.g0;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1568c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final w f1569e;

    /* renamed from: f, reason: collision with root package name */
    public final v f1570f;

    /* renamed from: g, reason: collision with root package name */
    public final P3.b f1571g;

    /* renamed from: h, reason: collision with root package name */
    public final P3.b f1572h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0910h f1573i;

    /* renamed from: j, reason: collision with root package name */
    public final C1759c f1574j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1575k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1576l;

    public a(C1759c c1759c, E3.g gVar) {
        this.f1574j = c1759c;
        this.f1573i = gVar.f1332f;
        this.f1569e = gVar.a;
        this.f1570f = gVar.f1330d;
        this.f1571g = gVar.f1328b;
        this.f1572h = gVar.f1333g;
        Object obj = gVar.f1331e;
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            y.a.getClass();
            yVar = (y) x.f12290b.getValue();
        }
        this.f1575k = yVar;
        this.f1576l = gVar.f1329c;
    }

    @Override // I3.s
    public final m a() {
        switch (this.f1568c) {
            case 0:
                return (C1885i) this.f1576l;
            default:
                return (m) this.f1575k;
        }
    }

    @Override // F3.c
    public final C1759c b() {
        switch (this.f1568c) {
            case 0:
                return this.f1574j;
            default:
                return (C1762f) this.f1574j;
        }
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        switch (this.f1568c) {
            case 0:
                return this.f1573i;
            default:
                return this.f1573i;
        }
    }

    @Override // F3.c
    public final y d() {
        switch (this.f1568c) {
            case 0:
                return (y) this.f1575k;
            default:
                return (t) this.f1576l;
        }
    }

    @Override // F3.c
    public final P3.b e() {
        switch (this.f1568c) {
            case 0:
                return this.f1571g;
            default:
                return this.f1571g;
        }
    }

    @Override // F3.c
    public final P3.b f() {
        switch (this.f1568c) {
            case 0:
                return this.f1572h;
            default:
                return this.f1572h;
        }
    }

    @Override // F3.c
    public final w g() {
        switch (this.f1568c) {
            case 0:
                return this.f1569e;
            default:
                return this.f1569e;
        }
    }

    @Override // F3.c
    public final v h() {
        switch (this.f1568c) {
            case 0:
                return this.f1570f;
            default:
                return this.f1570f;
        }
    }

    public a(C1762f c1762f, byte[] bArr, c cVar) {
        this.f1574j = c1762f;
        g0 d6 = AbstractC1888A.d();
        this.f1569e = cVar.g();
        this.f1570f = cVar.h();
        this.f1571g = cVar.e();
        this.f1572h = cVar.f();
        this.f1575k = cVar.a();
        this.f1573i = cVar.c().Y(d6);
        this.f1576l = AbstractC1087g.b(bArr);
    }
}
