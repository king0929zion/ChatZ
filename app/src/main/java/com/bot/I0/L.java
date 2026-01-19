package I0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vladsch.flexmark.parser.PegdownExtensions;
import i4.AbstractC1120d;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;
import v.AbstractC1787b;
import x4.AbstractC1888A;
import x4.AbstractC1898K;

/* loaded from: classes.dex */
public final class L extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: A, reason: collision with root package name */
    public static final L f2185A;

    /* renamed from: B, reason: collision with root package name */
    public static final L f2186B;

    /* renamed from: C, reason: collision with root package name */
    public static final L f2187C;

    /* renamed from: D, reason: collision with root package name */
    public static final L f2188D;

    /* renamed from: E, reason: collision with root package name */
    public static final L f2189E;

    /* renamed from: F, reason: collision with root package name */
    public static final L f2190F;

    /* renamed from: G, reason: collision with root package name */
    public static final L f2191G;

    /* renamed from: H, reason: collision with root package name */
    public static final L f2192H;

    /* renamed from: f, reason: collision with root package name */
    public static final L f2193f;

    /* renamed from: g, reason: collision with root package name */
    public static final L f2194g;

    /* renamed from: h, reason: collision with root package name */
    public static final L f2195h;

    /* renamed from: i, reason: collision with root package name */
    public static final L f2196i;

    /* renamed from: j, reason: collision with root package name */
    public static final L f2197j;

    /* renamed from: k, reason: collision with root package name */
    public static final L f2198k;

    /* renamed from: l, reason: collision with root package name */
    public static final L f2199l;

    /* renamed from: m, reason: collision with root package name */
    public static final L f2200m;

    /* renamed from: n, reason: collision with root package name */
    public static final L f2201n;

    /* renamed from: o, reason: collision with root package name */
    public static final L f2202o;

    /* renamed from: p, reason: collision with root package name */
    public static final L f2203p;

    /* renamed from: q, reason: collision with root package name */
    public static final L f2204q;

    /* renamed from: r, reason: collision with root package name */
    public static final L f2205r;

    /* renamed from: s, reason: collision with root package name */
    public static final L f2206s;

    /* renamed from: t, reason: collision with root package name */
    public static final L f2207t;

    /* renamed from: u, reason: collision with root package name */
    public static final L f2208u;

    /* renamed from: v, reason: collision with root package name */
    public static final L f2209v;

    /* renamed from: w, reason: collision with root package name */
    public static final L f2210w;

    /* renamed from: x, reason: collision with root package name */
    public static final L f2211x;

    /* renamed from: y, reason: collision with root package name */
    public static final L f2212y;

    /* renamed from: z, reason: collision with root package name */
    public static final L f2213z;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2214e;

    static {
        int i6 = 0;
        f2193f = new L(i6, 0);
        f2194g = new L(i6, 1);
        f2195h = new L(i6, 2);
        f2196i = new L(i6, 3);
        f2197j = new L(i6, 4);
        f2198k = new L(i6, 5);
        f2199l = new L(i6, 6);
        f2200m = new L(i6, 7);
        f2201n = new L(i6, 8);
        f2202o = new L(i6, 9);
        f2203p = new L(i6, 10);
        f2204q = new L(i6, 11);
        f2205r = new L(i6, 12);
        f2206s = new L(i6, 13);
        f2207t = new L(i6, 14);
        f2208u = new L(i6, 15);
        f2209v = new L(i6, 16);
        f2210w = new L(i6, 17);
        f2211x = new L(i6, 18);
        f2212y = new L(i6, 19);
        f2213z = new L(i6, 20);
        f2185A = new L(i6, 21);
        f2186B = new L(i6, 22);
        f2187C = new L(i6, 23);
        f2188D = new L(i6, 24);
        f2189E = new L(i6, 25);
        f2190F = new L(i6, 26);
        f2191G = new L(i6, 27);
        f2192H = new L(i6, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i6, int i7) {
        super(i6);
        this.f2214e = i7;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [d4.i, l4.e] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        Choreographer choreographer;
        switch (this.f2214e) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case AbstractC1787b.f15290g /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    E4.e eVar = AbstractC1898K.a;
                    choreographer = (Choreographer) AbstractC1888A.C(C4.o.a, new d4.i(2, null));
                }
                X x5 = new X(choreographer, AbstractC1120d.i(Looper.getMainLooper()));
                return Y4.d.P(x5, x5.f2264o);
            case 6:
            case 7:
                return null;
            case 8:
                AbstractC0204q0.b("LocalAutofillManager");
                throw null;
            case AbstractC1787b.f15287d /* 9 */:
                AbstractC0204q0.b("LocalAutofillTree");
                throw null;
            case AbstractC1787b.f15289f /* 10 */:
                AbstractC0204q0.b("LocalClipboard");
                throw null;
            case 11:
                AbstractC0204q0.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                AbstractC0204q0.b("LocalDensity");
                throw null;
            case 14:
                AbstractC0204q0.b("LocalFocusManager");
                throw null;
            case 15:
                AbstractC0204q0.b("LocalFontFamilyResolver");
                throw null;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                AbstractC0204q0.b("LocalFontLoader");
                throw null;
            case 17:
                AbstractC0204q0.b("LocalGraphicsContext");
                throw null;
            case 18:
                AbstractC0204q0.b("LocalHapticFeedback");
                throw null;
            case 19:
                AbstractC0204q0.b("LocalInputManager");
                throw null;
            case 20:
                AbstractC0204q0.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                AbstractC0204q0.b("LocalTextToolbar");
                throw null;
            case 26:
                AbstractC0204q0.b("LocalUriHandler");
                throw null;
            case 27:
                AbstractC0204q0.b("LocalViewConfiguration");
                throw null;
            default:
                AbstractC0204q0.b("LocalWindowInfo");
                throw null;
        }
    }
}
