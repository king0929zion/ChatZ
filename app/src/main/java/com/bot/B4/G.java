package B4;

import A4.V;
import A4.e0;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class G extends V implements e0 {
    @Override // A4.e0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f216k;
            AbstractC1276k.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f217l + ((int) ((p() + this.f219n) - this.f217l))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i6) {
        synchronized (this) {
            Object[] objArr = this.f216k;
            AbstractC1276k.c(objArr);
            h(Integer.valueOf(((Number) objArr[((int) ((this.f217l + ((int) ((p() + this.f219n) - this.f217l))) - 1)) & (objArr.length - 1)]).intValue() + i6));
        }
    }
}
