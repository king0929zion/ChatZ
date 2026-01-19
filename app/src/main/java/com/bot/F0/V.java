package F0;

import e1.AbstractC0960b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface V {
    default int a(r rVar, List list, int i6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new C0122j((U) list.get(i7), EnumC0130s.f1520e, EnumC0131t.f1528e, 0));
        }
        return e(new C0133v(rVar, rVar.getLayoutDirection()), arrayList, AbstractC0960b.b(i6, 0, 13)).d();
    }

    default int d(r rVar, List list, int i6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new C0122j((U) list.get(i7), EnumC0130s.f1519c, EnumC0131t.f1528e, 0));
        }
        return e(new C0133v(rVar, rVar.getLayoutDirection()), arrayList, AbstractC0960b.b(i6, 0, 13)).d();
    }

    W e(X x5, List list, long j3);

    default int h(r rVar, List list, int i6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new C0122j((U) list.get(i7), EnumC0130s.f1519c, EnumC0131t.f1527c, 0));
        }
        return e(new C0133v(rVar, rVar.getLayoutDirection()), arrayList, AbstractC0960b.b(0, i6, 7)).e();
    }

    default int j(r rVar, List list, int i6) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new C0122j((U) list.get(i7), EnumC0130s.f1520e, EnumC0131t.f1527c, 0));
        }
        return e(new C0133v(rVar, rVar.getLayoutDirection()), arrayList, AbstractC0960b.b(0, i6, 7)).e();
    }
}
