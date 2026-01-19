package t1;

import i4.AbstractC1120d;

/* renamed from: t1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1693E {
    public final P a;

    /* renamed from: b, reason: collision with root package name */
    public o1.c[] f14843b;

    public AbstractC1693E() {
        this(new P((P) null));
    }

    public final void a() {
        o1.c[] cVarArr = this.f14843b;
        if (cVarArr != null) {
            o1.c cVar = cVarArr[0];
            o1.c cVar2 = cVarArr[1];
            P p5 = this.a;
            if (cVar2 == null) {
                cVar2 = p5.a.g(2);
            }
            if (cVar == null) {
                cVar = p5.a.g(1);
            }
            g(o1.c.a(cVar, cVar2));
            o1.c cVar3 = this.f14843b[AbstractC1120d.q(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            o1.c cVar4 = this.f14843b[AbstractC1120d.q(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            o1.c cVar5 = this.f14843b[AbstractC1120d.q(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract P b();

    public void c(int i6, o1.c cVar) {
        if (this.f14843b == null) {
            this.f14843b = new o1.c[10];
        }
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i6 & i7) != 0) {
                this.f14843b[AbstractC1120d.q(i7)] = cVar;
            }
        }
    }

    public void d(o1.c cVar) {
    }

    public abstract void e(o1.c cVar);

    public void f(o1.c cVar) {
    }

    public abstract void g(o1.c cVar);

    public void h(o1.c cVar) {
    }

    public AbstractC1693E(P p5) {
        this.a = p5;
    }
}
