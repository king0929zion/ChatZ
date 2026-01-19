package B0;

import android.view.MotionEvent;
import h0.InterfaceC1041r;
import n0.C1353b;

/* renamed from: B0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0047x {
    public static final C0025a a = new C0025a(1000);

    /* renamed from: b, reason: collision with root package name */
    public static final C0025a f479b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0025a f480c;

    /* renamed from: d, reason: collision with root package name */
    public static final StackTraceElement[] f481d;

    static {
        new C0025a(1007);
        f479b = new C0025a(1008);
        f480c = new C0025a(1002);
        f481d = new StackTraceElement[0];
    }

    public static final boolean a(y yVar) {
        return (yVar.b() || yVar.f488h || !yVar.f484d) ? false : true;
    }

    public static final boolean b(y yVar) {
        return !yVar.f488h && yVar.f484d;
    }

    public static final boolean c(y yVar) {
        return (yVar.b() || !yVar.f488h || yVar.f484d) ? false : true;
    }

    public static final boolean d(y yVar) {
        return yVar.f488h && !yVar.f484d;
    }

    public static final boolean e(long j3, long j4) {
        return j3 == j4;
    }

    public static final boolean f(y yVar, long j3, long j4) {
        int i6 = yVar.f489i == 1 ? 1 : 0;
        long j5 = yVar.f483c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float f6 = i6;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32)) * f6;
        float f7 = ((int) (j3 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j4 & 4294967295L)) * f6;
        return (intBitsToFloat > f7) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j3 & 4294967295L)) + intBitsToFloat4);
    }

    public static InterfaceC1041r g(InterfaceC1041r interfaceC1041r, C0025a c0025a) {
        return interfaceC1041r.c(new C0042s(c0025a));
    }

    public static final long h(y yVar, boolean z5) {
        long e6 = C1353b.e(yVar.f483c, yVar.f487g);
        if (z5 || !yVar.b()) {
            return e6;
        }
        return 0L;
    }

    public static final void i(C0040p c0040p, long j3, l4.c cVar, boolean z5) {
        MotionEvent a6 = c0040p.a();
        if (a6 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = a6.getAction();
        if (z5) {
            a6.setAction(3);
        }
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        a6.offsetLocation(-Float.intBitsToFloat(i6), -Float.intBitsToFloat(i7));
        cVar.f(a6);
        a6.offsetLocation(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
        a6.setAction(action);
    }

    public static String j(long j3) {
        return "PointerId(value=" + j3 + ')';
    }
}
