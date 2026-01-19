package I3;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class G extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f2720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(H h3, int i6) {
        super(0);
        this.f2719e = i6;
        this.f2720f = h3;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        int N5;
        int i6 = this.f2719e;
        H h3 = this.f2720f;
        switch (i6) {
            case 0:
                String str = h3.f2727h;
                int N6 = AbstractC1776n.N(str, '#', 0, 6) + 1;
                if (N6 == 0) {
                    return FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                String substring = str.substring(N6);
                AbstractC1276k.e(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            case 1:
                String str2 = h3.f2727h;
                String str3 = h3.f2725f;
                if (str3 == null) {
                    return null;
                }
                if (str3.length() == 0) {
                    return FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                String substring2 = str2.substring(AbstractC1776n.N(str2, ':', h3.a.a.length() + 3, 4) + 1, AbstractC1776n.N(str2, '@', 0, 6));
                AbstractC1276k.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring2;
            case 2:
                ArrayList arrayList = h3.f2723d;
                String str4 = h3.f2727h;
                if (arrayList.isEmpty() || (N5 = AbstractC1776n.N(str4, '/', h3.a.a.length() + 3, 4)) == -1) {
                    return FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                int P5 = AbstractC1776n.P(str4, new char[]{'?', '#'}, N5, false);
                if (P5 == -1) {
                    String substring3 = str4.substring(N5);
                    AbstractC1276k.e(substring3, "this as java.lang.String).substring(startIndex)");
                    return substring3;
                }
                String substring4 = str4.substring(N5, P5);
                AbstractC1276k.e(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring4;
            case 3:
                String str5 = h3.f2727h;
                int N7 = AbstractC1776n.N(str5, '/', h3.a.a.length() + 3, 4);
                if (N7 == -1) {
                    return FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                int N8 = AbstractC1776n.N(str5, '#', N7, 4);
                if (N8 == -1) {
                    String substring5 = str5.substring(N7);
                    AbstractC1276k.e(substring5, "this as java.lang.String).substring(startIndex)");
                    return substring5;
                }
                String substring6 = str5.substring(N7, N8);
                AbstractC1276k.e(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring6;
            case 4:
                String str6 = h3.f2727h;
                int N9 = AbstractC1776n.N(str6, '?', 0, 6) + 1;
                if (N9 == 0) {
                    return FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                int N10 = AbstractC1776n.N(str6, '#', N9, 4);
                if (N10 == -1) {
                    String substring7 = str6.substring(N9);
                    AbstractC1276k.e(substring7, "this as java.lang.String).substring(startIndex)");
                    return substring7;
                }
                String substring8 = str6.substring(N9, N10);
                AbstractC1276k.e(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring8;
            default:
                String str7 = h3.f2727h;
                String str8 = h3.f2724e;
                if (str8 == null) {
                    return null;
                }
                if (str8.length() == 0) {
                    return FlexmarkHtmlConverter.DEFAULT_NODE;
                }
                int length = h3.a.a.length() + 3;
                String substring9 = str7.substring(length, AbstractC1776n.P(str7, new char[]{':', '@'}, length, false));
                AbstractC1276k.e(substring9, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring9;
        }
    }
}
