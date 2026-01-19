package m2;

import Q4.C0495c;
import Q4.r;
import Q4.v;
import X3.n;
import android.webkit.MimeTypeMap;
import d5.AbstractC0942b;
import d5.C;
import d5.C0948h;
import d5.o;
import d5.y;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import l2.C1187b;
import l2.C1192g;
import m4.AbstractC1276k;
import r2.C1629b;
import s2.C1665m;
import s2.EnumC1654b;
import u4.AbstractC1776n;
import u4.u;
import w2.AbstractC1835e;

/* renamed from: m2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263l implements InterfaceC1258g {

    /* renamed from: f, reason: collision with root package name */
    public static final C0495c f12941f = new C0495c(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0495c f12942g = new C0495c(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final C1665m f12943b;

    /* renamed from: c, reason: collision with root package name */
    public final n f12944c;

    /* renamed from: d, reason: collision with root package name */
    public final n f12945d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12946e;

    public C1263l(String str, C1665m c1665m, n nVar, n nVar2, boolean z5) {
        this.a = str;
        this.f12943b = c1665m;
        this.f12944c = nVar;
        this.f12945d = nVar2;
        this.f12946e = z5;
    }

    public static String d(String str, r rVar) {
        String b5;
        String str2 = rVar != null ? rVar.a : null;
        if ((str2 == null || u.D(str2, "text/plain", false)) && (b5 = AbstractC1835e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b5;
        }
        if (str2 != null) {
            return AbstractC1776n.h0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0128 A[Catch: Exception -> 0x00cc, TryCatch #2 {Exception -> 0x00cc, blocks: (B:91:0x0094, B:93:0x00a0, B:96:0x00d0, B:98:0x00d4, B:101:0x00ed, B:103:0x0135, B:106:0x0103, B:108:0x010f, B:109:0x0118, B:111:0x00b4, B:113:0x00be, B:115:0x0120, B:116:0x0127, B:117:0x0128), top: B:89:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d7 A[Catch: Exception -> 0x01fd, TryCatch #1 {Exception -> 0x01fd, blocks: (B:15:0x01d1, B:17:0x01d7, B:20:0x01f9, B:24:0x0200, B:25:0x0205), top: B:14:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0200 A[Catch: Exception -> 0x01fd, TryCatch #1 {Exception -> 0x01fd, blocks: (B:15:0x01d1, B:17:0x01d7, B:20:0x01f9, B:24:0x0200, B:25:0x0205), top: B:14:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0211 A[Catch: Exception -> 0x0054, TRY_ENTER, TryCatch #6 {Exception -> 0x0054, blocks: (B:44:0x004f, B:45:0x014f, B:47:0x0211, B:48:0x0216), top: B:43:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0094 A[Catch: Exception -> 0x00cc, TRY_ENTER, TryCatch #2 {Exception -> 0x00cc, blocks: (B:91:0x0094, B:93:0x00a0, B:96:0x00d0, B:98:0x00d4, B:101:0x00ed, B:103:0x0135, B:106:0x0103, B:108:0x010f, B:109:0x0118, B:111:0x00b4, B:113:0x00be, B:115:0x0120, B:116:0x0127, B:117:0x0128), top: B:89:0x0092 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, X3.f] */
    @Override // m2.InterfaceC1258g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(b4.InterfaceC0905c r15) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1263l.a(b4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(Q4.v r6, d4.c r7) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1263l.b(Q4.v, d4.c):java.lang.Object");
    }

    public final o c() {
        Object value = this.f12945d.getValue();
        AbstractC1276k.c(value);
        return ((C1192g) value).a;
    }

    public final v e() {
        E1.b bVar = new E1.b(1);
        bVar.t(this.a);
        C1665m c1665m = this.f12943b;
        Q4.n nVar = c1665m.f14799j;
        AbstractC1276k.f(nVar, "headers");
        bVar.f1294d = nVar.c();
        for (Map.Entry entry : c1665m.f14800k.a.entrySet()) {
            Object key = entry.getKey();
            AbstractC1276k.d(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Class cls = (Class) key;
            Object value = entry.getValue();
            if (value == null) {
                ((LinkedHashMap) bVar.a).remove(cls);
            } else {
                if (((LinkedHashMap) bVar.a).isEmpty()) {
                    bVar.a = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.a;
                Object cast = cls.cast(value);
                AbstractC1276k.c(cast);
                linkedHashMap.put(cls, cast);
            }
        }
        EnumC1654b enumC1654b = c1665m.f14803n;
        boolean z5 = enumC1654b.f14731c;
        boolean z6 = c1665m.f14804o.f14731c;
        if (!z6 && z5) {
            bVar.j(C0495c.f6499o);
        } else if (!z6 || z5) {
            if (!z6 && !z5) {
                bVar.j(f12942g);
            }
        } else if (enumC1654b.f14732e) {
            bVar.j(C0495c.f6498n);
        } else {
            bVar.j(f12941f);
        }
        return bVar.h();
    }

    public final C1629b f(C0948h c0948h) {
        Throwable th;
        C1629b c1629b;
        try {
            o c6 = c();
            C1187b c1187b = (C1187b) c0948h.f11480e;
            if (c1187b.f12685e) {
                throw new IllegalStateException("snapshot is closed");
            }
            C c7 = AbstractC0942b.c(c6.l((y) c1187b.f12684c.f12677c.get(0)));
            try {
                c1629b = new C1629b(c7);
                try {
                    c7.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    c7.close();
                } catch (Throwable th4) {
                    X3.a.a(th3, th4);
                }
                th = th3;
                c1629b = null;
            }
            if (th == null) {
                return c1629b;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public final k2.m g(C0948h c0948h) {
        C1187b c1187b = (C1187b) c0948h.f11480e;
        if (c1187b.f12685e) {
            throw new IllegalStateException("snapshot is closed");
        }
        y yVar = (y) c1187b.f12684c.f12677c.get(1);
        o c6 = c();
        String str = this.f12943b.f14798i;
        if (str == null) {
            str = this.a;
        }
        return new k2.m(yVar, c6, str, c0948h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (m4.AbstractC1276k.b(r6.f6662i.a("Vary"), "*") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d5.C0948h h(d5.C0948h r4, Q4.v r5, Q4.y r6, r2.C1629b r7) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1263l.h(d5.h, Q4.v, Q4.y, r2.b):d5.h");
    }
}
