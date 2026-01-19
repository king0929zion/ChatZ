package y;

import T.C0607g0;
import com.vladsch.flexmark.util.format.TableCell;
import n.AbstractC1318d;
import n.C1316c;
import n.InterfaceC1351z;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: y.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1948E {

    /* renamed from: s, reason: collision with root package name */
    public static final long f15755s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f15756t = 0;
    public final InterfaceC1942y a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.w f15757b;

    /* renamed from: c, reason: collision with root package name */
    public final Y3.l f15758c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1351z f15759d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1351z f15760e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1351z f15761f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15762g;

    /* renamed from: h, reason: collision with root package name */
    public final C0607g0 f15763h;

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f15764i;

    /* renamed from: j, reason: collision with root package name */
    public final C0607g0 f15765j;

    /* renamed from: k, reason: collision with root package name */
    public final C0607g0 f15766k;

    /* renamed from: l, reason: collision with root package name */
    public long f15767l;

    /* renamed from: m, reason: collision with root package name */
    public long f15768m;

    /* renamed from: n, reason: collision with root package name */
    public r0.b f15769n;

    /* renamed from: o, reason: collision with root package name */
    public final C1316c f15770o;

    /* renamed from: p, reason: collision with root package name */
    public final C1316c f15771p;

    /* renamed from: q, reason: collision with root package name */
    public final C0607g0 f15772q;

    /* renamed from: r, reason: collision with root package name */
    public long f15773r;

    static {
        long j3 = TableCell.NOT_TRACKED;
        f15755s = (j3 & 4294967295L) | (j3 << 32);
    }

    public C1948E(InterfaceC1942y interfaceC1942y, o0.w wVar, Y3.l lVar) {
        this.a = interfaceC1942y;
        this.f15757b = wVar;
        this.f15758c = lVar;
        Boolean bool = Boolean.FALSE;
        this.f15763h = T.r.A(bool);
        this.f15764i = T.r.A(bool);
        this.f15765j = T.r.A(bool);
        this.f15766k = T.r.A(bool);
        long j3 = f15755s;
        this.f15767l = j3;
        this.f15768m = 0L;
        this.f15769n = wVar != null ? wVar.b() : null;
        this.f15770o = new C1316c(new e1.j(0L), AbstractC1318d.f13120p, null, 12);
        this.f15771p = new C1316c(Float.valueOf(1.0f), AbstractC1318d.f13114j, null, 12);
        this.f15772q = T.r.A(new e1.j(0L));
        this.f15773r = j3;
    }

    public final void a() {
        r0.b bVar = this.f15769n;
        InterfaceC1351z interfaceC1351z = this.f15759d;
        boolean booleanValue = ((Boolean) this.f15764i.getValue()).booleanValue();
        InterfaceC1942y interfaceC1942y = this.a;
        if (booleanValue || interfaceC1351z == null || bVar == null) {
            if (b()) {
                if (bVar != null) {
                    bVar.f(1.0f);
                }
                AbstractC1888A.y(interfaceC1942y, null, new C1981v(this, null), 3);
                return;
            }
            return;
        }
        d(true);
        boolean b5 = b();
        boolean z5 = !b5;
        if (!b5) {
            bVar.f(S.l.f7374V);
        }
        AbstractC1888A.y(interfaceC1942y, null, new C1983x(z5, this, interfaceC1351z, bVar, null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.f15765j.getValue()).booleanValue();
    }

    public final void c() {
        o0.w wVar;
        boolean booleanValue = ((Boolean) this.f15763h.getValue()).booleanValue();
        InterfaceC1942y interfaceC1942y = this.a;
        if (booleanValue) {
            f(false);
            AbstractC1888A.y(interfaceC1942y, null, new C1945B(this, null), 3);
        }
        if (((Boolean) this.f15764i.getValue()).booleanValue()) {
            d(false);
            AbstractC1888A.y(interfaceC1942y, null, new C1946C(this, null), 3);
        }
        if (b()) {
            e(false);
            AbstractC1888A.y(interfaceC1942y, null, new C1947D(this, null), 3);
        }
        this.f15762g = false;
        g(0L);
        this.f15767l = f15755s;
        r0.b bVar = this.f15769n;
        if (bVar != null && (wVar = this.f15757b) != null) {
            wVar.a(bVar);
        }
        this.f15769n = null;
        this.f15759d = null;
        this.f15761f = null;
        this.f15760e = null;
    }

    public final void d(boolean z5) {
        this.f15764i.setValue(Boolean.valueOf(z5));
    }

    public final void e(boolean z5) {
        this.f15765j.setValue(Boolean.valueOf(z5));
    }

    public final void f(boolean z5) {
        this.f15763h.setValue(Boolean.valueOf(z5));
    }

    public final void g(long j3) {
        this.f15772q.setValue(new e1.j(j3));
    }
}
