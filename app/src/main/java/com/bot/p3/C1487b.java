package p3;

import android.app.Application;
import androidx.lifecycle.Y;
import com.bot.MainActivity;
import i4.AbstractC1120d;
import m4.AbstractC1289x;
import r3.InterfaceC1634a;
import x2.C1867c;
import x2.C1869e;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1487b implements r3.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13907c;

    /* renamed from: e, reason: collision with root package name */
    public final MainActivity f13908e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13909f;

    /* renamed from: g, reason: collision with root package name */
    public final r3.b f13910g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC1634a f13911h;

    public C1487b(MainActivity mainActivity, int i6) {
        this.f13907c = i6;
        switch (i6) {
            case 1:
                this.f13909f = new Object();
                this.f13908e = mainActivity;
                this.f13910g = mainActivity;
                return;
            default:
                this.f13909f = new Object();
                this.f13908e = mainActivity;
                this.f13910g = new C1487b(mainActivity, 1);
                return;
        }
    }

    public static Y c(MainActivity mainActivity, MainActivity mainActivity2) {
        return new Y(mainActivity.e(), new F1.d(mainActivity2, 2), mainActivity.d());
    }

    public C1867c a() {
        String str;
        MainActivity mainActivity = this.f13908e;
        if (mainActivity.getApplication() instanceof r3.b) {
            C1869e c1869e = (C1869e) ((InterfaceC1486a) AbstractC1120d.o((C1487b) this.f13910g, InterfaceC1486a.class));
            return new C1867c(c1869e.a, c1869e.f15570b);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // r3.b
    public final Object b() {
        switch (this.f13907c) {
            case 0:
                if (((C1867c) this.f13911h) == null) {
                    synchronized (this.f13909f) {
                        try {
                            if (((C1867c) this.f13911h) == null) {
                                this.f13911h = a();
                            }
                        } finally {
                        }
                    }
                }
                return (C1867c) this.f13911h;
            default:
                if (((C1869e) this.f13911h) == null) {
                    synchronized (this.f13909f) {
                        try {
                            if (((C1869e) this.f13911h) == null) {
                                this.f13911h = ((d) c(this.f13908e, (MainActivity) this.f13910g).a(AbstractC1289x.a(d.class))).f13912b;
                            }
                        } finally {
                        }
                    }
                }
                return (C1869e) this.f13911h;
        }
    }
}
