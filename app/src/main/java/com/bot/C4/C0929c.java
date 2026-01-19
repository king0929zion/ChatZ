package c4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929c extends d4.c {

    /* renamed from: g, reason: collision with root package name */
    public int f11121g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l4.e f11122h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0905c f11123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0929c(InterfaceC0905c interfaceC0905c, InterfaceC0910h interfaceC0910h, l4.e eVar, InterfaceC0905c interfaceC0905c2) {
        super(interfaceC0905c, interfaceC0910h);
        this.f11122h = eVar;
        this.f11123i = interfaceC0905c2;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f11121g;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f11121g = 2;
            X3.a.e(obj);
            return obj;
        }
        this.f11121g = 1;
        X3.a.e(obj);
        l4.e eVar = this.f11122h;
        AbstractC1276k.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC1291z.b(2, eVar);
        return eVar.m(this.f11123i, this);
    }
}
