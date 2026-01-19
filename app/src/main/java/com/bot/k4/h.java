package K4;

import M4.C0276x;
import X3.p;
import X3.r;
import X3.t;
import X3.w;
import Y3.AbstractC0737d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k.X;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class h implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2969c;

    /* renamed from: e, reason: collision with root package name */
    public int f2970e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2971f;

    public /* synthetic */ h(Object obj, int i6) {
        this.f2969c = i6;
        this.f2971f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2969c) {
            case 0:
                return this.f2970e > 0;
            case 1:
                return this.f2970e < ((byte[]) this.f2971f).length;
            case 2:
                return this.f2970e < ((int[]) this.f2971f).length;
            case 3:
                return this.f2970e < ((long[]) this.f2971f).length;
            case 4:
                return this.f2970e < ((short[]) this.f2971f).length;
            case AbstractC1787b.f15290g /* 5 */:
                return this.f2970e < ((AbstractC0737d) this.f2971f).a();
            case 6:
                return this.f2970e < ((X) this.f2971f).f();
            default:
                return this.f2970e < ((Object[]) this.f2971f).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2969c) {
            case 0:
                C0276x c0276x = (C0276x) this.f2971f;
                int i6 = c0276x.f3452c;
                int i7 = this.f2970e;
                this.f2970e = i7 - 1;
                return c0276x.f3454e[i6 - i7];
            case 1:
                int i8 = this.f2970e;
                byte[] bArr = (byte[]) this.f2971f;
                if (i8 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2970e));
                }
                this.f2970e = i8 + 1;
                return new p(bArr[i8]);
            case 2:
                int i9 = this.f2970e;
                int[] iArr = (int[]) this.f2971f;
                if (i9 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2970e));
                }
                this.f2970e = i9 + 1;
                return new r(iArr[i9]);
            case 3:
                int i10 = this.f2970e;
                long[] jArr = (long[]) this.f2971f;
                if (i10 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2970e));
                }
                this.f2970e = i10 + 1;
                return new t(jArr[i10]);
            case 4:
                int i11 = this.f2970e;
                short[] sArr = (short[]) this.f2971f;
                if (i11 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f2970e));
                }
                this.f2970e = i11 + 1;
                return new w(sArr[i11]);
            case AbstractC1787b.f15290g /* 5 */:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC0737d abstractC0737d = (AbstractC0737d) this.f2971f;
                int i12 = this.f2970e;
                this.f2970e = i12 + 1;
                return abstractC0737d.get(i12);
            case 6:
                X x5 = (X) this.f2971f;
                int i13 = this.f2970e;
                this.f2970e = i13 + 1;
                return x5.g(i13);
            default:
                try {
                    Object[] objArr = (Object[]) this.f2971f;
                    int i14 = this.f2970e;
                    this.f2970e = i14 + 1;
                    return objArr[i14];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f2970e--;
                    throw new NoSuchElementException(e6.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2969c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case AbstractC1787b.f15290g /* 5 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(Object[] objArr) {
        this.f2969c = 7;
        AbstractC1276k.f(objArr, "array");
        this.f2971f = objArr;
    }

    public h(C0276x c0276x) {
        this.f2969c = 0;
        this.f2971f = c0276x;
        this.f2970e = c0276x.f3452c;
    }
}
