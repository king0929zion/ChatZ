package r4;

import Y3.A;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f extends A {

    /* renamed from: c, reason: collision with root package name */
    public final int f14682c;

    /* renamed from: e, reason: collision with root package name */
    public final int f14683e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14684f;

    /* renamed from: g, reason: collision with root package name */
    public int f14685g;

    public f(int i6, int i7, int i8) {
        this.f14682c = i8;
        this.f14683e = i7;
        boolean z5 = false;
        if (i8 <= 0 ? i6 >= i7 : i6 <= i7) {
            z5 = true;
        }
        this.f14684f = z5;
        this.f14685g = z5 ? i6 : i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14684f;
    }

    @Override // Y3.A
    public final int nextInt() {
        int i6 = this.f14685g;
        if (i6 != this.f14683e) {
            this.f14685g = this.f14682c + i6;
            return i6;
        }
        if (!this.f14684f) {
            throw new NoSuchElementException();
        }
        this.f14684f = false;
        return i6;
    }
}
