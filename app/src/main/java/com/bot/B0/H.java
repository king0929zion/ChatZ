package B0;

import F0.InterfaceC0134w;
import android.graphics.Typeface;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.html.Attribute;
import f0.C0987j;
import i0.InterfaceC1068g;
import i4.AbstractC1117a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;
import m4.C1270e;
import n.AbstractC1343r;
import n.I0;
import n.InterfaceC1292A;
import z1.C2016a;
import z1.C2017b;

/* loaded from: classes.dex */
public final class H implements InterfaceC1068g, I0 {

    /* renamed from: c, reason: collision with root package name */
    public Object f391c;

    /* renamed from: e, reason: collision with root package name */
    public Object f392e;

    /* renamed from: f, reason: collision with root package name */
    public Object f393f;

    /* renamed from: g, reason: collision with root package name */
    public Object f394g;

    public H(Z z5, androidx.lifecycle.W w5, F1.c cVar) {
        AbstractC1276k.f(z5, "store");
        AbstractC1276k.f(w5, "factory");
        AbstractC1276k.f(cVar, "defaultExtras");
        this.f391c = z5;
        this.f392e = w5;
        this.f393f = cVar;
        this.f394g = new Object();
    }

    @Override // n.F0
    public long b(AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        int b5 = abstractC1343r.b();
        long j3 = 0;
        for (int i6 = 0; i6 < b5; i6++) {
            j3 = Math.max(j3, ((C0987j) this.f391c).w(i6).c(abstractC1343r.a(i6), abstractC1343r2.a(i6), abstractC1343r3.a(i6)));
        }
        return j3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public void c(C0040p c0040p, boolean z5) {
        I i6 = (I) this.f394g;
        ?? r12 = c0040p.a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((y) r12.get(i7)).b()) {
                k(c0040p);
                return;
            }
        }
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f391c;
        if (interfaceC0134w == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        AbstractC0047x.i(c0040p, interfaceC0134w.U(0L), new F(0, this, i6), false);
        if (((E) this.f392e) == E.f383e) {
            if (z5) {
                int size2 = r12.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    ((y) r12.get(i8)).a();
                }
            }
            C0033i c0033i = c0040p.f470b;
            if (c0033i != null) {
                c0033i.f452c = !i6.f396c;
            }
        }
    }

    public synchronized ExecutorService d() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f391c) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = R4.b.f7083f + " Dispatcher";
                AbstractC1276k.f(str, Attribute.NAME_ATTR);
                this.f391c = new ThreadPoolExecutor(0, TableCell.NOT_TRACKED, 60L, timeUnit, synchronousQueue, new R4.a(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f391c;
            AbstractC1276k.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void e(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        j();
    }

    public void f(U4.f fVar) {
        fVar.f8709e.decrementAndGet();
        e((ArrayDeque) this.f393f, fVar);
    }

    public androidx.lifecycle.U g(C1270e c1270e, String str) {
        androidx.lifecycle.U u5;
        androidx.lifecycle.U a;
        AbstractC1276k.f(str, "key");
        synchronized (((H1.c) this.f394g)) {
            try {
                Z z5 = (Z) this.f391c;
                z5.getClass();
                u5 = (androidx.lifecycle.U) z5.a.get(str);
                if (c1270e.d(u5)) {
                    androidx.lifecycle.W w5 = (androidx.lifecycle.W) this.f392e;
                    if (w5 instanceof androidx.lifecycle.S) {
                        androidx.lifecycle.S s5 = (androidx.lifecycle.S) w5;
                        AbstractC1276k.c(u5);
                        s5.getClass();
                        androidx.lifecycle.O o5 = s5.f10859d;
                        if (o5 != null) {
                            M.q qVar = s5.f10860e;
                            AbstractC1276k.c(qVar);
                            androidx.lifecycle.O.b(u5, qVar, o5);
                        }
                    }
                    AbstractC1276k.d(u5, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    F1.f fVar = new F1.f((F1.c) this.f393f);
                    fVar.a.put(Y.f10865b, str);
                    androidx.lifecycle.W w6 = (androidx.lifecycle.W) this.f392e;
                    AbstractC1276k.f(w6, "factory");
                    try {
                        try {
                            a = w6.c(c1270e, fVar);
                        } catch (AbstractMethodError unused) {
                            a = w6.a(AbstractC1117a.o(c1270e));
                        }
                    } catch (AbstractMethodError unused2) {
                        a = w6.b(AbstractC1117a.o(c1270e), fVar);
                    }
                    u5 = a;
                    Z z6 = (Z) this.f391c;
                    z6.getClass();
                    AbstractC1276k.f(u5, "viewModel");
                    androidx.lifecycle.U u6 = (androidx.lifecycle.U) z6.a.put(str, u5);
                    if (u6 != null) {
                        u6.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u5;
    }

    @Override // n.F0
    public AbstractC1343r h(AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        if (((AbstractC1343r) this.f394g) == null) {
            this.f394g = abstractC1343r3.c();
        }
        AbstractC1343r abstractC1343r4 = (AbstractC1343r) this.f394g;
        if (abstractC1343r4 == null) {
            AbstractC1276k.k("endVelocityVector");
            throw null;
        }
        int b5 = abstractC1343r4.b();
        for (int i6 = 0; i6 < b5; i6++) {
            AbstractC1343r abstractC1343r5 = (AbstractC1343r) this.f394g;
            if (abstractC1343r5 == null) {
                AbstractC1276k.k("endVelocityVector");
                throw null;
            }
            abstractC1343r5.e(((C0987j) this.f391c).w(i6).d(abstractC1343r.a(i6), abstractC1343r2.a(i6), abstractC1343r3.a(i6)), i6);
        }
        AbstractC1343r abstractC1343r6 = (AbstractC1343r) this.f394g;
        if (abstractC1343r6 != null) {
            return abstractC1343r6;
        }
        AbstractC1276k.k("endVelocityVector");
        throw null;
    }

    @Override // n.F0
    public AbstractC1343r i(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        if (((AbstractC1343r) this.f392e) == null) {
            this.f392e = abstractC1343r.c();
        }
        AbstractC1343r abstractC1343r4 = (AbstractC1343r) this.f392e;
        if (abstractC1343r4 == null) {
            AbstractC1276k.k("valueVector");
            throw null;
        }
        int b5 = abstractC1343r4.b();
        for (int i6 = 0; i6 < b5; i6++) {
            AbstractC1343r abstractC1343r5 = (AbstractC1343r) this.f392e;
            if (abstractC1343r5 == null) {
                AbstractC1276k.k("valueVector");
                throw null;
            }
            abstractC1343r5.e(((C0987j) this.f391c).w(i6).e(j3, abstractC1343r.a(i6), abstractC1343r2.a(i6), abstractC1343r3.a(i6)), i6);
        }
        AbstractC1343r abstractC1343r6 = (AbstractC1343r) this.f392e;
        if (abstractC1343r6 != null) {
            return abstractC1343r6;
        }
        AbstractC1276k.k("valueVector");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            r8 = this;
            byte[] r0 = R4.b.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.f392e     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            m4.AbstractC1276k.e(r1, r2)     // Catch: java.lang.Throwable -> L49
        L15:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L49
            U4.f r2 = (U4.f) r2     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r8.f393f     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L49
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L49
            r4 = 64
            if (r3 >= r4) goto L4b
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f8709e     // Catch: java.lang.Throwable -> L49
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L49
            r4 = 5
            if (r3 >= r4) goto L15
            r1.remove()     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f8709e     // Catch: java.lang.Throwable -> L49
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L49
            r0.add(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r8.f393f     // Catch: java.lang.Throwable -> L49
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L49
            r3.add(r2)     // Catch: java.lang.Throwable -> L49
            goto L15
        L49:
            r0 = move-exception
            goto La4
        L4b:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L49
            java.lang.Object r1 = r8.f393f     // Catch: java.lang.Throwable -> La1
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> La1
            r1.size()     // Catch: java.lang.Throwable -> La1
            java.lang.Object r1 = r8.f394g     // Catch: java.lang.Throwable -> La1
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> La1
            r1.size()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L61:
            if (r2 >= r1) goto La0
            java.lang.Object r3 = r0.get(r2)
            U4.f r3 = (U4.f) r3
            java.util.concurrent.ExecutorService r4 = r8.d()
            r3.getClass()
            U4.i r5 = r3.f8710f
            byte[] r6 = R4.b.a
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L7a java.lang.Throwable -> L97
            r4.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L7a java.lang.Throwable -> L97
            goto L94
        L7a:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L97
            r6.initCause(r4)     // Catch: java.lang.Throwable -> L97
            r5.i(r6)     // Catch: java.lang.Throwable -> L97
            Q4.e r4 = r3.f8708c     // Catch: java.lang.Throwable -> L97
            r4.a(r5, r6)     // Catch: java.lang.Throwable -> L97
            Q4.t r4 = r5.f8712c
            B0.H r4 = r4.f6605c
            r4.f(r3)
        L94:
            int r2 = r2 + 1
            goto L61
        L97:
            r0 = move-exception
            Q4.t r1 = r5.f8712c
            B0.H r1 = r1.f6605c
            r1.f(r3)
            throw r0
        La0:
            return
        La1:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> La1
            throw r0     // Catch: java.lang.Throwable -> L49
        La4:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.H.j():void");
    }

    public void k(C0040p c0040p) {
        if (((E) this.f392e) == E.f383e) {
            InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f391c;
            if (interfaceC0134w == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            AbstractC0047x.i(c0040p, interfaceC0134w.U(0L), new G((I) this.f394g, 0), true);
        }
        this.f392e = E.f384f;
    }

    @Override // n.F0
    public AbstractC1343r q(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        if (((AbstractC1343r) this.f393f) == null) {
            this.f393f = abstractC1343r3.c();
        }
        AbstractC1343r abstractC1343r4 = (AbstractC1343r) this.f393f;
        if (abstractC1343r4 == null) {
            AbstractC1276k.k("velocityVector");
            throw null;
        }
        int b5 = abstractC1343r4.b();
        for (int i6 = 0; i6 < b5; i6++) {
            AbstractC1343r abstractC1343r5 = (AbstractC1343r) this.f393f;
            if (abstractC1343r5 == null) {
                AbstractC1276k.k("velocityVector");
                throw null;
            }
            abstractC1343r5.e(((C0987j) this.f391c).w(i6).b(j3, abstractC1343r.a(i6), abstractC1343r2.a(i6), abstractC1343r3.a(i6)), i6);
        }
        AbstractC1343r abstractC1343r6 = (AbstractC1343r) this.f393f;
        if (abstractC1343r6 != null) {
            return abstractC1343r6;
        }
        AbstractC1276k.k("velocityVector");
        throw null;
    }

    public H() {
        this.f392e = new ArrayDeque();
        this.f393f = new ArrayDeque();
        this.f394g = new ArrayDeque();
    }

    public H(Typeface typeface, C2017b c2017b) {
        int i6;
        int i7;
        int i8;
        int i9;
        this.f394g = typeface;
        this.f391c = c2017b;
        this.f393f = new y1.t(PegdownExtensions.ANCHORLINKS);
        int a = c2017b.a(6);
        if (a != 0) {
            int i10 = a + c2017b.f10521c;
            i6 = ((ByteBuffer) c2017b.f10524g).getInt(((ByteBuffer) c2017b.f10524g).getInt(i10) + i10);
        } else {
            i6 = 0;
        }
        this.f392e = new char[i6 * 2];
        int a6 = c2017b.a(6);
        if (a6 != 0) {
            int i11 = a6 + c2017b.f10521c;
            i7 = ((ByteBuffer) c2017b.f10524g).getInt(((ByteBuffer) c2017b.f10524g).getInt(i11) + i11);
        } else {
            i7 = 0;
        }
        for (int i12 = 0; i12 < i7; i12++) {
            y1.u uVar = new y1.u(this, i12);
            C2016a b5 = uVar.b();
            int a7 = b5.a(4);
            Character.toChars(a7 != 0 ? ((ByteBuffer) b5.f10524g).getInt(a7 + b5.f10521c) : 0, (char[]) this.f392e, i12 * 2);
            C2016a b6 = uVar.b();
            int a8 = b6.a(16);
            if (a8 != 0) {
                int i13 = a8 + b6.f10521c;
                i8 = ((ByteBuffer) b6.f10524g).getInt(((ByteBuffer) b6.f10524g).getInt(i13) + i13);
            } else {
                i8 = 0;
            }
            if (i8 > 0) {
                y1.t tVar = (y1.t) this.f393f;
                C2016a b7 = uVar.b();
                int a9 = b7.a(16);
                if (a9 != 0) {
                    int i14 = a9 + b7.f10521c;
                    i9 = ((ByteBuffer) b7.f10524g).getInt(((ByteBuffer) b7.f10524g).getInt(i14) + i14);
                } else {
                    i9 = 0;
                }
                tVar.a(uVar, 0, i9 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public H(C0987j c0987j) {
        this.f391c = c0987j;
    }

    public H(InterfaceC1292A interfaceC1292A) {
        this(new C0987j(interfaceC1292A, 9));
    }
}
