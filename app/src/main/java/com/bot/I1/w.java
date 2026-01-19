package I1;

import H0.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public abstract class w {
    public final H a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2595b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2596c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2597d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f2598e = new LinkedHashMap();

    public w(H h3, String str) {
        this.a = h3;
        this.f2595b = str;
    }

    public v a() {
        v b5 = b();
        b5.getClass();
        z0 z0Var = b5.f2592e;
        for (Map.Entry entry : this.f2596c.entrySet()) {
            String str = (String) entry.getKey();
            C0229h c0229h = (C0229h) entry.getValue();
            AbstractC1276k.f(str, "argumentName");
            AbstractC1276k.f(c0229h, "argument");
            z0Var.getClass();
            ((LinkedHashMap) z0Var.f2017d).put(str, c0229h);
        }
        ArrayList arrayList = this.f2597d;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            final t tVar = (t) obj;
            AbstractC1276k.f(tVar, "navDeepLink");
            z0Var.getClass();
            final int i7 = 0;
            ArrayList e6 = AbstractC0230i.e((LinkedHashMap) z0Var.f2017d, new l4.c() { // from class: L1.j
                @Override // l4.c
                public final Object f(Object obj2) {
                    boolean contains;
                    String str2 = (String) obj2;
                    switch (i7) {
                        case 0:
                            AbstractC1276k.f(str2, "key");
                            contains = tVar.c().contains(str2);
                            break;
                        default:
                            AbstractC1276k.f(str2, "key");
                            contains = tVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!e6.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + tVar.a + " can't be used to open destination " + ((v) z0Var.f2015b) + ".\nFollowing required arguments are missing: " + e6).toString());
            }
            ((ArrayList) z0Var.f2016c).add(tVar);
        }
        Iterator it = this.f2598e.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            AbstractC1276k.f(null, "action");
            throw null;
        }
        String str2 = this.f2595b;
        if (str2 != null) {
            z0Var.getClass();
            if (AbstractC1776n.Q(str2)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            AbstractC1276k.f(concat, "uriPattern");
            final t tVar2 = new t(concat);
            final int i8 = 1;
            ArrayList e7 = AbstractC0230i.e((LinkedHashMap) z0Var.f2017d, new l4.c() { // from class: L1.j
                @Override // l4.c
                public final Object f(Object obj2) {
                    boolean contains;
                    String str22 = (String) obj2;
                    switch (i8) {
                        case 0:
                            AbstractC1276k.f(str22, "key");
                            contains = tVar2.c().contains(str22);
                            break;
                        default:
                            AbstractC1276k.f(str22, "key");
                            contains = tVar2.c().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!e7.isEmpty()) {
                StringBuilder t5 = B3.e.t("Cannot set route \"", str2, "\" for destination ");
                t5.append((v) z0Var.f2015b);
                t5.append(". Following required arguments are missing: ");
                t5.append(e7);
                throw new IllegalArgumentException(t5.toString().toString());
            }
            z0Var.f2019f = X3.a.d(new A.b(concat, 15));
            z0Var.a = concat.hashCode();
            z0Var.f2018e = str2;
        }
        return b5;
    }

    public v b() {
        return this.a.a();
    }
}
