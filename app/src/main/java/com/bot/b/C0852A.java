package b;

import m4.AbstractC1276k;

/* renamed from: b.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852A implements InterfaceC0859c {

    /* renamed from: c, reason: collision with root package name */
    public final u f10897c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0853B f10898e;

    public C0852A(C0853B c0853b, u uVar) {
        AbstractC1276k.f(uVar, "onBackPressedCallback");
        this.f10898e = c0853b;
        this.f10897c = uVar;
    }

        @Override // b.InterfaceC0859c
    public final void cancel() {
        C0853B c0853b = this.f10898e;
        Y3.j jVar = c0853b.f10899b;
        u uVar = this.f10897c;
        jVar.remove(uVar);
        if (AbstractC1276k.b(c0853b.f10900c, uVar)) {
            uVar.a();
            c0853b.f10900c = null;
        }
        uVar.f10956b.remove(this);
        Object r02 = uVar.f10957c;
        if (r02 != 0) {
            r02.b();
        }
        uVar.f10957c = null;
    }
}
