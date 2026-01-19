package Z2;

import m4.AbstractC1276k;
import n0.C1353b;

/* renamed from: Z2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762l implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10247c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f10249f;

    public /* synthetic */ C0762l(String str, T.X x5, int i6) {
        this.f10247c = i6;
        this.f10248e = str;
        this.f10249f = x5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f10247c) {
            case 0:
                long j3 = ((C1353b) obj).a;
                T.X x5 = this.f10249f;
                if (((String) x5.getValue()) != null && !AbstractC1276k.b((String) x5.getValue(), this.f10248e)) {
                    x5.setValue(null);
                }
                return X3.y.a;
            case 1:
                long j4 = ((C1353b) obj).a;
                T.X x6 = this.f10249f;
                if (((String) x6.getValue()) != null && !AbstractC1276k.b((String) x6.getValue(), this.f10248e)) {
                    x6.setValue(null);
                }
                return X3.y.a;
            default:
                long j5 = ((C1353b) obj).a;
                T.X x7 = this.f10249f;
                if (((String) x7.getValue()) != null && !AbstractC1276k.b((String) x7.getValue(), this.f10248e)) {
                    x7.setValue(null);
                }
                return X3.y.a;
        }
    }
}
