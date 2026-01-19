package R;

import Q.C0397b2;
import Q.C0405d2;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.AbstractC1318d;
import n.InterfaceC1334l;

/* renamed from: R.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501f extends d4.i implements l4.g {

    /* renamed from: h, reason: collision with root package name */
    public int f6764h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ r f6765i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ W f6766j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6767k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0513s f6768l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f6769m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0501f(C0513s c0513s, float f6, InterfaceC0905c interfaceC0905c) {
        super(4, interfaceC0905c);
        this.f6768l = c0513s;
        this.f6769m = f6;
    }

    @Override // l4.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        C0501f c0501f = new C0501f(this.f6768l, this.f6769m, (InterfaceC0905c) obj4);
        c0501f.f6765i = (r) obj;
        c0501f.f6766j = (W) obj2;
        c0501f.f6767k = obj3;
        return c0501f.r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, m4.t] */
    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6764h;
        if (i6 == 0) {
            X3.a.e(obj);
            r rVar = this.f6765i;
            float d6 = this.f6766j.d(this.f6767k);
            if (!Float.isNaN(d6)) {
                Object obj2 = new Object();
                C0513s c0513s = this.f6768l;
                float g3 = Float.isNaN(c0513s.f6833j.g()) ? S.l.f7374V : c0513s.f6833j.g();
                obj2.f12970c = g3;
                InterfaceC1334l interfaceC1334l = ((C0405d2) c0513s.f6826c.f1e).f5766c;
                C0397b2 c0397b2 = new C0397b2(rVar, obj2, 1);
                this.f6765i = null;
                this.f6766j = null;
                this.f6764h = 1;
                Object c6 = AbstractC1318d.c(g3, d6, this.f6769m, interfaceC1334l, c0397b2, this);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (c6 == enumC0927a) {
                    return enumC0927a;
                }
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
