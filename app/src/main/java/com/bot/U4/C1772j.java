package u4;

import Y3.E;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1117a;
import java.util.List;
import java.util.regex.Matcher;
import m4.AbstractC1276k;

/* renamed from: u4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772j {
    public final Matcher a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f15189b;

    /* renamed from: c, reason: collision with root package name */
    public final Y.m f15190c;

    /* renamed from: d, reason: collision with root package name */
    public E f15191d;

    public C1772j(Matcher matcher, CharSequence charSequence) {
        AbstractC1276k.f(charSequence, FlexmarkHtmlConverter.INPUT_NODE);
        this.a = matcher;
        this.f15189b = charSequence;
        this.f15190c = new Y.m(this, 1);
    }

    public final List a() {
        if (this.f15191d == null) {
            this.f15191d = new E(this);
        }
        E e6 = this.f15191d;
        AbstractC1276k.c(e6);
        return e6;
    }

    public final r4.g b() {
        Matcher matcher = this.a;
        return AbstractC1117a.z(matcher.start(), matcher.end());
    }

    public final C1772j c() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f15189b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC1276k.e(matcher2, "matcher(...)");
        return io.ktor.utils.io.u.b(matcher2, end, charSequence);
    }
}
