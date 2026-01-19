package e0;

import D.Q0;
import F0.x0;
import F0.y0;
import Q4.y;
import Y3.B;
import Y3.w;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.WindowInsetsAnimation;
import f0.C0987j;
import i1.AbstractC1087g;
import i2.C1109c;
import i2.C1115i;
import i4.AbstractC1117a;
import i4.AbstractC1118b;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.H;
import k.J;
import k.S;
import m4.AbstractC1276k;
import o2.InterfaceC1407b;
import p.r;
import q2.C1501a;
import q2.C1502b;
import q2.C1504d;
import q2.C1505e;
import q2.InterfaceC1507g;
import s.C1649m;
import s.InterfaceC1648l;
import s2.C1655c;
import s2.C1657e;
import s2.C1661i;
import s2.C1664l;
import s2.C1665m;
import s2.C1667o;
import u.AbstractC1734b;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import w2.AbstractC1831a;
import w2.AbstractC1834d;
import w2.AbstractC1835e;
import w2.C1839i;
import w2.C1840j;
import w2.ComponentCallbacks2C1841k;
import x3.C1886j;
import x4.C1928k;
import x4.C1929l;
import y.C1956M;
import y1.o;
import y1.u;
import y1.v;
import y1.x;
import y3.C1993a;
import z.C2004b;
import z.C2009g;
import z.t;
import z3.K;
import z3.M;
import z3.N;
import z3.O;

/* loaded from: classes.dex */
public final class k implements j, InterfaceC1507g, InterfaceC1648l, Q4.e, y0, o {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11563c;

    /* renamed from: e, reason: collision with root package name */
    public Object f11564e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11565f;

    public /* synthetic */ k(int i6, Object obj, Object obj2) {
        this.f11563c = i6;
        this.f11564e = obj;
        this.f11565f = obj2;
    }

    public static C1657e n(C1661i c1661i, Throwable th) {
        if (th instanceof C1664l) {
            c1661i.getClass();
            C1655c c1655c = c1661i.f14790z;
            c1655c.getClass();
            C1655c c1655c2 = AbstractC1834d.a;
            c1655c.getClass();
        } else {
            c1661i.f14790z.getClass();
            C1655c c1655c3 = AbstractC1834d.a;
        }
        return new C1657e(null, c1661i, th);
    }

