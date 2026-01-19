package a3;

import A4.g0;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.LLMSetting;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import x4.InterfaceC1942y;

/* renamed from: a3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824m extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10675h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f10676i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f10677j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824m(w wVar, InterfaceC0905c interfaceC0905c, String str) {
        super(2, interfaceC0905c);
        this.f10676i = wVar;
        this.f10677j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0824m) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0824m(this.f10676i, interfaceC0905c, this.f10677j);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f10675h;
        w wVar = this.f10676i;
        if (i6 == 0) {
            X3.a.e(obj);
            this.f10675h = 1;
            obj = wVar.j(this.f10677j, this);
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
        LLMSetting lLMSetting = (LLMSetting) obj;
        X3.y yVar = X3.y.a;
        if (lLMSetting == null) {
            g0 g0Var = wVar.f10720S;
            g0Var.getClass();
            g0Var.l(null, "未找到 Bot");
            return yVar;
        }
        wVar.f10744i0 = false;
        String str = lLMSetting.a;
        if (str == null) {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        wVar.f10742h0 = str;
        wVar.f(lLMSetting, false);
        wVar.f10740g0 = lLMSetting;
        return yVar;
    }
}
