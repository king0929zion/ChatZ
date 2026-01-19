package x2;

import b.m;
import com.bot.MainActivity;
import d.InterfaceC0933b;

/* renamed from: x2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1873i implements InterfaceC0933b {
    public final /* synthetic */ MainActivity a;

    public C1873i(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // d.InterfaceC0933b
    public final void a(m mVar) {
        MainActivity mainActivity = this.a;
        if (mainActivity.f11133A) {
            return;
        }
        mainActivity.f11133A = true;
        mainActivity.f11134B = (G2.d) ((C1867c) ((InterfaceC1876l) mainActivity.b())).a.f15576d.get();
    }
}
