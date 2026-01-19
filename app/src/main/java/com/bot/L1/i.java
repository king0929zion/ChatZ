package L1;

import A4.Q;
import A4.V;
import A4.W;
import A4.g0;
import D.J0;
import H0.z0;
import I1.AbstractC0230i;
import I1.B;
import I1.D;
import I1.H;
import I1.I;
import I1.InterfaceC0227f;
import I1.o;
import I1.x;
import Y3.m;
import Y3.r;
import Y3.v;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.Z;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import m4.C1283r;
import z4.EnumC2050a;

/* loaded from: classes.dex */
public final class i {
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final I1.l f3015b;

    /* renamed from: c, reason: collision with root package name */
    public x f3016c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f3017d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle[] f3018e;

    /* renamed from: f, reason: collision with root package name */
    public final Y3.j f3019f = new Y3.j();

    /* renamed from: g, reason: collision with root package name */
    public final g0 f3020g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f3021h;

    /* renamed from: i, reason: collision with root package name */
    public final Q f3022i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f3023j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f3024k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f3025l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f3026m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0846u f3027n;

    /* renamed from: o, reason: collision with root package name */
    public o f3028o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3029p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC0842p f3030q;

    /* renamed from: r, reason: collision with root package name */
    public final f f3031r;

    /* renamed from: s, reason: collision with root package name */
    public final I f3032s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f3033t;

    /* renamed from: u, reason: collision with root package name */
    public l4.c f3034u;

    /* renamed from: v, reason: collision with root package name */
    public g f3035v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f3036w;

    /* renamed from: x, reason: collision with root package name */
    public int f3037x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f3038y;

    /* renamed from: z, reason: collision with root package name */
    public final V f3039z;

    public i(B b5, I1.l lVar) {
        this.a = b5;
        this.f3015b = lVar;
        v vVar = v.f9812c;
        this.f3020g = W.b(vVar);
        g0 b6 = W.b(vVar);
        this.f3021h = b6;
        this.f3022i = new Q(b6);
        this.f3023j = new LinkedHashMap();
        this.f3024k = new LinkedHashMap();
        this.f3025l = new LinkedHashMap();
        this.f3026m = new LinkedHashMap();
        this.f3029p = new ArrayList();
        this.f3030q = EnumC0842p.f10876e;
        this.f3031r = new f(this, 0);
        this.f3032s = new I();
        this.f3033t = new LinkedHashMap();
        this.f3036w = new LinkedHashMap();
        this.f3038y = new ArrayList();
        this.f3039z = W.a(0, 2, EnumC2050a.f16328e);
    }

    public static I1.v d(int i6, I1.v vVar, I1.v vVar2, boolean z5) {
        if (vVar.f2592e.a == i6 && (vVar2 == null || (vVar.equals(vVar2) && AbstractC1276k.b(vVar.f2593f, vVar2.f2593f)))) {
            return vVar;
        }
        x xVar = vVar instanceof x ? (x) vVar : null;
        if (xVar == null) {
            xVar = vVar.f2593f;
            AbstractC1276k.c(xVar);
        }
        return xVar.f2600i.u(i6, xVar, vVar2, z5);
    }

