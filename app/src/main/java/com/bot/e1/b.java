package E1;

import A.g;
import A4.O;
import A4.g0;
import M.q;
import P2.D0;
import Q4.C0495c;
import Q4.m;
import Q4.n;
import Q4.p;
import Q4.v;
import S0.AbstractC0546h;
import S0.C0543e;
import S0.C0544f;
import S0.C0545g;
import S0.C0556s;
import S0.P;
import S0.t;
import T.C0602e;
import T.InterfaceC0604f;
import T0.d;
import X3.i;
import Y3.B;
import Y3.C;
import Y3.w;
import Y4.l;
import Z2.C0782v0;
import a1.C0795c;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import android.text.Layout;
import androidx.lifecycle.N;
import b0.AbstractC0869b;
import b0.C0868a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import d5.o;
import d5.y;
import e0.k;
import e1.InterfaceC0961c;
import f0.C0987j;
import h5.e;
import i2.C1108b;
import i2.C1115i;
import i4.AbstractC1117a;
import i4.AbstractC1119c;
import j1.AbstractC1135a;
import java.io.File;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k.I;
import l2.C1192g;
import l4.InterfaceC1193a;
import m2.InterfaceC1257f;
import m4.AbstractC1276k;
import p2.C1485a;
import q2.C1503c;
import s2.C1655c;
import s4.j;
import u4.u;
import w2.AbstractC1834d;
import w2.AbstractC1835e;
import w2.C1838h;
import w2.C1840j;
import x4.AbstractC1898K;

/* loaded from: classes.dex */
public final class b implements t {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1292b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1293c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1294d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1295e;

    public b(Map map) {
        AbstractC1276k.f(map, "initialState");
        this.a = B.e0(map);
        this.f1292b = new LinkedHashMap();
        this.f1293c = new LinkedHashMap();
        this.f1294d = new LinkedHashMap();
        this.f1295e = new a(this, 0);
    }

