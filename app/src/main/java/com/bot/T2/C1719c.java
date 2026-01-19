package t2;

import android.content.Context;
import android.util.DisplayMetrics;
import i2.C1112f;
import m4.AbstractC1276k;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1719c implements InterfaceC1724h {
    public final Context a;

    public C1719c(Context context) {
        this.a = context;
    }

    @Override // t2.InterfaceC1724h
    public final Object e(C1112f c1112f) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        C1717a c1717a = new C1717a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C1723g(c1717a, c1717a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1719c) {
            return AbstractC1276k.b(this.a, ((C1719c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
