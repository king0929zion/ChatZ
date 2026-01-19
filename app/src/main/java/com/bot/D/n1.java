package D;

/* loaded from: classes.dex */
public final class n1 implements X0.p {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1121b;

    public n1(int i6, int i7) {
        this.a = i6;
        this.f1121b = i7;
    }

    @Override // X0.p
    public int a(int i6) {
        if (i6 >= 0 && i6 <= this.f1121b) {
            AbstractC0090r0.E(i6, this.a, i6);
        }
        return i6;
    }

    @Override // X0.p
    public int b(int i6) {
        if (i6 >= 0 && i6 <= this.a) {
            AbstractC0090r0.D(i6, this.f1121b, i6);
        }
        return i6;
    }
}
