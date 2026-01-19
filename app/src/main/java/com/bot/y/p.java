package Y;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9576g;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9576g) {
            case 0:
                int i6 = this.f9575f;
                this.f9575f = i6 + 2;
                Object[] objArr = this.f9573c;
                return new a(0, objArr[i6], objArr[i6 + 1]);
            case 1:
                int i7 = this.f9575f;
                this.f9575f = i7 + 2;
                return this.f9573c[i7];
            default:
                int i8 = this.f9575f;
                this.f9575f = i8 + 2;
                return this.f9573c[i8 + 1];
        }
    }
}
