package Z2;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.LLMSetting;
import x4.InterfaceC1942y;

/* renamed from: Z2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779u extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10345h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a3.w f10346i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LLMSetting f10347j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f10348k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T.X f10349l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779u(a3.w wVar, LLMSetting lLMSetting, T.X x5, T.X x6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10346i = wVar;
        this.f10347j = lLMSetting;
        this.f10348k = x5;
        this.f10349l = x6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0779u) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0779u(this.f10346i, this.f10347j, this.f10348k, this.f10349l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10345h;
        T.X x5 = this.f10348k;
        if (i6 == 0) {
            X3.a.e(obj);
            x5.setValue(Boolean.TRUE);
            String str = this.f10347j.a;
            this.f10345h = 1;
            obj = this.f10346i.i(str, this);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        x5.setValue(Boolean.FALSE);
        if (booleanValue) {
            this.f10349l.setValue(null);
        }
        return X3.y.a;
    }
}
