package x3;

import X3.y;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import d5.InterfaceC0951k;
import io.ktor.utils.io.C;
import java.io.Closeable;
import m4.C1286u;

/* renamed from: x3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public Closeable f15625h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0910h f15626i;

    /* renamed from: j, reason: collision with root package name */
    public E3.e f15627j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0951k f15628k;

    /* renamed from: l, reason: collision with root package name */
    public C1286u f15629l;

    /* renamed from: m, reason: collision with root package name */
    public int f15630m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f15631n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0951k f15632o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0910h f15633p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ E3.e f15634q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884h(InterfaceC0951k interfaceC0951k, InterfaceC0910h interfaceC0910h, E3.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15632o = interfaceC0951k;
        this.f15633p = interfaceC0910h;
        this.f15634q = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1884h) p((InterfaceC0905c) obj2, (C) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1884h c1884h = new C1884h(this.f15632o, this.f15633p, this.f15634q, interfaceC0905c);
        c1884h.f15631n = obj;
        return c1884h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[Catch: all -> 0x001c, TryCatch #2 {all -> 0x001c, blocks: (B:6:0x0018, B:7:0x006b, B:8:0x003b, B:10:0x0041, B:12:0x0047, B:14:0x004b, B:33:0x002f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, m4.u] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:7:0x006b). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f15630m
            X3.y r1 = X3.y.a
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L26
            if (r0 != r2) goto L1e
            m4.u r0 = r12.f15629l
            d5.k r4 = r12.f15628k
            E3.e r5 = r12.f15627j
            b4.h r6 = r12.f15626i
            java.io.Closeable r7 = r12.f15625h
            java.lang.Object r8 = r12.f15631n
            io.ktor.utils.io.C r8 = (io.ktor.utils.io.C) r8
            X3.a.e(r13)     // Catch: java.lang.Throwable -> L1c
            goto L6b
        L1c:
            r13 = move-exception
            goto L7a
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            X3.a.e(r13)
            java.lang.Object r13 = r12.f15631n
            io.ktor.utils.io.C r13 = (io.ktor.utils.io.C) r13
            d5.k r7 = r12.f15632o
            m4.u r0 = new m4.u     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            b4.h r4 = r12.f15633p
            E3.e r5 = r12.f15634q
            r8 = r13
            r6 = r4
            r4 = r7
        L3b:
            boolean r13 = r4.isOpen()     // Catch: java.lang.Throwable -> L1c
            if (r13 == 0) goto L71
            boolean r13 = x4.AbstractC1888A.v(r6)     // Catch: java.lang.Throwable -> L1c
            if (r13 == 0) goto L71
            int r13 = r0.f12971c     // Catch: java.lang.Throwable -> L1c
            if (r13 < 0) goto L71
            io.ktor.utils.io.t r13 = r8.f12089c     // Catch: java.lang.Throwable -> L1c
            c.f r9 = new c.f     // Catch: java.lang.Throwable -> L1c
            r10 = 8
            r9.<init>(r0, r4, r5, r10)     // Catch: java.lang.Throwable -> L1c
            r12.f15631n = r8     // Catch: java.lang.Throwable -> L1c
            r12.f15625h = r7     // Catch: java.lang.Throwable -> L1c
            r12.f15626i = r6     // Catch: java.lang.Throwable -> L1c
            r12.f15627j = r5     // Catch: java.lang.Throwable -> L1c
            r12.f15628k = r4     // Catch: java.lang.Throwable -> L1c
            r12.f15629l = r0     // Catch: java.lang.Throwable -> L1c
            r12.f15630m = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r13 = io.ktor.utils.io.t.S(r13, r2, r9, r12)     // Catch: java.lang.Throwable -> L1c
            c4.a r9 = c4.EnumC0927a.f11114c
            if (r13 != r9) goto L6b
            return r9
        L6b:
            io.ktor.utils.io.t r13 = r8.f12089c     // Catch: java.lang.Throwable -> L1c
            r13.m(r2)     // Catch: java.lang.Throwable -> L1c
            goto L3b
        L71:
            if (r7 == 0) goto L78
            r7.close()     // Catch: java.lang.Throwable -> L77
            goto L78
        L77:
            r3 = move-exception
        L78:
            r13 = r1
            goto L87
        L7a:
            if (r7 == 0) goto L84
            r7.close()     // Catch: java.lang.Throwable -> L80
            goto L84
        L80:
            r0 = move-exception
            X3.a.a(r13, r0)
        L84:
            r11 = r3
            r3 = r13
            r13 = r11
        L87:
            if (r3 != 0) goto L8d
            m4.AbstractC1276k.c(r13)
            return r1
        L8d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C1884h.r(java.lang.Object):java.lang.Object");
    }
}
