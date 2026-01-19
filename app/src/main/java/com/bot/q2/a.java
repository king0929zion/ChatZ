package Q2;

import D.C0064e;
import F0.AbstractC0137z;
import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import P2.C0348d;
import Q.A0;
import Q.M1;
import Q.N;
import Q.O;
import Q.f3;
import Q.t3;
import Q.u3;
import S0.P;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import T.X;
import T.e1;
import T.r;
import Y3.C;
import Y3.x;
import Z2.AbstractC0783w;
import android.app.DownloadManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import b0.C0873f;
import com.bot.feature.chat.presentation.components.dialog.UpdateInstallResultReceiver;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import i4.AbstractC1118b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import o0.s;
import o0.y;
import p.AbstractC1464z;
import t.C1682j;
import t0.AbstractC1688b;
import v.AbstractC1787b;
import v.AbstractC1799h;
import v.AbstractC1806l;
import v.Z;
import v.o0;
import v.p0;
import v.t0;
import w.AbstractC1829a;
import y2.AbstractC1992b;

/* loaded from: classes.dex */
public abstract class a {
    public static final C0873f a = new C0873f(new C0064e(3), false, -840291079);

    /* renamed from: b, reason: collision with root package name */
    public static final C0873f f6360b = new C0873f(new C0064e(4), false, 2139198367);

    public static final void a(String str, String str2, boolean z5, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        C0626q c0626q2;
        long j3;
        c0626q.d0(50574001);
        int i7 = i6 | (c0626q.f(str2) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.h(interfaceC1193a) ? 2048 : PegdownExtensions.ANCHORLINKS);
        if (c0626q.S(i7 & 1, (i7 & 1169) != 1168)) {
            e1 e1Var = O.a;
            long j4 = ((N) c0626q.j(e1Var)).f5407c;
            if (!z5) {
                j4 = s.f13480g;
            }
            if (z5) {
                c0626q.b0(-883132843);
                j3 = ((N) c0626q.j(e1Var)).f5409d;
                c0626q.p(false);
            } else {
                c0626q.b0(-883067650);
                j3 = ((N) c0626q.j(e1Var)).f5427q;
                c0626q.p(false);
            }
            float f6 = 8;
            InterfaceC1041r c6 = l0.h.c(t0.a, C.e.a(f6));
            boolean z6 = (i7 & 7168) == 2048;
            Object P5 = c0626q.P();
            if (z6 || P5 == C0616l.a) {
                P5 = new C0348d(10, interfaceC1193a);
                c0626q.m0(P5);
            }
            InterfaceC1041r z7 = AbstractC1787b.z(AbstractC1464z.f(AbstractC1992b.a(31, c6, (InterfaceC1193a) P5, false), j4, y.f13496b), 16, 12);
            p0 a6 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q, 48);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c7 = AbstractC1024a.c(c0626q, z7);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            r.G(c0626q, a6, C0150g.f1928f);
            r.G(c0626q, l3, C0150g.f1927e);
            r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q, C0150g.f1930h);
            r.G(c0626q, c7, C0150g.f1926d);
            P p5 = ((t3) c0626q.j(u3.a)).f6130k;
            W0.k kVar = z5 ? W0.k.f8835i : W0.k.f8834h;
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            f3.b(str2, new Z(1.0f, true), j3, 0L, kVar, 0L, null, 0L, 0, false, 0, 0, p5, c0626q, (i7 >> 3) & 14, 0, 131000);
            c0626q2 = c0626q;
            if (z5) {
                c0626q2.b0(1186463924);
                AbstractC1806l.a(AbstractC1464z.f(t0.j(C1038o.a, f6), ((N) c0626q2.j(e1Var)).a, C.e.a(4)), c0626q2, 0);
            } else {
                c0626q2.b0(1171715085);
            }
            c0626q2.p(false);
            c0626q2.p(true);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new g(str, str2, z5, interfaceC1193a, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r27, final boolean r28, final java.util.List r29, final java.lang.String r30, final l4.c r31, l4.InterfaceC1193a r32, final l4.InterfaceC1193a r33, v.InterfaceC1802i0 r34, final h0.InterfaceC1041r r35, T.C0626q r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.a.b(boolean, boolean, java.util.List, java.lang.String, l4.c, l4.a, l4.a, v.i0, h0.r, T.q, int, int):void");
    }

