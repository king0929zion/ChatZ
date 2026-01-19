package E4;

import com.vladsch.flexmark.util.format.TableCell;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.C1288w;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1334l = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final m f1335c;

    /* renamed from: e, reason: collision with root package name */
    public final C1288w f1336e;

    /* renamed from: f, reason: collision with root package name */
    public b f1337f;

    /* renamed from: g, reason: collision with root package name */
    public long f1338g;

    /* renamed from: h, reason: collision with root package name */
    public long f1339h;

    /* renamed from: i, reason: collision with root package name */
    public int f1340i;
    private volatile int indexInArray;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1341j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f1342k;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [m4.w, java.lang.Object] */
    public a(c cVar, int i6) {
        this.f1342k = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f1335c = new m();
        this.f1336e = new Object();
        this.f1337f = b.f1346g;
        this.nextParkedWorker = c.f1352n;
        int nanoTime = (int) System.nanoTime();
        this.f1340i = nanoTime == 0 ? 42 : nanoTime;
        f(i6);
    }

    public final i a(boolean z5) {
        i e6;
        i e7;
        long j3;
        b bVar = this.f1337f;
        c cVar = this.f1342k;
        i iVar = null;
        m mVar = this.f1335c;
        b bVar2 = b.f1343c;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f1350l;
            do {
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1373b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f1365e) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i6 = m.f1375d.get(mVar);
                    int i7 = m.f1374c.get(mVar);
                    while (true) {
                        if (i6 == i7 || m.f1376e.get(mVar) == 0) {
                            break;
                        }
                        i7--;
                        i c6 = mVar.c(i7, true);
                        if (c6 != null) {
                            iVar = c6;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f1358i.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f1350l.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f1337f = bVar2;
        }
        if (z5) {
            boolean z6 = d(cVar.f1353c * 2) == 0;
            if (z6 && (e7 = e()) != null) {
                return e7;
            }
            mVar.getClass();
            i iVar4 = (i) m.f1373b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z6 && (e6 = e()) != null) {
                return e6;
            }
        } else {
            i e8 = e();
            if (e8 != null) {
                return e8;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i6) {
        int i7 = this.f1340i;
        int i8 = i7 ^ (i7 << 13);
        int i9 = i8 ^ (i8 >> 17);
        int i10 = i9 ^ (i9 << 5);
        this.f1340i = i10;
        int i11 = i6 - 1;
        return (i11 & i6) == 0 ? i10 & i11 : (i10 & TableCell.NOT_TRACKED) % i6;
    }

    public final i e() {
        int d6 = d(2);
        c cVar = this.f1342k;
        if (d6 == 0) {
            i iVar = (i) cVar.f1357h.d();
            return iVar != null ? iVar : (i) cVar.f1358i.d();
        }
        i iVar2 = (i) cVar.f1358i.d();
        return iVar2 != null ? iVar2 : (i) cVar.f1357h.d();
    }

    public final void f(int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1342k.f1356g);
        sb.append("-worker-");
        sb.append(i6 == 0 ? "TERMINATED" : String.valueOf(i6));
        setName(sb.toString());
        this.indexInArray = i6;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f1337f;
        boolean z5 = bVar2 == b.f1343c;
        if (z5) {
            c.f1350l.addAndGet(this.f1342k, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f1337f = bVar;
        }
        return z5;
    }

    public final i i(int i6) {
        long j3;
        i iVar;
        long j4;
        long j5;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f1350l;
        c cVar = this.f1342k;
        int i7 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i7 < 2) {
            return null;
        }
        int d6 = d(i7);
        int i8 = 0;
        long j6 = Long.MAX_VALUE;
        while (i8 < i7) {
            d6++;
            if (d6 > i7) {
                d6 = 1;
            }
            a aVar = (a) cVar.f1359j.b(d6);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f1335c;
                if (i6 == 3) {
                    iVar = mVar.b();
                    j3 = 0;
                } else {
                    mVar.getClass();
                    int i9 = m.f1375d.get(mVar);
                    int i10 = m.f1374c.get(mVar);
                    boolean z5 = i6 == 1;
                    while (true) {
                        if (i9 == i10) {
                            j3 = 0;
                            break;
                        }
                        j3 = 0;
                        if (!z5 || m.f1376e.get(mVar) != 0) {
                            int i11 = i9 + 1;
                            iVar = mVar.c(i9, z5);
                            if (iVar != null) {
                                break;
                            }
                            i9 = i11;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                C1288w c1288w = this.f1336e;
                if (iVar != null) {
                    c1288w.f12973c = iVar;
                    iVar2 = iVar3;
                    j5 = -1;
                    j4 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f1373b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j4 = -1;
                            break;
                        }
                        j4 = -1;
                        if (((iVar4.f1365e ? 1 : 2) & i6) == 0) {
                            break;
                        }
                        k.f1371f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f1364c;
                        long j7 = k.f1367b;
                        if (nanoTime < j7) {
                            j5 = j7 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                c1288w.f12973c = iVar4;
                                j5 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j5 = -2;
                    iVar2 = iVar3;
                }
                if (j5 == j4) {
                    i iVar5 = (i) c1288w.f12973c;
                    c1288w.f12973c = iVar2;
                    return iVar5;
                }
                if (j5 > j3) {
                    j6 = Math.min(j6, j5);
                }
            }
            i8++;
            iVar3 = null;
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = 0;
        }
        this.f1339h = j6;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.a.run():void");
    }
}
