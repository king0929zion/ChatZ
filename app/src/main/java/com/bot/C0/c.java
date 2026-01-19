package C0;

import N1.r;
import Y.n;
import Y3.j;
import Y3.m;
import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m4.AbstractC1276k;
import q2.C1501a;
import q2.C1506f;

/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f648b;

    /* renamed from: c, reason: collision with root package name */
    public Object f649c;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new I0.C0188i0(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r1 = r0.a;
        r0 = r0.f2304b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025c, code lost:
    
        return new C0.c(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.a, r0.f2304b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x022d, code lost:
    
        if (r25 <= S.l.f7374V) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022f, code lost:
    
        r1 = r0.a;
        r0 = r0.f2304b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new I0.C0188i0(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new I0.C0188i0(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C0.c d(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.c.d(android.content.res.Resources, int, android.content.res.Resources$Theme):C0.c");
    }

    public static void e(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i6 = 0;
        boolean z5 = false;
        while (i6 <= length) {
            boolean z6 = AbstractC1276k.g(str.charAt(!z5 ? i6 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                } else {
                    length--;
                }
            } else if (z6) {
                i6++;
            } else {
                z5 = true;
            }
        }
        if (str.subSequence(i6, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e6) {
            Log.w("SupportSQLite", "delete failed: ", e6);
        }
    }

    public void a(long j3) {
        if (c(j3)) {
            return;
        }
        int i6 = this.f648b;
        long[] jArr = (long[]) this.f649c;
        if (i6 >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i6 + 1, jArr.length * 2));
            AbstractC1276k.e(jArr, "copyOf(...)");
            this.f649c = jArr;
        }
        jArr[i6] = j3;
        if (i6 >= this.f648b) {
            this.f648b = i6 + 1;
        }
    }

    public void b() {
        WeakReference weakReference;
        this.f648b = 0;
        Iterator it = ((LinkedHashMap) this.f649c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C1506f c1506f = (C1506f) m.q0(arrayList);
                if (((c1506f == null || (weakReference = c1506f.f13957b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    int i8 = i7 - i6;
                    if (((C1506f) arrayList.get(i8)).f13957b.get() == null) {
                        arrayList.remove(i8);
                        i6++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public boolean c(long j3) {
        int i6 = this.f648b;
        for (int i7 = 0; i7 < i6; i7++) {
            if (((long[]) this.f649c)[i7] == j3) {
                return true;
            }
        }
        return false;
    }

    public void f(int i6, int i7) {
        int i8 = i7 + i6;
        char[] cArr = (char[]) this.f649c;
        if (cArr.length <= i8) {
            int i9 = i6 * 2;
            if (i8 < i9) {
                i8 = i9;
            }
            char[] copyOf = Arrays.copyOf(cArr, i8);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f649c = copyOf;
        }
    }

    public void g(Z1.b bVar, int i6, int i7) {
        ((r) this.f649c).e(i6, i7, new Q1.a(bVar));
    }

    public void h() {
        O4.c cVar = O4.c.f4331f;
        char[] cArr = (char[]) this.f649c;
        cVar.getClass();
        AbstractC1276k.f(cArr, "array");
        synchronized (cVar) {
            int i6 = cVar.f4332c;
            if (cArr.length + i6 < O4.b.a) {
                cVar.f4332c = i6 + cArr.length;
                ((j) cVar.f4333e).addLast(cArr);
            }
        }
    }

    public void i(long j3) {
        int i6 = this.f648b;
        int i7 = 0;
        while (i7 < i6) {
            if (j3 == ((long[]) this.f649c)[i7]) {
                int i8 = this.f648b - 1;
                while (i7 < i8) {
                    long[] jArr = (long[]) this.f649c;
                    int i9 = i7 + 1;
                    jArr[i7] = jArr[i9];
                    i7 = i9;
                }
                this.f648b--;
                return;
            }
            i7++;
        }
    }

    public synchronized void j(C1501a c1501a, Bitmap bitmap, Map map, int i6) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f649c;
            Object obj = linkedHashMap.get(c1501a);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c1501a, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            C1506f c1506f = new C1506f(identityHashCode, new WeakReference(bitmap), map, i6);
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    arrayList.add(c1506f);
                    break;
                }
                C1506f c1506f2 = (C1506f) arrayList.get(i7);
                if (i6 < c1506f2.f13959d) {
                    i7++;
                } else if (c1506f2.a == identityHashCode && c1506f2.f13957b.get() == bitmap) {
                    arrayList.set(i7, c1506f);
                } else {
                    arrayList.add(i7, c1506f);
                }
            }
            int i8 = this.f648b;
            this.f648b = i8 + 1;
            if (i8 >= 10) {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void k(String str) {
        AbstractC1276k.f(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(this.f648b, length);
        str.getChars(0, str.length(), (char[]) this.f649c, this.f648b);
        this.f648b += length;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return new String((char[]) this.f649c, 0, this.f648b);
            default:
                return super.toString();
        }
    }

    public c(int i6, byte b5) {
        this.a = i6;
        switch (i6) {
            case 6:
                this.f648b = 1;
                this.f649c = Collections.singletonList(null);
                return;
            default:
                this.f649c = new LinkedHashMap();
                return;
        }
    }

    public c(Shader shader, ColorStateList colorStateList, int i6) {
        this.a = 4;
        this.f649c = shader;
        this.f648b = i6;
    }

    public c(n nVar, int i6) {
        this.a = 3;
        this.f649c = nVar;
        this.f648b = i6;
    }

    public c(r rVar, int i6) {
        this.a = 1;
        this.f649c = rVar;
        this.a = 1;
        this.f648b = i6;
    }

    public c(ArrayList arrayList) {
        this.a = 6;
        this.f648b = 0;
        this.f649c = arrayList;
    }
}
