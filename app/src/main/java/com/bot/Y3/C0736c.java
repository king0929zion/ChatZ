package Y3;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: Y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736c extends AbstractC0737d implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0737d f9797c;

    /* renamed from: e, reason: collision with root package name */
    public final int f9798e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9799f;

    public C0736c(AbstractC0737d abstractC0737d, int i6, int i7) {
        this.f9797c = abstractC0737d;
        this.f9798e = i6;
        s4.j.l(i6, i7, abstractC0737d.a());
        this.f9799f = i7 - i6;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        return this.f9799f;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        int i7 = this.f9799f;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(B3.e.k("index: ", i6, i7, ", size: "));
        }
        return this.f9797c.get(this.f9798e + i6);
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final List subList(int i6, int i7) {
        s4.j.l(i6, i7, this.f9799f);
        int i8 = this.f9798e;
        return new C0736c(this.f9797c, i6 + i8, i8 + i7);
    }
}
