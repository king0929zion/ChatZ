package O;

import H0.C0158m;
import Q.C0405d2;
import Q.EnumC0409e2;
import f0.C0987j;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1193a;
import o0.C1395f;
import o0.C1400k;
import q0.C1496b;

/* renamed from: O.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0296a implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4067c = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4071h;

    public /* synthetic */ C0296a(T.X x5, ArrayList arrayList, List list, boolean z5) {
        this.f4069f = x5;
        this.f4070g = arrayList;
        this.f4071h = list;
        this.f4068e = z5;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f4067c) {
            case 0:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f4069f;
                C1395f c1395f = (C1395f) this.f4070g;
                C1400k c1400k = (C1400k) this.f4071h;
                H0.L l3 = (H0.L) obj;
                l3.b();
                C1496b c1496b = l3.f1765c;
                if (((Boolean) interfaceC1193a.b()).booleanValue()) {
                    if (this.f4068e) {
                        long o02 = c1496b.o0();
                        C0158m c0158m = c1496b.f13944e;
                        long j3 = c0158m.j();
                        c0158m.g().h();
                        try {
                            ((C0987j) c0158m.f1972e).D(-1.0f, 1.0f, o02);
                            c1496b.e(c1395f, c1400k);
                        } finally {
                            AbstractC1135a.q(c0158m, j3);
                        }
                    } else {
                        c1496b.e(c1395f, c1400k);
                    }
                }
                return X3.y.a;
            case 1:
                return new C0405d2(this.f4068e, (InterfaceC1193a) this.f4069f, (InterfaceC1193a) this.f4070g, (EnumC0409e2) obj, (l4.c) this.f4071h);
            default:
                T.X x5 = (T.X) this.f4069f;
                ArrayList arrayList = (ArrayList) this.f4070g;
                F0.j0 j0Var = (F0.j0) obj;
                j0Var.f1484c = true;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    boolean z5 = this.f4068e;
                    if (i6 >= size) {
                        ?? r12 = this.f4071h;
                        int size2 = r12.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            ((x.m) r12.get(i7)).c(j0Var, z5);
                        }
                        j0Var.f1484c = false;
                        x5.getValue();
                        return X3.y.a;
                    }
                    ((x.m) arrayList.get(i6)).c(j0Var, z5);
                    i6++;
                }
        }
    }

    public /* synthetic */ C0296a(InterfaceC1193a interfaceC1193a, boolean z5, C1395f c1395f, C1400k c1400k) {
        this.f4069f = interfaceC1193a;
        this.f4068e = z5;
        this.f4070g = c1395f;
        this.f4071h = c1400k;
    }

    public /* synthetic */ C0296a(boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, l4.c cVar) {
        this.f4068e = z5;
        this.f4069f = interfaceC1193a;
        this.f4070g = interfaceC1193a2;
        this.f4071h = cVar;
    }
}
