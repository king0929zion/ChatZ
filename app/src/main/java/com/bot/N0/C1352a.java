package n0;

import S.l;
import i1.AbstractC1087g;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352a {
    public float a = l.f7374V;

    /* renamed from: b, reason: collision with root package name */
    public float f13291b = l.f7374V;

    /* renamed from: c, reason: collision with root package name */
    public float f13292c = l.f7374V;

    /* renamed from: d, reason: collision with root package name */
    public float f13293d = l.f7374V;

    public final void a(float f6, float f7, float f8, float f9) {
        this.a = Math.max(f6, this.a);
        this.f13291b = Math.max(f7, this.f13291b);
        this.f13292c = Math.min(f8, this.f13292c);
        this.f13293d = Math.min(f9, this.f13293d);
    }

    public final boolean b() {
        return (this.a >= this.f13292c) | (this.f13291b >= this.f13293d);
    }

    public final void c(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        this.a += intBitsToFloat;
        this.f13291b += intBitsToFloat2;
        this.f13292c += intBitsToFloat;
        this.f13293d += intBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + AbstractC1087g.o(this.a) + ", " + AbstractC1087g.o(this.f13291b) + ", " + AbstractC1087g.o(this.f13292c) + ", " + AbstractC1087g.o(this.f13293d) + ')';
    }
}
