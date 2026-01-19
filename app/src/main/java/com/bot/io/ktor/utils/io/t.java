package io.ktor.utils.io;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import i4.AbstractC1121e;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import x4.InterfaceC1922e0;

/* loaded from: classes.dex */
public final class t implements v, y, A {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12277j = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_state");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12278k = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_closed");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12279l = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_readOp");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12280m = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile InterfaceC1922e0 attachedJob;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12281b;

    /* renamed from: c, reason: collision with root package name */
    public final W3.e f12282c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12283d;

    /* renamed from: e, reason: collision with root package name */
    public int f12284e;

    /* renamed from: f, reason: collision with root package name */
    public int f12285f;

    /* renamed from: g, reason: collision with root package name */
    public final io.ktor.utils.io.internal.b f12286g;

    /* renamed from: h, reason: collision with root package name */
    public final io.ktor.utils.io.internal.b f12287h;

    /* renamed from: i, reason: collision with root package name */
    public final s f12288i;
    private volatile io.ktor.utils.io.internal.d joining;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    public t(ByteBuffer byteBuffer) {
        this(false, io.ktor.utils.io.internal.f.f12172d, 0);
        ByteBuffer slice = byteBuffer.slice();
        AbstractC1276k.e(slice, "content.slice()");
        io.ktor.utils.io.internal.i iVar = new io.ktor.utils.io.internal.i(slice, 0);
        iVar.f12184b.e();
        this._state = iVar.f12179g;
        J();
        AbstractC1121e.h(this);
        P();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object F(io.ktor.utils.io.t r5, int r6, d4.c r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.j
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.j r0 = (io.ktor.utils.io.j) r0
            int r1 = r0.f12192j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12192j = r1
            goto L18
        L13:
            io.ktor.utils.io.j r0 = new io.ktor.utils.io.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12190h
            c4.a r1 = c4.EnumC0927a.f11114c
            int r2 = r0.f12192j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.StringBuilder r5 = r0.f12189g
            X3.a.e(r7)
            goto L59
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            X3.a.e(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r0.f12189g = r7
            r0.f12192j = r3
            java.lang.Object r2 = r5._state
            io.ktor.utils.io.internal.l r2 = (io.ktor.utils.io.internal.l) r2
            io.ktor.utils.io.internal.k r3 = io.ktor.utils.io.internal.k.f12183c
            if (r2 != r3) goto L4f
            java.lang.Throwable r5 = r5.o()
            if (r5 != 0) goto L4e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L53
        L4e:
            throw r5
        L4f:
            java.lang.Object r5 = r5.G(r7, r6, r0)
        L53:
            if (r5 != r1) goto L56
            return r1
        L56:
            r4 = r7
            r7 = r5
            r5 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L63
            r5 = 0
            return r5
        L63:
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.F(io.ktor.utils.io.t, int, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object S(io.ktor.utils.io.t r12, int r13, c.f r14, d4.c r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.S(io.ktor.utils.io.t, int, c.f, d4.c):java.lang.Object");
    }

    public static final io.ktor.utils.io.internal.c a(t tVar) {
        return (io.ktor.utils.io.internal.c) tVar._closed;
    }

    public static int u(t tVar, V3.b bVar) {
        int h3;
        boolean z5;
        int i6 = bVar.f8665e - bVar.f8663c;
        int i7 = 0;
        do {
            ByteBuffer M5 = tVar.M();
            if (M5 != null) {
                io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) tVar._state).f12184b;
                try {
                    if (nVar._availableForRead$internal != 0) {
                        int i8 = bVar.f8665e - bVar.f8663c;
                        h3 = nVar.h(Math.min(M5.remaining(), Math.min(i8, i6)));
                        if (h3 <= 0) {
                            z5 = false;
                        } else {
                            if (i8 < M5.remaining()) {
                                M5.limit(M5.position() + i8);
                            }
                            Y3.C.X(bVar, M5);
                            tVar.f(M5, nVar, h3);
                            z5 = true;
                        }
                        i7 += h3;
                        i6 -= h3;
                        if (z5 || bVar.f8665e <= bVar.f8663c) {
                            break;
                        }
                    } else {
                        tVar.I();
                        tVar.P();
                    }
                } finally {
                    tVar.I();
                    tVar.P();
                }
            }
            z5 = false;
            h3 = 0;
            i7 += h3;
            i6 -= h3;
            if (z5) {
                break;
                break;
            }
        } while (((io.ktor.utils.io.internal.l) tVar._state).f12184b._availableForRead$internal > 0);
        return i7;
    }

    public final Object A(long j3, d4.c cVar) {
        if (!q()) {
            return B(j3, cVar);
        }
        Throwable o5 = o();
        if (o5 != null) {
            u.c(o5);
            throw null;
        }
        U3.c cVar2 = new U3.c();
        try {
            V3.b f6 = V3.c.f(cVar2, 1, null);
            while (true) {
                try {
                    if (f6.f8665e - f6.f8663c > j3) {
                        int i6 = f6.f8664d;
                        f6.f8662b = i6;
                        f6.f8663c = i6;
                        f6.f8665e = (int) j3;
                    }
                    j3 -= u(this, f6);
                    if (j3 <= 0 || p()) {
                        break;
                    }
                    f6 = V3.c.f(cVar2, 1, f6);
                } catch (Throwable th) {
                    cVar2.c();
                    throw th;
                }
            }
            cVar2.c();
            return cVar2.f();
        } catch (Throwable th2) {
            cVar2.close();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0091, B:17:0x009e, B:18:0x0051, B:20:0x005d, B:21:0x0066, B:23:0x0076, B:25:0x007c), top: B:11:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0091, B:17:0x009e, B:18:0x0051, B:20:0x005d, B:21:0x0066, B:23:0x0076, B:25:0x007c), top: B:11:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:12:0x002b, B:13:0x0091, B:17:0x009e, B:18:0x0051, B:20:0x005d, B:21:0x0066, B:23:0x0076, B:25:0x007c), top: B:11:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #0 {all -> 0x00b1, blocks: (B:30:0x00a3, B:32:0x00ac, B:34:0x00b4, B:38:0x00b5, B:39:0x00b8, B:12:0x002b, B:13:0x0091, B:17:0x009e, B:18:0x0051, B:20:0x005d, B:21:0x0066, B:23:0x0076, B:25:0x007c), top: B:7:0x001d, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, m4.v] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [U3.c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:13:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009b -> B:16:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(long r10, d4.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof io.ktor.utils.io.C1128g
            if (r0 == 0) goto L13
            r0 = r12
            io.ktor.utils.io.g r0 = (io.ktor.utils.io.C1128g) r0
            int r1 = r0.f12154n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12154n = r1
            goto L18
        L13:
            io.ktor.utils.io.g r0 = new io.ktor.utils.io.g
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f12152l
            int r1 = r0.f12154n
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            V3.b r10 = r0.f12151k
            U3.c r11 = r0.f12150j
            m4.v r1 = r0.f12149i
            U3.c r3 = r0.f12148h
            io.ktor.utils.io.t r4 = r0.f12147g
            X3.a.e(r12)     // Catch: java.lang.Throwable -> L2f
            goto L91
        L2f:
            r10 = move-exception
            goto Lb5
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            X3.a.e(r12)
            U3.c r12 = new U3.c
            r12.<init>()
            m4.v r1 = new m4.v     // Catch: java.lang.Throwable -> Lb9
            r1.<init>()     // Catch: java.lang.Throwable -> Lb9
            r1.f12972c = r10     // Catch: java.lang.Throwable -> Lb9
            r10 = 0
            V3.b r10 = V3.c.f(r12, r2, r10)     // Catch: java.lang.Throwable -> Lb9
            r4 = r9
            r11 = r12
            r3 = r11
        L51:
            int r12 = r10.f8665e     // Catch: java.lang.Throwable -> L2f
            int r5 = r10.f8663c     // Catch: java.lang.Throwable -> L2f
            int r12 = r12 - r5
            long r5 = (long) r12     // Catch: java.lang.Throwable -> L2f
            long r7 = r1.f12972c     // Catch: java.lang.Throwable -> L2f
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L66
            int r12 = (int) r7     // Catch: java.lang.Throwable -> L2f
            int r5 = r10.f8664d     // Catch: java.lang.Throwable -> L2f
            r10.f8662b = r5     // Catch: java.lang.Throwable -> L2f
            r10.f8663c = r5     // Catch: java.lang.Throwable -> L2f
            r10.f8665e = r12     // Catch: java.lang.Throwable -> L2f
        L66:
            int r12 = u(r4, r10)     // Catch: java.lang.Throwable -> L2f
            long r5 = r1.f12972c     // Catch: java.lang.Throwable -> L2f
            long r7 = (long) r12     // Catch: java.lang.Throwable -> L2f
            long r5 = r5 - r7
            r1.f12972c = r5     // Catch: java.lang.Throwable -> L2f
            r7 = 0
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L9b
            boolean r12 = r4.p()     // Catch: java.lang.Throwable -> L2f
            if (r12 != 0) goto L9b
            r0.f12147g = r4     // Catch: java.lang.Throwable -> L2f
            r0.f12148h = r3     // Catch: java.lang.Throwable -> L2f
            r0.f12149i = r1     // Catch: java.lang.Throwable -> L2f
            r0.f12150j = r11     // Catch: java.lang.Throwable -> L2f
            r0.f12151k = r10     // Catch: java.lang.Throwable -> L2f
            r0.f12154n = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r12 = r4.C(r2, r0)     // Catch: java.lang.Throwable -> L2f
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r12 != r5) goto L91
            return r5
        L91:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L2f
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r12 == 0) goto L9b
            r12 = r2
            goto L9c
        L9b:
            r12 = 0
        L9c:
            if (r12 == 0) goto La3
            V3.b r10 = V3.c.f(r11, r2, r10)     // Catch: java.lang.Throwable -> L2f
            goto L51
        La3:
            r11.c()     // Catch: java.lang.Throwable -> Lb1
            java.lang.Throwable r10 = r4.o()     // Catch: java.lang.Throwable -> Lb1
            if (r10 != 0) goto Lb4
            U3.d r10 = r3.f()     // Catch: java.lang.Throwable -> Lb1
            return r10
        Lb1:
            r10 = move-exception
            r12 = r3
            goto Lba
        Lb4:
            throw r10     // Catch: java.lang.Throwable -> Lb1
        Lb5:
            r11.c()     // Catch: java.lang.Throwable -> Lb1
            throw r10     // Catch: java.lang.Throwable -> Lb1
        Lb9:
            r10 = move-exception
        Lba:
            r12.close()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.B(long, d4.c):java.lang.Object");
    }

    public final Object C(int i6, d4.c cVar) {
        if (((io.ktor.utils.io.internal.l) this._state).f12184b._availableForRead$internal >= i6) {
            return Boolean.TRUE;
        }
        io.ktor.utils.io.internal.c cVar2 = (io.ktor.utils.io.internal.c) this._closed;
        if (cVar2 == null) {
            return i6 == 1 ? D(1, cVar) : E(i6, cVar);
        }
        Throwable th = cVar2.a;
        if (th != null) {
            u.c(th);
            throw null;
        }
        io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
        boolean z5 = nVar.c() && nVar._availableForRead$internal >= i6;
        if (((InterfaceC0905c) this._readOp) == null) {
            return Boolean.valueOf(z5);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(int r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.C1129h
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.h r0 = (io.ktor.utils.io.C1129h) r0
            int r1 = r0.f12158j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12158j = r1
            goto L18
        L13:
            io.ktor.utils.io.h r0 = new io.ktor.utils.io.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12156h
            c4.a r1 = c4.EnumC0927a.f11114c
            int r2 = r0.f12158j
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.t r5 = r0.f12155g
            X3.a.e(r6)     // Catch: java.lang.Throwable -> L29
            return r6
        L29:
            r6 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            X3.a.e(r6)
            java.lang.Object r6 = r4._state
            io.ktor.utils.io.internal.l r6 = (io.ktor.utils.io.internal.l) r6
            io.ktor.utils.io.internal.n r6 = r6.f12184b
            int r6 = r6._availableForRead$internal
            if (r6 >= r5) goto L5b
            r0.f12155g = r4     // Catch: java.lang.Throwable -> L55
            r0.f12158j = r3     // Catch: java.lang.Throwable -> L55
            io.ktor.utils.io.internal.b r6 = r4.f12286g     // Catch: java.lang.Throwable -> L55
            r4.O(r5, r6)     // Catch: java.lang.Throwable -> L55
            b4.c r5 = Y4.d.K(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r6.c(r5)     // Catch: java.lang.Throwable -> L55
            if (r5 != r1) goto L54
            return r1
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r4
        L57:
            r0 = 0
            r5._readOp = r0
            throw r6
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.D(int, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0082 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(int r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.i
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.i r0 = (io.ktor.utils.io.i) r0
            int r1 = r0.f12163k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12163k = r1
            goto L18
        L13:
            io.ktor.utils.io.i r0 = new io.ktor.utils.io.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12161i
            c4.a r1 = c4.EnumC0927a.f11114c
            int r2 = r0.f12163k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f12160h
            io.ktor.utils.io.t r2 = r0.f12159g
            X3.a.e(r6)
            goto L85
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            X3.a.e(r6)
            r2 = r4
        L37:
            java.lang.Object r6 = r2._state
            io.ktor.utils.io.internal.l r6 = (io.ktor.utils.io.internal.l) r6
            io.ktor.utils.io.internal.n r6 = r6.f12184b
            int r6 = r6._availableForRead$internal
            if (r6 < r5) goto L44
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L44:
            java.lang.Object r6 = r2._closed
            io.ktor.utils.io.internal.c r6 = (io.ktor.utils.io.internal.c) r6
            if (r6 == 0) goto L78
            java.lang.Throwable r6 = r6.a
            if (r6 != 0) goto L73
            java.lang.Object r6 = r2._state
            io.ktor.utils.io.internal.l r6 = (io.ktor.utils.io.internal.l) r6
            io.ktor.utils.io.internal.n r6 = r6.f12184b
            boolean r0 = r6.c()
            if (r0 == 0) goto L5f
            int r6 = r6._availableForRead$internal
            if (r6 < r5) goto L5f
            goto L60
        L5f:
            r3 = 0
        L60:
            java.lang.Object r5 = r2._readOp
            b4.c r5 = (b4.InterfaceC0905c) r5
            if (r5 != 0) goto L6b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L6b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Read operation is already in progress"
            r5.<init>(r6)
            throw r5
        L73:
            io.ktor.utils.io.u.c(r6)
            r5 = 0
            throw r5
        L78:
            r0.f12159g = r2
            r0.f12160h = r5
            r0.f12163k = r3
            java.lang.Object r6 = r2.D(r5, r0)
            if (r6 != r1) goto L85
            return r1
        L85:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L37
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.E(int, d4.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:46)|47|48|49|50|51|52|53|(18:55|34|35|36|(1:38)|66|67|(0)|70|(1:72)|82|14|(0)|21|23|25|18|19)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:46|47|48|49|50|51|52|53|(18:55|34|35|36|(1:38)|66|67|(0)|70|(1:72)|82|14|(0)|21|23|25|18|19)) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        r19 = r7;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        r11 = r16;
        r3 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x006e, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0156, code lost:
    
        if (r1.s(1, r4, r0) == r9) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [m4.w] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, m4.u, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [m4.u] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, m4.u] */
    /* JADX WARN: Type inference failed for: r6v1, types: [m4.r, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r7v1, types: [m4.r] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0101 -> B:34:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(java.lang.StringBuilder r22, int r23, d4.c r24) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.G(java.lang.StringBuilder, int, d4.c):java.lang.Object");
    }

    public final void H(io.ktor.utils.io.internal.i iVar) {
        this.f12282c.X(iVar);
    }

    public final void I() {
        io.ktor.utils.io.internal.l e6;
        io.ktor.utils.io.internal.l lVar = null;
        loop0: while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.l lVar2 = (io.ktor.utils.io.internal.l) obj;
            io.ktor.utils.io.internal.h hVar = (io.ktor.utils.io.internal.h) lVar;
            if (hVar != null) {
                hVar.f12184b.f();
                L();
                lVar = null;
            }
            e6 = lVar2.e();
            if ((e6 instanceof io.ktor.utils.io.internal.h) && ((io.ktor.utils.io.internal.l) this._state) == lVar2 && e6.f12184b.g()) {
                e6 = io.ktor.utils.io.internal.g.f12173c;
                lVar = e6;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12277j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        io.ktor.utils.io.internal.g gVar = io.ktor.utils.io.internal.g.f12173c;
        if (e6 == gVar) {
            io.ktor.utils.io.internal.h hVar2 = (io.ktor.utils.io.internal.h) lVar;
            if (hVar2 != null) {
                H(hVar2.f12174c);
            }
            L();
            return;
        }
        if (e6 instanceof io.ktor.utils.io.internal.h) {
            io.ktor.utils.io.internal.n nVar = e6.f12184b;
            if (nVar._availableForWrite$internal == nVar.a && e6.f12184b.g()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12277j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, e6, gVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != e6) {
                        return;
                    }
                }
                e6.f12184b.f();
                H(((io.ktor.utils.io.internal.h) e6).f12174c);
                L();
            }
        }
    }

    public final void J() {
        io.ktor.utils.io.internal.l f6;
        io.ktor.utils.io.internal.h hVar;
        io.ktor.utils.io.internal.l lVar = null;
        loop0: while (true) {
            Object obj = this._state;
            f6 = ((io.ktor.utils.io.internal.l) obj).f();
            if (f6 instanceof io.ktor.utils.io.internal.h) {
                io.ktor.utils.io.internal.n nVar = f6.f12184b;
                if (nVar._availableForWrite$internal == nVar.a) {
                    f6 = io.ktor.utils.io.internal.g.f12173c;
                    lVar = f6;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12277j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        if (f6 != io.ktor.utils.io.internal.g.f12173c || (hVar = (io.ktor.utils.io.internal.h) lVar) == null) {
            return;
        }
        H(hVar.f12174c);
    }

    public final void K() {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) f12279l.getAndSet(this, null);
        if (interfaceC0905c != null) {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            Throwable th = cVar != null ? cVar.a : null;
            if (th != null) {
                interfaceC0905c.k(X3.a.b(th));
            } else {
                interfaceC0905c.k(Boolean.TRUE);
            }
        }
    }

    public final void L() {
        while (true) {
            InterfaceC0905c interfaceC0905c = (InterfaceC0905c) this._writeOp;
            if (interfaceC0905c == null) {
                return;
            }
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12280m;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0905c, null)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0905c) {
                    break;
                }
            }
            interfaceC0905c.k(cVar == null ? X3.y.a : X3.a.b(cVar.a()));
            return;
        }
    }

    public final ByteBuffer M() {
        boolean z5;
        Throwable th;
        io.ktor.utils.io.internal.l c6;
        Throwable th2;
        do {
            Object obj = this._state;
            io.ktor.utils.io.internal.l lVar = (io.ktor.utils.io.internal.l) obj;
            z5 = true;
            if (AbstractC1276k.b(lVar, io.ktor.utils.io.internal.k.f12183c) ? true : AbstractC1276k.b(lVar, io.ktor.utils.io.internal.g.f12173c)) {
                io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
                if (cVar != null && (th = cVar.a) != null) {
                    u.c(th);
                    throw null;
                }
            } else {
                io.ktor.utils.io.internal.c cVar2 = (io.ktor.utils.io.internal.c) this._closed;
                if (cVar2 != null && (th2 = cVar2.a) != null) {
                    u.c(th2);
                    throw null;
                }
                if (lVar.f12184b._availableForRead$internal != 0) {
                    c6 = lVar.c();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12277j;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c6)) {
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z5 = false;
                            break;
                        }
                    }
                }
            }
            return null;
        } while (!z5);
        ByteBuffer a = c6.a();
        r(a, this.f12284e, c6.f12184b._availableForRead$internal);
        return a;
    }

    public final ByteBuffer N() {
        io.ktor.utils.io.internal.l d6;
        io.ktor.utils.io.internal.i iVar;
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) this._writeOp;
        if (interfaceC0905c != null) {
            throw new IllegalStateException("Write operation is already in progress: " + interfaceC0905c);
        }
        io.ktor.utils.io.internal.i iVar2 = null;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.l lVar = (io.ktor.utils.io.internal.l) obj;
            if (((io.ktor.utils.io.internal.c) this._closed) != null) {
                if (iVar2 != null) {
                    H(iVar2);
                }
                io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
                AbstractC1276k.c(cVar);
                u.c(cVar.a());
                throw null;
            }
            if (lVar == io.ktor.utils.io.internal.g.f12173c) {
                if (iVar2 == null) {
                    iVar2 = (io.ktor.utils.io.internal.i) this.f12282c.v();
                    iVar2.f12184b.f();
                }
                d6 = iVar2.f12179g;
            } else {
                if (lVar == io.ktor.utils.io.internal.k.f12183c) {
                    if (iVar2 != null) {
                        H(iVar2);
                    }
                    io.ktor.utils.io.internal.c cVar2 = (io.ktor.utils.io.internal.c) this._closed;
                    AbstractC1276k.c(cVar2);
                    u.c(cVar2.a());
                    throw null;
                }
                d6 = lVar.d();
            }
            io.ktor.utils.io.internal.l lVar2 = d6;
            iVar = iVar2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12277j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (((io.ktor.utils.io.internal.c) this._closed) != null) {
                J();
                P();
                io.ktor.utils.io.internal.c cVar3 = (io.ktor.utils.io.internal.c) this._closed;
                AbstractC1276k.c(cVar3);
                u.c(cVar3.a());
                throw null;
            }
            ByteBuffer b5 = lVar2.b();
            if (iVar != null) {
                if (lVar == null) {
                    AbstractC1276k.k("old");
                    throw null;
                }
                if (lVar != io.ktor.utils.io.internal.g.f12173c) {
                    H(iVar);
                }
            }
            r(b5, this.f12285f, lVar2.f12184b._availableForWrite$internal);
            return b5;
            iVar2 = iVar;
        }
    }

    public final void O(int i6, InterfaceC0905c interfaceC0905c) {
        while (((io.ktor.utils.io.internal.l) this._state).f12184b._availableForRead$internal < i6) {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar != null) {
                Throwable th = cVar.a;
                if (th != null) {
                    interfaceC0905c.k(X3.a.b(th));
                    return;
                }
                boolean c6 = ((io.ktor.utils.io.internal.l) this._state).f12184b.c();
                boolean z5 = false;
                boolean z6 = ((io.ktor.utils.io.internal.l) this._state).f12184b._availableForRead$internal >= i6;
                if (c6 && z6) {
                    z5 = true;
                }
                interfaceC0905c.k(Boolean.valueOf(z5));
                return;
            }
            while (((InterfaceC0905c) this._readOp) == null) {
                if (((io.ktor.utils.io.internal.c) this._closed) == null && ((io.ktor.utils.io.internal.l) this._state).f12184b._availableForRead$internal < i6) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12279l;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC0905c)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    if (((io.ktor.utils.io.internal.c) this._closed) == null && ((io.ktor.utils.io.internal.l) this._state).f12184b._availableForRead$internal < i6) {
                        return;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12279l;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0905c, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0905c) {
                            return;
                        }
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        interfaceC0905c.k(Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0068, code lost:
    
        K();
        L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            r7 = this;
            java.lang.Object r0 = r7._closed
            io.ktor.utils.io.internal.c r0 = (io.ktor.utils.io.internal.c) r0
            if (r0 == 0) goto L76
            r0 = 0
            r1 = r0
        L8:
            java.lang.Object r2 = r7._state
            r3 = r2
            io.ktor.utils.io.internal.l r3 = (io.ktor.utils.io.internal.l) r3
            java.lang.Object r4 = r7._closed
            io.ktor.utils.io.internal.c r4 = (io.ktor.utils.io.internal.c) r4
            if (r1 == 0) goto L24
            if (r4 == 0) goto L18
            java.lang.Throwable r5 = r4.a
            goto L19
        L18:
            r5 = r0
        L19:
            if (r5 != 0) goto L20
            io.ktor.utils.io.internal.n r1 = r1.f12184b
            r1.f()
        L20:
            r7.L()
            r1 = r0
        L24:
            io.ktor.utils.io.internal.k r5 = io.ktor.utils.io.internal.k.f12183c
            if (r3 != r5) goto L29
            goto L68
        L29:
            io.ktor.utils.io.internal.g r6 = io.ktor.utils.io.internal.g.f12173c
            if (r3 != r6) goto L2e
            goto L53
        L2e:
            if (r4 == 0) goto L76
            boolean r1 = r3 instanceof io.ktor.utils.io.internal.h
            if (r1 == 0) goto L76
            io.ktor.utils.io.internal.n r1 = r3.f12184b
            boolean r1 = r1.g()
            if (r1 != 0) goto L40
            java.lang.Throwable r1 = r4.a
            if (r1 == 0) goto L76
        L40:
            java.lang.Throwable r1 = r4.a
            if (r1 == 0) goto L4f
            io.ktor.utils.io.internal.n r1 = r3.f12184b
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = io.ktor.utils.io.internal.n.f12187c
            r6 = 0
            r4.getAndSet(r1, r6)
        L4f:
            io.ktor.utils.io.internal.h r3 = (io.ktor.utils.io.internal.h) r3
            io.ktor.utils.io.internal.i r1 = r3.f12174c
        L53:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = io.ktor.utils.io.t.f12277j
        L55:
            boolean r4 = r3.compareAndSet(r7, r2, r5)
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L68
            java.lang.Object r0 = r7._state
            io.ktor.utils.io.internal.l r0 = (io.ktor.utils.io.internal.l) r0
            io.ktor.utils.io.internal.k r2 = io.ktor.utils.io.internal.k.f12183c
            if (r0 != r2) goto L68
            r7.H(r1)
        L68:
            r7.K()
            r7.L()
            return
        L6f:
            java.lang.Object r4 = r3.get(r7)
            if (r4 == r2) goto L55
            goto L8
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.P():void");
    }

    public final int Q(U3.d dVar) {
        ByteBuffer N5 = N();
        io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
        try {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar != null) {
                u.c(cVar.a());
                throw null;
            }
            int i6 = nVar.i((int) Math.min(dVar.p(), N5.remaining()));
            if (i6 > 0) {
                N5.limit(N5.position() + i6);
                s4.j.F(dVar, N5);
                g(N5, nVar, i6);
            }
            return i6;
        } finally {
            if (nVar.d() || this.f12281b) {
                m(1);
            }
            J();
            P();
        }
    }

    public final Object R(d4.c cVar) {
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        X3.y yVar = X3.y.a;
        if (c0(1)) {
            this.writeSuspensionSize = 1;
            if (this.attachedJob != null) {
                this.f12288i.f(cVar);
                return enumC0927a;
            }
            io.ktor.utils.io.internal.b bVar = this.f12287h;
            this.f12288i.f(bVar);
            Object c6 = bVar.c(Y4.d.K(cVar));
            if (c6 == enumC0927a) {
                return c6;
            }
        } else {
            io.ktor.utils.io.internal.c cVar2 = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar2 != null) {
                u.c(cVar2.a());
                throw null;
            }
        }
        return yVar;
    }

    public final int T(byte[] bArr, int i6, int i7) {
        ByteBuffer N5 = N();
        io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
        try {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar != null) {
                u.c(cVar.a());
                throw null;
            }
            int i8 = 0;
            while (true) {
                int i9 = nVar.i(Math.min(i7 - i8, N5.remaining()));
                if (i9 == 0) {
                    g(N5, nVar, i8);
                    if (nVar.d() || this.f12281b) {
                        m(1);
                    }
                    J();
                    P();
                    return i8;
                }
                if (i9 <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                N5.put(bArr, i6 + i8, i9);
                i8 += i9;
                r(N5, h(N5, this.f12285f + i8), nVar._availableForWrite$internal);
            }
        } catch (Throwable th) {
            if (nVar.d() || this.f12281b) {
                m(1);
            }
            J();
            P();
            throw th;
        }
    }

    public final void U(U3.a aVar) {
        ByteBuffer N5 = N();
        io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
        try {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar != null) {
                u.c(cVar.a());
                throw null;
            }
            int i6 = 0;
            while (true) {
                int i7 = nVar.i(Math.min(aVar.f8663c - aVar.f8662b, N5.remaining()));
                if (i7 == 0) {
                    break;
                }
                AbstractC1410a.I(aVar, N5, i7);
                i6 += i7;
                r(N5, h(N5, this.f12285f + i6), nVar._availableForWrite$internal);
            }
            g(N5, nVar, i6);
            if (nVar.d() || this.f12281b) {
                m(1);
            }
            J();
            P();
        } catch (Throwable th) {
            if (nVar.d() || this.f12281b) {
                m(1);
            }
            J();
            P();
            throw th;
        }
    }

    public final Object V(byte[] bArr, int i6, d4.c cVar) {
        Object X5;
        int i7 = 0;
        while (i6 > 0) {
            int T5 = T(bArr, i7, i6);
            if (T5 == 0) {
                break;
            }
            i7 += T5;
            i6 -= T5;
        }
        return (i6 != 0 && (X5 = X(bArr, i7, i6, cVar)) == EnumC0927a.f11114c) ? X5 : X3.y.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0050 -> B:17:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(U3.a r6, d4.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.n
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.n r0 = (io.ktor.utils.io.n) r0
            int r1 = r0.f12250k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12250k = r1
            goto L18
        L13:
            io.ktor.utils.io.n r0 = new io.ktor.utils.io.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12248i
            int r1 = r0.f12250k
            X3.y r2 = X3.y.a
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            r6 = 2
            if (r1 != r6) goto L2a
            X3.a.e(r7)
            return r2
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            U3.a r6 = r0.f12247h
            io.ktor.utils.io.t r1 = r0.f12246g
            X3.a.e(r7)
            goto L53
        L3a:
            X3.a.e(r7)
            r1 = r5
        L3e:
            int r7 = r6.f8663c
            int r4 = r6.f8662b
            if (r7 <= r4) goto L5a
            r0.f12246g = r1
            r0.f12247h = r6
            r0.f12250k = r3
            java.lang.Object r7 = r1.R(r0)
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r7 != r4) goto L53
            return r4
        L53:
            r1.getClass()
            r1.U(r6)
            goto L3e
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.W(U3.a, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(byte[] r6, int r7, int r8, d4.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.o
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.o r0 = (io.ktor.utils.io.o) r0
            int r1 = r0.f12257m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12257m = r1
            goto L18
        L13:
            io.ktor.utils.io.o r0 = new io.ktor.utils.io.o
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f12255k
            int r1 = r0.f12257m
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            int r6 = r0.f12254j
            int r7 = r0.f12253i
            byte[] r8 = r0.f12252h
            io.ktor.utils.io.t r1 = r0.f12251g
            X3.a.e(r9)
            goto L5e
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            X3.a.e(r9)
            r1 = r5
        L39:
            if (r8 <= 0) goto L6a
            r0.f12251g = r1
            r0.f12252h = r6
            r0.f12253i = r7
            r0.f12254j = r8
            r0.f12257m = r2
            int r9 = r1.T(r6, r7, r8)
            if (r9 <= 0) goto L52
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r9)
            r9 = r3
            goto L56
        L52:
            java.lang.Object r9 = r1.b0(r6, r7, r8, r0)
        L56:
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r9 != r3) goto L5b
            return r3
        L5b:
            r4 = r8
            r8 = r6
            r6 = r4
        L5e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L39
        L6a:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.X(byte[], int, int, d4.c):java.lang.Object");
    }

    public final Object Y(U3.d dVar, N3.b bVar) {
        Object Z5;
        while (!dVar.h() && Q(dVar) != 0) {
            try {
            } catch (Throwable th) {
                dVar.r();
                throw th;
            }
        }
        return (dVar.p() <= 0 || (Z5 = Z(dVar, bVar)) != EnumC0927a.f11114c) ? X3.y.a : Z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002a, B:20:0x003f, B:21:0x005c, B:22:0x0047, B:24:0x004d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:21:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(U3.d r6, d4.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.p
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.p r0 = (io.ktor.utils.io.p) r0
            int r1 = r0.f12262k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12262k = r1
            goto L18
        L13:
            io.ktor.utils.io.p r0 = new io.ktor.utils.io.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12260i
            int r1 = r0.f12262k
            X3.y r2 = X3.y.a
            r3 = 1
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            r6 = 2
            if (r1 != r6) goto L33
            io.ktor.utils.io.t r6 = r0.f12258g
            U3.d r6 = (U3.d) r6
            X3.a.e(r7)     // Catch: java.lang.Throwable -> L31
            r6.r()
            return r2
        L31:
            r7 = move-exception
            goto L67
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            U3.d r6 = r0.f12259h
            io.ktor.utils.io.t r1 = r0.f12258g
            X3.a.e(r7)     // Catch: java.lang.Throwable -> L31
            goto L5c
        L43:
            X3.a.e(r7)
            r1 = r5
        L47:
            boolean r7 = r6.h()     // Catch: java.lang.Throwable -> L31
            if (r7 != 0) goto L63
            r0.f12258g = r1     // Catch: java.lang.Throwable -> L31
            r0.f12259h = r6     // Catch: java.lang.Throwable -> L31
            r0.f12262k = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r1.a0(r3, r0)     // Catch: java.lang.Throwable -> L31
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r7 != r4) goto L5c
            return r4
        L5c:
            r1.getClass()     // Catch: java.lang.Throwable -> L31
            r1.Q(r6)     // Catch: java.lang.Throwable -> L31
            goto L47
        L63:
            r6.r()
            return r2
        L67:
            r6.r()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.Z(U3.d, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(int r9, d4.c r10) {
        /*
            r8 = this;
            X3.y r0 = X3.y.a
            boolean r1 = r10 instanceof io.ktor.utils.io.r
            if (r1 == 0) goto L15
            r1 = r10
            io.ktor.utils.io.r r1 = (io.ktor.utils.io.r) r1
            int r2 = r1.f12274k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f12274k = r2
            goto L1a
        L15:
            io.ktor.utils.io.r r1 = new io.ktor.utils.io.r
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f12272i
            c4.a r2 = c4.EnumC0927a.f11114c
            int r3 = r1.f12274k
            r4 = 1
            if (r3 == 0) goto L35
            if (r3 != r4) goto L2d
            int r9 = r1.f12271h
            io.ktor.utils.io.t r3 = r1.f12270g
            X3.a.e(r10)
            goto L39
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            X3.a.e(r10)
            r3 = r8
        L39:
            boolean r10 = r3.c0(r9)
            r5 = 0
            if (r10 == 0) goto Lad
            r1.f12270g = r3
            r1.f12271h = r9
            r1.f12274k = r4
            x4.k r10 = new x4.k
            b4.c r6 = Y4.d.K(r1)
            r10.<init>(r4, r6)
            r10.t()
        L52:
            java.lang.Object r6 = r3._closed
            io.ktor.utils.io.internal.c r6 = (io.ktor.utils.io.internal.c) r6
            if (r6 != 0) goto La5
            boolean r6 = r3.c0(r9)
            if (r6 != 0) goto L62
            r10.k(r0)
            goto L8c
        L62:
            java.lang.Object r6 = r3._writeOp
            b4.c r6 = (b4.InterfaceC0905c) r6
            if (r6 != 0) goto L9d
            boolean r6 = r3.c0(r9)
            if (r6 != 0) goto L6f
            goto L52
        L6f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = io.ktor.utils.io.t.f12280m
        L71:
            boolean r7 = r6.compareAndSet(r3, r5, r10)
            if (r7 == 0) goto L96
            boolean r6 = r3.c0(r9)
            if (r6 != 0) goto L8c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = io.ktor.utils.io.t.f12280m
        L7f:
            boolean r7 = r6.compareAndSet(r3, r10, r5)
            if (r7 == 0) goto L86
            goto L52
        L86:
            java.lang.Object r7 = r6.get(r3)
            if (r7 == r10) goto L7f
        L8c:
            r3.m(r9)
            java.lang.Object r10 = r10.s()
            if (r10 != r2) goto L39
            return r2
        L96:
            java.lang.Object r7 = r6.get(r3)
            if (r7 == 0) goto L71
            goto L62
        L9d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Operation is already in progress"
            r9.<init>(r10)
            throw r9
        La5:
            java.lang.Throwable r9 = r6.a()
            io.ktor.utils.io.u.c(r9)
            throw r5
        Lad:
            java.lang.Object r9 = r3._closed
            io.ktor.utils.io.internal.c r9 = (io.ktor.utils.io.internal.c) r9
            if (r9 != 0) goto Lb4
            return r0
        Lb4:
            java.lang.Throwable r9 = r9.a()
            io.ktor.utils.io.u.c(r9)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.a0(int, d4.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:17:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(byte[] r6, int r7, int r8, d4.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.q
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.q r0 = (io.ktor.utils.io.q) r0
            int r1 = r0.f12269m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12269m = r1
            goto L18
        L13:
            io.ktor.utils.io.q r0 = new io.ktor.utils.io.q
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f12267k
            int r1 = r0.f12269m
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 == r2) goto L30
            r6 = 2
            if (r1 != r6) goto L28
            X3.a.e(r9)
            return r9
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            int r6 = r0.f12266j
            int r7 = r0.f12265i
            byte[] r8 = r0.f12264h
            io.ktor.utils.io.t r1 = r0.f12263g
            X3.a.e(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L56
        L3f:
            X3.a.e(r9)
            r1 = r5
        L43:
            r0.f12263g = r1
            r0.f12264h = r6
            r0.f12265i = r7
            r0.f12266j = r8
            r0.f12269m = r2
            java.lang.Object r9 = r1.R(r0)
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r9 != r3) goto L56
            return r3
        L56:
            r1.getClass()
            int r9 = r1.T(r6, r7, r8)
            if (r9 <= 0) goto L43
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.b0(byte[], int, int, d4.c):java.lang.Object");
    }

    public final boolean c0(int i6) {
        io.ktor.utils.io.internal.l lVar = (io.ktor.utils.io.internal.l) this._state;
        return ((io.ktor.utils.io.internal.c) this._closed) == null && lVar.f12184b._availableForWrite$internal < i6 && lVar != io.ktor.utils.io.internal.g.f12173c;
    }

    public final void d(InterfaceC1922e0 interfaceC1922e0) {
        InterfaceC1922e0 interfaceC1922e02 = this.attachedJob;
        if (interfaceC1922e02 != null) {
            interfaceC1922e02.f(null);
        }
        this.attachedJob = interfaceC1922e0;
        interfaceC1922e0.H(true, true, new s(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r4, l4.c r5, d4.c r6) {
        /*
            r3 = this;
            boolean r5 = r6 instanceof io.ktor.utils.io.C1122a
            if (r5 == 0) goto L13
            r5 = r6
            io.ktor.utils.io.a r5 = (io.ktor.utils.io.C1122a) r5
            int r0 = r5.f12107j
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f12107j = r0
            goto L18
        L13:
            io.ktor.utils.io.a r5 = new io.ktor.utils.io.a
            r5.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r5.f12105h
            int r0 = r5.f12107j
            X3.y r1 = X3.y.a
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 == r2) goto L32
            r4 = 2
            if (r0 != r4) goto L2a
            X3.a.e(r6)
            return r1
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            io.ktor.utils.io.t r4 = r5.f12104g
            X3.a.e(r6)
            goto L49
        L38:
            X3.a.e(r6)
            r5.f12104g = r3
            r5.f12107j = r2
            java.lang.Object r4 = r3.a0(r4, r5)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r4 != r5) goto L48
            return r5
        L48:
            r4 = r3
        L49:
            r4.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.e(int, l4.c, d4.c):java.lang.Object");
    }

    public final void f(ByteBuffer byteBuffer, io.ktor.utils.io.internal.n nVar, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f12284e = h(byteBuffer, this.f12284e + i6);
        nVar.a(i6);
        this.totalBytesRead += i6;
        L();
    }

    public final void g(ByteBuffer byteBuffer, io.ktor.utils.io.internal.n nVar, int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f12285f = h(byteBuffer, this.f12285f + i6);
        nVar.b(i6);
        this.totalBytesWritten += i6;
    }

    public final int h(ByteBuffer byteBuffer, int i6) {
        int capacity = byteBuffer.capacity();
        int i7 = this.f12283d;
        return i6 >= capacity - i7 ? i6 - (byteBuffer.capacity() - i7) : i6;
    }

    public final boolean i(Throwable th) {
        if (((io.ktor.utils.io.internal.c) this._closed) == null) {
            io.ktor.utils.io.internal.c cVar = th == null ? io.ktor.utils.io.internal.c.f12169b : new io.ktor.utils.io.internal.c(th);
            ((io.ktor.utils.io.internal.l) this._state).f12184b.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12278k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            ((io.ktor.utils.io.internal.l) this._state).f12184b.c();
            io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
            if (nVar._availableForWrite$internal == nVar.a || th != null) {
                P();
            }
            InterfaceC0905c interfaceC0905c = (InterfaceC0905c) f12279l.getAndSet(this, null);
            if (interfaceC0905c != null) {
                if (th != null) {
                    interfaceC0905c.k(X3.a.b(th));
                } else {
                    interfaceC0905c.k(Boolean.valueOf(((io.ktor.utils.io.internal.l) this._state).f12184b._availableForRead$internal > 0));
                }
            }
            InterfaceC0905c interfaceC0905c2 = (InterfaceC0905c) f12280m.getAndSet(this, null);
            if (interfaceC0905c2 != null) {
                interfaceC0905c2.k(X3.a.b(th == null ? new D("Byte channel was closed", 0) : th));
            }
            io.ktor.utils.io.internal.k kVar = io.ktor.utils.io.internal.k.f12183c;
            if (th != null) {
                InterfaceC1922e0 interfaceC1922e0 = this.attachedJob;
                if (interfaceC1922e0 != null) {
                    interfaceC1922e0.f(null);
                }
                this.f12286g.b(th);
                this.f12287h.b(th);
                return true;
            }
            this.f12287h.b(new D("Byte channel was closed", 0));
            io.ktor.utils.io.internal.b bVar = this.f12286g;
            Boolean valueOf = Boolean.valueOf(((io.ktor.utils.io.internal.l) this._state).f12184b.c());
            bVar.getClass();
            bVar.k(valueOf);
            io.ktor.utils.io.internal.a aVar = (io.ktor.utils.io.internal.a) io.ktor.utils.io.internal.b.f12168e.getAndSet(bVar, null);
            if (aVar != null) {
                aVar.a();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
        r2 = r29;
        r4 = r30;
        r0 = r1;
        r1 = r17;
        r28 = r18;
        r5 = r20;
        r7 = r21;
        r10 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cd A[Catch: all -> 0x003c, TryCatch #15 {all -> 0x003c, blocks: (B:14:0x0037, B:15:0x00b0, B:17:0x00b6, B:53:0x0284, B:56:0x0292, B:77:0x02ac, B:79:0x02b2, B:82:0x02bc, B:83:0x02c4, B:84:0x02ca, B:85:0x02b6, B:171:0x02cd, B:172:0x02d1, B:177:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #15 {all -> 0x003c, blocks: (B:14:0x0037, B:15:0x00b0, B:17:0x00b6, B:53:0x0284, B:56:0x0292, B:77:0x02ac, B:79:0x02b2, B:82:0x02bc, B:83:0x02c4, B:84:0x02ca, B:85:0x02b6, B:171:0x02cd, B:172:0x02d1, B:177:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[Catch: all -> 0x0215, TRY_LEAVE, TryCatch #10 {all -> 0x0215, blocks: (B:23:0x00d6, B:25:0x00dc), top: B:22:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0239 A[Catch: all -> 0x0230, TryCatch #6 {all -> 0x0230, blocks: (B:38:0x0224, B:40:0x022a, B:43:0x0239, B:44:0x0244, B:46:0x0250, B:48:0x025a, B:61:0x0234), top: B:37:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0250 A[Catch: all -> 0x0230, TryCatch #6 {all -> 0x0230, blocks: (B:38:0x0224, B:40:0x022a, B:43:0x0239, B:44:0x0244, B:46:0x0250, B:48:0x025a, B:61:0x0234), top: B:37:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b2 A[Catch: all -> 0x003c, TryCatch #15 {all -> 0x003c, blocks: (B:14:0x0037, B:15:0x00b0, B:17:0x00b6, B:53:0x0284, B:56:0x0292, B:77:0x02ac, B:79:0x02b2, B:82:0x02bc, B:83:0x02c4, B:84:0x02ca, B:85:0x02b6, B:171:0x02cd, B:172:0x02d1, B:177:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bc A[Catch: all -> 0x003c, TryCatch #15 {all -> 0x003c, blocks: (B:14:0x0037, B:15:0x00b0, B:17:0x00b6, B:53:0x0284, B:56:0x0292, B:77:0x02ac, B:79:0x02b2, B:82:0x02bc, B:83:0x02c4, B:84:0x02ca, B:85:0x02b6, B:171:0x02cd, B:172:0x02d1, B:177:0x0051), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0295 -> B:15:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(io.ktor.utils.io.t r28, long r29, d4.c r31) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.j(io.ktor.utils.io.t, long, d4.c):java.lang.Object");
    }

    public final Object k(C3.d dVar) {
        long j3;
        ByteBuffer M5 = M();
        if (M5 != null) {
            io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
            try {
                if (nVar._availableForRead$internal != 0) {
                    int h3 = nVar.h((int) Math.min(2147483647L, Long.MAX_VALUE));
                    f(M5, nVar, h3);
                    j3 = h3;
                    long j4 = j3;
                    return (j4 != Long.MAX_VALUE || p()) ? new Long(j4) : l(j4, Long.MAX_VALUE, dVar);
                }
            } finally {
                I();
                P();
            }
        }
        j3 = 0;
        long j42 = j3;
        if (j42 != Long.MAX_VALUE) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, m4.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0071 -> B:10:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r10, long r12, d4.c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.C1124c
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.c r0 = (io.ktor.utils.io.C1124c) r0
            int r1 = r0.f12128l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12128l = r1
            goto L18
        L13:
            io.ktor.utils.io.c r0 = new io.ktor.utils.io.c
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.f12126j
            c4.a r1 = c4.EnumC0927a.f11114c
            int r2 = r0.f12128l
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r10 = r0.f12125i
            m4.v r12 = r0.f12124h
            io.ktor.utils.io.t r13 = r0.f12123g
            X3.a.e(r14)
            goto L74
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            X3.a.e(r14)
            m4.v r14 = new m4.v
            r14.<init>()
            r14.f12972c = r10
            r10 = r12
            r12 = r14
            r13 = r9
        L42:
            long r4 = r12.f12972c
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 >= 0) goto La5
            java.nio.ByteBuffer r14 = r13.M()
            if (r14 != 0) goto L4f
            goto L5f
        L4f:
            java.lang.Object r2 = r13._state
            io.ktor.utils.io.internal.l r2 = (io.ktor.utils.io.internal.l) r2
            io.ktor.utils.io.internal.n r2 = r2.f12184b
            int r4 = r2._availableForRead$internal     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L7d
            r13.I()
            r13.P()
        L5f:
            boolean r14 = r13.p()
            if (r14 != 0) goto La5
            r0.f12123g = r13
            r0.f12124h = r12
            r0.f12125i = r10
            r0.f12128l = r3
            java.lang.Object r14 = r13.C(r3, r0)
            if (r14 != r1) goto L74
            return r1
        L74:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L42
            goto La5
        L7d:
            long r4 = r12.f12972c     // Catch: java.lang.Throwable -> L9d
            long r4 = r10 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.lang.Throwable -> L9d
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L9d
            int r4 = r2.h(r4)     // Catch: java.lang.Throwable -> L9d
            r13.f(r14, r2, r4)     // Catch: java.lang.Throwable -> L9d
            long r5 = r12.f12972c     // Catch: java.lang.Throwable -> L9d
            long r7 = (long) r4     // Catch: java.lang.Throwable -> L9d
            long r5 = r5 + r7
            r12.f12972c = r5     // Catch: java.lang.Throwable -> L9d
            r13.I()
            r13.P()
            goto L42
        L9d:
            r10 = move-exception
            r13.I()
            r13.P()
            throw r10
        La5:
            long r10 = r12.f12972c
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.l(long, long, d4.c):java.lang.Object");
    }

    public final void m(int i6) {
        io.ktor.utils.io.internal.l lVar;
        do {
            lVar = (io.ktor.utils.io.internal.l) this._state;
            if (lVar == io.ktor.utils.io.internal.k.f12183c) {
                return;
            } else {
                lVar.f12184b.c();
            }
        } while (lVar != ((io.ktor.utils.io.internal.l) this._state));
        int i7 = lVar.f12184b._availableForWrite$internal;
        if (lVar.f12184b._availableForRead$internal >= 1) {
            K();
        }
        if (i7 >= i6) {
            L();
        }
    }

    public final int n() {
        return ((io.ktor.utils.io.internal.l) this._state).f12184b._availableForRead$internal;
    }

    public final Throwable o() {
        io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
        if (cVar != null) {
            return cVar.a;
        }
        return null;
    }

    public final boolean p() {
        return ((io.ktor.utils.io.internal.l) this._state) == io.ktor.utils.io.internal.k.f12183c && ((io.ktor.utils.io.internal.c) this._closed) != null;
    }

    public final boolean q() {
        return ((io.ktor.utils.io.internal.c) this._closed) != null;
    }

    public final void r(ByteBuffer byteBuffer, int i6, int i7) {
        if (i6 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int capacity = byteBuffer.capacity() - this.f12283d;
        int i8 = i7 + i6;
        if (i8 <= capacity) {
            capacity = i8;
        }
        byteBuffer.limit(capacity);
        byteBuffer.position(i6);
    }

    public final Object s(int i6, l4.c cVar, d4.c cVar2) {
        int i7;
        X3.y yVar = X3.y.a;
        if (i6 < 0) {
            throw new IllegalArgumentException("min should be positive or zero");
        }
        ByteBuffer M5 = M();
        boolean z5 = false;
        if (M5 != null) {
            io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
            try {
                if (nVar._availableForRead$internal != 0 && (i7 = nVar._availableForRead$internal) > 0 && i7 >= i6) {
                    int position = M5.position();
                    int limit = M5.limit();
                    cVar.f(M5);
                    if (limit != M5.limit()) {
                        throw new IllegalStateException("Buffer limit modified.");
                    }
                    int position2 = M5.position() - position;
                    if (position2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported.");
                    }
                    while (true) {
                        int i8 = nVar._availableForRead$internal;
                        if (i8 < position2) {
                            break;
                        }
                        if (io.ktor.utils.io.internal.n.f12186b.compareAndSet(nVar, i8, i8 - position2)) {
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        throw new IllegalStateException("Check failed.");
                    }
                    f(M5, nVar, position2);
                    z5 = true;
                }
            } finally {
                I();
                P();
            }
        }
        if (!z5) {
            if (p() && i6 > 0) {
                throw new EOFException(B3.e.l("Got EOF but at least ", i6, " bytes were expected"));
            }
            Object z6 = z(i6, cVar, cVar2);
            if (z6 == EnumC0927a.f11114c) {
                return z6;
            }
        }
        return yVar;
    }

    public final int t(byte[] bArr, int i6, int i7) {
        ByteBuffer M5 = M();
        int i8 = 0;
        if (M5 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
        try {
            if (nVar._availableForRead$internal != 0) {
                int capacity = M5.capacity() - this.f12283d;
                while (true) {
                    int i9 = i7 - i8;
                    if (i9 == 0) {
                        break;
                    }
                    int i10 = this.f12284e;
                    int h3 = nVar.h(Math.min(capacity - i10, i9));
                    if (h3 == 0) {
                        break;
                    }
                    M5.limit(i10 + h3);
                    M5.position(i10);
                    M5.get(bArr, i6 + i8, h3);
                    f(M5, nVar, h3);
                    i8 += h3;
                }
            }
            return i8;
        } finally {
            I();
            P();
        }
    }

    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((io.ktor.utils.io.internal.l) this._state) + ')';
    }

    public final Object v(V3.b bVar, d4.c cVar) {
        int u5 = u(this, bVar);
        if (u5 == 0 && ((io.ktor.utils.io.internal.c) this._closed) != null) {
            u5 = ((io.ktor.utils.io.internal.l) this._state).f12184b.c() ? u(this, bVar) : -1;
        } else if (u5 <= 0 && bVar.f8665e > bVar.f8663c) {
            return x(bVar, cVar);
        }
        return new Integer(u5);
    }

    public final Object w(byte[] bArr, int i6, int i7, d4.c cVar) {
        int t5 = t(bArr, i6, i7);
        if (t5 == 0 && ((io.ktor.utils.io.internal.c) this._closed) != null) {
            t5 = ((io.ktor.utils.io.internal.l) this._state).f12184b.c() ? t(bArr, i6, i7) : -1;
        } else if (t5 <= 0 && i7 != 0) {
            return y(bArr, i6, i7, cVar);
        }
        return new Integer(t5);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(V3.b r6, d4.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.C1126e
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.e r0 = (io.ktor.utils.io.C1126e) r0
            int r1 = r0.f12140k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12140k = r1
            goto L18
        L13:
            io.ktor.utils.io.e r0 = new io.ktor.utils.io.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f12138i
            int r1 = r0.f12140k
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            X3.a.e(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            V3.b r6 = r0.f12137h
            io.ktor.utils.io.t r1 = r0.f12136g
            X3.a.e(r7)
            goto L4b
        L3a:
            X3.a.e(r7)
            r0.f12136g = r5
            r0.f12137h = r6
            r0.f12140k = r3
            java.lang.Object r7 = r5.C(r3, r0)
            if (r7 != r4) goto L4a
            goto L67
        L4a:
            r1 = r5
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5a
            java.lang.Integer r6 = new java.lang.Integer
            r7 = -1
            r6.<init>(r7)
            return r6
        L5a:
            r7 = 0
            r0.f12136g = r7
            r0.f12137h = r7
            r0.f12140k = r2
            java.lang.Object r6 = r1.v(r6, r0)
            if (r6 != r4) goto L68
        L67:
            return r4
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.x(V3.b, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(byte[] r6, int r7, int r8, d4.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.C1125d
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.d r0 = (io.ktor.utils.io.C1125d) r0
            int r1 = r0.f12135m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12135m = r1
            goto L18
        L13:
            io.ktor.utils.io.d r0 = new io.ktor.utils.io.d
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f12133k
            int r1 = r0.f12135m
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            X3.a.e(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r8 = r0.f12132j
            int r7 = r0.f12131i
            byte[] r6 = r0.f12130h
            io.ktor.utils.io.t r1 = r0.f12129g
            X3.a.e(r9)
            goto L53
        L3e:
            X3.a.e(r9)
            r0.f12129g = r5
            r0.f12130h = r6
            r0.f12131i = r7
            r0.f12132j = r8
            r0.f12135m = r3
            java.lang.Object r9 = r5.C(r3, r0)
            if (r9 != r4) goto L52
            goto L6f
        L52:
            r1 = r5
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L62
            java.lang.Integer r6 = new java.lang.Integer
            r7 = -1
            r6.<init>(r7)
            return r6
        L62:
            r9 = 0
            r0.f12129g = r9
            r0.f12130h = r9
            r0.f12135m = r2
            java.lang.Object r6 = r1.w(r6, r7, r8, r0)
            if (r6 != r4) goto L70
        L6f:
            return r4
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.y(byte[], int, int, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(int r7, l4.c r8, d4.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.C1127f
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.f r0 = (io.ktor.utils.io.C1127f) r0
            int r1 = r0.f12146l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12146l = r1
            goto L18
        L13:
            io.ktor.utils.io.f r0 = new io.ktor.utils.io.f
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f12144j
            int r1 = r0.f12146l
            X3.y r2 = X3.y.a
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            X3.a.e(r9)
            return r2
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r7 = r0.f12143i
            l4.c r8 = r0.f12142h
            io.ktor.utils.io.t r1 = r0.f12141g
            X3.a.e(r9)
            goto L56
        L3e:
            X3.a.e(r9)
            if (r7 >= r4) goto L45
            r9 = r4
            goto L46
        L45:
            r9 = r7
        L46:
            r0.f12141g = r6
            r0.f12142h = r8
            r0.f12143i = r7
            r0.f12146l = r4
            java.lang.Object r9 = r6.C(r9, r0)
            if (r9 != r5) goto L55
            goto L7c
        L55:
            r1 = r6
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6f
            if (r7 > 0) goto L61
            goto L7d
        L61:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r9 = "Got EOF but at least "
            java.lang.String r0 = " bytes were expected"
            java.lang.String r7 = B3.e.l(r9, r7, r0)
            r8.<init>(r7)
            throw r8
        L6f:
            r9 = 0
            r0.f12141g = r9
            r0.f12142h = r9
            r0.f12146l = r3
            java.lang.Object r7 = r1.s(r7, r8, r0)
            if (r7 != r5) goto L7d
        L7c:
            return r5
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.z(int, l4.c, d4.c):java.lang.Object");
    }

    public t(boolean z5, W3.e eVar, int i6) {
        AbstractC1276k.f(eVar, "pool");
        this.f12281b = z5;
        this.f12282c = eVar;
        this.f12283d = i6;
        this._state = io.ktor.utils.io.internal.g.f12173c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        V3.b.f8804l.getClass();
        io.ktor.utils.io.internal.n nVar = ((io.ktor.utils.io.internal.l) this._state).f12184b;
        this.f12286g = new io.ktor.utils.io.internal.b();
        this.f12287h = new io.ktor.utils.io.internal.b();
        this.f12288i = new s(this, 0);
    }
}
