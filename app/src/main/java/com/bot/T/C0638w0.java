package T;

import D.C0066f;
import Z2.AbstractC0783w;
import android.os.Trace;
import b0.C0873f;
import f0.AbstractC0983f;
import f0.AbstractC0992o;
import f0.C0976F;
import f0.C0977G;
import f0.C0979b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import x.C1856g;

/* renamed from: T.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0638w0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8224c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8229i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8230j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8231k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f8232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8233m;

    public /* synthetic */ C0638w0(C0642y0 c0642y0, k.N n3, k.N n5, List list, List list2, k.N n6, List list3, k.N n7, Set set) {
        this.f8225e = c0642y0;
        this.f8226f = n3;
        this.f8227g = n5;
        this.f8230j = list;
        this.f8231k = list2;
        this.f8228h = n6;
        this.f8232l = list3;
        this.f8229i = n7;
        this.f8233m = set;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean z5;
        AbstractC0983f c0977g;
        int i6;
        long j3;
        boolean z6;
        switch (this.f8224c) {
            case 0:
                C0642y0 c0642y0 = (C0642y0) this.f8225e;
                k.N n3 = (k.N) this.f8226f;
                k.N n5 = (k.N) this.f8227g;
                List list = (List) this.f8230j;
                List list2 = (List) this.f8231k;
                n5 = (k.N) this.f8228h;
                list = (List) this.f8232l;
                n5 = (k.N) this.f8229i;
                Set set = (Set) this.f8233m;
                long longValue = ((Long) obj).longValue();
                synchronized (c0642y0.f8272c) {
                    z5 = c0642y0.z();
                }
                if (z5) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((E1.b) c0642y0.a.f2269f).k(new C0066f(longValue, 3));
                        synchronized (AbstractC0992o.f11707c) {
                            k.N n6 = AbstractC0992o.f11714j.f11668h;
                            if (n6 != null) {
                                z6 = n6.h();
                            }
                        }
                        if (z6) {
                            AbstractC0992o.a();
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    c0642y0.K();
                    synchronized (c0642y0.f8272c) {
                        try {
                            V.e eVar = c0642y0.f8278i;
                            Object[] objArr = eVar.f8759c;
                            int i7 = eVar.f8761f;
                            for (int i8 = 0; i8 < i7; i8++) {
                                list.add((C0639x) objArr[i8]);
                            }
                            c0642y0.f8278i.g();
                        } finally {
                        }
                    }
                    n3.b();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            AbstractC0983f j4 = AbstractC0992o.j();
                            if (j4 instanceof C0979b) {
                                c0977g = new C0976F((C0979b) j4, null, null, true, false);
                                i6 = 0;
                            } else {
                                i6 = 0;
                                c0977g = new C0977G(j4, null, true, false);
                            }
                            try {
                                AbstractC0983f j5 = c0977g.j();
                                try {
                                    if (!list.isEmpty()) {
                                        try {
                                            int size = list.size();
                                            for (int i9 = i6; i9 < size; i9++) {
                                                n5.a((C0639x) list.get(i9));
                                            }
                                            int size2 = list.size();
                                            for (int i10 = i6; i10 < size2; i10++) {
                                                ((C0639x) list.get(i10)).d();
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                c0642y0.J(th, null);
                                                C0640x0.t(c0642y0, list, list2, list, n5, n5, n3, n5);
                                                list.clear();
                                                return X3.y.a;
                                            } finally {
                                            }
                                        }
                                    }
                                    if (n5.h()) {
                                        try {
                                            n5.k(n5);
                                            Object[] objArr2 = n5.f12490b;
                                            j3 = 128;
                                            long[] jArr = n5.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i11 = 0;
                                                while (true) {
                                                    long j6 = jArr[i11];
                                                    Object[] objArr3 = objArr2;
                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                                                        for (int i13 = 0; i13 < i12; i13++) {
                                                            if ((j6 & 255) < 128) {
                                                                ((C0639x) objArr3[(i11 << 3) + i13]).f();
                                                            }
                                                            j6 >>= 8;
                                                        }
                                                        if (i12 != 8) {
                                                        }
                                                    }
                                                    int i14 = i11;
                                                    if (i14 != length) {
                                                        i11 = i14 + 1;
                                                        objArr2 = objArr3;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                c0642y0.J(th2, null);
                                                C0640x0.t(c0642y0, list, list2, list, n5, n5, n3, n5);
                                                AbstractC0983f.q(j5);
                                                return X3.y.a;
                                            } finally {
                                            }
                                        }
                                    } else {
                                        j3 = 128;
                                    }
                                    if (n5.h()) {
                                        try {
                                            Object[] objArr4 = n5.f12490b;
                                            long[] jArr2 = n5.a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i15 = 0;
                                                while (true) {
                                                    long j7 = jArr2[i15];
                                                    Object[] objArr5 = objArr4;
                                                    long[] jArr3 = jArr2;
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                        for (int i17 = 0; i17 < i16; i17++) {
                                                            if ((j7 & 255) < j3) {
                                                                ((C0639x) objArr5[(i15 << 3) + i17]).g();
                                                            }
                                                            j7 >>= 8;
                                                        }
                                                        if (i16 != 8) {
                                                        }
                                                    }
                                                    if (i15 != length2) {
                                                        i15++;
                                                        objArr4 = objArr5;
                                                        jArr2 = jArr3;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                c0642y0.J(th3, null);
                                                C0640x0.t(c0642y0, list, list2, list, n5, n5, n3, n5);
                                                n5.b();
                                                AbstractC0983f.q(j5);
                                                return X3.y.a;
                                            } finally {
                                            }
                                        }
                                    }
                                    c0977g.c();
                                    synchronized (c0642y0.f8272c) {
                                        c0642y0.y();
                                    }
                                    AbstractC0992o.j().m();
                                    n5.b();
                                    n3.b();
                                    c0642y0.f8286q = null;
                                    return X3.y.a;
                                } finally {
                                    AbstractC0983f.q(j5);
                                }
                            } finally {
                                c0977g.c();
                            }
                        }
                        try {
                            int size3 = list.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                C0639x c0639x = (C0639x) list.get(i18);
                                C0639x I5 = c0642y0.I(c0639x, n3);
                                if (I5 != null) {
                                    list.add(I5);
                                }
                                n5.a(c0639x);
                            }
                            list.clear();
                            if (n3.h() || c0642y0.f8278i.f8761f != 0) {
                                synchronized (c0642y0.f8272c) {
                                    try {
                                        List D4 = c0642y0.D();
                                        int size4 = D4.size();
                                        for (int i19 = 0; i19 < size4; i19++) {
                                            C0639x c0639x2 = (C0639x) D4.get(i19);
                                            if (!n5.c(c0639x2) && c0639x2.w(set)) {
                                                list.add(c0639x2);
                                            }
                                        }
                                        V.e eVar2 = c0642y0.f8278i;
                                        int i20 = eVar2.f8761f;
                                        int i21 = 0;
                                        for (int i22 = 0; i22 < i20; i22++) {
                                            C0639x c0639x3 = (C0639x) eVar2.f8759c[i22];
                                            if (!n5.c(c0639x3) && !list.contains(c0639x3)) {
                                                list.add(c0639x3);
                                                i21++;
                                            } else if (i21 > 0) {
                                                Object[] objArr6 = eVar2.f8759c;
                                                objArr6[i22 - i21] = objArr6[i22];
                                            }
                                        }
                                        int i23 = i20 - i21;
                                        Arrays.fill(eVar2.f8759c, i23, i20, (Object) null);
                                        eVar2.f8761f = i23;
                                    } finally {
                                    }
                                }
                            }
                            if (list.isEmpty()) {
                                try {
                                    C0640x0.u(list2, c0642y0);
                                    while (!list2.isEmpty()) {
                                        List H3 = c0642y0.H(list2, n3);
                                        n5.getClass();
                                        Iterator it = H3.iterator();
                                        while (it.hasNext()) {
                                            n5.j(it.next());
                                        }
                                        C0640x0.u(list2, c0642y0);
                                    }
                                } catch (Throwable th4) {
                                    c0642y0.J(th4, null);
                                    C0640x0.t(c0642y0, list, list2, list, n5, n5, n3, n5);
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                c0642y0.J(th5, null);
                                C0640x0.t(c0642y0, list, list2, list, n5, n5, n3, n5);
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
                break;
            default:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f8225e;
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) this.f8226f;
                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) this.f8227g;
                InterfaceC1193a interfaceC1193a4 = (InterfaceC1193a) this.f8228h;
                String str = (String) this.f8229i;
                String str2 = (String) this.f8230j;
                X x5 = (X) this.f8231k;
                X x6 = (X) this.f8232l;
                InterfaceC1193a interfaceC1193a5 = (InterfaceC1193a) this.f8233m;
                C1856g c1856g = (C1856g) obj;
                AbstractC1276k.f(c1856g, "$this$LazyColumn");
                C1856g.n(c1856g, null, AbstractC0783w.f10432m0, 3);
                C1856g.n(c1856g, null, new C0873f(new D.I0(interfaceC1193a, interfaceC1193a2, interfaceC1193a3, interfaceC1193a4, 2), true, -94556362), 3);
                C1856g.n(c1856g, null, AbstractC0783w.f10434n0, 3);
                C1856g.n(c1856g, null, new C0873f(new D.I0(str, str2, x5, x6, 3), true, 2101666932), 3);
                C1856g.n(c1856g, null, AbstractC0783w.f10436o0, 3);
                C1856g.n(c1856g, null, new C0873f(new P2.E0(3, interfaceC1193a5), true, 2922930), 3);
                return X3.y.a;
        }
    }

    public /* synthetic */ C0638w0(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, InterfaceC1193a interfaceC1193a3, InterfaceC1193a interfaceC1193a4, String str, String str2, X x5, X x6, InterfaceC1193a interfaceC1193a5) {
        this.f8225e = interfaceC1193a;
        this.f8226f = interfaceC1193a2;
        this.f8227g = interfaceC1193a3;
        this.f8228h = interfaceC1193a4;
        this.f8229i = str;
        this.f8230j = str2;
        this.f8231k = x5;
        this.f8232l = x6;
        this.f8233m = interfaceC1193a5;
    }
}
