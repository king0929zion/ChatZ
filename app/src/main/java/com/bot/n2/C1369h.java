package n2;

import X3.y;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b4.InterfaceC0905c;
import i2.C1109c;
import io.ktor.utils.io.u;
import java.util.List;
import s2.C1661i;
import s2.C1665m;
import t2.C1723g;
import w2.AbstractC1835e;
import w2.C1840j;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* renamed from: n2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369h extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public List f13379h;

    /* renamed from: i, reason: collision with root package name */
    public C1665m f13380i;

    /* renamed from: j, reason: collision with root package name */
    public int f13381j;

    /* renamed from: k, reason: collision with root package name */
    public int f13382k;

    /* renamed from: l, reason: collision with root package name */
    public int f13383l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13384m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1370i f13385n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1362a f13386o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1665m f13387p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f13388q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1109c f13389r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1661i f13390s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369h(C1370i c1370i, C1362a c1362a, C1665m c1665m, List list, C1109c c1109c, C1661i c1661i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13385n = c1370i;
        this.f13386o = c1362a;
        this.f13387p = c1665m;
        this.f13388q = list;
        this.f13389r = c1109c;
        this.f13390s = c1661i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1369h) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1369h c1369h = new C1369h(this.f13385n, this.f13386o, this.f13387p, this.f13388q, this.f13389r, this.f13390s, interfaceC0905c);
        c1369h.f13384m = obj;
        return c1369h;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        InterfaceC1942y interfaceC1942y;
        List list;
        Bitmap f6;
        int i6;
        C1665m c1665m;
        Bitmap bitmap;
        int size;
        int i7 = this.f13383l;
        C1109c c1109c = this.f13389r;
        C1362a c1362a = this.f13386o;
        if (i7 == 0) {
            X3.a.e(obj);
            interfaceC1942y = (InterfaceC1942y) this.f13384m;
            Drawable drawable = c1362a.a;
            C1840j c1840j = this.f13385n.f13393d;
            boolean z5 = drawable instanceof BitmapDrawable;
            list = this.f13388q;
            C1665m c1665m2 = this.f13387p;
            if (z5) {
                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (Y3.k.b0(config, AbstractC1835e.a)) {
                    f6 = bitmap2;
                    c1109c.getClass();
                    i6 = 0;
                    c1665m = c1665m2;
                    bitmap = f6;
                    size = list.size();
                } else if (c1840j != null) {
                    C1840j.a("EngineInterceptor", 4, "Converting bitmap with config " + config + " to apply transformations: " + list + '.', null);
                }
            } else if (c1840j != null) {
                C1840j.a("EngineInterceptor", 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + '.', null);
            }
            f6 = u.f(drawable, c1665m2.f14791b, c1665m2.f14793d, c1665m2.f14794e, c1665m2.f14795f);
            c1109c.getClass();
            i6 = 0;
            c1665m = c1665m2;
            bitmap = f6;
            size = list.size();
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.f13382k;
            int i8 = this.f13381j;
            c1665m = this.f13380i;
            list = this.f13379h;
            interfaceC1942y = (InterfaceC1942y) this.f13384m;
            X3.a.e(obj);
            bitmap = (Bitmap) obj;
            AbstractC1888A.n(interfaceC1942y.c());
            i6 = i8 + 1;
        }
        if (i6 >= size) {
            c1109c.getClass();
            return new C1362a(new BitmapDrawable(this.f13390s.a.getResources(), bitmap), c1362a.f13323b, c1362a.f13324c, c1362a.f13325d);
        }
        if (list.get(i6) != null) {
            throw new ClassCastException();
        }
        C1723g c1723g = c1665m.f14793d;
        this.f13384m = interfaceC1942y;
        this.f13379h = list;
        this.f13380i = c1665m;
        this.f13381j = i6;
        this.f13382k = size;
        this.f13383l = 1;
        throw null;
    }
}
