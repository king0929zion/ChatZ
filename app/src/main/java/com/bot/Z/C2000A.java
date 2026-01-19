package z;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.AbstractC1318d;
import n.InterfaceC1334l;
import r.InterfaceC1563e1;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000A extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f16024h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16025i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f16026j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16027k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f16028l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1334l f16029m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2000A(E e6, int i6, float f6, InterfaceC1334l interfaceC1334l, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16026j = e6;
        this.f16027k = i6;
        this.f16028l = f6;
        this.f16029m = interfaceC1334l;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C2000A) p((InterfaceC0905c) obj2, (InterfaceC1563e1) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C2000A c2000a = new C2000A(this.f16026j, this.f16027k, this.f16028l, this.f16029m, interfaceC0905c);
        c2000a.f16025i = obj;
        return c2000a;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6;
        int i7 = this.f16024h;
        X3.y yVar = X3.y.a;
        int i8 = 1;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        InterfaceC1563e1 interfaceC1563e1 = (InterfaceC1563e1) this.f16025i;
        E e6 = this.f16026j;
        x.n nVar = new x.n(interfaceC1563e1, e6, i8);
        this.f16024h = 1;
        float f6 = H.a;
        int i9 = this.f16027k;
        e6.f16066s.h(e6.k(new Integer(i9).intValue()));
        boolean z5 = i9 > e6.f16052e;
        int e7 = (nVar.e() - e6.f16052e) + 1;
        if (((z5 && i9 > nVar.e()) || (!z5 && i9 < e6.f16052e)) && Math.abs(i9 - e6.f16052e) >= 3) {
            if (z5) {
                i6 = i9 - e7;
                int i10 = e6.f16052e;
                if (i6 < i10) {
                    i6 = i10;
                }
            } else {
                int i11 = e7 + i9;
                i6 = e6.f16052e;
                if (i11 <= i6) {
                    i6 = i11;
                }
            }
            nVar.f(i6);
        }
        Object e8 = AbstractC1318d.e(S.l.f7374V, nVar.b(i9) + this.f16028l, this.f16029m, new I.m(29, new Object(), nVar), this, 4);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (e8 != enumC0927a) {
            e8 = yVar;
        }
        return e8 == enumC0927a ? enumC0927a : yVar;
    }
}
