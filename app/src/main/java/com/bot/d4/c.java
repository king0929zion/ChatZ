package d4;

import b4.C0906d;
import b4.InterfaceC0905c;
import b4.InterfaceC0908f;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;
import x4.C1928k;

/* loaded from: classes.dex */
public abstract class c implements a,   {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0910h f11435e;

    /* renamed from: f, reason: collision with root package name */
    public transient InterfaceC0905c f11436f;

    public c(InterfaceC0905c interfaceC0905c, InterfaceC0910h interfaceC0910h) {
        super(interfaceC0905c);
        this.f11435e = interfaceC0910h;
    }

    @Override // b4.InterfaceC0905c
    public InterfaceC0910h o() {
        InterfaceC0910h interfaceC0910h = this.f11435e;
        AbstractC1276k.c(interfaceC0910h);
        return interfaceC0910h;
    }

    @Override // d4.a
    public void s() {
        InterfaceC0905c interfaceC0905c = this.f11436f;
        if (interfaceC0905c != null && interfaceC0905c != this) {
            InterfaceC0908f r5 = o().r(C0906d.f11056c);
            AbstractC1276k.c(r5);
            C4.f fVar = (C4.f) interfaceC0905c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4.f.f688k;
            do {
            } while (atomicReferenceFieldUpdater.get(fVar) == C4.a.f679c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C1928k c1928k = obj instanceof C1928k ? (C1928k) obj : null;
            if (c1928k != null) {
                c1928k.p();
            }
        }
        this.f11436f = b.f11434c;
    }

    public c(InterfaceC0905c interfaceC0905c) {
        this(interfaceC0905c, interfaceC0905c != null ? interfaceC0905c.o() : null);
    }
}
