package z4;

import I3.C;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import x4.AbstractC1888A;
import x4.C1928k;
import x4.D0;
import x4.InterfaceC1927j;

/* renamed from: z4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2057h implements InterfaceC2061l {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16342e = AtomicLongFieldUpdater.newUpdater(C2057h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16343f = AtomicLongFieldUpdater.newUpdater(C2057h.class, "receivers$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16344g = AtomicLongFieldUpdater.newUpdater(C2057h.class, "bufferEnd$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16345h = AtomicLongFieldUpdater.newUpdater(C2057h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16346i = AtomicReferenceFieldUpdater.newUpdater(C2057h.class, Object.class, "sendSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16347j = AtomicReferenceFieldUpdater.newUpdater(C2057h.class, Object.class, "receiveSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16348k = AtomicReferenceFieldUpdater.newUpdater(C2057h.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16349l = AtomicReferenceFieldUpdater.newUpdater(C2057h.class, Object.class, "_closeCause$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16350m = AtomicReferenceFieldUpdater.newUpdater(C2057h.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final int f16351c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C2057h(int i6) {
        this.f16351c = i6;
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.l("Invalid channel capacity: ", i6, ", should be >=0").toString());
        }
        p pVar = AbstractC2059j.a;
        this.bufferEnd$volatile = i6 != 0 ? i6 != Integer.MAX_VALUE ? i6 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f16344g.get(this);
        p pVar2 = new p(0L, null, this, 3);
        this.sendSegment$volatile = pVar2;
        this.receiveSegment$volatile = pVar2;
        if (A()) {
            pVar2 = AbstractC2059j.a;
            AbstractC1276k.d(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar2;
        this._closeCause$volatile = AbstractC2059j.f16370s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object D(z4.C2057h r13, d4.c r14) {
        /*
            boolean r0 = r14 instanceof z4.C2055f
            if (r0 == 0) goto L14
            r0 = r14
            z4.f r0 = (z4.C2055f) r0
            int r1 = r0.f16338i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f16338i = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            z4.f r0 = new z4.f
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f16336g
            int r0 = r6.f16338i
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            X3.a.e(r14)
            z4.o r14 = (z4.C2064o) r14
            java.lang.Object r13 = r14.a
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            X3.a.e(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = z4.C2057h.f16347j
            java.lang.Object r14 = r14.get(r13)
            z4.p r14 = (z4.p) r14
        L3e:
            boolean r0 = r13.x()
            if (r0 == 0) goto L4e
            java.lang.Throwable r13 = r13.q()
            z4.m r14 = new z4.m
            r14.<init>(r13)
            return r14
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = z4.C2057h.f16343f
            long r4 = r0.getAndIncrement(r13)
            int r0 = z4.AbstractC2059j.f16353b
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.f715f
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6b
            z4.p r0 = r13.o(r7, r14)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            r2 = r0
            goto L6c
        L6b:
            r2 = r14
        L6c:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.I(r8, r9, r10, r12)
            C4.u r14 = z4.AbstractC2059j.f16364m
            if (r13 == r14) goto La0
            C4.u r14 = z4.AbstractC2059j.f16366o
            if (r13 != r14) goto L8b
            long r13 = r7.u()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r2.a()
        L88:
            r14 = r2
            r13 = r7
            goto L3e
        L8b:
            C4.u r14 = z4.AbstractC2059j.f16365n
            if (r13 != r14) goto L9c
            r6.f16338i = r1
            r1 = r7
            java.lang.Object r13 = r1.E(r2, r3, r4, r6)
            c4.a r14 = c4.EnumC0927a.f11114c
            if (r13 != r14) goto L9b
            return r14
        L9b:
            return r13
        L9c:
            r2.a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.D(z4.h, d4.c):java.lang.Object");
    }

    public static final p c(C2057h c2057h, long j3, p pVar) {
        Object b5;
        C2057h c2057h2;
        p pVar2 = AbstractC2059j.a;
        C2058i c2058i = C2058i.f16352l;
        loop0: while (true) {
            b5 = C4.a.b(pVar, j3, c2058i);
            if (!C4.a.e(b5)) {
                C4.s c6 = C4.a.c(b5);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16346i;
                    C4.s sVar = (C4.s) atomicReferenceFieldUpdater.get(c2057h);
                    if (sVar.f715f >= c6.f715f) {
                        break loop0;
                    }
                    if (!c6.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c2057h, sVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(c2057h) != sVar) {
                            if (c6.f()) {
                                c6.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean e6 = C4.a.e(b5);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16343f;
        if (e6) {
            c2057h.y();
            if (pVar.f715f * AbstractC2059j.f16353b < atomicLongFieldUpdater.get(c2057h)) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) C4.a.c(b5);
            long j4 = pVar3.f715f;
            if (j4 <= j3) {
                return pVar3;
            }
            long j5 = AbstractC2059j.f16353b * j4;
            while (true) {
                long j6 = f16342e.get(c2057h);
                long j7 = 1152921504606846975L & j6;
                if (j7 >= j5) {
                    c2057h2 = c2057h;
                    break;
                }
                c2057h2 = c2057h;
                if (f16342e.compareAndSet(c2057h2, j6, (((int) (j6 >> 60)) << 60) + j7)) {
                    break;
                }
                c2057h = c2057h2;
            }
            if (j4 * AbstractC2059j.f16353b < atomicLongFieldUpdater.get(c2057h2)) {
                pVar3.a();
            }
        }
        return null;
    }

    public static final void d(C2057h c2057h, Object obj, C1928k c1928k) {
        c1928k.k(X3.a.b(c2057h.s()));
    }

    public static final int e(C2057h c2057h, p pVar, int i6, Object obj, long j3, Object obj2, boolean z5) {
        pVar.n(i6, obj);
        if (z5) {
            return c2057h.J(pVar, i6, obj, j3, obj2, z5);
        }
        Object l3 = pVar.l(i6);
        if (l3 == null) {
            if (c2057h.g(j3)) {
                if (pVar.k(i6, null, AbstractC2059j.f16355d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i6, null, obj2)) {
                    return 2;
                }
            }
        } else if (l3 instanceof D0) {
            pVar.n(i6, null);
            if (c2057h.G(l3, obj)) {
                pVar.o(i6, AbstractC2059j.f16360i);
                return 0;
            }
            C4.u uVar = AbstractC2059j.f16362k;
            if (pVar.f16375i.getAndSet((i6 * 2) + 1, uVar) == uVar) {
                return 5;
            }
            pVar.m(i6, true);
            return 5;
        }
        return c2057h.J(pVar, i6, obj, j3, obj2, z5);
    }

    public static void v(C2057h c2057h) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16345h;
        if ((atomicLongFieldUpdater.addAndGet(c2057h, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(c2057h) & 4611686018427387904L) != 0);
    }

    public final boolean A() {
        long j3 = f16344g.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(long r5, z4.p r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f715f
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            C4.b r0 = r7.c()
            z4.p r0 = (z4.p) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            C4.b r5 = r7.c()
            z4.p r5 = (z4.p) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = z4.C2057h.f16348k
            java.lang.Object r6 = r5.get(r4)
            C4.s r6 = (C4.s) r6
            long r0 = r6.f715f
            long r2 = r7.f715f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.B(long, z4.p):void");
    }

    public final Object C(InterfaceC0905c interfaceC0905c, Object obj) {
        C1928k c1928k = new C1928k(1, Y4.d.K(interfaceC0905c));
        c1928k.t();
        c1928k.k(X3.a.b(s()));
        Object s5 = c1928k.s();
        return s5 == EnumC0927a.f11114c ? s5 : X3.y.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(z4.p r14, int r15, long r16, d4.c r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.E(z4.p, int, long, d4.c):java.lang.Object");
    }

    public final void F(D0 d02, boolean z5) {
        if (d02 instanceof InterfaceC1927j) {
            ((InterfaceC0905c) d02).k(X3.a.b(z5 ? r() : s()));
            return;
        }
        if (d02 instanceof v) {
            ((v) d02).f16381c.k(new C2064o(new C2062m(q())));
            return;
        }
        if (!(d02 instanceof C2052c)) {
            if (d02 instanceof F4.f) {
                ((F4.e) ((F4.f) d02)).g(this, AbstractC2059j.f16363l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + d02).toString());
            }
        }
        C2052c c2052c = (C2052c) d02;
        C1928k c1928k = c2052c.f16332e;
        AbstractC1276k.c(c1928k);
        c2052c.f16332e = null;
        c2052c.f16331c = AbstractC2059j.f16363l;
        Throwable q3 = c2052c.f16333f.q();
        if (q3 == null) {
            c1928k.k(Boolean.FALSE);
        } else {
            c1928k.k(X3.a.b(q3));
        }
    }

    public final boolean G(Object obj, Object obj2) {
        if (obj instanceof F4.f) {
            return ((F4.e) ((F4.f) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof v) {
            AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return AbstractC2059j.a(((v) obj).f16381c, new C2064o(obj2), null);
        }
        if (!(obj instanceof C2052c)) {
            if (obj instanceof InterfaceC1927j) {
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return AbstractC2059j.a((InterfaceC1927j) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C2052c c2052c = (C2052c) obj;
        C1928k c1928k = c2052c.f16332e;
        AbstractC1276k.c(c1928k);
        c2052c.f16332e = null;
        c2052c.f16331c = obj2;
        Boolean bool = Boolean.TRUE;
        c2052c.f16333f.getClass();
        return AbstractC2059j.a(c1928k, bool, null);
    }

    public final boolean H(Object obj, p pVar, int i6) {
        F4.i iVar;
        boolean z5 = obj instanceof InterfaceC1927j;
        X3.y yVar = X3.y.a;
        if (z5) {
            AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC2059j.a((InterfaceC1927j) obj, yVar, null);
        }
        if (!(obj instanceof F4.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int g3 = ((F4.e) obj).g(this, yVar);
        F4.i iVar2 = F4.i.f1631c;
        F4.i iVar3 = F4.i.f1632e;
        if (g3 == 0) {
            iVar = iVar2;
        } else if (g3 == 1) {
            iVar = iVar3;
        } else if (g3 == 2) {
            iVar = F4.i.f1633f;
        } else {
            if (g3 != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + g3).toString());
            }
            iVar = F4.i.f1634g;
        }
        if (iVar == iVar3) {
            pVar.n(i6, null);
        }
        return iVar == iVar2;
    }

    public final Object I(p pVar, int i6, long j3, Object obj) {
        Object l3 = pVar.l(i6);
        AtomicReferenceArray atomicReferenceArray = pVar.f16375i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16342e;
        if (l3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC2059j.f16365n;
                }
                if (pVar.k(i6, l3, obj)) {
                    l();
                    return AbstractC2059j.f16364m;
                }
            }
        } else if (l3 == AbstractC2059j.f16355d && pVar.k(i6, l3, AbstractC2059j.f16360i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i6 * 2);
            pVar.n(i6, null);
            return obj2;
        }
        while (true) {
            Object l5 = pVar.l(i6);
            if (l5 == null || l5 == AbstractC2059j.f16356e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pVar.k(i6, l5, AbstractC2059j.f16359h)) {
                        l();
                        return AbstractC2059j.f16366o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC2059j.f16365n;
                    }
                    if (pVar.k(i6, l5, obj)) {
                        l();
                        return AbstractC2059j.f16364m;
                    }
                }
            } else {
                if (l5 != AbstractC2059j.f16355d) {
                    C4.u uVar = AbstractC2059j.f16361j;
                    if (l5 != uVar && l5 != AbstractC2059j.f16359h) {
                        if (l5 == AbstractC2059j.f16363l) {
                            l();
                            return AbstractC2059j.f16366o;
                        }
                        if (l5 != AbstractC2059j.f16358g && pVar.k(i6, l5, AbstractC2059j.f16357f)) {
                            boolean z5 = l5 instanceof y;
                            if (z5) {
                                l5 = ((y) l5).a;
                            }
                            if (H(l5, pVar, i6)) {
                                pVar.o(i6, AbstractC2059j.f16360i);
                                l();
                                Object obj3 = atomicReferenceArray.get(i6 * 2);
                                pVar.n(i6, null);
                                return obj3;
                            }
                            pVar.o(i6, uVar);
                            pVar.i();
                            if (z5) {
                                l();
                            }
                            return AbstractC2059j.f16366o;
                        }
                    }
                    return AbstractC2059j.f16366o;
                }
                if (pVar.k(i6, l5, AbstractC2059j.f16360i)) {
                    l();
                    Object obj4 = atomicReferenceArray.get(i6 * 2);
                    pVar.n(i6, null);
                    return obj4;
                }
            }
        }
    }

    public final int J(p pVar, int i6, Object obj, long j3, Object obj2, boolean z5) {
        while (true) {
            Object l3 = pVar.l(i6);
            if (l3 == null) {
                if (!g(j3) || z5) {
                    if (z5) {
                        if (pVar.k(i6, null, AbstractC2059j.f16361j)) {
                            pVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.k(i6, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.k(i6, null, AbstractC2059j.f16355d)) {
                    break;
                }
            } else {
                if (l3 != AbstractC2059j.f16356e) {
                    C4.u uVar = AbstractC2059j.f16362k;
                    if (l3 == uVar) {
                        pVar.n(i6, null);
                        return 5;
                    }
                    if (l3 == AbstractC2059j.f16359h) {
                        pVar.n(i6, null);
                        return 5;
                    }
                    if (l3 == AbstractC2059j.f16363l) {
                        pVar.n(i6, null);
                        y();
                        return 4;
                    }
                    pVar.n(i6, null);
                    if (l3 instanceof y) {
                        l3 = ((y) l3).a;
                    }
                    if (G(l3, obj)) {
                        pVar.o(i6, AbstractC2059j.f16360i);
                        return 0;
                    }
                    if (pVar.f16375i.getAndSet((i6 * 2) + 1, uVar) != uVar) {
                        pVar.m(i6, true);
                    }
                    return 5;
                }
                if (pVar.k(i6, l3, AbstractC2059j.f16355d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void K(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C2057h c2057h = this;
        if (c2057h.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f16344g;
            if (atomicLongFieldUpdater.get(c2057h) > j3) {
                break;
            } else {
                c2057h = this;
            }
        }
        int i6 = AbstractC2059j.f16354c;
        int i7 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16345h;
            if (i7 < i6) {
                long j4 = atomicLongFieldUpdater.get(c2057h);
                if (j4 == (4611686018427387903L & atomicLongFieldUpdater2.get(c2057h)) && j4 == atomicLongFieldUpdater.get(c2057h)) {
                    return;
                } else {
                    i7++;
                }
            } else {
                while (true) {
                    long j5 = atomicLongFieldUpdater2.get(c2057h);
                    if (atomicLongFieldUpdater2.compareAndSet(c2057h, j5, (j5 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c2057h = this;
                    }
                }
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(c2057h);
                    long j7 = atomicLongFieldUpdater2.get(c2057h);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z5 = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(c2057h)) {
                        break;
                    }
                    if (z5) {
                        c2057h = this;
                    } else {
                        c2057h = this;
                        atomicLongFieldUpdater2.compareAndSet(c2057h, j7, 4611686018427387904L + j8);
                    }
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(c2057h);
                    if (atomicLongFieldUpdater2.compareAndSet(c2057h, j9, j9 & 4611686018427387903L)) {
                        return;
                    } else {
                        c2057h = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // z4.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(b4.InterfaceC0905c r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.a(b4.c, java.lang.Object):java.lang.Object");
    }

    @Override // z4.w
    public final M.q b() {
        AbstractC1291z.b(3, C2053d.f16334l);
        AbstractC1291z.b(3, C2054e.f16335l);
        return new M.q(this, (AbstractC2051b) null);
    }

    @Override // z4.w
    public final void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    public final boolean g(long j3) {
        return j3 < f16344g.get(this) || j3 < f16343f.get(this) + ((long) this.f16351c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = z4.C2057h.f16350m;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = z4.AbstractC2059j.f16368q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        m4.AbstractC1291z.b(1, r14);
        ((l4.c) r14).f(q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = z4.AbstractC2059j.f16369r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = z4.AbstractC2059j.a;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = z4.AbstractC2059j.f16370s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = z4.C2057h.f16349l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = z4.C2057h.f16342e
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            z4.p r4 = z4.AbstractC2059j.a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            C4.u r5 = z4.AbstractC2059j.f16370s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = z4.C2057h.f16349l
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.y()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = z4.C2057h.f16350m
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            C4.u r0 = z4.AbstractC2059j.f16368q
            goto L7b
        L79:
            C4.u r0 = z4.AbstractC2059j.f16369r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            m4.AbstractC1291z.b(r9, r14)
            l4.c r14 = (l4.c) r14
            java.lang.Throwable r13 = r12.q()
            r14.f(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.h(java.lang.Throwable, boolean):boolean");
    }

    @Override // z4.w
    public final Object i() {
        p pVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16343f;
        long j3 = atomicLongFieldUpdater.get(this);
        long j4 = f16342e.get(this);
        if (w(j4, true)) {
            return new C2062m(q());
        }
        long j5 = j4 & 1152921504606846975L;
        C2063n c2063n = C2064o.f16373b;
        if (j3 >= j5) {
            return c2063n;
        }
        Object obj = AbstractC2059j.f16362k;
        p pVar2 = (p) f16347j.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = AbstractC2059j.f16353b;
            long j7 = andIncrement / j6;
            int i6 = (int) (andIncrement % j6);
            if (pVar2.f715f != j7) {
                p o5 = o(j7, pVar2);
                if (o5 == null) {
                    continue;
                } else {
                    pVar = o5;
                }
            } else {
                pVar = pVar2;
            }
            Object I5 = I(pVar, i6, andIncrement, obj);
            p pVar3 = pVar;
            if (I5 == AbstractC2059j.f16364m) {
                D0 d02 = obj instanceof D0 ? (D0) obj : null;
                if (d02 != null) {
                    d02.a(pVar3, i6);
                }
                K(andIncrement);
                pVar3.i();
                return c2063n;
            }
            if (I5 != AbstractC2059j.f16366o) {
                if (I5 == AbstractC2059j.f16365n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.a();
                return I5;
            }
            if (andIncrement < u()) {
                pVar3.a();
            }
            pVar2 = pVar3;
        }
        return new C2062m(q());
    }

    @Override // z4.w
    public final C2052c iterator() {
        return new C2052c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (z4.p) ((C4.b) C4.b.f685e.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z4.p j(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.j(long):z4.p");
    }

    public final void k(long j3) {
        p pVar = (p) f16347j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16343f;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f16351c + j4, f16344g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                long j5 = AbstractC2059j.f16353b;
                long j6 = j4 / j5;
                int i6 = (int) (j4 % j5);
                if (pVar.f715f != j6) {
                    p o5 = o(j6, pVar);
                    if (o5 != null) {
                        pVar = o5;
                    }
                }
                p pVar2 = pVar;
                if (I(pVar2, i6, j4, null) != AbstractC2059j.f16366o) {
                    pVar2.a();
                } else if (j4 < u()) {
                    pVar2.a();
                }
                pVar = pVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.l():void");
    }

    @Override // z4.w
    public final Object m(B4.s sVar) {
        return D(this, sVar);
    }

    @Override // z4.x
    public final boolean n(Throwable th) {
        return h(th, false);
    }

    public final p o(long j3, p pVar) {
        Object b5;
        long j4;
        p pVar2 = AbstractC2059j.a;
        C2058i c2058i = C2058i.f16352l;
        loop0: while (true) {
            b5 = C4.a.b(pVar, j3, c2058i);
            if (!C4.a.e(b5)) {
                C4.s c6 = C4.a.c(b5);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16347j;
                    C4.s sVar = (C4.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f715f >= c6.f715f) {
                        break loop0;
                    }
                    if (!c6.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, c6)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (c6.f()) {
                                c6.e();
                            }
                        }
                    }
                    if (sVar.f()) {
                        sVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (C4.a.e(b5)) {
            y();
            if (pVar.f715f * AbstractC2059j.f16353b < u()) {
                pVar.a();
                return null;
            }
        } else {
            p pVar3 = (p) C4.a.c(b5);
            long j5 = pVar3.f715f;
            if (!A() && j3 <= f16344g.get(this) / AbstractC2059j.f16353b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16348k;
                    C4.s sVar2 = (C4.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f715f >= j5) {
                        break;
                    }
                    if (!pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (sVar2.f()) {
                        sVar2.e();
                    }
                }
            }
            if (j5 <= j3) {
                return pVar3;
            }
            long j6 = j5 * AbstractC2059j.f16353b;
            do {
                j4 = f16343f.get(this);
                if (j4 >= j6) {
                    break;
                }
            } while (!f16343f.compareAndSet(this, j4, j6));
            if (j5 * AbstractC2059j.f16353b < u()) {
                pVar3.a();
            }
        }
        return null;
    }

    @Override // z4.w
    public final Object p(InterfaceC0905c interfaceC0905c) {
        p pVar;
        Throwable th;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16347j;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!x()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16343f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = AbstractC2059j.f16353b;
            long j4 = andIncrement / j3;
            int i6 = (int) (andIncrement % j3);
            if (pVar3.f715f != j4) {
                p o5 = o(j4, pVar3);
                if (o5 == null) {
                    continue;
                } else {
                    pVar = o5;
                }
            } else {
                pVar = pVar3;
            }
            Object I5 = I(pVar, i6, andIncrement, null);
            C4.u uVar = AbstractC2059j.f16364m;
            if (I5 == uVar) {
                throw new IllegalStateException("unexpected");
            }
            C4.u uVar2 = AbstractC2059j.f16366o;
            if (I5 == uVar2) {
                if (andIncrement < u()) {
                    pVar.a();
                }
                pVar3 = pVar;
            } else {
                if (I5 != AbstractC2059j.f16365n) {
                    pVar.a();
                    return I5;
                }
                C1928k s5 = AbstractC1888A.s(Y4.d.K(interfaceC0905c));
                C2057h c2057h = this;
                try {
                    Object I6 = c2057h.I(pVar, i6, andIncrement, s5);
                    if (I6 == uVar) {
                        s5.a(pVar, i6);
                    } else {
                        if (I6 == uVar2) {
                            if (andIncrement < u()) {
                                pVar.a();
                            }
                            p pVar4 = (p) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (x()) {
                                    s5.k(X3.a.b(r()));
                                    break;
                                }
                                C1928k c1928k = s5;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j5 = AbstractC2059j.f16353b;
                                    long j6 = andIncrement2 / j5;
                                    int i7 = (int) (andIncrement2 % j5);
                                    if (pVar4.f715f != j6) {
                                        try {
                                            p o6 = o(j6, pVar4);
                                            if (o6 == null) {
                                                s5 = c1928k;
                                            } else {
                                                pVar2 = o6;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            s5 = c1928k;
                                            s5.D();
                                            throw th;
                                        }
                                    } else {
                                        pVar2 = pVar4;
                                    }
                                    I6 = c2057h.I(pVar2, i7, andIncrement2, c1928k);
                                    p pVar5 = pVar2;
                                    s5 = c1928k;
                                    if (I6 == AbstractC2059j.f16364m) {
                                        s5.a(pVar5, i7);
                                        break;
                                    }
                                    if (I6 == AbstractC2059j.f16366o) {
                                        if (andIncrement2 < u()) {
                                            pVar5.a();
                                        }
                                        c2057h = this;
                                        pVar4 = pVar5;
                                    } else {
                                        if (I6 == AbstractC2059j.f16365n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar5.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    s5 = c1928k;
                                    th = th;
                                    s5.D();
                                    throw th;
                                }
                            }
                        } else {
                            pVar.a();
                        }
                        s5.e(I6, null);
                    }
                    return s5.s();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable r5 = r();
        int i8 = C4.t.a;
        throw r5;
    }

    public final Throwable q() {
        return (Throwable) f16349l.get(this);
    }

    public final Throwable r() {
        Throwable q3 = q();
        return q3 == null ? new NoSuchElementException("Channel was closed") : q3;
    }

    public final Throwable s() {
        Throwable q3 = q();
        return q3 == null ? new C("Channel was closed", 4) : q3;
    }

    @Override // z4.x
    public Object t(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16342e;
        boolean z5 = false;
        long j3 = 1152921504606846975L;
        boolean z6 = w(atomicLongFieldUpdater.get(this), false) ? false : !g(r1 & 1152921504606846975L);
        C2063n c2063n = C2064o.f16373b;
        if (z6) {
            return c2063n;
        }
        Object obj2 = AbstractC2059j.f16361j;
        p pVar = (p) f16346i.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean w5 = w(andIncrement, z5);
            int i6 = AbstractC2059j.f16353b;
            long j5 = i6;
            long j6 = j4 / j5;
            int i7 = (int) (j4 % j5);
            if (pVar.f715f != j6) {
                p c6 = c(this, j6, pVar);
                if (c6 != null) {
                    pVar = c6;
                } else {
                    if (w5) {
                        return new C2062m(s());
                    }
                    z5 = false;
                    j3 = 1152921504606846975L;
                }
            }
            int e6 = e(this, pVar, i7, obj, j4, obj2, w5);
            X3.y yVar = X3.y.a;
            if (e6 == 0) {
                pVar.a();
                return yVar;
            }
            if (e6 == 1) {
                return yVar;
            }
            if (e6 == 2) {
                if (w5) {
                    pVar.i();
                    return new C2062m(s());
                }
                D0 d02 = obj2 instanceof D0 ? (D0) obj2 : null;
                if (d02 != null) {
                    d02.a(pVar, i7 + i6);
                }
                pVar.i();
                return c2063n;
            }
            if (e6 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e6 == 4) {
                if (j4 < f16343f.get(this)) {
                    pVar.a();
                }
                return new C2062m(s());
            }
            if (e6 == 5) {
                pVar.a();
            }
            z5 = false;
            j3 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        r16 = r7;
        r3 = (z4.p) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.toString():java.lang.String");
    }

    public final long u() {
        return f16342e.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (z4.p) ((C4.b) C4.b.f685e.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.C2057h.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(f16342e.get(this), true);
    }

    public final boolean y() {
        return w(f16342e.get(this), false);
    }

    public boolean z() {
        return false;
    }
}