    public static final int c(X x5) {
        return ((Number) x5.getValue()).intValue();
    }

    public static final void d(final String str, final String str2, final boolean z5, final boolean z6, final boolean z7, final long j3, final InterfaceC1193a interfaceC1193a, final l4.c cVar, C0626q c0626q, final int i6) {
        C0626q c0626q2;
        long j4;
        boolean z8;
        c0626q.d0(-741723774);
        int i7 = i6 | (c0626q.f(str) ? 4 : 2) | (c0626q.f(str2) ? 32 : 16) | (c0626q.g(z5) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.g(z6) ? 2048 : PegdownExtensions.ANCHORLINKS) | (c0626q.g(z7) ? 16384 : 8192) | (c0626q.e(j3) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | (c0626q.h(interfaceC1193a) ? 1048576 : PegdownExtensions.SUBSCRIPT);
        if (c0626q.S(i7 & 1, (i7 & 4793491) != 4793490)) {
            Integer W5 = AbstractC0783w.W(str);
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (P5 == c0602e) {
                P5 = new C1682j();
                c0626q.m0(P5);
            }
            C1682j c1682j = (C1682j) P5;
            InterfaceC1041r f6 = AbstractC1464z.f(t0.a, j3, y.f13496b);
            boolean z9 = (i7 & 3670016) == 1048576;
            Object P6 = c0626q.P();
            if (z9 || P6 == c0602e) {
                P6 = new C0348d(11, interfaceC1193a);
                c0626q.m0(P6);
            }
            float f7 = 8;
            InterfaceC1041r z10 = AbstractC1787b.z(AbstractC1464z.j(f6, c1682j, null, z7, null, (InterfaceC1193a) P6, 24), 12, f7);
            Object P7 = c0626q.P();
            if (P7 == c0602e) {
                P7 = new P2.r(cVar, 2);
                c0626q.m0(P7);
            }
            InterfaceC1041r n3 = AbstractC0137z.n(z10, (l4.c) P7);
            p0 a6 = o0.a(AbstractC1799h.a, C1026c.f11796n, c0626q, 48);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, n3);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            r.G(c0626q, a6, C0150g.f1928f);
            r.G(c0626q, l3, C0150g.f1927e);
            r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            r.C(c0626q, C0150g.f1930h);
            r.G(c0626q, c6, C0150g.f1926d);
            c0626q.b0(-258436297);
            int intValue = W5.intValue();
            AbstractC1688b L5 = C.L(intValue, 0, c0626q);
            float f8 = 18;
            C1038o c1038o = C1038o.a;
            InterfaceC1041r j5 = t0.j(c1038o, f8);
            if (AbstractC0783w.V(Integer.valueOf(intValue))) {
                c0626q.b0(818591549);
                j4 = ((N) c0626q.j(O.a)).f5427q;
                c0626q.p(false);
            } else {
                c0626q.b0(818592223);
                c0626q.p(false);
                j4 = s.f13481h;
            }
            A0.a(L5, str2, j5, j4, c0626q, 392 | (i7 & 112), 0);
            AbstractC1787b.h(c0626q, t0.n(c1038o, f7));
            c0626q.p(false);
            P a7 = P.a(((t3) c0626q.j(u3.a)).f6128i, 0L, s4.j.z(14), W0.k.f8837k, null, null, 0L, null, 0L, null, 16777209);
            e1 e1Var = O.a;
            f3.b(str2, null, ((N) c0626q.j(e1Var)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, a7, c0626q, (i7 >> 3) & 14, 0, 131066);
            c0626q2 = c0626q;
            if (1.0f <= 0.0d) {
                AbstractC1829a.a("invalid weight; must be greater than zero");
            }
            AbstractC1787b.h(c0626q2, new Z(1.0f, true));
            if (z6) {
                c0626q2.b0(-257745803);
                z8 = true;
                M1.a(t0.j(c1038o, 16), ((N) c0626q2.j(e1Var)).a, 2, 0L, 0, S.l.f7374V, c0626q, 390, 56);
                c0626q2 = c0626q;
                c0626q2.p(false);
            } else {
                z8 = true;
                if (z7) {
                    c0626q2.b0(-257513706);
                    A0.a(C.L(z5 ? R.drawable.outline_keyboard_arrow_down_24 : R.drawable.keyboard_arrow_right, 0, c0626q2), null, t0.j(c1038o, f8), ((N) c0626q2.j(e1Var)).f5429s, c0626q2, 440, 0);
                } else {
                    c0626q2.b0(-270793052);
                }
                c0626q2.p(false);
            }
            c0626q2.p(z8);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(str, str2, z5, z6, z7, j3, interfaceC1193a, cVar, i6) { // from class: Q2.i

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f6414c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f6415e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f6416f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f6417g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f6418h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ long f6419i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1193a f6420j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ l4.c f6421k;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = r.J(12582913);
                    a.d(this.f6414c, this.f6415e, this.f6416f, this.f6417g, this.f6418h, this.f6419i, this.f6420j, this.f6421k, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void e(Context context, Uri uri, File file) {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            throw new Exception("无法读取下载文件");
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                AbstractC1117a.j(openInputStream, fileOutputStream);
                fileOutputStream.close();
                openInputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1118b.h(openInputStream, th);
                throw th2;
            }
        }
    }

    public static final Set f(PackageInfo packageInfo) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Set set = null;
        int i6 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                Signature[] apkContentsSigners = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                if (apkContentsSigners != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = apkContentsSigners.length;
                    while (i6 < length) {
                        byte[] byteArray = apkContentsSigners[i6].toByteArray();
                        AbstractC1276k.e(byteArray, "toByteArray(...)");
                        arrayList.add(k(byteArray));
                        i6++;
                    }
                    set = Y3.m.N0(arrayList);
                }
                if (set != null) {
                    return set;
                }
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                ArrayList arrayList2 = new ArrayList();
                int length2 = signatureArr.length;
                while (i6 < length2) {
                    byte[] byteArray2 = signatureArr[i6].toByteArray();
                    AbstractC1276k.e(byteArray2, "toByteArray(...)");
                    arrayList2.add(k(byteArray2));
                    i6++;
                }
                set = Y3.m.N0(arrayList2);
            }
            if (set != null) {
                return set;
            }
        }
        return x.f9814c;
    }

