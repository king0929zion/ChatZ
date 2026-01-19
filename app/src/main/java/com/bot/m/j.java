package M;

import D.C0098v0;
import D.Q;
import D.b1;
import H0.A0;
import H0.AbstractC0156k;
import O.N0;
import S0.C0545g;
import S0.F;
import S0.O;
import X0.A;
import X0.B;
import X0.C0683a;
import android.view.autofill.AutofillValue;
import i0.C1066e;
import i0.C1067f;
import i0.C1073l;
import i0.C1074m;
import i0.InterfaceC1075n;

/* loaded from: classes.dex */
public final class j extends AbstractC0156k implements A0 {

    /* renamed from: A, reason: collision with root package name */
    public X0.k f3161A;

    /* renamed from: B, reason: collision with root package name */
    public m0.w f3162B;

    /* renamed from: t, reason: collision with root package name */
    public B f3163t;

    /* renamed from: u, reason: collision with root package name */
    public X0.v f3164u;

    /* renamed from: v, reason: collision with root package name */
    public C0098v0 f3165v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3166w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3167x;

    /* renamed from: y, reason: collision with root package name */
    public X0.p f3168y;

    /* renamed from: z, reason: collision with root package name */
    public N0 f3169z;

    /* JADX WARN: Multi-variable type inference failed */
    public static void P0(C0098v0 c0098v0, String str, boolean z5, boolean z6) {
        if (z5 || !z6) {
            return;
        }
        A a = c0098v0.f1186e;
        Q q3 = c0098v0.f1203v;
        if (a == null) {
            int length = str.length();
            q3.f(new X0.v(F.b(length, length), str, 4));
        } else {
            X0.v h3 = c0098v0.f1185d.h(Y4.l.I(new Object(), new C0683a(str, 1)));
            a.a(null, h3);
            q3.f(h3);
        }
    }

    @Override // H0.A0
    public final void I(P0.x xVar) {
        C0545g c0545g = this.f3164u.a;
        s4.e[] eVarArr = P0.v.a;
        P0.w wVar = P0.t.f4511E;
        s4.e[] eVarArr2 = P0.v.a;
        s4.e eVar = eVarArr2[18];
        xVar.a(wVar, c0545g);
        C0545g c0545g2 = this.f3163t.a;
        P0.w wVar2 = P0.t.f4512F;
        s4.e eVar2 = eVarArr2[19];
        xVar.a(wVar2, c0545g2);
        long j3 = this.f3164u.f9125b;
        P0.w wVar3 = P0.t.f4513G;
        s4.e eVar3 = eVarArr2[20];
        xVar.a(wVar3, new O(j3));
        P0.w wVar4 = P0.t.f4539r;
        s4.e eVar4 = eVarArr2[9];
        xVar.a(wVar4, C1073l.a);
        C1067f c1067f = new C1067f(AutofillValue.forText(this.f3164u.a));
        P0.w wVar5 = P0.t.f4540s;
        s4.e eVar5 = eVarArr2[10];
        xVar.a(wVar5, c1067f);
        boolean z5 = false;
        z5 = false;
        P0.v.b(xVar, new i(this, z5 ? 1 : 0));
        int i6 = this.f3161A.f9111d;
        int i7 = 4;
        if (i6 == 6) {
            InterfaceC1075n.a.getClass();
            C1066e c1066e = C1074m.f11952c;
            P0.w wVar6 = P0.t.f4538q;
            s4.e eVar6 = eVarArr2[8];
            xVar.a(wVar6, c1066e);
        } else if (i6 == 7 || i6 == 8) {
            InterfaceC1075n.a.getClass();
            C1066e c1066e2 = C1074m.f11951b;
            P0.w wVar7 = P0.t.f4538q;
            s4.e eVar7 = eVarArr2[8];
            xVar.a(wVar7, c1066e2);
        } else if (i6 == 4) {
            InterfaceC1075n.a.getClass();
            C1066e c1066e3 = C1074m.f11953d;
            P0.w wVar8 = P0.t.f4538q;
            s4.e eVar8 = eVarArr2[8];
            xVar.a(wVar8, c1066e3);
        }
        if (!this.f3167x) {
            xVar.a(P0.t.f4530i, X3.y.a);
        }
        int i8 = 1;
        if (this.f3167x && !this.f3166w) {
            z5 = true;
        }
        P0.w wVar9 = P0.t.f4520N;
        s4.e eVar9 = eVarArr2[26];
        xVar.a(wVar9, Boolean.valueOf(z5));
        P0.v.a(xVar, new i(this, i8));
        int i9 = 2;
        if (z5) {
            xVar.a(P0.l.f4476k, new P0.a(null, new i(this, i9)));
            xVar.a(P0.l.f4480o, new P0.a(null, new i(this, xVar)));
        }
        xVar.a(P0.l.f4475j, new P0.a(null, new b1(this, i7)));
        int i10 = this.f3161A.f9112e;
        h hVar = new h(this, 6);
        xVar.a(P0.t.f4514H, new X0.j(i10));
        xVar.a(P0.l.f4481p, new P0.a(null, hVar));
        xVar.a(P0.l.f4467b, new P0.a(null, new h(this, 7)));
        xVar.a(P0.l.f4468c, new P0.a(null, new h(this, 1)));
        if (!O.c(this.f3164u.f9125b)) {
            xVar.a(P0.l.f4482q, new P0.a(null, new h(this, 2)));
            if (this.f3167x && !this.f3166w) {
                xVar.a(P0.l.f4483r, new P0.a(null, new h(this, 3)));
            }
        }
        if (!this.f3167x || this.f3166w) {
            return;
        }
        xVar.a(P0.l.f4484s, new P0.a(null, new h(this, 5)));
    }

    @Override // H0.A0
    public final boolean x0() {
        return true;
    }
}
