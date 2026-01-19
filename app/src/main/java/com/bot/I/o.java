package I;

import H0.AbstractC0157l;
import H0.C0149f0;
import H0.J;
import X3.y;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import b.C0853B;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1040q;
import k.N;
import l4.InterfaceC1193a;
import m0.C;
import m0.EnumC1245A;
import m4.AbstractC1276k;
import m4.C1274i;
import p.C1424b0;
import v.AbstractC1787b;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class o extends C1274i implements InterfaceC1193a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2109l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i6, Object obj, Class cls, String str, String str2, int i7, int i8, int i9) {
        super(i6, obj, cls, str, str2, i7, i8);
        this.f2109l = i9;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        ContentCaptureSession a;
        C0149f0 c0149f0;
        char c6;
        char c7;
        switch (this.f2109l) {
            case 0:
                return ((K.e) this.f12958e).data();
            case 1:
                View view = (View) this.f12958e;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 30) {
                    L0.c.e(view);
                }
                if (i6 < 29 || (a = L0.a.a(view)) == null) {
                    return null;
                }
                return new L0.b(a, view);
            case 2:
                N1.v vVar = (N1.v) this.f12958e;
                C4.c cVar = vVar.a;
                if (cVar == null) {
                    AbstractC1276k.k("coroutineScope");
                    throw null;
                }
                AbstractC1888A.j(cVar, null);
                vVar.d();
                N1.r rVar = vVar.f3790e;
                if (rVar != null) {
                    rVar.f3765f.close();
                    return y.a;
                }
                AbstractC1276k.k("connectionManager");
                throw null;
            case 3:
                ((C0853B) this.f12958e).e();
                return y.a;
            case 4:
                ((C0853B) this.f12958e).e();
                return y.a;
            case AbstractC1787b.f15290g /* 5 */:
                m0.k kVar = (m0.k) this.f12958e;
                N n3 = kVar.f12893c;
                N n5 = kVar.f12894d;
                m0.q qVar = kVar.a;
                C h3 = qVar.h();
                EnumC1245A enumC1245A = EnumC1245A.f12870f;
                if (h3 == null) {
                    Object[] objArr = n5.f12490b;
                    long[] jArr = n5.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        char c8 = 7;
                        while (true) {
                            long j3 = jArr[i7];
                            if ((((~j3) << c8) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length)) >>> 31);
                                int i9 = 0;
                                while (i9 < i8) {
                                    if ((j3 & 255) < 128) {
                                        c7 = c8;
                                        ((m0.h) objArr[(i7 << 3) + i9]).H(enumC1245A);
                                    } else {
                                        c7 = c8;
                                    }
                                    j3 >>= 8;
                                    i9++;
                                    c8 = c7;
                                }
                                c6 = c8;
                                if (i8 != 8) {
                                }
                            } else {
                                c6 = c8;
                            }
                            if (i7 != length) {
                                i7++;
                                c8 = c6;
                            }
                        }
                    }
                } else if (h3.f11819q) {
                    if (n3.c(h3)) {
                        h3.S0();
                    }
                    EnumC1245A R02 = h3.R0();
                    if (!h3.f11806c.f11819q) {
                        E0.a.b("visitAncestors called on an unattached node");
                    }
                    AbstractC1040q abstractC1040q = h3.f11806c;
                    J v5 = AbstractC0157l.v(h3);
                    int i10 = 0;
                    while (v5 != null) {
                        if ((v5.f1721J.f1919f.f11809g & 5120) != 0) {
                            while (abstractC1040q != null) {
                                int i11 = abstractC1040q.f11808f;
                                if ((i11 & 5120) != 0) {
                                    if ((i11 & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i10++;
                                    }
                                    if ((abstractC1040q instanceof m0.h) && n5.c(abstractC1040q)) {
                                        if (i10 <= 1) {
                                            ((m0.h) abstractC1040q).H(R02);
                                        } else {
                                            ((m0.h) abstractC1040q).H(EnumC1245A.f12869e);
                                        }
                                        n5.l(abstractC1040q);
                                    }
                                }
                                abstractC1040q = abstractC1040q.f11810h;
                            }
                        }
                        v5 = v5.v();
                        abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
                    }
                    Object[] objArr2 = n5.f12490b;
                    long[] jArr2 = n5.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j4 = jArr2[i12];
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if ((j4 & 255) < 128) {
                                        ((m0.h) objArr2[(i12 << 3) + i14]).H(enumC1245A);
                                    }
                                    j4 >>= 8;
                                }
                                if (i13 != 8) {
                                }
                            }
                            if (i12 != length2) {
                                i12++;
                            }
                        }
                    }
                }
                if (qVar.h() == null || qVar.f12900c.R0() == enumC1245A) {
                    qVar.e();
                }
                n3.b();
                n5.b();
                kVar.f12895e = false;
                return y.a;
            default:
                return Boolean.valueOf(C.U0(((C1424b0) this.f12958e).f13682y));
        }
    }
}
