package p;

import T.InterfaceC0617l0;
import T.e1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b4.InterfaceC0908f;
import com.bot.core.database.dao.LLMProviderDao_Impl;
import com.bot.core.database.dao.LLMSettingDao_Impl;
import com.bot.core.database.dao.McpServerDao_Impl;
import com.bot.core.database.entity.LLMSettingEntity;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.List;
import m4.AbstractC1276k;
import r.AbstractC1624z;
import r.C1615w;
import r.InterfaceC1618x;
import v.AbstractC1787b;
import x4.AbstractC1939v;
import z.C2004b;

/* loaded from: classes.dex */
public final /* synthetic */ class O0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13609c;

    public /* synthetic */ O0(int i6) {
        this.f13609c = i6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        List all$lambda$2;
        int count$lambda$5;
        List observeAll$lambda$3;
        LLMSettingEntity active$lambda$2;
        List all$lambda$3;
        Long maxSortOrder$lambda$4;
        X3.y clear$lambda$4;
        List all$lambda$1;
        int i6 = this.f13609c;
        X3.y yVar = X3.y.a;
        boolean z5 = false;
        switch (i6) {
            case 0:
                return new P0(((Integer) obj).intValue());
            case 1:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 2:
                return Boolean.TRUE;
            case 3:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 4:
                return Boolean.TRUE;
            case AbstractC1787b.f15290g /* 5 */:
                InterfaceC0617l0 interfaceC0617l0 = (InterfaceC0617l0) obj;
                e1 e1Var = AndroidCompositionLocals_androidKt.f10780b;
                interfaceC0617l0.getClass();
                if (((Context) T.r.B(interfaceC0617l0, e1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC1624z.f14522b;
                }
                InterfaceC1618x.a.getClass();
                return C1615w.f14502c;
            case 6:
                return Boolean.TRUE;
            case 7:
                B0.L l3 = (B0.L) obj;
                if (l3 != null && l3.a == 2) {
                    z5 = true;
                }
                return Boolean.valueOf(!z5);
            case 8:
                ((Float) obj).getClass();
                return yVar;
            case AbstractC1787b.f15287d /* 9 */:
                AbstractC1276k.f(obj, "it");
                p4.d.f13918c.getClass();
                return Integer.valueOf(p4.d.f13919e.a().nextInt(2147418112) + PegdownExtensions.SUPPRESS_HTML_BLOCKS);
            case AbstractC1787b.f15289f /* 10 */:
                return Boolean.valueOf(obj == null);
            case 11:
                return ((v.G0) obj).f15222c;
            case 12:
                ((Integer) obj).getClass();
                return null;
            case 13:
                List list = (List) obj;
                return new x.s(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 14:
                return yVar;
            case 15:
                InterfaceC0908f interfaceC0908f = (InterfaceC0908f) obj;
                if (interfaceC0908f instanceof AbstractC1939v) {
                    return (AbstractC1939v) interfaceC0908f;
                }
                return null;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list2.get(1);
                AbstractC1276k.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C2004b(intValue, ((Float) obj3).floatValue(), new I4.f(list2, 3));
            case 17:
                all$lambda$2 = LLMProviderDao_Impl.getAll$lambda$2("SELECT * FROM llm_providers ORDER BY sortOrder ASC", (X1.a) obj);
                return all$lambda$2;
            case 18:
                count$lambda$5 = LLMProviderDao_Impl.count$lambda$5("SELECT COUNT(*) FROM llm_providers", (X1.a) obj);
                return Integer.valueOf(count$lambda$5);
            case 19:
                observeAll$lambda$3 = LLMProviderDao_Impl.observeAll$lambda$3("SELECT * FROM llm_providers ORDER BY sortOrder ASC", (X1.a) obj);
                return observeAll$lambda$3;
            case 20:
                active$lambda$2 = LLMSettingDao_Impl.getActive$lambda$2("SELECT * FROM bot WHERE isActive = 1 LIMIT 1", (X1.a) obj);
                return active$lambda$2;
            case 21:
                all$lambda$3 = LLMSettingDao_Impl.getAll$lambda$3("SELECT * FROM bot ORDER BY sortOrder ASC, createdAt ASC, id ASC", (X1.a) obj);
                return all$lambda$3;
            case 22:
                maxSortOrder$lambda$4 = LLMSettingDao_Impl.getMaxSortOrder$lambda$4("SELECT MAX(sortOrder) FROM bot", (X1.a) obj);
                return maxSortOrder$lambda$4;
            case 23:
                clear$lambda$4 = McpServerDao_Impl.clear$lambda$4("DELETE FROM mcp_servers", (X1.a) obj);
                return clear$lambda$4;
            default:
                all$lambda$1 = McpServerDao_Impl.getAll$lambda$1("SELECT * FROM mcp_servers ORDER BY createdAt DESC", (X1.a) obj);
                return all$lambda$1;
        }
    }

    public /* synthetic */ O0(int i6, x.l lVar) {
        this.f13609c = 14;
    }
}