    public static /* synthetic */ void n(i iVar, I1.j jVar) {
        iVar.m(jVar, false, new Y3.j());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a3, code lost:
    
        r7.addFirst(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a6, code lost:
    
        r2 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r2.hasNext() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r4 = (I1.j) r2.next();
        r5 = r16.f3033t.get(r16.f3032s.b(r4.f2544e.f2591c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c6, code lost:
    
        if (r5 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c8, code lost:
    
        ((I1.m) r5).a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e6, code lost:
    
        throw new java.lang.IllegalStateException(B3.e.s(new java.lang.StringBuilder("NavigatorBackStack for "), r17.f2591c, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e7, code lost:
    
        r10.addAll(r7);
        r10.addLast(r19);
        r1 = Y3.m.A0(r7, r19);
        r2 = r1.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f6, code lost:
    
        if (r8 >= r2) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f8, code lost:
    
        r3 = r1.get(r8);
        r8 = r8 + 1;
        r3 = (I1.j) r3;
        r4 = r3.f2544e.f2593f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0204, code lost:
    
        if (r4 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0206, code lost:
    
        j(r3, e(r4.f2592e.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0212, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x015b, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00a3, code lost:
    
        r11 = ((I1.j) r7.first()).f2544e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r7 = new Y3.j();
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if ((r17 instanceof I1.x) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        m4.AbstractC1276k.c(r11);
        r11 = r11.f2593f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r13 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r13.hasPrevious() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r14 = r13.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (m4.AbstractC1276k.b(((I1.j) r14).f2544e, r11) == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r14 = (I1.j) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r14 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r14 = F2.h.f(r5, r11, r18, h(), r16.f3028o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r7.addFirst(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r10.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0016, code lost:
    
        if (r7 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (((I1.j) r10.last()).f2544e != r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        n(r16, (I1.j) r10.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r11 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r11 != r17) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r7.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r11 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (c(r11.f2592e.a, r11) == r11) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        r11 = r11.f2593f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        if (r11 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r18 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r10.isEmpty() != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (r18.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        r14 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
    
        if (r14.hasPrevious() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        r15 = r14.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        if (m4.AbstractC1276k.b(((I1.j) r15).f2544e, r11) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e7, code lost:
    
        r15 = (I1.j) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        if (r15 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        r15 = F2.h.f(r5, r11, r11.a(r13), h(), r16.f3028o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        r7.addFirst(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
    
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if ((((I1.j) r10.last()).f2544e instanceof I1.InterfaceC0227f) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        if (r7.isEmpty() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0105, code lost:
    
        r6 = ((I1.j) r7.first()).f2544e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0111, code lost:
    
        if (r10.isEmpty() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011d, code lost:
    
        if ((((I1.j) r10.last()).f2544e instanceof I1.x) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011f, code lost:
    
        r8 = ((I1.j) r10.last()).f2544e;
        m4.AbstractC1276k.d(r8, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013c, code lost:
    
        if (((k.X) ((I1.x) r8).f2600i.f3049f).c(r6.f2592e.a) != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013e, code lost:
    
        n(r16, (I1.j) r10.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0148, code lost:
    
        r6 = (I1.j) r10.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014e, code lost:
    
        if (r6 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0150, code lost:
    
        r6 = (I1.j) r7.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        if (r6 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0158, code lost:
    
        r6 = r6.f2544e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0162, code lost:
    
        if (m4.AbstractC1276k.b(r6, r16.f3016c) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (l(((I1.j) r10.last()).f2544e.f2592e.a, true, false) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0164, code lost:
    
        r4 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0170, code lost:
    
        if (r4.hasPrevious() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0172, code lost:
    
        r6 = r4.previous();
        r8 = ((I1.j) r6).f2544e;
        r9 = r16.f3016c;
        m4.AbstractC1276k.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0184, code lost:
    
        if (m4.AbstractC1276k.b(r8, r9) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0186, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0187, code lost:
    
        r12 = (I1.j) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0189, code lost:
    
        if (r12 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018b, code lost:
    
        r4 = r16.f3016c;
        m4.AbstractC1276k.c(r4);
        r6 = r16.f3016c;
        m4.AbstractC1276k.c(r6);
        r12 = F2.h.f(r5, r4, r6.a(r18), h(), r16.f3028o);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(I1.v r17, android.os.Bundle r18, I1.j r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.i.a(I1.v, android.os.Bundle, I1.j, java.util.List):void");
    }

    public final boolean b() {
        Y3.j jVar;
        while (true) {
            jVar = this.f3019f;
            if (jVar.isEmpty() || !(((I1.j) jVar.last()).f2544e instanceof x)) {
                break;
            }
            n(this, (I1.j) jVar.last());
        }
        I1.j jVar2 = (I1.j) jVar.g();
        ArrayList arrayList = this.f3038y;
        if (jVar2 != null) {
            arrayList.add(jVar2);
        }
        this.f3037x++;
        r();
        int i6 = this.f3037x - 1;
        this.f3037x = i6;
        if (i6 == 0) {
            ArrayList K0 = m.K0(arrayList);
            arrayList.clear();
            int size = K0.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = K0.get(i7);
                i7++;
                I1.j jVar3 = (I1.j) obj;
                Iterator it = this.f3029p.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    I1.v vVar = jVar3.f2544e;
                    jVar3.f2550k.a();
                    throw null;
                }
                this.f3039z.h(jVar3);
            }
            ArrayList K02 = m.K0(jVar);
            g0 g0Var = this.f3020g;
            g0Var.getClass();
            g0Var.l(null, K02);
            ArrayList o5 = o();
            g0 g0Var2 = this.f3021h;
            g0Var2.getClass();
            g0Var2.l(null, o5);
        }
        return jVar2 != null;
    }

    public final I1.v c(int i6, I1.v vVar) {
        I1.v vVar2;
        x xVar = this.f3016c;
        if (xVar == null) {
            return null;
        }
        if (xVar.f2592e.a == i6) {
            if (vVar == null) {
                return xVar;
            }
            if (AbstractC1276k.b(xVar, vVar) && vVar.f2593f == null) {
                return this.f3016c;
            }
        }
        I1.j jVar = (I1.j) this.f3019f.g();
        if (jVar == null || (vVar2 = jVar.f2544e) == null) {
            vVar2 = this.f3016c;
            AbstractC1276k.c(vVar2);
        }
        return d(i6, vVar2, vVar, false);
    }

    public final I1.j e(int i6) {
        Object obj;
        Y3.j jVar = this.f3019f;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((I1.j) obj).f2544e.f2592e.a == i6) {
                break;
            }
        }
        I1.j jVar2 = (I1.j) obj;
        if (jVar2 != null) {
            return jVar2;
        }
        StringBuilder k3 = AbstractC1135a.k("No destination with ID ", i6, " is on the NavController's back stack. The current destination is ");
        k3.append(f());
        throw new IllegalArgumentException(k3.toString().toString());
    }

    public final I1.v f() {
        I1.j jVar = (I1.j) this.f3019f.g();
        if (jVar != null) {
            return jVar.f2544e;
        }
        return null;
    }

    public final x g() {
        x xVar = this.f3016c;
        if (xVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        AbstractC1276k.d(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return xVar;
    }

    public final EnumC0842p h() {
        return this.f3027n == null ? EnumC0842p.f10877f : this.f3030q;
    }

    public final x i() {
        I1.v vVar;
        I1.j jVar = (I1.j) this.f3019f.g();
        if (jVar == null || (vVar = jVar.f2544e) == null) {
            vVar = this.f3016c;
            AbstractC1276k.c(vVar);
        }
        x xVar = vVar instanceof x ? (x) vVar : null;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = vVar.f2593f;
        AbstractC1276k.c(xVar2);
        return xVar2;
    }

    public final void j(I1.j jVar, I1.j jVar2) {
        this.f3023j.put(jVar, jVar2);
        LinkedHashMap linkedHashMap = this.f3024k;
        if (linkedHashMap.get(jVar2) == null) {
            linkedHashMap.put(jVar2, new a());
        }
        Object obj = linkedHashMap.get(jVar2);
        AbstractC1276k.c(obj);
        ((a) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0212, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x010f, code lost:
    
        if (r22.f2592e.a == r10.f2592e.a) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fd, code lost:
    
        if (r13.equals(r10) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
    
        r10 = new Y3.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011c, code lost:
    
        if (Y4.l.C(r21.f3019f) < r11) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011e, code lost:
    
        r12 = (I1.j) Y3.r.f0(r21.f3019f);
        q(r12);
        r13 = new I1.j(r12.f2543c, r12.f2544e, r12.f2544e.a(r23), r12.f2546g, r12.f2547h, r12.f2548i, r12.f2549j);
        r0 = r13.f2550k;
        r4 = r12.f2546g;
        r0.getClass();
        m4.AbstractC1276k.f(r4, "<set-?>");
        r0.f2992d = r4;
        r0 = r13.f2550k;
        r4 = r12.f2550k.f2999k;
        r0.getClass();
        m4.AbstractC1276k.f(r4, "maxState");
        r0.f2999k = r4;
        r0.b();
        r10.addFirst(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0171, code lost:
    
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
    
        if (r0.hasNext() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017b, code lost:
    
        r4 = (I1.j) r0.next();
        r7 = r4.f2544e.f2593f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0185, code lost:
    
        if (r7 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        j(r4, e(r7.f2592e.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0192, code lost:
    
        r21.f3019f.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0198, code lost:
    
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a0, code lost:
    
        if (r0.hasNext() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a2, code lost:
    
        r4 = (I1.j) r0.next();
        r7 = r21.f3032s.b(r4.f2544e.f2591c);
        r9 = r4.f2544e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b4, code lost:
    
        if (r9 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b7, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b8, code lost:
    
        if (r9 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bc, code lost:
    
        new I1.E().f2530b = true;
        r7.c(r9);
        r7 = r7.b();
        r9 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cd, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ce, code lost:
    
        r10 = Y3.m.K0((java.util.Collection) r7.f2556e.f201c.getValue());
        r12 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e8, code lost:
    
        if (r12.hasPrevious() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f8, code lost:
    
        if (m4.AbstractC1276k.b(((I1.j) r12.previous()).f2548i, r4.f2548i) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fa, code lost:
    
        r12 = r12.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0202, code lost:
    
        r10.set(r12, r4);
        r4 = r7.f2553b;
        r4.getClass();
        r4.l(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020e, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0201, code lost:
    
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0211, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0217  */
    /* JADX WARN: Type inference failed for: r1v1, types: [m4.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(I1.v r22, android.os.Bundle r23, I1.D r24) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.i.k(I1.v, android.os.Bundle, I1.D):void");
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [m4.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [m4.r, java.lang.Object] */
    public final boolean l(int i6, boolean z5, boolean z6) {
        I1.v vVar;
        boolean z7;
        Y3.j jVar = this.f3019f;
        final int i7 = 0;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m.C0(jVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            I1.v vVar2 = ((I1.j) it.next()).f2544e;
            String str = vVar2.f2591c;
            z0 z0Var = vVar2.f2592e;
            H b5 = this.f3032s.b(str);
            if (z5 || z0Var.a != i6) {
                arrayList.add(b5);
            }
            if (z0Var.a == i6) {
                vVar = vVar2;
                break;
            }
        }
        if (vVar == null) {
            int i8 = I1.v.f2590h;
            AbstractC1276k.f("Ignoring popBackStack to destination " + AbstractC0230i.a(this.a.f2519c, i6) + " as it was not found on the current back stack", "message");
            return false;
        }
        Object obj = new Object();
        Y3.j jVar2 = new Y3.j();
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                z7 = z6;
                break;
            }
            int i10 = i9 + 1;
            H h3 = (H) arrayList.get(i9);
            Object obj2 = new Object();
            I1.j jVar3 = (I1.j) jVar.last();
            z7 = z6;
            g gVar = new g((C1283r) obj2, (C1283r) obj, this, z7, jVar2);
            AbstractC1276k.f(h3, "navigator");
            AbstractC1276k.f(jVar3, "popUpTo");
            this.f3035v = gVar;
            h3.e(jVar3, z7);
            this.f3035v = null;
            if (!obj2.f12968c) {
                break;
            }
            i9 = i10;
        }
        if (z7) {
            LinkedHashMap linkedHashMap = this.f3025l;
            if (!z5) {
                t4.e eVar = new t4.e(new t4.o(t4.j.q(vVar, new I2.x(10)), new l4.c(this) { // from class: L1.h

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ i f3014e; {
                        this.f3014e = this;
                    }

                    @Override // l4.c
                    public final Object f(Object obj3) {
                        boolean containsKey;
                        I1.v vVar3 = (I1.v) obj3;
                        switch (i7) {
                            case 0:
                                AbstractC1276k.f(vVar3, "destination");
                                containsKey = this.f3014e.f3025l.containsKey(Integer.valueOf(vVar3.f2592e.a));
                                break;
                            default:
                                AbstractC1276k.f(vVar3, "destination");
                                containsKey = this.f3014e.f3025l.containsKey(Integer.valueOf(vVar3.f2592e.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (eVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((I1.v) eVar.next()).f2592e.a);
                    I1.k kVar = (I1.k) jVar2.e();
                    linkedHashMap.put(valueOf, kVar != null ? (String) kVar.a.f3002b : null);
                }
            }
            if (!jVar2.isEmpty()) {
                d dVar = ((I1.k) jVar2.first()).a;
                final int i11 = 1;
                t4.e eVar2 = new t4.e(new t4.o(t4.j.q(c(dVar.a, null), new I2.x(11)), new l4.c(this) { // from class: L1.h

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ i f3014e; {
                        this.f3014e = this;
                    }

                    @Override // l4.c
                    public final Object f(Object obj3) {
                        boolean containsKey;
                        I1.v vVar3 = (I1.v) obj3;
                        switch (i11) {
                            case 0:
                                AbstractC1276k.f(vVar3, "destination");
                                containsKey = this.f3014e.f3025l.containsKey(Integer.valueOf(vVar3.f2592e.a));
                                break;
                            default:
                                AbstractC1276k.f(vVar3, "destination");
                                containsKey = this.f3014e.f3025l.containsKey(Integer.valueOf(vVar3.f2592e.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (eVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((I1.v) eVar2.next()).f2592e.a), (String) dVar.f3002b);
                }
                if (linkedHashMap.values().contains((String) dVar.f3002b)) {
                    this.f3026m.put((String) dVar.f3002b, jVar2);
                }
            }
        }
        this.f3015b.b();
        return obj.f12968c;
    }

    public final void m(I1.j jVar, boolean z5, Y3.j jVar2) {
        o oVar;
        Q q3;
        Set set;
        AbstractC1276k.f(jVar, "popUpTo");
        Y3.j jVar3 = this.f3019f;
        I1.j jVar4 = (I1.j) jVar3.last();
        if (!AbstractC1276k.b(jVar4, jVar)) {
            throw new IllegalStateException(("Attempted to pop " + jVar.f2544e + ", which is not the top of the back stack (" + jVar4.f2544e + ')').toString());
        }
        r.f0(jVar3);
        I1.m mVar = (I1.m) this.f3033t.get(this.f3032s.b(jVar4.f2544e.f2591c));
        boolean z6 = true;
        if ((mVar == null || (q3 = mVar.f2557f) == null || (set = (Set) q3.f201c.getValue()) == null || !set.contains(jVar4)) && !this.f3024k.containsKey(jVar4)) {
            z6 = false;
        }
        EnumC0842p enumC0842p = jVar4.f2550k.f2998j.f10884g;
        EnumC0842p enumC0842p2 = EnumC0842p.f10877f;
        if (enumC0842p.compareTo(enumC0842p2) >= 0) {
            if (z5) {
                jVar4.b(enumC0842p2);
                jVar2.addFirst(new I1.k(jVar4));
            }
            if (z6) {
                jVar4.b(enumC0842p2);
            } else {
                jVar4.b(EnumC0842p.f10875c);
                q(jVar4);
            }
        }
        if (z5 || z6 || (oVar = this.f3028o) == null) {
            return;
        }
        String str = jVar4.f2548i;
        AbstractC1276k.f(str, "backStackEntryId");
        Z z7 = (Z) oVar.f2562b.remove(str);
        if (z7 != null) {
            z7.a();
        }
    }

    public final ArrayList o() {
        EnumC0842p enumC0842p;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3033t.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0842p = EnumC0842p.f10878g;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((I1.m) it.next()).f2557f.f201c.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                I1.j jVar = (I1.j) obj;
                if (!arrayList.contains(jVar) && jVar.f2550k.f2999k.compareTo(enumC0842p) < 0) {
                    arrayList2.add(obj);
                }
            }
            r.c0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f3019f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            I1.j jVar2 = (I1.j) next;
            if (!arrayList.contains(jVar2) && jVar2.f2550k.f2999k.compareTo(enumC0842p) >= 0) {
                arrayList3.add(next);
            }
        }
        r.c0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            if (!(((I1.j) obj2).f2544e instanceof x)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [m4.r, java.lang.Object] */
    public final boolean p(int i6, Bundle bundle, D d6) {
        I1.v g3;
        I1.j jVar;
        I1.v vVar;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i6);
        LinkedHashMap linkedHashMap = this.f3025l;
        int i7 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i6));
        Collection values = linkedHashMap.values();
        AbstractC1276k.f(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (AbstractC1276k.b((String) it.next(), str)) {
                it.remove();
            }
        }
        Y3.j jVar2 = (Y3.j) AbstractC1291z.a(this.f3026m).remove(str);
        e eVar = this.a.f2519c;
        ArrayList arrayList = new ArrayList();
        I1.j jVar3 = (I1.j) this.f3019f.g();
        if (jVar3 == null || (g3 = jVar3.f2544e) == null) {
            g3 = g();
        }
        if (jVar2 != null) {
            Iterator it2 = jVar2.iterator();
            while (it2.hasNext()) {
                I1.k kVar = (I1.k) it2.next();
                d dVar = kVar.a;
                d dVar2 = kVar.a;
                I1.v d7 = d(dVar.a, g3, null, true);
                if (d7 == null) {
                    int i8 = I1.v.f2590h;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC0230i.a(eVar, dVar2.a) + " cannot be found from the current destination " + g3).toString());
                }
                EnumC0842p h3 = h();
                o oVar = this.f3028o;
                AbstractC1276k.f(eVar, "context");
                AbstractC1276k.f(h3, "hostLifecycleState");
                Bundle bundle3 = (Bundle) dVar2.f3003c;
                if (bundle3 != null) {
                    Context context = eVar.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) dVar2.f3002b;
                Bundle bundle4 = (Bundle) dVar2.f3004d;
                AbstractC1276k.f(str2, Attribute.ID_ATTR);
                arrayList.add(new I1.j(eVar, d7, bundle2, h3, oVar, str2, bundle4));
                g3 = d7;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (!(((I1.j) obj).f2544e instanceof x)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList3.get(i10);
            i10++;
            I1.j jVar4 = (I1.j) obj2;
            List list = (List) m.x0(arrayList2);
            if (AbstractC1276k.b((list == null || (jVar = (I1.j) m.w0(list)) == null || (vVar = jVar.f2544e) == null) ? null : vVar.f2591c, jVar4.f2544e.f2591c)) {
                list.add(jVar4);
            } else {
                arrayList2.add(Y4.l.K(jVar4));
            }
        }
        Object obj3 = new Object();
        int size3 = arrayList2.size();
        while (i7 < size3) {
            Object obj4 = arrayList2.get(i7);
            i7++;
            List list2 = (List) obj4;
            H b5 = this.f3032s.b(((I1.j) m.o0(list2)).f2544e.f2591c);
            ArrayList arrayList4 = arrayList;
            this.f3034u = new J0(obj3, arrayList4, new Object(), this, bundle, 1);
            b5.d(list2, d6);
            this.f3034u = null;
            arrayList = arrayList4;
        }
        return obj3.f12968c;
    }

    public final void q(I1.j jVar) {
        AbstractC1276k.f(jVar, "child");
        I1.j jVar2 = (I1.j) this.f3023j.remove(jVar);
        if (jVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f3024k;
        a aVar = (a) linkedHashMap.get(jVar2);
        Integer valueOf = aVar != null ? Integer.valueOf(aVar.a.decrementAndGet()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            I1.m mVar = (I1.m) this.f3033t.get(this.f3032s.b(jVar2.f2544e.f2591c));
            if (mVar != null) {
                mVar.c(jVar2);
            }
            linkedHashMap.remove(jVar2);
        }
    }

    public final void r() {
        a aVar;
        Q q3;
        Set set;
        ArrayList K0 = m.K0(this.f3019f);
        if (K0.isEmpty()) {
            return;
        }
        ArrayList K2 = Y4.l.K(((I1.j) m.w0(K0)).f2544e);
        ArrayList arrayList = new ArrayList();
        if (m.w0(K2) instanceof InterfaceC0227f) {
            Iterator it = m.C0(K0).iterator();
            while (it.hasNext()) {
                I1.v vVar = ((I1.j) it.next()).f2544e;
                arrayList.add(vVar);
                if (!(vVar instanceof InterfaceC0227f) && !(vVar instanceof x)) {
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        for (I1.j jVar : m.C0(K0)) {
            EnumC0842p enumC0842p = jVar.f2550k.f2999k;
            I1.v vVar2 = jVar.f2544e;
            I1.v vVar3 = (I1.v) m.q0(K2);
            EnumC0842p enumC0842p2 = EnumC0842p.f10879h;
            EnumC0842p enumC0842p3 = EnumC0842p.f10878g;
            if (vVar3 != null && vVar3.f2592e.a == vVar2.f2592e.a) {
                if (enumC0842p != enumC0842p2) {
                    I1.m mVar = (I1.m) this.f3033t.get(this.f3032s.b(jVar.f2544e.f2591c));
                    if (AbstractC1276k.b((mVar == null || (q3 = mVar.f2557f) == null || (set = (Set) q3.f201c.getValue()) == null) ? null : Boolean.valueOf(set.contains(jVar)), Boolean.TRUE) || ((aVar = (a) this.f3024k.get(jVar)) != null && aVar.a.get() == 0)) {
                        hashMap.put(jVar, enumC0842p3);
                    } else {
                        hashMap.put(jVar, enumC0842p2);
                    }
                }
                I1.v vVar4 = (I1.v) m.q0(arrayList);
                if (vVar4 != null && vVar4.f2592e.a == vVar2.f2592e.a) {
                    r.e0(arrayList);
                }
                r.e0(K2);
                x xVar = vVar2.f2593f;
                if (xVar != null) {
                    K2.add(xVar);
                }
            } else if (arrayList.isEmpty() || vVar2.f2592e.a != ((I1.v) m.o0(arrayList)).f2592e.a) {
                jVar.b(EnumC0842p.f10877f);
            } else {
                I1.v vVar5 = (I1.v) r.e0(arrayList);
                if (enumC0842p == enumC0842p2) {
                    jVar.b(enumC0842p3);
                } else if (enumC0842p != enumC0842p3) {
                    hashMap.put(jVar, enumC0842p3);
                }
                x xVar2 = vVar5.f2593f;
                if (xVar2 != null && !arrayList.contains(xVar2)) {
                    arrayList.add(xVar2);
                }
            }
        }
        int size = K0.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = K0.get(i6);
            i6++;
            I1.j jVar2 = (I1.j) obj;
            EnumC0842p enumC0842p4 = (EnumC0842p) hashMap.get(jVar2);
            if (enumC0842p4 != null) {
                jVar2.b(enumC0842p4);
            } else {
                jVar2.f2550k.b();
            }
        }
    }
}
