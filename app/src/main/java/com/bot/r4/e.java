package r4;

import java.util.Iterator;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public class e implements Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final int f14679c;

    /* renamed from: e, reason: collision with root package name */
    public final int f14680e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14681f;

    public e(int i6, int i7, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f14679c = i6;
        this.f14680e = h5.e.Y(i6, i7, i8);
        this.f14681f = i8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f14679c == eVar.f14679c && this.f14680e == eVar.f14680e && this.f14681f == eVar.f14681f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f14679c * 31) + this.f14680e) * 31) + this.f14681f;
    }

    public boolean isEmpty() {
        int i6 = this.f14681f;
        int i7 = this.f14680e;
        int i8 = this.f14679c;
        return i6 > 0 ? i8 > i7 : i8 < i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f14679c, this.f14680e, this.f14681f);
    }

    public String toString() {
        StringBuilder sb;
        int i6 = this.f14680e;
        int i7 = this.f14679c;
        int i8 = this.f14681f;
        if (i8 > 0) {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append("..");
            sb.append(i6);
            sb.append(" step ");
            sb.append(i8);
        } else {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append(" downTo ");
            sb.append(i6);
            sb.append(" step ");
            sb.append(-i8);
        }
        return sb.toString();
    }
}
