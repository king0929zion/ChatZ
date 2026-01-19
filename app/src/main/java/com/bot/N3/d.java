package N3;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3846h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.t f3847i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ byte[] f3848j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3849k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(io.ktor.utils.io.t tVar, byte[] bArr, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3847i = tVar;
        this.f3848j = bArr;
        this.f3849k = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new d(this.f3847i, this.f3848j, this.f3849k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3846h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f3846h = 1;
            Object V5 = this.f3847i.V(this.f3848j, this.f3849k, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (V5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return y.a;
    }
}
