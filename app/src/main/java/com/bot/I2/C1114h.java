package i2;

import b4.AbstractC0903a;
import b4.InterfaceC0910h;
import kotlinx.coroutines.CoroutineExceptionHandler;
import w2.C1840j;

/* renamed from: i2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114h extends AbstractC0903a implements CoroutineExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1115i f12075e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1114h(i2.C1115i r2) {
        /*
            r1 = this;
            x4.w r0 = x4.C1940w.f15730c
            r1.f12075e = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C1114h.<init>(i2.i):void");
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void N(InterfaceC0910h interfaceC0910h, Throwable th) {
        if (this.f12075e.f12079e != null) {
            C1840j.a("RealImageLoader", 6, null, th);
        }
    }
}
