package D;

import e1.AbstractC0960b;
import e1.C0959a;
import F0.U;
import F0.V;
import i1.C1084d;
import i1.C1105y;
import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1193a;
import n0.C1354c;

/* loaded from: classes.dex */
public final class k1 implements F0.V {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1055b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1056c;

    public /* synthetic */ k1(int i6, Object obj, Object obj2) {
        this.a = i6;
        this.f1055b = obj;
        this.f1056c = obj2;
    }

    @Override // F0.V
    public final F0.W e(F0.X x5, List list, long j3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list2;
        X3.i iVar;
        switch (this.a) {
            case 0:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj = list.get(i6);
                    if (!(((F0.U) obj).H() instanceof l1)) {
                        arrayList3.add(obj);
                    }
                }
                List list3 = (List) ((InterfaceC1193a) this.f1056c).b();
                if (list3 != null) {
                    ArrayList arrayList4 = new ArrayList(list3.size());
                    int size2 = list3.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        C1354c c1354c = (C1354c) list3.get(i7);
                        if (c1354c != null) {
                            float f6 = c1354c.f13295b;
                            float f7 = c1354c.a;
                            F0.U u5 = (F0.U) arrayList3.get(i7);
                            int floor = (int) Math.floor(c1354c.f13296c - f7);
                            float f8 = c1354c.f13297d - f6;
                            arrayList2 = arrayList3;
                            list2 = list3;
                            F0.k0 w5 = u5.w(AbstractC0960b.b(floor, (int) Math.floor(f8), 5));
                            int round = Math.round(f7);
                            iVar = new X3.i(w5, new e1.j((Math.round(f6) & 4294967295L) | (round << 32)));
                        } else {
                            arrayList2 = arrayList3;
                            list2 = list3;
                            iVar = null;
                        }
                        if (iVar != null) {
                            arrayList4.add(iVar);
                        }
                        i7++;
                        arrayList3 = arrayList2;
                        list3 = list2;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList5 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    Object obj2 = list.get(i8);
                    if (((F0.U) obj2).H() instanceof l1) {
                        arrayList5.add(obj2);
                    }
                }
                return x5.D(C0959a.h(j3), C0959a.g(j3), Y3.w.f9813c, new j1(arrayList, AbstractC0090r0.n(arrayList5, (InterfaceC1193a) this.f1055b), 0));
            default:
                ((C1105y) this.f1055b).setParentLayoutDirection((e1.m) this.f1056c);
                return x5.D(0, 0, Y3.w.f9813c, C1084d.f11975h);
        }
    }
}
