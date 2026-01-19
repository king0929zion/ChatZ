package n;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1292A extends InterfaceC1334l {
    @Override // n.InterfaceC1334l
    default F0 a(E0 e02) {
        return new B0.H(this);
    }

    float b(long j3, float f6, float f7, float f8);

    long c(float f6, float f7, float f8);

    default float d(float f6, float f7, float f8) {
        return b(c(f6, f7, f8), f6, f7, f8);
    }

    float e(long j3, float f6, float f7, float f8);
}
