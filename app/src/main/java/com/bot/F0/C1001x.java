package f0;

import T.AbstractC0619m0;
import T.AbstractC0629s;
import T.C0624p;
import b0.AbstractC0874g;
import c.C0914b;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k.H;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001x {
    public final l4.c a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11739c;

    /* renamed from: h, reason: collision with root package name */
    public C0914b f11744h;

    /* renamed from: i, reason: collision with root package name */
    public C1000w f11745i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f11738b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final B4.D f11740d = new B4.D(this, 26);

    /* renamed from: e, reason: collision with root package name */
    public final W0.e f11741e = new W0.e(this, 7);

    /* renamed from: f, reason: collision with root package name */
    public final V.e f11742f = new V.e(new C1000w[16]);

    /* renamed from: g, reason: collision with root package name */
    public final Object f11743g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public long f11746j = -1;

    public C1001x(l4.c cVar) {
        this.a = cVar;
    }

    public final void a() {
        synchronized (this.f11743g) {
            V.e eVar = this.f11742f;
            Object[] objArr = eVar.f8759c;
            int i6 = eVar.f8761f;
            for (int i7 = 0; i7 < i6; i7++) {
                C1000w c1000w = (C1000w) objArr[i7];
                c1000w.f11729e.a();
                c1000w.f11730f.a();
                c1000w.f11736l.a();
                c1000w.f11737m.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x007a, B:11:0x0082, B:13:0x0092, B:15:0x0087, B:18:0x0022, B:21:0x002e, B:23:0x0043, B:25:0x0051, B:27:0x005b, B:29:0x0066, B:36:0x0073, B:39:0x0098), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.f11743g
            monitor-enter(r2)
            V.e r3 = r1.f11742f     // Catch: java.lang.Throwable -> L90
            int r4 = r3.f8761f     // Catch: java.lang.Throwable -> L90
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L98
            java.lang.Object[] r8 = r3.f8759c     // Catch: java.lang.Throwable -> L90
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L90
            f0.w r8 = (f0.C1000w) r8     // Catch: java.lang.Throwable -> L90
            k.M r9 = r8.f11730f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L90
            k.H r9 = (k.H) r9     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f12461b     // Catch: java.lang.Throwable -> L90
            int[] r11 = r9.f12462c     // Catch: java.lang.Throwable -> L90
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L90
            int r12 = r9.length     // Catch: java.lang.Throwable -> L90
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L90
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L90
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L90
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L90
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L90
            r8.c(r0, r1)     // Catch: java.lang.Throwable -> L90
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            k.M r1 = r8.f11730f     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L85
            int r7 = r7 + 1
            goto L92
        L85:
            if (r7 <= 0) goto L92
            java.lang.Object[] r1 = r3.f8759c     // Catch: java.lang.Throwable -> L90
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L90
            r1[r6] = r5     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto La4
        L92:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L98:
            java.lang.Object[] r0 = r3.f8759c     // Catch: java.lang.Throwable -> L90
            int r1 = r4 - r7
            r5 = 0
            java.util.Arrays.fill(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> L90
            r3.f8761f = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)
            return
        La4:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C1001x.b(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        boolean z5;
        Set set;
        Set set2;
        synchronized (this.f11743g) {
            z5 = this.f11739c;
        }
        if (z5) {
            return false;
        }
        boolean z6 = false;
        while (true) {
            AtomicReference atomicReference = this.f11738b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC0629s.b("Unexpected notification");
                        throw new RuntimeException();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z6;
            }
            synchronized (this.f11743g) {
                V.e eVar = this.f11742f;
                Object[] objArr = eVar.f8759c;
                int i6 = eVar.f8761f;
                for (int i7 = 0; i7 < i6; i7++) {
                    z6 = ((C1000w) objArr[i7]).a(set) || z6;
                }
            }
        }
    }

    public final void d(Object obj, l4.c cVar, InterfaceC1193a interfaceC1193a) {
        Object obj2;
        C1000w c1000w;
        boolean z5;
        H h3;
        AbstractC0983f c0976f;
        AbstractC0983f j3;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i6;
        long[] jArr2;
        long j4;
        synchronized (this.f11743g) {
            V.e eVar = this.f11742f;
            Object[] objArr = eVar.f8759c;
            int i7 = eVar.f8761f;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i8];
                if (((C1000w) obj2).a == cVar) {
                    break;
                } else {
                    i8++;
                }
            }
            c1000w = (C1000w) obj2;
            z5 = true;
            if (c1000w == null) {
                AbstractC1276k.d(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                AbstractC1291z.b(1, cVar);
                c1000w = new C1000w(cVar);
                eVar.b(c1000w);
            }
        }
        C1000w c1000w2 = this.f11745i;
        long j5 = this.f11746j;
        if (j5 != -1 && j5 != AbstractC0874g.b()) {
            AbstractC0619m0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j5 + "), currentThread={id=" + AbstractC0874g.b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f11745i = c1000w;
            this.f11746j = AbstractC0874g.b();
            W0.e eVar2 = this.f11741e;
            Object obj5 = c1000w.f11726b;
            H h6 = c1000w.f11727c;
            int i9 = c1000w.f11728d;
            c1000w.f11726b = obj;
            c1000w.f11727c = (H) c1000w.f11730f.g(obj);
            if (c1000w.f11728d == -1) {
                c1000w.f11728d = Long.hashCode(AbstractC0992o.j().g());
            }
            C0624p c0624p = c1000w.f11733i;
            V.e q3 = T.r.q();
            try {
                q3.b(c0624p);
                if (eVar2 == null) {
                    interfaceC1193a.b();
                    h3 = h6;
                } else {
                    AbstractC0983f abstractC0983f = (AbstractC0983f) AbstractC0992o.f11706b.e();
                    if (abstractC0983f instanceof C0976F) {
                        h3 = h6;
                        if (((C0976F) abstractC0983f).f11658t == AbstractC0874g.b()) {
                            l4.c cVar2 = ((C0976F) abstractC0983f).f11656r;
                            l4.c cVar3 = ((C0976F) abstractC0983f).f11657s;
                            try {
                                ((C0976F) abstractC0983f).f11656r = AbstractC0992o.k(eVar2, cVar2, true);
                                ((C0976F) abstractC0983f).f11657s = cVar3;
                                interfaceC1193a.b();
                                ((C0976F) abstractC0983f).f11656r = cVar2;
                                ((C0976F) abstractC0983f).f11657s = cVar3;
                            } catch (Throwable th) {
                                ((C0976F) abstractC0983f).f11656r = cVar2;
                                ((C0976F) abstractC0983f).f11657s = cVar3;
                                throw th;
                            }
                        }
                    } else {
                        h3 = h6;
                    }
                    try {
                        try {
                            if (abstractC0983f != null && !(abstractC0983f instanceof C0979b)) {
                                c0976f = abstractC0983f.u(eVar2);
                                j3 = c0976f.j();
                                interfaceC1193a.b();
                                AbstractC0983f.q(j3);
                                c0976f.c();
                            }
                            interfaceC1193a.b();
                            AbstractC0983f.q(j3);
                            c0976f.c();
                        } catch (Throwable th2) {
                            try {
                                AbstractC0983f.q(j3);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    c0976f.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    q3.k(q3.f8761f - 1);
                                    throw th;
                                }
                            }
                        }
                        j3 = c0976f.j();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    c0976f = new C0976F(abstractC0983f instanceof C0979b ? (C0979b) abstractC0983f : null, eVar2, null, true, false);
                }
                q3.k(q3.f8761f - 1);
                Object obj6 = c1000w.f11726b;
                AbstractC1276k.c(obj6);
                int i10 = c1000w.f11728d;
                H h7 = c1000w.f11727c;
                if (h7 != null) {
                    long[] jArr3 = h7.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j6 = jArr3[i11];
                            boolean z6 = z5;
                            obj4 = obj5;
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                int i13 = 0;
                                while (i13 < i12) {
                                    if ((j6 & 255) < 128) {
                                        i6 = i13;
                                        int i14 = (i11 << 3) + i6;
                                        jArr2 = jArr3;
                                        Object obj7 = h7.f12461b[i14];
                                        j4 = j6;
                                        boolean z7 = h7.f12462c[i14] != i10 ? z6 : false;
                                        if (z7) {
                                            c1000w.c(obj6, obj7);
                                        }
                                        if (z7) {
                                            h7.f(i14);
                                        }
                                    } else {
                                        i6 = i13;
                                        jArr2 = jArr3;
                                        j4 = j6;
                                    }
                                    j6 = j4 >> 8;
                                    i13 = i6 + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i12 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                            z5 = z6;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                        c1000w.f11726b = obj3;
                        c1000w.f11727c = h3;
                        c1000w.f11728d = i9;
                        this.f11745i = c1000w2;
                        this.f11746j = j5;
                    }
                }
                obj3 = obj5;
                c1000w.f11726b = obj3;
                c1000w.f11727c = h3;
                c1000w.f11728d = i9;
                this.f11745i = c1000w2;
                this.f11746j = j5;
            } catch (Throwable th6) {
                th = th6;
            }
        } finally {
            this.f11745i = c1000w2;
            this.f11746j = j5;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    public final void e() {
        B4.D d6 = this.f11740d;
        AbstractC0992o.e(AbstractC0992o.a);
        synchronized (AbstractC0992o.f11707c) {
            AbstractC0992o.f11712h = Y3.m.A0(AbstractC0992o.f11712h, d6);
        }
        this.f11744h = new C0914b(d6, 3);
    }
}
