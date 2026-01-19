package a3;

import b4.InterfaceC0905c;
import com.bot.core.model.LLMProvider;
import com.bot.core.model.ReasoningRule;
import com.bot.feature.settings.data.ModelConfig;
import com.bot.feature.settings.data.VendorConfig;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* renamed from: a3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820i extends d4.i implements l4.h {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ String f10662h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Y2.y f10663i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ List f10664j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w f10665k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0820i(w wVar, InterfaceC0905c interfaceC0905c) {
        super(5, interfaceC0905c);
        this.f10665k = wVar;
    }

    @Override // l4.h
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C0820i c0820i = new C0820i(this.f10665k, (InterfaceC0905c) obj5);
        c0820i.f10662h = (String) obj;
        c0820i.f10663i = (Y2.y) obj2;
        c0820i.f10664j = (List) obj3;
        return c0820i.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Integer num;
        Object obj2;
        String str;
        Object obj3;
        String str2 = this.f10662h;
        Y2.y yVar = this.f10663i;
        List list = this.f10664j;
        X3.a.e(obj);
        if (AbstractC1776n.Q(str2)) {
            return new D2.c();
        }
        Iterator it = yVar.a.iterator();
        loop0: while (true) {
            num = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            List list2 = ((VendorConfig) obj2).f11272c;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (AbstractC1276k.b(((ModelConfig) it2.next()).a, str2)) {
                        break loop0;
                    }
                }
            }
        }
        VendorConfig vendorConfig = (VendorConfig) obj2;
        if (vendorConfig == null || (str = vendorConfig.a) == null) {
            return new D2.c();
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (AbstractC1276k.b(((LLMProvider) obj3).a, str)) {
                break;
            }
        }
        LLMProvider lLMProvider = (LLMProvider) obj3;
        if (lLMProvider == null) {
            return new D2.c();
        }
        I2.A a = this.f10665k.f10733d;
        String str3 = lLMProvider.f11168d;
        String str4 = lLMProvider.f11169e;
        String str5 = lLMProvider.f11166b;
        a.getClass();
        AbstractC1276k.f(str4, "apiSchema");
        ReasoningRule d6 = a.d(str2, str3, str4, str5);
        D2.b bVar = d6.f11250f;
        Integer num2 = d6.f11253i;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        boolean b5 = AbstractC1276k.b(d6.f11254j, Boolean.TRUE);
        int ordinal = bVar.ordinal();
        boolean z5 = false;
        boolean z6 = (ordinal == 0 || ordinal == 1 || (ordinal == 2 && !b5 && (!I2.A.e(str2) || AbstractC1276k.b(d6.f11252h, Boolean.FALSE)))) ? false : true;
        if (b5 && z6) {
            z5 = true;
        }
        return new D2.c(z6, z5, num, bVar);
    }
}
