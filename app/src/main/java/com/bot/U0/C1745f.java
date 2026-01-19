package u0;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.ArrayList;
import o0.N;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745f {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15038b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15039c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15040d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15041e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15042f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15043g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15044h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f15045i;

    /* renamed from: j, reason: collision with root package name */
    public final C1744e f15046j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15047k;

    public C1745f(String str, float f6, float f7, float f8, float f9, long j3, int i6, boolean z5, int i7) {
        str = (i7 & 1) != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : str;
        long j4 = (i7 & 32) != 0 ? o0.s.f13481h : j3;
        int i8 = (i7 & 64) != 0 ? 5 : i6;
        boolean z6 = (i7 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? false : z5;
        this.a = str;
        this.f15038b = f6;
        this.f15039c = f7;
        this.f15040d = f8;
        this.f15041e = f9;
        this.f15042f = j4;
        this.f15043g = i8;
        this.f15044h = z6;
        ArrayList arrayList = new ArrayList();
        this.f15045i = arrayList;
        C1744e c1744e = new C1744e(null, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, S.l.f7374V, null, 1023);
        this.f15046j = c1744e;
        arrayList.add(c1744e);
    }

    public static void a(C1745f c1745f, ArrayList arrayList, N n3, N n5, float f6, int i6, int i7, float f7) {
        if (c1745f.f15047k) {
            E0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C1744e) c1745f.f15045i.get(r0.size() - 1)).f15037j.add(new K(FlexmarkHtmlConverter.DEFAULT_NODE, arrayList, 0, n3, 1.0f, n5, 1.0f, f6, i6, i7, f7, S.l.f7374V, 1.0f, S.l.f7374V));
    }

    public final C1746g b() {
        if (this.f15047k) {
            E0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f15045i;
            if (arrayList.size() <= 1) {
                C1744e c1744e = this.f15046j;
                C1746g c1746g = new C1746g(this.a, this.f15038b, this.f15039c, this.f15040d, this.f15041e, new G(c1744e.a, c1744e.f15029b, c1744e.f15030c, c1744e.f15031d, c1744e.f15032e, c1744e.f15033f, c1744e.f15034g, c1744e.f15035h, c1744e.f15036i, c1744e.f15037j), this.f15042f, this.f15043g, this.f15044h);
                this.f15047k = true;
                return c1746g;
            }
            if (this.f15047k) {
                E0.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C1744e c1744e2 = (C1744e) arrayList.remove(arrayList.size() - 1);
            ((C1744e) arrayList.get(arrayList.size() - 1)).f15037j.add(new G(c1744e2.a, c1744e2.f15029b, c1744e2.f15030c, c1744e2.f15031d, c1744e2.f15032e, c1744e2.f15033f, c1744e2.f15034g, c1744e2.f15035h, c1744e2.f15036i, c1744e2.f15037j));
        }
    }
}
