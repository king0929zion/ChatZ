package E4;

import C4.q;
import C4.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m4.AbstractC1276k;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1349k = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1350l = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1351m = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final u f1352n = new u("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final int f1353c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final int f1354e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1355f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1356g;

    /* renamed from: h, reason: collision with root package name */
    public final f f1357h;

    /* renamed from: i, reason: collision with root package name */
    public final f f1358i;

    /* renamed from: j, reason: collision with root package name */
    public final q f1359j;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r3v13, types: [C4.l, E4.f] */
    /* JADX WARN: Type inference failed for: r3v14, types: [C4.l, E4.f] */
    public c(long j3, String str, int i6, int i7) {
        this.f1353c = i6;
        this.f1354e = i7;
        this.f1355f = j3;
        this.f1356g = str;
        if (i6 < 1) {
            throw new IllegalArgumentException(B3.e.l("Core pool size ", i6, " should be at least 1").toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(B3.e.k("Max pool size ", i7, i6, " should be greater than or equals to core pool size ").toString());
        }
        if (i7 > 2097150) {
            throw new IllegalArgumentException(B3.e.l("Max pool size ", i7, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f1357h = new C4.l();
        this.f1358i = new C4.l();
        this.f1359j = new q((i6 + 1) * 2);
        this.controlState$volatile = i6 << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void f(c cVar, Runnable runnable, int i6) {
        cVar.d(runnable, false, (i6 & 4) == 0);
    }

    public final int c() {
        synchronized (this.f1359j) {
            try {
                if (f1351m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1350l;
                long j3 = atomicLongFieldUpdater.get(this);
                int i6 = (int) (j3 & 2097151);
                int i7 = i6 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i7 >= this.f1353c) {
                    return 0;
                }
                if (i6 >= this.f1354e) {
                    return 0;
                }
                int i8 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f1359j.b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i8);
                this.f1359j.c(i8, aVar);
                if (i8 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = i7 + 1;
                aVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = E4.c.f1351m
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof E4.a
            r3 = 0
            if (r1 == 0) goto L17
            E4.a r0 = (E4.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            E4.c r1 = r0.f1342k
            boolean r1 = m4.AbstractC1276k.b(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            C4.q r1 = r8.f1359j
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = E4.c.f1350l     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            C4.q r5 = r8.f1359j
            java.lang.Object r5 = r5.b(r1)
            m4.AbstractC1276k.c(r5)
            E4.a r5 = (E4.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            E4.m r5 = r5.f1335c
            E4.f r6 = r8.f1358i
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = E4.m.f1373b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            E4.i r7 = (E4.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            E4.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            E4.f r1 = r8.f1358i
            r1.b()
            E4.f r1 = r8.f1357h
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            E4.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            E4.f r1 = r8.f1357h
            java.lang.Object r1 = r1.d()
            E4.i r1 = (E4.i) r1
            if (r1 != 0) goto Lb2
            E4.f r1 = r8.f1358i
            java.lang.Object r1 = r1.d()
            E4.i r1 = (E4.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            E4.b r1 = E4.b.f1347h
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = E4.c.f1349k
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = E4.c.f1350l
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.c.close():void");
    }

    public final void d(Runnable runnable, boolean z5, boolean z6) {
        i jVar;
        b bVar;
        k.f1371f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f1364c = nanoTime;
            jVar.f1365e = z5;
        } else {
            jVar = new j(runnable, nanoTime, z5);
        }
        boolean z7 = jVar.f1365e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1350l;
        long addAndGet = z7 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !AbstractC1276k.b(aVar.f1342k, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f1337f) != b.f1347h && (jVar.f1365e || bVar != b.f1344e)) {
            aVar.f1341j = true;
            m mVar = aVar.f1335c;
            if (z6) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f1373b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f1365e ? this.f1358i.a(jVar) : this.f1357h.a(jVar))) {
                throw new RejectedExecutionException(B3.e.s(new StringBuilder(), this.f1356g, " was terminated"));
            }
        }
        boolean z8 = z6 && aVar != null;
        if (z7) {
            if (z8 || p() || j(addAndGet)) {
                return;
            }
            p();
            return;
        }
        if (z8 || p() || j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        p();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(this, runnable, 6);
    }

    public final void h(a aVar, int i6, int i7) {
        while (true) {
            long j3 = f1349k.get(this);
            int i8 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i8 == i6) {
                if (i7 == 0) {
                    Object c6 = aVar.c();
                    while (true) {
                        if (c6 == f1352n) {
                            i8 = -1;
                            break;
                        }
                        if (c6 == null) {
                            i8 = 0;
                            break;
                        }
                        a aVar2 = (a) c6;
                        int b5 = aVar2.b();
                        if (b5 != 0) {
                            i8 = b5;
                            break;
                        }
                        c6 = aVar2.c();
                    }
                } else {
                    i8 = i7;
                }
            }
            if (i8 >= 0) {
                if (f1349k.compareAndSet(this, j3, i8 | j4)) {
                    return;
                }
            }
        }
    }

    public final boolean j(long j3) {
        int i6 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = this.f1353c;
        if (i6 < i7) {
            int c6 = c();
            if (c6 == 1 && i7 > 1) {
                c();
            }
            if (c6 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        u uVar;
        int i6;
        while (true) {
            long j3 = f1349k.get(this);
            a aVar = (a) this.f1359j.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c6 = aVar.c();
                while (true) {
                    uVar = f1352n;
                    if (c6 == uVar) {
                        i6 = -1;
                        break;
                    }
                    if (c6 == null) {
                        i6 = 0;
                        break;
                    }
                    a aVar2 = (a) c6;
                    i6 = aVar2.b();
                    if (i6 != 0) {
                        break;
                    }
                    c6 = aVar2.c();
                }
                if (i6 >= 0) {
                    if (f1349k.compareAndSet(this, j3, i6 | j4)) {
                        aVar.g(uVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1334l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f1359j;
        int a = qVar.a();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < a; i11++) {
            a aVar = (a) qVar.b(i11);
            if (aVar != null) {
                m mVar = aVar.f1335c;
                mVar.getClass();
                int i12 = m.f1373b.get(mVar) != null ? (m.f1374c.get(mVar) - m.f1375d.get(mVar)) + 1 : m.f1374c.get(mVar) - m.f1375d.get(mVar);
                int ordinal = aVar.f1337f.ordinal();
                if (ordinal == 0) {
                    i6++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i12);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i12);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i8++;
                } else if (ordinal == 3) {
                    i9++;
                    if (i12 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i12);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new RuntimeException();
                    }
                    i10++;
                }
            }
        }
        long j3 = f1350l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1356g);
        sb4.append('@');
        sb4.append(AbstractC1888A.q(this));
        sb4.append("[Pool Size {core = ");
        int i13 = this.f1353c;
        sb4.append(i13);
        sb4.append(", max = ");
        sb4.append(this.f1354e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i6);
        sb4.append(", blocking = ");
        sb4.append(i7);
        sb4.append(", parked = ");
        sb4.append(i8);
        sb4.append(", dormant = ");
        sb4.append(i9);
        sb4.append(", terminated = ");
        sb4.append(i10);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1357h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1358i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i13 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
