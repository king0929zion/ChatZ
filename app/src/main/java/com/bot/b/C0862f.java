package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import com.bot.MainActivity;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0862f implements InterfaceC0844s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0853B f10916c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f10917e;

    public /* synthetic */ C0862f(C0853B c0853b, MainActivity mainActivity) {
        this.f10916c = c0853b;
        this.f10917e = mainActivity;
    }

    @Override // androidx.lifecycle.InterfaceC0844s
    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
        if (enumC0841o == EnumC0841o.ON_CREATE) {
            OnBackInvokedDispatcher a = AbstractC0863g.a(this.f10917e);
            C0853B c0853b = this.f10916c;
            c0853b.f10902e = a;
            c0853b.d(c0853b.f10904g);
        }
    }
}
