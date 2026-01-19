package p;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class u0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v0 f13808i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13808i = v0Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((u0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new u0(this.f13808i, interfaceC0905c);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:6:0x0051). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f13807h
            r1 = 2
            r2 = 1
            p.v0 r3 = r7.f13808i
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            X3.a.e(r8)
            goto L51
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            X3.a.e(r8)
            goto L2e
        L1e:
            X3.a.e(r8)
        L21:
            z4.h r8 = r3.f13813B
            if (r8 == 0) goto L2e
            r7.f13807h = r2
            java.lang.Object r8 = r8.p(r7)
            if (r8 != r4) goto L2e
            goto L50
        L2e:
            p.G0 r8 = r3.f13819w
            if (r8 == 0) goto L21
            f0.m r8 = new f0.m
            r0 = 27
            r8.<init>(r0)
            r7.f13807h = r1
            b4.h r0 = r7.f11435e
            m4.AbstractC1276k.c(r0)
            I0.Z r0 = T.r.w(r0)
            T.U r5 = new T.U
            r6 = 0
            r5.<init>(r8, r6)
            java.lang.Object r8 = r0.a(r7, r5)
            if (r8 != r4) goto L51
        L50:
            return r4
        L51:
            p.G0 r8 = r3.f13819w
            if (r8 == 0) goto L21
            p.I0 r8 = (p.I0) r8
            r8.d()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u0.r(java.lang.Object):java.lang.Object");
    }
}
