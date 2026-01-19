package A4;

import B4.AbstractC0054g;
import I2.C0235e;
import b4.InterfaceC0910h;
import z4.EnumC2050a;

/* renamed from: A4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c extends AbstractC0054g {

    /* renamed from: g, reason: collision with root package name */
    public final C0235e f241g;

    /* renamed from: h, reason: collision with root package name */
    public final C0235e f242h;

    public C0002c(C0235e c0235e, InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        super(interfaceC0910h, i6, enumC2050a);
        this.f241g = c0235e;
        this.f242h = c0235e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // B4.AbstractC0054g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(z4.u r5, b4.InterfaceC0905c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof A4.C0001b
            if (r0 == 0) goto L13
            r0 = r6
            A4.b r0 = (A4.C0001b) r0
            int r1 = r0.f236j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236j = r1
            goto L1a
        L13:
            A4.b r0 = new A4.b
            d4.c r6 = (d4.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f234h
            int r1 = r0.f236j
            X3.y r2 = X3.y.a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            z4.u r5 = r0.f233g
            X3.a.e(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            X3.a.e(r6)
            r0.f233g = r5
            r0.f236j = r3
            I2.e r6 = r4.f241g
            java.lang.Object r6 = r6.m(r5, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r6 != r0) goto L45
            goto L46
        L45:
            r6 = r2
        L46:
            if (r6 != r0) goto L49
            return r0
        L49:
            z4.t r5 = (z4.t) r5
            z4.h r5 = r5.f16380g
            boolean r5 = r5.y()
            if (r5 == 0) goto L54
            return r2
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.C0002c.e(z4.u, b4.c):java.lang.Object");
    }

    @Override // B4.AbstractC0054g
    public final AbstractC0054g f(InterfaceC0910h interfaceC0910h, int i6, EnumC2050a enumC2050a) {
        return new C0002c(this.f242h, interfaceC0910h, i6, enumC2050a);
    }

    @Override // B4.AbstractC0054g
    public final String toString() {
        return "block[" + this.f241g + "] -> " + super.toString();
    }
}
