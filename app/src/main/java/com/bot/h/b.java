package H;

import B0.V;
import X3.y;
import b4.InterfaceC0905c;
import d4.h;
import l4.c;
import l4.e;

/* loaded from: classes.dex */
public final class b extends h implements e {

    /* renamed from: f, reason: collision with root package name */
    public int f1683f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1684g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f1685h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC0905c interfaceC0905c, c cVar) {
        super(2, interfaceC0905c);
        this.f1685h = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((b) p((InterfaceC0905c) obj2, (V) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        b bVar = new b(interfaceC0905c, this.f1685h);
        bVar.f1684g = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r7 == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r7 == r3) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f1683f
            r1 = 2
            r2 = 1
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            X3.a.e(r7)
            goto L52
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r0 = r6.f1684g
            B0.V r0 = (B0.V) r0
            X3.a.e(r7)
            goto L33
        L20:
            X3.a.e(r7)
            java.lang.Object r7 = r6.f1684g
            r0 = r7
            B0.V r0 = (B0.V) r0
            r6.f1684g = r0
            r6.f1683f = r2
            java.lang.Object r7 = h5.e.G(r0, r6)
            if (r7 != r3) goto L33
            goto L51
        L33:
            B0.y r7 = (B0.y) r7
            r7.a()
            long r4 = r7.f483c
            n0.b r7 = new n0.b
            r7.<init>(r4)
            l4.c r2 = r6.f1685h
            r2.f(r7)
            r7 = 0
            r6.f1684g = r7
            r6.f1683f = r1
            B0.q r7 = B0.EnumC0041q.f476e
            java.lang.Object r7 = r.f2.i(r0, r7, r6)
            if (r7 != r3) goto L52
        L51:
            return r3
        L52:
            B0.y r7 = (B0.y) r7
            if (r7 == 0) goto L59
            r7.a()
        L59:
            X3.y r7 = X3.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H.b.r(java.lang.Object):java.lang.Object");
    }
}
