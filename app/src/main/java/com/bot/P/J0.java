package p;

import android.view.View;
import android.widget.Magnifier;
import e1.InterfaceC0961c;

/* loaded from: classes.dex */
public final class J0 implements H0 {

    /* renamed from: b, reason: collision with root package name */
    public static final J0 f13593b = new J0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final J0 f13594c = new J0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ J0(int i6) {
        this.a = i6;
    }

    @Override // p.H0
    public final boolean a() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // p.H0
    public final G0 b(View view, InterfaceC0961c interfaceC0961c) {
        switch (this.a) {
            case 0:
                return new I0(new Magnifier(view));
            default:
                return new I0(new Magnifier(view));
        }
    }
}
