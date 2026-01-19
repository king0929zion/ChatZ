package f0;

import B0.H;
import H0.C0158m;
import N1.C0290l;
import android.R;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import d5.C0948h;
import e1.InterfaceC0961c;
import i1.AbstractC1087g;
import i1.InterfaceC1078B;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C1150D;
import l.AbstractC1180a;
import l2.C1186a;
import l2.C1187b;
import l2.C1190e;
import l4.InterfaceC1193a;
import m.AbstractC1215W;
import m.AbstractC1220b;
import m.C1213U;
import m.C1214V;
import m.c0;
import m4.AbstractC1276k;
import n.AbstractC1343r;
import n.C1294C;
import n.G0;
import n.I0;
import n.InterfaceC1292A;
import n.InterfaceC1293B;
import o0.AbstractC1380B;
import p.O0;
import q.AbstractC1490b;
import q2.C1501a;
import q2.C1502b;
import q2.InterfaceC1507g;
import t2.C1717a;
import t2.C1723g;
import u1.C1754d;
import u1.C1755e;
import w2.C1836f;
import w2.C1840j;
import w2.InterfaceC1837g;
import x2.C1869e;
import x2.C1871g;
import y.a0;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0987j implements InterfaceC1293B, I0, InterfaceC1078B, InterfaceC1507g, InterfaceC1837g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11689c;

    /* renamed from: e, reason: collision with root package name */
    public Object f11690e;

    public /* synthetic */ C0987j(int i6, boolean z5) {
        this.f11689c = i6;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList A(f0.C0987j r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0987j.A(f0.j, java.lang.String):java.util.ArrayList");
    }

    public static a0 E(C0987j c0987j, int i6) {
        x.s sVar = (x.s) c0987j.f11690e;
        AbstractC0983f e6 = AbstractC0997t.e();
        l4.c e7 = e6 != null ? e6.e() : null;
        AbstractC0983f h3 = AbstractC0997t.h(e6);
        try {
            x.l lVar = (x.l) sVar.f15549f.getValue();
            AbstractC0997t.k(e6, h3, e7);
            return sVar.f15559p.a(i6, lVar.f15500j, sVar.f15547d, new O0(i6, lVar));
        } catch (Throwable th) {
            AbstractC0997t.k(e6, h3, e7);
            throw th;
        }
    }

    public boolean B(int i6, int i7, Bundle bundle) {
        return false;
    }

    public void C(float f6, long j3) {
        o0.q g3 = ((C0158m) this.f11690e).g();
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        g3.n(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
        g3.d(f6);
        g3.n(-Float.intBitsToFloat(i6), -Float.intBitsToFloat(i7));
    }

    public void D(float f6, float f7, long j3) {
        o0.q g3 = ((C0158m) this.f11690e).g();
        int i6 = (int) (j3 >> 32);
        int i7 = (int) (j3 & 4294967295L);
        g3.n(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
        g3.c(f6, f7);
        g3.n(-Float.intBitsToFloat(i6), -Float.intBitsToFloat(i7));
    }

    public void F() {
        View view;
        View view2 = (View) this.f11690e;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new I.h(view, 11));
    }

    public void G(float f6, float f7) {
        ((C0158m) this.f11690e).g().n(f6, f7);
    }

    @Override // n.I0, n.F0
    public boolean a() {
        ((H) this.f11690e).getClass();
        return false;
    }

    @Override // n.F0
    public long b(AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H) this.f11690e).b(abstractC1343r, abstractC1343r2, abstractC1343r3);
    }

    @Override // q2.InterfaceC1507g
    public C1502b c(C1501a c1501a) {
        return null;
    }

    @Override // n.InterfaceC1293B
    public float d() {
        return S.l.f7374V;
    }

    @Override // n.InterfaceC1293B
    public float e(float f6, long j3) {
        long j4 = j3 / 1000000;
        C1213U a = ((C1214V) this.f11690e).a(f6);
        long j5 = a.f12764c;
        return (((Math.signum(a.a) * AbstractC1220b.a(j5 > 0 ? ((float) j4) / ((float) j5) : 1.0f).f12769b) * a.f12763b) / ((float) j5)) * 1000.0f;
    }

    @Override // n.InterfaceC1293B
    public float f(float f6, float f7, long j3) {
        long j4 = j3 / 1000000;
        C1213U a = ((C1214V) this.f11690e).a(f7);
        long j5 = a.f12764c;
        return (Math.signum(a.a) * a.f12763b * AbstractC1220b.a(j5 > 0 ? ((float) j4) / ((float) j5) : 1.0f).a) + f6;
    }

    @Override // i1.InterfaceC1078B
    public long g(e1.k kVar, long j3, e1.m mVar, long j4) {
        long j5 = ((e1.j) ((InterfaceC1193a) this.f11690e).b()).a;
        return (AbstractC1490b.a(kVar.a + ((int) (j5 >> 32)), (int) (j4 >> 32), (int) (j3 >> 32), mVar == e1.m.f11576c) << 32) | (AbstractC1490b.a(kVar.f11573b + ((int) (j5 & 4294967295L)), (int) (j4 & 4294967295L), (int) (j3 & 4294967295L), true) & 4294967295L);
    }

    @Override // n.F0
    public AbstractC1343r h(AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H) this.f11690e).h(abstractC1343r, abstractC1343r2, abstractC1343r3);
    }

    @Override // n.F0
    public AbstractC1343r i(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H) this.f11690e).i(j3, abstractC1343r, abstractC1343r2, abstractC1343r3);
    }

    @Override // q2.InterfaceC1507g
    public void j(C1501a c1501a, Bitmap bitmap, Map map) {
        ((C0.c) this.f11690e).j(c1501a, bitmap, map, AbstractC1087g.j(bitmap));
    }

    @Override // w2.InterfaceC1837g
    public boolean k() {
        boolean z5;
        C1836f c1836f = C1836f.a;
        C1840j c1840j = (C1840j) this.f11690e;
        synchronized (c1836f) {
            try {
                int i6 = C1836f.f15403c;
                C1836f.f15403c = i6 + 1;
                if (i6 >= 30 || SystemClock.uptimeMillis() > C1836f.f15404d + 30000) {
                    C1836f.f15403c = 0;
                    C1836f.f15404d = SystemClock.uptimeMillis();
                    String[] list = C1836f.f15402b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    int length = list.length;
                    boolean z6 = length < 800;
                    C1836f.f15405e = z6;
                    if (!z6 && c1840j != null) {
                        C1840j.a("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
                z5 = C1836f.f15405e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    @Override // w2.InterfaceC1837g
    public boolean l(C1723g c1723g) {
        io.ktor.utils.io.u uVar = c1723g.a;
        boolean z5 = uVar instanceof C1717a;
        int i6 = TableCell.NOT_TRACKED;
        if ((z5 ? ((C1717a) uVar).f14900b : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        io.ktor.utils.io.u uVar2 = c1723g.f14910b;
        if (uVar2 instanceof C1717a) {
            i6 = ((C1717a) uVar2).f14900b;
        }
        return i6 > 100;
    }

    @Override // n.InterfaceC1293B
    public long m(float f6) {
        return ((long) (Math.exp(((C1214V) this.f11690e).b(f6) / (AbstractC1215W.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // n.InterfaceC1293B
    public float n(float f6, float f7) {
        double b5 = ((C1214V) this.f11690e).b(f7);
        double d6 = AbstractC1215W.a;
        return (Math.signum(f7) * ((float) (Math.exp((d6 / (d6 - 1.0d)) * b5) * r0.a * r0.f12765b))) + f6;
    }

    @Override // q2.InterfaceC1507g
    public void o(int i6) {
    }

    @Override // n.F0
    public AbstractC1343r q(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H) this.f11690e).q(j3, abstractC1343r, abstractC1343r2, abstractC1343r3);
    }

    public void s(int i6, C1754d c1754d, String str, Bundle bundle) {
    }

    public C0948h t() {
        C1187b f6;
        C0290l c0290l = (C0290l) this.f11690e;
        C1190e c1190e = (C1190e) c0290l.f3756c;
        synchronized (c1190e) {
            c0290l.a(true);
            f6 = c1190e.f(((C1186a) c0290l.f3755b).a);
        }
        if (f6 != null) {
            return new C0948h(f6);
        }
        return null;
    }

    public C1754d u(int i6) {
        return null;
    }

    public C1754d v(int i6) {
        return null;
    }

    public InterfaceC1292A w(int i6) {
        switch (this.f11689c) {
            case 7:
                return ((C1294C[]) this.f11690e)[i6];
            case 8:
                return (C1294C) this.f11690e;
            default:
                return (InterfaceC1292A) this.f11690e;
        }
    }

    public void x() {
        View view = (View) this.f11690e;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void y(float f6, float f7, float f8, float f9) {
        C0158m c0158m = (C0158m) this.f11690e;
        o0.q g3 = c0158m.g();
        float intBitsToFloat = Float.intBitsToFloat((int) (c0158m.j() >> 32)) - (f8 + f6);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0158m.j() & 4294967295L)) - (f9 + f7)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= S.l.f7374V && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= S.l.f7374V)) {
            AbstractC1380B.a("Width and height must be greater than or equal to zero");
        }
        c0158m.s(floatToRawIntBits);
        g3.n(f6, f7);
    }

    public void z(View view, int i6, boolean z5) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f11690e).notifyViewVisibilityChanged(view, i6, z5);
        }
    }

    public /* synthetic */ C0987j(Object obj, int i6) {
        this.f11689c = i6;
        this.f11690e = obj;
    }

    public C0987j(InterfaceC0961c interfaceC0961c) {
        this.f11689c = 5;
        this.f11690e = new C1214V(c0.a, interfaceC0961c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r7 == r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[LOOP:1: B:14:0x0046->B:15:0x0048, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0987j(int[] r22, float[] r23, float[][] r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 6
            r0.f11689c = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            n.s[][] r4 = new n.C1344s[r2]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L13:
            if (r6 >= r2) goto L6a
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L29
            if (r9 == r3) goto L32
            if (r9 == r11) goto L30
            if (r9 == r10) goto L2b
            r10 = 4
            if (r9 == r10) goto L29
            r10 = 5
            if (r9 == r10) goto L29
            r13 = r8
            goto L34
        L29:
            r13 = r10
            goto L34
        L2b:
            if (r7 != r3) goto L32
            goto L30
        L2e:
            r13 = r7
            goto L34
        L30:
            r7 = r11
            goto L2e
        L32:
            r7 = r3
            goto L2e
        L34:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            n.s[] r11 = new n.C1344s[r3]
            r12 = r5
        L46:
            if (r12 >= r3) goto L64
            int r16 = r12 * 2
            r17 = r12
            n.s r12 = new n.s
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L46
        L64:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L13
        L6a:
            r0.f11690e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0987j.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t1.h, f0.j, java.lang.Object] */
    public C0987j(View view) {
        this.f11689c = 21;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? c0987j = new C0987j(view, 20);
            c0987j.f14872f = view;
            this.f11690e = c0987j;
            return;
        }
        this.f11690e = new C0987j(view, 20);
    }

    public C0987j(int i6) {
        this.f11689c = i6;
        switch (i6) {
            case 23:
                this.f11690e = new C1755e(this);
                return;
            default:
                this.f11690e = new CopyOnWriteArrayList();
                new HashMap();
                return;
        }
    }

    public C0987j(long[] jArr) {
        C1150D c1150d;
        this.f11689c = 0;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            c1150d = new C1150D(copyOf.length);
            int i6 = c1150d.f12446b;
            if (i6 >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i6;
                    long[] jArr2 = c1150d.a;
                    if (jArr2.length < length) {
                        long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        AbstractC1276k.e(copyOf2, "copyOf(...)");
                        c1150d.a = copyOf2;
                    }
                    long[] jArr3 = c1150d.a;
                    int i7 = c1150d.f12446b;
                    if (i6 != i7) {
                        Y3.k.i0(jArr3, jArr3, copyOf.length + i6, i6, i7);
                    }
                    Y3.k.i0(copyOf, jArr3, i6, 0, copyOf.length);
                    c1150d.f12446b += copyOf.length;
                }
            } else {
                AbstractC1180a.d(FlexmarkHtmlConverter.DEFAULT_NODE);
                throw null;
            }
        } else {
            c1150d = new C1150D(16);
        }
        this.f11690e = c1150d;
    }

    public C0987j(C1871g c1871g, C1869e c1869e) {
        this.f11689c = 26;
        this.f11690e = c1871g;
    }

    public C0987j(float f6, float f7, AbstractC1343r abstractC1343r) {
        C0987j c0987j;
        this.f11689c = 10;
        int[] iArr = G0.a;
        if (abstractC1343r != null) {
            c0987j = new C0987j(abstractC1343r, f6, f7);
        } else {
            c0987j = new C0987j(f6, f7);
        }
        this.f11690e = new H(c0987j);
    }

    public C0987j(AbstractC1343r abstractC1343r, float f6, float f7) {
        this.f11689c = 7;
        int b5 = abstractC1343r.b();
        C1294C[] c1294cArr = new C1294C[b5];
        for (int i6 = 0; i6 < b5; i6++) {
            c1294cArr[i6] = new C1294C(f6, f7, abstractC1343r.a(i6));
        }
        this.f11690e = c1294cArr;
    }

    public C0987j(float f6, float f7) {
        this.f11689c = 8;
        this.f11690e = new C1294C(f6, f7, 0.01f);
    }
}
