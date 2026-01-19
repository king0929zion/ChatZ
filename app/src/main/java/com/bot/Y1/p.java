package y1;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: c, reason: collision with root package name */
    public final int f15986c;

    /* renamed from: e, reason: collision with root package name */
    public int f15987e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f15988f = -1;

    public p(int i6) {
        this.f15986c = i6;
    }

    @Override // y1.o
    public final Object k() {
        return this;
    }

    @Override // y1.o
    public final boolean l(CharSequence charSequence, int i6, int i7, u uVar) {
        int i8 = this.f15986c;
        if (i6 > i8 || i8 >= i7) {
            return i7 <= i8;
        }
        this.f15987e = i6;
        this.f15988f = i7;
        return false;
    }
}
