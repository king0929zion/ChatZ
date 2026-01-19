package v2;

import android.graphics.drawable.Drawable;
import j2.m;
import s2.AbstractC1662j;
import s2.C1657e;
import s2.C1667o;

/* loaded from: classes.dex */
public final class c implements d {
    public final m a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1662j f15378b;

    public c(m mVar, AbstractC1662j abstractC1662j) {
        this.a = mVar;
        this.f15378b = abstractC1662j;
    }

    @Override // v2.d
    public final void a() {
        AbstractC1662j abstractC1662j = this.f15378b;
        boolean z5 = abstractC1662j instanceof C1667o;
        m mVar = this.a;
        if (z5) {
            Drawable drawable = ((C1667o) abstractC1662j).a;
            mVar.getClass();
        } else {
            if (!(abstractC1662j instanceof C1657e)) {
                throw new RuntimeException();
            }
            Drawable drawable2 = ((C1657e) abstractC1662j).a;
            mVar.getClass();
        }
    }
}
