package j0;

import B0.AbstractC0037m;
import F0.P;
import I.h;
import I.o;
import I0.R0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import P0.m;
import P0.p;
import P0.q;
import P0.s;
import P0.t;
import P0.w;
import S0.C0545g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.lifecycle.InterfaceC0832f;
import androidx.lifecycle.InterfaceC0846u;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC1167n;
import k.AbstractC1168o;
import k.C1147A;
import k.M;
import m4.AbstractC1276k;
import z4.C2057h;

/* loaded from: classes.dex */
public final class d implements InterfaceC0832f, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f12323c;

    /* renamed from: e, reason: collision with root package name */
    public final o f12324e;

    /* renamed from: f, reason: collision with root package name */
    public L0.b f12325f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f12326g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final long f12327h = 100;

    /* renamed from: i, reason: collision with root package name */
    public a f12328i = a.f12315c;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12329j = true;

    /* renamed from: k, reason: collision with root package name */
    public final C2057h f12330k = AbstractC1120d.a(1, 6, null);

    /* renamed from: l, reason: collision with root package name */
    public final Handler f12331l = new Handler(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public C1147A f12332m;

    /* renamed from: n, reason: collision with root package name */
    public long f12333n;

    /* renamed from: o, reason: collision with root package name */
    public final C1147A f12334o;

    /* renamed from: p, reason: collision with root package name */
    public R0 f12335p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12336q;

    /* renamed from: r, reason: collision with root package name */
    public final h f12337r;

    public d(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, o oVar) {
        this.f12323c = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f12324e = oVar;
        C1147A c1147a = AbstractC1168o.a;
        AbstractC1276k.d(c1147a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f12332m = c1147a;
        this.f12334o = new C1147A();
        p a = viewTreeObserverOnGlobalLayoutListenerC0216x.getSemanticsOwner().a();
        AbstractC1276k.d(c1147a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f12335p = new R0(a, c1147a);
        this.f12337r = new h(this, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (x4.AbstractC1888A.m(r7.f12327h, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(d4.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j0.b
            if (r0 == 0) goto L13
            r0 = r8
            j0.b r0 = (j0.b) r0
            int r1 = r0.f12321j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12321j = r1
            goto L18
        L13:
            j0.b r0 = new j0.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12319h
            int r1 = r0.f12321j
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            z4.c r1 = r0.f12318g
            X3.a.e(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            z4.c r1 = r0.f12318g
            X3.a.e(r8)
            goto L52
        L3a:
            X3.a.e(r8)
            z4.h r8 = r7.f12330k
            r8.getClass()
            z4.c r1 = new z4.c
            r1.<init>(r8)
        L47:
            r0.f12318g = r1
            r0.f12321j = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r1.c()
            boolean r8 = r7.g()
            if (r8 == 0) goto L66
            r7.i()
        L66:
            boolean r8 = r7.f12336q
            if (r8 != 0) goto L73
            r7.f12336q = r3
            android.os.Handler r8 = r7.f12331l
            I.h r5 = r7.f12337r
            r8.post(r5)
        L73:
            r0.f12318g = r1
            r0.f12321j = r2
            long r5 = r7.f12327h
            java.lang.Object r8 = x4.AbstractC1888A.m(r5, r0)
            if (r8 != r4) goto L47
        L7f:
            return r4
        L80:
            X3.y r8 = X3.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.d.a(d4.c):java.lang.Object");
    }

    public final void b(AbstractC1167n abstractC1167n) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j3;
        char c6;
        long j4;
        int i6;
        long[] jArr3;
        long[] jArr4;
        long j5;
        long j6;
        AbstractC1167n abstractC1167n2 = abstractC1167n;
        int[] iArr3 = abstractC1167n2.f12558b;
        long[] jArr5 = abstractC1167n2.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr5[i7];
            char c7 = 7;
            long j8 = -9187201950435737472L;
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8;
                int i9 = 8 - ((~(i7 - length)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & 255) < 128) {
                        int i11 = iArr3[(i7 << 3) + i10];
                        c6 = c7;
                        R0 r02 = (R0) this.f12334o.b(i11);
                        q qVar = (q) abstractC1167n2.b(i11);
                        p pVar = qVar != null ? qVar.a : null;
                        if (pVar == null) {
                            throw B3.e.f("no value for specified key");
                        }
                        j4 = j8;
                        int i12 = pVar.f4502g;
                        m mVar = pVar.f4499d;
                        if (r02 == null) {
                            M m3 = mVar.f4492c;
                            Object[] objArr = m3.f12485b;
                            long[] jArr6 = m3.a;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i13 = i8;
                                int i14 = 0;
                                while (true) {
                                    long j9 = jArr6[i14];
                                    j3 = j7;
                                    if ((((~j9) << c6) & j9 & j4) != j4) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j9 & 255) < 128) {
                                                j6 = j9;
                                                w wVar = (w) objArr[(i14 << 3) + i16];
                                                w wVar2 = t.a;
                                                w wVar3 = t.f4508B;
                                                if (AbstractC1276k.b(wVar, wVar3)) {
                                                    List list = (List) s.d(mVar, wVar3);
                                                    l(i12, String.valueOf(list != null ? (C0545g) Y3.m.q0(list) : null));
                                                }
                                            } else {
                                                j6 = j9;
                                            }
                                            j9 = j6 >> i13;
                                        }
                                        if (i15 != i13) {
                                            break;
                                        }
                                    }
                                    if (i14 == length2) {
                                        break;
                                    }
                                    i14++;
                                    j7 = j3;
                                    i13 = 8;
                                }
                            } else {
                                j3 = j7;
                            }
                        } else {
                            iArr2 = iArr3;
                            j3 = j7;
                            M m5 = mVar.f4492c;
                            Object[] objArr2 = m5.f12485b;
                            long[] jArr7 = m5.a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr2 = jArr5;
                                int i17 = 0;
                                while (true) {
                                    long j10 = jArr7[i17];
                                    Object[] objArr4 = objArr3;
                                    i6 = i10;
                                    if ((((~j10) << c6) & j10 & j4) != j4) {
                                        int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            if ((j10 & 255) < 128) {
                                                jArr4 = jArr7;
                                                w wVar4 = (w) objArr4[(i17 << 3) + i19];
                                                w wVar5 = t.a;
                                                j5 = j10;
                                                w wVar6 = t.f4508B;
                                                if (AbstractC1276k.b(wVar4, wVar6)) {
                                                    List list2 = (List) s.d(r02.a, wVar6);
                                                    C0545g c0545g = list2 != null ? (C0545g) Y3.m.q0(list2) : null;
                                                    List list3 = (List) s.d(mVar, wVar6);
                                                    C0545g c0545g2 = list3 != null ? (C0545g) Y3.m.q0(list3) : null;
                                                    if (!AbstractC1276k.b(c0545g, c0545g2)) {
                                                        l(i12, String.valueOf(c0545g2));
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr7;
                                                j5 = j10;
                                            }
                                            j10 = j5 >> 8;
                                            i19++;
                                            jArr7 = jArr4;
                                        }
                                        jArr3 = jArr7;
                                        if (i18 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                    }
                                    if (i17 == length3) {
                                        break;
                                    }
                                    i17++;
                                    i10 = i6;
                                    objArr3 = objArr4;
                                    jArr7 = jArr3;
                                }
                                j7 = j3 >> 8;
                                i10 = i6 + 1;
                                jArr5 = jArr2;
                                c7 = c6;
                                j8 = j4;
                                iArr3 = iArr2;
                                i8 = 8;
                                abstractC1167n2 = abstractC1167n;
                            }
                        }
                        jArr2 = jArr5;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j3 = j7;
                        c6 = c7;
                        j4 = j8;
                    }
                    i6 = i10;
                    j7 = j3 >> 8;
                    i10 = i6 + 1;
                    jArr5 = jArr2;
                    c7 = c6;
                    j8 = j4;
                    iArr3 = iArr2;
                    i8 = 8;
                    abstractC1167n2 = abstractC1167n;
                }
                iArr = iArr3;
                int i20 = i8;
                jArr = jArr5;
                if (i9 != i20) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i7 == length) {
                return;
            }
            i7++;
            abstractC1167n2 = abstractC1167n;
            jArr5 = jArr;
            iArr3 = iArr;
        }
    }

    public final AbstractC1167n e() {
        if (this.f12329j) {
            this.f12329j = false;
            this.f12332m = s.b(this.f12323c.getSemanticsOwner(), c.f12322e);
            this.f12333n = System.currentTimeMillis();
        }
        return this.f12332m;
    }

    @Override // androidx.lifecycle.InterfaceC0832f
    public final void f(InterfaceC0846u interfaceC0846u) {
        n(this.f12323c.getSemanticsOwner().a());
        i();
        this.f12325f = null;
    }

    public final boolean g() {
        return this.f12325f != null;
    }

    public final void i() {
        L0.b bVar = this.f12325f;
        if (bVar == null) {
            return;
        }
        Object obj = bVar.a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f12326g;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = (e) arrayList.get(i6);
            int ordinal = eVar.f12339c.ordinal();
            if (ordinal == 0) {
                A3.c cVar = eVar.f12340d;
                if (cVar != null) {
                    ViewStructure viewStructure = (ViewStructure) cVar.f119e;
                    if (Build.VERSION.SDK_INT >= 29) {
                        L0.a.d(AbstractC0037m.f(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    throw new RuntimeException();
                }
                AutofillId a = bVar.a(eVar.a);
                if (a != null && Build.VERSION.SDK_INT >= 29) {
                    L0.a.e(AbstractC0037m.f(obj), a);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            L0.a.g(AbstractC0037m.f(obj), bVar.f2988b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    @Override // androidx.lifecycle.InterfaceC0832f
    public final void j(InterfaceC0846u interfaceC0846u) {
        this.f12325f = (L0.b) this.f12324e.b();
        m(-1, this.f12323c.getSemanticsOwner().a());
        i();
    }

    public final void k(p pVar, R0 r02) {
        P p5 = new P(3, r02, this);
        pVar.getClass();
        List j3 = p.j(4, pVar);
        int size = j3.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = j3.get(i7);
            if (e().a(((p) obj).f4502g)) {
                p5.m(Integer.valueOf(i6), obj);
                i6++;
            }
        }
        List j4 = p.j(4, pVar);
        int size2 = j4.size();
        for (int i8 = 0; i8 < size2; i8++) {
            p pVar2 = (p) j4.get(i8);
            AbstractC1167n e6 = e();
            int i9 = pVar2.f4502g;
            if (e6.a(i9)) {
                C1147A c1147a = this.f12334o;
                if (c1147a.a(i9)) {
                    Object b5 = c1147a.b(i9);
                    if (b5 == null) {
                        throw B3.e.f("node not present in pruned tree before this change");
                    }
                    k(pVar2, (R0) b5);
                } else {
                    continue;
                }
            }
        }
    }

    public final void l(int i6, String str) {
        L0.b bVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29 && (bVar = this.f12325f) != null) {
            AutofillId a = bVar.a(i6);
            if (a == null) {
                throw B3.e.f("Invalid content capture ID");
            }
            if (i7 >= 29) {
                L0.a.f(AbstractC0037m.f(bVar.a), a, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r19, P0.p r20) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.d.m(int, P0.p):void");
    }

    public final void n(p pVar) {
        if (g()) {
            this.f12326g.add(new e(pVar.f4502g, this.f12333n, f.f12342e, null));
            List j3 = p.j(4, pVar);
            int size = j3.size();
            for (int i6 = 0; i6 < size; i6++) {
                n((p) j3.get(i6));
            }
        }
    }

    public final void o() {
        C1147A c1147a = this.f12334o;
        c1147a.c();
        AbstractC1167n e6 = e();
        int[] iArr = e6.f12558b;
        Object[] objArr = e6.f12559c;
        long[] jArr = e6.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j3 = jArr[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((255 & j3) < 128) {
                            int i9 = (i6 << 3) + i8;
                            c1147a.i(iArr[i9], new R0(((q) objArr[i9]).a, e()));
                        }
                        j3 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f12335p = new R0(this.f12323c.getSemanticsOwner().a(), e());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f12331l.removeCallbacks(this.f12337r);
        this.f12325f = null;
    }
}
