package p;

import B0.C0040p;
import B0.EnumC0041q;
import h0.AbstractC1040q;
import t.C1679g;
import t.C1680h;
import t.C1682j;
import x4.AbstractC1888A;

/* renamed from: p.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1444l0 extends AbstractC1040q implements H0.w0 {

    /* renamed from: r, reason: collision with root package name */
    public C1682j f13743r;

    /* renamed from: s, reason: collision with root package name */
    public C1679g f13744s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, t.g, t.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(p.C1444l0 r4, d4.c r5) {
        /*
            boolean r0 = r5 instanceof p.C1436h0
            if (r0 == 0) goto L13
            r0 = r5
            p.h0 r0 = (p.C1436h0) r0
            int r1 = r0.f13721j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13721j = r1
            goto L18
        L13:
            p.h0 r0 = new p.h0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13719h
            int r1 = r0.f13721j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            t.g r0 = r0.f13718g
            X3.a.e(r5)
            goto L4b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            X3.a.e(r5)
            t.g r5 = r4.f13744s
            if (r5 != 0) goto L4d
            t.g r5 = new t.g
            r5.<init>()
            t.j r1 = r4.f13743r
            r0.f13718g = r5
            r0.f13721j = r2
            java.lang.Object r0 = r1.a(r5, r0)
            c4.a r1 = c4.EnumC0927a.f11114c
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            r4.f13744s = r0
        L4d:
            X3.y r4 = X3.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1444l0.M0(p.l0, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N0(p.C1444l0 r4, d4.c r5) {
        /*
            boolean r0 = r5 instanceof p.C1438i0
            if (r0 == 0) goto L13
            r0 = r5
            p.i0 r0 = (p.C1438i0) r0
            int r1 = r0.f13727i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13727i = r1
            goto L18
        L13:
            p.i0 r0 = new p.i0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13725g
            int r1 = r0.f13727i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r5)
            goto L46
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            X3.a.e(r5)
            t.g r5 = r4.f13744s
            if (r5 == 0) goto L49
            t.h r1 = new t.h
            r1.<init>(r5)
            t.j r5 = r4.f13743r
            r0.f13727i = r2
            java.lang.Object r5 = r5.a(r1, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L46
            return r0
        L46:
            r5 = 0
            r4.f13744s = r5
        L49:
            X3.y r4 = X3.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1444l0.N0(p.l0, d4.c):java.lang.Object");
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        O0();
    }

    @Override // H0.w0
    public final void L() {
        O0();
    }

    public final void O0() {
        C1679g c1679g = this.f13744s;
        if (c1679g != null) {
            this.f13743r.b(new C1680h(c1679g));
            this.f13744s = null;
        }
    }

    @Override // H0.w0
    public final void w(C0040p c0040p, EnumC0041q enumC0041q, long j3) {
        if (enumC0041q == EnumC0041q.f476e) {
            int i6 = c0040p.f474f;
            if (i6 == 4) {
                AbstractC1888A.y(A0(), null, new C1440j0(this, null), 3);
            } else if (i6 == 5) {
                AbstractC1888A.y(A0(), null, new C1442k0(this, null), 3);
            }
        }
    }
}
