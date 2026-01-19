package X2;

import A4.InterfaceC0008i;
import A4.g0;
import b3.AbstractC0900p;
import b4.InterfaceC0905c;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import f0.AbstractC0997t;
import f0.C0996s;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import u4.C1772j;
import u4.C1774l;
import x4.AbstractC1888A;

/* renamed from: X2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706v implements InterfaceC0008i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9373c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f9374e;

    public /* synthetic */ C0706v(L l3, int i6) {
        this.f9373c = i6;
        this.f9374e = l3;
    }

    @Override // A4.InterfaceC0008i
    public final Object a(Object obj, InterfaceC0905c interfaceC0905c) {
        C1772j a;
        String str;
        String obj2;
        String str2;
        Object obj3;
        String str3;
        int i6 = this.f9373c;
        X3.y yVar = X3.y.a;
        L l3 = this.f9374e;
        switch (i6) {
            case 0:
                C0996s c0996s = l3.f9214o;
                c0996s.clear();
                c0996s.addAll((List) obj);
                g0 g0Var = l3.f9221v;
                g0Var.getClass();
                g0Var.l(null, P.a);
                return yVar;
            case 1:
                M2.y yVar2 = (M2.y) obj;
                g0 g0Var2 = l3.f9197D;
                if (yVar2 instanceof M2.u) {
                    g0 g0Var3 = l3.f9198E;
                    C0996s c0996s2 = l3.f9214o;
                    Long l5 = new Long(System.currentTimeMillis());
                    g0Var3.getClass();
                    g0Var3.l(null, l5);
                    AbstractC1888A.y(androidx.lifecycle.O.i(l3), null, new I(l3, null), 3);
                    M2.u uVar = (M2.u) yVar2;
                    if (AbstractC1276k.b(uVar.a, g0Var2.getValue())) {
                        M2.t tVar = l3.f9202c;
                        String str4 = uVar.a;
                        tVar.getClass();
                        AbstractC1276k.f(str4, "conversationId");
                        M2.A a6 = (M2.A) ((Map) tVar.f3400d.getValue()).get(str4);
                        if (a6 == null || (str3 = a6.f3269b) == null) {
                            int size = c0996s2.size() - 1;
                            int g3 = AbstractC0997t.g(c0996s2);
                            while (true) {
                                if (!(size >= 0)) {
                                    obj3 = null;
                                } else {
                                    if (AbstractC0997t.g(c0996s2) != g3) {
                                        throw new ConcurrentModificationException();
                                    }
                                    AbstractC0997t.a(size, c0996s2.size());
                                    obj3 = c0996s2.get(size);
                                    size--;
                                    if (((L2.c) obj3).f3058b == L2.d.f3070e) {
                                    }
                                }
                            }
                            L2.c cVar = (L2.c) obj3;
                            str3 = cVar != null ? cVar.f3059c : null;
                            if (str3 == null) {
                                str3 = FlexmarkHtmlConverter.DEFAULT_NODE;
                            }
                        }
                        T t5 = l3.f9217r;
                        if (t5 != null && t5.a.equals(g0Var2.getValue())) {
                            if (c0996s2.size() > 2) {
                                l3.f9217r = null;
                            } else {
                                l3.f9217r = null;
                                if (!AbstractC1776n.Q(str3)) {
                                    AbstractC1888A.y(androidx.lifecycle.O.i(l3), null, new C0704t(l3, t5, str3, null), 3);
                                }
                            }
                        }
                    }
                } else if (yVar2 instanceof M2.v) {
                    M2.v vVar = (M2.v) yVar2;
                    if (AbstractC1276k.b(vVar.a, g0Var2.getValue())) {
                        g0 g0Var4 = l3.f9222w;
                        String str5 = vVar.f3406b;
                        C1774l c1774l = AbstractC0900p.a;
                        AbstractC1276k.f(str5, "errorMessage");
                        String obj4 = AbstractC1776n.l0(str5).toString();
                        if (AbstractC1776n.Q(obj4)) {
                            obj4 = "发生错误，请重试";
                        } else {
                            String obj5 = AbstractC1776n.l0(obj4).toString();
                            C1772j a7 = C1774l.a(AbstractC0900p.a, obj5);
                            if (a7 == null ? (a = C1774l.a(AbstractC0900p.f11048b, obj5)) == null || (str = (String) Y3.m.r0(a.a(), 1)) == null || (obj2 = AbstractC1776n.l0(str).toString()) == null || AbstractC1776n.Q(obj2) : (str2 = (String) Y3.m.r0(a7.a(), 1)) == null || (obj2 = AbstractC1776n.l0(str2).toString()) == null || AbstractC1776n.Q(obj2)) {
                                obj2 = null;
                            }
                            String lowerCase = (obj2 == null ? obj4 : obj2).toLowerCase(Locale.ROOT);
                            AbstractC1276k.e(lowerCase, "toLowerCase(...)");
                            if (AbstractC1776n.G(lowerCase, "network", false) || AbstractC1776n.G(lowerCase, "connection", false) || AbstractC1776n.G(lowerCase, "internet", false) || AbstractC1776n.G(lowerCase, "网络", false)) {
                                obj4 = "网络连接失败，请检查网络设置";
                            } else if (AbstractC1776n.G(lowerCase, "timeout", false) || AbstractC1776n.G(lowerCase, "timed out", false) || AbstractC1776n.G(lowerCase, "超时", false)) {
                                obj4 = "请求超时，服务器响应较慢";
                            } else if (AbstractC1776n.G(lowerCase, "server", false) || AbstractC1776n.G(lowerCase, "500", false) || AbstractC1776n.G(lowerCase, "502", false) || AbstractC1776n.G(lowerCase, "503", false) || AbstractC1776n.G(lowerCase, "服务", false)) {
                                obj4 = "服务器暂时不可用，请稍后重试";
                            } else if (obj2 != null && !AbstractC1776n.Q(obj2)) {
                                obj4 = obj2;
                            }
                        }
                        g0Var4.getClass();
                        g0Var4.l(null, obj4);
                    }
                }
                return yVar;
            default:
                X3.i iVar = (X3.i) obj;
                Boolean bool = (Boolean) iVar.f9393c;
                bool.getClass();
                Boolean bool2 = (Boolean) iVar.f9394e;
                bool2.getClass();
                g0 g0Var5 = l3.f9223x;
                g0Var5.getClass();
                g0Var5.l(null, bool);
                g0 g0Var6 = l3.f9220u;
                g0Var6.getClass();
                g0Var6.l(null, bool);
                g0 g0Var7 = l3.f9196C;
                g0Var7.getClass();
                g0Var7.l(null, bool2);
                return yVar;
        }
    }
}
