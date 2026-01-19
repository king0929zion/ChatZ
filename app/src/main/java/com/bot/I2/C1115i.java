package i2;

import C4.o;
import Q4.p;
import X3.n;
import Y3.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import e0.k;
import i4.AbstractC1117a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.C1252a;
import m2.C1260i;
import n2.C1370i;
import o2.C1406a;
import p2.C1485a;
import s2.C1655c;
import s2.C1657e;
import s2.C1661i;
import s2.C1667o;
import u2.InterfaceC1756a;
import w2.AbstractC1835e;
import w2.C1838h;
import w2.C1840j;
import w2.ComponentCallbacks2C1841k;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.t0;

/* renamed from: i2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115i {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final C1655c f12076b;

    /* renamed from: c, reason: collision with root package name */
    public final n f12077c;

    /* renamed from: d, reason: collision with root package name */
    public final C1838h f12078d;

    /* renamed from: e, reason: collision with root package name */
    public final C1840j f12079e;

    /* renamed from: f, reason: collision with root package name */
    public final k f12080f;

    /* renamed from: g, reason: collision with root package name */
    public final C1108b f12081g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f12082h;

    /* JADX WARN: Type inference failed for: r6v0, types: [E1.b, java.lang.Object] */
    public C1115i(Context context, C1655c c1655c, n nVar, n nVar2, n nVar3, C1108b c1108b, C1838h c1838h, C1840j c1840j) {
        this.a = context;
        this.f12076b = c1655c;
        this.f12077c = nVar;
        this.f12078d = c1838h;
        this.f12079e = c1840j;
        t0 e6 = AbstractC1888A.e();
        E4.e eVar = AbstractC1898K.a;
        AbstractC1888A.c(Y4.d.P(e6, o.a.f16023i).Y(new C1114h(this)));
        ComponentCallbacks2C1841k componentCallbacks2C1841k = new ComponentCallbacks2C1841k(this);
        k kVar = new k(this, componentCallbacks2C1841k, c1840j);
        this.f12080f = kVar;
        ?? obj = new Object();
        obj.a = m.K0(c1108b.a);
        obj.f1292b = m.K0(c1108b.f12052b);
        obj.f1293c = m.K0(c1108b.f12053c);
        obj.f1294d = m.K0(c1108b.f12054d);
        obj.f1295e = m.K0(c1108b.f12055e);
        obj.e(new C1485a(2), p.class);
        int i6 = 5;
        obj.e(new C1485a(i6), String.class);
        obj.e(new C1485a(1), Uri.class);
        obj.e(new C1485a(4), Uri.class);
        int i7 = 3;
        obj.e(new C1485a(i7), Integer.class);
        int i8 = 0;
        obj.e(new C1485a(i8), byte[].class);
        Object obj2 = new Object();
        ArrayList arrayList = (ArrayList) obj.f1293c;
        arrayList.add(new X3.i(obj2, Uri.class));
        arrayList.add(new X3.i(new C1406a(c1838h.a), File.class));
        obj.d(new C1260i(nVar3, nVar2, c1838h.f15407c), Uri.class);
        obj.d(new C1252a(i6), File.class);
        obj.d(new C1252a(i8), Uri.class);
        obj.d(new C1252a(i7), Uri.class);
        obj.d(new C1252a(6), Uri.class);
        obj.d(new C1252a(4), Drawable.class);
        obj.d(new C1252a(1), Bitmap.class);
        obj.d(new C1252a(2), ByteBuffer.class);
        k2.c cVar = new k2.c(c1838h.f15408d, c1838h.f15409e);
        ArrayList arrayList2 = (ArrayList) obj.f1295e;
        arrayList2.add(cVar);
        List v5 = AbstractC1117a.v((ArrayList) obj.a);
        this.f12081g = new C1108b(v5, AbstractC1117a.v((ArrayList) obj.f1292b), AbstractC1117a.v(arrayList), AbstractC1117a.v((ArrayList) obj.f1294d), AbstractC1117a.v(arrayList2));
        this.f12082h = m.A0(v5, new C1370i(this, componentCallbacks2C1841k, kVar, c1840j));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|(5:(1:(1:(9:11|12|13|14|15|16|(1:18)(2:22|(1:24)(2:25|26))|19|20)(2:46|47))(11:48|49|50|51|52|53|54|55|56|(6:59|15|16|(0)(0)|19|20)|58))(4:70|71|72|73)|69|30|31|(4:33|(1:35)|36|37)(3:38|19|20))(4:90|91|92|(3:94|(1:96)|98)(2:99|100))|74|75|(1:77)|78|(1:80)|81|(7:83|52|53|54|55|56|(0))|58))|103|6|(0)(0)|74|75|(0)|78|(0)|81|(0)|58|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d3, code lost:
    
        r4 = r6;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00bb, code lost:
    
        if (i4.AbstractC1121e.e(r0, r2) == r8) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012e A[Catch: all -> 0x0137, TryCatch #3 {all -> 0x0137, blocks: (B:16:0x0128, B:18:0x012e, B:22:0x013b, B:24:0x013f, B:25:0x014d, B:26:0x0152), top: B:15:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b A[Catch: all -> 0x0137, TryCatch #3 {all -> 0x0137, blocks: (B:16:0x0128, B:18:0x012e, B:22:0x013b, B:24:0x013f, B:25:0x014d, B:26:0x0152), top: B:15:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0168 A[Catch: all -> 0x0189, TryCatch #5 {all -> 0x0189, blocks: (B:31:0x0164, B:33:0x0168, B:35:0x016c, B:36:0x0182, B:37:0x0188, B:38:0x018b), top: B:30:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018b A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #5 {all -> 0x0189, blocks: (B:31:0x0164, B:33:0x0168, B:35:0x016c, B:36:0x0182, B:37:0x0188, B:38:0x018b), top: B:30:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:75:0x00c4, B:77:0x00ce, B:78:0x00d6, B:80:0x00e1, B:81:0x00e4), top: B:74:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:75:0x00c4, B:77:0x00ce, B:78:0x00d6, B:80:0x00e1, B:81:0x00e4), top: B:74:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i2.C1115i r19, s2.C1661i r20, int r21, d4.c r22) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C1115i.a(i2.i, s2.i, int, d4.c):java.lang.Object");
    }

    public final void b(C1657e c1657e, InterfaceC1756a interfaceC1756a, C1109c c1109c) {
        C1661i c1661i = c1657e.f14746b;
        if (this.f12079e != null) {
            C1840j.a("RealImageLoader", 4, "🚨 Failed - " + c1661i.f14766b + " - " + c1657e.f14747c, null);
        }
        if (interfaceC1756a instanceof j2.m) {
            v2.d a = c1657e.f14746b.f14771g.a((j2.m) interfaceC1756a, c1657e);
            if (a instanceof v2.c) {
                interfaceC1756a.getClass();
            } else {
                c1109c.getClass();
                a.a();
            }
        }
        c1109c.getClass();
        c1661i.getClass();
    }

    public final void c(C1667o c1667o, InterfaceC1756a interfaceC1756a, C1109c c1109c) {
        String str;
        C1661i c1661i = c1667o.f14807b;
        k2.f fVar = c1667o.f14808c;
        if (this.f12079e != null) {
            StringBuilder sb = new StringBuilder();
            Bitmap.Config[] configArr = AbstractC1835e.a;
            int ordinal = fVar.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                str = "🧠";
            } else if (ordinal == 2) {
                str = "💾";
            } else {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                str = "☁️ ";
            }
            sb.append(str);
            sb.append(" Successful (");
            sb.append(fVar.name());
            sb.append(") - ");
            sb.append(c1661i.f14766b);
            C1840j.a("RealImageLoader", 4, sb.toString(), null);
        }
        if (interfaceC1756a instanceof j2.m) {
            v2.d a = c1667o.f14807b.f14771g.a((j2.m) interfaceC1756a, c1667o);
            if (a instanceof v2.c) {
                interfaceC1756a.getClass();
            } else {
                c1109c.getClass();
                a.a();
            }
        }
        c1109c.getClass();
        c1661i.getClass();
    }
}
