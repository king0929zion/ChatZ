package l2;

import N1.C0290l;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d5.A;
import d5.AbstractC0942b;
import d5.C;
import d5.o;
import d5.y;
import i4.AbstractC1120d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import u4.C1774l;
import u4.u;
import x4.AbstractC1888A;
import x4.AbstractC1939v;

/* renamed from: l2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190e implements Closeable, Flushable {

    /* renamed from: t, reason: collision with root package name */
    public static final C1774l f12689t = new C1774l("[a-z0-9_-]{1,120}");

    /* renamed from: c, reason: collision with root package name */
    public final y f12690c;

    /* renamed from: e, reason: collision with root package name */
    public final long f12691e;

    /* renamed from: f, reason: collision with root package name */
    public final y f12692f;

    /* renamed from: g, reason: collision with root package name */
    public final y f12693g;

    /* renamed from: h, reason: collision with root package name */
    public final y f12694h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f12695i;

    /* renamed from: j, reason: collision with root package name */
    public final C4.c f12696j;

    /* renamed from: k, reason: collision with root package name */
    public long f12697k;

    /* renamed from: l, reason: collision with root package name */
    public int f12698l;

    /* renamed from: m, reason: collision with root package name */
    public A f12699m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12700n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f12701o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12702p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12703q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12704r;

    /* renamed from: s, reason: collision with root package name */
    public final C1188c f12705s;

    public C1190e(long j3, o oVar, y yVar, AbstractC1939v abstractC1939v) {
        this.f12690c = yVar;
        this.f12691e = j3;
        if (j3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f12692f = yVar.d("journal");
        this.f12693g = yVar.d("journal.tmp");
        this.f12694h = yVar.d("journal.bkp");
        this.f12695i = new LinkedHashMap(0, 0.75f, true);
        this.f12696j = AbstractC1888A.c(Y4.d.P(AbstractC1888A.e(), abstractC1939v.g0(1)));
        this.f12705s = new C1188c(oVar);
    }

    public static void E(String str) {
        if (!f12689t.c(str)) {
            throw new IllegalArgumentException(B3.e.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        if ((r9.f12698l >= 2000) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:28:0x0056, B:29:0x0073, B:31:0x0081, B:33:0x0088, B:36:0x005c, B:38:0x006c, B:40:0x00a8, B:42:0x00af, B:45:0x00b4, B:47:0x00c5, B:50:0x00ca, B:51:0x0105, B:53:0x0110, B:59:0x0119, B:60:0x00e2, B:62:0x00f7, B:64:0x0102, B:67:0x0098, B:69:0x011e, B:70:0x0125), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(l2.C1190e r9, N1.C0290l r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C1190e.c(l2.e, N1.l, boolean):void");
    }

    public final synchronized void H() {
        Throwable th;
        try {
            A a = this.f12699m;
            if (a != null) {
                a.close();
            }
            A b5 = AbstractC0942b.b(this.f12705s.k(this.f12693g));
            try {
                b5.F("libcore.io.DiskLruCache");
                b5.writeByte(10);
                b5.F("1");
                b5.writeByte(10);
                b5.d(1);
                b5.writeByte(10);
                b5.d(2);
                b5.writeByte(10);
                b5.writeByte(10);
                for (C1186a c1186a : this.f12695i.values()) {
                    if (c1186a.f12681g != null) {
                        b5.F("DIRTY");
                        b5.writeByte(32);
                        b5.F(c1186a.a);
                        b5.writeByte(10);
                    } else {
                        b5.F("CLEAN");
                        b5.writeByte(32);
                        b5.F(c1186a.a);
                        for (long j3 : c1186a.f12676b) {
                            b5.writeByte(32);
                            b5.d(j3);
                        }
                        b5.writeByte(10);
                    }
                }
                try {
                    b5.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    b5.close();
                } catch (Throwable th4) {
                    X3.a.a(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.f12705s.f(this.f12692f)) {
                this.f12705s.b(this.f12692f, this.f12694h);
                this.f12705s.b(this.f12693g, this.f12692f);
                this.f12705s.e(this.f12694h);
            } else {
                this.f12705s.b(this.f12693g, this.f12692f);
            }
            this.f12699m = p();
            this.f12698l = 0;
            this.f12700n = false;
            this.f12704r = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f12701o && !this.f12702p) {
                for (C1186a c1186a : (C1186a[]) this.f12695i.values().toArray(new C1186a[0])) {
                    C0290l c0290l = c1186a.f12681g;
                    if (c0290l != null) {
                        C1186a c1186a2 = (C1186a) c0290l.f3755b;
                        if (AbstractC1276k.b(c1186a2.f12681g, c0290l)) {
                            c1186a2.f12680f = true;
                        }
                    }
                }
                y();
                AbstractC1888A.j(this.f12696j, null);
                A a = this.f12699m;
                AbstractC1276k.c(a);
                a.close();
                this.f12699m = null;
                this.f12702p = true;
                return;
            }
            this.f12702p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C0290l d(String str) {
        if (this.f12702p) {
            throw new IllegalStateException("cache is closed");
        }
        E(str);
        h();
        C1186a c1186a = (C1186a) this.f12695i.get(str);
        if ((c1186a != null ? c1186a.f12681g : null) != null) {
            return null;
        }
        if (c1186a != null && c1186a.f12682h != 0) {
            return null;
        }
        if (!this.f12703q && !this.f12704r) {
            A a = this.f12699m;
            AbstractC1276k.c(a);
            a.F("DIRTY");
            a.writeByte(32);
            a.F(str);
            a.writeByte(10);
            a.flush();
            if (this.f12700n) {
                return null;
            }
            if (c1186a == null) {
                c1186a = new C1186a(this, str);
                this.f12695i.put(str, c1186a);
            }
            C0290l c0290l = new C0290l(this, c1186a);
            c1186a.f12681g = c0290l;
            return c0290l;
        }
        j();
        return null;
    }

    public final synchronized C1187b f(String str) {
        C1187b a;
        if (this.f12702p) {
            throw new IllegalStateException("cache is closed");
        }
        E(str);
        h();
        C1186a c1186a = (C1186a) this.f12695i.get(str);
        if (c1186a != null && (a = c1186a.a()) != null) {
            boolean z5 = true;
            this.f12698l++;
            A a6 = this.f12699m;
            AbstractC1276k.c(a6);
            a6.F("READ");
            a6.writeByte(32);
            a6.F(str);
            a6.writeByte(10);
            if (this.f12698l < 2000) {
                z5 = false;
            }
            if (z5) {
                j();
            }
            return a;
        }
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f12701o) {
            if (this.f12702p) {
                throw new IllegalStateException("cache is closed");
            }
            y();
            A a = this.f12699m;
            AbstractC1276k.c(a);
            a.flush();
        }
    }

    public final synchronized void h() {
        try {
            if (this.f12701o) {
                return;
            }
            this.f12705s.e(this.f12693g);
            if (this.f12705s.f(this.f12694h)) {
                if (this.f12705s.f(this.f12692f)) {
                    this.f12705s.e(this.f12694h);
                } else {
                    this.f12705s.b(this.f12694h, this.f12692f);
                }
            }
            if (this.f12705s.f(this.f12692f)) {
                try {
                    r();
                    q();
                    this.f12701o = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC1120d.j(this.f12705s, this.f12690c);
                        this.f12702p = false;
                    } catch (Throwable th) {
                        this.f12702p = false;
                        throw th;
                    }
                }
            }
            H();
            this.f12701o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void j() {
        AbstractC1888A.y(this.f12696j, null, new C1189d(this, null), 3);
    }

    public final A p() {
        C1188c c1188c = this.f12705s;
        c1188c.getClass();
        y yVar = this.f12692f;
        AbstractC1276k.f(yVar, "file");
        return AbstractC0942b.b(new C1191f(c1188c.a(yVar), new W0.e(this, 8)));
    }

    public final void q() {
        Iterator it = this.f12695i.values().iterator();
        long j3 = 0;
        while (it.hasNext()) {
            C1186a c1186a = (C1186a) it.next();
            int i6 = 0;
            if (c1186a.f12681g == null) {
                while (i6 < 2) {
                    j3 += c1186a.f12676b[i6];
                    i6++;
                }
            } else {
                c1186a.f12681g = null;
                while (i6 < 2) {
                    y yVar = (y) c1186a.f12677c.get(i6);
                    C1188c c1188c = this.f12705s;
                    c1188c.e(yVar);
                    c1188c.e((y) c1186a.f12678d.get(i6));
                    i6++;
                }
                it.remove();
            }
        }
        this.f12697k = j3;
    }

    public final void r() {
        C c6 = AbstractC0942b.c(this.f12705s.l(this.f12692f));
        try {
            String A5 = c6.A(Long.MAX_VALUE);
            String A6 = c6.A(Long.MAX_VALUE);
            String A7 = c6.A(Long.MAX_VALUE);
            String A8 = c6.A(Long.MAX_VALUE);
            String A9 = c6.A(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(A5) || !"1".equals(A6) || !AbstractC1276k.b(String.valueOf(1), A7) || !AbstractC1276k.b(String.valueOf(2), A8) || A9.length() > 0) {
                throw new IOException("unexpected journal header: [" + A5 + ", " + A6 + ", " + A7 + ", " + A8 + ", " + A9 + ']');
            }
            int i6 = 0;
            while (true) {
                try {
                    s(c6.A(Long.MAX_VALUE));
                    i6++;
                } catch (EOFException unused) {
                    this.f12698l = i6 - this.f12695i.size();
                    if (c6.c()) {
                        this.f12699m = p();
                    } else {
                        H();
                    }
                    try {
                        c6.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                c6.close();
            } catch (Throwable th3) {
                X3.a.a(th, th3);
            }
        }
    }

    public final void s(String str) {
        String substring;
        int N5 = AbstractC1776n.N(str, SequenceUtils.SPC, 0, 6);
        if (N5 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i6 = N5 + 1;
        int N6 = AbstractC1776n.N(str, SequenceUtils.SPC, i6, 4);
        LinkedHashMap linkedHashMap = this.f12695i;
        if (N6 == -1) {
            substring = str.substring(i6);
            AbstractC1276k.e(substring, "substring(...)");
            if (N5 == 6 && u.D(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i6, N6);
            AbstractC1276k.e(substring, "substring(...)");
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new C1186a(this, substring);
            linkedHashMap.put(substring, obj);
        }
        C1186a c1186a = (C1186a) obj;
        if (N6 == -1 || N5 != 5 || !u.D(str, "CLEAN", false)) {
            if (N6 == -1 && N5 == 5 && u.D(str, "DIRTY", false)) {
                c1186a.f12681g = new C0290l(this, c1186a);
                return;
            } else {
                if (N6 != -1 || N5 != 4 || !u.D(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String substring2 = str.substring(N6 + 1);
        AbstractC1276k.e(substring2, "substring(...)");
        List b02 = AbstractC1776n.b0(substring2, new char[]{SequenceUtils.SPC}, 6);
        c1186a.f12679e = true;
        c1186a.f12681g = null;
        if (b02.size() != 2) {
            throw new IOException("unexpected journal line: " + b02);
        }
        try {
            int size = b02.size();
            for (int i7 = 0; i7 < size; i7++) {
                c1186a.f12676b[i7] = Long.parseLong((String) b02.get(i7));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + b02);
        }
    }

    public final void u(C1186a c1186a) {
        A a;
        int i6 = c1186a.f12682h;
        String str = c1186a.a;
        if (i6 > 0 && (a = this.f12699m) != null) {
            a.F("DIRTY");
            a.writeByte(32);
            a.F(str);
            a.writeByte(10);
            a.flush();
        }
        if (c1186a.f12682h > 0 || c1186a.f12681g != null) {
            c1186a.f12680f = true;
            return;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            this.f12705s.e((y) c1186a.f12677c.get(i7));
            long j3 = this.f12697k;
            long[] jArr = c1186a.f12676b;
            this.f12697k = j3 - jArr[i7];
            jArr[i7] = 0;
        }
        this.f12698l++;
        A a6 = this.f12699m;
        if (a6 != null) {
            a6.F("REMOVE");
            a6.writeByte(32);
            a6.F(str);
            a6.writeByte(10);
        }
        this.f12695i.remove(str);
        if (this.f12698l >= 2000) {
            j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        u(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f12697k
            long r2 = r4.f12691e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f12695i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            l2.a r1 = (l2.C1186a) r1
            boolean r2 = r1.f12680f
            if (r2 != 0) goto L12
            r4.u(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f12703q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.C1190e.y():void");
    }
}
