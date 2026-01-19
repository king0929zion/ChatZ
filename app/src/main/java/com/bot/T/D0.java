package T;

import Z2.C0741a0;
import b4.AbstractC0903a;
import b4.InterfaceC0910h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import x4.C1940w;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0903a implements CoroutineExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.d f7942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E0 f7943f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D0(g0.d r2, T.E0 r3) {
        /*
            r1 = this;
            x4.w r0 = x4.C1940w.f15730c
            r1.f7942e = r2
            r1.f7943f = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.D0.<init>(g0.d, T.E0):void");
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void N(InterfaceC0910h interfaceC0910h, Throwable th) {
        g0.d dVar = this.f7942e;
        E0 e02 = this.f7943f;
        s4.j.O(th, new C0741a0(1, dVar, e02));
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) e02.f7948c.r(C1940w.f15730c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.N(interfaceC0910h, th);
    }
}
