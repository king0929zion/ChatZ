package W2;

import A4.g0;
import X2.C0692g;
import X2.L;
import X2.P;
import X3.y;
import androidx.lifecycle.N;
import b4.InterfaceC0905c;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import u4.AbstractC1776n;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class a extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f8858h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8859i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f8860j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0692g f8861k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, boolean z5, L l3, C0692g c0692g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f8858h = str;
        this.f8859i = z5;
        this.f8860j = l3;
        this.f8861k = c0692g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        a aVar = (a) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        y yVar = y.a;
        aVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new a(this.f8858h, this.f8859i, this.f8860j, this.f8861k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        String str = this.f8858h;
        int length = str.length();
        C0692g c0692g = this.f8861k;
        if (length <= 0 || this.f8859i) {
            c0692g.f(FlexmarkHtmlConverter.DEFAULT_NODE);
        } else {
            i5.a.a.getClass();
            N.k(new Object[0]);
            L l3 = this.f8860j;
            l3.getClass();
            if (AbstractC1776n.Q(str)) {
                g0 g0Var = l3.f9197D;
                g0Var.getClass();
                g0Var.l(null, FlexmarkHtmlConverter.DEFAULT_NODE);
                l3.f9214o.clear();
                g0 g0Var2 = l3.f9221v;
                g0Var2.getClass();
                g0Var2.l(null, P.a);
            } else {
                l3.o(str);
            }
            c0692g.f(str);
        }
        return y.a;
    }
}
