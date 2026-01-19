package y;

import e1.C0959a;
import java.util.Arrays;
import java.util.List;
import m4.AbstractC1276k;
import x4.InterfaceC1942y;

/* renamed from: y.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1952I {

    /* renamed from: b, reason: collision with root package name */
    public C0959a f15775b;

    /* renamed from: c, reason: collision with root package name */
    public int f15776c;

    /* renamed from: d, reason: collision with root package name */
    public int f15777d;

    /* renamed from: f, reason: collision with root package name */
    public int f15779f;

    /* renamed from: g, reason: collision with root package name */
    public int f15780g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1954K f15781h;
    public C1948E[] a = AbstractC1975o.a;

    /* renamed from: e, reason: collision with root package name */
    public int f15778e = 1;

    public C1952I(C1954K c1954k) {
        this.f15781h = c1954k;
    }

    public static void b(C1952I c1952i, x.m mVar, InterfaceC1942y interfaceC1942y, o0.w wVar, int i6, int i7) {
        c1952i.f15781h.getClass();
        long b5 = mVar.b(0);
        c1952i.a(mVar, interfaceC1942y, wVar, i6, i7, (int) (!mVar.f15509c ? b5 & 4294967295L : b5 >> 32));
    }

    public final void a(x.m mVar, InterfaceC1942y interfaceC1942y, o0.w wVar, int i6, int i7, int i8) {
        C1948E[] c1948eArr = this.a;
        int length = c1948eArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                this.f15779f = i6;
                this.f15780g = i7;
                break;
            } else {
                C1948E c1948e = c1948eArr[i9];
                if (c1948e != null && c1948e.f15762g) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        List list = mVar.f15508b;
        int length2 = this.a.length;
        for (int size = list.size(); size < length2; size++) {
            C1948E c1948e2 = this.a[size];
            if (c1948e2 != null) {
                c1948e2.c();
            }
        }
        if (this.a.length != list.size()) {
            Object[] copyOf = Arrays.copyOf(this.a, list.size());
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.a = (C1948E[]) copyOf;
        }
        this.f15775b = new C0959a(mVar.f15520n);
        this.f15776c = i8;
        this.f15777d = 0;
        this.f15778e = 1;
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Object H3 = ((F0.k0) list.get(i10)).H();
            C1972l c1972l = H3 instanceof C1972l ? (C1972l) H3 : null;
            if (c1972l == null) {
                C1948E c1948e3 = this.a[i10];
                if (c1948e3 != null) {
                    c1948e3.c();
                }
                this.a[i10] = null;
            } else {
                C1948E c1948e4 = this.a[i10];
                if (c1948e4 == null) {
                    c1948e4 = new C1948E(interfaceC1942y, wVar, new Y3.l(this.f15781h, 20));
                    this.a[i10] = c1948e4;
                }
                c1948e4.f15759d = c1972l.f15887r;
                c1948e4.f15760e = c1972l.f15888s;
                c1948e4.f15761f = c1972l.f15889t;
            }
        }
    }
}
