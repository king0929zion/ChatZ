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

/* renamed from: T.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603e0 extends AbstractC0973C implements Parcelable, InterfaceC0994q, X, d1 {
    public static final Parcelable.Creator<C0603e0> CREATOR = new C0597b0(2);

    /* renamed from: e, reason: collision with root package name */
    public P0 f8085e;

    public C0603e0(long j3) {
        AbstractC0983f j4 = AbstractC0992o.j();
        P0 p02 = new P0(j4.g(), j3);
        if (!(j4 instanceof C0978a)) {
            p02.f11648b = new P0(1, j3);
        }
        this.f8085e = p02;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D a() {
        return this.f8085e;
    }

    @Override // f0.InterfaceC0994q
    public final R0 b() {
        return C0602e.f8083j;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D c(AbstractC0974D abstractC0974D, AbstractC0974D abstractC0974D2, AbstractC0974D abstractC0974D3) {
        if (((P0) abstractC0974D2).f8019c == ((P0) abstractC0974D3).f8019c) {
            return abstractC0974D2;
        }
        return null;
    }

    @Override // f0.InterfaceC0972B
    public final void d(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f8085e = (P0) abstractC0974D;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((P0) AbstractC0992o.t(this.f8085e, this)).f8019c;
    }

    @Override // T.d1
    public Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j3) {
        AbstractC0983f j4;
        P0 p02 = (P0) AbstractC0992o.h(this.f8085e);
        if (p02.f8019c != j3) {
            P0 p03 = this.f8085e;
            synchronized (AbstractC0992o.f11707c) {
                j4 = AbstractC0992o.j();
                ((P0) AbstractC0992o.o(p03, this, j4, p02)).f8019c = j3;
            }
            AbstractC0992o.n(j4, this);
        }
    }

    @Override // T.X
    public void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((P0) AbstractC0992o.h(this.f8085e)).f8019c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(g());
    }
}
