package z4;

import java.util.concurrent.atomic.AtomicReferenceArray;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class p extends C4.s {

    /* renamed from: h, reason: collision with root package name */
    public final C2057h f16374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f16375i;

    public p(long j3, p pVar, C2057h c2057h, int i6) {
        super(j3, pVar, i6);
        this.f16374h = c2057h;
        this.f16375i = new AtomicReferenceArray(AbstractC2059j.f16353b * 2);
    }

    @Override // C4.s
    public final int g() {
        return AbstractC2059j.f16353b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        m4.AbstractC1276k.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // C4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r5, b4.InterfaceC0910h r6) {
        /*
            r4 = this;
            int r6 = z4.AbstractC2059j.f16353b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f16375i
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof x4.D0
            z4.h r2 = r4.f16374h
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof z4.y
            if (r1 == 0) goto L21
            goto L62
        L21:
            C4.u r1 = z4.AbstractC2059j.f16361j
            if (r6 == r1) goto L59
            C4.u r1 = z4.AbstractC2059j.f16362k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            C4.u r1 = z4.AbstractC2059j.f16358g
            if (r6 == r1) goto L11
            C4.u r1 = z4.AbstractC2059j.f16357f
            if (r6 != r1) goto L33
            goto L11
        L33:
            C4.u r5 = z4.AbstractC2059j.f16360i
            if (r6 == r5) goto L7c
            C4.u r5 = z4.AbstractC2059j.f16355d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            C4.u r5 = z4.AbstractC2059j.f16363l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            m4.AbstractC1276k.c(r2)
            return
        L62:
            if (r0 == 0) goto L67
            C4.u r1 = z4.AbstractC2059j.f16361j
            goto L69
        L67:
            C4.u r1 = z4.AbstractC2059j.f16362k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            m4.AbstractC1276k.c(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.p.h(int, b4.h):void");
    }

    public final boolean k(int i6, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i7 = (i6 * 2) + 1;
        do {
            atomicReferenceArray = this.f16375i;
            if (atomicReferenceArray.compareAndSet(i7, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i7) == obj);
        return false;
    }

    public final Object l(int i6) {
        return this.f16375i.get((i6 * 2) + 1);
    }

    public final void m(int i6, boolean z5) {
        if (z5) {
            C2057h c2057h = this.f16374h;
            AbstractC1276k.c(c2057h);
            c2057h.K((this.f715f * AbstractC2059j.f16353b) + i6);
        }
        i();
    }

    public final void n(int i6, Object obj) {
        this.f16375i.set(i6 * 2, obj);
    }

    public final void o(int i6, Object obj) {
        this.f16375i.set((i6 * 2) + 1, obj);
    }
}
