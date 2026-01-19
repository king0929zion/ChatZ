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

/* renamed from: T.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599c0 extends AbstractC0973C implements Parcelable, InterfaceC0994q, X, d1 {
    public static final Parcelable.Creator<C0599c0> CREATOR = new C0597b0(0);

    /* renamed from: e, reason: collision with root package name */
    public N0 f8072e;

    public C0599c0(float f6) {
        AbstractC0983f j3 = AbstractC0992o.j();
        N0 n02 = new N0(f6, j3.g());
        if (!(j3 instanceof C0978a)) {
            n02.f11648b = new N0(f6, 1);
        }
        this.f8072e = n02;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D a() {
        return this.f8072e;
    }

    @Override // f0.InterfaceC0994q
    public final R0 b() {
        return C0602e.f8083j;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D c(AbstractC0974D abstractC0974D, AbstractC0974D abstractC0974D2, AbstractC0974D abstractC0974D3) {
        if (((N0) abstractC0974D2).f8011c == ((N0) abstractC0974D3).f8011c) {
            return abstractC0974D2;
        }
        return null;
    }

    @Override // f0.InterfaceC0972B
    public final void d(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f8072e = (N0) abstractC0974D;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((N0) AbstractC0992o.t(this.f8072e, this)).f8011c;
    }

    @Override // T.d1
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f6) {
        AbstractC0983f j3;
        N0 n02 = (N0) AbstractC0992o.h(this.f8072e);
        if (n02.f8011c == f6) {
            return;
        }
        N0 n03 = this.f8072e;
        synchronized (AbstractC0992o.f11707c) {
            j3 = AbstractC0992o.j();
            ((N0) AbstractC0992o.o(n03, this, j3, n02)).f8011c = f6;
        }
        AbstractC0992o.n(j3, this);
    }

    @Override // T.X
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((N0) AbstractC0992o.h(this.f8072e)).f8011c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeFloat(g());
    }
}
