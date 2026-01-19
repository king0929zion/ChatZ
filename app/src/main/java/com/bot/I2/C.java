package I2;

import H0.J;
import com.bot.core.model.LLMSetting;
import com.bot.feature.settings.data.VendorConfig;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import java.util.Comparator;
import java.util.LinkedHashMap;
import k.C1149C;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class C implements Comparator {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2612b;

    public /* synthetic */ C(Object obj, int i6) {
        this.a = i6;
        this.f2612b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int compare = ((B3.q) this.f2612b).compare(obj, obj2);
                return compare != 0 ? compare : h5.e.J((Comparable) ((X3.i) obj).f9393c, (Comparable) ((X3.i) obj2).f9393c);
            case 1:
                int compare2 = ((B3.q) this.f2612b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : h5.e.J((Comparable) ((X3.i) obj).f9393c, (Comparable) ((X3.i) obj2).f9393c);
            case 2:
                long longValue = ((Number) obj).longValue();
                C1149C c1149c = (C1149C) this.f2612b;
                return h5.e.J(Integer.valueOf(c1149c.c(longValue)), Integer.valueOf(c1149c.c(((Number) obj2).longValue())));
            case 3:
                int compare3 = ((Comparator) this.f2612b).compare(obj, obj2);
                if (compare3 != 0) {
                    return compare3;
                }
                return J.f1711X.compare(((P0.p) obj).f4498c, ((P0.p) obj2).f4498c);
            case 4:
                int compare4 = ((C) this.f2612b).compare(obj, obj2);
                return compare4 != 0 ? compare4 : h5.e.J(Integer.valueOf(((P0.p) obj).f4502g), Integer.valueOf(((P0.p) obj2).f4502g));
            case AbstractC1787b.f15290g /* 5 */:
                Integer valueOf = Integer.valueOf(TableCell.NOT_TRACKED);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2612b;
                Integer num = (Integer) linkedHashMap.get(((VendorConfig) obj).a);
                if (num == null) {
                    num = valueOf;
                }
                Integer num2 = (Integer) linkedHashMap.get(((VendorConfig) obj2).a);
                if (num2 != null) {
                    valueOf = num2;
                }
                return h5.e.J(num, valueOf);
            case 6:
                int compare5 = ((B3.q) this.f2612b).compare(obj, obj2);
                return compare5 != 0 ? compare5 : h5.e.J(Long.valueOf(((LLMSetting) obj).f11207l), Long.valueOf(((LLMSetting) obj2).f11207l));
            default:
                int compare6 = ((C) this.f2612b).compare(obj, obj2);
                if (compare6 != 0) {
                    return compare6;
                }
                String str = ((LLMSetting) obj).a;
                String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                if (str == null) {
                    str = FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                String str3 = ((LLMSetting) obj2).a;
                if (str3 != null) {
                    str2 = str3;
                }
                return h5.e.J(str, str2);
        }
    }

    public C(Comparator comparator) {
        this.a = 3;
        this.f2612b = comparator;
    }
}
