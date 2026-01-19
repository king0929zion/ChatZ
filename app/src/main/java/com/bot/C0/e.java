package C0;

import S.l;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class e {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final d f653b;

    /* renamed from: c, reason: collision with root package name */
    public final int f654c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f655d;

    /* renamed from: e, reason: collision with root package name */
    public int f656e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f657f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f658g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f659h;

    public e(boolean z5, d dVar) {
        int i6;
        this.a = z5;
        this.f653b = dVar;
        if (z5 && dVar.equals(d.f650c)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            i6 = 3;
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            i6 = 2;
        }
        this.f654c = i6;
        this.f655d = new a[20];
        this.f657f = new float[20];
        this.f658g = new float[20];
        this.f659h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, C0.a] */
    public final void a(float f6, long j3) {
        int i6 = (this.f656e + 1) % 20;
        this.f656e = i6;
        a[] aVarArr = this.f655d;
        a aVar = aVarArr[i6];
        if (aVar != 0) {
            aVar.a = j3;
            aVar.f645b = f6;
        } else {
            Object obj = new Object();
            obj.a = j3;
            obj.f645b = f6;
            aVarArr[i6] = obj;
        }
    }

    public final float b(float f6) {
        d dVar;
        float[] fArr;
        float[] fArr2;
        float f7;
        boolean z5;
        int i6;
        float f8;
        float f9 = f6;
        float f10 = l.f7374V;
        if (f9 <= l.f7374V) {
            E0.a.b("maximumVelocity should be a positive value. You specified=" + f9);
        }
        int i7 = this.f656e;
        a[] aVarArr = this.f655d;
        a aVar = aVarArr[i7];
        if (aVar == null) {
            f7 = 0.0f;
        } else {
            int i8 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i7];
                boolean z6 = this.a;
                dVar = this.f653b;
                fArr = this.f657f;
                fArr2 = this.f658g;
                if (aVar3 != null) {
                    long j3 = aVar.a;
                    f7 = f10;
                    int i9 = i7;
                    long j4 = aVar3.a;
                    float f11 = (float) (j3 - j4);
                    z5 = z6;
                    i6 = 1;
                    float abs = (float) Math.abs(j4 - aVar2.a);
                    aVar2 = (dVar == d.f650c || z5) ? aVar3 : aVar;
                    if (f11 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i8] = aVar3.f645b;
                    fArr2[i8] = -f11;
                    i7 = (i9 == 0 ? 20 : i9) - 1;
                    i8++;
                    if (i8 >= 20) {
                        break;
                    }
                    f10 = f7;
                } else {
                    f7 = f10;
                    z5 = z6;
                    i6 = 1;
                    break;
                }
            }
            if (i8 >= this.f654c) {
                int ordinal = dVar.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.f659h;
                        AbstractC1410a.C(fArr2, fArr, i8, fArr3);
                        f8 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f8 = f7;
                    }
                } else {
                    if (ordinal != i6) {
                        throw new RuntimeException();
                    }
                    int i10 = i8 - i6;
                    float f12 = fArr2[i10];
                    int i11 = i10;
                    float f13 = f7;
                    while (i11 > 0) {
                        int i12 = i11 - 1;
                        float f14 = fArr2[i12];
                        if (f12 != f14) {
                            float f15 = (z5 ? -fArr[i12] : fArr[i11] - fArr[i12]) / (f12 - f14);
                            f13 += Math.abs(f15) * (f15 - (Math.signum(f13) * ((float) Math.sqrt(Math.abs(f13) * 2))));
                            if (i11 == i10) {
                                f13 *= 0.5f;
                            }
                        }
                        i11--;
                        f12 = f14;
                    }
                    f8 = Math.signum(f13) * ((float) Math.sqrt(Math.abs(f13) * 2));
                }
                f10 = f8 * 1000;
            } else {
                f10 = f7;
            }
        }
        if (f10 == f7 || Float.isNaN(f10)) {
            return f7;
        }
        if (f10 <= f7) {
            f9 = -f9;
            if (f10 >= f9) {
                return f10;
            }
        } else if (f10 <= f9) {
            f9 = f10;
        }
        return f9;
    }

    public /* synthetic */ e() {
        this(false, d.f650c);
    }

    public e(int i6) {
        this(true, d.f651e);
    }
}
