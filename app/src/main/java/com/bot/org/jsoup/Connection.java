package org.jsoup;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.helper.RequestAuthenticator;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

/* loaded from: classes.dex */
public interface Connection {

    /* loaded from: classes.dex */
    public interface Base<T extends Base<T>> {
        T addHeader(String str, String str2);

        String cookie(String str);

        T cookie(String str, String str2);

        Map<String, String> cookies();

        boolean hasCookie(String str);

        boolean hasHeader(String str);

        boolean hasHeaderWithValue(String str, String str2);

        String header(String str);

        T header(String str, String str2);

        List<String> headers(String str);

        Map<String, String> headers();

        T method(Method method);

        Method method();

        Map<String, List<String>> multiHeaders();

        T removeCookie(String str);

        T removeHeader(String str);

        URL url();

        T url(URL url);
    }

    /* loaded from: classes.dex */
    public interface KeyVal {
        String contentType();

        KeyVal contentType(String str);

        boolean hasInputStream();

        InputStream inputStream();

        KeyVal inputStream(InputStream inputStream);

        String key();

        KeyVal key(String str);

        String value();

        KeyVal value(String str);
    }

    /* loaded from: classes.dex */
    public enum Method {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(true),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);

        private final boolean hasBody;

        Method(boolean z5) {
            this.hasBody = z5;
        }

        public final boolean hasBody() {
            return this.hasBody;
        }
    }

    /* loaded from: classes.dex */
    public interface Request extends Base<Request> {
        default Request auth(RequestAuthenticator requestAuthenticator) {
            throw new UnsupportedOperationException();
        }

        Collection<KeyVal> data();

        Request data(KeyVal keyVal);

        Request followRedirects(boolean z5);

        boolean followRedirects();

        Request ignoreContentType(boolean z5);

        boolean ignoreContentType();

        Request ignoreHttpErrors(boolean z5);

        boolean ignoreHttpErrors();

        int maxBodySize();

        Request maxBodySize(int i6);

        Request parser(Parser parser);

        Parser parser();

        String postDataCharset();

        Request postDataCharset(String str);

        Proxy proxy();

        Request proxy(String str, int i6);

        Request proxy(Proxy proxy);

        String requestBody();

        Request requestBody(String str);

        SSLSocketFactory sslSocketFactory();

        void sslSocketFactory(SSLSocketFactory sSLSocketFactory);

        int timeout();

        Request timeout(int i6);

        default RequestAuthenticator auth() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public interface Response extends Base<Response> {
        String body();

        byte[] bodyAsBytes();

        BufferedInputStream bodyStream();

        Response bufferUp();

        String charset();

        Response charset(String str);

        String contentType();

        Document parse();

        int statusCode();

        String statusMessage();
    }

    default Connection auth(RequestAuthenticator requestAuthenticator) {
        throw new UnsupportedOperationException();
    }

    Connection cookie(String str, String str2);

    CookieStore cookieStore();

    Connection cookieStore(CookieStore cookieStore);

    Connection cookies(Map<String, String> map);

    KeyVal data(String str);

    Connection data(String str, String str2);

    Connection data(String str, String str2, InputStream inputStream);

    Connection data(String str, String str2, InputStream inputStream, String str3);

    Connection data(Collection<KeyVal> collection);

    Connection data(Map<String, String> map);

    Connection data(String... strArr);

    Response execute();

    Connection followRedirects(boolean z5);

    Document get();

    Connection header(String str, String str2);

    Connection headers(Map<String, String> map);

    Connection ignoreContentType(boolean z5);

    Connection ignoreHttpErrors(boolean z5);

    Connection maxBodySize(int i6);

    Connection method(Method method);

    Connection newRequest();

    default Connection newRequest(String str) {
        return newRequest().url(str);
    }

    Connection parser(Parser parser);

    Document post();

    Connection postDataCharset(String str);

    Connection proxy(String str, int i6);

    Connection proxy(Proxy proxy);

    Connection referrer(String str);

    Request request();

    Connection request(Request request);

    Connection requestBody(String str);

    Response response();

    Connection response(Response response);

    Connection sslSocketFactory(SSLSocketFactory sSLSocketFactory);

    Connection timeout(int i6);

    Connection url(String str);

    Connection url(URL url);

    Connection userAgent(String str);

    default Connection newRequest(URL url) {
        return newRequest().url(url);
    }
}
