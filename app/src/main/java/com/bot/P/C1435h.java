package p;

import b4.InterfaceC0905c;
import t.C1682j;
import t.C1685m;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* renamed from: p.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1685m f13713h;

    /* renamed from: i, reason: collision with root package name */
    public int f13714i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1922e0 f13715j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f13716k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1682j f13717l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435h(InterfaceC1922e0 interfaceC1922e0, long j3, C1682j c1682j, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13715j = interfaceC1922e0;
        this.f13716k = j3;
        this.f13717l = c1682j;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1435h) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1435h(this.f13715j, this.f13716k, this.f13717l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r1.a(r0, r8) == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r1.a(r9, r8) == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r8.f13715j.Q(r8) == r5) goto L20;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f13714i
            t.j r1 = r8.f13717l
            r2 = 3
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L27
            if (r0 == r4) goto L23
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L15
            X3.a.e(r9)
            goto L58
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            t.m r0 = r8.f13713h
            X3.a.e(r9)
            goto L4c
        L23:
            X3.a.e(r9)
            goto L35
        L27:
            X3.a.e(r9)
            r8.f13714i = r4
            x4.e0 r9 = r8.f13715j
            java.lang.Object r9 = r9.Q(r8)
            if (r9 != r5) goto L35
            goto L57
        L35:
            t.l r9 = new t.l
            long r6 = r8.f13716k
            r9.<init>(r6)
            t.m r0 = new t.m
            r0.<init>(r9)
            r8.f13713h = r0
            r8.f13714i = r3
            java.lang.Object r9 = r1.a(r9, r8)
            if (r9 != r5) goto L4c
            goto L57
        L4c:
            r9 = 0
            r8.f13713h = r9
            r8.f13714i = r2
            java.lang.Object r9 = r1.a(r0, r8)
            if (r9 != r5) goto L58
        L57:
            return r5
        L58:
            X3.y r9 = X3.y.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1435h.r(java.lang.Object):java.lang.Object");
    }
}
