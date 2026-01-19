package x4;

/* renamed from: x4.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1902O implements InterfaceC1914a0 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15662c;

    public C1902O(boolean z5) {
        this.f15662c = z5;
    }

    @Override // x4.InterfaceC1914a0
    public final boolean d() {
        return this.f15662c;
    }

    @Override // x4.InterfaceC1914a0
    public final n0 e() {
        return null;
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("Empty{"), this.f15662c ? "Active" : "New", '}');
    }
}
