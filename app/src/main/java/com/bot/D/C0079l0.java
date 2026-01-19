package D;

import Q.AbstractC0426j;
import b0.C0875h;
import com.bot.core.database.dao.ConversationDao_Impl;
import com.vladsch.flexmark.util.format.TableCell;
import f0.InterfaceC0972B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1276k;
import v.AbstractC1787b;
import v.AbstractC1799h;

/* renamed from: D.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0079l0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1057c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1061h;

    public /* synthetic */ C0079l0(Serializable serializable, Object obj, int i6, Serializable serializable2, int i7) {
        this.f1057c = i7;
        this.f1060g = serializable;
        this.f1058e = obj;
        this.f1059f = i6;
        this.f1061h = serializable2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1057c) {
            case 0:
                C0081m0 c0081m0 = (C0081m0) this.f1060g;
                F0.X x5 = (F0.X) this.f1058e;
                F0.k0 k0Var = (F0.k0) this.f1061h;
                F0.j0 j0Var = (F0.j0) obj;
                int i6 = c0081m0.f1063b;
                Z0 z02 = c0081m0.a;
                X0.B b5 = c0081m0.f1064c;
                d1 d1Var = (d1) c0081m0.f1065d.b();
                z02.a(r.X0.f14184e, AbstractC0090r0.l(j0Var, i6, b5, d1Var != null ? d1Var.a : null, x5.getLayoutDirection() == e1.m.f11577e, k0Var.f1485c), this.f1059f, k0Var.f1485c);
                F0.j0.l(j0Var, k0Var, Math.round(-z02.a.g()), 0);
                return X3.y.a;
            case 1:
                ArrayList arrayList = (ArrayList) this.f1060g;
                F0.X x6 = (F0.X) this.f1058e;
                float f6 = AbstractC0426j.f5893c;
                ArrayList arrayList2 = (ArrayList) this.f1061h;
                F0.j0 j0Var2 = (F0.j0) obj;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    List list = (List) arrayList.get(i7);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i8 = 0;
                    while (i8 < size2) {
                        iArr[i8] = ((F0.k0) list.get(i8)).f1485c + (i8 < Y4.l.C(list) ? x6.l0(f6) : 0);
                        i8++;
                    }
                    int[] iArr2 = new int[size2];
                    AbstractC1799h.f15304b.c(x6, this.f1059f, iArr, x6.getLayoutDirection(), iArr2);
                    int size3 = list.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        F0.j0.j(j0Var2, (F0.k0) list.get(i9), iArr2[i9], ((Number) arrayList2.get(i7)).intValue());
                    }
                }
                return X3.y.a;
            case 2:
                T.E e6 = (T.E) this.f1060g;
                C0875h c0875h = (C0875h) this.f1058e;
                k.H h3 = (k.H) this.f1061h;
                if (obj == e6) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof InterfaceC0972B) {
                    int i10 = c0875h.a - this.f1059f;
                    int d6 = h3.d(obj);
                    h3.g(Math.min(i10, d6 >= 0 ? h3.f12462c[d6] : TableCell.NOT_TRACKED), obj);
                }
                return X3.y.a;
            case 3:
                F0.k0[] k0VarArr = (F0.k0[]) this.f1060g;
                v.p0 p0Var = (v.p0) this.f1058e;
                int[] iArr3 = (int[]) this.f1061h;
                F0.j0 j0Var3 = (F0.j0) obj;
                int length = k0VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    F0.k0 k0Var2 = k0VarArr[i11];
                    int i13 = i12 + 1;
                    AbstractC1276k.c(k0Var2);
                    Object H3 = k0Var2.H();
                    v.n0 n0Var = H3 instanceof v.n0 ? (v.n0) H3 : null;
                    AbstractC1787b abstractC1787b = n0Var != null ? n0Var.f15332c : null;
                    int i14 = this.f1059f;
                    F0.j0.j(j0Var3, k0Var2, iArr3[i12], abstractC1787b != null ? abstractC1787b.i(i14, e1.m.f11576c, k0Var2) : p0Var.f15335b.a(k0Var2.f1486e, i14));
                    i11++;
                    i12 = i13;
                }
                return X3.y.a;
            default:
                return ConversationDao_Impl.c((String) this.f1060g, (String) this.f1058e, this.f1059f, (String) this.f1061h, (X1.a) obj);
        }
    }

    public /* synthetic */ C0079l0(Object obj, Object obj2, Object obj3, int i6, int i7) {
        this.f1057c = i7;
        this.f1060g = obj;
        this.f1058e = obj2;
        this.f1061h = obj3;
        this.f1059f = i6;
    }

    public /* synthetic */ C0079l0(ArrayList arrayList, F0.X x5, int i6, ArrayList arrayList2) {
        this.f1057c = 1;
        float f6 = AbstractC0426j.a;
        this.f1060g = arrayList;
        this.f1058e = x5;
        this.f1059f = i6;
        this.f1061h = arrayList2;
    }
}
