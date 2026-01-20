package A0;

import B0.AbstractC0032h;
import H0.F0Inner;
import H0.InterfaceC0155j;
import h0.AbstractC1040q;
import m0.C;
import m4.AbstractC1277l;
import m4.C1288w;

/* loaded from: classes.dex */
public final class k extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f56e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1288w f57f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(C1288w c1288w, int i6) {
        super(1);
        this.f56e = i6;
        this.f57f = c1288w;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean z5;
        switch (this.f56e) {
            case 0:
                InterfaceC0155j interfaceC0155j = (F0) obj;
                if (((AbstractC1040q) interfaceC0155j).f11806c.f11819q) {
                    this.f57f.f12973c = interfaceC0155j;
                    z5 = false;
                } else {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 1:
                AbstractC0032h abstractC0032h = (AbstractC0032h) obj;
                C1288w c1288w = this.f57f;
                Object obj2 = c1288w.f12973c;
                if (obj2 == null && abstractC0032h.f451t) {
                    c1288w.f12973c = abstractC0032h;
                } else if (obj2 != null) {
                    abstractC0032h.getClass();
                }
                return Boolean.TRUE;
            default:
                this.f57f.f12973c = (C) obj;
                return Boolean.TRUE;
        }
    }
}
