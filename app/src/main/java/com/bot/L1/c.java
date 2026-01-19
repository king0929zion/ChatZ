package L1;

import D.C0080m;
import I1.o;
import I1.v;
import M.q;
import X3.n;
import android.os.Bundle;
import androidx.lifecycle.C0848w;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.O;
import androidx.lifecycle.S;
import i4.AbstractC1118b;
import java.util.Arrays;
import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public final class c {
    public final I1.j a;

    /* renamed from: b, reason: collision with root package name */
    public final v f2990b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2991c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC0842p f2992d;

    /* renamed from: e, reason: collision with root package name */
    public final o f2993e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2994f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2995g;

    /* renamed from: h, reason: collision with root package name */
    public final q f2996h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2997i;

    /* renamed from: j, reason: collision with root package name */
    public final C0848w f2998j;

    /* renamed from: k, reason: collision with root package name */
    public EnumC0842p f2999k;

    /* renamed from: l, reason: collision with root package name */
    public final S f3000l;

    /* renamed from: m, reason: collision with root package name */
    public final n f3001m;

    public c(I1.j jVar) {
        this.a = jVar;
        this.f2990b = jVar.f2544e;
        this.f2991c = jVar.f2545f;
        this.f2992d = jVar.f2546g;
        this.f2993e = jVar.f2547h;
        this.f2994f = jVar.f2548i;
        this.f2995g = jVar.f2549j;
        this.f2996h = new q(new W1.a(jVar, new A.b(jVar, 29)), 27);
        n d6 = X3.a.d(new C0080m(21));
        this.f2998j = new C0848w(jVar, true);
        this.f2999k = EnumC0842p.f10876e;
        this.f3000l = (S) d6.getValue();
        this.f3001m = X3.a.d(new C0080m(22));
    }

    public final Bundle a() {
        Bundle bundle = this.f2991c;
        if (bundle == null) {
            return null;
        }
        Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
        d6.putAll(bundle);
        return d6;
    }

    public final void b() {
        if (!this.f2997i) {
            q qVar = this.f2996h;
            ((W1.a) qVar.f3179e).a();
            this.f2997i = true;
            if (this.f2993e != null) {
                O.d(this.a);
            }
            qVar.s(this.f2995g);
        }
        int ordinal = this.f2992d.ordinal();
        int ordinal2 = this.f2999k.ordinal();
        C0848w c0848w = this.f2998j;
        if (ordinal < ordinal2) {
            c0848w.p(this.f2992d);
        } else {
            c0848w.p(this.f2999k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC1289x.a(I1.j.class).c());
        sb.append("(" + this.f2994f + ')');
        sb.append(" destination=");
        sb.append(this.f2990b);
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
