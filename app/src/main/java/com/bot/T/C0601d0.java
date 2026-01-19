package T;

import android.os.Parcel;
import android.os.Parcelable;
import f0.AbstractC0973C;
import f0.AbstractC0974D;
import f0.AbstractC0983f;
import f0.AbstractC0992o;
import f0.C0978a;
import f0.InterfaceC0994q;
import m4.AbstractC1276k;

/* renamed from: T.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601d0 extends AbstractC0973C implements Parcelable, InterfaceC0994q, X, d1 {
    public static final Parcelable.Creator<C0601d0> CREATOR = new C0597b0(1);

    /* renamed from: e, reason: collision with root package name */
    public O0 f8077e;

    public C0601d0(int i6) {
        AbstractC0983f j3 = AbstractC0992o.j();
        O0 o02 = new O0(j3.g(), i6);
        if (!(j3 instanceof C0978a)) {
            o02.f11648b = new O0(1, i6);
        }
        this.f8077e = o02;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D a() {
        return this.f8077e;
    }

    @Override // f0.InterfaceC0994q
    public final R0 b() {
        return C0602e.f8083j;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D c(AbstractC0974D abstractC0974D, AbstractC0974D abstractC0974D2, AbstractC0974D abstractC0974D3) {
        if (((O0) abstractC0974D2).f8017c == ((O0) abstractC0974D3).f8017c) {
            return abstractC0974D2;
        }
        return null;
    }

    @Override // f0.InterfaceC0972B
    public final void d(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f8077e = (O0) abstractC0974D;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((O0) AbstractC0992o.t(this.f8077e, this)).f8017c;
    }

    @Override // T.d1
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i6) {
        AbstractC0983f j3;
        O0 o02 = (O0) AbstractC0992o.h(this.f8077e);
        if (o02.f8017c != i6) {
            O0 o03 = this.f8077e;
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                ((O0) AbstractC0992o.o(o03, this, j3, o02)).f8017c = i6;
            }
            AbstractC0992o.n(j3, this);
        }
    }

    @Override // T.X
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((O0) AbstractC0992o.h(this.f8077e)).f8017c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(g());
    }
}
