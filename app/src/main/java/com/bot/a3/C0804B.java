package a3;

import Y2.C0720i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.ArrayList;
import x4.InterfaceC1942y;

/* renamed from: a3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804B extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10584h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f10585i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0804B(C0808F c0808f, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10585i = c0808f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0804B) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0804B(this.f10585i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10584h;
        if (i6 == 0) {
            X3.a.e(obj);
            C0808F c0808f = this.f10585i;
            Iterable iterable = (Iterable) c0808f.f10608d.getValue();
            ArrayList arrayList = new ArrayList(Y3.n.Z(iterable, 10));
            int i7 = 0;
            for (Object obj2 : iterable) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    Y4.l.U();
                    throw null;
                }
                arrayList.add(new X3.i(((C0810H) obj2).a.a, new Long(i7)));
                i7 = i8;
            }
            C0720i c0720i = c0808f.f10606b;
            this.f10584h = 1;
            Object k3 = c0720i.k(arrayList, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (k3 == enumC0927a) {
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
