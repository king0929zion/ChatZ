package N2;

import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m4.AbstractC1276k;
import x4.C1928k;

/* loaded from: classes.dex */
public final class d extends WebViewClient {
    public final /* synthetic */ Handler a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4.g f3814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1928k f3815c;

    public d(Handler handler, C4.g gVar, C1928k c1928k) {
        this.a = handler;
        this.f3814b = gVar;
        this.f3815c = c1928k;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC1276k.f(webView, "view");
        AbstractC1276k.f(str, "url");
        webView.evaluateJavascript("document.documentElement.outerHTML", new c(this.a, this.f3814b, this.f3815c, webView));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        AbstractC1276k.f(webView, "view");
        AbstractC1276k.f(webResourceRequest, "request");
        AbstractC1276k.f(webResourceError, "error");
        this.a.removeCallbacks(this.f3814b);
        C1928k c1928k = this.f3815c;
        if (c1928k.y()) {
            c1928k.k(null);
        }
        webView.destroy();
    }
}
