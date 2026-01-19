package u4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: u4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770h implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f15183c;

    /* renamed from: e, reason: collision with root package name */
    public int f15184e;

    /* renamed from: f, reason: collision with root package name */
    public int f15185f;

    /* renamed from: g, reason: collision with root package name */
    public int f15186g;

    /* renamed from: h, reason: collision with root package name */
    public int f15187h;

    public C1770h(CharSequence charSequence) {
        AbstractC1276k.f(charSequence, "string");
        this.f15183c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6;
        int i7;
        int i8 = this.f15184e;
        if (i8 != 0) {
            return i8 == 1;
        }
        if (this.f15187h < 0) {
            this.f15184e = 2;
            return false;
        }
        CharSequence charSequence = this.f15183c;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i9 = this.f15185f; i9 < length2; i9++) {
            char charAt = charSequence.charAt(i9);
            if (charAt == '\n' || charAt == '\r') {
                i6 = (charAt == '\r' && (i7 = i9 + 1) < charSequence.length() && charSequence.charAt(i7) == '\n') ? 2 : 1;
                length = i9;
                this.f15184e = 1;
                this.f15187h = i6;
                this.f15186g = length;
                return true;
            }
        }
        i6 = -1;
        this.f15184e = 1;
        this.f15187h = i6;
        this.f15186g = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15184e = 0;
        int i6 = this.f15186g;
        int i7 = this.f15185f;
        this.f15185f = this.f15187h + i6;
        return this.f15183c.subSequence(i7, i6).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
