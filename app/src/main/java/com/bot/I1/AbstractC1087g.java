package i1;

import F0.V;
import F0.r0;
import H0.C0148f;
import H0.C0150g;
import H0.C0158m;
import H0.InterfaceC0152h;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.lifecycle.N;
import h0.AbstractC1024a;
import h0.InterfaceC1041r;
import i4.AbstractC1121e;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import m4.AbstractC1276k;
import o0.C1395f;
import r.X0;
import r2.InterfaceC1632e;
import t0.C1687a;
import t2.EnumC1722f;
import u0.C1746g;
import w2.C1840j;
import w2.ComponentCallbacks2C1841k;

/* renamed from: i1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1087g {
    public static C1746g a;

    public static C1687a a(C1395f c1395f, int i6) {
        C1687a c1687a = new C1687a(c1395f, (c1395f.a.getHeight() & 4294967295L) | (c1395f.a.getWidth() << 32));
        c1687a.f14828j = i6;
        return c1687a;
    }

    public static final io.ktor.utils.io.t b(byte[] bArr) {
        AbstractC1276k.f(bArr, "content");
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, bArr.length);
        AbstractC1276k.e(wrap, "wrap(content, offset, length)");
        return new io.ktor.utils.io.t(wrap);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(l4.InterfaceC1193a r16, i1.C1102v r17, b0.C0873f r18, T.C0626q r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC1087g.c(l4.a, i1.v, b0.f, T.q, int, int):void");
    }

    public static final InterfaceC1632e d(Context context, ComponentCallbacks2C1841k componentCallbacks2C1841k, C1840j c1840j) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || AbstractC1121e.g(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            if (c1840j != null) {
                C1840j.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new N(20);
        }
        try {
            return new C0158m(connectivityManager, componentCallbacks2C1841k);
        } catch (Exception e6) {
            if (c1840j != null) {
                C1840j.a("NetworkObserver", 6, null, new RuntimeException("Failed to register network observer.", e6));
            }
            return new N(20);
        }
    }

    public static final void e(InterfaceC1041r interfaceC1041r, l4.e eVar, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(1090521195);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(eVar) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Object P5 = c0626q.P();
            if (P5 == C0616l.a) {
                P5 = C1086f.f11985b;
                c0626q.m0(P5);
            }
            V v5 = (V) P5;
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r);
            InterfaceC0152h.a.getClass();
            C0148f c0148f = C0150g.f1924b;
            int i8 = (((((i7 << 3) & 112) | (((i7 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(c0148f);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, v5, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.C(c0626q, C0150g.f1930h);
            T.r.G(c0626q, c6, C0150g.f1926d);
            eVar.m(c0626q, Integer.valueOf((i8 >> 6) & 14));
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new r0(interfaceC1041r, eVar, i6, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r10 == r4) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(x3.C1883g r8, E3.e r9, d4.c r10) {
        /*
            boolean r0 = r10 instanceof w3.C1844a
            if (r0 == 0) goto L13
            r0 = r10
            w3.a r0 = (w3.C1844a) r0
            int r1 = r0.f15421j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15421j = r1
            goto L18
        L13:
            w3.a r0 = new w3.a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15420i
            int r1 = r0.f15421j
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            X3.a.e(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            E3.e r9 = r0.f15419h
            x3.g r8 = r0.f15418g
            X3.a.e(r10)
            goto L7d
        L3a:
            X3.a.e(r10)
            x4.e0 r10 = r9.f1313e
            r0.f15418g = r8
            r0.f15419h = r9
            r0.f15421j = r3
            x4.x r1 = w3.g.a
            x4.g0 r1 = new x4.g0
            r1.<init>(r10)
            b4.h r10 = r8.f15623j
            b4.h r10 = r10.Y(r1)
            x4.x r5 = w3.g.a
            b4.h r10 = r10.Y(r5)
            b4.h r5 = r0.f11435e
            m4.AbstractC1276k.c(r5)
            x4.w r6 = x4.C1940w.f15731e
            b4.f r5 = r5.r(r6)
            x4.e0 r5 = (x4.InterfaceC1922e0) r5
            if (r5 != 0) goto L68
            goto L7a
        L68:
            w3.j r6 = new w3.j
            r7 = 0
            r6.<init>(r1, r7)
            x4.M r3 = r5.H(r3, r3, r6)
            w3.i r5 = new w3.i
            r5.<init>(r3, r7)
            r1.S(r5)
        L7a:
            if (r10 != r4) goto L7d
            goto L9e
        L7d:
            b4.h r10 = (b4.InterfaceC0910h) r10
            w3.h r1 = new w3.h
            r1.<init>(r10)
            b4.h r10 = r10.Y(r1)
            w3.b r1 = new w3.b
            r3 = 0
            r1.<init>(r8, r9, r3)
            x4.E r8 = x4.AbstractC1888A.f(r8, r10, r1, r2)
            r0.f15418g = r3
            r0.f15419h = r3
            r0.f15421j = r2
            java.lang.Object r8 = r8.A(r0)
            if (r8 != r4) goto L9f
        L9e:
            return r4
        L9f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC1087g.f(x3.g, E3.e, d4.c):java.lang.Object");
    }

    public static void g(StringBuilder sb, Object obj, l4.c cVar) {
        if (cVar != null) {
            sb.append((CharSequence) cVar.f(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final double h(int i6, int i7, int i8, int i9, EnumC1722f enumC1722f) {
        double d6 = i8 / i6;
        double d7 = i9 / i7;
        int ordinal = enumC1722f.ordinal();
        if (ordinal == 0) {
            return Math.max(d6, d7);
        }
        if (ordinal == 1) {
            return Math.min(d6, d7);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [N1.w, y1.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y1.s i(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            y1.c r0 = new y1.c
            r1 = 24
            r0.<init>(r1)
            goto L15
        Le:
            androidx.lifecycle.N r0 = new androidx.lifecycle.N
            r1 = 24
            r0.<init>(r1)
        L15:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            i4.AbstractC1120d.f(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2e
            goto L4b
        L4a:
            r4 = r5
        L4b:
            if (r4 != 0) goto L4f
        L4d:
            r1 = r5
            goto L7e
        L4f:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            android.content.pm.Signature[] r0 = r0.t(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
        L5d:
            if (r3 >= r6) goto L6b
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            int r3 = r3 + 1
            goto L5d
        L6b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            r1.c r1 = new r1.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L4d
        L7e:
            if (r1 != 0) goto L81
            goto L8b
        L81:
            y1.s r5 = new y1.s
            y1.r r0 = new y1.r
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC1087g.i(android.content.Context):y1.s");
    }

    public static final int j(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final int k(int i6, String str) {
        String str2;
        Integer E5;
        try {
            str2 = System.getProperty("io.ktor.utils.io.".concat(str));
        } catch (SecurityException unused) {
            str2 = null;
        }
        return (str2 == null || (E5 = u4.u.E(str2)) == null) ? i6 : E5.intValue();
    }

    public static final int l(z.t tVar) {
        return (int) (tVar.f16155e == X0.f14183c ? tVar.g() & 4294967295L : tVar.g() >> 32);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, b4.c, t4.i] */
    public static t4.i m(l4.e eVar) {
        Object obj = new Object();
        obj.f14951f = Y4.d.x(obj, obj, eVar);
        return obj;
    }

    public static MappedByteBuffer n(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final String o(float f6) {
        if (Float.isNaN(f6)) {
            return "NaN";
        }
        if (Float.isInfinite(f6)) {
            return f6 < S.l.f7374V ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f7 = f6 * pow;
        int i6 = (int) f7;
        if (f7 - i6 >= 0.5f) {
            i6++;
        }
        float f8 = i6 / pow;
        return max > 0 ? String.valueOf(f8) : String.valueOf((int) f8);
    }
}
