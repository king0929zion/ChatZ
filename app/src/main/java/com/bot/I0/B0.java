package I0;

import android.content.Context;
import android.view.GestureDetector;

/* loaded from: classes.dex */
public final class B0 {
    public final C0203q a;

    /* renamed from: b, reason: collision with root package name */
    public int f2131b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2132c;

    /* renamed from: d, reason: collision with root package name */
    public final GestureDetector f2133d;

    public B0(Context context, C0203q c0203q) {
        this.a = c0203q;
        this.f2133d = new GestureDetector(context, new A0(this));
    }
}
