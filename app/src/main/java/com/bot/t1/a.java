package T1;

import N1.v;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class a extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f8329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f8330i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f8331j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f8332k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l4.c f8333l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, InterfaceC0905c interfaceC0905c, l4.c cVar, boolean z5, boolean z6) {
        super(2, interfaceC0905c);
        this.f8330i = vVar;
        this.f8331j = z5;
        this.f8332k = z6;
        this.f8333l = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((a) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        boolean z5 = this.f8332k;
        return new a(this.f8330i, interfaceC0905c, this.f8333l, this.f8331j, z5);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f8329h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        l4.c cVar = this.f8333l;
        v vVar = this.f8330i;
        boolean z5 = this.f8332k;
        boolean z6 = this.f8331j;
        d dVar = new d(vVar, null, cVar, z5, z6);
        this.f8329h = 1;
        Object i7 = vVar.i(z6, dVar, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return i7 == enumC0927a ? enumC0927a : i7;
    }
}
