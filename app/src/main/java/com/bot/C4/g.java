package C4;

import android.webkit.WebView;
import b4.C0911i;
import x4.AbstractC1888A;
import x4.AbstractC1939v;
import x4.C1910X;
import x4.C1928k;
import y4.C1998d;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f693c;

    /* renamed from: e, reason: collision with root package name */
    public Object f694e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f695f;

    public /* synthetic */ g(int i6, Object obj, Object obj2) {
        this.f693c = i6;
        this.f694e = obj;
        this.f695f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f693c) {
            case 0:
                h hVar = (h) this.f695f;
                AbstractC1939v abstractC1939v = hVar.f698g;
                int i6 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f694e).run();
                    } catch (Throwable th) {
                        AbstractC1888A.t(C0911i.f11057c, th);
                    }
                    Runnable h02 = hVar.h0();
                    if (h02 == null) {
                        return;
                    }
                    this.f694e = h02;
                    i6++;
                    if (i6 >= 16 && abstractC1939v.f0(hVar)) {
                        abstractC1939v.d0(hVar, this);
                        return;
                    }
                }
                break;
            case 1:
                ((F4.e) ((F4.f) this.f694e)).g((F4.b) this.f695f, X3.y.a);
                return;
            case 2:
                C1928k c1928k = (C1928k) this.f694e;
                if (c1928k.y()) {
                    c1928k.k(null);
                }
                ((WebView) this.f695f).destroy();
                return;
            case 3:
                ((C1928k) this.f695f).F((C1910X) this.f694e);
                return;
            default:
                ((C1928k) this.f694e).F((C1998d) this.f695f);
                return;
        }
    }

    public g(h hVar, Runnable runnable) {
        this.f693c = 0;
        this.f695f = hVar;
        this.f694e = runnable;
    }
}
