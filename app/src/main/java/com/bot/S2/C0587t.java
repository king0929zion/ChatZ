package S2;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import e1.InterfaceC0961c;
import i4.AbstractC1117a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: S2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0587t implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7888c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f7889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f7890f;

    public /* synthetic */ C0587t(T.X x5, T.X x6, int i6) {
        this.f7888c = i6;
        this.f7889e = x5;
        this.f7890f = x6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f7888c) {
            case 0:
                Context context = (Context) obj;
                AbstractC1276k.f(context, "context");
                WebView webView = new WebView(context);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                webView.setBackgroundColor(0);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(false);
                webView.getSettings().setDefaultTextEncodingName("utf-8");
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                webView.setWebViewClient(new C0590w(this.f7889e, this.f7890f));
                return webView;
            case 1:
                float e6 = AbstractC1117a.e(AbstractC1410a.K(((Float) obj).floatValue() / 0.1f) * 0.1f, S.l.f7374V, 2.0f);
                this.f7889e.setValue(Boolean.TRUE);
                this.f7890f.setValue(Float.valueOf(e6));
                return X3.y.a;
            case 2:
                AbstractC1276k.f((InterfaceC0961c) obj, "$this$offset");
                T.X x5 = this.f7889e;
                return new e1.j((((int) (((e1.j) x5.getValue()).a >> 32)) << 32) | ((((int) (((e1.j) x5.getValue()).a & 4294967295L)) + ((int) (((e1.l) this.f7890f.getValue()).a & 4294967295L))) & 4294967295L));
            default:
                float e7 = AbstractC1117a.e(AbstractC1410a.K(((Float) obj).floatValue() / 0.05f) * 0.05f, S.l.f7374V, 1.0f);
                this.f7889e.setValue(Boolean.TRUE);
                this.f7890f.setValue(Float.valueOf(e7));
                return X3.y.a;
        }
    }
}
