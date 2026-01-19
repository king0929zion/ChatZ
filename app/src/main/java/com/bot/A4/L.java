package A4;

import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class L extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f191h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f192i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ InterfaceC0008i f193j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object[] f194k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d4.i f195l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(InterfaceC0905c interfaceC0905c, l4.h hVar) {
        super(3, interfaceC0905c);
        this.f195l = (d4.i) hVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l4.h, d4.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l4.f, d4.i] */
    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        InterfaceC0008i interfaceC0008i = (InterfaceC0008i) obj;
        Object[] objArr = (Object[]) obj2;
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj3;
        switch (this.f191h) {
            case 0:
                L l3 = new L(interfaceC0905c, (l4.h) this.f195l);
                l3.f193j = interfaceC0008i;
                l3.f194k = objArr;
                return l3.r(X3.y.a);
            default:
                L l5 = new L((l4.f) this.f195l, interfaceC0905c);
                l5.f193j = interfaceC0008i;
                l5.f194k = objArr;
                return l5.r(X3.y.a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [l4.f, d4.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l4.h, d4.i] */
    @Override // d4.a
    public final Object r(Object obj) {
        InterfaceC0008i interfaceC0008i;
        L l3;
        InterfaceC0008i interfaceC0008i2;
        switch (this.f191h) {
            case 0:
                int i6 = this.f192i;
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (i6 == 0) {
                    X3.a.e(obj);
                    interfaceC0008i = this.f193j;
                    Object[] objArr = this.f194k;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f193j = interfaceC0008i;
                    this.f192i = 1;
                    l3 = this;
                    obj = this.f195l.n(obj2, obj3, obj4, obj5, l3);
                    if (obj == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        X3.a.e(obj);
                        return X3.y.a;
                    }
                    interfaceC0008i = this.f193j;
                    X3.a.e(obj);
                    l3 = this;
                }
                l3.f193j = null;
                l3.f192i = 2;
                if (interfaceC0008i.a(obj, this) == enumC0927a) {
                    return enumC0927a;
                }
                return X3.y.a;
            default:
                int i7 = this.f192i;
                EnumC0927a enumC0927a2 = EnumC0927a.f11114c;
                if (i7 == 0) {
                    X3.a.e(obj);
                    interfaceC0008i2 = this.f193j;
                    Object[] objArr2 = this.f194k;
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    this.f193j = interfaceC0008i2;
                    this.f192i = 1;
                    obj = this.f195l.d(obj6, obj7, this);
                    if (obj == enumC0927a2) {
                        return enumC0927a2;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        X3.a.e(obj);
                        return X3.y.a;
                    }
                    interfaceC0008i2 = this.f193j;
                    X3.a.e(obj);
                }
                this.f193j = null;
                this.f192i = 2;
                if (interfaceC0008i2.a(obj, this) == enumC0927a2) {
                    return enumC0927a2;
                }
                return X3.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(l4.f fVar, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f195l = (d4.i) fVar;
    }
}
