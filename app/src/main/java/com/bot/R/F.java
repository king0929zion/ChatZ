package R;

import B0.EnumC0041q;
import Q.s3;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class F extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public EnumC0041q f6691f;

    /* renamed from: g, reason: collision with root package name */
    public int f6692g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1942y f6694i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s3 f6695j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC1942y interfaceC1942y, s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6694i = interfaceC1942y;
        this.f6695j = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((F) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        F f6 = new F(this.f6694i, this.f6695j, interfaceC0905c);
        f6.f6693h = obj;
        return f6;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002f -> B:5:0x0032). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f6692g
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            B0.q r0 = r6.f6691f
            java.lang.Object r2 = r6.f6693h
            B0.V r2 = (B0.V) r2
            X3.a.e(r7)
            goto L32
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            X3.a.e(r7)
            java.lang.Object r7 = r6.f6693h
            B0.V r7 = (B0.V) r7
            B0.q r0 = B0.EnumC0041q.f476e
            r2 = r7
        L23:
            r6.f6693h = r2
            r6.f6691f = r0
            r6.f6692g = r1
            java.lang.Object r7 = r2.b(r0, r6)
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r7 != r3) goto L32
            return r3
        L32:
            B0.p r7 = (B0.C0040p) r7
            java.lang.Object r3 = r7.a
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            B0.y r3 = (B0.y) r3
            int r3 = r3.f489i
            r4 = 2
            if (r3 != r4) goto L23
            int r7 = r7.f474f
            r3 = 4
            Q.s3 r4 = r6.f6695j
            if (r7 != r3) goto L56
            R.E r7 = new R.E
            r3 = 0
            r7.<init>(r4, r3)
            r4 = 3
            x4.y r5 = r6.f6694i
            x4.AbstractC1888A.y(r5, r3, r7, r4)
            goto L23
        L56:
            r3 = 5
            if (r7 != r3) goto L23
            r4.a()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: R.F.r(java.lang.Object):java.lang.Object");
    }
}
