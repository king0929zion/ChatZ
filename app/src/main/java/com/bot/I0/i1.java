package I0;

import T.C0636v0;
import T.C0640x0;
import T.C0642y0;
import android.view.View;
import androidx.lifecycle.InterfaceC0846u;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import m4.AbstractC1276k;
import m4.C1288w;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class i1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f2305h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f2306i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1288w f2307j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0642y0 f2308k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0846u f2309l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j1 f2310m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f2311n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(C1288w c1288w, C0642y0 c0642y0, InterfaceC0846u interfaceC0846u, j1 j1Var, View view, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2307j = c1288w;
        this.f2308k = c0642y0;
        this.f2309l = interfaceC0846u;
        this.f2310m = j1Var;
        this.f2311n = view;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((i1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        i1 i1Var = new i1(this.f2307j, this.f2308k, this.f2309l, this.f2310m, this.f2311n, interfaceC0905c);
        i1Var.f2306i = obj;
        return i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [x4.e0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // d4.a
    public final Object r(Object obj) {
        ?? r02 = this.f2305h;
        j1 j1Var = this.f2310m;
        InterfaceC0846u interfaceC0846u = this.f2309l;
        X3.y yVar = X3.y.a;
        try {
            if (r02 == 0) {
                X3.a.e(obj);
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f2306i;
                try {
                    J0 j02 = (J0) this.f2307j.f12973c;
                    if (j02 != null) {
                        A4.e0 a = m1.a(this.f2311n.getContext().getApplicationContext());
                        j02.f2184c.h(((Number) a.getValue()).floatValue());
                        r02 = AbstractC1888A.y(interfaceC1942y, null, new h1(a, j02, null), 3);
                    } else {
                        r02 = 0;
                    }
                    C0642y0 c0642y0 = this.f2308k;
                    this.f2306i = r02;
                    this.f2305h = 1;
                    C0640x0 c0640x0 = new C0640x0(c0642y0, null);
                    InterfaceC0910h interfaceC0910h = this.f11435e;
                    AbstractC1276k.c(interfaceC0910h);
                    Object H3 = AbstractC1888A.H(c0642y0.a, new C0636v0(c0642y0, c0640x0, T.r.w(interfaceC0910h), null), this);
                    EnumC0927a enumC0927a = EnumC0927a.f11114c;
                    if (H3 != enumC0927a) {
                        H3 = yVar;
                    }
                    if (H3 != enumC0927a) {
                        H3 = yVar;
                    }
                    if (H3 == enumC0927a) {
                        return enumC0927a;
                    }
                } catch (Throwable th) {
                    th = th;
                    r02 = 0;
                    if (r02 != 0) {
                        r02.f(null);
                    }
                    interfaceC0846u.g().j(j1Var);
                    throw th;
                }
            } else {
                if (r02 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r02 = (InterfaceC1922e0) this.f2306i;
                X3.a.e(obj);
            }
            if (r02 != 0) {
                r02.f(null);
            }
            interfaceC0846u.g().j(j1Var);
            return yVar;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
