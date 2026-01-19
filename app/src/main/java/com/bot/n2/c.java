package N2;

import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import m4.AbstractC1276k;
import org.json.JSONArray;
import u4.AbstractC1776n;
import x4.C1928k;

/* loaded from: classes.dex */
public final class c implements ValueCallback {
    public final /* synthetic */ Handler a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4.g f3811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1928k f3812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebView f3813d;

    public c(Handler handler, C4.g gVar, C1928k c1928k, WebView webView) {
        this.a = handler;
        this.f3811b = gVar;
        this.f3812c = c1928k;
        this.f3813d = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str;
        String str2 = (String) obj;
        this.a.removeCallbacks(this.f3811b);
        C1928k c1928k = this.f3812c;
        if (c1928k.y()) {
            h hVar = h.a;
            if (str2 == null || AbstractC1776n.Q(str2) || str2.equals("null")) {
                str = FlexmarkHtmlConverter.DEFAULT_NODE;
            } else {
                try {
                    str = new JSONArray("[" + str2 + "]").getString(0);
                    AbstractC1276k.c(str);
                } catch (Exception unused) {
                    str = AbstractC1776n.m0(str2, '\"');
                }
            }
            c1928k.k(str);
        }
        this.f3813d.destroy();
    }
}
