package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: X2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9262h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f9263i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0689d(C0692g c0692g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9263i = c0692g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0689d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0689d(this.f9263i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9262h;
        boolean z5 = true;
        C0692g c0692g = this.f9263i;
        try {
            try {
                if (i6 == 0) {
                    X3.a.e(obj);
                    g0 g0Var = c0692g.f9276g;
                    Boolean bool = Boolean.TRUE;
                    g0Var.getClass();
                    g0Var.l(null, bool);
                    c0692g.f9278i.k(null);
                    I2.v vVar = c0692g.f9271b;
                    int i7 = c0692g.f9290u;
                    int i8 = c0692g.f9289t;
                    this.f9262h = 1;
                    obj = I2.v.j(vVar, i7, i8, this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (obj == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X3.a.e(obj);
                }
                D2.i iVar = (D2.i) obj;
                if (iVar instanceof D2.h) {
                    List list = (List) ((D2.h) iVar).a;
                    g0 g0Var2 = c0692g.f9272c;
                    ArrayList z02 = Y3.m.z0((Collection) g0Var2.getValue(), list);
                    g0Var2.getClass();
                    g0Var2.l(null, z02);
                    g0 g0Var3 = c0692g.f9281l;
                    if (list.size() < c0692g.f9290u) {
                        z5 = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z5);
                    g0Var3.getClass();
                    g0Var3.l(null, valueOf);
                    c0692g.f9289t += list.size();
                    androidx.lifecycle.N n3 = i5.a.a;
                    list.size();
                    ((List) c0692g.f9272c.getValue()).size();
                    n3.getClass();
                    androidx.lifecycle.N.k(new Object[0]);
                } else if (iVar instanceof D2.f) {
                    g0 g0Var4 = c0692g.f9278i;
                    String str = ((D2.f) iVar).a;
                    g0Var4.getClass();
                    g0Var4.l(null, str);
                    androidx.lifecycle.N n5 = i5.a.a;
                    String str2 = ((D2.f) iVar).a;
                    n5.getClass();
                    androidx.lifecycle.N.o(new Object[0]);
                } else if (!(iVar instanceof D2.g)) {
                    throw new RuntimeException();
                }
            } catch (Exception e6) {
                g0 g0Var5 = c0692g.f9278i;
                String message = e6.getMessage();
                if (message == null) {
                    message = "未知错误";
                }
                g0Var5.getClass();
                g0Var5.l(null, message);
                i5.a.a.getClass();
                androidx.lifecycle.N.p(new Object[0]);
            }
            return X3.y.a;
        } finally {
            g0 g0Var6 = c0692g.f9276g;
            Boolean bool2 = Boolean.FALSE;
            g0Var6.getClass();
            g0Var6.l(null, bool2);
        }
    }
}
