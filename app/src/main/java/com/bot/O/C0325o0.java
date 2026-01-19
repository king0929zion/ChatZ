package O;

import Q.s3;
import Y2.C0720i;
import b4.InterfaceC0905c;

/* renamed from: O.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325o0 extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4167h;

    /* renamed from: i, reason: collision with root package name */
    public int f4168i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4169j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0325o0(Object obj, InterfaceC0905c interfaceC0905c, int i6) {
        super(1, interfaceC0905c);
        this.f4167h = i6;
        this.f4169j = obj;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
        switch (this.f4167h) {
            case 0:
                return new C0325o0((C0332s0) this.f4169j, interfaceC0905c, 0).r(X3.y.a);
            case 1:
                return new C0325o0((N0) this.f4169j, interfaceC0905c, 1).r(X3.y.a);
            case 2:
                return new C0325o0((s3) this.f4169j, interfaceC0905c, 2).r(X3.y.a);
            case 3:
                return new C0325o0((C0720i) this.f4169j, interfaceC0905c, 3).r(X3.y.a);
            default:
                return new C0325o0((io.ktor.utils.io.jvm.javaio.b) this.f4169j, interfaceC0905c, 4).r(X3.y.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r9 == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r0.g(r8) == r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
    
        if (r9 == r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f7, code lost:
    
        if (r0.s(r8) == r5) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [c4.a] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0325o0.r(java.lang.Object):java.lang.Object");
    }
}
