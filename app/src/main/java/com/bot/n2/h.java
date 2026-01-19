package N2;

import Y3.v;
import Y4.l;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import i4.AbstractC1121e;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;
import u4.AbstractC1763a;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class h {
    public static final h a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final FlexmarkHtmlConverter f3827b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, N2.h] */
    static {
        FlexmarkHtmlConverter build = FlexmarkHtmlConverter.builder().build();
        AbstractC1276k.e(build, "build(...)");
        f3827b = build;
    }

    public static String a(a aVar) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = aVar.f3806c.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Attribute.TITLE_ATTR, aVar.a);
        jSONObject.put("content", aVar.f3805b);
        jSONObject.put("links", jSONArray);
        String jSONObject2 = jSONObject.toString();
        AbstractC1276k.e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public static a c(String str, String str2) {
        String str3 = null;
        String obj = str2 != null ? AbstractC1776n.l0(str2).toString() : null;
        if (obj == null) {
            obj = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (AbstractC1776n.Q(obj)) {
            throw new IllegalArgumentException("Metaso API key missing");
        }
        URLConnection openConnection = new URL("https://metaso.cn/api/v1/reader").openConnection();
        AbstractC1276k.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(7000);
        httpURLConnection.setReadTimeout(7000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(obj));
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "text/plain");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", str);
        String jSONObject2 = jSONObject.toString();
        AbstractC1276k.e(jSONObject2, "toString(...)");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            Charset charset = AbstractC1763a.a;
            byte[] bytes = jSONObject2.getBytes(charset);
            AbstractC1276k.e(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), 8192);
                try {
                    str3 = AbstractC1121e.m(bufferedReader);
                    bufferedReader.close();
                } finally {
                }
            }
            if (str3 == null) {
                str3 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            if (200 <= responseCode && responseCode < 300) {
                return new a(FlexmarkHtmlConverter.DEFAULT_NODE, AbstractC1776n.l0(str3).toString(), v.f9812c);
            }
            throw new IllegalStateException(("Metaso reader failed: HTTP " + responseCode).toString());
        } finally {
        }
    }

    public static a d(String str, String str2) {
        String str3;
        List list = null;
        String obj = str2 != null ? AbstractC1776n.l0(str2).toString() : null;
        if (obj == null) {
            obj = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (AbstractC1776n.Q(obj)) {
            throw new IllegalArgumentException("Ollama API key missing");
        }
        URLConnection openConnection = new URL("https://ollama.com/api/web_fetch").openConnection();
        AbstractC1276k.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(7000);
        httpURLConnection.setReadTimeout(7000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(obj));
        httpURLConnection.setRequestProperty(HttpConnection.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", str);
        String jSONObject2 = jSONObject.toString();
        AbstractC1276k.e(jSONObject2, "toString(...)");
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            Charset charset = AbstractC1763a.a;
            byte[] bytes = jSONObject2.getBytes(charset);
            AbstractC1276k.e(bytes, "getBytes(...)");
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, charset), 8192);
                try {
                    str3 = AbstractC1121e.m(bufferedReader);
                    bufferedReader.close();
                } finally {
                }
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Ollama fetch failed: HTTP " + responseCode).toString());
            }
            JSONObject jSONObject3 = new JSONObject(str3);
            String optString = jSONObject3.optString(Attribute.TITLE_ATTR, FlexmarkHtmlConverter.DEFAULT_NODE);
            AbstractC1276k.e(optString, "optString(...)");
            String optString2 = jSONObject3.optString("content", FlexmarkHtmlConverter.DEFAULT_NODE);
            AbstractC1276k.e(optString2, "optString(...)");
            JSONArray optJSONArray = jSONObject3.optJSONArray("links");
            if (optJSONArray != null) {
                Z3.b w5 = l.w();
                int length = optJSONArray.length();
                for (int i6 = 0; i6 < length; i6++) {
                    String optString3 = optJSONArray.optString(i6, FlexmarkHtmlConverter.DEFAULT_NODE);
                    AbstractC1276k.e(optString3, "optString(...)");
                    String obj2 = AbstractC1776n.l0(optString3).toString();
                    if (!AbstractC1776n.Q(obj2)) {
                        w5.add(obj2);
                    }
                }
                list = l.p(w5);
            }
            if (list == null) {
                list = v.f9812c;
            }
            return new a(optString, optString2, list);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (r8 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static N2.a f(org.jsoup.nodes.Document r8) {
        /*
            java.lang.String r0 = r8.title()
            java.lang.String r1 = "title(...)"
            m4.AbstractC1276k.e(r0, r1)
            java.lang.CharSequence r0 = u4.AbstractC1776n.l0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "script, style, nav, footer, header, aside, form, noscript, iframe, svg, canvas,button, input, textarea, select, option, link, meta"
            org.jsoup.select.Elements r1 = r8.select(r1)
            r1.remove()
            java.lang.String r1 = "article, main, [role=main]"
            org.jsoup.nodes.Element r1 = r8.selectFirst(r1)
            if (r1 != 0) goto L2b
            org.jsoup.nodes.Element r1 = r8.body()
            java.lang.String r8 = "body(...)"
            m4.AbstractC1276k.e(r1, r8)
        L2b:
            java.lang.String r8 = r1.html()
            java.lang.String r2 = ""
            if (r8 != 0) goto L34
            r8 = r2
        L34:
            com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter r3 = N2.h.f3827b
            java.lang.String r8 = r3.convert(r8)
            java.lang.String r3 = "convert(...)"
            m4.AbstractC1276k.e(r8, r3)
            java.lang.CharSequence r8 = u4.AbstractC1776n.l0(r8)
            java.lang.String r8 = r8.toString()
            boolean r3 = u4.AbstractC1776n.Q(r8)
            r4 = 0
            if (r3 == 0) goto L61
            java.lang.String r8 = r1.text()
            if (r8 == 0) goto L5d
            java.lang.CharSequence r8 = u4.AbstractC1776n.l0(r8)
            java.lang.String r8 = r8.toString()
            goto L5e
        L5d:
            r8 = r4
        L5e:
            if (r8 != 0) goto L61
            goto L62
        L61:
            r2 = r8
        L62:
            java.lang.String r8 = "a[href]"
            org.jsoup.select.Elements r8 = r1.select(r8)
            if (r8 == 0) goto La3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r8.size()
            r5 = 0
        L74:
            if (r5 >= r3) goto L95
            java.lang.Object r6 = r8.get(r5)
            int r5 = r5 + 1
            org.jsoup.nodes.Element r6 = (org.jsoup.nodes.Element) r6
            java.lang.String r7 = "href"
            java.lang.String r6 = r6.absUrl(r7)
            m4.AbstractC1276k.c(r6)
            boolean r7 = u4.AbstractC1776n.Q(r6)
            if (r7 != 0) goto L8e
            goto L8f
        L8e:
            r6 = r4
        L8f:
            if (r6 == 0) goto L74
            r1.add(r6)
            goto L74
        L95:
            java.util.Set r8 = Y3.m.M0(r1)
            java.util.List r8 = Y3.m.J0(r8)
            r1 = 10
            java.util.List r4 = Y3.m.H0(r8, r1)
        La3:
            if (r4 != 0) goto La7
            Y3.v r4 = Y3.v.f9812c
        La7:
            N2.a r8 = new N2.a
            r8.<init>(r0, r2, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.h.f(org.jsoup.nodes.Document):N2.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r7, D2.e r8, java.lang.String r9, android.content.Context r10, d4.c r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof N2.b
            if (r0 == 0) goto L13
            r0 = r11
            N2.b r0 = (N2.b) r0
            int r1 = r0.f3810j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3810j = r1
            goto L18
        L13:
            N2.b r0 = new N2.b
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.f3808h
            int r1 = r0.f3810j
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L36
            if (r1 != r3) goto L2e
            N2.h r7 = r0.f3807g
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L2b
            goto Lae
        L2b:
            r7 = move-exception
            goto Lb8
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            N2.h r7 = r0.f3807g
            X3.a.e(r11)     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L3c:
            X3.a.e(r11)
            boolean r11 = u4.AbstractC1776n.Q(r7)
            if (r11 == 0) goto L51
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "url is required"
            r7.<init>(r8)
            X3.k r7 = X3.a.b(r7)
            return r7
        L51:
            java.lang.String r11 = "http://"
            r1 = 0
            boolean r11 = u4.u.D(r7, r11, r1)
            if (r11 != 0) goto L71
            java.lang.String r11 = "https://"
            boolean r4 = u4.u.D(r7, r11, r1)
            if (r4 == 0) goto L63
            goto L71
        L63:
            char[] r4 = new char[r2]
            r5 = 47
            r4[r1] = r5
            java.lang.String r7 = u4.AbstractC1776n.p0(r7, r4)
            java.lang.String r7 = j1.AbstractC1135a.f(r11, r7)
        L71:
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L2b
            c4.a r11 = c4.EnumC0927a.f11114c
            if (r8 == 0) goto La1
            if (r8 == r2) goto L9c
            if (r8 == r3) goto L96
            r9 = 3
            if (r8 != r9) goto L90
            r0.f3807g = r6     // Catch: java.lang.Throwable -> L2b
            r0.f3810j = r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r6.e(r7, r10, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r11) goto L8b
            goto Lab
        L8b:
            r11 = r7
            r7 = r6
        L8d:
            N2.a r11 = (N2.a) r11     // Catch: java.lang.Throwable -> L2b
            goto Lb0
        L90:
            N0.e r7 = new N0.e     // Catch: java.lang.Throwable -> L2b
            r7.<init>()     // Catch: java.lang.Throwable -> L2b
            throw r7     // Catch: java.lang.Throwable -> L2b
        L96:
            N2.a r11 = c(r7, r9)     // Catch: java.lang.Throwable -> L2b
        L9a:
            r7 = r6
            goto Lb0
        L9c:
            N2.a r11 = d(r7, r9)     // Catch: java.lang.Throwable -> L2b
            goto L9a
        La1:
            r0.f3807g = r6     // Catch: java.lang.Throwable -> L2b
            r0.f3810j = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r7 = r6.e(r7, r10, r0)     // Catch: java.lang.Throwable -> L2b
            if (r7 != r11) goto Lac
        Lab:
            return r11
        Lac:
            r11 = r7
            r7 = r6
        Lae:
            N2.a r11 = (N2.a) r11     // Catch: java.lang.Throwable -> L2b
        Lb0:
            r7.getClass()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r7 = a(r11)     // Catch: java.lang.Throwable -> L2b
            return r7
        Lb8:
            X3.k r7 = X3.a.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.h.b(java.lang.String, D2.e, java.lang.String, android.content.Context, d4.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, android.content.Context r7, d4.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof N2.f
            if (r0 == 0) goto L13
            r0 = r8
            N2.f r0 = (N2.f) r0
            int r1 = r0.f3823j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3823j = r1
            goto L18
        L13:
            N2.f r0 = new N2.f
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f3821h
            int r1 = r0.f3823j
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            java.lang.String r6 = r0.f3820g
            X3.a.e(r8)
            goto Lb2
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            X3.a.e(r8)
            java.util.Locale r8 = java.util.Locale.getDefault()
            java.lang.String r1 = r8.getLanguage()
            java.lang.String r3 = r8.getCountry()
            java.lang.String r8 = r8.getLanguage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "-"
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ","
            r4.append(r1)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            org.jsoup.Connection r1 = org.jsoup.Jsoup.connect(r6)
            java.lang.String r3 = "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36"
            org.jsoup.Connection r1 = r1.userAgent(r3)
            java.lang.String r3 = "Accept"
        */
        //  java.lang.String r4 = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
        /*
            org.jsoup.Connection r1 = r1.header(r3, r4)
            java.lang.String r3 = "Accept-Language"
            org.jsoup.Connection r8 = r1.header(r3, r8)
            java.lang.String r1 = "Cache-Control"
            java.lang.String r3 = "no-cache"
            org.jsoup.Connection r8 = r8.header(r1, r3)
            r1 = 7000(0x1b58, float:9.809E-42)
            org.jsoup.Connection r8 = r8.timeout(r1)
            org.jsoup.nodes.Document r8 = r8.get()
            java.lang.String r1 = "get(...)"
            m4.AbstractC1276k.e(r8, r1)
            N2.a r8 = f(r8)
            java.lang.String r1 = r8.f3805b
            boolean r1 = u4.AbstractC1776n.Q(r1)
            if (r1 != 0) goto L9b
            return r8
        L9b:
            E4.e r8 = x4.AbstractC1898K.a
            y4.d r8 = C4.o.a
            N2.g r1 = new N2.g
            r3 = 0
            r1.<init>(r7, r6, r3)
            r0.f3820g = r6
            r0.f3823j = r2
            java.lang.Object r8 = x4.AbstractC1888A.H(r8, r1, r0)
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r8 != r7) goto Lb2
            return r7
        Lb2:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto Ld2
            boolean r7 = u4.AbstractC1776n.Q(r8)
            if (r7 != 0) goto Ld2
            org.jsoup.nodes.Document r6 = org.jsoup.Jsoup.parse(r8, r6)
            java.lang.String r7 = "parse(...)"
            m4.AbstractC1276k.e(r6, r7)
            N2.a r6 = f(r6)
            java.lang.String r7 = r6.f3805b
            boolean r7 = u4.AbstractC1776n.Q(r7)
            if (r7 != 0) goto Ld2
            return r6
        Ld2:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Web fetch failed: empty content"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.h.e(java.lang.String, android.content.Context, d4.c):java.lang.Object");
    }
}
