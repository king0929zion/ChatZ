package R;

import Q.s3;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class G extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f6696h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6697i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.D f6698j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s3 f6699k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(B0.D d6, s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6698j = d6;
        this.f6699k = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((G) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        G g3 = new G(this.f6698j, this.f6699k, interfaceC0905c);
        g3.f6697i = obj;
        return g3;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6696h;
        if (i6 == 0) {
            X3.a.e(obj);
            F f6 = new F((InterfaceC1942y) this.f6697i, this.f6699k, null);
            this.f6696h = 1;
            Object M02 = ((B0.X) this.f6698j).M0(f6, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (M02 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
