package O;

import F0.InterfaceC0134w;
import java.util.ArrayList;
import k.C1149C;

/* renamed from: O.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309g0 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4114b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0134w f4115c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4116d;

    /* renamed from: e, reason: collision with root package name */
    public final G f4117e;

    /* renamed from: f, reason: collision with root package name */
    public final I2.C f4118f;

    /* renamed from: g, reason: collision with root package name */
    public final C1149C f4119g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4120h;

    /* renamed from: i, reason: collision with root package name */
    public int f4121i;

    /* renamed from: j, reason: collision with root package name */
    public int f4122j;

    /* renamed from: k, reason: collision with root package name */
    public int f4123k;

    public C0309g0(long j3, long j4, InterfaceC0134w interfaceC0134w, boolean z5, G g3, I2.C c6) {
        this.a = j3;
        this.f4114b = j4;
        this.f4115c = interfaceC0134w;
        this.f4116d = z5;
        this.f4117e = g3;
        this.f4118f = c6;
        int i6 = k.r.a;
        this.f4119g = new C1149C(6);
        this.f4120h = new ArrayList();
        this.f4121i = -1;
        this.f4122j = -1;
        this.f4123k = -1;
    }

    public final int a(int i6, EnumC0320m enumC0320m, EnumC0320m enumC0320m2) {
        if (i6 == -1) {
            int ordinal = AbstractC0336u0.y(enumC0320m, enumC0320m2).ordinal();
            if (ordinal == 0) {
                return this.f4123k - 1;
            }
            if (ordinal == 1) {
                return this.f4123k;
            }
            if (ordinal != 2) {
                throw new RuntimeException();
            }
        }
        return i6;
    }
}
