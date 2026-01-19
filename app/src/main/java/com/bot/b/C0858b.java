package b;

import android.window.BackEvent;

/* renamed from: b.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858b {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10911b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10913d;

    public C0858b(BackEvent backEvent) {
        float j3 = AbstractC0857a.j(backEvent);
        float k3 = AbstractC0857a.k(backEvent);
        float f6 = AbstractC0857a.f(backEvent);
        int i6 = AbstractC0857a.i(backEvent);
        this.a = j3;
        this.f10911b = k3;
        this.f10912c = f6;
        this.f10913d = i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.f10911b);
        sb.append(", progress=");
        sb.append(this.f10912c);
        sb.append(", swipeEdge=");
        return B3.e.q(sb, this.f10913d, '}');
    }
}
