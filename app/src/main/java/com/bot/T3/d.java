package t3;

import B0.C0031g;
import B3.m;
import N3.j;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m4.AbstractC1276k;
import x3.C1883g;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;
import x4.g0;
import z3.AbstractC2039i;
import z3.AbstractC2049t;
import z3.C2023A;
import z3.C2025C;
import z3.C2032b;
import z3.J;
import z3.r;
import z3.v;
import z3.x;

/* loaded from: classes.dex */
public final class d implements InterfaceC1942y, Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14920o = AtomicIntegerFieldUpdater.newUpdater(d.class, "closed");

    /* renamed from: c, reason: collision with root package name */
    public final C1883g f14921c;
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14922e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f14923f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0910h f14924g;

    /* renamed from: h, reason: collision with root package name */
    public final E3.f f14925h;

    /* renamed from: i, reason: collision with root package name */
    public final F3.b f14926i;

    /* renamed from: j, reason: collision with root package name */
    public final E3.f f14927j;

    /* renamed from: k, reason: collision with root package name */
    public final F3.b f14928k;

    /* renamed from: l, reason: collision with root package name */
    public final j f14929l;

    /* renamed from: m, reason: collision with root package name */
    public final A3.c f14930m;

    /* renamed from: n, reason: collision with root package name */
    public final f f14931n;

    public d(C1883g c1883g, f fVar) {
        this.f14921c = c1883g;
        g0 g0Var = new g0((InterfaceC1922e0) c1883g.f15623j.r(C1940w.f15731e));
        this.f14923f = g0Var;
        this.f14924g = c1883g.f15623j.Y(g0Var);
        this.f14925h = new E3.f(fVar.f14938g, 0);
        int i6 = 1;
        this.f14926i = new F3.b(fVar.f14938g, 1);
        E3.f fVar2 = new E3.f(fVar.f14938g, 1);
        this.f14927j = fVar2;
        this.f14928k = new F3.b(fVar.f14938g, 0);
        this.f14929l = new j();
        this.f14930m = new A3.c(6, (byte) 0);
        f fVar3 = new f();
        this.f14931n = fVar3;
        if (this.f14922e) {
            g0Var.S(new C1726a(this));
        }
        InterfaceC0905c interfaceC0905c = null;
        fVar2.f(E3.f.f1324o, new m(this, c1883g, interfaceC0905c, i6));
        fVar2.f(E3.f.f1325p, new A3.f(this, interfaceC0905c, 5));
        B3.j jVar = C2025C.a;
        C1727b c1727b = C1727b.f14915h;
        fVar3.a(jVar, c1727b);
        fVar3.a(C2032b.a, c1727b);
        if (fVar.f14937f) {
            fVar3.f14934c.put("DefaultTransformers", C1727b.f14913f);
        }
        fVar3.a(J.f16246b, c1727b);
        B3.j jVar2 = r.f16298d;
        fVar3.a(jVar2, c1727b);
        if (fVar.f14936e) {
            fVar3.a(C2023A.a, c1727b);
        }
        fVar3.f14936e = fVar.f14936e;
        fVar3.f14937f = fVar.f14937f;
        fVar3.a.putAll(fVar.a);
        fVar3.f14933b.putAll(fVar.f14933b);
        fVar3.f14934c.putAll(fVar.f14934c);
        if (fVar.f14937f) {
            fVar3.a(x.f16312d, c1727b);
        }
        N3.a aVar = AbstractC2039i.a;
        C0031g c0031g = new C0031g(fVar3, i6);
        f5.a aVar2 = AbstractC2049t.a;
        fVar3.a(jVar2, c0031g);
        Iterator it = fVar3.a.values().iterator();
        while (it.hasNext()) {
            ((l4.c) it.next()).f(this);
        }
        Iterator it2 = fVar3.f14934c.values().iterator();
        while (it2.hasNext()) {
            ((l4.c) it2.next()).f(this);
        }
        this.f14926i.f(F3.b.f1580j, new A3.e(this, interfaceC0905c, 3));
        this.f14922e = true;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f14924g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f14920o.compareAndSet(this, 0, 1)) {
            j jVar = (j) this.f14929l.c(v.a);
            for (N3.a aVar : Y3.m.J0(jVar.d().keySet())) {
                AbstractC1276k.d(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object c6 = jVar.c(aVar);
                if (c6 instanceof Closeable) {
                    ((Closeable) c6).close();
                }
            }
            this.f14923f.n0();
            if (this.f14922e) {
                this.f14921c.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(E3.d r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t3.C1728c
            if (r0 == 0) goto L13
            r0 = r6
            t3.c r0 = (t3.C1728c) r0
            int r1 = r0.f14919i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14919i = r1
            goto L18
        L13:
            t3.c r0 = new t3.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14917g
            int r1 = r0.f14919i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r6)
            goto L46
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r6)
            A3.c r6 = r4.f14930m
            F2.h r1 = G3.b.a
            r6.p(r1)
            java.lang.Object r6 = r5.f1307d
            r0.f14919i = r2
            E3.f r1 = r4.f14925h
            java.lang.Object r6 = r1.a(r5, r6, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r6 != r5) goto L46
            return r5
        L46:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            m4.AbstractC1276k.d(r6, r5)
            u3.c r6 = (u3.C1759c) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.d.d(E3.d, d4.c):java.lang.Object");
    }

    public final String toString() {
        return "HttpClient[" + this.f14921c + ']';
    }
}
