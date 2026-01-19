package Q4;

/* loaded from: classes.dex */
public final class w extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f6642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f6644e;

    public w(r rVar, int i6, byte[] bArr) {
        this.f6642c = rVar;
        this.f6643d = i6;
        this.f6644e = bArr;
    }

    @Override // s4.j
    public final void R(d5.A a) {
        if (a.f11442f) {
            throw new IllegalStateException("closed");
        }
        a.f11441e.O(this.f6644e, this.f6643d);
        a.c();
    }

    @Override // s4.j
    public final long m() {
        return this.f6643d;
    }

    @Override // s4.j
    public final r n() {
        return this.f6642c;
    }
}
