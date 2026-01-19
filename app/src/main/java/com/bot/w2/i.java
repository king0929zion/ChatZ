package W2;

import A4.g0;
import X3.y;
import a3.u;
import a3.w;
import androidx.lifecycle.O;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8923c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f8924e;

    public /* synthetic */ i(w wVar, int i6) {
        this.f8923c = i6;
        this.f8924e = wVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // l4.c
    public final Object f(Object obj) {
        String str = (String) obj;
        switch (this.f8923c) {
            case 0:
                AbstractC1276k.f(str, "botId");
                w wVar = this.f8924e;
                wVar.getClass();
                if (!AbstractC1776n.Q(str) && !str.equals(wVar.f10735e.getValue())) {
                    AbstractC1888A.y(O.i(wVar), null, new u(wVar, null, str), 3);
                }
                return y.a;
            case 1:
                AbstractC1276k.f(str, "model");
                this.f8924e.D(str, true);
                return y.a;
            case 2:
                AbstractC1276k.f(str, "it");
                w wVar2 = this.f8924e;
                wVar2.getClass();
                g0 g0Var = wVar2.f10710I;
                g0Var.getClass();
                g0Var.l(null, str);
                g0 g0Var2 = wVar2.f10726Y;
                Boolean bool = Boolean.TRUE;
                g0Var2.getClass();
                g0Var2.l(null, bool);
                return y.a;
            case 3:
                AbstractC1276k.f(str, "it");
                w wVar3 = this.f8924e;
                wVar3.getClass();
                g0 g0Var3 = wVar3.f10714M;
                g0Var3.getClass();
                g0Var3.l(null, str);
                g0 g0Var4 = wVar3.f10726Y;
                Boolean bool2 = Boolean.TRUE;
                g0Var4.getClass();
                g0Var4.l(null, bool2);
                return y.a;
            case 4:
                AbstractC1276k.f(str, "modelId");
                this.f8924e.D(str, false);
                return y.a;
            case AbstractC1787b.f15290g /* 5 */:
                AbstractC1276k.f(str, "it");
                w wVar4 = this.f8924e;
                wVar4.getClass();
                g0 g0Var5 = wVar4.f10739g;
                g0Var5.getClass();
                g0Var5.l(null, str);
                g0 g0Var6 = wVar4.f10726Y;
                Boolean bool3 = Boolean.TRUE;
                g0Var6.getClass();
                g0Var6.l(null, bool3);
                return y.a;
            default:
                AbstractC1276k.f(str, "it");
                w wVar5 = this.f8924e;
                wVar5.getClass();
                g0 g0Var7 = wVar5.f10750o;
                g0Var7.getClass();
                g0Var7.l(null, str);
                g0 g0Var8 = wVar5.f10726Y;
                Boolean bool4 = Boolean.TRUE;
                g0Var8.getClass();
                g0Var8.l(null, bool4);
                return y.a;
        }
    }
}
