package O4;

import I3.I;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends I {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4335c;

    public f(C0.c cVar, boolean z5) {
        super(cVar);
        this.f4335c = z5;
    }

    @Override // I3.I
    public final void l(String str) {
        AbstractC1276k.f(str, "value");
        if (this.f4335c) {
            super.l(str);
        } else {
            j(str);
        }
    }
}
