package R;

import b4.InterfaceC0905c;
import p.x0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class P extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.a f6716h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6717i;

    /* renamed from: j, reason: collision with root package name */
    public Q f6718j;

    /* renamed from: k, reason: collision with root package name */
    public int f6719k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0 f6721m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q f6722n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d4.i f6723o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(x0 x0Var, Q q3, l4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6721m = x0Var;
        this.f6722n = q3;
        this.f6723o = (d4.i) cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((P) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d4.i, l4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        P p5 = new P(this.f6721m, this.f6722n, this.f6723o, interfaceC0905c);
        p5.f6720l = obj;
        return p5;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // d4.a
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.P.r(java.lang.Object):java.lang.Object");
    }
}
