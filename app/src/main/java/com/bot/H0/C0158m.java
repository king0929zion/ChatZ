package H0;

import T.C0628r0;
import T.d1;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.LocaleList;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import b0.AbstractC0874g;
import b0.AbstractC0881n;
import b0.C0880m;
import e1.InterfaceC0961c;
import f0.C0987j;
import i2.C1115i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.C1175w;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import q0.C1496b;
import r2.C1633f;
import r2.InterfaceC1632e;
import s.InterfaceC1648l;
import u4.AbstractC1763a;
import v.AbstractC1787b;
import w2.C1840j;
import w2.ComponentCallbacks2C1841k;
import y1.C1990d;
import z1.C2016a;

/* renamed from: H0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158m implements e0.e, InterfaceC1648l, InterfaceC1632e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1971c;

    /* renamed from: e, reason: collision with root package name */
    public Object f1972e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1973f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1974g;

    public /* synthetic */ C0158m(Object obj, Object obj2, Object obj3, int i6) {
        this.f1971c = i6;
        this.f1972e = obj;
        this.f1973f = obj2;
        this.f1974g = obj3;
    }

    public static final void b(C0158m c0158m, Network network, boolean z5) {
        boolean z6;
        Network[] allNetworks = ((ConnectivityManager) c0158m.f1972e).getAllNetworks();
        int length = allNetworks.length;
        boolean z7 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            Network network2 = allNetworks[i6];
            if (AbstractC1276k.b(network2, network)) {
                z6 = z5;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) c0158m.f1972e).getNetworkCapabilities(network2);
                z6 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z6) {
                z7 = true;
                break;
            }
            i6++;
        }
        ComponentCallbacks2C1841k componentCallbacks2C1841k = (ComponentCallbacks2C1841k) c0158m.f1973f;
        synchronized (componentCallbacks2C1841k) {
            try {
                C1115i c1115i = (C1115i) componentCallbacks2C1841k.f15412c.get();
                if (c1115i != null) {
                    if (c1115i.f12079e != null) {
                        C1840j.a("NetworkObserver", 4, z7 ? "ONLINE" : "OFFLINE", null);
                    }
                    componentCallbacks2C1841k.f15416h = z7;
                } else {
                    componentCallbacks2C1841k.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r2.InterfaceC1632e
    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1972e;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public void c(J j3, EnumC0167w enumC0167w) {
        A3.c cVar = (A3.c) this.f1972e;
        A3.c cVar2 = (A3.c) this.f1973f;
        A3.c cVar3 = (A3.c) this.f1974g;
        int ordinal = enumC0167w.ordinal();
        if (ordinal == 0) {
            cVar.f(j3);
            cVar3.f(j3);
            return;
        }
        if (ordinal == 1) {
            cVar2.f(j3);
            cVar3.f(j3);
            return;
        }
        if (ordinal == 2) {
            if (j3.f1741l != null) {
                cVar3.f(j3);
                return;
            } else {
                cVar.f(j3);
                return;
            }
        }
        if (ordinal != 3) {
            throw new RuntimeException();
        }
        if (j3.f1741l != null) {
            cVar3.f(j3);
        } else {
            cVar2.f(j3);
        }
    }

    public boolean d(J j3) {
        return !(j3.f1741l == null) && (((B0) ((A3.c) this.f1972e).f119e).contains(j3) || ((B0) ((A3.c) this.f1973f).f119e).contains(j3));
    }

    public Object e() {
        long b5 = AbstractC0874g.b();
        if (b5 == AbstractC0881n.a) {
            return this.f1974g;
        }
        C0880m c0880m = (C0880m) ((AtomicReference) this.f1972e).get();
        int a = c0880m.a(b5);
        if (a >= 0) {
            return c0880m.f11000c[a];
        }
        return null;
    }

    @Override // s.InterfaceC1648l
    public float f(float f6, float f7) {
        return S.l.f7374V;
    }

    public o0.q g() {
        return ((C1496b) this.f1974g).f13943c.f13941c;
    }

    public Z0.b h() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((F2.h) this.f1974g)) {
            try {
                Z0.b bVar = (Z0.b) this.f1973f;
                if (bVar != null && localeList == ((LocaleList) this.f1972e)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.add(new Z0.a(localeList.get(i6)));
                }
                Z0.b bVar2 = new Z0.b(arrayList);
                this.f1972e = localeList;
                this.f1973f = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r6 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r6 != false) goto L32;
     */
    @Override // s.InterfaceC1648l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float i(float r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1972e
            r.t r0 = (r.C1606t) r0
            float r1 = r0.d()
            r.E r2 = r0.b()
            java.lang.Object r3 = r10.f1973f
            l4.c r3 = (l4.c) r3
            java.lang.Object r4 = r10.f1974g
            Y3.l r4 = (Y3.l) r4
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto Lb0
            float r5 = java.lang.Math.abs(r11)
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r7 = 0
            r8 = 1
            if (r5 <= 0) goto L27
            r5 = r8
            goto L28
        L27:
            r5 = r7
        L28:
            if (r5 == 0) goto L30
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 <= 0) goto L30
            r6 = r8
            goto L31
        L30:
            r6 = r7
        L31:
            if (r5 != 0) goto L3b
            java.lang.Object r11 = r2.a(r1)
            m4.AbstractC1276k.c(r11)
            goto La0
        L3b:
            float r11 = java.lang.Math.abs(r11)
            java.lang.Object r4 = r4.b()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r4 = java.lang.Math.abs(r4)
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 < 0) goto L59
            java.lang.Object r11 = r2.b(r1, r6)
            m4.AbstractC1276k.c(r11)
            goto La0
        L59:
            java.lang.Object r11 = r2.b(r1, r7)
            m4.AbstractC1276k.c(r11)
            float r4 = r2.c(r11)
            java.lang.Object r5 = r2.b(r1, r8)
            m4.AbstractC1276k.c(r5)
            float r2 = r2.c(r5)
            float r9 = r4 - r2
            float r9 = java.lang.Math.abs(r9)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            java.lang.Object r3 = r3.f(r9)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = java.lang.Math.abs(r3)
            if (r6 == 0) goto L8a
            goto L8b
        L8a:
            r4 = r2
        L8b:
            float r4 = r4 - r1
            float r2 = java.lang.Math.abs(r4)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L95
            r7 = r8
        L95:
            if (r7 != r8) goto L9a
            if (r6 == 0) goto La0
            goto L9f
        L9a:
            if (r7 != 0) goto Laa
            if (r6 == 0) goto L9f
            goto La0
        L9f:
            r11 = r5
        La0:
            r.E r0 = r0.b()
            float r11 = r0.c(r11)
            float r11 = r11 - r1
            return r11
        Laa:
            N0.e r11 = new N0.e
            r11.<init>()
            throw r11
        Lb0:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The offset provided to computeTarget must not be NaN."
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0158m.i(float):float");
    }

    public long j() {
        return ((C1496b) this.f1974g).f13943c.f13942d;
    }

    public boolean k(CharSequence charSequence, int i6, int i7, y1.u uVar) {
        if ((uVar.f16005c & 3) == 0) {
            y1.g gVar = (y1.g) this.f1974g;
            C2016a b5 = uVar.b();
            int a = b5.a(8);
            if (a != 0) {
                ((ByteBuffer) b5.f10524g).getShort(a + b5.f10521c);
            }
            C1990d c1990d = (C1990d) gVar;
            c1990d.getClass();
            ThreadLocal threadLocal = C1990d.f15967b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i6 < i7) {
                sb.append(charSequence.charAt(i6));
                i6++;
            }
            TextPaint textPaint = c1990d.a;
            String sb2 = sb.toString();
            int i8 = o1.d.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i9 = uVar.f16005c & 4;
            uVar.f16005c = hasGlyph ? i9 | 2 : i9 | 1;
        }
        return (uVar.f16005c & 3) == 2;
    }

    public boolean l() {
        return !(((B0) ((A3.c) this.f1972e).f119e).isEmpty() && ((B0) ((A3.c) this.f1974g).f119e).isEmpty() && ((B0) ((A3.c) this.f1973f).f119e).isEmpty());
    }

    public boolean m() {
        if (((d1) this.f1972e).getValue() != this.f1974g) {
            return true;
        }
        C0158m c0158m = (C0158m) this.f1973f;
        return c0158m != null && c0158m.m();
    }

    public Object n(CharSequence charSequence, int i6, int i7, int i8, boolean z5, y1.o oVar) {
        int i9;
        char c6;
        y1.q qVar = new y1.q((y1.t) ((B0.H) this.f1973f).f393f);
        int codePointAt = Character.codePointAt(charSequence, i6);
        int i10 = 0;
        boolean z6 = true;
        int i11 = i6;
        loop0: while (true) {
            i9 = i11;
            while (i11 < i7 && i10 < i8 && z6) {
                SparseArray sparseArray = qVar.f15990c.a;
                y1.t tVar = sparseArray == null ? null : (y1.t) sparseArray.get(codePointAt);
                if (qVar.a == 2) {
                    if (tVar != null) {
                        qVar.f15990c = tVar;
                        qVar.f15993f++;
                    } else {
                        if (codePointAt == 65038) {
                            qVar.a();
                        } else if (codePointAt != 65039) {
                            y1.t tVar2 = qVar.f15990c;
                            if (tVar2.f16002b != null) {
                                if (qVar.f15993f != 1) {
                                    qVar.f15991d = tVar2;
                                    qVar.a();
                                } else if (qVar.b()) {
                                    qVar.f15991d = qVar.f15990c;
                                    qVar.a();
                                } else {
                                    qVar.a();
                                }
                                c6 = 3;
                            } else {
                                qVar.a();
                            }
                        }
                        c6 = 1;
                    }
                    c6 = 2;
                } else if (tVar == null) {
                    qVar.a();
                    c6 = 1;
                } else {
                    qVar.a = 2;
                    qVar.f15990c = tVar;
                    qVar.f15993f = 1;
                    c6 = 2;
                }
                qVar.f15992e = codePointAt;
                if (c6 == 1) {
                    i11 = Character.charCount(Character.codePointAt(charSequence, i9)) + i9;
                    if (i11 < i7) {
                        codePointAt = Character.codePointAt(charSequence, i11);
                    }
                } else if (c6 == 2) {
                    int charCount = Character.charCount(codePointAt) + i11;
                    if (charCount < i7) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i11 = charCount;
                } else if (c6 == 3) {
                    if (z5 || !k(charSequence, i9, i11, qVar.f15991d.f16002b)) {
                        z6 = oVar.l(charSequence, i9, i11, qVar.f15991d.f16002b);
                        i10++;
                    }
                }
            }
        }
        if (qVar.a == 2 && qVar.f15990c.f16002b != null && ((qVar.f15993f > 1 || qVar.b()) && i10 < i8 && z6 && (z5 || !k(charSequence, i9, i11, qVar.f15990c.f16002b)))) {
            oVar.l(charSequence, i9, i11, qVar.f15990c.f16002b);
        }
        return oVar.k();
    }

    public void o(Object obj) {
        long b5 = AbstractC0874g.b();
        if (b5 == AbstractC0881n.a) {
            this.f1974g = obj;
            return;
        }
        synchronized (this.f1973f) {
            C0880m c0880m = (C0880m) ((AtomicReference) this.f1972e).get();
            int a = c0880m.a(b5);
            if (a < 0) {
                ((AtomicReference) this.f1972e).set(c0880m.b(b5, obj));
            } else {
                c0880m.f11000c[a] = obj;
            }
        }
    }

    public void p(o0.q qVar) {
        ((C1496b) this.f1974g).f13943c.f13941c = qVar;
    }

    public void q(InterfaceC0961c interfaceC0961c) {
        ((C1496b) this.f1974g).f13943c.a = interfaceC0961c;
    }

    public void r(e1.m mVar) {
        ((C1496b) this.f1974g).f13943c.f13940b = mVar;
    }

    public void s(long j3) {
        ((C1496b) this.f1974g).f13943c.f13942d = j3;
    }

    @Override // r2.InterfaceC1632e
    public void shutdown() {
        ((ConnectivityManager) this.f1972e).unregisterNetworkCallback((C1633f) this.f1974g);
    }

    public void t() {
        k.M m3 = (k.M) this.f1972e;
        String str = (String) this.f1973f;
        List list = (List) m3.k(str);
        if (list != null) {
            list.remove((InterfaceC1193a) this.f1974g);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        m3.m(str, list);
    }

    public String toString() {
        switch (this.f1971c) {
            case 1:
                String str = (String) this.f1974g;
                String str2 = (String) this.f1973f;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f1972e;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                AbstractC1276k.e(sb2, "toString(...)");
                return sb2;
            default:
                return super.toString();
        }
    }

    public C0158m(C0628r0 c0628r0) {
        this.f1971c = 3;
        this.f1972e = new AtomicInteger(0);
        this.f1973f = new E1.b(4);
        this.f1974g = new D.r(24, this, c0628r0);
    }

    public C0158m(View view) {
        this.f1971c = 4;
        this.f1972e = view;
        this.f1973f = X3.a.c(X3.g.f9391e, new A0.b(this, 11));
        this.f1974g = new C0987j(view);
    }

    public C0158m(C1496b c1496b) {
        this.f1971c = 10;
        this.f1974g = c1496b;
        this.f1972e = new C0987j(this, 14);
    }

    public C0158m(ConnectivityManager connectivityManager, ComponentCallbacks2C1841k componentCallbacks2C1841k) {
        this.f1971c = 12;
        this.f1972e = connectivityManager;
        this.f1973f = componentCallbacks2C1841k;
        C1633f c1633f = new C1633f(this);
        this.f1974g = c1633f;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c1633f);
    }

    public C0158m(int i6) {
        this.f1971c = i6;
        switch (i6) {
            case 2:
                this.f1972e = new C1175w(8);
                return;
            case AbstractC1787b.f15290g /* 5 */:
                this.f1974g = new F2.h(28);
                return;
            case 7:
                this.f1972e = new WeakHashMap();
                this.f1973f = new WeakHashMap();
                this.f1974g = new WeakHashMap();
                return;
            case 8:
                this.f1972e = new AtomicReference(AbstractC0874g.f10984c);
                this.f1973f = new Object();
                return;
            case 13:
                long[] jArr = k.V.a;
                this.f1972e = new k.M();
                return;
            case 15:
                this.f1972e = new LinkedHashSet();
                this.f1973f = new LinkedHashMap();
                this.f1974g = AbstractC1763a.a;
                return;
            default:
                this.f1972e = new A3.c(5, (byte) 0);
                this.f1973f = new A3.c(5, (byte) 0);
                this.f1974g = new A3.c(5, (byte) 0);
                return;
        }
    }

    public C0158m(B0.H h3, androidx.lifecycle.N n3, C1990d c1990d, Set set) {
        this.f1971c = 14;
        this.f1972e = n3;
        this.f1973f = h3;
        this.f1974g = c1990d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            n(str, 0, str.length(), 1, true, new C4.u(str, 2));
        }
    }

    public C0158m(W0.r rVar, C0158m c0158m) {
        this.f1971c = 6;
        this.f1972e = rVar;
        this.f1973f = c0158m;
        this.f1974g = rVar.f8849c;
    }
}
