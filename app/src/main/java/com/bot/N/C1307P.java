package n;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: n.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307P extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.a f13033h;

    /* renamed from: i, reason: collision with root package name */
    public Object f13034i;

    /* renamed from: j, reason: collision with root package name */
    public C1308Q f13035j;

    /* renamed from: k, reason: collision with root package name */
    public int f13036k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13037l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1308Q f13038m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d4.i f13039n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1307P(C1308Q c1308q, l4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13038m = c1308q;
        this.f13039n = (d4.i) cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1307P) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d4.i, l4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1307P c1307p = new C1307P(this.f13038m, this.f13039n, interfaceC0905c);
        c1307p.f13037l = obj;
        return c1307p;
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
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1307P.r(java.lang.Object):java.lang.Object");
    }
}
