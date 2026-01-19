package androidx.compose.ui.platform;

import B0.F;
import B0.G;
import E1.a;
import F0.P;
import I0.AbstractC0204q0;
import I0.C0172a0;
import I0.C0197n;
import I0.C0201p;
import I0.C0205r0;
import I0.C0211u0;
import I0.C0213v0;
import I0.L;
import I0.M;
import I0.N;
import I0.O;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import M.q;
import N0.d;
import T.AbstractC0623o0;
import T.B;
import T.C0616l;
import T.C0625p0;
import T.C0626q;
import T.C0627q0;
import T.e1;
import T.r;
import X3.y;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import b0.AbstractC0874g;
import com.tencent.mmkv.R;
import e0.f;
import e0.g;
import e0.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l4.c;
import l4.e;
import m4.AbstractC1276k;
import w0.InterfaceC1830a;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final B a = new B(L.f2193f);

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f10780b = new AbstractC0623o0(L.f2194g);

    /* renamed from: c, reason: collision with root package name */
    public static final B f10781c = new B(C0201p.f2342h);

    /* renamed from: d, reason: collision with root package name */
    public static final e1 f10782d = new AbstractC0623o0(L.f2195h);

    /* renamed from: e, reason: collision with root package name */
    public static final e1 f10783e = new AbstractC0623o0(L.f2196i);

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f10784f = new AbstractC0623o0(L.f2197j);

    public static final void a(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, e eVar, C0626q c0626q, int i6) {
        boolean areAllPrimitivesSupported;
        boolean z5;
        c0626q.d0(-520299287);
        int i7 = (c0626q.h(viewTreeObserverOnGlobalLayoutListenerC0216x) ? 4 : 2) | i6 | (c0626q.h(eVar) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0216x.getContext();
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (P5 == obj) {
                P5 = new C0172a0(context);
                c0626q.m0(P5);
            }
            C0172a0 c0172a0 = (C0172a0) P5;
            C0197n viewTreeOwners = viewTreeObserverOnGlobalLayoutListenerC0216x.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            U1.e eVar2 = viewTreeOwners.f2330b;
            Object P6 = c0626q.P();
            if (P6 == obj) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC0216x.getParent();
                AbstractC1276k.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = f.class.getSimpleName() + ':' + str;
                q f6 = eVar2.f();
                Bundle j3 = f6.j(str2);
                if (j3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : j3.keySet()) {
                        ArrayList parcelableArrayList = j3.getParcelableArrayList(str3);
                        AbstractC1276k.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str3, parcelableArrayList);
                    }
                }
                C0201p c0201p = C0201p.f2343i;
                e1 e1Var = h.a;
                g gVar = new g(linkedHashMap, c0201p);
                try {
                    f6.u(str2, new a(gVar, 1));
                    z5 = true;
                } catch (IllegalArgumentException unused) {
                    z5 = false;
                }
                Object c0211u0 = new C0211u0(gVar, new C0213v0(z5, f6, str2));
                c0626q.m0(c0211u0);
                P6 = c0211u0;
            }
            Object obj2 = (C0211u0) P6;
            boolean h3 = c0626q.h(obj2);
            Object P7 = c0626q.P();
            if (h3 || P7 == obj) {
                P7 = new G(obj2, 8);
                c0626q.m0(P7);
            }
            r.d(y.a, (c) P7, c0626q);
            Object P8 = c0626q.P();
            if (P8 == obj) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        P8 = new C0205r0(viewTreeObserverOnGlobalLayoutListenerC0216x.getView(), 0);
                        c0626q.m0(P8);
                    }
                }
                P8 = new Object();
                c0626q.m0(P8);
            }
            InterfaceC1830a interfaceC1830a = (InterfaceC1830a) P8;
            Configuration configuration = viewTreeObserverOnGlobalLayoutListenerC0216x.getConfiguration();
            Object P9 = c0626q.P();
            if (P9 == obj) {
                P9 = new N0.c();
                c0626q.m0(P9);
            }
            N0.c cVar = (N0.c) P9;
            Object P10 = c0626q.P();
            Object obj3 = P10;
            if (P10 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0626q.m0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object P11 = c0626q.P();
            if (P11 == obj) {
                P11 = new N(configuration3, cVar);
                c0626q.m0(P11);
            }
            N n3 = (N) P11;
            boolean h6 = c0626q.h(context);
            Object P12 = c0626q.P();
            if (h6 || P12 == obj) {
                P12 = new F(2, context, n3);
                c0626q.m0(P12);
            }
            r.d(cVar, (c) P12, c0626q);
            Object P13 = c0626q.P();
            if (P13 == obj) {
                P13 = new d();
                c0626q.m0(P13);
            }
            d dVar = (d) P13;
            Object P14 = c0626q.P();
            if (P14 == obj) {
                P14 = new O(dVar);
                c0626q.m0(P14);
            }
            O o5 = (O) P14;
            boolean h7 = c0626q.h(context);
            Object P15 = c0626q.P();
            if (h7 || P15 == obj) {
                P15 = new F(3, context, o5);
                c0626q.m0(P15);
            }
            r.d(dVar, (c) P15, c0626q);
            AbstractC0623o0 abstractC0623o0 = AbstractC0204q0.f2372v;
            r.b(new C0625p0[]{a.a(viewTreeObserverOnGlobalLayoutListenerC0216x.getConfiguration()), f10780b.a(context), D1.e.a.a(viewTreeOwners.a), V1.a.a.a(eVar2), h.a.a(obj2), f10784f.a(viewTreeObserverOnGlobalLayoutListenerC0216x.getView()), f10782d.a(cVar), f10783e.a(dVar), abstractC0623o0.a(Boolean.valueOf(((Boolean) c0626q.j(abstractC0623o0)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC0216x.getScrollCaptureInProgress$ui())), AbstractC0204q0.f2362l.a(interfaceC1830a)}, AbstractC0874g.c(1059770793, new M(viewTreeObserverOnGlobalLayoutListenerC0216x, c0172a0, eVar), c0626q), c0626q, 56);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new P(viewTreeObserverOnGlobalLayoutListenerC0216x, eVar, i6);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0623o0 getLocalLifecycleOwner() {
        return D1.e.a;
    }
}
