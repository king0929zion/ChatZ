package M;

import D.C0098v0;
import D.Q;
import D.d1;
import S0.C0545g;
import S0.F;
import S0.O;
import T.C0607g0;
import X0.A;
import X0.C0683a;
import android.view.autofill.AutofillValue;
import i0.C1067f;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3159c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f3160e;

    public /* synthetic */ i(j jVar, int i6) {
        this.f3159c = i6;
        this.f3160e = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f3159c;
        boolean z5 = true;
        j jVar = this.f3160e;
        switch (i6) {
            case 0:
                C0607g0 c0607g0 = jVar.f3165v.f1201t;
                Boolean bool = Boolean.TRUE;
                c0607g0.setValue(bool);
                jVar.f3165v.f1200s.setValue(bool);
                C0098v0 c0098v0 = jVar.f3165v;
                AutofillValue autofillValue = ((C1067f) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                AbstractC1276k.d(textValue, "null cannot be cast to non-null type kotlin.String");
                j.P0(c0098v0, (String) textValue, jVar.f3166w, jVar.f3167x);
                return bool;
            case 1:
                List list = (List) obj;
                if (jVar.f3165v.d() != null) {
                    d1 d6 = jVar.f3165v.d();
                    AbstractC1276k.c(d6);
                    list.add(d6.a);
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 2:
                j.P0(jVar.f3165v, ((C0545g) obj).f7630e, jVar.f3166w, jVar.f3167x);
                return Boolean.TRUE;
            default:
                C0545g c0545g = (C0545g) obj;
                if (jVar.f3166w || !jVar.f3167x) {
                    z5 = false;
                } else {
                    A a = jVar.f3165v.f1186e;
                    if (a != null) {
                        List I5 = Y4.l.I(new Object(), new C0683a(c0545g, 1));
                        C0098v0 c0098v02 = jVar.f3165v;
                        q qVar = c0098v02.f1185d;
                        Q q3 = c0098v02.f1203v;
                        X0.v h3 = qVar.h(I5);
                        a.a(null, h3);
                        q3.f(h3);
                    } else {
                        X0.v vVar = jVar.f3164u;
                        String str = vVar.a.f7630e;
                        long j3 = vVar.f9125b;
                        int i7 = O.f7611c;
                        int i8 = (int) (j3 >> 32);
                        int i9 = (int) (j3 & 4294967295L);
                        AbstractC1276k.f(str, "<this>");
                        AbstractC1276k.f(c0545g, "replacement");
                        if (i9 < i8) {
                            throw new IndexOutOfBoundsException(B3.e.i(i9, "End index (", i8, ") is less than start index (", ")."));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append((CharSequence) str, 0, i8);
                        sb.append((CharSequence) c0545g);
                        sb.append((CharSequence) str, i9, str.length());
                        String obj2 = sb.toString();
                        int length = c0545g.f7630e.length() + ((int) (jVar.f3164u.f9125b >> 32));
                        jVar.f3165v.f1203v.f(new X0.v(F.b(length, length), obj2, 4));
                    }
                }
                return Boolean.valueOf(z5);
        }
    }

    public /* synthetic */ i(j jVar, P0.x xVar) {
        this.f3159c = 3;
        this.f3160e = jVar;
    }
}
