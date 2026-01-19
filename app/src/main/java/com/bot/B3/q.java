package B3;

import I2.D;
import com.bot.core.model.LLMSetting;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Map;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class q implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i6) {
        this.a = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return h5.e.J((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 1:
                String[] strArr = D.a;
                return h5.e.J(Integer.valueOf(D.b((String) ((X3.i) obj).f9393c)), Integer.valueOf(D.b((String) ((X3.i) obj2).f9393c)));
            case 2:
                String[] strArr2 = D.a;
                return h5.e.J(Integer.valueOf(D.a((String) ((X3.i) obj).f9393c)), Integer.valueOf(D.a((String) ((X3.i) obj2).f9393c)));
            case 3:
                return h5.e.J((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return h5.e.J((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case AbstractC1787b.f15290g /* 5 */:
                return h5.e.J(((T1.f) obj).a, ((T1.f) obj2).a);
            case 6:
                return h5.e.J(((T1.h) obj).a, ((T1.h) obj2).a);
            case 7:
                return h5.e.J(Long.valueOf(((LLMSetting) obj).f11208m), Long.valueOf(((LLMSetting) obj2).f11208m));
            case 8:
                return h5.e.J(((e5.g) obj).a, ((e5.g) obj2).a);
            case AbstractC1787b.f15287d /* 9 */:
                return h5.e.J(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
            case AbstractC1787b.f15289f /* 10 */:
                return h5.e.J(T3.a.d((Charset) obj), T3.a.d((Charset) obj2));
            default:
                return h5.e.J((Float) ((X3.i) obj2).f9394e, (Float) ((X3.i) obj).f9394e);
        }
    }
}
