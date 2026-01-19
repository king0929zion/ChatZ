package P2;

import T.d1;
import com.bot.core.model.LLMSetting;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import o0.C1387I;

/* loaded from: classes.dex */
public final /* synthetic */ class I0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4740c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d1 f4741e;

    public /* synthetic */ I0(d1 d1Var, int i6) {
        this.f4740c = i6;
        this.f4741e = d1Var;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f4740c) {
            case 0:
                C1387I c1387i = (C1387I) obj;
                AbstractC1276k.f(c1387i, "$this$graphicsLayer");
                c1387i.d(((Number) this.f4741e.getValue()).floatValue());
                break;
            case 1:
                ((C1387I) obj).d(((Number) this.f4741e.getValue()).floatValue());
                break;
            default:
                String str = (String) obj;
                AbstractC1276k.f(str, "botId");
                Iterator it = ((List) this.f4741e.getValue()).iterator();
                int i6 = 0;
                while (true) {
                    if (it.hasNext()) {
                        String str2 = ((LLMSetting) it.next()).a;
                        if (str2 == null) {
                            str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                        }
                        if (!str2.equals(str)) {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                    }
                }
                return Integer.valueOf(i6);
        }
        return X3.y.a;
    }
}
