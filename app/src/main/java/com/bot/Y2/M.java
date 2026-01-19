package Y2;

import A4.g0;
import com.tencent.mmkv.MMKV;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class M {
    public final MMKV a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f9640b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.Q f9641c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f9642d;

    /* renamed from: e, reason: collision with root package name */
    public final A4.Q f9643e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f9644f;

    /* renamed from: g, reason: collision with root package name */
    public final A4.Q f9645g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f9646h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.Q f9647i;

    public M(MMKV mmkv) {
        AbstractC1276k.f(mmkv, "mmkv");
        this.a = mmkv;
        String decodeString = mmkv.decodeString("search_service_id", "bing");
        D2.e.Companion.getClass();
        D2.e a = D2.d.a(decodeString);
        String str = a.f1281c;
        if (!str.equals(decodeString)) {
            mmkv.encode("search_service_id", str);
        }
        g0 b5 = A4.W.b(a);
        this.f9640b = b5;
        this.f9641c = new A4.Q(b5);
        String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        String decodeString2 = mmkv.decodeString("search_service_ollama_api_key", FlexmarkHtmlConverter.DEFAULT_NODE);
        g0 b6 = A4.W.b(decodeString2 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : decodeString2);
        this.f9642d = b6;
        this.f9643e = new A4.Q(b6);
        String decodeString3 = mmkv.decodeString("search_service_metaso_api_key", FlexmarkHtmlConverter.DEFAULT_NODE);
        g0 b7 = A4.W.b(decodeString3 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : decodeString3);
        this.f9644f = b7;
        this.f9645g = new A4.Q(b7);
        String decodeString4 = mmkv.decodeString("search_service_exa_api_key", FlexmarkHtmlConverter.DEFAULT_NODE);
        g0 b8 = A4.W.b(decodeString4 != null ? decodeString4 : str2);
        this.f9646h = b8;
        this.f9647i = new A4.Q(b8);
    }

    public final String a(D2.e eVar) {
        AbstractC1276k.f(eVar, "serviceId");
        int ordinal = eVar.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            Object value = this.f9643e.f201c.getValue();
            return (String) (AbstractC1776n.Q((String) value) ? null : value);
        }
        if (ordinal == 2) {
            Object value2 = this.f9645g.f201c.getValue();
            return (String) (AbstractC1776n.Q((String) value2) ? null : value2);
        }
        if (ordinal != 3) {
            throw new RuntimeException();
        }
        Object value3 = this.f9647i.f201c.getValue();
        return (String) (AbstractC1776n.Q((String) value3) ? null : value3);
    }
}
