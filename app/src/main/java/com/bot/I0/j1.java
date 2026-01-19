package I0;

import N1.C0290l;
import T.C0642y0;
import android.view.View;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import b4.InterfaceC0905c;
import java.util.ArrayList;
import m4.C1288w;
import v.AbstractC1787b;
import x4.AbstractC1888A;
import x4.C1928k;
import x4.InterfaceC1927j;

/* loaded from: classes.dex */
public final class j1 implements InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4.c f2313c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z f2314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0642y0 f2315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1288w f2316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f2317h;

    public j1(C4.c cVar, Z z5, C0642y0 c0642y0, C1288w c1288w, View view) {
        this.f2313c = cVar;
        this.f2314e = z5;
        this.f2315f = c0642y0;
        this.f2316g = c1288w;
        this.f2317h = view;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        boolean z5;
        InterfaceC1927j interfaceC1927j = null;
        switch (g1.a[enumC0841o.ordinal()]) {
            case 1:
                AbstractC1888A.y(this.f2313c, null, new i1(this.f2316g, this.f2315f, interfaceC0846u, this, this.f2317h, null), 1);
                return;
            case 2:
                Z z6 = this.f2314e;
                if (z6 != null) {
                    C0290l c0290l = (C0290l) z6.f2269f;
                    synchronized (c0290l.f3755b) {
                        try {
                            synchronized (c0290l.f3755b) {
                                z5 = c0290l.a;
                            }
                            if (!z5) {
                                ArrayList arrayList = (ArrayList) c0290l.f3756c;
                                c0290l.f3756c = (ArrayList) c0290l.f3757d;
                                c0290l.f3757d = arrayList;
                                c0290l.a = true;
                                int size = arrayList.size();
                                for (int i6 = 0; i6 < size; i6++) {
                                    ((InterfaceC0905c) arrayList.get(i6)).k(X3.y.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C0642y0 c0642y0 = this.f2315f;
                synchronized (c0642y0.f8272c) {
                    if (c0642y0.f8289t) {
                        c0642y0.f8289t = false;
                        interfaceC1927j = c0642y0.y();
                    }
                }
                if (interfaceC1927j != null) {
                    ((C1928k) interfaceC1927j).k(X3.y.a);
                    return;
                }
                return;
            case 3:
                C0642y0 c0642y02 = this.f2315f;
                synchronized (c0642y02.f8272c) {
                    c0642y02.f8289t = true;
                }
                return;
            case 4:
                this.f2315f.x();
                return;
            case AbstractC1787b.f15290g /* 5 */:
            case 6:
            case 7:
                return;
            default:
                throw new RuntimeException();
        }
    }
}
