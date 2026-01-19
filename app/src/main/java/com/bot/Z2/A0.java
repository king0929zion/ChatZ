package Z2;

import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class A0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9887c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f9888e;

    public /* synthetic */ A0(T.X x5, int i6) {
        this.f9887c = i6;
        this.f9888e = x5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f9887c) {
            case 0:
                String str = (String) obj;
                AbstractC1276k.f(str, "it");
                this.f9888e.setValue(str);
                return X3.y.a;
            case 1:
                String str2 = (String) obj;
                AbstractC1276k.f(str2, "it");
                this.f9888e.setValue(str2);
                return X3.y.a;
            case 2:
                String str3 = (String) obj;
                AbstractC1276k.f(str3, "it");
                this.f9888e.setValue(str3);
                return X3.y.a;
            case 3:
                String str4 = (String) obj;
                AbstractC1276k.f(str4, "it");
                this.f9888e.setValue(str4);
                return X3.y.a;
            case 4:
                String str5 = (String) obj;
                AbstractC1276k.f(str5, "it");
                this.f9888e.setValue(str5);
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                String str6 = (String) obj;
                AbstractC1276k.f(str6, "it");
                this.f9888e.setValue(str6);
                return X3.y.a;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f9888e.setValue(bool);
                return X3.y.a;
            case 7:
                String str7 = (String) obj;
                AbstractC1276k.f(str7, "it");
                this.f9888e.setValue(str7);
                return X3.y.a;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f9888e.setValue(bool2);
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                String str8 = (String) obj;
                AbstractC1276k.f(str8, "providerId");
                return Integer.valueOf(((Number) ((l4.c) this.f9888e.getValue()).f(str8)).intValue());
            case AbstractC1787b.f15289f /* 10 */:
                T.X x5 = this.f9888e;
                if (((String) x5.getValue()) != null) {
                    x5.setValue(null);
                }
                return X3.y.a;
            case 11:
                String str9 = (String) obj;
                AbstractC1276k.f(str9, "it");
                this.f9888e.setValue(str9);
                return X3.y.a;
            case 12:
                G2.e eVar = (G2.e) obj;
                AbstractC1276k.f(eVar, "theme");
                this.f9888e.setValue(eVar);
                return X3.y.a;
            case 13:
                G2.a aVar = (G2.a) obj;
                AbstractC1276k.f(aVar, "language");
                this.f9888e.setValue(aVar);
                return X3.y.a;
            default:
                Float f6 = (Float) obj;
                f6.getClass();
                return Float.valueOf(((Number) ((l4.c) this.f9888e.getValue()).f(f6)).floatValue());
        }
    }
}
