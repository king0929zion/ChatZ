package S0;

import android.text.Layout;
import f0.C0987j;
import java.io.Serializable;
import m4.C1285t;
import m4.C1286u;
import m4.C1288w;
import n0.C1354c;
import o0.C1395f;
import o0.C1400k;
import q0.C1496b;
import q0.InterfaceC1498d;

/* renamed from: S0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0553o implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7643c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f7644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f7646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7647h;

    public /* synthetic */ C0553o(long j3, float[] fArr, C1286u c1286u, C1285t c1285t) {
        this.f7644e = j3;
        this.f7645f = fArr;
        this.f7646g = c1286u;
        this.f7647h = c1285t;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // l4.c
    public final Object f(Object obj) {
        float[] fArr;
        long j3;
        int i6;
        float a;
        float a6;
        switch (this.f7643c) {
            case 0:
                float[] fArr2 = (float[]) this.f7645f;
                C1286u c1286u = (C1286u) this.f7646g;
                C1285t c1285t = (C1285t) this.f7647h;
                r rVar = (r) obj;
                int i7 = rVar.f7657b;
                C0539a c0539a = rVar.a;
                int i8 = rVar.f7658c;
                long j4 = this.f7644e;
                int f6 = i7 > O.f(j4) ? rVar.f7657b : O.f(j4);
                if (i8 >= O.e(j4)) {
                    i8 = O.e(j4);
                }
                long b5 = F.b(rVar.d(f6), rVar.d(i8));
                int i9 = c1286u.f12971c;
                T0.j jVar = c0539a.f7617d;
                int f7 = O.f(b5);
                int e6 = O.e(b5);
                Layout layout = jVar.f8316f;
                int length = layout.getText().length();
                if (f7 < 0) {
                    Y0.a.a("startOffset must be > 0");
                }
                if (f7 >= length) {
                    Y0.a.a("startOffset must be less than text length");
                }
                if (e6 <= f7) {
                    Y0.a.a("endOffset must be greater than startOffset");
                }
                if (e6 > length) {
                    Y0.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i9 < (e6 - f7) * 4) {
                    Y0.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(f7);
                int lineForOffset2 = layout.getLineForOffset(e6 - 1);
                O0.i iVar = new O0.i(jVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int f8 = jVar.f(lineForOffset);
                        int max = Math.max(f7, lineStart);
                        int min = Math.min(e6, f8);
                        float g3 = jVar.g(lineForOffset);
                        float e7 = jVar.e(lineForOffset);
                        j3 = b5;
                        boolean z5 = false;
                        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (!z6 || isRtlCharAt) {
                                if (z6 && isRtlCharAt) {
                                    z5 = false;
                                    float a7 = iVar.a(max, false, false, false);
                                    i6 = min;
                                    a = iVar.a(max + 1, true, true, false);
                                    a6 = a7;
                                } else {
                                    i6 = min;
                                    z5 = false;
                                    if (z6 || !isRtlCharAt) {
                                        a = iVar.a(max, false, false, false);
                                        a6 = iVar.a(max + 1, true, true, false);
                                    } else {
                                        a6 = iVar.a(max, false, false, true);
                                        a = iVar.a(max + 1, true, true, true);
                                    }
                                }
                                fArr[i9] = a;
                                fArr[i9 + 1] = g3;
                                fArr[i9 + 2] = a6;
                                fArr[i9 + 3] = e7;
                                i9 += 4;
                                max++;
                                min = i6;
                            } else {
                                a = iVar.a(max, z5, z5, true);
                                i6 = min;
                                a6 = iVar.a(max + 1, true, true, true);
                            }
                            z5 = false;
                            fArr[i9] = a;
                            fArr[i9 + 1] = g3;
                            fArr[i9 + 2] = a6;
                            fArr[i9 + 3] = e7;
                            i9 += 4;
                            max++;
                            min = i6;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            fArr2 = fArr;
                            b5 = j3;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j3 = b5;
                }
                int d6 = (O.d(j3) * 4) + c1286u.f12971c;
                for (int i10 = c1286u.f12971c; i10 < d6; i10 += 4) {
                    int i11 = i10 + 1;
                    float f9 = fArr[i11];
                    float f10 = c1285t.f12970c;
                    fArr[i11] = f9 + f10;
                    int i12 = i10 + 3;
                    fArr[i12] = fArr[i12] + f10;
                }
                c1286u.f12971c = d6;
                c1285t.f12970c = c0539a.b() + c1285t.f12970c;
                return X3.y.a;
            default:
                C1354c c1354c = (C1354c) this.f7645f;
                C1288w c1288w = (C1288w) this.f7646g;
                long j5 = this.f7644e;
                C1400k c1400k = (C1400k) this.f7647h;
                H0.L l3 = (H0.L) obj;
                l3.b();
                float f11 = c1354c.a;
                float f12 = c1354c.f13295b;
                C1496b c1496b = l3.f1765c;
                ((C0987j) c1496b.f13944e.f1972e).G(f11, f12);
                try {
                    InterfaceC1498d.q0(l3, (C1395f) c1288w.f12973c, j5, 0L, S.l.f7374V, c1400k, 0, 890);
                    return X3.y.a;
                } finally {
                    ((C0987j) c1496b.f13944e.f1972e).G(-f11, -f12);
                }
        }
    }

    public /* synthetic */ C0553o(C1354c c1354c, C1288w c1288w, long j3, C1400k c1400k) {
        this.f7645f = c1354c;
        this.f7646g = c1288w;
        this.f7644e = j3;
        this.f7647h = c1400k;
    }
}
