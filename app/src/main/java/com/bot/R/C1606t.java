package r;

import T.C0599c0;
import T.C0602e;
import T.C0607g0;
import i4.AbstractC1117a;
import u.AbstractC1734b;

/* renamed from: r.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606t {

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f14469c;

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f14470d;

    /* renamed from: g, reason: collision with root package name */
    public final C0599c0 f14473g;

    /* renamed from: h, reason: collision with root package name */
    public final C0607g0 f14474h;

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f14475i;

    /* renamed from: j, reason: collision with root package name */
    public final C1603s f14476j;
    public final p.O0 a = new p.O0(4);

    /* renamed from: b, reason: collision with root package name */
    public final p.C0 f14468b = new p.C0();

    /* renamed from: e, reason: collision with root package name */
    public final T.E f14471e = T.r.s(new C1591o(this, 0));

    /* renamed from: f, reason: collision with root package name */
    public final C0599c0 f14472f = new C0599c0(Float.NaN);

    public C1606t(R2.H h3) {
        this.f14469c = T.r.A(h3);
        this.f14470d = T.r.A(h3);
        T.r.r(C0602e.f8083j, new C1591o(this, 1));
        this.f14473g = new C0599c0(S.l.f7374V);
        this.f14474h = T.r.A(null);
        this.f14475i = T.r.A(new C1517E(Y3.v.f9812c, new float[0]));
        this.f14476j = new C1603s(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r11, p.x0 r12, l4.g r13, d4.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof r.C1597q
            if (r0 == 0) goto L13
            r0 = r14
            r.q r0 = (r.C1597q) r0
            int r1 = r0.f14445i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14445i = r1
            goto L18
        L13:
            r.q r0 = new r.q
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f14443g
            int r1 = r0.f14445i
            T.g0 r2 = r10.f14474h
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            X3.a.e(r14)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L63
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L6d
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            X3.a.e(r14)
            r.E r14 = r10.b()
            java.util.List r14 = r14.a
            int r14 = r14.indexOf(r11)
            r1 = -1
            if (r14 == r1) goto L71
            p.C0 r14 = r10.f14468b     // Catch: java.lang.Throwable -> L6a
            I2.u r4 = new I2.u     // Catch: java.lang.Throwable -> L6a
            r9 = 5
            r5 = r10
            r6 = r11
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L67
            r0.f14445i = r3     // Catch: java.lang.Throwable -> L67
            r14.getClass()     // Catch: java.lang.Throwable -> L67
            p.A0 r11 = new p.A0     // Catch: java.lang.Throwable -> L67
            r11.<init>(r12, r14, r4, r8)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r11 = x4.AbstractC1888A.l(r11, r0)     // Catch: java.lang.Throwable -> L67
            c4.a r12 = c4.EnumC0927a.f11114c
            if (r11 != r12) goto L63
            return r12
        L63:
            r2.setValue(r8)
            goto L7b
        L67:
            r0 = move-exception
        L68:
            r11 = r0
            goto L6d
        L6a:
            r0 = move-exception
            r5 = r10
            goto L68
        L6d:
            r2.setValue(r8)
            throw r11
        L71:
            r5 = r10
            r6 = r11
            T.g0 r11 = r5.f14470d
            r11.setValue(r6)
            r10.e(r6)
        L7b:
            X3.y r11 = X3.y.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1606t.a(java.lang.Object, p.x0, l4.g, d4.c):java.lang.Object");
    }

    public final C1517E b() {
        return (C1517E) this.f14475i.getValue();
    }

    public final float c(float f6) {
        float f7;
        float f8;
        C0599c0 c0599c0 = this.f14472f;
        float g3 = (Float.isNaN(c0599c0.g()) ? S.l.f7374V : c0599c0.g()) + f6;
        float[] fArr = b().f14010b;
        if (fArr.length == 0) {
            f7 = Float.NaN;
        } else {
            float f9 = fArr[0];
            int i6 = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    f9 = Math.min(f9, fArr[i6]);
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            }
            f7 = f9;
        }
        float[] fArr2 = b().f14010b;
        if (fArr2.length == 0) {
            f8 = Float.NaN;
        } else {
            float f10 = fArr2[0];
            int i7 = 1;
            int length2 = fArr2.length - 1;
            if (1 <= length2) {
                while (true) {
                    f10 = Math.max(f10, fArr2[i7]);
                    if (i7 == length2) {
                        break;
                    }
                    i7++;
                }
            }
            f8 = f10;
        }
        return AbstractC1117a.e(g3, f7, f8);
    }

    public final float d() {
        C0599c0 c0599c0 = this.f14472f;
        if (Float.isNaN(c0599c0.g())) {
            AbstractC1734b.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c0599c0.g();
    }

    public final void e(Object obj) {
        this.f14469c.setValue(obj);
    }
}
