package P2;

import F0.InterfaceC0134w;
import I0.C0207s0;
import Q.v3;
import T.C0601d0;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import b3.C0889e;
import b3.C0898n;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1193a;
import n0.C1354c;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final /* synthetic */ class Z implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4813c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4817h;

    public /* synthetic */ Z(I0.S0 s02, List list, C0889e c0889e, int i6) {
        this.f4815f = s02;
        this.f4816g = list;
        this.f4817h = c0889e;
        this.f4814e = i6;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        String str;
        int i6;
        switch (this.f4813c) {
            case 0:
                I0.S0 s02 = (I0.S0) this.f4815f;
                List<L2.b> list = (List) this.f4816g;
                C0889e c0889e = (C0889e) this.f4817h;
                if (s02 != null) {
                    ((C0207s0) s02).a();
                }
                ArrayList arrayList = new ArrayList();
                for (L2.b bVar : list) {
                    Uri uri = bVar.a;
                    if (uri == null || (str = uri.toString()) == null) {
                        str = bVar.f3055b;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                if (c0889e != null) {
                    c0889e.a.setValue(new C0898n(true, arrayList, this.f4814e));
                }
                return X3.y.a;
            default:
                v3 v3Var = (v3) this.f4815f;
                T.X x5 = (T.X) this.f4816g;
                C0601d0 c0601d0 = (C0601d0) this.f4817h;
                View view = v3Var.a;
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i7 = rect.top;
                int i8 = rect.bottom;
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) x5.getValue();
                C1354c a = (interfaceC0134w == null || !interfaceC0134w.j()) ? C1354c.f13294e : AbstractC1117a.a(interfaceC0134w.e(0L), AbstractC1410a.S(interfaceC0134w.m()));
                int i9 = this.f4814e;
                int i10 = i7 + i9;
                int i11 = i8 - i9;
                float f6 = a.f13295b;
                if (f6 <= i8) {
                    float f7 = a.f13297d;
                    if (f7 >= i7) {
                        i6 = AbstractC1410a.K(Math.max(f6 - i10, i11 - f7));
                        c0601d0.h(Math.max(i6, 0));
                        return X3.y.a;
                    }
                }
                i6 = i11 - i10;
                c0601d0.h(Math.max(i6, 0));
                return X3.y.a;
        }
    }

    public /* synthetic */ Z(v3 v3Var, int i6, T.X x5, C0601d0 c0601d0) {
        this.f4815f = v3Var;
        this.f4814e = i6;
        this.f4816g = x5;
        this.f4817h = c0601d0;
    }
}
