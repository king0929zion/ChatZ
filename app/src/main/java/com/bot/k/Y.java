package k;

/* loaded from: classes.dex */
public final class Y extends Y3.A {

    /* renamed from: c, reason: collision with root package name */
    public int f12513c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f12514e;

    public Y(X x5) {
        this.f12514e = x5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12513c < this.f12514e.f();
    }

    @Override // Y3.A
    public final int nextInt() {
        int i6 = this.f12513c;
        this.f12513c = i6 + 1;
        return this.f12514e.d(i6);
    }
}
