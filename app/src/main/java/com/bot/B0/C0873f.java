package b0;

import D.C0072i;
import D.e1;
import O.P;
import T.C0626q;
import T.C0627q0;
import T.C0639x;
import T.r;
import X3.y;
import java.util.ArrayList;
import m4.AbstractC1276k;
import m4.AbstractC1291z;

/* renamed from: b0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873f implements InterfaceC0870c {

    /* renamed from: c, reason: collision with root package name */
    public final int f10978c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10979e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10980f;

    /* renamed from: g, reason: collision with root package name */
    public C0627q0 f10981g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f10982h;

    public C0873f(Object obj, boolean z5, int i6) {
        this.f10978c = i6;
        this.f10979e = z5;
        this.f10980f = obj;
    }

    public final Object a(int i6, C0626q c0626q) {
        c0626q.d0(this.f10978c);
        l(c0626q);
        int a = i6 | (c0626q.f(this) ? AbstractC0874g.a(2, 0) : AbstractC0874g.a(1, 0));
        Object obj = this.f10980f;
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1291z.b(2, obj);
        Object m3 = ((l4.e) obj).m(c0626q, Integer.valueOf(a));
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0872e(2, this, C0873f.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return m3;
    }

    @Override // l4.f
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return e(obj, (C0626q) obj2, ((Number) obj3).intValue());
    }

    public final Object e(Object obj, C0626q c0626q, int i6) {
        c0626q.d0(this.f10978c);
        l(c0626q);
        int a = c0626q.f(this) ? AbstractC0874g.a(2, 1) : AbstractC0874g.a(1, 1);
        Object obj2 = this.f10980f;
        AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1291z.b(3, obj2);
        Object d6 = ((l4.f) obj2).d(obj, c0626q, Integer.valueOf(a | i6));
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0072i(i6, 9, this, obj);
        }
        return d6;
    }

    public final Object g(final Object obj, final Boolean bool, final Object obj2, final Object obj3, final Object obj4, C0626q c0626q, final int i6) {
        c0626q.d0(this.f10978c);
        l(c0626q);
        int a = c0626q.f(this) ? AbstractC0874g.a(2, 6) : AbstractC0874g.a(1, 6);
        Object obj5 = this.f10980f;
        AbstractC1276k.d(obj5, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1291z.b(8, obj5);
        Object j3 = ((l4.j) obj5).j(obj, bool, obj2, obj3, obj4, c0626q, Integer.valueOf(i6 | a));
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e() { // from class: b0.d
                @Override // l4.e
                public final Object m(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    C0873f.this.g(obj, bool, obj2, obj3, obj4, (C0626q) obj6, r.J(i6) | 1);
                    return y.a;
                }
            };
        }
        return j3;
    }

    public final Object h(Object obj, Object obj2, C0626q c0626q, int i6) {
        c0626q.d0(this.f10978c);
        l(c0626q);
        int a = c0626q.f(this) ? AbstractC0874g.a(2, 2) : AbstractC0874g.a(1, 2);
        Object obj3 = this.f10980f;
        AbstractC1276k.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1291z.b(4, obj3);
        Object i7 = ((l4.g) obj3).i(obj, obj2, c0626q, Integer.valueOf(a | i6));
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(this, obj, obj2, i6, 7);
        }
        return i7;
    }

    @Override // l4.g
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (C0626q) obj3, ((Number) obj4).intValue());
    }

    @Override // l4.j
    public final /* bridge */ /* synthetic */ Object j(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C0626q c0626q, Integer num) {
        return g(obj, bool, obj2, obj3, obj4, c0626q, num.intValue());
    }

    public final Object k(Object obj, Object obj2, Object obj3, C0626q c0626q, int i6) {
        c0626q.d0(this.f10978c);
        l(c0626q);
        int a = c0626q.f(this) ? AbstractC0874g.a(2, 3) : AbstractC0874g.a(1, 3);
        Object obj4 = this.f10980f;
        AbstractC1276k.d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1291z.b(5, obj4);
        Object n3 = ((l4.h) obj4).n(obj, obj2, obj3, c0626q, Integer.valueOf(a | i6));
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new P(this, obj, obj2, obj3, i6);
        }
        return n3;
    }

    public final void l(C0626q c0626q) {
        C0627q0 A5;
        if (!this.f10979e || (A5 = c0626q.A()) == null) {
            return;
        }
        c0626q.getClass();
        A5.f8191b |= 1;
        if (AbstractC0874g.d(this.f10981g, A5)) {
            this.f10981g = A5;
            return;
        }
        ArrayList arrayList = this.f10982h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f10982h = arrayList2;
            arrayList2.add(A5);
            return;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (AbstractC0874g.d((C0627q0) arrayList.get(i6), A5)) {
                arrayList.set(i6, A5);
                return;
            }
        }
        arrayList.add(A5);
    }

    @Override // l4.e
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (C0626q) obj);
    }

    @Override // l4.h
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return k(obj, obj2, obj3, (C0626q) obj4, ((Number) obj5).intValue());
    }

    public final void o(X3.e eVar) {
        if (AbstractC1276k.b(this.f10980f, eVar)) {
            return;
        }
        boolean z5 = this.f10980f == null;
        this.f10980f = eVar;
        if (z5 || !this.f10979e) {
            return;
        }
        C0627q0 c0627q0 = this.f10981g;
        if (c0627q0 != null) {
            C0639x c0639x = c0627q0.a;
            if (c0639x != null) {
                c0639x.s(c0627q0, null);
            }
            this.f10981g = null;
        }
        ArrayList arrayList = this.f10982h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0627q0 c0627q02 = (C0627q0) arrayList.get(i6);
                C0639x c0639x2 = c0627q02.a;
                if (c0639x2 != null) {
                    c0639x2.s(c0627q02, null);
                }
            }
            arrayList.clear();
        }
    }
}
