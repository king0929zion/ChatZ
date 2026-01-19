package I0;

import android.view.View;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicReference;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class S implements InterfaceC1942y {

    /* renamed from: c, reason: collision with root package name */
    public final View f2242c;

    /* renamed from: e, reason: collision with root package name */
    public final X0.w f2243e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1942y f2244f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f2245g = new AtomicReference(null);

    public S(View view, X0.w wVar, InterfaceC1942y interfaceC1942y) {
        this.f2242c = view;
        this.f2243e = wVar;
        this.f2244f = interfaceC1942y;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(M.y r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof I0.P
            if (r0 == 0) goto L13
            r0 = r6
            I0.P r0 = (I0.P) r0
            int r1 = r0.f2231i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2231i = r1
            goto L18
        L13:
            I0.P r0 = new I0.P
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2229g
            int r1 = r0.f2231i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            X3.a.e(r6)
            goto L4e
        L2d:
            X3.a.e(r6)
            B0.F r6 = new B0.F
            r1 = 4
            r6.<init>(r1, r5, r4)
            I0.Q r5 = new I0.Q
            r1 = 0
            r5.<init>(r4, r1)
            r0.f2231i = r2
            h0.u r2 = new h0.u
            java.util.concurrent.atomic.AtomicReference r3 = r4.f2245g
            r2.<init>(r6, r3, r5, r1)
            java.lang.Object r5 = x4.AbstractC1888A.l(r2, r0)
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L4e
            return
        L4e:
            N0.e r5 = new N0.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.S.a(M.y, d4.c):void");
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f2244f.c();
    }
}
