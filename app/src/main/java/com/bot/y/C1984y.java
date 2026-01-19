package y;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import n.C1316c;
import n.InterfaceC1351z;
import x4.InterfaceC1942y;

/* renamed from: y.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1984y extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15950h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1948E f15951i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1351z f15952j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r0.b f15953k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1984y(C1948E c1948e, InterfaceC1351z interfaceC1351z, r0.b bVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15951i = c1948e;
        this.f15952j = interfaceC1351z;
        this.f15953k = bVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1984y) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1984y(this.f15951i, this.f15952j, this.f15953k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f15950h;
        int i7 = 1;
        C1948E c1948e = this.f15951i;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                C1316c c1316c = c1948e.f15771p;
                Float f6 = new Float(S.l.f7374V);
                InterfaceC1351z interfaceC1351z = this.f15952j;
                C1982w c1982w = new C1982w(this.f15953k, c1948e, i7);
                this.f15950h = 1;
                Object c6 = C1316c.c(c1316c, f6, interfaceC1351z, c1982w, this, 4);
                EnumC0927a enumC0927a = EnumC0927a.f11114c;
                if (c6 == enumC0927a) {
                    return enumC0927a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X3.a.e(obj);
            }
            c1948e.f15766k.setValue(Boolean.TRUE);
            c1948e.e(false);
            return X3.y.a;
        } catch (Throwable th) {
            int i8 = C1948E.f15756t;
            c1948e.e(false);
            throw th;
        }
    }
}
