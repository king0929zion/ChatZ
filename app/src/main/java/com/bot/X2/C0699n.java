package X2;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.ConversationInfo;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: X2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699n extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f9335i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9336j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9337k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9339m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0699n(L l3, String str, String str2, String str3, String str4, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9335i = l3;
        this.f9336j = str;
        this.f9337k = str2;
        this.f9338l = str3;
        this.f9339m = str4;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0699n) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0699n(this.f9335i, this.f9336j, this.f9337k, this.f9338l, this.f9339m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f9334h;
        L l3 = this.f9335i;
        if (i6 == 0) {
            X3.a.e(obj);
            I2.v vVar = l3.f9201b;
            this.f9334h = 1;
            vVar.getClass();
            obj = vVar.c(this, new I2.q(vVar, this.f9336j, this.f9337k, this.f9338l, this.f9339m, null));
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
            M m3 = new M((ConversationInfo) ((D2.h) iVar).a);
            if (!l3.f9218s.h(m3)) {
                AbstractC1888A.y(androidx.lifecycle.O.i(l3), null, new C0698m(l3, m3, null), 3);
            }
        } else if (iVar instanceof D2.f) {
            g0 g0Var = l3.f9222w;
            String str = ((D2.f) iVar).a;
            g0Var.getClass();
            g0Var.l(null, str);
        } else if (!(iVar instanceof D2.g)) {
            throw new RuntimeException();
        }
        return X3.y.a;
    }
}
