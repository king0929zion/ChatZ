package W4;

import Q4.m;
import Q4.n;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import d5.InterfaceC0951k;
import m4.AbstractC1276k;
import n0.C1353b;
import r.X0;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class a {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9023b;

    public a(long j3, X0 x02) {
        this.f9023b = x02;
        this.a = j3;
    }

    public long a(long j3, long j4, float f6) {
        long f7 = C1353b.f(this.a, C1353b.e(j3, j4));
        this.a = f7;
        if ((((X0) this.f9023b) == null ? C1353b.d(f7) : Math.abs(b(f7))) < f6) {
            return 9205357640488583168L;
        }
        if (((X0) this.f9023b) == null) {
            long j5 = this.a;
            return C1353b.e(this.a, C1353b.g(f6, C1353b.b(C1353b.d(j5), j5)));
        }
        float b5 = b(this.a) - (Math.signum(b(this.a)) * f6);
        long j6 = this.a;
        X0 x02 = (X0) this.f9023b;
        X0 x03 = X0.f14184e;
        float intBitsToFloat = Float.intBitsToFloat((int) (x02 == x03 ? j6 & 4294967295L : j6 >> 32));
        if (((X0) this.f9023b) != x03) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(b5) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(b5) << 32);
    }

    public float b(long j3) {
        return Float.intBitsToFloat((int) (((X0) this.f9023b) == X0.f14184e ? j3 >> 32 : j3 & 4294967295L));
    }

    public n c() {
        m mVar = new m(0);
        while (true) {
            String A5 = ((InterfaceC0951k) this.f9023b).A(this.a);
            this.a -= A5.length();
            if (A5.length() == 0) {
                return mVar.d();
            }
            int N5 = AbstractC1776n.N(A5, ':', 1, 4);
            if (N5 != -1) {
                String substring = A5.substring(0, N5);
                AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = A5.substring(N5 + 1);
                AbstractC1276k.e(substring2, "this as java.lang.String).substring(startIndex)");
                mVar.a(substring, substring2);
            } else if (A5.charAt(0) == ':') {
                String substring3 = A5.substring(1);
                AbstractC1276k.e(substring3, "this as java.lang.String).substring(startIndex)");
                mVar.a(FlexmarkHtmlConverter.DEFAULT_NODE, substring3);
            } else {
                mVar.a(FlexmarkHtmlConverter.DEFAULT_NODE, A5);
            }
        }
    }

    public /* synthetic */ a(X0 x02, int i6) {
        this(0L, (i6 & 1) != 0 ? null : x02);
    }
}
