package I1;

import H0.C0158m;
import H0.z0;
import android.net.Uri;
import android.os.Bundle;
import com.vladsch.flexmark.util.html.Attribute;
import i4.AbstractC1118b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import k.X;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import u4.C1772j;
import u4.C1774l;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f2590h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final String f2591c;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f2592e;

    /* renamed from: f, reason: collision with root package name */
    public x f2593f;

    /* renamed from: g, reason: collision with root package name */
    public final X f2594g;

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [H0.z0, java.lang.Object] */
    public v(H h3) {
        AbstractC1276k.f(h3, "navigator");
        LinkedHashMap linkedHashMap = I.f2537b;
        this.f2591c = AbstractC0230i.d(h3.getClass());
        Object obj = new Object();
        obj.f2015b = this;
        obj.f2016c = new ArrayList();
        obj.f2017d = new LinkedHashMap();
        this.f2592e = obj;
        this.f2594g = new X(0);
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2592e.f2017d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((C0229h) entry.getValue()).getClass();
            AbstractC1276k.f(str, Attribute.NAME_ATTR);
        }
        if (bundle != null) {
            d6.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C0229h c0229h = (C0229h) entry2.getValue();
                c0229h.getClass();
                F f6 = c0229h.a;
                AbstractC1276k.f(str2, Attribute.NAME_ATTR);
                if (!d6.containsKey(str2) || !Y3.C.A(str2, d6)) {
                    try {
                        f6.a(str2, d6);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder t5 = B3.e.t("Wrong argument type for '", str2, "' in argument savedState. ");
                t5.append(f6.b());
                t5.append(" expected.");
                throw new IllegalArgumentException(t5.toString().toString());
            }
        }
        return d6;
    }

    public final Map b() {
        return Y3.B.d0((LinkedHashMap) this.f2592e.f2017d);
    }

    public u c(C0158m c0158m) {
        boolean c6;
        C1774l c1774l;
        C1772j b5;
        z0 z0Var = this.f2592e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) z0Var.f2017d;
        Uri uri = (Uri) c0158m.f1972e;
        ArrayList arrayList = (ArrayList) z0Var.f2016c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        u uVar = null;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            t tVar = (t) obj;
            tVar.getClass();
            X3.n nVar = tVar.f2576d;
            if (((C1774l) nVar.getValue()) == null) {
                c6 = true;
            } else if (uri == null) {
                c6 = false;
            } else {
                C1774l c1774l2 = (C1774l) nVar.getValue();
                AbstractC1276k.c(c1774l2);
                c6 = c1774l2.c(uri.toString());
            }
            if (c6) {
                Bundle d6 = uri != null ? tVar.d(uri, linkedHashMap) : null;
                int b6 = tVar.b(uri);
                String str = (String) c0158m.f1973f;
                boolean z5 = str != null && str.equals(null);
                if (d6 == null) {
                    if (z5) {
                        AbstractC1276k.f(linkedHashMap, "arguments");
                        Bundle d7 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
                        if (uri != null && (c1774l = (C1774l) nVar.getValue()) != null && (b5 = c1774l.b(uri.toString())) != null) {
                            tVar.e(b5, d7, linkedHashMap);
                            if (((Boolean) tVar.f2577e.getValue()).booleanValue()) {
                                tVar.f(uri, d7, linkedHashMap);
                            }
                        }
                        if (AbstractC0230i.e(linkedHashMap, new r(d7, 1)).isEmpty()) {
                        }
                    }
                }
                u uVar2 = new u((v) z0Var.f2015b, d6, tVar.f2584l, b6, z5);
                if (uVar == null || uVar2.compareTo(uVar) > 0) {
                    uVar = uVar2;
                }
            }
        }
        return uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Ld5
        L5:
            r1 = 0
            if (r11 == 0) goto Ld6
            boolean r2 = r11 instanceof I1.v
            if (r2 != 0) goto Le
            goto Ld6
        Le:
            H0.z0 r2 = r10.f2592e
            java.lang.Object r3 = r2.f2016c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            I1.v r11 = (I1.v) r11
            k.X r4 = r11.f2594g
            H0.z0 r5 = r11.f2592e
            java.lang.Object r6 = r5.f2016c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r3 = m4.AbstractC1276k.b(r3, r6)
            k.X r6 = r10.f2594g
            int r7 = r6.f()
            int r8 = r4.f()
            if (r7 != r8) goto L5e
            k.Y r7 = new k.Y
            r7.<init>(r6)
            t4.h r7 = t4.j.p(r7)
            t4.a r7 = (t4.C1729a) r7
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r6.c(r8)
            java.lang.Object r8 = r4.c(r8)
            boolean r8 = m4.AbstractC1276k.b(r9, r8)
            if (r8 != 0) goto L3d
            goto L5e
        L5c:
            r4 = r0
            goto L5f
        L5e:
            r4 = r1
        L5f:
            java.util.Map r6 = r10.b()
            int r6 = r6.size()
            java.util.Map r7 = r11.b()
            int r7 = r7.size()
            if (r6 != r7) goto Lba
            java.util.Map r6 = r10.b()
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            Y3.t r6 = Y3.m.h0(r6)
            java.lang.Object r6 = r6.f9810b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L87:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb8
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.Map r8 = r11.b()
            java.lang.Object r9 = r7.getKey()
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto Lba
            java.util.Map r8 = r11.b()
            java.lang.Object r9 = r7.getKey()
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r7 = r7.getValue()
            boolean r7 = m4.AbstractC1276k.b(r8, r7)
            if (r7 == 0) goto Lba
            goto L87
        Lb8:
            r11 = r0
            goto Lbb
        Lba:
            r11 = r1
        Lbb:
            int r6 = r2.a
            int r7 = r5.a
            if (r6 != r7) goto Ld6
            java.lang.Object r2 = r2.f2018e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r5.f2018e
            java.lang.String r5 = (java.lang.String) r5
            boolean r2 = m4.AbstractC1276k.b(r2, r5)
            if (r2 == 0) goto Ld6
            if (r3 == 0) goto Ld6
            if (r4 == 0) goto Ld6
            if (r11 == 0) goto Ld6
        Ld5:
            return r0
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.v.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        z0 z0Var = this.f2592e;
        int i6 = z0Var.a * 31;
        String str = (String) z0Var.f2018e;
        int hashCode = i6 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) z0Var.f2016c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            hashCode = (((t) obj).a.hashCode() + (hashCode * 31)) * 961;
        }
        X x5 = this.f2594g;
        AbstractC1276k.f(x5, "<this>");
        if (x5.f() > 0) {
            x5.g(0).getClass();
            throw new ClassCastException();
        }
        for (String str2 : b().keySet()) {
            int e6 = B3.e.e(hashCode * 31, 31, str2);
            Object obj2 = b().get(str2);
            hashCode = e6 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        z0 z0Var = this.f2592e;
        z0Var.getClass();
        sb.append(Integer.toHexString(z0Var.a));
        sb.append(")");
        String str = (String) z0Var.f2018e;
        if (str != null && !AbstractC1776n.Q(str)) {
            sb.append(" route=");
            sb.append((String) z0Var.f2018e);
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
