package D;

import O.AbstractC0336u0;
import O.InterfaceC0331s;
import Q.I2;
import Q.R1;
import Q.s3;
import R.AbstractC0507l;
import T.AbstractC0623o0;
import T.C0626q;
import android.view.View;
import b0.C0873f;
import e1.InterfaceC0961c;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import q.AbstractC1494f;
import q.C1491c;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.C1810p;
import y.AbstractC1975o;
import y.InterfaceC1957N;

/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1009c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1012g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1013h;

    public /* synthetic */ e1(s3 s3Var, T.X x5, C0873f c0873f, int i6) {
        this.f1009c = 6;
        this.f1011f = s3Var;
        this.f1012g = x5;
        this.f1013h = c0873f;
        this.f1010e = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f1009c;
        int i7 = this.f1010e;
        Object obj3 = this.f1013h;
        Object obj4 = this.f1012g;
        X3.y yVar = X3.y.a;
        Object obj5 = this.f1011f;
        switch (i6) {
            case 0:
                ((Integer) obj2).intValue();
                ((i1) obj5).b((Object[]) obj4, (l4.c) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 1:
                ((Integer) obj2).intValue();
                I.p.c((G.g) obj5, (K.e) obj4, (InterfaceC1193a) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                Y4.l.j((InterfaceC1041r) obj5, (AbstractC0623o0) obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0336u0.a((InterfaceC0331s) obj5, (InterfaceC1028e) obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 4:
                ((Integer) obj2).intValue();
                R1.m((View) obj5, (InterfaceC0961c) obj4, (InterfaceC1193a) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).getClass();
                R1.d((I2) obj5, (InterfaceC1041r) obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC0507l.f((s3) obj5, (T.X) obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 7:
                ((Integer) obj2).intValue();
                ((C0873f) obj5).h(obj4, obj3, (C0626q) obj, T.r.J(i7) | 1);
                return yVar;
            case 8:
                ((Integer) obj2).getClass();
                ((e0.d) obj5).f(obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case AbstractC1787b.f15287d /* 9 */:
                ((Integer) obj2).getClass();
                AbstractC1494f.b((InterfaceC1041r) obj5, (C1491c) obj4, (l4.c) obj3, (C0626q) obj, T.r.J(1), this.f1010e);
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                ((Integer) obj2).getClass();
                AbstractC1494f.a((C1491c) obj5, (InterfaceC1041r) obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 11:
                C1810p c1810p = AbstractC1799h.a;
                C1810p c1810p2 = AbstractC1799h.a;
                ((Integer) obj2).getClass();
                AbstractC1787b.c((InterfaceC1041r) obj5, (C1810p) obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
            case 12:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(1);
                AbstractC1975o.d((InterfaceC1957N) obj5, this.f1012g, this.f1010e, this.f1013h, (C0626q) obj, J4);
                return yVar;
            default:
                ((Integer) obj2).getClass();
                ((y.o0) obj5).f(obj4, (C0873f) obj3, (C0626q) obj, T.r.J(i7 | 1));
                return yVar;
        }
    }

    public /* synthetic */ e1(InterfaceC1041r interfaceC1041r, C1491c c1491c, l4.c cVar, int i6, int i7) {
        this.f1009c = 9;
        this.f1011f = interfaceC1041r;
        this.f1012g = c1491c;
        this.f1013h = cVar;
        this.f1010e = i7;
    }

    public /* synthetic */ e1(InterfaceC1041r interfaceC1041r, C1810p c1810p, C0873f c0873f, int i6) {
        this.f1009c = 11;
        C1810p c1810p2 = AbstractC1799h.a;
        C1810p c1810p3 = AbstractC1799h.a;
        this.f1011f = interfaceC1041r;
        this.f1012g = c1810p;
        this.f1013h = c0873f;
        this.f1010e = i6;
    }

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, int i6, int i7) {
        this.f1009c = i7;
        this.f1011f = obj;
        this.f1012g = obj2;
        this.f1013h = obj3;
        this.f1010e = i6;
    }

    public /* synthetic */ e1(InterfaceC1957N interfaceC1957N, Object obj, int i6, Object obj2, int i7) {
        this.f1009c = 12;
        this.f1011f = interfaceC1957N;
        this.f1012g = obj;
        this.f1010e = i6;
        this.f1013h = obj2;
    }
}
