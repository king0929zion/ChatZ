package a3;

import A4.g0;
import O.C0325o0;
import Y2.C0720i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.model.LLMProvider;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import u4.AbstractC1776n;
import x4.InterfaceC1942y;

/* renamed from: a3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803A extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f10582h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f10583i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803A(C0808F c0808f, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10583i = c0808f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0803A) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0803A(this.f10583i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Object c6;
        String str;
        String obj2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C0808F c0808f = this.f10583i;
        g0 g0Var = c0808f.f10612h;
        g0 g0Var2 = c0808f.f10610f;
        int i6 = this.f10582h;
        String str8 = null;
        if (i6 == 0) {
            X3.a.e(obj);
            Boolean bool = Boolean.TRUE;
            g0Var2.getClass();
            g0Var2.l(null, bool);
            g0Var.k(null);
            C0720i c0720i = c0808f.f10606b;
            this.f10582h = 1;
            c0720i.getClass();
            c6 = c0720i.c(this, new C0325o0(c0720i, null, 3));
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (c6 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            c6 = obj;
        }
        D2.i iVar = (D2.i) c6;
        if (iVar instanceof D2.h) {
            List<LLMProvider> list = (List) ((D2.h) iVar).a;
            g0 g0Var3 = c0808f.f10608d;
            Iterable iterable = (Iterable) g0Var3.getValue();
            int H3 = Y3.C.H(Y3.n.Z(iterable, 10));
            if (H3 < 16) {
                H3 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(H3);
            for (Object obj3 : iterable) {
                linkedHashMap.put(((C0810H) obj3).a.a, obj3);
            }
            ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
            for (LLMProvider lLMProvider : list) {
                C0810H c0810h = (C0810H) linkedHashMap.get(lLMProvider.a);
                if (c0810h == null || (obj2 = c0810h.f10623b) == null) {
                    String str9 = lLMProvider.f11176l;
                    obj2 = str9 != null ? AbstractC1776n.l0(str9).toString() : str8;
                    if (obj2 == null) {
                        obj2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                    }
                }
                if (c0810h == null || (str2 = c0810h.f10624c) == null) {
                    str2 = lLMProvider.f11168d;
                }
                if (c0810h == null || (str3 = c0810h.f10625d) == null) {
                    str3 = lLMProvider.f11169e;
                }
                if (c0810h == null || (str4 = c0810h.f10626e) == null) {
                    str4 = lLMProvider.f11170f;
                }
                if (c0810h == null || (str5 = c0810h.f10627f) == null) {
                    str5 = lLMProvider.f11171g;
                }
                arrayList.add(new C0810H(lLMProvider, obj2, str2, str3, str4, str5, ((c0810h == null || (str6 = c0810h.f10628g) == null) && (str6 = lLMProvider.f11172h) == null) ? FlexmarkHtmlConverter.DEFAULT_NODE : str6, ((c0810h == null || (str7 = c0810h.f10629h) == null) && (str7 = lLMProvider.f11173i) == null) ? FlexmarkHtmlConverter.DEFAULT_NODE : str7));
                str8 = null;
            }
            str = str8;
            g0Var3.l(str, arrayList);
        } else {
            str = null;
            if (iVar instanceof D2.f) {
                String str10 = ((D2.f) iVar).a;
                g0Var.getClass();
                g0Var.l(null, str10);
            } else if (!(iVar instanceof D2.g)) {
                throw new RuntimeException();
            }
        }
        Boolean bool2 = Boolean.FALSE;
        g0Var2.getClass();
        g0Var2.l(str, bool2);
        return X3.y.a;
    }
}
