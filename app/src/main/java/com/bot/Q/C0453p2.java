package Q;

import com.bot.core.database.dao.LLMProviderDao_Impl;
import o4.AbstractC1410a;

/* renamed from: Q.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0453p2 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6035c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6037f;

    public /* synthetic */ C0453p2(boolean z5, Object obj, int i6) {
        this.f6035c = i6;
        this.f6036e = z5;
        this.f6037f = obj;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        X3.y updateEnabled$lambda$7;
        int i6 = this.f6035c;
        Object obj2 = this.f6037f;
        boolean z5 = this.f6036e;
        switch (i6) {
            case 0:
                C2 c22 = (C2) obj2;
                P0.x xVar = (P0.x) obj;
                X3.y yVar = X3.y.a;
                if (!z5) {
                    s4.e[] eVarArr = P0.v.a;
                    xVar.a(P0.t.f4530i, yVar);
                }
                String valueOf = String.valueOf(AbstractC1410a.K(c22.f5182g.g() * 100) / 100.0f);
                s4.e[] eVarArr2 = P0.v.a;
                P0.w wVar = P0.t.f4523b;
                s4.e eVar = P0.v.a[0];
                xVar.a(wVar, valueOf);
                xVar.a(P0.l.f4474i, new P0.a(null, new C0449o2(c22, 1)));
                return yVar;
            default:
                updateEnabled$lambda$7 = LLMProviderDao_Impl.updateEnabled$lambda$7("UPDATE llm_providers SET isEnabled = ? WHERE id = ?", z5, (String) obj2, (X1.a) obj);
                return updateEnabled$lambda$7;
        }
    }
}
