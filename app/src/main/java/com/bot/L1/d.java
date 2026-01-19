package L1;

import Y3.C;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import i4.AbstractC1118b;
import java.util.Arrays;
import m4.AbstractC1276k;
import o0.AbstractC1390a;
import o0.AbstractC1396g;
import o0.C1400k;
import o0.y;

/* loaded from: classes.dex */
public final class d {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3002b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3003c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3004d;

    public d(I1.j jVar, int i6) {
        this.f3002b = jVar.f2548i;
        this.a = i6;
        c cVar = jVar.f2550k;
        this.f3003c = cVar.a();
        Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
        this.f3004d = d6;
        cVar.f2996h.t(d6);
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f3002b).getStrokeCap();
        int i6 = strokeCap == null ? -1 : AbstractC1396g.a[strokeCap.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 != 2) {
            return i6 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f3002b).getStrokeJoin();
        int i6 = strokeJoin == null ? -1 : AbstractC1396g.f13464b[strokeJoin.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 != 2) {
            return i6 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f6) {
        ((Paint) this.f3002b).setAlpha((int) Math.rint(f6 * 255.0f));
    }

    public void d(int i6) {
        if (this.a == i6) {
            return;
        }
        this.a = i6;
        Paint paint = (Paint) this.f3002b;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1390a.f(paint, y.x(i6));
        } else {
            paint.setXfermode(new PorterDuffXfermode(y.F(i6)));
        }
    }

    public void e(long j3) {
        ((Paint) this.f3002b).setColor(y.B(j3));
    }

    public void f(C1400k c1400k) {
        this.f3004d = c1400k;
        ((Paint) this.f3002b).setColorFilter(c1400k != null ? c1400k.a : null);
    }

    public void g(int i6) {
        ((Paint) this.f3002b).setFilterBitmap(!(i6 == 0));
    }

    public void h(Shader shader) {
        this.f3003c = shader;
        ((Paint) this.f3002b).setShader(shader);
    }

    public void i(int i6) {
        ((Paint) this.f3002b).setStrokeCap(i6 == 2 ? Paint.Cap.SQUARE : i6 == 1 ? Paint.Cap.ROUND : i6 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void j(int i6) {
        ((Paint) this.f3002b).setStrokeJoin(i6 == 0 ? Paint.Join.MITER : i6 == 2 ? Paint.Join.BEVEL : i6 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void k(float f6) {
        ((Paint) this.f3002b).setStrokeWidth(f6);
    }

    public void l(int i6) {
        ((Paint) this.f3002b).setStyle(i6 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public d(Paint paint) {
        this.f3002b = paint;
        this.a = 3;
    }

    public d(Bundle bundle) {
        AbstractC1276k.f(bundle, "state");
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            this.f3002b = string;
            this.a = C.s("nav-entry-state:destination-id", bundle);
            this.f3003c = C.t("nav-entry-state:args", bundle);
            this.f3004d = C.t("nav-entry-state:saved-state", bundle);
            return;
        }
        h5.e.a0("nav-entry-state:id");
        throw null;
    }
}
