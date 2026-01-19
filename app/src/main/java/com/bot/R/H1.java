package r;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class H1 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public long f14056f;

    /* renamed from: g, reason: collision with root package name */
    public int f14057g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B0.y f14059i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(B0.y yVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14059i = yVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((H1) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        H1 h12 = new H1(this.f14059i, interfaceC0905c);
        h12.f14058h = obj;
        return h12;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f14057g
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            long r2 = r6.f14056f
            java.lang.Object r0 = r6.f14058h
            B0.V r0 = (B0.V) r0
            X3.a.e(r7)
            goto L40
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            X3.a.e(r7)
            java.lang.Object r7 = r6.f14058h
            B0.V r7 = (B0.V) r7
            B0.y r0 = r6.f14059i
            long r2 = r0.f482b
            I0.X0 r0 = r7.g()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L30:
            r6.f14058h = r0
            r6.f14056f = r2
            r6.f14057g = r1
            r7 = 3
            java.lang.Object r7 = r.f2.c(r0, r6, r7)
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r7 != r4) goto L40
            return r4
        L40:
            B0.y r7 = (B0.y) r7
            long r4 = r7.f482b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L30
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r.H1.r(java.lang.Object):java.lang.Object");
    }
}
