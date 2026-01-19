package X4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import d5.C0952l;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class e {
    public static final C0711b[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9439b;

    static {
        C0711b c0711b = new C0711b(C0711b.f9423i, FlexmarkHtmlConverter.DEFAULT_NODE);
        C0952l c0952l = C0711b.f9420f;
        C0711b c0711b2 = new C0711b(c0952l, "GET");
        C0711b c0711b3 = new C0711b(c0952l, "POST");
        C0952l c0952l2 = C0711b.f9421g;
        C0711b c0711b4 = new C0711b(c0952l2, "/");
        C0711b c0711b5 = new C0711b(c0952l2, "/index.html");
        C0952l c0952l3 = C0711b.f9422h;
        C0711b c0711b6 = new C0711b(c0952l3, "http");
        C0711b c0711b7 = new C0711b(c0952l3, "https");
        C0952l c0952l4 = C0711b.f9419e;
        C0711b[] c0711bArr = {c0711b, c0711b2, c0711b3, c0711b4, c0711b5, c0711b6, c0711b7, new C0711b(c0952l4, "200"), new C0711b(c0952l4, "204"), new C0711b(c0952l4, "206"), new C0711b(c0952l4, "304"), new C0711b(c0952l4, "400"), new C0711b(c0952l4, "404"), new C0711b(c0952l4, "500"), new C0711b("accept-charset", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("accept-encoding", "gzip, deflate"), new C0711b("accept-language", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("accept-ranges", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("accept", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("access-control-allow-origin", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("age", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("allow", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("authorization", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("cache-control", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("content-disposition", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("content-encoding", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("content-language", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("content-length", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("content-location", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("content-range", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("content-type", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("cookie", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("date", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("etag", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("expect", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("expires", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("from", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("host", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("if-match", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("if-modified-since", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("if-none-match", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("if-range", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("if-unmodified-since", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("last-modified", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("link", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("location", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("max-forwards", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("proxy-authenticate", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("proxy-authorization", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("range", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("referer", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("refresh", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("retry-after", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("server", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("set-cookie", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("strict-transport-security", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("transfer-encoding", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("user-agent", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("vary", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("via", FlexmarkHtmlConverter.DEFAULT_NODE), new C0711b("www-authenticate", FlexmarkHtmlConverter.DEFAULT_NODE)};
        a = c0711bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i6 = 0; i6 < 61; i6++) {
            if (!linkedHashMap.containsKey(c0711bArr[i6].a)) {
                linkedHashMap.put(c0711bArr[i6].a, Integer.valueOf(i6));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC1276k.e(unmodifiableMap, "unmodifiableMap(result)");
        f9439b = unmodifiableMap;
    }

    public static void a(C0952l c0952l) {
        AbstractC1276k.f(c0952l, Attribute.NAME_ATTR);
        int d6 = c0952l.d();
        for (int i6 = 0; i6 < d6; i6++) {
            byte i7 = c0952l.i(i6);
            if (65 <= i7 && i7 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0952l.q()));
            }
        }
    }
}
