package A3;

import A4.InterfaceC0008i;
import B3.o;
import X2.F;
import X3.y;
import b4.InterfaceC0905c;
import r.C1586m0;
import r.C1588n;
import r.C1603s;
import v.AbstractC1787b;
import z3.S;
import z3.r;

/* loaded from: classes.dex */
public final class f extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f125h;

    /* renamed from: i, reason: collision with root package name */
    public int f126i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f127j;

    /* renamed from: k, reason: collision with root package name */
    public Object f128k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f129l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC0905c interfaceC0905c, F f6) {
        super(3, interfaceC0905c);
        this.f125h = 2;
        this.f129l = f6;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [d4.i, l4.e] */
    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f125h) {
            case 0:
                f fVar = new f((k) this.f129l, (InterfaceC0905c) obj3, 0);
                fVar.f128k = (Q3.f) obj;
                fVar.f127j = (F3.d) obj2;
                return fVar.r(y.a);
            case 1:
                f fVar2 = new f((l4.e) this.f129l, (InterfaceC0905c) obj3);
                fVar2.f128k = (InterfaceC0008i) obj;
                fVar2.f127j = obj2;
                return fVar2.r(y.a);
            case 2:
                f fVar3 = new f((InterfaceC0905c) obj3, (F) this.f129l);
                fVar3.f128k = (InterfaceC0008i) obj;
                fVar3.f127j = (Object[]) obj2;
                return fVar3.r(y.a);
            case 3:
                f fVar4 = new f((o) this.f129l, (InterfaceC0905c) obj3, 3);
                fVar4.f127j = (Q3.f) obj;
                return fVar4.r(y.a);
            case 4:
                f fVar5 = new f((C1586m0) this.f127j, (C1588n) this.f129l, (InterfaceC0905c) obj3);
                fVar5.f128k = (C1603s) obj;
                return fVar5.r(y.a);
            case AbstractC1787b.f15290g /* 5 */:
                f fVar6 = new f((t3.d) this.f129l, (InterfaceC0905c) obj3, 5);
                fVar6.f128k = (Q3.f) obj;
                fVar6.f127j = obj2;
                return fVar6.r(y.a);
            case 6:
                f fVar7 = new f((r) this.f129l, (InterfaceC0905c) obj3, 6);
                fVar7.f127j = (Q3.f) obj;
                fVar7.f128k = obj2;
                return fVar7.r(y.a);
            case 7:
                f fVar8 = new f((r) this.f129l, (InterfaceC0905c) obj3, 7);
                fVar8.f127j = (Q3.f) obj;
                fVar8.f128k = (F3.d) obj2;
                return fVar8.r(y.a);
            default:
                f fVar9 = new f((r) this.f129l, (InterfaceC0905c) obj3, 8);
                fVar9.f127j = (S) obj;
                fVar9.f128k = (E3.d) obj2;
                return fVar9.r(y.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0228, code lost:
    
        if (r0 == r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02dc, code lost:
    
        if (r1 == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x031a, code lost:
    
        if (r1 == r10) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0153, code lost:
    
        if (r2 == r10) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v27, types: [Q3.f] */
    /* JADX WARN: Type inference failed for: r1v29, types: [E3.d] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, Q3.f] */
    /* JADX WARN: Type inference failed for: r1v34, types: [Q3.f] */
    /* JADX WARN: Type inference failed for: r1v35, types: [Q3.f] */
    /* JADX WARN: Type inference failed for: r1v38, types: [E3.b] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, Q3.f] */
    /* JADX WARN: Type inference failed for: r1v43, types: [Q3.f] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [z3.r] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4, types: [d4.i, l4.e] */
    /* JADX WARN: Type inference failed for: r2v7, types: [B3.o] */
    /* JADX WARN: Type inference failed for: r2v8, types: [B3.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, Q3.f] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v7, types: [Q3.f] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x025e -> B:101:0x026f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0261 -> B:99:0x0263). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.f.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, InterfaceC0905c interfaceC0905c, int i6) {
        super(3, interfaceC0905c);
        this.f125h = i6;
        this.f129l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f125h = 1;
        this.f129l = (d4.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1586m0 c1586m0, C1588n c1588n, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f125h = 4;
        this.f127j = c1586m0;
        this.f129l = c1588n;
    }
}
