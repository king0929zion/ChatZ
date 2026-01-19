package B4;

import A4.InterfaceC0008i;
import I3.C0241e;
import java.nio.charset.Charset;
import m4.C1288w;

/* loaded from: classes.dex */
public final class m implements InterfaceC0008i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f605c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f608g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f609h;

    public m(InterfaceC0008i interfaceC0008i, C0241e c0241e, Charset charset, R3.a aVar, Object obj) {
        this.f605c = 2;
        this.f609h = interfaceC0008i;
        this.f606e = charset;
        this.f607f = aVar;
        this.f608g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011a  */
    @Override // A4.InterfaceC0008i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r7, b4.InterfaceC0905c r8) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.m.a(java.lang.Object, b4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r1.a(r15, r2) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r1.a(r15, r2) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int[] r14, b4.InterfaceC0905c r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f607f
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.f609h
            A4.i r1 = (A4.InterfaceC0008i) r1
            boolean r2 = r15 instanceof N1.F
            if (r2 == 0) goto L1b
            r2 = r15
            N1.F r2 = (N1.F) r2
            int r3 = r2.f3653k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f3653k = r3
            goto L20
        L1b:
            N1.F r2 = new N1.F
            r2.<init>(r13, r15)
        L20:
            java.lang.Object r15 = r2.f3651i
            int r3 = r2.f3653k
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3d
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            int[] r14 = r2.f3650h
            B4.m r0 = r2.f3649g
            X3.a.e(r15)
            goto La2
        L3d:
            X3.a.e(r15)
            java.lang.Object r15 = r13.f606e
            m4.w r15 = (m4.C1288w) r15
            java.lang.Object r3 = r15.f12973c
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r3 != 0) goto L5b
            java.util.Set r15 = Y3.k.C0(r0)
            r2.f3649g = r13
            r2.f3650h = r14
            r2.f3653k = r5
            java.lang.Object r15 = r1.a(r15, r2)
            if (r15 != r6) goto La1
            goto La0
        L5b:
            java.lang.Object r3 = r13.f608g
            int[] r3 = (int[]) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L67:
            if (r8 >= r7) goto L8a
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r15.f12973c
            if (r12 == 0) goto L82
            int[] r12 = (int[]) r12
            r9 = r3[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L7e
            r5.add(r10)
        L7e:
            int r8 = r8 + 1
            r9 = r11
            goto L67
        L82:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        L8a:
            boolean r15 = r5.isEmpty()
            if (r15 != 0) goto La1
            java.util.Set r15 = Y3.m.N0(r5)
            r2.f3649g = r13
            r2.f3650h = r14
            r2.f3653k = r4
            java.lang.Object r15 = r1.a(r15, r2)
            if (r15 != r6) goto La1
        La0:
            return r6
        La1:
            r0 = r13
        La2:
            java.lang.Object r15 = r0.f606e
            m4.w r15 = (m4.C1288w) r15
            r15.f12973c = r14
            X3.y r14 = X3.y.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.m.b(int[], b4.c):java.lang.Object");
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f605c = i6;
        this.f606e = obj;
        this.f607f = obj2;
        this.f608g = obj3;
        this.f609h = obj4;
    }

    public m(C1288w c1288w, InterfaceC0008i interfaceC0008i, String[] strArr, int[] iArr) {
        this.f605c = 3;
        this.f606e = c1288w;
        this.f609h = interfaceC0008i;
        this.f607f = strArr;
        this.f608g = iArr;
    }
}
