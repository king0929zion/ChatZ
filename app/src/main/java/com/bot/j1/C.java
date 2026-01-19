package J1;

import T.C0607g0;
import T.d1;
import b4.InterfaceC0905c;
import java.util.Iterator;
import java.util.List;
import k.C1153G;
import m4.AbstractC1276k;
import n.y0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class C extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y0 f2821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I1.B f2822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I1.j f2823j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1153G f2824k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d1 f2825l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f2826m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(y0 y0Var, I1.B b5, I1.j jVar, C1153G c1153g, d1 d1Var, i iVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2821h = y0Var;
        this.f2822i = b5;
        this.f2823j = jVar;
        this.f2824k = c1153g;
        this.f2825l = d1Var;
        this.f2826m = iVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C c6 = (C) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c6.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C(this.f2821h, this.f2822i, this.f2823j, this.f2824k, this.f2825l, this.f2826m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        char c6;
        X3.a.e(obj);
        y0 y0Var = this.f2821h;
        Object k3 = y0Var.a.k();
        C0607g0 c0607g0 = y0Var.f13280d;
        if (AbstractC1276k.b(k3, c0607g0.getValue()) && (((I1.j) this.f2822i.f2518b.f3019f.g()) == null || AbstractC1276k.b(c0607g0.getValue(), this.f2823j))) {
            Iterator it = ((List) this.f2825l.getValue()).iterator();
            while (it.hasNext()) {
                this.f2826m.b().c((I1.j) it.next());
            }
            C1153G c1153g = this.f2824k;
            long[] jArr = c1153g.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j3 = jArr[i6];
                    char c7 = 7;
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j3 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj2 = c1153g.f12456b[i9];
                                c6 = c7;
                                float f6 = c1153g.f12457c[i9];
                                if (!AbstractC1276k.b((String) obj2, ((I1.j) c0607g0.getValue()).f2548i)) {
                                    c1153g.f12459e--;
                                    long[] jArr2 = c1153g.a;
                                    int i10 = c1153g.f12458d;
                                    int i11 = i9 >> 3;
                                    int i12 = (i9 & 7) << 3;
                                    long j4 = (jArr2[i11] & (~(255 << i12))) | (254 << i12);
                                    jArr2[i11] = j4;
                                    jArr2[(((i9 - 7) & i10) + (i10 & 7)) >> 3] = j4;
                                    c1153g.f12456b[i9] = null;
                                }
                            } else {
                                c6 = c7;
                            }
                            j3 >>= 8;
                            i8++;
                            c7 = c6;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            }
        }
        return X3.y.a;
    }
}
