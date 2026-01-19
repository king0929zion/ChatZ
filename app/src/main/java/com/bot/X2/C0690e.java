package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: X2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9264h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f9265i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9266j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0690e(C0692g c0692g, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9265i = c0692g;
        this.f9266j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0690e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0690e(this.f9265i, this.f9266j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9264h;
        Y3.v vVar = Y3.v.f9812c;
        InterfaceC0905c interfaceC0905c = null;
        C0692g c0692g = this.f9265i;
        try {
            try {
                if (i6 == 0) {
                    X3.a.e(obj);
                    c0692g.f9278i.k(null);
                    I2.v vVar2 = c0692g.f9271b;
                    String str = this.f9266j;
                    this.f9264h = 1;
                    vVar2.getClass();
                    obj = vVar2.c(this, new I2.r(vVar2, str, interfaceC0905c, 2));
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
                    c0692g.f9283n.k(((D2.h) iVar).a);
                    androidx.lifecycle.N n3 = i5.a.a;
                    ((List) ((D2.h) iVar).a).size();
                    n3.getClass();
                    androidx.lifecycle.N.k(new Object[0]);
                } else if (iVar instanceof D2.f) {
                    g0 g0Var = c0692g.f9278i;
                    String str2 = ((D2.f) iVar).a;
                    g0Var.getClass();
                    g0Var.l(null, str2);
                    g0 g0Var2 = c0692g.f9283n;
                    g0Var2.getClass();
                    g0Var2.l(null, vVar);
                    androidx.lifecycle.N n5 = i5.a.a;
                    String str3 = ((D2.f) iVar).a;
                    n5.getClass();
                    androidx.lifecycle.N.o(new Object[0]);
                } else if (!(iVar instanceof D2.g)) {
                    throw new RuntimeException();
                }
            } catch (Exception e6) {
                g0 g0Var3 = c0692g.f9278i;
                String message = e6.getMessage();
                if (message == null) {
                    message = "搜索异常";
                }
                g0Var3.getClass();
                g0Var3.l(null, message);
                g0 g0Var4 = c0692g.f9283n;
                g0Var4.getClass();
                g0Var4.l(null, vVar);
                i5.a.a.getClass();
                androidx.lifecycle.N.p(new Object[0]);
            }
            return X3.y.a;
        } finally {
            g0 g0Var5 = c0692g.f9285p;
            Boolean bool = Boolean.FALSE;
            g0Var5.getClass();
            g0Var5.l(null, bool);
        }
    }
}
