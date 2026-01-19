package A4;

import B4.AbstractC0049b;
import B4.AbstractC0050c;
import B4.AbstractC0051d;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import java.util.Arrays;
import m4.AbstractC1276k;
import x4.C1925h;
import x4.C1928k;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public class V extends AbstractC0049b implements N, InterfaceC0007h, B4.w {

    /* renamed from: h, reason: collision with root package name */
    public final int f213h;

    /* renamed from: i, reason: collision with root package name */
    public final int f214i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC2050a f215j;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f216k;

    /* renamed from: l, reason: collision with root package name */
    public long f217l;

    /* renamed from: m, reason: collision with root package name */
    public long f218m;

    /* renamed from: n, reason: collision with root package name */
    public int f219n;

    /* renamed from: o, reason: collision with root package name */
    public int f220o;

    public V(int i6, int i7, EnumC2050a enumC2050a) {
        this.f213h = i6;
        this.f214i = i7;
        this.f215j = enumC2050a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0078, B:21:0x0082, B:30:0x0095, B:33:0x009c, B:34:0x00a0, B:36:0x00a1, B:42:0x0049), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [B4.b] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [A4.V] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [A4.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [B4.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [A4.X] */
    /* JADX WARN: Type inference failed for: r9v8, types: [A4.X] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00af -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(A4.V r8, A4.InterfaceC0008i r9, b4.InterfaceC0905c r10) {
        /*
            boolean r0 = r10 instanceof A4.U
            if (r0 == 0) goto L13
            r0 = r10
            A4.U r0 = (A4.U) r0
            int r1 = r0.f212m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212m = r1
            goto L18
        L13:
            A4.U r0 = new A4.U
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f210k
            int r1 = r0.f212m
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5c
            r8 = 1
            if (r1 == r8) goto L4d
            if (r1 == r3) goto L41
            if (r1 != r2) goto L39
            x4.e0 r8 = r0.f209j
            A4.X r9 = r0.f208i
            A4.i r1 = r0.f207h
            A4.V r4 = r0.f206g
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L75
        L36:
            r8 = move-exception
            goto Lb5
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            x4.e0 r8 = r0.f209j
            A4.X r9 = r0.f208i
            A4.i r1 = r0.f207h
            A4.V r4 = r0.f206g
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L36
            goto L78
        L4d:
            A4.X r9 = r0.f208i
            A4.i r8 = r0.f207h
            A4.V r1 = r0.f206g
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L59
            r10 = r8
            r8 = r1
            goto L68
        L59:
            r8 = move-exception
            r4 = r1
            goto Lb5
        L5c:
            X3.a.e(r10)
            B4.d r10 = r8.d()
            A4.X r10 = (A4.X) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            b4.h r1 = r0.f11435e     // Catch: java.lang.Throwable -> Lb2
            m4.AbstractC1276k.c(r1)     // Catch: java.lang.Throwable -> Lb2
            x4.w r4 = x4.C1940w.f15731e     // Catch: java.lang.Throwable -> Lb2
            b4.f r1 = r1.r(r4)     // Catch: java.lang.Throwable -> Lb2
            x4.e0 r1 = (x4.InterfaceC1922e0) r1     // Catch: java.lang.Throwable -> Lb2
        L75:
            r4 = r8
            r8 = r1
            r1 = r10
        L78:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            C4.u r5 = A4.W.a     // Catch: java.lang.Throwable -> L36
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r10 != r5) goto L93
            r0.f206g = r4     // Catch: java.lang.Throwable -> L36
            r0.f207h = r1     // Catch: java.lang.Throwable -> L36
            r0.f208i = r9     // Catch: java.lang.Throwable -> L36
            r0.f209j = r8     // Catch: java.lang.Throwable -> L36
            r0.f212m = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.j(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L78
            goto Lb1
        L93:
            if (r8 == 0) goto La1
            boolean r5 = r8.d()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9c
            goto La1
        L9c:
            java.util.concurrent.CancellationException r8 = r8.y()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        La1:
            r0.f206g = r4     // Catch: java.lang.Throwable -> L36
            r0.f207h = r1     // Catch: java.lang.Throwable -> L36
            r0.f208i = r9     // Catch: java.lang.Throwable -> L36
            r0.f209j = r8     // Catch: java.lang.Throwable -> L36
            r0.f212m = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.a(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lb1:
            return
        Lb2:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb5:
            r4.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.V.l(A4.V, A4.i, b4.c):void");
    }

    @Override // A4.N, A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        Throwable th;
        InterfaceC0905c[] o5;
        T t5;
        if (h(obj)) {
            return X3.y.a;
        }
        C1928k c1928k = new C1928k(1, Y4.d.K(interfaceC0905c));
        c1928k.t();
        InterfaceC0905c[] interfaceC0905cArr = AbstractC0050c.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        c1928k.k(X3.y.a);
                        o5 = o(interfaceC0905cArr);
                        t5 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        T t6 = new T(this, p() + this.f219n + this.f220o, obj, c1928k);
                        n(t6);
                        this.f220o++;
                        if (this.f214i == 0) {
                            interfaceC0905cArr = o(interfaceC0905cArr);
                        }
                        o5 = interfaceC0905cArr;
                        t5 = t6;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (t5 != null) {
                    c1928k.x(new C1925h(t5, 2));
                }
                for (InterfaceC0905c interfaceC0905c2 : o5) {
                    if (interfaceC0905c2 != null) {
                        interfaceC0905c2.k(X3.y.a);
                    }
                }
                Object s5 = c1928k.s();
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (s5 != enumC0927a) {
                    s5 = X3.y.a;
                }
                return s5 == enumC0927a ? s5 : X3.y.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // A4.InterfaceC0007h
    public final Object b(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        l(this, interfaceC0008i, interfaceC0905c);
        return EnumC0927a.f11114c;
    }

    @Override // B4.w
    public final InterfaceC0007h c(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return W.l(this, interfaceC0910h, i6, enumC2050a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A4.X, B4.d, java.lang.Object] */
    @Override // B4.AbstractC0049b
    public final AbstractC0051d e() {
        ?? obj = new Object();
        obj.a = -1L;
        return obj;
    }

    @Override // B4.AbstractC0049b
    public final AbstractC0051d[] f() {
        return new X[2];
    }

    @Override // A4.N
    public final boolean h(Object obj) {
        int i6;
        boolean z5;
        InterfaceC0905c[] interfaceC0905cArr = AbstractC0050c.a;
        synchronized (this) {
            if (r(obj)) {
                interfaceC0905cArr = o(interfaceC0905cArr);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        for (InterfaceC0905c interfaceC0905c : interfaceC0905cArr) {
            if (interfaceC0905c != null) {
                interfaceC0905c.k(X3.y.a);
            }
        }
        return z5;
    }

    public final Object j(X x5, U u5) {
        C1928k c1928k = new C1928k(1, Y4.d.K(u5));
        c1928k.t();
        synchronized (this) {
            try {
                if (s(x5) < 0) {
                    x5.f223b = c1928k;
                } else {
                    c1928k.k(X3.y.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object s5 = c1928k.s();
        return s5 == EnumC0927a.f11114c ? s5 : X3.y.a;
    }

    public final void k() {
        if (this.f214i != 0 || this.f220o > 1) {
            Object[] objArr = this.f216k;
            AbstractC1276k.c(objArr);
            while (this.f220o > 0) {
                long p5 = p();
                int i6 = this.f219n;
                int i7 = this.f220o;
                if (objArr[((int) ((p5 + (i6 + i7)) - 1)) & (objArr.length - 1)] != W.a) {
                    return;
                }
                this.f220o = i7 - 1;
                W.d(objArr, p() + this.f219n + this.f220o, null);
            }
        }
    }

    public final void m() {
        AbstractC0051d[] abstractC0051dArr;
        Object[] objArr = this.f216k;
        AbstractC1276k.c(objArr);
        W.d(objArr, p(), null);
        this.f219n--;
        long p5 = p() + 1;
        if (this.f217l < p5) {
            this.f217l = p5;
        }
        if (this.f218m < p5) {
            if (this.f576e != 0 && (abstractC0051dArr = this.f575c) != null) {
                for (AbstractC0051d abstractC0051d : abstractC0051dArr) {
                    if (abstractC0051d != null) {
                        X x5 = (X) abstractC0051d;
                        long j3 = x5.a;
                        if (j3 >= 0 && j3 < p5) {
                            x5.a = p5;
                        }
                    }
                }
            }
            this.f218m = p5;
        }
    }

    public final void n(Object obj) {
        int i6 = this.f219n + this.f220o;
        Object[] objArr = this.f216k;
        if (objArr == null) {
            objArr = q(null, 0, 2);
        } else if (i6 >= objArr.length) {
            objArr = q(objArr, i6, objArr.length * 2);
        }
        W.d(objArr, p() + i6, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final InterfaceC0905c[] o(InterfaceC0905c[] interfaceC0905cArr) {
        AbstractC0051d[] abstractC0051dArr;
        X x5;
        C1928k c1928k;
        int length = interfaceC0905cArr.length;
        if (this.f576e != 0 && (abstractC0051dArr = this.f575c) != null) {
            int length2 = abstractC0051dArr.length;
            int i6 = 0;
            interfaceC0905cArr = interfaceC0905cArr;
            while (i6 < length2) {
                AbstractC0051d abstractC0051d = abstractC0051dArr[i6];
                if (abstractC0051d != null && (c1928k = (x5 = (X) abstractC0051d).f223b) != null && s(x5) >= 0) {
                    int length3 = interfaceC0905cArr.length;
                    interfaceC0905cArr = interfaceC0905cArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC0905cArr, Math.max(2, interfaceC0905cArr.length * 2));
                        AbstractC1276k.e(copyOf, "copyOf(...)");
                        interfaceC0905cArr = copyOf;
                    }
                    interfaceC0905cArr[length] = c1928k;
                    x5.f223b = null;
                    length++;
                }
                i6++;
                interfaceC0905cArr = interfaceC0905cArr;
            }
        }
        return interfaceC0905cArr;
    }

    public final long p() {
        return Math.min(this.f218m, this.f217l);
    }

    public final Object[] q(Object[] objArr, int i6, int i7) {
        if (i7 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i7];
        this.f216k = objArr2;
        if (objArr != null) {
            long p5 = p();
            for (int i8 = 0; i8 < i6; i8++) {
                long j3 = i8 + p5;
                W.d(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean r(Object obj) {
        int i6 = this.f576e;
        int i7 = this.f213h;
        if (i6 != 0) {
            int i8 = this.f219n;
            int i9 = this.f214i;
            if (i8 >= i9 && this.f218m <= this.f217l) {
                int ordinal = this.f215j.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                }
            }
            n(obj);
            int i10 = this.f219n + 1;
            this.f219n = i10;
            if (i10 > i9) {
                m();
            }
            long p5 = p() + this.f219n;
            long j3 = this.f217l;
            if (((int) (p5 - j3)) > i7) {
                u(1 + j3, this.f218m, p() + this.f219n, p() + this.f219n + this.f220o);
            }
        } else if (i7 != 0) {
            n(obj);
            int i11 = this.f219n + 1;
            this.f219n = i11;
            if (i11 > i7) {
                m();
            }
            this.f218m = p() + this.f219n;
            return true;
        }
        return true;
    }

    public final long s(X x5) {
        long j3 = x5.a;
        if (j3 < p() + this.f219n) {
            return j3;
        }
        if (this.f214i <= 0 && j3 <= p() && this.f220o != 0) {
            return j3;
        }
        return -1L;
    }

    public final Object t(X x5) {
        Object obj;
        InterfaceC0905c[] interfaceC0905cArr = AbstractC0050c.a;
        synchronized (this) {
            try {
                long s5 = s(x5);
                if (s5 < 0) {
                    obj = W.a;
                } else {
                    long j3 = x5.a;
                    Object[] objArr = this.f216k;
                    AbstractC1276k.c(objArr);
                    Object obj2 = objArr[((int) s5) & (objArr.length - 1)];
                    if (obj2 instanceof T) {
                        obj2 = ((T) obj2).f204f;
                    }
                    x5.a = s5 + 1;
                    Object obj3 = obj2;
                    interfaceC0905cArr = v(j3);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0905c interfaceC0905c : interfaceC0905cArr) {
            if (interfaceC0905c != null) {
                interfaceC0905c.k(X3.y.a);
            }
        }
        return obj;
    }

    public final void u(long j3, long j4, long j5, long j6) {
        long min = Math.min(j4, j3);
        for (long p5 = p(); p5 < min; p5++) {
            Object[] objArr = this.f216k;
            AbstractC1276k.c(objArr);
            W.d(objArr, p5, null);
        }
        this.f217l = j3;
        this.f218m = j4;
        this.f219n = (int) (j5 - min);
        this.f220o = (int) (j6 - j5);
    }

    public final InterfaceC0905c[] v(long j3) {
        long j4;
        long j5;
        long j6;
        InterfaceC0905c[] interfaceC0905cArr;
        InterfaceC0905c[] interfaceC0905cArr2;
        AbstractC0051d[] abstractC0051dArr;
        C4.u uVar = W.a;
        InterfaceC0905c[] interfaceC0905cArr3 = AbstractC0050c.a;
        if (j3 <= this.f218m) {
            long p5 = p();
            long j7 = this.f219n + p5;
            int i6 = this.f214i;
            if (i6 == 0 && this.f220o > 0) {
                j7++;
            }
            int i7 = 0;
            if (this.f576e != 0 && (abstractC0051dArr = this.f575c) != null) {
                for (AbstractC0051d abstractC0051d : abstractC0051dArr) {
                    if (abstractC0051d != null) {
                        long j8 = ((X) abstractC0051d).a;
                        if (j8 >= 0 && j8 < j7) {
                            j7 = j8;
                        }
                    }
                }
            }
            if (j7 > this.f218m) {
                long p6 = p() + this.f219n;
                int min = this.f576e > 0 ? Math.min(this.f220o, i6 - ((int) (p6 - j7))) : this.f220o;
                long j9 = this.f220o + p6;
                if (min > 0) {
                    j6 = 1;
                    Object[] objArr = this.f216k;
                    AbstractC1276k.c(objArr);
                    j4 = p5;
                    InterfaceC0905c[] interfaceC0905cArr4 = new InterfaceC0905c[min];
                    long j10 = p6;
                    while (true) {
                        if (p6 >= j9) {
                            interfaceC0905cArr2 = interfaceC0905cArr4;
                            j5 = j7;
                            break;
                        }
                        interfaceC0905cArr2 = interfaceC0905cArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) p6)];
                        if (obj != uVar) {
                            AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            T t5 = (T) obj;
                            int i8 = i7 + 1;
                            j5 = j7;
                            interfaceC0905cArr2[i7] = t5.f205g;
                            W.d(objArr, p6, uVar);
                            W.d(objArr, j10, t5.f204f);
                            j10++;
                            if (i8 >= min) {
                                break;
                            }
                            i7 = i8;
                        } else {
                            j5 = j7;
                        }
                        p6++;
                        interfaceC0905cArr4 = interfaceC0905cArr2;
                        j7 = j5;
                    }
                    p6 = j10;
                    interfaceC0905cArr = interfaceC0905cArr2;
                } else {
                    j4 = p5;
                    j5 = j7;
                    j6 = 1;
                    interfaceC0905cArr = interfaceC0905cArr3;
                }
                int i9 = (int) (p6 - j4);
                long j11 = this.f576e == 0 ? p6 : j5;
                long max = Math.max(this.f217l, p6 - Math.min(this.f213h, i9));
                if (i6 == 0 && max < j9) {
                    Object[] objArr2 = this.f216k;
                    AbstractC1276k.c(objArr2);
                    if (AbstractC1276k.b(objArr2[((int) max) & (objArr2.length - 1)], uVar)) {
                        p6 += j6;
                        max += j6;
                    }
                }
                u(max, j11, p6, j9);
                k();
                return interfaceC0905cArr.length == 0 ? interfaceC0905cArr : o(interfaceC0905cArr);
            }
        }
        return interfaceC0905cArr3;
    }
}
