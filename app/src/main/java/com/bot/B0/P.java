package B0;

import H0.AbstractC0141b0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import h0.AbstractC1040q;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class P extends AbstractC0141b0 {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f402b;

    /* renamed from: c, reason: collision with root package name */
    public final PointerInputEventHandler f403c;

    public P(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i6) {
        obj2 = (i6 & 2) != 0 ? null : obj2;
        this.a = obj;
        this.f402b = obj2;
        this.f403c = pointerInputEventHandler;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new X(this.a, this.f402b, this.f403c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p5 = (P) obj;
        return AbstractC1276k.b(this.a, p5.a) && AbstractC1276k.b(this.f402b, p5.f402b) && this.f403c == p5.f403c;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        X x5 = (X) abstractC1040q;
        Object obj = x5.f423r;
        Object obj2 = this.a;
        boolean z5 = !AbstractC1276k.b(obj, obj2);
        x5.f423r = obj2;
        Object obj3 = x5.f424s;
        Object obj4 = this.f402b;
        if (!AbstractC1276k.b(obj3, obj4)) {
            z5 = true;
        }
        x5.f424s = obj4;
        Class<?> cls = x5.f425t.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f403c;
        if (cls == pointerInputEventHandler.getClass() ? z5 : true) {
            x5.O0();
        }
        x5.f425t = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f402b;
        return this.f403c.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
