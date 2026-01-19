package R4;

import B3.e;
import K4.h;
import Q4.n;
import Q4.p;
import Q4.y;
import Q4.z;
import X4.C0711b;
import Y3.C;
import Y3.m;
import Y4.l;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.html.Attribute;
import d5.C0952l;
import d5.I;
import d5.InterfaceC0951k;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import u4.C1774l;

/* loaded from: classes.dex */
public abstract class b {
    public static final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f7079b = C.K(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final z f7080c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeZone f7081d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1774l f7082e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f7083f;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [d5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [d5.i, java.lang.Object] */
    static {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.b.<clinit>():void");
    }

    public static final boolean a(p pVar, p pVar2) {
        AbstractC1276k.f(pVar, "<this>");
        AbstractC1276k.f(pVar2, "other");
        return AbstractC1276k.b(pVar.f6567d, pVar2.f6567d) && pVar.f6568e == pVar2.f6568e && AbstractC1276k.b(pVar.a, pVar2.a);
    }

    public static final int b(long j3) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j3 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j3);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j3 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        AbstractC1276k.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        AbstractC1276k.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e7) {
            if (!AbstractC1276k.b(e7.getMessage(), "bio == null")) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c6, int i6, int i7) {
        while (i6 < i7) {
            if (str.charAt(i6) == c6) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static final int g(String str, int i6, int i7, String str2) {
        while (i6 < i7) {
            if (AbstractC1776n.H(str2, str.charAt(i6))) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static /* synthetic */ int h(String str, char c6, int i6, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i6 = 0;
        }
        if ((i8 & 4) != 0) {
            i7 = str.length();
        }
        return f(str, c6, i6, i7);
    }

    public static final String i(String str, Object... objArr) {
        AbstractC1276k.f(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1276k.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                h i6 = AbstractC1276k.i(strArr2);
                while (i6.hasNext()) {
                    if (comparator.compare(str, (String) i6.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(y yVar) {
        String a6 = yVar.f6662i.a("Content-Length");
        if (a6 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a6);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... objArr) {
        AbstractC1276k.f(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = Collections.unmodifiableList(l.I(Arrays.copyOf(objArr2, objArr2.length)));
        AbstractC1276k.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (AbstractC1276k.g(charAt, 31) <= 0 || AbstractC1276k.g(charAt, 127) >= 0) {
                return i6;
            }
        }
        return -1;
    }

    public static final int n(int i6, int i7, String str) {
        while (i6 < i7) {
            char charAt = str.charAt(i6);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static final int o(int i6, int i7, String str) {
        int i8 = i7 - 1;
        if (i6 <= i8) {
            while (true) {
                char charAt = str.charAt(i8);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i8 + 1;
                }
                if (i8 == i6) {
                    break;
                }
                i8--;
            }
        }
        return i6;
    }

    public static final String[] p(String[] strArr, String[] strArr2, Comparator comparator) {
        AbstractC1276k.f(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i6]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i6++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int r(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' > c6 || c6 >= 'G') {
            return -1;
        }
        return c6 - '7';
    }

    public static final int s(InterfaceC0951k interfaceC0951k) {
        AbstractC1276k.f(interfaceC0951k, "<this>");
        return (interfaceC0951k.readByte() & 255) | ((interfaceC0951k.readByte() & 255) << 16) | ((interfaceC0951k.readByte() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [d5.i, java.lang.Object] */
    public static final boolean t(I i6, int i7) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1276k.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long c6 = i6.timeout().e() ? i6.timeout().c() - nanoTime : Long.MAX_VALUE;
        i6.timeout().d(Math.min(c6, timeUnit.toNanos(i7)) + nanoTime);
        try {
            ?? obj = new Object();
            while (i6.W(8192L, obj) != -1) {
                obj.skip(obj.f11482e);
            }
            if (c6 == Long.MAX_VALUE) {
                i6.timeout().a();
                return true;
            }
            i6.timeout().d(nanoTime + c6);
            return true;
        } catch (InterruptedIOException unused) {
            if (c6 == Long.MAX_VALUE) {
                i6.timeout().a();
                return false;
            }
            i6.timeout().d(nanoTime + c6);
            return false;
        } catch (Throwable th) {
            if (c6 == Long.MAX_VALUE) {
                i6.timeout().a();
            } else {
                i6.timeout().d(nanoTime + c6);
            }
            throw th;
        }
    }

    public static final n u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0711b c0711b = (C0711b) it.next();
            C0952l c0952l = c0711b.a;
            C0952l c0952l2 = c0711b.f9424b;
            String q3 = c0952l.q();
            String q5 = c0952l2.q();
            arrayList.add(q3);
            arrayList.add(AbstractC1776n.l0(q5).toString());
        }
        return new n((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(p pVar, boolean z5) {
        AbstractC1276k.f(pVar, "<this>");
        int i6 = pVar.f6568e;
        String str = pVar.f6567d;
        if (AbstractC1776n.G(str, ":", false)) {
            str = e.g(']', "[", str);
        }
        if (!z5) {
            String str2 = pVar.a;
            AbstractC1276k.f(str2, "scheme");
            if (i6 == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i6;
    }

    public static final List w(List list) {
        AbstractC1276k.f(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(m.K0(list));
        AbstractC1276k.e(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int x(int i6, String str) {
        if (str == null) {
            return i6;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return TableCell.NOT_TRACKED;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i6;
        }
    }

    public static final String y(int i6, int i7, String str) {
        int n3 = n(i6, i7, str);
        String substring = str.substring(n3, o(n3, i7, str));
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
