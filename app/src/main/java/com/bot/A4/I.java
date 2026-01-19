package A4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class I extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f176h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f177i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f178j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g0 f179k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f180l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(InterfaceC0007h interfaceC0007h, g0 g0Var, Object obj, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f178j = interfaceC0007h;
        this.f179k = g0Var;
        this.f180l = obj;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((I) p((InterfaceC0905c) obj2, (Y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        I i6 = new I(this.f178j, this.f179k, this.f180l, interfaceC0905c);
        i6.f177i = obj;
        return i6;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f176h;
        if (i6 == 0) {
            X3.a.e(obj);
            int ordinal = ((Y) this.f177i).ordinal();
            g0 g0Var = this.f179k;
            if (ordinal == 0) {
                this.f176h = 1;
                Object b5 = this.f178j.b(g0Var, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (b5 == enumC0927a) {
                    return enumC0927a;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                C4.u uVar = W.a;
                Object obj2 = this.f180l;
                if (obj2 == uVar) {
                    g0Var.getClass();
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                g0Var.h(obj2);
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
