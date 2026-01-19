package h1;

import H0.r0;
import T.C0622o;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class m extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f11885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.c f11886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0622o f11887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0.f f11888h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11889i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f11890j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, l4.c cVar, C0622o c0622o, e0.f fVar, int i6, View view) {
        super(0);
        this.f11885e = context;
        this.f11886f = cVar;
        this.f11887g = c0622o;
        this.f11888h = fVar;
        this.f11889i = i6;
        this.f11890j = view;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        KeyEvent.Callback callback = this.f11890j;
        AbstractC1276k.d(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new x(this.f11885e, this.f11886f, this.f11887g, this.f11888h, this.f11889i, (r0) callback).getLayoutNode();
    }
}