    public static final String g(long j3) {
        if (j3 < 1024) {
            return j3 + "B";
        }
        if (j3 >= 1048576) {
            return String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j3 / 1048576.0d)}, 1)).concat("MB");
        }
        return (j3 / PegdownExtensions.ANCHORLINKS) + "KB";
    }

    public static final void h(Context context, Uri uri, long j3) {
        long length;
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        AbstractC1276k.e(packageInstaller, "getPackageInstaller(...)");
        PackageInstaller.SessionParams sessionParams = new PackageInstaller.SessionParams(1);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            sessionParams.setRequireUserAction(1);
        }
        int createSession = packageInstaller.createSession(sessionParams);
        PackageInstaller.Session openSession = packageInstaller.openSession(createSession);
        AbstractC1276k.e(openSession, "openSession(...)");
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    try {
                        length = openAssetFileDescriptor.getLength();
                        openAssetFileDescriptor.close();
                    } finally {
                    }
                } else {
                    length = -1;
                }
                long j4 = length;
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream == null) {
                    throw new Exception("无法读取下载文件");
                }
                try {
                    OutputStream openWrite = openSession.openWrite("app_update", 0L, j4);
                    try {
                        AbstractC1276k.c(openWrite);
                        AbstractC1117a.j(openInputStream, openWrite);
                        openSession.fsync(openWrite);
                        openWrite.close();
                        openInputStream.close();
                        Intent intent = new Intent(context, (Class<?>) UpdateInstallResultReceiver.class);
                        intent.putExtra("extra_download_id", j3);
                        openSession.commit(PendingIntent.getBroadcast(context, createSession, intent, i6 >= 31 ? 167772160 : PegdownExtensions.SUPERSCRIPT).getIntentSender());
                        openSession.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e6) {
                openSession.abandon();
                throw e6;
            }
        } catch (Throwable th) {
            openSession.close();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r2 != 7) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(java.io.File r5) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L36
            r1.<init>(r5)     // Catch: java.lang.Exception -> L36
            r5 = 4
            byte[] r2 = new byte[r5]     // Catch: java.lang.Throwable -> L29
            int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L29
            if (r3 != r5) goto L2b
            r5 = r2[r0]     // Catch: java.lang.Throwable -> L29
            r3 = 80
            if (r5 != r3) goto L2b
            r5 = 1
            r3 = r2[r5]     // Catch: java.lang.Throwable -> L29
            r4 = 75
            if (r3 != r4) goto L2b
            r3 = 2
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L29
            r3 = 3
            if (r2 == r3) goto L2c
            r3 = 5
            if (r2 == r3) goto L2c
            r3 = 7
            if (r2 != r3) goto L2b
            goto L2c
        L29:
            r5 = move-exception
            goto L30
        L2b:
            r5 = r0
        L2c:
            r1.close()     // Catch: java.lang.Exception -> L36
            return r5
        L30:
            throw r5     // Catch: java.lang.Throwable -> L31
        L31:
            r2 = move-exception
            i4.AbstractC1118b.h(r1, r5)     // Catch: java.lang.Exception -> L36
            throw r2     // Catch: java.lang.Exception -> L36
        L36:
            androidx.lifecycle.N r5 = i5.a.a
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r5.getClass()
            androidx.lifecycle.N.p(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.a.i(java.io.File):boolean");
    }

    public static final int j(DownloadManager downloadManager, long j3) {
        Cursor query = downloadManager.query(new DownloadManager.Query().setFilterById(j3));
        try {
            if (!query.moveToFirst()) {
                throw new Exception("无法查询下载记录");
            }
            int i6 = query.getInt(query.getColumnIndexOrThrow("status"));
            if (i6 != 8) {
                query.getInt(query.getColumnIndexOrThrow("reason"));
                i5.a.a.getClass();
                androidx.lifecycle.N.y(new Object[0]);
            }
            query.close();
            return i6;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1118b.h(query, th);
                throw th2;
            }
        }
    }

    public static final String k(byte[] bArr) {
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b5 : digest) {
            sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b5)}, 1)));
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public static final void l(Context context, File file) {
        PackageManager packageManager = context.getPackageManager();
        int i6 = Build.VERSION.SDK_INT;
        int i7 = i6 >= 28 ? PegdownExtensions.SUPERSCRIPT : 64;
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), i7);
        if (packageArchiveInfo == null) {
            throw new Exception("无法解析APK包信息");
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        if (applicationInfo != null) {
            applicationInfo.sourceDir = file.getAbsolutePath();
            applicationInfo.publicSourceDir = file.getAbsolutePath();
        }
        PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), i7);
        if (!AbstractC1276k.b(packageArchiveInfo.packageName, context.getPackageName())) {
            throw new Exception("安装包包名不匹配");
        }
        long longVersionCode = i6 >= 28 ? packageArchiveInfo.getLongVersionCode() : packageArchiveInfo.versionCode;
        AbstractC1276k.c(packageInfo);
        if (longVersionCode <= (i6 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode)) {
            throw new Exception("安装包版本过旧，可能是降级");
        }
        Set f6 = f(packageArchiveInfo);
        Set f7 = f(packageInfo);
        if (!f6.isEmpty() && !f7.isEmpty() && !f6.equals(f7)) {
            throw new Exception("安装包签名不匹配");
        }
    }
}
