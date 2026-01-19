package I1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1118b;
import java.util.Arrays;
import java.util.Iterator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final L1.i f2518b;

    /* renamed from: c, reason: collision with root package name */
    public final L1.e f2519c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f2520d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2521e;

    /* renamed from: f, reason: collision with root package name */
    public final n f2522f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2523g;

    public B(Context context) {
        Object obj;
        AbstractC1276k.f(context, "context");
        this.a = context;
        this.f2518b = new L1.i(this, new l(this, 0));
        this.f2519c = new L1.e(context, false);
        Iterator it = t4.j.q(context, new A2.a(24)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f2520d = (Activity) obj;
        this.f2522f = new n(this);
        this.f2523g = true;
        I i6 = this.f2518b.f3032s;
        i6.a(new A(i6));
        this.f2518b.f3032s.a(new C0223b(this.a));
        X3.a.d(new l(this, 1));
    }

    public static void b(B b5, String str) {
        b5.getClass();
        AbstractC1276k.f(str, "route");
        L1.i iVar = b5.f2518b;
        iVar.getClass();
        if (iVar.f3016c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + iVar + '.').toString());
        }
        x i6 = iVar.i();
        u e6 = i6.e(str, true, i6);
        if (e6 == null) {
            StringBuilder t5 = B3.e.t("Navigation destination that matches route ", str, " cannot be found in the navigation graph ");
            t5.append(iVar.f3016c);
            throw new IllegalArgumentException(t5.toString());
        }
        v vVar = e6.f2585c;
        Bundle a = vVar.a(e6.f2586e);
        if (a == null) {
            a = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
        }
        int i7 = v.f2590h;
        String str2 = (String) vVar.f2592e.f2018e;
        String concat = str2 != null ? "android-app://androidx.navigation/".concat(str2) : FlexmarkHtmlConverter.DEFAULT_NODE;
        AbstractC1276k.f(concat, "uriString");
        Uri parse = Uri.parse(concat);
        AbstractC1276k.e(parse, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        a.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        iVar.k(vVar, a, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[EDGE_INSN: B:42:0x00b1->B:43:0x00b1 BREAK  A[LOOP:0: B:2:0x000f->B:49:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[LOOP:0: B:2:0x000f->B:49:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I1.j a(java.lang.String r12) {
        /*
            r11 = this;
            L1.i r0 = r11.f2518b
            r0.getClass()
            Y3.j r1 = r0.f3019f
            int r2 = r1.a()
            java.util.ListIterator r1 = r1.listIterator(r2)
        Lf:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r1.previous()
            r3 = r2
            I1.j r3 = (I1.j) r3
            I1.v r4 = r3.f2544e
            L1.c r3 = r3.f2550k
            android.os.Bundle r3 = r3.a()
            r4.getClass()
            java.lang.String r5 = "route"
            m4.AbstractC1276k.f(r12, r5)
            H0.z0 r4 = r4.f2592e
            r4.getClass()
            java.lang.Object r5 = r4.f2018e
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = m4.AbstractC1276k.b(r5, r12)
            if (r5 == 0) goto L3d
            goto Laa
        L3d:
            I1.u r5 = r4.b(r12)
            java.lang.Object r4 = r4.f2015b
            I1.v r4 = (I1.v) r4
            r6 = 0
            if (r5 == 0) goto L4b
            I1.v r7 = r5.f2585c
            goto L4c
        L4b:
            r7 = r6
        L4c:
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L53
            goto Lac
        L53:
            android.os.Bundle r4 = r5.f2586e
            if (r3 == 0) goto Lac
            if (r4 != 0) goto L5a
            goto Lac
        L5a:
            java.util.Set r7 = r4.keySet()
            java.lang.String r8 = "keySet(...)"
            m4.AbstractC1276k.e(r7, r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L69:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Laa
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            m4.AbstractC1276k.c(r8)
            boolean r9 = r3.containsKey(r8)
            if (r9 != 0) goto L7f
            goto Lac
        L7f:
            I1.v r9 = r5.f2585c
            java.util.Map r9 = r9.b()
            java.lang.Object r9 = r9.get(r8)
            I1.h r9 = (I1.C0229h) r9
            if (r9 == 0) goto L90
            I1.F r9 = r9.a
            goto L91
        L90:
            r9 = r6
        L91:
            if (r9 == 0) goto L98
            java.lang.Object r10 = r9.a(r8, r4)
            goto L99
        L98:
            r10 = r6
        L99:
            if (r9 == 0) goto La0
            java.lang.Object r8 = r9.a(r8, r3)
            goto La1
        La0:
            r8 = r6
        La1:
            if (r9 == 0) goto L69
            boolean r8 = r9.f(r10, r8)
            if (r8 != 0) goto L69
            goto Lac
        Laa:
            r3 = 1
            goto Lad
        Lac:
            r3 = 0
        Lad:
            if (r3 == 0) goto Lf
            goto Lb1
        Lb0:
            r2 = 0
        Lb1:
            I1.j r2 = (I1.j) r2
            if (r2 == 0) goto Lb6
            return r2
        Lb6:
            java.lang.String r1 = "No destination with route "
            java.lang.String r2 = " is on the NavController's back stack. The current destination is "
            java.lang.StringBuilder r12 = B3.e.t(r1, r12, r2)
            I1.v r0 = r0.f()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.B.a(java.lang.String):I1.j");
    }

    public final void c() {
        L1.i iVar = this.f2518b;
        if (iVar.f3019f.isEmpty()) {
            return;
        }
        v f6 = iVar.f();
        AbstractC1276k.c(f6);
        if (iVar.l(f6.f2592e.a, true, false)) {
            iVar.b();
        }
    }
}
