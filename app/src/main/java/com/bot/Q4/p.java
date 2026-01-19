package Q4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f6564j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6565b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6566c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6567d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6568e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6569f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6570g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6571h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6572i;

    public p(String str, String str2, String str3, String str4, int i6, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        AbstractC1276k.f(str, "scheme");
        AbstractC1276k.f(str4, "host");
        this.a = str;
        this.f6565b = str2;
        this.f6566c = str3;
        this.f6567d = str4;
        this.f6568e = i6;
        this.f6569f = arrayList2;
        this.f6570g = str5;
        this.f6571h = str6;
        this.f6572i = str.equals("https");
    }

    public final String a() {
        if (this.f6566c.length() == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        int length = this.a.length() + 3;
        String str = this.f6571h;
        String substring = str.substring(AbstractC1776n.N(str, ':', length, 4) + 1, AbstractC1776n.N(str, '@', 0, 6));
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.f6571h;
        int N5 = AbstractC1776n.N(str, '/', length, 4);
        String substring = str.substring(N5, R4.b.g(str, N5, str.length(), "?#"));
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.f6571h;
        int N5 = AbstractC1776n.N(str, '/', length, 4);
        int g3 = R4.b.g(str, N5, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (N5 < g3) {
            int i6 = N5 + 1;
            int f6 = R4.b.f(str, '/', i6, g3);
            String substring = str.substring(i6, f6);
            AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            N5 = f6;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f6569f == null) {
            return null;
        }
        String str = this.f6571h;
        int N5 = AbstractC1776n.N(str, '?', 0, 6) + 1;
        String substring = str.substring(N5, R4.b.f(str, '#', N5, str.length()));
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f6565b.length() == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        int length = this.a.length() + 3;
        String str = this.f6571h;
        String substring = str.substring(length, R4.b.g(str, length, str.length(), ":@"));
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && AbstractC1276k.b(((p) obj).f6571h, this.f6571h);
    }

    public final String f() {
        o oVar;
        try {
            oVar = new o();
            oVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            oVar = null;
        }
        AbstractC1276k.c(oVar);
        oVar.f6557b = C0494b.b(FlexmarkHtmlConverter.DEFAULT_NODE, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        oVar.f6558c = C0494b.b(FlexmarkHtmlConverter.DEFAULT_NODE, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return oVar.a().f6571h;
    }

    public final URI g() {
        String substring;
        String str;
        o oVar = new o();
        String str2 = this.a;
        oVar.a = str2;
        oVar.f6557b = e();
        oVar.f6558c = a();
        oVar.f6559d = this.f6567d;
        AbstractC1276k.f(str2, "scheme");
        int i6 = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
        int i7 = this.f6568e;
        oVar.f6560e = i7 != i6 ? i7 : -1;
        ArrayList arrayList = oVar.f6561f;
        arrayList.clear();
        arrayList.addAll(c());
        String d6 = d();
        oVar.f6562g = d6 != null ? C0494b.f(C0494b.b(d6, 0, 0, " \"'<>#", 211)) : null;
        if (this.f6570g == null) {
            substring = null;
        } else {
            String str3 = this.f6571h;
            substring = str3.substring(AbstractC1776n.N(str3, '#', 0, 6) + 1);
            AbstractC1276k.e(substring, "this as java.lang.String).substring(startIndex)");
        }
        oVar.f6563h = substring;
        String str4 = oVar.f6559d;
        if (str4 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            AbstractC1276k.e(compile, "compile(...)");
            str = compile.matcher(str4).replaceAll(FlexmarkHtmlConverter.DEFAULT_NODE);
            AbstractC1276k.e(str, "replaceAll(...)");
        } else {
            str = null;
        }
        oVar.f6559d = str;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.set(i8, C0494b.b((String) arrayList.get(i8), 0, 0, "[]", 227));
        }
        ArrayList arrayList2 = oVar.f6562g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                String str5 = (String) arrayList2.get(i9);
                arrayList2.set(i9, str5 != null ? C0494b.b(str5, 0, 0, "\\^`{|}", 195) : null);
            }
        }
        String str6 = oVar.f6563h;
        oVar.f6563h = str6 != null ? C0494b.b(str6, 0, 0, " \"#<>\\^`{|}", 163) : null;
        String oVar2 = oVar.toString();
        try {
            return new URI(oVar2);
        } catch (URISyntaxException e6) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC1276k.e(compile2, "compile(...)");
                String replaceAll = compile2.matcher(oVar2).replaceAll(FlexmarkHtmlConverter.DEFAULT_NODE);
                AbstractC1276k.e(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                AbstractC1276k.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final int hashCode() {
        return this.f6571h.hashCode();
    }

    public final String toString() {
        return this.f6571h;
    }
}
