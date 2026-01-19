package N2;

import X3.y;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.C1928k;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class g extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3824h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f3825i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3826j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3825i = context;
        this.f3826j = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((g) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new g(this.f3825i, this.f3826j, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3824h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return obj;
        }
        X3.a.e(obj);
        h hVar = h.a;
        this.f3824h = 1;
        C1928k c1928k = new C1928k(1, Y4.d.K(this));
        c1928k.t();
        Handler handler = new Handler(Looper.getMainLooper());
        WebView webView = new WebView(this.f3825i);
        webView.setBackgroundColor(0);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
        settings.setLoadsImagesAutomatically(false);
        settings.setBlockNetworkImage(true);
        settings.setCacheMode(2);
        settings.setMixedContentMode(2);
        C4.g gVar = new C4.g(2, c1928k, webView);
        webView.setWebViewClient(new d(handler, gVar, c1928k));
        c1928k.v(new e(handler, gVar, webView, 0));
        handler.postDelayed(gVar, 9000L);
        webView.loadUrl(this.f3826j);
        Object s5 = c1928k.s();
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        return s5 == enumC0927a ? enumC0927a : s5;
    }
}
