package h1;

import X3.y;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f11838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11839i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f11840j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f11841k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z5, i iVar, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11839i = z5;
        this.f11840j = iVar;
        this.f11841k = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new e(this.f11839i, this.f11840j, this.f11841k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f11838h
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L16
            if (r0 != r1) goto Le
            X3.a.e(r11)
            goto L4c
        Le:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L16:
            X3.a.e(r11)
            r9 = r10
            goto L36
        L1b:
            X3.a.e(r11)
            boolean r11 = r10.f11839i
            h1.i r0 = r10.f11840j
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r11 != 0) goto L3c
            A0.e r4 = r0.f11854c
            r10.f11838h = r2
            r5 = 0
            long r7 = r10.f11841k
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L36
            goto L4b
        L36:
            e1.q r11 = (e1.q) r11
            r11.getClass()
            goto L51
        L3c:
            r9 = r10
            A0.e r4 = r0.f11854c
            r9.f11838h = r1
            long r5 = r9.f11841k
            r7 = 0
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L4c
        L4b:
            return r3
        L4c:
            e1.q r11 = (e1.q) r11
            r11.getClass()
        L51:
            X3.y r11 = X3.y.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e.r(java.lang.Object):java.lang.Object");
    }
}
