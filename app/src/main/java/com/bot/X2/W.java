package X2;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class W extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9236h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9237i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Y f9238j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f9239k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Y y5, long j3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9238j = y5;
        this.f9239k = j3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((W) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        W w5 = new W(this.f9238j, this.f9239k, interfaceC0905c);
        w5.f9237i = obj;
        return w5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dc, code lost:
    
        if (x4.AbstractC1888A.m(500, r14) == r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if (r15 == r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00de, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00dc -> B:15:0x0023). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.W.r(java.lang.Object):java.lang.Object");
    }
}
