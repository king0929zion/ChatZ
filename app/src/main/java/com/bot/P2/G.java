package P2;

import Q.C0427j0;
import R2.AbstractC0530j;
import S2.AbstractC0565e;
import T.C0626q;
import T.d1;
import Z2.AbstractC0783w;
import com.bot.core.model.LLMSetting;
import com.bot.feature.settings.data.ModelConfig;
import com.tencent.mmkv.R;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import l4.InterfaceC1193a;
import n.C1316c;
import t0.AbstractC1688b;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4692c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4695g;

    public /* synthetic */ G(Object obj, Object obj2, boolean z5, int i6, int i7) {
        this.f4692c = i7;
        this.f4694f = obj;
        this.f4695g = obj2;
        this.f4693e = z5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f4692c) {
            case 0:
                C1316c c1316c = (C1316c) this.f4694f;
                d1 d1Var = (d1) this.f4695g;
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    C1038o c1038o = C1038o.a;
                    if (this.f4693e) {
                        c0626q.b0(1620885382);
                        AbstractC1688b L5 = Y3.C.L(R.drawable.stop, 0, c0626q);
                        String j02 = h5.e.j0(R.string.button_stop, c0626q);
                        InterfaceC1041r j3 = v.t0.j(c1038o, 20);
                        float floatValue = ((Number) c1316c.d()).floatValue();
                        Q.A0.a(L5, j02, l0.h.a(l0.h.j(j3, floatValue, floatValue), ((Number) d1Var.getValue()).floatValue()), 0L, c0626q, 8, 8);
                        c0626q.p(false);
                    } else {
                        c0626q.b0(1621494129);
                        AbstractC1688b L6 = Y3.C.L(R.drawable.ic_arrow_upward, 0, c0626q);
                        String j03 = h5.e.j0(R.string.button_send, c0626q);
                        InterfaceC1041r j4 = v.t0.j(c1038o, 20);
                        float floatValue2 = ((Number) c1316c.d()).floatValue();
                        Q.A0.a(L6, j03, l0.h.a(l0.h.j(j4, floatValue2, floatValue2), ((Number) d1Var.getValue()).floatValue()), 0L, c0626q, 8, 8);
                        c0626q.p(false);
                    }
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            case 1:
                C0427j0 c0427j0 = (C0427j0) this.f4694f;
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) this.f4695g;
                ((Integer) obj2).getClass();
                c0427j0.a(T.r.J(1), (C0626q) obj, interfaceC1041r, this.f4693e);
                return X3.y.a;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0530j.d((LLMSetting) this.f4694f, this.f4693e, (InterfaceC1193a) this.f4695g, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0565e.k((S2.G) this.f4694f, (S0.P) this.f4695g, this.f4693e, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0565e.n((ArrayList) this.f4694f, (S0.P) this.f4695g, this.f4693e, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC0565e.b((String) this.f4694f, (String) this.f4695g, this.f4693e, (C0626q) obj, T.r.J(1));
                return X3.y.a;
            default:
                ((Integer) obj2).getClass();
                AbstractC0783w.B((ModelConfig) this.f4694f, this.f4693e, (l4.c) this.f4695g, (C0626q) obj, T.r.J(1));
                return X3.y.a;
        }
    }

    public /* synthetic */ G(Object obj, boolean z5, Object obj2, int i6, int i7) {
        this.f4692c = i7;
        this.f4694f = obj;
        this.f4693e = z5;
        this.f4695g = obj2;
    }

    public /* synthetic */ G(boolean z5, C1316c c1316c, d1 d1Var) {
        this.f4692c = 0;
        this.f4693e = z5;
        this.f4694f = c1316c;
        this.f4695g = d1Var;
    }
}
