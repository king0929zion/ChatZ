package P2;

import T.C0601d0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import r.AbstractC1573i;
import x4.InterfaceC1942y;

/* renamed from: P2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384v0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5082i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5083j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x.s f5084k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f5085l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0601d0 f5086m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0601d0 f5087n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T.X f5088o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T.X f5089p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384v0(int i6, int i7, x.s sVar, T.X x5, C0601d0 c0601d0, C0601d0 c0601d02, T.X x6, T.X x7, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5082i = i6;
        this.f5083j = i7;
        this.f5084k = sVar;
        this.f5085l = x5;
        this.f5086m = c0601d0;
        this.f5087n = c0601d02;
        this.f5088o = x6;
        this.f5089p = x7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0384v0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0384v0(this.f5082i, this.f5083j, this.f5084k, this.f5085l, this.f5086m, this.f5087n, this.f5088o, this.f5089p, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f5081h;
        X3.y yVar = X3.y.a;
        int i7 = this.f5082i;
        C0601d0 c0601d0 = this.f5086m;
        int i8 = this.f5083j;
        C0601d0 c0601d02 = this.f5087n;
        if (i6 == 0) {
            X3.a.e(obj);
            T.X x5 = this.f5085l;
            if (!((Boolean) x5.getValue()).booleanValue()) {
                c0601d0.h(i7);
                c0601d02.h(i8);
                x5.setValue(Boolean.TRUE);
                return yVar;
            }
            int g3 = i7 - c0601d0.g();
            if (g3 != 0) {
                x.s sVar = this.f5084k;
                if (!sVar.f15552i.b() && ((Number) this.f5088o.getValue()).intValue() > 0) {
                    boolean z5 = false;
                    boolean z6 = i8 > c0601d02.g();
                    boolean z7 = i8 < c0601d02.g();
                    T.X x6 = this.f5089p;
                    if (z6) {
                        z5 = ((C0344b) x6.getValue()).a;
                    } else if (z7) {
                        z5 = ((C0344b) x6.getValue()).f4827b;
                    } else if (((C0344b) x6.getValue()).f4827b || ((C0344b) x6.getValue()).a) {
                        z5 = true;
                    }
                    if (z5) {
                        this.f5081h = 1;
                        Object m3 = AbstractC1573i.m(sVar, g3, this);
                        EnumC0927a enumC0927a = EnumC0927a.f11114c;
                        if (m3 == enumC0927a) {
                            return enumC0927a;
                        }
                    }
                }
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        c0601d0.h(i7);
        c0601d02.h(i8);
        return yVar;
    }
}
