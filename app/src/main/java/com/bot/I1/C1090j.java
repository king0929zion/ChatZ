package i1;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: i1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090j extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f11992h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f11993i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1105y f11994j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1090j(C1105y c1105y, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11994j = c1105y;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1090j) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1090j c1090j = new C1090j(this.f11994j, interfaceC0905c);
        c1090j.f11993i = obj;
        return c1090j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f11992h
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto Lf
            java.lang.Object r0 = r7.f11993i
            x4.y r0 = (x4.InterfaceC1942y) r0
            X3.a.e(r8)
            goto L48
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            X3.a.e(r8)
            java.lang.Object r8 = r7.f11993i
            x4.y r8 = (x4.InterfaceC1942y) r8
            r0 = r8
        L1f:
            boolean r8 = x4.AbstractC1888A.w(r0)
            if (r8 == 0) goto L6f
            i1.d r8 = i1.C1084d.f11974g
            r7.f11993i = r0
            r7.f11992h = r1
            b4.h r2 = r7.f11435e
            m4.AbstractC1276k.c(r2)
            I0.C0 r3 = I0.C0.f2136c
            b4.f r3 = r2.r(r3)
            if (r3 != 0) goto L69
            m4.AbstractC1276k.c(r2)
            I0.Z r2 = T.r.w(r2)
            java.lang.Object r8 = r2.a(r7, r8)
            c4.a r2 = c4.EnumC0927a.f11114c
            if (r8 != r2) goto L48
            return r2
        L48:
            i1.y r8 = r7.f11994j
            int[] r2 = r8.f12035E
            boolean r3 = r8.isAttachedToWindow()
            if (r3 != 0) goto L53
            goto L1f
        L53:
            r3 = 0
            r4 = r2[r3]
            r5 = r2[r1]
            android.view.View r6 = r8.f12039o
            r6.getLocationOnScreen(r2)
            r3 = r2[r3]
            if (r4 != r3) goto L65
            r2 = r2[r1]
            if (r5 == r2) goto L1f
        L65:
            r8.m()
            goto L1f
        L69:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException
            r8.<init>()
            throw r8
        L6f:
            X3.y r8 = X3.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1090j.r(java.lang.Object):java.lang.Object");
    }
}
