package P1;

import U.L;
import java.util.concurrent.locks.ReentrantLock;
import l.AbstractC1180a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class m {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1193a f4601b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f4602c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f4603d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4604e;

    /* renamed from: f, reason: collision with root package name */
    public final h[] f4605f;

    /* renamed from: g, reason: collision with root package name */
    public final H4.i f4606g;

    /* renamed from: h, reason: collision with root package name */
    public final L f4607h;

    /* JADX WARN: Type inference failed for: r5v4, types: [H4.i, H4.h] */
    public m(int i6, InterfaceC1193a interfaceC1193a) {
        this.a = i6;
        this.f4601b = interfaceC1193a;
        this.f4605f = new h[i6];
        int i7 = H4.j.a;
        this.f4606g = new H4.h(i6);
        L l3 = new L(2);
        if (i6 < 1) {
            AbstractC1180a.c("capacity must be >= 1");
            throw null;
        }
        if (i6 > 1073741824) {
            AbstractC1180a.c("capacity must be <= 2^30");
            throw null;
        }
        i6 = Integer.bitCount(i6) != 1 ? Integer.highestOneBit(i6 - 1) << 1 : i6;
        l3.f8548d = i6 - 1;
        l3.f8549e = new Object[i6];
        this.f4607h = l3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:13:0x0049, B:15:0x004e, B:17:0x0054, B:20:0x005b, B:21:0x0075, B:23:0x007b, B:27:0x0093, B:28:0x0098, B:29:0x0099, B:30:0x00a0), top: B:12:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:13:0x0049, B:15:0x004e, B:17:0x0054, B:20:0x005b, B:21:0x0075, B:23:0x007b, B:27:0x0093, B:28:0x0098, B:29:0x0099, B:30:0x00a0), top: B:12:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(d4.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof P1.j
            if (r0 == 0) goto L13
            r0 = r9
            P1.j r0 = (P1.j) r0
            int r1 = r0.f4589j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4589j = r1
            goto L18
        L13:
            P1.j r0 = new P1.j
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f4587h
            int r1 = r0.f4589j
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            P1.m r0 = r0.f4586g
            X3.a.e(r9)
            goto L42
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            X3.a.e(r9)
            r0.f4586g = r8
            r0.f4589j = r2
            H4.i r9 = r8.f4606g
            java.lang.Object r9 = r9.a(r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r9 != r0) goto L41
            return r0
        L41:
            r0 = r8
        L42:
            java.util.concurrent.locks.ReentrantLock r9 = r0.f4602c     // Catch: java.lang.Throwable -> L8f
            U.L r1 = r0.f4607h     // Catch: java.lang.Throwable -> L8f
            r9.lock()     // Catch: java.lang.Throwable -> L8f
            boolean r3 = r0.f4604e     // Catch: java.lang.Throwable -> L91
            r4 = 0
            if (r3 != 0) goto L99
            int r3 = r1.f8546b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f8547c     // Catch: java.lang.Throwable -> L91
            if (r3 != r5) goto L75
            int r3 = r0.f4603d     // Catch: java.lang.Throwable -> L91
            int r5 = r0.a     // Catch: java.lang.Throwable -> L91
            if (r3 < r5) goto L5b
            goto L75
        L5b:
            P1.h r3 = new P1.h     // Catch: java.lang.Throwable -> L91
            l4.a r5 = r0.f4601b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L91
            X1.a r5 = (X1.a) r5     // Catch: java.lang.Throwable -> L91
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L91
            P1.h[] r5 = r0.f4605f     // Catch: java.lang.Throwable -> L91
            int r6 = r0.f4603d     // Catch: java.lang.Throwable -> L91
            int r7 = r6 + 1
            r0.f4603d = r7     // Catch: java.lang.Throwable -> L91
            r5[r6] = r3     // Catch: java.lang.Throwable -> L91
            r1.a(r3)     // Catch: java.lang.Throwable -> L91
        L75:
            int r3 = r1.f8546b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f8547c     // Catch: java.lang.Throwable -> L91
            if (r3 == r5) goto L93
            java.lang.Object r5 = r1.f8549e     // Catch: java.lang.Throwable -> L91
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L91
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L91
            r5[r3] = r4     // Catch: java.lang.Throwable -> L91
            int r3 = r3 + r2
            int r2 = r1.f8548d     // Catch: java.lang.Throwable -> L91
            r2 = r2 & r3
            r1.f8546b = r2     // Catch: java.lang.Throwable -> L91
            P1.h r6 = (P1.h) r6     // Catch: java.lang.Throwable -> L91
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            return r6
        L8f:
            r9 = move-exception
            goto La5
        L91:
            r1 = move-exception
            goto La1
        L93:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            throw r1     // Catch: java.lang.Throwable -> L91
        L99:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            h5.e.l0(r2, r1)     // Catch: java.lang.Throwable -> L91
            throw r4     // Catch: java.lang.Throwable -> L91
        La1:
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            throw r1     // Catch: java.lang.Throwable -> L8f
        La5:
            H4.i r0 = r0.f4606g
            r0.e()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.m.a(d4.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:9|10|11|12|13|14|15|(1:(1:54)(2:51|(1:53)))(1:17)|18|19|20|21|(1:23)(1:47)|(1:(1:44)(2:45|46))(3:25|(1:27)|(1:42)(1:31))|32|(3:34|35|(1:37)(14:39|12|13|14|15|(0)(0)|18|19|20|21|(0)(0)|(0)(0)|32|(2:40|41)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c0, code lost:
    
        r8 = r1;
        r1 = r3;
        r3 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:15:0x00c9, B:17:0x00cd, B:51:0x00d5, B:54:0x00de), top: B:14:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x00c7, TryCatch #2 {all -> 0x00c7, blocks: (B:21:0x004e, B:25:0x006b, B:29:0x007f, B:31:0x0085, B:34:0x0096, B:40:0x00b2, B:41:0x00b9, B:42:0x0088, B:45:0x00ba, B:46:0x00bf), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #2 {all -> 0x00c7, blocks: (B:21:0x004e, B:25:0x006b, B:29:0x007f, B:31:0x0085, B:34:0x0096, B:40:0x00b2, B:41:0x00b9, B:42:0x0088, B:45:0x00ba, B:46:0x00bf), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: all -> 0x00c7, TRY_ENTER, TryCatch #2 {all -> 0x00c7, blocks: (B:21:0x004e, B:25:0x006b, B:29:0x007f, B:31:0x0085, B:34:0x0096, B:40:0x00b2, B:41:0x00b9, B:42:0x0088, B:45:0x00ba, B:46:0x00bf), top: B:20:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [m4.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [l4.a] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00a4 -> B:12:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c0 -> B:13:0x00ab). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, B.h r21, d4.c r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.m.b(long, B.h, d4.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f4602c;
        reentrantLock.lock();
        try {
            this.f4604e = true;
            for (h hVar : this.f4605f) {
                if (hVar != null) {
                    hVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        L l3 = this.f4607h;
        ReentrantLock reentrantLock = this.f4602c;
        reentrantLock.lock();
        try {
            Z3.b w5 = Y4.l.w();
            int i6 = (l3.f8547c - l3.f8546b) & l3.f8548d;
            for (int i7 = 0; i7 < i6; i7++) {
                if (i7 >= 0) {
                    int i8 = l3.f8547c;
                    int i9 = l3.f8546b;
                    int i10 = l3.f8548d;
                    if (i7 < ((i8 - i9) & i10)) {
                        Object obj = ((Object[]) l3.f8549e)[(i9 + i7) & i10];
                        AbstractC1276k.c(obj);
                        w5.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            Z3.b p5 = Y4.l.p(w5);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            H4.i iVar = this.f4606g;
            iVar.getClass();
            sb2.append(Math.max(H4.h.f2059j.get(iVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + p5.a() + ")[" + Y3.m.v0(p5, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            h[] hVarArr = this.f4605f;
            int length = hVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                h hVar = hVarArr[i12];
                i11++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i11);
                sb3.append("] - ");
                sb3.append(hVar != null ? hVar.f4578c.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (hVar != null) {
                    hVar.f(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(h hVar) {
        AbstractC1276k.f(hVar, "connection");
        ReentrantLock reentrantLock = this.f4602c;
        reentrantLock.lock();
        try {
            this.f4607h.a(hVar);
            reentrantLock.unlock();
            this.f4606g.e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
