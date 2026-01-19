package Q4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

/* loaded from: classes.dex */
public enum u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2(FlexmarkHtmlConverter.H2_NODE),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: c, reason: collision with root package name */
    public final String f6635c;

    u(String str) {
        this.f6635c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6635c;
    }
}
