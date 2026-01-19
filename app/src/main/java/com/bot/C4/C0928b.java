package c4;

import b4.InterfaceC0905c;
import d4.g;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928b extends g {

    /* renamed from: e, reason: collision with root package name */
    public int f11118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.e f11119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0905c f11120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0928b(InterfaceC0905c interfaceC0905c, InterfaceC0905c interfaceC0905c2, l4.e eVar) {
        super(interfaceC0905c);
        this.f11119f = eVar;
        this.f11120g = interfaceC0905c2;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f11118e;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f11118e = 2;
            X3.a.e(obj);
            return obj;
        }
        this.f11118e = 1;
        X3.a.e(obj);
        l4.e eVar = this.f11119f;
        AbstractC1276k.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC1291z.b(2, eVar);
        return eVar.m(this.f11120g, this);
    }
}
