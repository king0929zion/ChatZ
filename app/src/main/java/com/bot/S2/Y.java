package S2;

import Z2.a1;
import a3.C0810H;
import b3.AbstractC0897m;
import com.bot.core.model.McpServer;
import com.bot.feature.settings.data.ModelConfig;
import com.bot.feature.settings.data.VendorConfig;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.AbstractC0992o;
import java.util.Map;
import m.C1237s;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import u4.AbstractC1776n;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7727c;

    public /* synthetic */ Y(int i6) {
        this.f7727c = i6;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f7727c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1276k.f(entry, "it");
                return entry.getKey() + ": " + entry.getValue();
            case 1:
                String str = (String) obj;
                AbstractC1276k.f(str, "line");
                return AbstractC1776n.Q(str) ? ">" : "> ".concat(str);
            case 2:
                String str2 = (String) obj;
                AbstractC1276k.f(str2, "it");
                return AbstractC0565e.z(str2);
            case 3:
                String str3 = (String) obj;
                AbstractC1276k.f(str3, "it");
                return AbstractC0565e.z(str3);
            case 4:
                A0.b bVar = ((T.Z) obj).a;
                if (bVar != null) {
                    bVar.b();
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC1276k.f(entry2, "it");
                return entry2.getKey() + "=" + entry2.getValue();
            case 6:
                VendorConfig vendorConfig = (VendorConfig) obj;
                AbstractC1276k.f(vendorConfig, "it");
                return Y3.m.h0(vendorConfig.f11272c);
            case 7:
                N4.f fVar = (N4.f) obj;
                AbstractC1276k.f(fVar, "$this$Json");
                fVar.f3889c = true;
                fVar.f3890d = true;
                return X3.y.a;
            case 8:
                AbstractC1276k.f((t3.f) obj, "$this$create");
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                N4.f fVar2 = (N4.f) obj;
                AbstractC1276k.f(fVar2, "$this$Json");
                fVar2.f3889c = true;
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                Z2.C c6 = (Z2.C) obj;
                AbstractC1276k.f(c6, "it");
                return c6.a;
            case 11:
                AbstractC1276k.f((String) obj, "it");
                return X3.y.a;
            case 12:
                McpServer mcpServer = (McpServer) obj;
                AbstractC1276k.f(mcpServer, "it");
                return mcpServer.a;
            case 13:
                VendorConfig vendorConfig2 = (VendorConfig) obj;
                AbstractC1276k.f(vendorConfig2, "vendor");
                return Y3.m.h0(vendorConfig2.f11272c);
            case 14:
                AbstractC1276k.f((String) obj, "it");
                return X3.y.a;
            case 15:
                AbstractC1276k.f((String) obj, "it");
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                ModelConfig modelConfig = (ModelConfig) obj;
                AbstractC1276k.f(modelConfig, "it");
                return modelConfig.a;
            case 17:
                AbstractC1276k.f((String) obj, "it");
                return X3.y.a;
            case 18:
                AbstractC1276k.f((String) obj, "it");
                return X3.y.a;
            case 19:
                AbstractC1276k.f((String) obj, "it");
                return X3.y.a;
            case 20:
                C0810H c0810h = (C0810H) obj;
                AbstractC1276k.f(c0810h, "it");
                return c0810h.a.a;
            case 21:
                a1 a1Var = (a1) obj;
                AbstractC1276k.f(a1Var, "it");
                return a1Var.a.f1281c;
            case 22:
                ((Integer) obj).getClass();
                T.B b5 = AbstractC0897m.a;
                return X3.y.a;
            case 23:
                C1237s c1237s = (C1237s) obj;
                AbstractC1276k.f(c1237s, "<this>");
                return C1237s.f(c1237s, 0, AbstractC1318d.s(300, 6, null));
            case 24:
                C1237s c1237s2 = (C1237s) obj;
                AbstractC1276k.f(c1237s2, "<this>");
                return C1237s.f(c1237s2, 1, AbstractC1318d.s(300, 6, null));
            case 25:
                C1237s c1237s3 = (C1237s) obj;
                AbstractC1276k.f(c1237s3, "<this>");
                return C1237s.e(c1237s3, 1, AbstractC1318d.s(300, 6, null));
            case 26:
                C1237s c1237s4 = (C1237s) obj;
                AbstractC1276k.f(c1237s4, "<this>");
                return C1237s.e(c1237s4, 0, AbstractC1318d.s(300, 6, null));
            case 27:
                return new e0.d((Map) obj);
            case 28:
                return obj;
            default:
                synchronized (AbstractC0992o.f11707c) {
                    ?? r22 = AbstractC0992o.f11713i;
                    int size = r22.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((l4.c) r22.get(i6)).f(obj);
                    }
                }
                return X3.y.a;
        }
    }
}
