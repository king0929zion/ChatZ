package H0;

import F0.C0127o;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class z0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2015b = new C0127o[32];

    /* renamed from: c, reason: collision with root package name */
    public Object f2016c = new float[32];

    /* renamed from: d, reason: collision with root package name */
    public Object f2017d = new byte[32];

    /* renamed from: e, reason: collision with root package name */
    public Object f2018e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2019f;

    public z0() {
        k.N n3 = k.W.a;
        this.f2018e = new k.N();
        this.f2019f = new k.N();
    }

    public boolean a() {
        return this.a < ((List) this.f2017d).size() || !((ArrayList) this.f2019f).isEmpty();
    }

    public I1.u b(String str) {
        I1.t tVar;
        AbstractC1276k.f(str, "route");
        X3.n nVar = (X3.n) this.f2019f;
        if (nVar == null || (tVar = (I1.t) nVar.getValue()) == null) {
            return null;
        }
        int i6 = I1.v.f2590h;
        String concat = "android-app://androidx.navigation/".concat(str);
        AbstractC1276k.f(concat, "uriString");
        Uri parse = Uri.parse(concat);
        AbstractC1276k.e(parse, "parse(...)");
        Bundle d6 = tVar.d(parse, (LinkedHashMap) this.f2017d);
        if (d6 == null) {
            return null;
        }
        return new I1.u((I1.v) this.f2015b, d6, tVar.f2584l, tVar.b(parse), false);
    }
}
