package f0;

import T.C0624p;
import java.util.HashMap;
import k.H;
import k.M;
import k.N;

/* renamed from: f0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000w {
    public final l4.c a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11726b;

    /* renamed from: c, reason: collision with root package name */
    public H f11727c;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11734j;

    /* renamed from: k, reason: collision with root package name */
    public int f11735k;

    /* renamed from: d, reason: collision with root package name */
    public int f11728d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final M f11729e = Y4.l.t();

    /* renamed from: f, reason: collision with root package name */
    public final M f11730f = new M();

    /* renamed from: g, reason: collision with root package name */
    public final N f11731g = new N();

    /* renamed from: h, reason: collision with root package name */
    public final V.e f11732h = new V.e(new T.E[16]);

    /* renamed from: i, reason: collision with root package name */
    public final C0624p f11733i = new C0624p(this, 1);

    /* renamed from: l, reason: collision with root package name */
    public final M f11736l = Y4.l.t();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f11737m = new HashMap();

    public C1000w(l4.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (((f0.AbstractC0973C) r11).e(2) == false) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x052b  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C1000w.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i6, Object obj2, H h3) {
        int i7;
        if (this.f11735k > 0) {
            return;
        }
        int c6 = h3.c(obj);
        if (c6 < 0) {
            c6 = ~c6;
            i7 = -1;
        } else {
            i7 = h3.f12462c[c6];
        }
        h3.f12461b[c6] = obj;
        h3.f12462c[c6] = i6;
        if ((obj instanceof T.E) && i7 != i6) {
            T.D h6 = ((T.E) obj).h();
            this.f11737m.put(obj, h6.f7940f);
            H h7 = h6.f7939e;
            M m3 = this.f11736l;
            Y4.l.R(m3, obj);
            Object[] objArr = h7.f12461b;
            long[] jArr = h7.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr[i8];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j3 & 255) < 128) {
                                InterfaceC0972B interfaceC0972B = (InterfaceC0972B) objArr[(i8 << 3) + i10];
                                if (interfaceC0972B instanceof AbstractC0973C) {
                                    ((AbstractC0973C) interfaceC0972B).f(2);
                                }
                                Y4.l.l(m3, interfaceC0972B, obj);
                            }
                            j3 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        if (i7 == -1) {
            if (obj instanceof AbstractC0973C) {
                ((AbstractC0973C) obj).f(2);
            }
            Y4.l.l(this.f11729e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        M m3 = this.f11729e;
        Y4.l.Q(m3, obj2, obj);
        if (!(obj2 instanceof T.E) || m3.c(obj2)) {
            return;
        }
        Y4.l.R(this.f11736l, obj2);
        this.f11737m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C1000w.d():void");
    }
}
