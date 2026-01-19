package M;

import D.C0056a;
import D.C0098v0;
import D.d1;
import F0.InterfaceC0134w;
import I0.X0;
import O.N0;
import S0.C0545g;
import S0.C0554p;
import S0.F;
import S0.J;
import S0.L;
import S0.O;
import X0.C0683a;
import android.graphics.PointF;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import h0.InterfaceC1041r;
import n0.C1353b;
import n0.C1354c;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public abstract class u {
    public static final int a(C0098v0 c0098v0, long j3, X0 x02) {
        long P5;
        int h3;
        d1 d6 = c0098v0.d();
        if (d6 != null) {
            C0554p c0554p = d6.a.f7599b;
            InterfaceC0134w c6 = c0098v0.c();
            if (c6 != null && (h3 = h(c0554p, (P5 = c6.P(j3)), x02)) != -1) {
                return c0554p.g(C1353b.a((c0554p.b(h3) + c0554p.f(h3)) / 2.0f, 1, P5));
            }
        }
        return -1;
    }

    public static final long b(C0098v0 c0098v0, C1354c c1354c, C1354c c1354c2, int i6) {
        long i7 = i(c0098v0, c1354c, i6);
        if (O.c(i7)) {
            return O.f7610b;
        }
        long i8 = i(c0098v0, c1354c2, i6);
        if (O.c(i8)) {
            return O.f7610b;
        }
        int i9 = (int) (i7 >> 32);
        int i10 = (int) (i8 & 4294967295L);
        return F.b(Math.min(i9, i9), Math.max(i10, i10));
    }

    public static final boolean c(L l3, int i6) {
        C0554p c0554p = l3.f7599b;
        int d6 = c0554p.d(i6);
        return i6 == l3.i(d6) || i6 == c0554p.c(d6, false) ? l3.j(i6) != l3.a(i6) : l3.a(i6) != l3.a(i6 - 1);
    }

    public static final ExtractedText d(X0.v vVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = vVar.a.f7630e;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = vVar.f9125b;
        extractedText.selectionStart = O.f(j3);
        extractedText.selectionEnd = O.e(j3);
        extractedText.flags = !AbstractC1776n.H(vVar.a.f7630e, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final long e(PointF pointF) {
        float f6 = pointF.x;
        float f7 = pointF.y;
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    public static final boolean f(C1354c c1354c, float f6, float f7) {
        float f8 = c1354c.a;
        if (f6 > c1354c.f13296c || f8 > f6) {
            return false;
        }
        return f7 <= c1354c.f13297d && c1354c.f13295b <= f7;
    }

    public static int g(HandwritingGesture handwritingGesture, C0056a c0056a) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        c0056a.f(new C0683a(fallbackText, 1));
        return 5;
    }

    public static final int h(C0554p c0554p, long j3, X0 x02) {
        float g3 = x02 != null ? x02.g() : S.l.f7374V;
        int i6 = (int) (4294967295L & j3);
        int e6 = c0554p.e(Float.intBitsToFloat(i6));
        if (Float.intBitsToFloat(i6) < c0554p.f(e6) - g3 || Float.intBitsToFloat(i6) > c0554p.b(e6) + g3) {
            return -1;
        }
        int i7 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i7) < (-g3) || Float.intBitsToFloat(i7) > c0554p.f7650d + g3) {
            return -1;
        }
        return e6;
    }

    public static final long i(C0098v0 c0098v0, C1354c c1354c, int i6) {
        d1 d6 = c0098v0.d();
        C0554p c0554p = d6 != null ? d6.a.f7599b : null;
        InterfaceC0134w c6 = c0098v0.c();
        return (c0554p == null || c6 == null) ? O.f7610b : c0554p.h(c1354c.j(c6.P(0L)), i6, J.f7589b);
    }

    public static final boolean j(int i6) {
        int type = Character.getType(i6);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean k(int i6) {
        return Character.isWhitespace(i6) || i6 == 160;
    }

    public static final boolean l(int i6) {
        int type;
        return (!k(i6) || (type = Character.getType(i6)) == 14 || type == 13 || i6 == 10) ? false : true;
    }

    public static final InterfaceC1041r m(InterfaceC1041r interfaceC1041r, e eVar, C0098v0 c0098v0, N0 n02) {
        return interfaceC1041r.c(new r(eVar, c0098v0, n02));
    }

    public static void n(long j3, C0545g c0545g, boolean z5, C0056a c0056a) {
        if (z5) {
            int i6 = O.f7611c;
            int i7 = (int) (j3 >> 32);
            int i8 = (int) (j3 & 4294967295L);
            int codePointBefore = i7 > 0 ? Character.codePointBefore(c0545g, i7) : 10;
            int codePointAt = i8 < c0545g.f7630e.length() ? Character.codePointAt(c0545g, i8) : 10;
            if (l(codePointBefore) && (k(codePointAt) || j(codePointAt))) {
                do {
                    i7 -= Character.charCount(codePointBefore);
                    if (i7 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(c0545g, i7);
                    }
                } while (l(codePointBefore));
                j3 = F.b(i7, i8);
            } else if (l(codePointAt) && (k(codePointBefore) || j(codePointBefore))) {
                do {
                    i8 += Character.charCount(codePointAt);
                    if (i8 == c0545g.f7630e.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(c0545g, i8);
                    }
                } while (l(codePointAt));
                j3 = F.b(i7, i8);
            }
        }
        int i9 = (int) (4294967295L & j3);
        c0056a.f(new p(new X0.g[]{new X0.u(i9, i9), new X0.e(O.d(j3), 0)}));
    }
}
