package n2;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import i2.C1108b;
import i2.C1109c;
import m2.C1264m;
import m4.C1288w;
import s2.C1661i;
import s2.C1665m;
import x4.InterfaceC1942y;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f13348h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1370i f13349i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1288w f13350j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1288w f13351k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1661i f13352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1288w f13354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1109c f13355o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365d(C1370i c1370i, C1288w c1288w, C1288w c1288w2, C1661i c1661i, Object obj, C1288w c1288w3, C1109c c1109c, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13349i = c1370i;
        this.f13350j = c1288w;
        this.f13351k = c1288w2;
        this.f13352l = c1661i;
        this.f13353m = obj;
        this.f13354n = c1288w3;
        this.f13355o = c1109c;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1365d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1365d(this.f13349i, this.f13350j, this.f13351k, this.f13352l, this.f13353m, this.f13354n, this.f13355o, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f13348h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        C1264m c1264m = (C1264m) this.f13350j.f12973c;
        C1108b c1108b = (C1108b) this.f13351k.f12973c;
        C1665m c1665m = (C1665m) this.f13354n.f12973c;
        this.f13348h = 1;
        Object a = C1370i.a(this.f13349i, c1264m, c1108b, this.f13352l, this.f13353m, c1665m, this.f13355o, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return a == enumC0927a ? enumC0927a : a;
    }
}
