package O;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* renamed from: O.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297a0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f4072f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.c f4074h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0297a0(InterfaceC0905c interfaceC0905c, l4.c cVar) {
        super(2, interfaceC0905c);
        this.f4074h = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((C0297a0) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0297a0 c0297a0 = new C0297a0(interfaceC0905c, this.f4074h);
        c0297a0.f4073g = obj;
        return c0297a0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f4072f
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto Lf
            java.lang.Object r0 = r3.f4073g
            B0.V r0 = (B0.V) r0
            X3.a.e(r4)
            goto L2e
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            X3.a.e(r4)
            java.lang.Object r4 = r3.f4073g
            B0.V r4 = (B0.V) r4
            r0 = r4
        L1f:
            r3.f4073g = r0
            r3.f4072f = r1
            B0.q r4 = B0.EnumC0041q.f475c
            java.lang.Object r4 = r0.b(r4, r3)
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r4 != r2) goto L2e
            return r2
        L2e:
            B0.p r4 = (B0.C0040p) r4
            boolean r4 = O.AbstractC0336u0.v(r4)
            r4 = r4 ^ r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            l4.c r2 = r3.f4074h
            r2.f(r4)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0297a0.r(java.lang.Object):java.lang.Object");
    }
}
