package D;

import F0.InterfaceC0134w;
import Q.AbstractC0451p0;
import Q.C0411f0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.List;
import l4.InterfaceC1193a;
import u.AbstractC1734b;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f737c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f738e;

    public /* synthetic */ C(T.X x5, int i6) {
        this.f737c = i6;
        this.f738e = x5;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        int i6 = this.f737c;
        X3.y yVar = X3.y.a;
        T.X x5 = this.f738e;
        switch (i6) {
            case 0:
                if (x5 != null) {
                    return (List) x5.getValue();
                }
                return null;
            case 1:
                Boolean bool = (Boolean) x5.getValue();
                bool.booleanValue();
                return bool;
            case 2:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) x5.getValue();
                if (interfaceC0134w != null) {
                    return interfaceC0134w;
                }
                AbstractC1734b.d("Required value was null.");
                throw new RuntimeException();
            case 3:
                InterfaceC0134w interfaceC0134w2 = (InterfaceC0134w) x5.getValue();
                if (interfaceC0134w2 != null) {
                    return interfaceC0134w2;
                }
                AbstractC1734b.d("Required value was null.");
                throw new RuntimeException();
            case 4:
                InterfaceC0134w interfaceC0134w3 = (InterfaceC0134w) x5.getValue();
                if (interfaceC0134w3 != null) {
                    return interfaceC0134w3;
                }
                AbstractC1734b.d("Required value was null.");
                throw new RuntimeException();
            case AbstractC1787b.f15290g /* 5 */:
                x5.setValue(Integer.valueOf(((Number) x5.getValue()).intValue() + 1));
                return yVar;
            case 6:
                x5.setValue(yVar);
                return yVar;
            case 7:
                ((C0411f0) x5.getValue()).getClass();
                float f6 = AbstractC0451p0.a;
                x5.setValue(new Object());
                return yVar;
            case 8:
                return (InterfaceC0134w) x5.getValue();
            case AbstractC1787b.f15287d /* 9 */:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case 11:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case 12:
                x5.setValue(Boolean.TRUE);
                return yVar;
            case 13:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case 14:
                x5.setValue(Boolean.TRUE);
                return yVar;
            case 15:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                ((InterfaceC1193a) x5.getValue()).b();
                return yVar;
            case 17:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case 18:
                x5.setValue(null);
                return yVar;
            case 19:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case 20:
                x5.setValue(FlexmarkHtmlConverter.DEFAULT_NODE);
                return yVar;
            case 21:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case 22:
                x5.setValue(Boolean.FALSE);
                return yVar;
            case 23:
                ((InterfaceC1193a) x5.getValue()).b();
                return yVar;
            case 24:
                x5.setValue(FlexmarkHtmlConverter.DEFAULT_NODE);
                return yVar;
            case 25:
                x5.setValue(Boolean.TRUE);
                return yVar;
            case 26:
                x5.setValue(Boolean.TRUE);
                return yVar;
            case 27:
                x5.setValue(Boolean.FALSE);
                return yVar;
            default:
                x5.setValue(Boolean.FALSE);
                return yVar;
        }
    }
}
