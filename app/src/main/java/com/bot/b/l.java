package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.S;
import com.bot.MainActivity;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class l extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity f10930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(MainActivity mainActivity, int i6) {
        super(0);
        this.f10929e = i6;
        this.f10930f = mainActivity;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10929e) {
            case 0:
                MainActivity mainActivity = this.f10930f;
                return new S(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            case 1:
                this.f10930f.reportFullyDrawn();
                return X3.y.a;
            case 2:
                MainActivity mainActivity2 = this.f10930f;
                return new t(mainActivity2.f10937i, new l(mainActivity2, 1));
            default:
                MainActivity mainActivity3 = this.f10930f;
                C0853B c0853b = new C0853B(new I.h(mainActivity3, 6));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC1276k.b(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity3.f10932c.a(new C0862f(c0853b, mainActivity3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new N1.y(1, mainActivity3, c0853b));
                    }
                }
                return c0853b;
        }
    }
}
