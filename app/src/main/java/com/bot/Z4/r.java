package z4;

import b4.InterfaceC0905c;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public final class r extends C2057h {

    /* renamed from: n, reason: collision with root package name */
    public final EnumC2050a f16376n;

    public r(int i6, EnumC2050a enumC2050a) {
        super(i6);
        this.f16376n = enumC2050a;
        if (enumC2050a != EnumC2050a.f16327c) {
            if (i6 < 1) {
                throw new IllegalArgumentException(B3.e.l("Buffered channel capacity must be at least 1, but ", i6, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC1289x.a(C2057h.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            z4.a r1 = r15.f16376n
            z4.a r2 = z4.EnumC2050a.f16329f
            X3.y r8 = X3.y.a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.t(r16)
            boolean r2 = r1 instanceof z4.C2063n
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof z4.C2062m
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            C4.u r6 = z4.AbstractC2059j.f16355d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = z4.C2057h.f16346i
            java.lang.Object r1 = r1.get(r15)
            z4.p r1 = (z4.p) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = z4.C2057h.f16342e
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.w(r2, r7)
            int r9 = z4.AbstractC2059j.f16353b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f715f
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            z4.p r2 = z4.C2057h.c(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.s()
            z4.m r2 = new z4.m
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = z4.C2057h.e(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = z4.C2057h.f16343f
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.s()
            z4.m r2 = new z4.m
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.i()
            java.lang.Throwable r1 = r15.s()
            z4.m r2 = new z4.m
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof x4.D0
            if (r3 == 0) goto La6
            x4.D0 r6 = (x4.D0) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f715f
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.k(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.r.L(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // z4.C2057h, z4.x
    public final Object a(InterfaceC0905c interfaceC0905c, Object obj) {
        if (L(obj, true) instanceof C2062m) {
            throw s();
        }
        return X3.y.a;
    }

    @Override // z4.C2057h, z4.x
    public final Object t(Object obj) {
        return L(obj, false);
    }

    @Override // z4.C2057h
    public final boolean z() {
        return this.f16376n == EnumC2050a.f16328e;
    }
}
