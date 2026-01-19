package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: X2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9260h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f9261i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0688c(C0692g c0692g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9261i = c0692g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0688c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0688c(this.f9261i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0692g c0692g = this.f9261i;
        int i6 = c0692g.f9290u;
        g0 g0Var = c0692g.f9278i;
        g0 g0Var2 = c0692g.f9274e;
        int i7 = this.f9260h;
        try {
            try {
                if (i7 == 0) {
                    X3.a.e(obj);
                    Boolean bool = Boolean.TRUE;
                    g0Var2.getClass();
                    g0Var2.l(null, bool);
                    g0Var.k(null);
                    c0692g.f9289t = 0;
                    I2.v vVar = c0692g.f9271b;
                    this.f9260h = 1;
                    obj = I2.v.j(vVar, i6, 0, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (obj == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                D2.i iVar = (D2.i) obj;
                if (iVar instanceof D2.h) {
                    c0692g.f9272c.k(((D2.h) iVar).a);
                    g0 g0Var3 = c0692g.f9281l;
                    Boolean valueOf = Boolean.valueOf(((List) ((D2.h) iVar).a).size() >= i6);
                    g0Var3.getClass();
                    g0Var3.l(null, valueOf);
                    c0692g.f9289t = ((List) ((D2.h) iVar).a).size();
                    c0692g.f9291v = true;
                    androidx.lifecycle.N n3 = i5.a.a;
                    ((List) ((D2.h) iVar).a).size();
                    n3.getClass();
                    androidx.lifecycle.N.k(new Object[0]);
                } else if (iVar instanceof D2.f) {
                    String str = ((D2.f) iVar).a;
                    g0Var.getClass();
                    g0Var.l(null, str);
                    androidx.lifecycle.N n5 = i5.a.a;
                    String str2 = ((D2.f) iVar).a;
                    n5.getClass();
                    androidx.lifecycle.N.o(new Object[0]);
                } else if (!(iVar instanceof D2.g)) {
                    throw new RuntimeException();
                }
            } catch (Exception e6) {
                String message = e6.getMessage();
                if (message == null) {
                    message = "未知错误";
                }
                g0Var.getClass();
                g0Var.l(null, message);
                i5.a.a.getClass();
                androidx.lifecycle.N.p(new Object[0]);
            }
            return X3.y.a;
        } finally {
            Boolean bool2 = Boolean.FALSE;
            g0Var2.getClass();
            g0Var2.l(null, bool2);
        }
    }
}
