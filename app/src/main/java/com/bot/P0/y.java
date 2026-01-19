package P0;

import B0.G;
import I2.C;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k.C1147A;

/* loaded from: classes.dex */
public abstract class y {
    public static final Comparator[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f4551b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i6 = 0;
        while (i6 < 2) {
            comparatorArr[i6] = new C(new C(i6 == 0 ? g.f4436c : g.f4435b), 4);
            i6++;
        }
        a = comparatorArr;
        f4551b = k.f4462z;
    }

    public static final void a(p pVar, ArrayList arrayList, G g3, G g6, C1147A c1147a) {
        m mVar = pVar.f4499d;
        Object g7 = mVar.f4492c.g(t.f4534m);
        if (g7 == null) {
            g7 = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g7).booleanValue();
        if ((booleanValue || ((Boolean) g6.f(pVar)).booleanValue()) && ((Boolean) g3.f(pVar)).booleanValue()) {
            arrayList.add(pVar);
        }
        if (booleanValue) {
            c1147a.i(pVar.f4502g, b(pVar, g3, g6, p.j(7, pVar)));
            return;
        }
        List j3 = p.j(7, pVar);
        int size = j3.size();
        for (int i6 = 0; i6 < size; i6++) {
            a((p) j3.get(i6), arrayList, g3, g6, c1147a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[LOOP:1: B:11:0x0044->B:29:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee A[EDGE_INSN: B:30:0x00ee->B:31:0x00ee BREAK  A[LOOP:1: B:11:0x0044->B:29:0x00e8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(P0.p r17, B0.G r18, B0.G r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.y.b(P0.p, B0.G, B0.G, java.util.List):java.util.ArrayList");
    }
}
