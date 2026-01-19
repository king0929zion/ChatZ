package org.jsoup.helper;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

/* loaded from: classes.dex */
final class UrlBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: q, reason: collision with root package name */
    StringBuilder f13524q;

    /* renamed from: u, reason: collision with root package name */
    URL f13525u;

    public UrlBuilder(URL url) {
        this.f13525u = url;
        if (url.getQuery() != null) {
            StringBuilder borrowBuilder = StringUtil.borrowBuilder();
            borrowBuilder.append(this.f13525u.getQuery());
            this.f13524q = borrowBuilder;
        }
    }

    private static void appendToAscii(String str, boolean z5, StringBuilder sb) {
        int i6 = 0;
        while (i6 < str.length()) {
            int codePointAt = str.codePointAt(i6);
            if (codePointAt == 32) {
                sb.append(z5 ? '+' : "%20");
            } else if (codePointAt > 127) {
                sb.append(URLEncoder.encode(new String(Character.toChars(codePointAt)), DataUtil.UTF_8.name()));
                if (Character.charCount(codePointAt) == 2) {
                    i6++;
                }
            } else {
                sb.append((char) codePointAt);
            }
            i6++;
        }
    }

    private static String decodePart(String str) {
        try {
            return URLDecoder.decode(str, DataUtil.UTF_8.name());
        } catch (UnsupportedEncodingException e6) {
            throw new RuntimeException(e6);
        }
    }

    public void appendKeyVal(Connection.KeyVal keyVal) {
        StringBuilder sb = this.f13524q;
        if (sb == null) {
            this.f13524q = StringUtil.borrowBuilder();
        } else {
            sb.append('&');
        }
        StringBuilder sb2 = this.f13524q;
        String key = keyVal.key();
        Charset charset = DataUtil.UTF_8;
        sb2.append(URLEncoder.encode(key, charset.name()));
        sb2.append('=');
        sb2.append(URLEncoder.encode(keyVal.value(), charset.name()));
    }

    public URL build() {
        try {
            URI uri = new URI(this.f13525u.getProtocol(), this.f13525u.getUserInfo(), IDN.toASCII(decodePart(this.f13525u.getHost())), this.f13525u.getPort(), null, null, null);
            StringBuilder borrowBuilder = StringUtil.borrowBuilder();
            borrowBuilder.append(uri.toASCIIString());
            appendToAscii(this.f13525u.getPath(), false, borrowBuilder);
            if (this.f13524q != null) {
                borrowBuilder.append('?');
                appendToAscii(StringUtil.releaseBuilder(this.f13524q), true, borrowBuilder);
            }
            if (this.f13525u.getRef() != null) {
                borrowBuilder.append('#');
                appendToAscii(this.f13525u.getRef(), false, borrowBuilder);
            }
            URL url = new URL(StringUtil.releaseBuilder(borrowBuilder));
            this.f13525u = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return this.f13525u;
        }
    }
}
