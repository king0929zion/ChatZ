package N3;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3842h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.t f3843i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ byte[] f3844j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3845k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(io.ktor.utils.io.t tVar, byte[] bArr, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3843i = tVar;
        this.f3844j = bArr;
        this.f3845k = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new c(this.f3843i, this.f3844j, this.f3845k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3842h;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f3842h = 1;
            Object V5 = this.f3843i.V(this.f3844j, this.f3845k, this);
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
