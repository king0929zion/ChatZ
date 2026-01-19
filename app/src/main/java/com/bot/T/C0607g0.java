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

/* renamed from: T.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607g0 extends AbstractC0973C implements Parcelable, InterfaceC0994q {
    public static final Parcelable.Creator<C0607g0> CREATOR = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final R0 f8087e;

    /* renamed from: f, reason: collision with root package name */
    public Q0 f8088f;

    public C0607g0(Object obj, R0 r02) {
        this.f8087e = r02;
        AbstractC0983f j3 = AbstractC0992o.j();
        Q0 q02 = new Q0(j3.g(), obj);
        if (!(j3 instanceof C0978a)) {
            q02.f11648b = new Q0(1, obj);
        }
        this.f8088f = q02;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D a() {
        return this.f8088f;
    }

    @Override // f0.InterfaceC0994q
    public final R0 b() {
        return this.f8087e;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D c(AbstractC0974D abstractC0974D, AbstractC0974D abstractC0974D2, AbstractC0974D abstractC0974D3) {
        if (this.f8087e.a(((Q0) abstractC0974D2).f8023c, ((Q0) abstractC0974D3).f8023c)) {
            return abstractC0974D2;
        }
        return null;
    }

    @Override // f0.InterfaceC0972B
    public final void d(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f8088f = (Q0) abstractC0974D;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // T.d1
    public final Object getValue() {
        return ((Q0) AbstractC0992o.t(this.f8088f, this)).f8023c;
    }

    @Override // T.X
    public final void setValue(Object obj) {
        AbstractC0983f j3;
        Q0 q02 = (Q0) AbstractC0992o.h(this.f8088f);
        if (this.f8087e.a(q02.f8023c, obj)) {
            return;
        }
        Q0 q03 = this.f8088f;
        synchronized (AbstractC0992o.f11707c) {
            j3 = AbstractC0992o.j();
            ((Q0) AbstractC0992o.o(q03, this, j3, q02)).f8023c = obj;
        }
        AbstractC0992o.n(j3, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((Q0) AbstractC0992o.h(this.f8088f)).f8023c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int i7;
        parcel.writeValue(getValue());
        C0602e c0602e = C0602e.f8080g;
        R0 r02 = this.f8087e;
        if (AbstractC1276k.b(r02, c0602e)) {
            i7 = 0;
        } else if (AbstractC1276k.b(r02, C0602e.f8083j)) {
            i7 = 1;
        } else {
            if (!AbstractC1276k.b(r02, C0602e.f8081h)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i7 = 2;
        }
        parcel.writeInt(i7);
    }
}
