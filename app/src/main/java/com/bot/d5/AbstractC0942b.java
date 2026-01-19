package d5;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Logger;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0942b {
    static {
        new C0948h();
    }

    public static final boolean a(int i6, int i7, int i8, byte[] bArr, byte[] bArr2) {
        AbstractC1276k.f(bArr, FlexmarkHtmlConverter.A_NODE);
        AbstractC1276k.f(bArr2, FlexmarkHtmlConverter.B_NODE);
        for (int i9 = 0; i9 < i8; i9++) {
            if (bArr[i9 + i6] != bArr2[i9 + i7]) {
                return false;
            }
        }
        return true;
    }

    public static final A b(G g3) {
        AbstractC1276k.f(g3, "<this>");
        return new A(g3);
    }

    public static final C c(I i6) {
        AbstractC1276k.f(i6, "<this>");
        return new C(i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [d5.i, d5.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [d5.I, d5.i, java.lang.Object] */
    public static void d(long j3, C0949i c0949i, int i6, ArrayList arrayList, int i7, int i8, ArrayList arrayList2) {
        int i9;
        int i10;
        ArrayList arrayList3;
        long j4;
        int i11;
        int i12 = i6;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i7 >= i8) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i13 = i7; i13 < i8; i13++) {
            if (((C0952l) arrayList4.get(i13)).d() < i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0952l c0952l = (C0952l) arrayList.get(i7);
        C0952l c0952l2 = (C0952l) arrayList4.get(i8 - 1);
        if (i12 == c0952l.d()) {
            int intValue = ((Number) arrayList5.get(i7)).intValue();
            int i14 = i7 + 1;
            C0952l c0952l3 = (C0952l) arrayList4.get(i14);
            i9 = i14;
            i10 = intValue;
            c0952l = c0952l3;
        } else {
            i9 = i7;
            i10 = -1;
        }
        if (c0952l.i(i12) == c0952l2.i(i12)) {
            int min = Math.min(c0952l.d(), c0952l2.d());
            int i15 = 0;
            for (int i16 = i12; i16 < min && c0952l.i(i16) == c0952l2.i(i16); i16++) {
                i15++;
            }
            long j5 = 4;
            long j6 = (c0949i.f11482e / j5) + j3 + 2 + i15 + 1;
            c0949i.d0(-i15);
            c0949i.d0(i10);
            int i17 = i12 + i15;
            while (i12 < i17) {
                c0949i.d0(c0952l.i(i12) & 255);
                i12++;
            }
            if (i9 + 1 == i8) {
                if (i17 != ((C0952l) arrayList4.get(i9)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0949i.d0(((Number) arrayList5.get(i9)).intValue());
                return;
            } else {
                ?? obj = new Object();
                c0949i.d0(((int) ((obj.f11482e / j5) + j6)) * (-1));
                d(j6, obj, i17, arrayList4, i9, i8, arrayList5);
                c0949i.Q(obj);
                return;
            }
        }
        int i18 = 1;
        for (int i19 = i9 + 1; i19 < i8; i19++) {
            if (((C0952l) arrayList4.get(i19 - 1)).i(i12) != ((C0952l) arrayList4.get(i19)).i(i12)) {
                i18++;
            }
        }
        long j7 = 4;
        long j8 = (c0949i.f11482e / j7) + j3 + 2 + (i18 * 2);
        c0949i.d0(i18);
        c0949i.d0(i10);
        for (int i20 = i9; i20 < i8; i20++) {
            byte i21 = ((C0952l) arrayList4.get(i20)).i(i12);
            if (i20 == i9 || i21 != ((C0952l) arrayList4.get(i20 - 1)).i(i12)) {
                c0949i.d0(i21 & 255);
            }
        }
        ?? obj2 = new Object();
        int i22 = i9;
        while (i22 < i8) {
            byte i23 = ((C0952l) arrayList4.get(i22)).i(i12);
            int i24 = i22 + 1;
            int i25 = i24;
            while (true) {
                if (i25 >= i8) {
                    i25 = i8;
                    break;
                } else if (i23 != ((C0952l) arrayList4.get(i25)).i(i12)) {
                    break;
                } else {
                    i25++;
                }
            }
            if (i24 == i25 && i12 + 1 == ((C0952l) arrayList4.get(i22)).d()) {
                c0949i.d0(((Number) arrayList5.get(i22)).intValue());
                arrayList3 = arrayList5;
                j4 = j8;
                i11 = i25;
            } else {
                c0949i.d0(((int) ((obj2.f11482e / j7) + j8)) * (-1));
                arrayList3 = arrayList5;
                j4 = j8;
                i11 = i25;
                d(j4, obj2, i12 + 1, arrayList, i22, i11, arrayList3);
                arrayList4 = arrayList;
            }
            j8 = j4;
            i22 = i11;
            arrayList5 = arrayList3;
        }
        c0949i.Q(obj2);
    }

    public static final void e(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
        }
    }

    public static final boolean f(AssertionError assertionError) {
        Logger logger = x.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC1776n.G(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final C0944d g(Socket socket) {
        Logger logger = x.a;
        H h3 = new H(socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC1276k.e(outputStream, "getOutputStream(...)");
        return new C0944d(0, h3, new C0944d(1, outputStream, h3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d5.K, java.lang.Object] */
    public static final C0945e h(InputStream inputStream) {
        Logger logger = x.a;
        AbstractC1276k.f(inputStream, "<this>");
        return new C0945e(inputStream, (K) new Object());
    }

    public static final C0945e i(Socket socket) {
        Logger logger = x.a;
        H h3 = new H(socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC1276k.e(inputStream, "getInputStream(...)");
        return new C0945e(h3, new C0945e(inputStream, h3));
    }

    public static final String j(int i6) {
        if (i6 == 0) {
            return "0";
        }
        char[] cArr = e5.b.a;
        int i7 = 0;
        char[] cArr2 = {cArr[(i6 >> 28) & 15], cArr[(i6 >> 24) & 15], cArr[(i6 >> 20) & 15], cArr[(i6 >> 16) & 15], cArr[(i6 >> 12) & 15], cArr[(i6 >> 8) & 15], cArr[(i6 >> 4) & 15], cArr[i6 & 15]};
        while (i7 < 8 && cArr2[i7] == '0') {
            i7++;
        }
        s4.j.k(i7, 8, cArr2.length);
        return new String(cArr2, i7, 8 - i7);
    }
}
