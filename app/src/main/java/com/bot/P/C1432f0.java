package p;

import e1.InterfaceC0961c;
import n0.C1354c;
import o0.C1384F;

/* renamed from: p.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432f0 implements o0.L {

    /* renamed from: b, reason: collision with root package name */
    public static final C1432f0 f13707b = new C1432f0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1432f0 f13708c = new C1432f0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C1432f0(int i6) {
        this.a = i6;
    }

    @Override // o0.L
    public final o0.y a(long j3, e1.m mVar, InterfaceC0961c interfaceC0961c) {
        switch (this.a) {
            case 0:
                float l02 = interfaceC0961c.l0(L.a);
                return new C1384F(new C1354c(S.l.f7374V, -l02, Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) + l02));
            default:
                float l03 = interfaceC0961c.l0(L.a);
                return new C1384F(new C1354c(-l03, S.l.f7374V, Float.intBitsToFloat((int) (j3 >> 32)) + l03, Float.intBitsToFloat((int) (j3 & 4294967295L))));
        }
    }
}
