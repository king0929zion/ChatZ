package R;

import O.x0;
import Q.EnumC0409e2;
import T.C0599c0;
import T.C0602e;
import T.C0607g0;
import i4.AbstractC1117a;
import java.util.Collection;
import java.util.Iterator;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: R.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513s {
    public final x0 a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1193a f6825b;

    /* renamed from: c, reason: collision with root package name */
    public final A.b f6826c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.c f6827d;

    /* renamed from: g, reason: collision with root package name */
    public final C0607g0 f6830g;

    /* renamed from: k, reason: collision with root package name */
    public final C0599c0 f6834k;

    /* renamed from: l, reason: collision with root package name */
    public final C0607g0 f6835l;

    /* renamed from: m, reason: collision with root package name */
    public final C0607g0 f6836m;

    /* renamed from: n, reason: collision with root package name */
    public final r f6837n;

    /* renamed from: e, reason: collision with root package name */
    public final Q f6828e = new Q();

    /* renamed from: f, reason: collision with root package name */
    public final M.q f6829f = new M.q(this);

    /* renamed from: h, reason: collision with root package name */
    public final T.E f6831h = T.r.s(new C0508m(this, 0));

    /* renamed from: i, reason: collision with root package name */
    public final T.E f6832i = T.r.s(new C0508m(this, 1));

    /* renamed from: j, reason: collision with root package name */
    public final C0599c0 f6833j = new C0599c0(Float.NaN);

    public C0513s(EnumC0409e2 enumC0409e2, x0 x0Var, InterfaceC1193a interfaceC1193a, A.b bVar, l4.c cVar) {
        this.a = x0Var;
        this.f6825b = interfaceC1193a;
        this.f6826c = bVar;
        this.f6827d = cVar;
        this.f6830g = T.r.A(enumC0409e2);
        T.r.r(C0602e.f8083j, new C0508m(this, 2));
        this.f6834k = new C0599c0(S.l.f7374V);
        this.f6835l = T.r.A(null);
        this.f6836m = T.r.A(new W(Y3.w.f9813c));
        this.f6837n = new r(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, p.x0 r14, l4.g r15, d4.c r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r2 = r0 instanceof R.C0511p
            if (r2 == 0) goto L16
            r2 = r0
            R.p r2 = (R.C0511p) r2
            int r3 = r2.f6820i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f6820i = r3
        L14:
            r6 = r2
            goto L1c
        L16:
            R.p r2 = new R.p
            r2.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f6818g
            int r2 = r6.f6820i
            T.c0 r7 = r12.f6833j
            l4.c r8 = r12.f6827d
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r10) goto L32
            X3.a.e(r0)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r0 = move-exception
            goto L9d
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3a:
            X3.a.e(r0)
            R.W r0 = r12.d()
            java.util.Map r0 = r0.a
            boolean r0 = r0.containsKey(r13)
            if (r0 == 0) goto Ld3
            R.Q r11 = r12.f6828e     // Catch: java.lang.Throwable -> L30
            I2.u r0 = new I2.u     // Catch: java.lang.Throwable -> L30
            r5 = 2
            r1 = r12
            r2 = r13
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L30
            r6.f6820i = r10     // Catch: java.lang.Throwable -> L30
            r11.getClass()     // Catch: java.lang.Throwable -> L30
            R.P r2 = new R.P     // Catch: java.lang.Throwable -> L30
            r2.<init>(r14, r11, r0, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = x4.AbstractC1888A.l(r2, r6)     // Catch: java.lang.Throwable -> L30
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r0 != r2) goto L67
            return r2
        L67:
            r12.h(r4)
            R.W r0 = r12.d()
            float r2 = r7.g()
            java.lang.Object r0 = r0.a(r2)
            if (r0 == 0) goto Ld6
            float r2 = r7.g()
            R.W r3 = r12.d()
            float r3 = r3.d(r0)
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto Ld6
            java.lang.Object r2 = r8.f(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Ld6
            r12.g(r0)
            goto Ld6
        L9d:
            r12.h(r4)
            R.W r2 = r12.d()
            float r3 = r7.g()
            java.lang.Object r2 = r2.a(r3)
            if (r2 == 0) goto Ld2
            float r3 = r7.g()
            R.W r4 = r12.d()
            float r4 = r4.d(r2)
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto Ld2
            java.lang.Object r3 = r8.f(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Ld2
            r12.g(r2)
        Ld2:
            throw r0
        Ld3:
            r12.g(r13)
        Ld6:
            X3.y r0 = X3.y.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R.C0513s.a(java.lang.Object, p.x0, l4.g, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p.x0 r9, A3.e r10, d4.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof R.C0509n
            if (r0 == 0) goto L13
            r0 = r11
            R.n r0 = (R.C0509n) r0
            int r1 = r0.f6812i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6812i = r1
            goto L18
        L13:
            R.n r0 = new R.n
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f6810g
            int r1 = r0.f6812i
            T.c0 r2 = r8.f6833j
            l4.c r3 = r8.f6827d
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 != r5) goto L2d
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r9 = move-exception
            goto L89
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            X3.a.e(r11)
            R.Q r11 = r8.f6828e     // Catch: java.lang.Throwable -> L2b
            A4.n r1 = new A4.n     // Catch: java.lang.Throwable -> L2b
            r6 = 3
            r7 = 0
            r1.<init>(r8, r10, r7, r6)     // Catch: java.lang.Throwable -> L2b
            r0.f6812i = r5     // Catch: java.lang.Throwable -> L2b
            r11.getClass()     // Catch: java.lang.Throwable -> L2b
            R.P r10 = new R.P     // Catch: java.lang.Throwable -> L2b
            r10.<init>(r9, r11, r1, r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r9 = x4.AbstractC1888A.l(r10, r0)     // Catch: java.lang.Throwable -> L2b
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r9 != r10) goto L54
            return r10
        L54:
            R.W r9 = r8.d()
            float r10 = r2.g()
            java.lang.Object r9 = r9.a(r10)
            if (r9 == 0) goto L86
            float r10 = r2.g()
            R.W r11 = r8.d()
            float r11 = r11.d(r9)
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto L86
            java.lang.Object r10 = r3.f(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L86
            r8.g(r9)
        L86:
            X3.y r9 = X3.y.a
            return r9
        L89:
            R.W r10 = r8.d()
            float r11 = r2.g()
            java.lang.Object r10 = r10.a(r11)
            if (r10 == 0) goto Lbb
            float r11 = r2.g()
            R.W r0 = r8.d()
            float r0 = r0.d(r10)
            float r11 = r11 - r0
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 > 0) goto Lbb
            java.lang.Object r11 = r3.f(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lbb
            r8.g(r10)
        Lbb:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: R.C0513s.b(p.x0, A3.e, d4.c):java.lang.Object");
    }

    public final Object c(float f6, float f7, Object obj) {
        W d6 = d();
        float d7 = d6.d(obj);
        float floatValue = ((Number) this.f6825b.b()).floatValue();
        if (d7 != f6 && !Float.isNaN(d7)) {
            x0 x0Var = this.a;
            if (d7 < f6) {
                if (f7 >= floatValue) {
                    Object b5 = d6.b(f6, true);
                    AbstractC1276k.c(b5);
                    return b5;
                }
                Object b6 = d6.b(f6, true);
                AbstractC1276k.c(b6);
                if (f6 >= Math.abs(Math.abs(((Number) x0Var.f(Float.valueOf(Math.abs(d6.d(b6) - d7)))).floatValue()) + d7)) {
                    return b6;
                }
            } else {
                if (f7 <= (-floatValue)) {
                    Object b7 = d6.b(f6, false);
                    AbstractC1276k.c(b7);
                    return b7;
                }
                Object b8 = d6.b(f6, false);
                AbstractC1276k.c(b8);
                float abs = Math.abs(d7 - Math.abs(((Number) x0Var.f(Float.valueOf(Math.abs(d7 - d6.d(b8))))).floatValue()));
                if (f6 >= S.l.f7374V ? f6 <= abs : Math.abs(f6) >= abs) {
                    return b8;
                }
            }
        }
        return obj;
    }

    public final W d() {
        return (W) this.f6836m.getValue();
    }

    public final float e(float f6) {
        Float valueOf;
        C0599c0 c0599c0 = this.f6833j;
        float g3 = (Float.isNaN(c0599c0.g()) ? S.l.f7374V : c0599c0.g()) + f6;
        float c6 = d().c();
        Collection values = d().a.values();
        AbstractC1276k.f(values, "<this>");
        Iterator it = values.iterator();
        if (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            valueOf = Float.valueOf(floatValue);
        } else {
            valueOf = null;
        }
        return AbstractC1117a.e(g3, c6, valueOf != null ? valueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        C0599c0 c0599c0 = this.f6833j;
        if (Float.isNaN(c0599c0.g())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c0599c0.g();
    }

    public final void g(Object obj) {
        this.f6830g.setValue(obj);
    }

    public final void h(Object obj) {
        this.f6835l.setValue(obj);
    }
}
