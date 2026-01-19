package A3;

import B3.o;
import M.q;
import X3.y;
import b4.InterfaceC0905c;
import r.C1604s0;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class e extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f121h;

    /* renamed from: i, reason: collision with root package name */
    public int f122i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f123j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f124k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i6, int i7, InterfaceC0905c interfaceC0905c) {
        super(i6, interfaceC0905c);
        this.f121h = i7;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f121h) {
            case 0:
                e eVar = new e((k) this.f124k, (InterfaceC0905c) obj3, 0);
                eVar.f123j = (Q3.f) obj;
                return eVar.r(y.a);
            case 1:
                e eVar2 = new e((o) this.f124k, (InterfaceC0905c) obj3, 1);
                eVar2.f123j = (Q3.f) obj;
                return eVar2.r(y.a);
            case 2:
                return new e((q) this.f123j, (C1604s0) this.f124k, (InterfaceC0905c) obj3).r(y.a);
            case 3:
                e eVar3 = new e((t3.d) this.f124k, (InterfaceC0905c) obj3, 3);
                eVar3.f123j = (Q3.f) obj;
                return eVar3.r(y.a);
            case 4:
                e eVar4 = new e(3, 4, (InterfaceC0905c) obj3);
                eVar4.f123j = (Q3.f) obj;
                eVar4.f124k = (F3.c) obj2;
                return eVar4.r(y.a);
            case AbstractC1787b.f15290g /* 5 */:
                e eVar5 = new e(3, 5, (InterfaceC0905c) obj3);
                eVar5.f123j = (Q3.f) obj;
                eVar5.f124k = (F3.d) obj2;
                return eVar5.r(y.a);
            default:
                e eVar6 = new e((t3.d) this.f124k, (InterfaceC0905c) obj3, 6);
                eVar6.f123j = (Q3.f) obj;
                return eVar6.r(y.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c8, code lost:
    
        if (r11 == r5) goto L145;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0270  */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Q3.f] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r1v22, types: [x4.l0, x4.g0, java.lang.Object, x4.t0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, Q3.f] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.e.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, C1604s0 c1604s0, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f121h = 2;
        this.f123j = qVar;
        this.f124k = c1604s0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, InterfaceC0905c interfaceC0905c, int i6) {
        super(3, interfaceC0905c);
        this.f121h = i6;
        this.f124k = obj;
    }
}
