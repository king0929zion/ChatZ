package Y;

/* loaded from: classes.dex */
public final class q extends o {

    /* renamed from: g, reason: collision with root package name */
    public final h f9577g;

    public q(h hVar) {
        this.f9577g = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i6 = this.f9575f;
        this.f9575f = i6 + 2;
        Object[] objArr = this.f9573c;
        return new b(this.f9577g, objArr[i6], objArr[i6 + 1]);
    }
}
