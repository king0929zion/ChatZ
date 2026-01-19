package F0;

import T.G0;
import T.InterfaceC0604f;
import com.bot.MainActivity;
import com.vladsch.flexmark.formatter.TranslationPlaceholderGenerator;
import com.vladsch.flexmark.formatter.internal.CoreNodeFormatter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.misc.TemplateUtil;
import com.vladsch.flexmark.util.options.MessageProvider;
import e.InterfaceC0955c;
import n.InterfaceC1349x;
import p0.C1468d;
import p0.InterfaceC1473i;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements G0, InterfaceC0604f, TranslationPlaceholderGenerator, TemplateUtil.Resolver, MessageProvider, InterfaceC1349x, InterfaceC1473i, InterfaceC0955c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1399c;

    public /* synthetic */ F(int i6) {
        this.f1399c = i6;
    }

    @Override // e.InterfaceC0955c
    public void a(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i6 = MainActivity.f11132D;
        if (booleanValue) {
            i5.a.a.getClass();
            androidx.lifecycle.N.k(new Object[0]);
        } else {
            i5.a.a.getClass();
            androidx.lifecycle.N.k(new Object[0]);
        }
    }

    @Override // T.G0
    public boolean b() {
        return false;
    }

    @Override // n.InterfaceC1349x
    public float c(float f6) {
        return f6;
    }

    @Override // T.InterfaceC0604f
    public void cancel() {
    }

    @Override // p0.InterfaceC1473i
    public double e(double d6) {
        switch (this.f1399c) {
            case 11:
                double d7 = d6 < 0.0d ? -d6 : d6;
                return Math.copySign(d7 >= 0.0031308049535603718d ? (Math.pow(d7, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d7 / 0.07739938080495357d, d6);
            case 12:
                double d8 = d6 < 0.0d ? -d6 : d6;
                return Math.copySign(d8 >= 0.04045d ? Math.pow((0.9478672985781991d * d8) + 0.05213270142180095d, 2.4d) : d8 * 0.07739938080495357d, d6);
            case 13:
                float[] fArr = C1468d.a;
                return C1468d.b(C1468d.f13839c, d6);
            case 14:
                float[] fArr2 = C1468d.a;
                return C1468d.a(C1468d.f13839c, d6);
            case 15:
                float[] fArr3 = C1468d.a;
                return C1468d.d(C1468d.f13840d, d6);
            case PegdownExtensions.AUTOLINKS /* 16 */:
                float[] fArr4 = C1468d.a;
                return C1468d.c(C1468d.f13840d, d6);
            default:
                return d6;
        }
    }

    @Override // com.vladsch.flexmark.formatter.TranslationPlaceholderGenerator
    public String getPlaceholder(int i6) {
        return CoreNodeFormatter.K(i6);
    }

    @Override // com.vladsch.flexmark.util.options.MessageProvider
    public String message(String str, String str2, Object[] objArr) {
        return MessageProvider.d(str, str2, objArr);
    }

    @Override // com.vladsch.flexmark.util.misc.TemplateUtil.Resolver
    public String resolve(String[] strArr) {
        String lambda$static$0;
        lambda$static$0 = TemplateUtil.lambda$static$0(strArr);
        return lambda$static$0;
    }
}
