package u4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.AbstractC1276k;

/* renamed from: u4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1774l implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f15193c;

    public C1774l(String str) {
        AbstractC1276k.f(str, "pattern");
        Pattern compile = Pattern.compile(str);
        AbstractC1276k.e(compile, "compile(...)");
        this.f15193c = compile;
    }

    public static C1772j a(C1774l c1774l, String str) {
        c1774l.getClass();
        AbstractC1276k.f(str, FlexmarkHtmlConverter.INPUT_NODE);
        Matcher matcher = c1774l.f15193c.matcher(str);
        AbstractC1276k.e(matcher, "matcher(...)");
        return io.ktor.utils.io.u.b(matcher, 0, str);
    }

    public final C1772j b(String str) {
        AbstractC1276k.f(str, FlexmarkHtmlConverter.INPUT_NODE);
        Matcher matcher = this.f15193c.matcher(str);
        AbstractC1276k.e(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new C1772j(matcher, str);
        }
        return null;
    }

    public final boolean c(CharSequence charSequence) {
        AbstractC1276k.f(charSequence, FlexmarkHtmlConverter.INPUT_NODE);
        return this.f15193c.matcher(charSequence).matches();
    }

    public final String toString() {
        String pattern = this.f15193c.toString();
        AbstractC1276k.e(pattern, "toString(...)");
        return pattern;
    }

    public C1774l(String str, int i6) {
        AbstractC1276k.f(str, "pattern");
        Pattern compile = Pattern.compile(str, 66);
        AbstractC1276k.e(compile, "compile(...)");
        this.f15193c = compile;
    }
}
