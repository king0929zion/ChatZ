package Z2;

import a3.C0808F;
import a3.C0809G;
import b4.InterfaceC0905c;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import u4.AbstractC1776n;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class G0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9968h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0808F f9969i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9970j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f9971k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f9972l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9973m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9974n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9975o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9976p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T.X f9977q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(boolean z5, C0808F c0808f, String str, String str2, String str3, String str4, String str5, String str6, String str7, T.X x5, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9968h = z5;
        this.f9969i = c0808f;
        this.f9970j = str;
        this.f9971k = str2;
        this.f9972l = str3;
        this.f9973m = str4;
        this.f9974n = str5;
        this.f9975o = str6;
        this.f9976p = str7;
        this.f9977q = x5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        G0 g02 = (G0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        g02.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new G0(this.f9968h, this.f9969i, this.f9970j, this.f9971k, this.f9972l, this.f9973m, this.f9974n, this.f9975o, this.f9976p, this.f9977q, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        if (this.f9968h) {
            this.f9977q.setValue(Y3.x.f9814c);
        }
        C0808F c0808f = this.f9969i;
        c0808f.getClass();
        String str = this.f9972l;
        if (AbstractC1776n.Q(str)) {
            str = "openai";
        }
        String str2 = str;
        String str3 = this.f9974n;
        String str4 = AbstractC1776n.Q(str3) ? "ai_studio" : str3;
        String str5 = this.f9970j;
        String obj2 = str5 != null ? AbstractC1776n.l0(str5).toString() : null;
        if (obj2 == null) {
            obj2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        String str6 = this.f9971k;
        String obj3 = str6 != null ? AbstractC1776n.l0(str6).toString() : null;
        if (obj3 == null) {
            obj3 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        String str7 = this.f9975o;
        String obj4 = str7 != null ? AbstractC1776n.l0(str7).toString() : null;
        String str8 = obj4 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : obj4;
        String str9 = this.f9976p;
        String obj5 = str9 != null ? AbstractC1776n.l0(str9).toString() : null;
        String str10 = obj5 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : obj5;
        x4.s0 s0Var = c0808f.f10619o;
        if (s0Var != null) {
            s0Var.f(null);
        }
        boolean z5 = false;
        boolean z6 = !str2.equals("google") || str4.equals("ai_studio");
        if (str2.equals("google") && str4.equals("vertex_ai")) {
            z5 = true;
        }
        if (AbstractC1776n.Q(obj3) || ((z6 && AbstractC1776n.Q(obj2)) || (z5 && (AbstractC1776n.Q(str8) || AbstractC1776n.Q(str10))))) {
            A4.g0 g0Var = c0808f.f10617m;
            C0809G c0809g = new C0809G();
            g0Var.getClass();
            g0Var.l(null, c0809g);
        } else {
            c0808f.f10619o = AbstractC1888A.y(androidx.lifecycle.O.i(c0808f), null, new a3.z(c0808f, obj2, obj3, str2, this.f9973m, str4, str8, str10, null), 3);
        }
        return X3.y.a;
    }
}
