package F0;

/* renamed from: F0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110b0 implements y0, InterfaceC0121i {

    /* renamed from: e, reason: collision with root package name */
    public static final C0110b0 f1468e = new C0110b0(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1469c;

    public /* synthetic */ C0110b0(int i6) {
        this.f1469c = i6;
    }

    @Override // F0.InterfaceC0121i
    public long a(long j3, long j4) {
        switch (this.f1469c) {
            case 1:
                float max = Math.max(Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j3 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i6 = q0.a;
                return floatToRawIntBits;
            case 2:
                float c6 = AbstractC0137z.c(j3, j4);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(c6) << 32) | (Float.floatToRawIntBits(c6) & 4294967295L);
                int i7 = q0.a;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j3 >> 32)) <= Float.intBitsToFloat((int) (j4 >> 32)) && Float.intBitsToFloat((int) (j3 & 4294967295L)) <= Float.intBitsToFloat((int) (j4 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i8 = q0.a;
                    return floatToRawIntBits3;
                }
                float c7 = AbstractC0137z.c(j3, j4);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(c7) << 32) | (Float.floatToRawIntBits(c7) & 4294967295L);
                int i9 = q0.a;
                return floatToRawIntBits4;
        }
    }

    @Override // F0.y0
    public void e(x0 x0Var) {
        x0Var.clear();
    }

    @Override // F0.y0
    public boolean h(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.f1469c) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
