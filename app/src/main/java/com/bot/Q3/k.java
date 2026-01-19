package Q3;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k implements InterfaceC0905c, d4.d {

    /* renamed from: c, reason: collision with root package name */
    public int f6470c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f6471e;

    public k(l lVar) {
        this.f6471e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
            @Override // d4.d
    public final d4.d g() {
        j jVar = j.f6469c;
        int i6 = this.f6470c;
        l lVar = this.f6471e;
        if (i6 == Integer.MIN_VALUE) {
            this.f6470c = lVar.f6476i;
        }
        int i7 = this.f6470c;
        if (i7 < 0) {
            this.f6470c = Integer.MIN_VALUE;
            jVar = null;
        } else {
            try {
                Object r22 = lVar.f6475h[i7];
                if (r22 != 0) {
                    this.f6470c = i7 - 1;
                    jVar = r22;
                }
            } catch (Throwable unused) {
            }
        }
        if (jVar instanceof d4.d) {
            return jVar;
        }
        return null;
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        boolean z5 = obj instanceof X3.k;
        l lVar = this.f6471e;
        if (!z5) {
            lVar.f(false);
            return;
        }
        Throwable a = X3.l.a(obj);
        AbstractC1276k.c(a);
        lVar.g(X3.a.b(a));
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        l lVar = this.f6471e;
        InterfaceC0905c[] interfaceC0905cArr = lVar.f6475h;
        int i6 = lVar.f6476i;
        InterfaceC0905c interfaceC0905c = interfaceC0905cArr[i6];
        if (interfaceC0905c != this && interfaceC0905c != null) {
            return interfaceC0905c.o();
        }
        int i7 = i6 - 1;
        while (i7 >= 0) {
            int i8 = i7 - 1;
            InterfaceC0905c interfaceC0905c2 = interfaceC0905cArr[i7];
            if (interfaceC0905c2 != this && interfaceC0905c2 != null) {
                return interfaceC0905c2.o();
            }
            i7 = i8;
        }
        throw new IllegalStateException("Not started");
    }
}
