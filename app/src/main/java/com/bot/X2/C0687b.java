package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.ConversationInfo;
import x4.InterfaceC1942y;

/* renamed from: X2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687b extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f9258i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9259j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0687b(C0692g c0692g, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9258i = c0692g;
        this.f9259j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0687b) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0687b(this.f9258i, this.f9259j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        C0692g c0692g = this.f9258i;
        g0 g0Var = c0692g.f9278i;
        int i6 = this.f9257h;
        InterfaceC0905c interfaceC0905c = null;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                I2.v vVar = c0692g.f9271b;
                String str = this.f9259j;
                this.f9257h = 1;
                vVar.getClass();
                obj = vVar.c(this, new I2.r(vVar, str, interfaceC0905c, 1));
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
                c0692g.f9280k.k(((D2.h) iVar).a);
                androidx.lifecycle.N n3 = i5.a.a;
                String str2 = ((ConversationInfo) ((D2.h) iVar).a).f11153b;
                n3.getClass();
                androidx.lifecycle.N.k(new Object[0]);
            } else if (iVar instanceof D2.f) {
                String str3 = ((D2.f) iVar).a;
                g0Var.getClass();
                g0Var.l(null, str3);
                androidx.lifecycle.N n5 = i5.a.a;
                String str4 = ((D2.f) iVar).a;
                n5.getClass();
                androidx.lifecycle.N.o(new Object[0]);
            } else if (!(iVar instanceof D2.g)) {
                throw new RuntimeException();
            }
        } catch (Exception e6) {
            String message = e6.getMessage();
            if (message == null) {
                message = "获取对话详情异常";
            }
            g0Var.getClass();
            g0Var.l(null, message);
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
        }
        return X3.y.a;
    }
}
