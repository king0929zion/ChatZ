package z;

import T.C0607g0;
import Z2.C0789z;
import l4.InterfaceC1193a;
import p.O0;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2004b extends E {

    /* renamed from: J, reason: collision with root package name */
    public static final e0.k f16081J = e0.l.b(new C0789z(25), new O0(16));

    /* renamed from: I, reason: collision with root package name */
    public final C0607g0 f16082I;

    public C2004b(int i6, float f6, InterfaceC1193a interfaceC1193a) {
        super(f6, i6);
        this.f16082I = T.r.A(interfaceC1193a);
    }

    @Override // z.E
    public final int m() {
        return ((Number) ((InterfaceC1193a) this.f16082I.getValue()).b()).intValue();
    }
}