    public static C1667o r(n2.k kVar, C1661i c1661i, C1501a c1501a, C1502b c1502b) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1661i.a.getResources(), c1502b.a);
        Map map = c1502b.f13952b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z5 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = AbstractC1835e.a;
        if (kVar != null && kVar.f13405g) {
            z5 = true;
        }
        return new C1667o(bitmapDrawable, c1661i, k2.f.f12610c, c1501a, str, booleanValue, z5);
    }

    @Override // Q4.e
    public void a(U4.i iVar, IOException iOException) {
        Object obj;
        C1928k c1928k = (C1928k) this.f11565f;
        c1928k.getClass();
        if (C1928k.f15705j.get(c1928k) instanceof C1929l) {
            return;
        }
        E3.e eVar = (E3.e) this.f11564e;
        if (iOException instanceof C1886j) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            if (message == null || !AbstractC1776n.G(message, "connect", true)) {
                iOException = O.a(eVar, iOException);
            } else {
                f5.a aVar = O.a;
                AbstractC1276k.f(eVar, "request");
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append(eVar.a);
                sb.append(", connect_timeout=");
                M m3 = N.f16254d;
                K k3 = (K) eVar.a();
                if (k3 == null || (obj = k3.f16248b) == null) {
                    obj = "unknown";
                }
                sb.append(obj);
                sb.append(" ms]");
                iOException = new C1993a(sb.toString(), iOException);
            }
        }
        c1928k.k(X3.a.b(iOException));
    }

    @Override // e0.j
    public Object b(C0957b c0957b, Object obj) {
        return ((l4.e) this.f11564e).m(c0957b, obj);
    }

    @Override // q2.InterfaceC1507g
    public C1502b c(C1501a c1501a) {
        C1504d c1504d = (C1504d) ((C1505e) this.f11565f).b(c1501a);
        if (c1504d != null) {
            return new C1502b(c1504d.a, c1504d.f13954b);
        }
        return null;
    }

    @Override // e0.j
    public Object d(Object obj) {
        return ((l4.c) this.f11565f).f(obj);
    }

    @Override // F0.y0
    public void e(x0 x0Var) {
        H h3 = (H) this.f11565f;
        h3.a();
        J j3 = (J) x0Var.f1542e;
        Object[] objArr = j3.f12468b;
        long[] jArr = j3.f12469c;
        int i6 = j3.f12471e;
        while (i6 != Integer.MAX_VALUE) {
            int i7 = (int) ((jArr[i6] >> 31) & 2147483647L);
            Object obj = objArr[i6];
            Object b5 = ((C1956M) this.f11564e).b(obj);
            int d6 = h3.d(b5);
            int i8 = d6 >= 0 ? h3.f12462c[d6] : 0;
            if (i8 == 7) {
                x0Var.remove(obj);
            } else {
                h3.g(i8 + 1, b5);
            }
            i6 = i7;
        }
    }

    @Override // s.InterfaceC1648l
    public float f(float f6, float f7) {
        C2004b c2004b = (C2004b) this.f11564e;
        int n3 = ((t) c2004b.f16063p.getValue()).f16153c + c2004b.n();
        if (n3 == 0) {
            return S.l.f7374V;
        }
        int i6 = f6 < S.l.f7374V ? c2004b.f16052e + 1 : c2004b.f16052e;
        int f8 = AbstractC1117a.f(((int) (f7 / n3)) + i6, 0, c2004b.m());
        c2004b.n();
        int i7 = ((t) c2004b.f16063p.getValue()).f16153c;
        long j3 = i6;
        long j4 = 1;
        long j5 = j3 - j4;
        if (j5 < 0) {
            j5 = 0;
        }
        int i8 = (int) j5;
        long j6 = j3 + j4;
        if (j6 > 2147483647L) {
            j6 = 2147483647L;
        }
        int abs = Math.abs((AbstractC1117a.f(AbstractC1117a.f(f8, i8, (int) j6), 0, c2004b.m()) - i6) * n3) - n3;
        int i9 = abs >= 0 ? abs : 0;
        if (i9 == 0) {
            return i9;
        }
        return Math.signum(f6) * i9;
    }

    @Override // Q4.e
    public void g(U4.i iVar, y yVar) {
        if (iVar.f8725q) {
            return;
        }
        ((C1928k) this.f11565f).k(yVar);
    }

    @Override // F0.y0
    public boolean h(Object obj, Object obj2) {
        C1956M c1956m = (C1956M) this.f11564e;
        return AbstractC1276k.b(c1956m.b(obj), c1956m.b(obj2));
    }

    @Override // s.InterfaceC1648l
    public float i(float f6) {
        C2004b c2004b = (C2004b) this.f11564e;
        C1649m c1649m = c2004b.l().f16164n;
        List list = c2004b.l().a;
        int size = list.size();
        float f7 = Float.NEGATIVE_INFINITY;
        float f8 = Float.POSITIVE_INFINITY;
        for (int i6 = 0; i6 < size; i6++) {
            C2009g c2009g = (C2009g) list.get(i6);
            AbstractC1087g.l(c2004b.l());
            int i7 = c2004b.l().f16156f;
            int i8 = c2004b.l().f16154d;
            int i9 = c2004b.l().f16152b;
            int i10 = c2009g.f16114j;
            c2004b.m();
            c1649m.getClass();
            float f9 = i10 - 0;
            if (f9 <= S.l.f7374V && f9 > f7) {
                f7 = f9;
            }
            if (f9 >= S.l.f7374V && f9 < f8) {
                f8 = f9;
            }
        }
        if (f7 == Float.NEGATIVE_INFINITY) {
            f7 = f8;
        }
        if (f8 == Float.POSITIVE_INFINITY) {
            f8 = f7;
        }
        if (!c2004b.d()) {
            if (AbstractC1118b.p(c2004b, f6)) {
                f7 = 0.0f;
                f8 = 0.0f;
            } else {
                f8 = 0.0f;
            }
        }
        if (!c2004b.c()) {
            f7 = 0.0f;
            if (!AbstractC1118b.p(c2004b, f6)) {
                f8 = 0.0f;
            }
        }
        Float valueOf = Float.valueOf(f7);
        Float valueOf2 = Float.valueOf(f8);
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        float floatValue3 = ((Number) ((Q0) this.f11565f).d(Float.valueOf(f6), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
        if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != S.l.f7374V) {
            AbstractC1734b.c("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0");
        }
        return (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) ? S.l.f7374V : floatValue3;
    }

    @Override // q2.InterfaceC1507g
    public void j(C1501a c1501a, Bitmap bitmap, Map map) {
        int i6;
        int j3 = AbstractC1087g.j(bitmap);
        C1505e c1505e = (C1505e) this.f11565f;
        synchronized (c1505e.f12579c) {
            i6 = c1505e.a;
        }
        if (j3 <= i6) {
            ((C1505e) this.f11565f).c(c1501a, new C1504d(bitmap, map, j3));
        } else {
            ((C1505e) this.f11565f).d(c1501a);
            ((C0.c) this.f11564e).j(c1501a, bitmap, map, j3);
        }
    }

    @Override // y1.o
    public Object k() {
        return (x) this.f11564e;
    }

    @Override // y1.o
    public boolean l(CharSequence charSequence, int i6, int i7, u uVar) {
        if ((uVar.f16005c & 4) > 0) {
            return true;
        }
        if (((x) this.f11564e) == null) {
            this.f11564e = new x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((androidx.lifecycle.N) this.f11565f).getClass();
        ((x) this.f11564e).setSpan(new v(uVar), i6, i7, 33);
        return true;
    }

    public void m(R2.H h3, float f6) {
        ArrayList arrayList = (ArrayList) this.f11564e;
        arrayList.add(h3);
        if (((float[]) this.f11565f).length < arrayList.size()) {
            float[] copyOf = Arrays.copyOf((float[]) this.f11565f, arrayList.size() + 2);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f11565f = copyOf;
        }
        ((float[]) this.f11565f)[arrayList.size() - 1] = f6;
    }

    @Override // q2.InterfaceC1507g
    public void o(int i6) {
        int i7;
        if (i6 >= 40) {
            ((C1505e) this.f11565f).g(-1);
            return;
        }
        if (10 > i6 || i6 >= 20) {
            return;
        }
        C1505e c1505e = (C1505e) this.f11565f;
        synchronized (c1505e.f12579c) {
            i7 = c1505e.f12580d;
        }
        c1505e.g(i7 / 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
    
        if (r8 <= 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0192, code lost:
    
        if (java.lang.Math.abs(r0 - r5) <= r14) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0217 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q2.C1502b p(s2.C1661i r27, q2.C1501a r28, t2.C1723g r29, t2.EnumC1722f r30) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.p(s2.i, q2.a, t2.g, t2.f):q2.b");
    }

    public C1501a q(C1661i c1661i, Object obj, C1665m c1665m, C1109c c1109c) {
        String str;
        Map linkedHashMap;
        c1661i.getClass();
        List list = c1661i.f14770f;
        List list2 = ((C1115i) this.f11564e).f12081g.f12053c;
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                str = null;
                break;
            }
            X3.i iVar = (X3.i) list2.get(i6);
            InterfaceC1407b interfaceC1407b = (InterfaceC1407b) iVar.f9393c;
            if (((Class) iVar.f9394e).isAssignableFrom(obj.getClass())) {
                AbstractC1276k.d(interfaceC1407b, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                str = interfaceC1407b.a(obj, c1665m);
                if (str != null) {
                    break;
                }
            }
            i6++;
        }
        if (str == null) {
            return null;
        }
        Map map = c1661i.f14788x.f14806c;
        boolean isEmpty = map.isEmpty();
        w wVar = w.f9813c;
        if (isEmpty) {
            linkedHashMap = wVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new C1501a(str, wVar);
        }
        LinkedHashMap e02 = B.e0(linkedHashMap);
        if (!list.isEmpty()) {
            if (list.size() > 0) {
                list.get(0).getClass();
                throw new ClassCastException();
            }
            e02.put("coil#transformation_size", c1665m.f14793d.toString());
        }
        return new C1501a(str, e02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        if (((w2.InterfaceC1837g) r16.f11565f).l(r18) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s2.C1665m s(s2.C1661i r17, t2.C1723g r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f14770f
            android.graphics.Bitmap$Config r2 = r0.f14768d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = w2.AbstractC1835e.a
            boolean r1 = Y3.k.b0(r2, r1)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L32
        L1a:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r2 != r1) goto L35
            if (r2 != r1) goto L25
            boolean r1 = r0.f14775k
            if (r1 != 0) goto L25
            goto L17
        L25:
            r1 = r16
            java.lang.Object r3 = r1.f11565f
            w2.g r3 = (w2.InterfaceC1837g) r3
            boolean r3 = r3.l(r4)
            if (r3 == 0) goto L32
            goto L37
        L32:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            goto L37
        L35:
            r1 = r16
        L37:
            io.ktor.utils.io.u r3 = r4.a
            t2.b r5 = t2.C1718b.f14901b
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4e
            io.ktor.utils.io.u r3 = r4.f14910b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L4a
            goto L4e
        L4a:
            t2.f r3 = r0.f14787w
        L4c:
            r5 = r3
            goto L51
        L4e:
            t2.f r3 = t2.EnumC1722f.f14907e
            goto L4c
        L51:
            boolean r3 = r0.f14776l
            if (r3 == 0) goto L64
            java.util.List r3 = r0.f14770f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L64
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L64
            r3 = 1
        L62:
            r7 = r3
            goto L66
        L64:
            r3 = 0
            goto L62
        L66:
            s2.m r3 = new s2.m
            android.content.Context r1 = r0.a
            boolean r6 = w2.AbstractC1834d.a(r0)
            boolean r8 = r0.f14777m
            Q4.n r10 = r0.f14772h
            s2.p r11 = r0.f14773i
            s2.n r12 = r0.f14788x
            s2.b r13 = r0.f14778n
            s2.b r14 = r0.f14779o
            s2.b r15 = r0.f14780p
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.s(s2.i, t2.g):s2.m");
    }

    public void t() {
        if (((y0.b) this.f11565f) != null) {
            this.f11565f = null;
            ((r) this.f11564e).T0(true);
        }
    }

    public String toString() {
        switch (this.f11563c) {
            case 8:
                return "Bounds{lower=" + ((o1.c) this.f11564e) + " upper=" + ((o1.c) this.f11565f) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s2.C1665m u(s2.C1665m r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f14791b
            s2.b r3 = r0.f14804o
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            r5 = 1
            if (r2 != r4) goto L1d
            java.lang.Object r4 = r1.f11565f
            w2.g r4 = (w2.InterfaceC1837g) r4
            boolean r4 = r4.k()
            if (r4 == 0) goto L18
            goto L1d
        L18:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1b:
            r8 = r2
            goto L1f
        L1d:
            r4 = 0
            goto L1b
        L1f:
            s2.b r2 = r0.f14804o
            boolean r2 = r2.f14731c
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.f11564e
            w2.k r2 = (w2.ComponentCallbacks2C1841k) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L37
            boolean r6 = r2.f15416h     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            if (r6 != 0) goto L3a
            s2.b r3 = s2.EnumC1654b.DISABLED
        L34:
            r21 = r3
            goto L3c
        L37:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            r5 = r4
            goto L34
        L3c:
            if (r5 == 0) goto L68
            android.content.Context r7 = r0.a
            android.graphics.ColorSpace r9 = r0.f14792c
            t2.g r10 = r0.f14793d
            t2.f r11 = r0.f14794e
            boolean r12 = r0.f14795f
            boolean r13 = r0.f14796g
            boolean r14 = r0.f14797h
            java.lang.String r15 = r0.f14798i
            Q4.n r2 = r0.f14799j
            s2.p r3 = r0.f14800k
            s2.n r4 = r0.f14801l
            s2.b r5 = r0.f14802m
            s2.b r0 = r0.f14803n
            s2.m r6 = new s2.m
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.k.u(s2.m):s2.m");
    }

    public k(C1115i c1115i, ComponentCallbacks2C1841k componentCallbacks2C1841k, C1840j c1840j) {
        Object c0987j;
        this.f11563c = 7;
        this.f11564e = componentCallbacks2C1841k;
        int i6 = Build.VERSION.SDK_INT;
        if (AbstractC1831a.a) {
            c0987j = new C1839i(false);
        } else if (i6 != 26 && i6 != 27) {
            c0987j = new C1839i(true);
        } else {
            c0987j = new C0987j(c1840j, 24);
        }
        this.f11565f = c0987j;
    }

    public k(E3.e eVar, C1928k c1928k) {
        this.f11563c = 9;
        AbstractC1276k.f(eVar, "requestData");
        this.f11564e = eVar;
        this.f11565f = c1928k;
    }

    public k(C1115i c1115i, k kVar, C1840j c1840j) {
        this.f11563c = 2;
        this.f11564e = c1115i;
        this.f11565f = c1840j;
    }

    public k(C2004b c2004b, Q0 q02, z.w wVar) {
        this.f11563c = 6;
        this.f11564e = c2004b;
        this.f11565f = q02;
    }

    public k(int i6, C0.c cVar) {
        this.f11563c = 3;
        this.f11564e = cVar;
        this.f11565f = new C1505e(i6, this);
    }

    public k(C1956M c1956m) {
        this.f11563c = 10;
        this.f11564e = c1956m;
        H h3 = S.a;
        this.f11565f = new H();
    }

    public k(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f11563c = 8;
        lowerBound = bounds.getLowerBound();
        this.f11564e = o1.c.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f11565f = o1.c.c(upperBound);
    }

    public k(int i6) {
        this.f11563c = i6;
        switch (i6) {
            case AbstractC1787b.f15290g /* 5 */:
                this.f11564e = new C0.e(0);
                this.f11565f = new C0.e(0);
                return;
            case 11:
                return;
            default:
                this.f11564e = new ArrayList();
                float[] fArr = new float[5];
                for (int i7 = 0; i7 < 5; i7++) {
                    fArr[i7] = Float.NaN;
                }
                this.f11565f = fArr;
                return;
        }
    }

    public k(r rVar) {
        this.f11563c = 1;
        this.f11564e = rVar;
    }
}
