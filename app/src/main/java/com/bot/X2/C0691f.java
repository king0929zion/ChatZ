package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.ConversationInfo;
import java.util.ArrayList;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* renamed from: X2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9267h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0692g f9268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9269j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9270k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691f(C0692g c0692g, String str, String str2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9268i = c0692g;
        this.f9269j = str;
        this.f9270k = str2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0691f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0691f(this.f9268i, this.f9269j, this.f9270k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9267h;
        String str = this.f9270k;
        String str2 = this.f9269j;
        C0692g c0692g = this.f9268i;
        try {
            if (i6 == 0) {
                X3.a.e(obj);
                I2.v vVar = c0692g.f9271b;
                this.f9267h = 1;
                vVar.getClass();
                obj = vVar.c(this, new I2.u(vVar, str2, str, null, 0));
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
                g0 g0Var = c0692g.f9272c;
                Iterable<ConversationInfo> iterable = (Iterable) g0Var.getValue();
                ArrayList arrayList = new ArrayList(Y3.n.Z(iterable, 10));
                for (ConversationInfo conversationInfo : iterable) {
                    if (AbstractC1276k.b(conversationInfo.a, str2)) {
                        conversationInfo = ConversationInfo.a(conversationInfo, str);
                    }
                    arrayList.add(conversationInfo);
                }
                g0Var.getClass();
                g0Var.l(null, arrayList);
                i5.a.a.getClass();
                androidx.lifecycle.N.k(new Object[0]);
            } else if (iVar instanceof D2.f) {
                g0 g0Var2 = c0692g.f9278i;
                String str3 = ((D2.f) iVar).a;
                g0Var2.getClass();
                g0Var2.l(null, str3);
                androidx.lifecycle.N n3 = i5.a.a;
                String str4 = ((D2.f) iVar).a;
                n3.getClass();
                androidx.lifecycle.N.o(new Object[0]);
            } else if (!(iVar instanceof D2.g)) {
                throw new RuntimeException();
            }
        } catch (Exception e6) {
            g0 g0Var3 = c0692g.f9278i;
            String message = e6.getMessage();
            if (message == null) {
                message = "更新操作异常";
            }
            g0Var3.getClass();
            g0Var3.l(null, message);
            i5.a.a.getClass();
            androidx.lifecycle.N.p(new Object[0]);
        }
        return X3.y.a;
    }
}
