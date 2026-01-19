package B4;

import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;
import z4.InterfaceC2061l;

/* loaded from: classes.dex */
public final class s extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2061l f623h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f624i;

    /* renamed from: j, reason: collision with root package name */
    public int f625j;

    /* renamed from: k, reason: collision with root package name */
    public int f626k;

    /* renamed from: l, reason: collision with root package name */
    public int f627l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f628m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h[] f629n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d4.i f630o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0008i f631p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c, l4.f fVar, InterfaceC0007h[] interfaceC0007hArr) {
        super(2, interfaceC0905c);
        this.f629n = interfaceC0007hArr;
        this.f630o = (d4.i) fVar;
        this.f631p = interfaceC0008i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((s) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l4.f, d4.i] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        s sVar = new s(this.f631p, interfaceC0905c, this.f630o, this.f629n);
        sVar.f628m = obj;
        return sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        if (r10 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        r11 = r10.a;
        r12 = r9[r11];
        r9[r11] = r10.f9815b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        if (r12 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r7[r11] == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r7[r11] = (byte) r2;
        r10 = (Y3.y) z4.C2064o.a(r8.i());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        if (r10 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        r17.f628m = r9;
        r17.f623h = r8;
        r17.f624i = r7;
        r17.f625j = r3;
        r17.f626k = r2;
        r17.f627l = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (r17.f630o.d(r17.f631p, r9, r17) != r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        return r6;
     */
    /* JADX WARN: Type inference failed for: r10v11, types: [l4.f, d4.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d1 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.s.r(java.lang.Object):java.lang.Object");
    }
}
