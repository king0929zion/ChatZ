package S2;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* renamed from: S2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590w extends WebViewClient {
    public final /* synthetic */ T.X a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T.X f7903b;

    public C0590w(T.X x5, T.X x6) {
        this.a = x5;
        this.f7903b = x6;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        AbstractC1276k.f(webView, "view");
        final int i6 = 0;
        final T.X x5 = this.a;
        webView.evaluateJavascript("document.body.scrollHeight", new ValueCallback() { // from class: S2.v
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                String obj2;
                String m02;
                String obj3;
                String m03;
                int i7 = i6;
                Float f6 = null;
                T.X x6 = x5;
                String str2 = (String) obj;
                switch (i7) {
                    case 0:
                        if (str2 != null && (obj2 = AbstractC1776n.l0(str2).toString()) != null && (m02 = AbstractC1776n.m0(obj2, '\"')) != null) {
                            f6 = u4.t.v(m02);
                        }
                        if (f6 == null || f6.floatValue() <= S.l.f7374V) {
                            return;
                        }
                        x6.setValue(Float.valueOf(f6.floatValue() + 2.0f));
                        return;
                    default:
                        if (str2 != null && (obj3 = AbstractC1776n.l0(str2).toString()) != null && (m03 = AbstractC1776n.m0(obj3, '\"')) != null) {
                            f6 = u4.t.v(m03);
                        }
                        if (f6 == null || f6.floatValue() <= S.l.f7374V) {
                            return;
                        }
                        x6.setValue(Float.valueOf(f6.floatValue() + 2.0f));
                        return;
                }
            }
        });
        final int i7 = 1;
        final T.X x6 = this.f7903b;
        webView.evaluateJavascript("document.body.scrollWidth", new ValueCallback() { // from class: S2.v
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                String obj2;
                String m02;
                String obj3;
                String m03;
                int i72 = i7;
                Float f6 = null;
                T.X x62 = x6;
                String str2 = (String) obj;
                switch (i72) {
                    case 0:
                        if (str2 != null && (obj2 = AbstractC1776n.l0(str2).toString()) != null && (m02 = AbstractC1776n.m0(obj2, '\"')) != null) {
                            f6 = u4.t.v(m02);
                        }
                        if (f6 == null || f6.floatValue() <= S.l.f7374V) {
                            return;
                        }
                        x62.setValue(Float.valueOf(f6.floatValue() + 2.0f));
                        return;
                    default:
                        if (str2 != null && (obj3 = AbstractC1776n.l0(str2).toString()) != null && (m03 = AbstractC1776n.m0(obj3, '\"')) != null) {
                            f6 = u4.t.v(m03);
                        }
                        if (f6 == null || f6.floatValue() <= S.l.f7374V) {
                            return;
                        }
                        x62.setValue(Float.valueOf(f6.floatValue() + 2.0f));
                        return;
                }
            }
        });
    }
}
