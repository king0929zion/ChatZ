package I3;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: k, reason: collision with root package name */
    public static final H f2704k;
    public E a;

    /* renamed from: b, reason: collision with root package name */
    public String f2705b;

    /* renamed from: c, reason: collision with root package name */
    public int f2706c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2707d;

    /* renamed from: e, reason: collision with root package name */
    public String f2708e;

    /* renamed from: f, reason: collision with root package name */
    public String f2709f;

    /* renamed from: g, reason: collision with root package name */
    public String f2710g;

    /* renamed from: h, reason: collision with root package name */
    public List f2711h;

    /* renamed from: i, reason: collision with root package name */
    public z f2712i;

    /* renamed from: j, reason: collision with root package name */
    public I f2713j;

    static {
        B b5 = new B();
        D.b(b5, "http://localhost");
        f2704k = b5.b();
    }

    public B() {
        E e6 = E.f2715c;
        y.f2771b.getClass();
        AbstractC1276k.f(e6, "protocol");
        this.a = e6;
        this.f2705b = FlexmarkHtmlConverter.DEFAULT_NODE;
        this.f2706c = 0;
        this.f2707d = false;
        this.f2708e = null;
        this.f2709f = null;
        Set set = AbstractC0238b.a;
        Charset charset = AbstractC1763a.a;
        AbstractC1276k.f(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        AbstractC1276k.e(newEncoder, "charset.newEncoder()");
        AbstractC0238b.g(Y4.d.B(newEncoder, FlexmarkHtmlConverter.DEFAULT_NODE, 0, 0), new B0.G(sb, 12));
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f2710g = sb2;
        Y3.v<String> vVar = Y3.v.f9812c;
        this.f2711h = new ArrayList(Y3.n.Z(vVar, 10));
        n nVar = new n(1);
        for (String str : Y3.x.f9814c) {
            AbstractC1276k.f(str, Attribute.NAME_ATTR);
            String f6 = AbstractC0238b.f(str, false);
            ArrayList arrayList = new ArrayList(Y3.n.Z(vVar, 10));
            for (String str2 : vVar) {
                AbstractC1276k.f(str2, "<this>");
                arrayList.add(AbstractC0238b.f(str2, true));
            }
            nVar.c(f6, arrayList);
        }
        this.f2712i = nVar;
        this.f2713j = new I(nVar);
    }

    public final void a() {
        if (this.f2705b.length() <= 0 && !AbstractC1276k.b(this.a.a, "file")) {
            H h3 = f2704k;
            this.f2705b = h3.f2721b;
            E e6 = this.a;
            E e7 = E.f2715c;
            if (AbstractC1276k.b(e6, E.f2715c)) {
                this.a = h3.a;
            }
            if (this.f2706c == 0) {
                this.f2706c = h3.f2722c;
            }
        }
    }

    public final H b() {
        a();
        E e6 = this.a;
        String str = this.f2705b;
        int i6 = this.f2706c;
        List list = this.f2711h;
        ArrayList arrayList = new ArrayList(Y3.n.Z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0238b.d((String) it.next()));
        }
        y l3 = Y3.C.l((z) this.f2713j.f2733b);
        String e7 = AbstractC0238b.e(0, 0, 15, this.f2710g);
        String str2 = this.f2708e;
        String d6 = str2 != null ? AbstractC0238b.d(str2) : null;
        String str3 = this.f2709f;
        String d7 = str3 != null ? AbstractC0238b.d(str3) : null;
        boolean z5 = this.f2707d;
        a();
        StringBuilder sb = new StringBuilder(PegdownExtensions.WIKILINKS);
        Y4.d.h(this, sb);
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "appendTo(StringBuilder(256)).toString()");
        return new H(e6, str, i6, arrayList, l3, e7, d6, d7, z5, sb2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(PegdownExtensions.WIKILINKS);
        Y4.d.h(this, sb);
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "appendTo(StringBuilder(256)).toString()");
        return sb2;
    }
}