    @Override // S0.t
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f1295e;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((C0556s) arrayList.get(i6)).a.a()) {
                return true;
            }
        }
        return false;
    }

        @Override // S0.t
    public float b() {
        return ((Number) this.f1293c.getValue()).floatValue();
    }

        @Override // S0.t
    public float c() {
        return ((Number) this.f1294d.getValue()).floatValue();
    }

    public void d(InterfaceC1257f interfaceC1257f, Class cls) {
        ((ArrayList) this.f1294d).add(new i(interfaceC1257f, cls));
    }

    public void e(C1485a c1485a, Class cls) {
        ((ArrayList) this.f1292b).add(new i(c1485a, cls));
    }

        public InterfaceC0604f f(AbstractC0869b abstractC0869b, InterfaceC1193a interfaceC1193a) {
        int i6;
        int i7;
        int i8;
        Object obj = new Object();
        obj.f12971c = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.f1292b;
            if (th != null) {
                abstractC0869b.b(th);
                return C0602e.f8078e;
            }
            C0868a c0868a = (C0868a) this.f1293c;
            do {
                i6 = c0868a.get();
                i7 = i6 + 1;
            } while (!c0868a.compareAndSet(i6, i7));
            boolean z5 = (134217727 & i7) == 1;
            obj.f12971c = (i7 >>> 27) & 15;
            ((I) this.f1294d).a(abstractC0869b);
            if (z5 && interfaceC1193a != null) {
                try {
                    interfaceC1193a.b();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.f1292b) == null) {
                                this.f1292b = th2;
                                I i9 = (I) this.f1294d;
                                Object[] objArr = i9.a;
                                int i10 = i9.f12466b;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((AbstractC0869b) objArr[i11]).b(th2);
                                }
                                ((I) this.f1294d).d();
                                C0868a c0868a2 = (C0868a) this.f1293c;
                                do {
                                    i8 = c0868a2.get();
                                } while (!c0868a2.compareAndSet(i8, ((((i8 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new q(new g(abstractC0869b, this, (Object) obj, 13));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi g(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f1292b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f1293c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f1294d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f1295e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.o(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f1295e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f1295e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.b.g(int):java.text.Bidi");
    }

    public v h() {
        Map unmodifiableMap;
        p pVar = (p) this.f1292b;
        if (pVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f1293c;
        n d6 = ((m) this.f1294d).d();
        j jVar = (j) this.f1295e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        byte[] bArr = R4.b.a;
        AbstractC1276k.f(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = w.f9813c;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            AbstractC1276k.e(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new v(pVar, str, d6, jVar, unmodifiableMap);
    }

    public C1115i i() {
        Context context = (Context) this.a;
        C1655c c1655c = (C1655c) this.f1292b;
        final int i6 = 0;
        X3.n d6 = X3.a.d(new InterfaceC1193a(this) { // from class: i2.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E1.b f12057e;

            {
                this.f12057e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i7;
                C1192g c1192g;
                switch (i6) {
                    case 0:
                        Context context2 = (Context) this.f12057e.a;
                        Bitmap.Config[] configArr = AbstractC1835e.a;
                        double d7 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            AbstractC1276k.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d7 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i8 = 0;
                        C0.c cVar = new C0.c(5, (byte) 0);
                        if (d7 > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC1835e.a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC1276k.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                i7 = (context2.getApplicationInfo().flags & PegdownExtensions.RELAXEDHRULES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                i7 = PegdownExtensions.WIKILINKS;
                            }
                            double d8 = d7 * i7;
                            double d9 = PegdownExtensions.ANCHORLINKS;
                            i8 = (int) (d8 * d9 * d9);
                        }
                        return new C1503c(i8 > 0 ? new k(i8, cVar) : new C0987j(cVar, 15), cVar);
                    default:
                        E1.b bVar = this.f12057e;
                        C1840j c1840j = C1840j.a;
                        Context context3 = (Context) bVar.a;
                        synchronized (c1840j) {
                            try {
                                c1192g = C1840j.f15411b;
                                if (c1192g == null) {
                                    d5.v vVar = o.a;
                                    E4.e eVar = AbstractC1898K.a;
                                    E4.d dVar = E4.d.f1360f;
                                    Bitmap.Config[] configArr3 = AbstractC1835e.a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File v5 = AbstractC1119c.v(cacheDir);
                                    String str = y.f11513e;
                                    y s5 = N.s(v5);
                                    long j3 = 10485760;
                                    try {
                                        File file = s5.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        j3 = AbstractC1117a.g((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    C1192g c1192g2 = new C1192g(j3, vVar, s5, dVar);
                                    C1840j.f15411b = c1192g2;
                                    c1192g = c1192g2;
                                }
                            } finally {
                            }
                        }
                        return c1192g;
                }
            }
        });
        final int i7 = 1;
        X3.n d7 = X3.a.d(new InterfaceC1193a(this) { // from class: i2.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E1.b f12057e;

            {
                this.f12057e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i72;
                C1192g c1192g;
                switch (i7) {
                    case 0:
                        Context context2 = (Context) this.f12057e.a;
                        Bitmap.Config[] configArr = AbstractC1835e.a;
                        double d72 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            AbstractC1276k.c(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d72 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i8 = 0;
                        C0.c cVar = new C0.c(5, (byte) 0);
                        if (d72 > 0.0d) {
                            Bitmap.Config[] configArr2 = AbstractC1835e.a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                AbstractC1276k.c(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                i72 = (context2.getApplicationInfo().flags & PegdownExtensions.RELAXEDHRULES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                            } catch (Exception unused2) {
                                i72 = PegdownExtensions.WIKILINKS;
                            }
                            double d8 = d72 * i72;
                            double d9 = PegdownExtensions.ANCHORLINKS;
                            i8 = (int) (d8 * d9 * d9);
                        }
                        return new C1503c(i8 > 0 ? new k(i8, cVar) : new C0987j(cVar, 15), cVar);
                    default:
                        E1.b bVar = this.f12057e;
                        C1840j c1840j = C1840j.a;
                        Context context3 = (Context) bVar.a;
                        synchronized (c1840j) {
                            try {
                                c1192g = C1840j.f15411b;
                                if (c1192g == null) {
                                    d5.v vVar = o.a;
                                    E4.e eVar = AbstractC1898K.a;
                                    E4.d dVar = E4.d.f1360f;
                                    Bitmap.Config[] configArr3 = AbstractC1835e.a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir == null) {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                    cacheDir.mkdirs();
                                    File v5 = AbstractC1119c.v(cacheDir);
                                    String str = y.f11513e;
                                    y s5 = N.s(v5);
                                    long j3 = 10485760;
                                    try {
                                        File file = s5.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        j3 = AbstractC1117a.g((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    } catch (Exception unused3) {
                                    }
                                    C1192g c1192g2 = new C1192g(j3, vVar, s5, dVar);
                                    C1840j.f15411b = c1192g2;
                                    c1192g = c1192g2;
                                }
                            } finally {
                            }
                        }
                        return c1192g;
                }
            }
        });
        X3.n d8 = X3.a.d(new C0782v0(16));
        C1108b c1108b = (C1108b) this.f1293c;
        if (c1108b == null) {
            Y3.v vVar = Y3.v.f9812c;
            c1108b = new C1108b(vVar, vVar, vVar, vVar, vVar);
        }
        return new C1115i(context, c1655c, d6, d7, d8, c1108b, (C1838h) this.f1294d, (C1840j) this.f1295e);
    }

    public void j(C0495c c0495c) {
        AbstractC1276k.f(c0495c, "cacheControl");
        String c0495c2 = c0495c.toString();
        if (c0495c2.length() == 0) {
            ((m) this.f1294d).f("Cache-Control");
        } else {
            p("Cache-Control", c0495c2);
        }
    }

    public void k(l4.c cVar) {
        int i6;
        synchronized (this.a) {
            try {
                I i7 = (I) this.f1294d;
                this.f1294d = (I) this.f1295e;
                this.f1295e = i7;
                C0868a c0868a = (C0868a) this.f1293c;
                do {
                    i6 = c0868a.get();
                } while (!c0868a.compareAndSet(i6, ((((i6 >>> 27) & 15) + 1) & 15) << 27));
                int i8 = i7.f12466b;
                for (int i9 = 0; i9 < i8; i9++) {
                    cVar.f(i7.f(i9));
                }
                i7.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float l(int i6, boolean z5) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i6));
        if (i6 > lineEnd) {
            i6 = lineEnd;
        }
        return z5 ? layout.getPrimaryHorizontal(i6) : layout.getSecondaryHorizontal(i6);
    }

    public float m(int i6, boolean z5, boolean z6) {
        int i7;
        int i8;
        int i9 = i6;
        Layout layout = (Layout) this.a;
        if (!z6) {
            return l(i6, z5);
        }
        int d6 = T0.g.d(layout, i9, z6);
        int lineStart = layout.getLineStart(d6);
        int lineEnd = layout.getLineEnd(d6);
        if (i9 != lineStart && i9 != lineEnd) {
            return l(i6, z5);
        }
        if (i9 == 0 || i9 == layout.getText().length()) {
            return l(i6, z5);
        }
        int n3 = n(i9, z6);
        boolean z7 = layout.getParagraphDirection(layout.getLineForOffset(o(n3))) == -1;
        int q3 = q(lineEnd, lineStart);
        int o5 = o(n3);
        int i10 = lineStart - o5;
        int i11 = q3 - o5;
        Bidi g3 = g(n3);
        Bidi createLineBidi = g3 != null ? g3.createLineBidi(i10, i11) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z5 || z7 == isRtlCharAt) {
                z7 = !z7;
            }
            return i9 == lineStart ? z7 : !z7 ? layout.getLineLeft(d6) : layout.getLineRight(d6);
        }
        int runCount = createLineBidi.getRunCount();
        d[] dVarArr = new d[runCount];
        for (int i12 = 0; i12 < runCount; i12++) {
            dVarArr[i12] = new d(createLineBidi.getRunStart(i12) + lineStart, createLineBidi.getRunLimit(i12) + lineStart, createLineBidi.getRunLevel(i12) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i13 = 0; i13 < runCount2; i13++) {
            bArr[i13] = (byte) createLineBidi.getRunLevel(i13);
        }
        Bidi.reorderVisually(bArr, 0, dVarArr, 0, runCount);
        if (i9 == lineStart) {
            int i14 = 0;
            while (true) {
                if (i14 >= runCount) {
                    i8 = -1;
                    break;
                }
                if (dVarArr[i14].a == i9) {
                    i8 = i14;
                    break;
                }
                i14++;
            }
            boolean z8 = (z5 || z7 == dVarArr[i8].f8303c) ? !z7 : z7;
            return (i8 == 0 && z8) ? layout.getLineLeft(d6) : (i8 != runCount - 1 || z8) ? z8 ? layout.getPrimaryHorizontal(dVarArr[i8 - 1].a) : layout.getPrimaryHorizontal(dVarArr[i8 + 1].a) : layout.getLineRight(d6);
        }
        if (i9 > q3) {
            i9 = q(i9, lineStart);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= runCount) {
                i7 = -1;
                break;
            }
            if (dVarArr[i15].f8302b == i9) {
                i7 = i15;
                break;
            }
            i15++;
        }
        boolean z9 = (z5 || z7 == dVarArr[i7].f8303c) ? z7 : !z7;
        return (i7 == 0 && z9) ? layout.getLineLeft(d6) : (i7 != runCount - 1 || z9) ? z9 ? layout.getPrimaryHorizontal(dVarArr[i7 - 1].f8302b) : layout.getPrimaryHorizontal(dVarArr[i7 + 1].f8302b) : layout.getLineRight(d6);
    }

    public int n(int i6, boolean z5) {
        ArrayList arrayList = (ArrayList) this.f1292b;
        int o5 = l.o(arrayList, Integer.valueOf(i6));
        int i7 = o5 < 0 ? -(o5 + 1) : o5 + 1;
        if (z5 && i7 > 0) {
            int i8 = i7 - 1;
            if (i6 == ((Number) arrayList.get(i8)).intValue()) {
                return i8;
            }
        }
        return i7;
    }

    public int o(int i6) {
        if (i6 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f1292b).get(i6 - 1)).intValue();
    }

    public void p(String str, String str2) {
        AbstractC1276k.f(str2, "value");
        m mVar = (m) this.f1294d;
        mVar.getClass();
        C.h(str);
        C.i(str2, str);
        mVar.f(str);
        mVar.a(str, str2);
    }

    public int q(int i6, int i7) {
        while (i6 > i7) {
            char charAt = ((Layout) this.a).getText().charAt(i6 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((AbstractC1276k.g(charAt, 8192) < 0 || AbstractC1276k.g(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i6;
            }
            i6--;
        }
        return i6;
    }

    public void r(String str, j jVar) {
        AbstractC1276k.f(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (jVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC1135a.s("method ", str, " must have a request body.").toString());
            }
        } else if (!e.d0(str)) {
            throw new IllegalArgumentException(AbstractC1135a.s("method ", str, " must not have a request body.").toString());
        }
        this.f1293c = str;
        this.f1295e = jVar;
    }

    public void s(Object obj, String str) {
        AbstractC1276k.f(str, "key");
        ((LinkedHashMap) this.a).put(str, obj);
        O o5 = (O) ((LinkedHashMap) this.f1293c).get(str);
        if (o5 != null) {
            ((g0) o5).k(obj);
        }
        O o6 = (O) ((LinkedHashMap) this.f1294d).get(str);
        if (o6 != null) {
            ((g0) o6).k(obj);
        }
    }

    public void t(String str) {
        AbstractC1276k.f(str, "url");
        if (u.D(str, "ws:", true)) {
            String substring = str.substring(3);
            AbstractC1276k.e(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (u.D(str, "wss:", true)) {
            String substring2 = str.substring(4);
            AbstractC1276k.e(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        AbstractC1276k.f(str, "<this>");
        Q4.o oVar = new Q4.o();
        oVar.c(null, str);
        this.f1292b = oVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
        public b(C0545g c0545g, P p5, List list, InterfaceC0961c interfaceC0961c, W0.d dVar) {
        int i6;
        String str;
        ArrayList arrayList;
        String str2;
        List list2;
        C0545g c0545g2 = c0545g;
        P p6 = p5;
        this.a = c0545g2;
        this.f1292b = list;
        final int i7 = 0;
        InterfaceC1193a interfaceC1193a = new InterfaceC1193a(this) { // from class: S0.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E1.b f7656e;

            {
                this.f7656e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                Object obj;
                Object obj2;
                switch (i7) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f7656e.f1295e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float b5 = ((C0556s) obj3).a.b();
                            int C5 = Y4.l.C(arrayList2);
                            int i8 = 1;
                            if (1 <= C5) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i8);
                                    float b6 = ((C0556s) obj4).a.b();
                                    if (Float.compare(b5, b6) < 0) {
                                        obj3 = obj4;
                                        b5 = b6;
                                    }
                                    if (i8 != C5) {
                                        i8++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C0556s c0556s = (C0556s) obj;
                        return Float.valueOf(c0556s != null ? c0556s.a.b() : S.l.f7374V);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f7656e.f1295e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c6 = ((C0556s) obj5).a.f10561i.c();
                            int C6 = Y4.l.C(arrayList3);
                            int i9 = 1;
                            if (1 <= C6) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i9);
                                    float c7 = ((C0556s) obj6).a.f10561i.c();
                                    if (Float.compare(c6, c7) < 0) {
                                        obj5 = obj6;
                                        c6 = c7;
                                    }
                                    if (i9 != C6) {
                                        i9++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C0556s c0556s2 = (C0556s) obj2;
                        return Float.valueOf(c0556s2 != null ? c0556s2.a.f10561i.c() : S.l.f7374V);
                }
            }
        };
        X3.g gVar = X3.g.f9391e;
        this.f1293c = X3.a.c(gVar, interfaceC1193a);
        final int i8 = 1;
        this.f1294d = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: S0.q

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ E1.b f7656e;

            {
                this.f7656e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                Object obj;
                Object obj2;
                switch (i8) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f7656e.f1295e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float b5 = ((C0556s) obj3).a.b();
                            int C5 = Y4.l.C(arrayList2);
                            int i82 = 1;
                            if (1 <= C5) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i82);
                                    float b6 = ((C0556s) obj4).a.b();
                                    if (Float.compare(b5, b6) < 0) {
                                        obj3 = obj4;
                                        b5 = b6;
                                    }
                                    if (i82 != C5) {
                                        i82++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C0556s c0556s = (C0556s) obj;
                        return Float.valueOf(c0556s != null ? c0556s.a.b() : S.l.f7374V);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f7656e.f1295e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c6 = ((C0556s) obj5).a.f10561i.c();
                            int C6 = Y4.l.C(arrayList3);
                            int i9 = 1;
                            if (1 <= C6) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i9);
                                    float c7 = ((C0556s) obj6).a.f10561i.c();
                                    if (Float.compare(c6, c7) < 0) {
                                        obj5 = obj6;
                                        c6 = c7;
                                    }
                                    if (i9 != C6) {
                                        i9++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C0556s c0556s2 = (C0556s) obj2;
                        return Float.valueOf(c0556s2 != null ? c0556s2.a.f10561i.c() : S.l.f7374V);
                }
            }
        });
        S0.u uVar = p6.f7613b;
        C0545g c0545g3 = AbstractC0546h.a;
        ArrayList arrayList2 = c0545g2.f7632g;
        String str3 = c0545g2.f7630e;
        Y3.v vVar = Y3.v.f9812c;
        List G02 = arrayList2 != null ? Y3.m.G0(arrayList2, new C0544f(i8)) : vVar;
        ArrayList arrayList3 = new ArrayList();
        Y3.j jVar = new Y3.j();
        int size = G02.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C0543e c0543e = (C0543e) G02.get(i9);
            C0543e a = C0543e.a(c0543e, uVar.a((S0.u) c0543e.a), i7, 14);
            Object obj = a.a;
            int i11 = a.f7627c;
            int i12 = a.f7626b;
            while (i10 < i12 && !jVar.isEmpty()) {
                C0543e c0543e2 = (C0543e) jVar.last();
                List list3 = G02;
                int i13 = c0543e2.f7627c;
                Y3.v vVar2 = vVar;
                Object obj2 = c0543e2.a;
                if (i12 < i13) {
                    arrayList3.add(new C0543e(i10, i12, obj2));
                    i10 = i12;
                    G02 = list3;
                    vVar = vVar2;
                } else {
                    int i14 = size;
                    arrayList3.add(new C0543e(i10, i13, obj2));
                    i10 = c0543e2.f7627c;
                    while (!jVar.isEmpty() && i10 == ((C0543e) jVar.last()).f7627c) {
                        jVar.removeLast();
                    }
                    G02 = list3;
                    vVar = vVar2;
                    size = i14;
                }
            }
            List list4 = G02;
            Y3.v vVar3 = vVar;
            int i15 = size;
            if (i10 < i12) {
                arrayList3.add(new C0543e(i10, i12, uVar));
                i10 = i12;
            }
            C0543e c0543e3 = (C0543e) jVar.g();
            if (c0543e3 != null) {
                int i16 = c0543e3.f7627c;
                Object obj3 = c0543e3.a;
                int i17 = c0543e3.f7626b;
                if (i17 == i12 && i16 == i11) {
                    jVar.removeLast();
                    jVar.addLast(new C0543e(i12, i11, ((S0.u) obj3).a((S0.u) obj)));
                } else if (i17 == i16) {
                    arrayList3.add(new C0543e(i17, i16, obj3));
                    jVar.removeLast();
                    jVar.addLast(new C0543e(i12, i11, obj));
                } else if (i16 >= i11) {
                    jVar.addLast(new C0543e(i12, i11, ((S0.u) obj3).a((S0.u) obj)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                jVar.addLast(new C0543e(i12, i11, obj));
            }
            i9++;
            G02 = list4;
            vVar = vVar3;
            size = i15;
            i7 = 0;
        }
        Y3.v vVar4 = vVar;
        while (i10 <= str3.length() && !jVar.isEmpty()) {
            C0543e c0543e4 = (C0543e) jVar.last();
            Object obj4 = c0543e4.a;
            int i18 = c0543e4.f7627c;
            arrayList3.add(new C0543e(i10, i18, obj4));
            while (!jVar.isEmpty() && i18 == ((C0543e) jVar.last()).f7627c) {
                jVar.removeLast();
            }
            i10 = i18;
        }
        if (i10 < str3.length()) {
            arrayList3.add(new C0543e(i10, str3.length(), uVar));
        }
        if (arrayList3.isEmpty()) {
            i6 = 0;
            arrayList3.add(new C0543e(0, 0, uVar));
        } else {
            i6 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i19 = i6;
        while (i19 < size2) {
            C0543e c0543e5 = (C0543e) arrayList3.get(i19);
            int i20 = c0543e5.f7626b;
            int i21 = c0543e5.f7627c;
            if (i20 != i21) {
                str = str3.substring(i20, i21);
                AbstractC1276k.e(str, "substring(...)");
            } else {
                str = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            List a6 = AbstractC0546h.a(c0545g2, i20, i21, new D0(21));
            C0545g c0545g4 = new C0545g(str, a6 == null ? vVar4 : a6);
            S0.u uVar2 = (S0.u) c0543e5.a;
            if (uVar2.f7665b == 0) {
                arrayList = arrayList3;
                str2 = str3;
                uVar2 = new S0.u(uVar2.a, uVar.f7665b, uVar2.f7666c, uVar2.f7667d, uVar2.f7668e, uVar2.f7669f, uVar2.f7670g, uVar2.f7671h, uVar2.f7672i);
            } else {
                arrayList = arrayList3;
                str2 = str3;
            }
            P p7 = new P(p6.a, uVar.a(uVar2));
            Object r5 = c0545g4.f7629c;
            Y3.v vVar5 = r5 == 0 ? vVar4 : r5;
            List list5 = (List) this.f1292b;
            ArrayList arrayList5 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i22 = 0;
            while (i22 < size3) {
                C0543e c0543e6 = (C0543e) list5.get(i22);
                int i23 = c0543e6.f7626b;
                S0.u uVar3 = uVar;
                int i24 = c0543e6.f7627c;
                if (AbstractC0546h.b(i20, i21, i23, i24)) {
                    if (i20 > i23 || i24 > i21) {
                        Y0.a.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList5.add(new C0543e(i23 - i20, i24 - i20, c0543e6.a));
                } else {
                    list2 = list5;
                }
                i22++;
                list5 = list2;
                uVar = uVar3;
            }
            arrayList4.add(new C0556s(new C0795c(str, p7, vVar5, arrayList5, dVar, interfaceC0961c), i20, i21));
            i19++;
            c0545g2 = c0545g;
            p6 = p5;
            str3 = str2;
            arrayList3 = arrayList;
        }
        this.f1295e = arrayList4;
    }

    public b(Context context) {
        this.a = context.getApplicationContext();
        this.f1292b = AbstractC1834d.a;
        this.f1293c = null;
        this.f1294d = new C1838h(true, true, true, 4, k2.j.f12620c);
        this.f1295e = null;
    }

    public b(int i6) {
        switch (i6) {
            case 4:
                this.a = new Object();
                this.f1293c = new AtomicInteger(0);
                this.f1294d = new I();
                this.f1295e = new I();
                return;
            default:
                this.a = new LinkedHashMap();
                this.f1293c = "GET";
                this.f1294d = new m(0);
                return;
        }
    }
}
