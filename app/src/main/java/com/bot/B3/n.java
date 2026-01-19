package B3;

import X3.y;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class n extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public StringBuilder f539h;

    /* renamed from: i, reason: collision with root package name */
    public int f540i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f541j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f542k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f542k = oVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((n) p((InterfaceC0905c) obj2, (F3.c) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        n nVar = new n(this.f542k, interfaceC0905c);
        nVar.f541j = obj;
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        if (r0.c(r11, r10) == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        if (r0.c(r11, r10) == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (Y3.C.F(r6, r7, r11, r10) == r5) goto L40;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8 A[RETURN] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.n.r(java.lang.Object):java.lang.Object");
    }
}
