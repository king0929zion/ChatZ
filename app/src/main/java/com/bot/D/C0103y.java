package D;

import F0.InterfaceC0134w;
import android.graphics.drawable.Drawable;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.List;
import m0.EnumC1245A;
import m4.AbstractC1276k;
import n0.C1353b;
import v.AbstractC1787b;

/* renamed from: D.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0103y implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1234c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f1235e;

    public /* synthetic */ C0103y(T.X x5, int i6) {
        this.f1234c = i6;
        this.f1235e = x5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1234c) {
            case 0:
                N.p pVar = (N.p) obj;
                this.f1235e.setValue(pVar.f3598c ? pVar.f3597b : pVar.a);
                return X3.y.a;
            case 1:
                List list = (List) obj;
                T.X x5 = this.f1235e;
                if (x5 != null) {
                    x5.setValue(list);
                }
                return X3.y.a;
            case 2:
                ((l4.c) this.f1235e.getValue()).f((C1353b) obj);
                return X3.y.a;
            case 3:
                this.f1235e.setValue((InterfaceC0134w) obj);
                return X3.y.a;
            case 4:
                this.f1235e.setValue((InterfaceC0134w) obj);
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                this.f1235e.setValue((InterfaceC0134w) obj);
                return X3.y.a;
            case 6:
                this.f1235e.setValue((O.G) obj);
                return X3.y.a;
            case 7:
                j2.d dVar = (j2.d) obj;
                AbstractC1276k.f(dVar, "success");
                Drawable drawable = dVar.f12365b.a;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    this.f1235e.setValue(Float.valueOf(intrinsicWidth / intrinsicHeight));
                }
                return X3.y.a;
            case 8:
                this.f1235e.setValue((InterfaceC0134w) obj);
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                if (intValue > 0) {
                    T.X x6 = this.f1235e;
                    if (intValue != Q2.a.c(x6)) {
                        x6.setValue(num);
                    }
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                String str = (String) obj;
                AbstractC1276k.f(str, "it");
                this.f1235e.setValue(str);
                return X3.y.a;
            case 11:
                S0.L l3 = (S0.L) obj;
                AbstractC1276k.f(l3, "it");
                this.f1235e.setValue(l3);
                return X3.y.a;
            case 12:
                this.f1235e.setValue(new e1.l(((e1.l) obj).a));
                return X3.y.a;
            case 13:
                this.f1235e.setValue(Integer.valueOf((int) (((e1.l) obj).a & 4294967295L)));
                return X3.y.a;
            case 14:
                String str2 = (String) obj;
                AbstractC1276k.f(str2, "botId");
                return Integer.valueOf(((Number) ((l4.c) this.f1235e.getValue()).f(str2)).intValue());
            case 15:
                T.X x7 = this.f1235e;
                if (((String) x7.getValue()) != null) {
                    x7.setValue(null);
                }
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                ((Boolean) obj).getClass();
                this.f1235e.setValue(Boolean.valueOf(!((Boolean) r5.getValue()).booleanValue()));
                return X3.y.a;
            case 17:
                String str3 = (String) obj;
                AbstractC1276k.f(str3, "it");
                this.f1235e.setValue(str3);
                return X3.y.a;
            case 18:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f1235e.setValue(bool);
                return X3.y.a;
            case 19:
                String str4 = (String) obj;
                AbstractC1276k.f(str4, "it");
                this.f1235e.setValue(str4);
                return X3.y.a;
            case 20:
                String str5 = (String) obj;
                AbstractC1276k.f(str5, "it");
                this.f1235e.setValue(str5);
                return X3.y.a;
            case 21:
                T.X x8 = this.f1235e;
                if (((String) x8.getValue()) != null) {
                    x8.setValue(null);
                }
                return X3.y.a;
            case 22:
                EnumC1245A enumC1245A = (EnumC1245A) obj;
                AbstractC1276k.f(enumC1245A, "focusState");
                this.f1235e.setValue(Boolean.valueOf(enumC1245A.b()));
                return X3.y.a;
            case 23:
                EnumC1245A enumC1245A2 = (EnumC1245A) obj;
                AbstractC1276k.f(enumC1245A2, "focusState");
                this.f1235e.setValue(Boolean.valueOf(enumC1245A2.b()));
                return X3.y.a;
            case 24:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f1235e.setValue(bool2);
                return X3.y.a;
            case 25:
                EnumC1245A enumC1245A3 = (EnumC1245A) obj;
                AbstractC1276k.f(enumC1245A3, "focusState");
                this.f1235e.setValue(Boolean.valueOf(enumC1245A3.b()));
                return X3.y.a;
            case 26:
                EnumC1245A enumC1245A4 = (EnumC1245A) obj;
                AbstractC1276k.f(enumC1245A4, "focusState");
                this.f1235e.setValue(Boolean.valueOf(enumC1245A4.b()));
                return X3.y.a;
            case 27:
                String str6 = (String) obj;
                AbstractC1276k.f(str6, "it");
                this.f1235e.setValue(str6);
                return X3.y.a;
            case 28:
                String str7 = (String) obj;
                AbstractC1276k.f(str7, "it");
                this.f1235e.setValue(str7);
                return X3.y.a;
            default:
                String str8 = (String) obj;
                AbstractC1276k.f(str8, "it");
                this.f1235e.setValue(str8);
                return X3.y.a;
        }
    }
}
