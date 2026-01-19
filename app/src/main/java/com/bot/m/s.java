package M;

import I0.P0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class s extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3183h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f3184i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f3185j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, d dVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3184i = tVar;
        this.f3185j = dVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((s) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new s(this.f3184i, this.f3185j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3183h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            throw new RuntimeException();
        }
        X3.a.e(obj);
        this.f3183h = 1;
        P0.a(this.f3184i, this.f3185j, this);
        return EnumC0927a.f11114c;
    }
}
