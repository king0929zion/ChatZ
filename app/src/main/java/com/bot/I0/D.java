package I0;

import F0.AbstractC0137z;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0158m;
import H0.InterfaceC0155j;
import S0.C0545g;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b.AbstractC0857a;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import f0.C0987j;
import g1.AbstractC1016a;
import h0.AbstractC1040q;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.List;
import k.AbstractC1164k;
import k.AbstractC1166m;
import k.AbstractC1167n;
import k.AbstractC1168o;
import k.AbstractC1169p;
import k.C1147A;
import k.C1148B;
import k.C1160g;
import k.C1177y;
import k.C1178z;
import l.AbstractC1180a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n0.C1353b;
import n0.C1354c;
import n0.C1355d;
import o0.C1383E;
import o0.C1384F;
import o0.C1385G;
import o0.C1397h;
import t1.AbstractC1699b;
import u1.C1754d;
import z4.C2057h;

/* loaded from: classes.dex */
public final class D extends AbstractC1699b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: R */
    public static final C1178z f2138R;

    /* renamed from: A */
    public final C2057h f2139A;

    /* renamed from: B */
    public boolean f2140B;

    /* renamed from: C */
    public C0220z f2141C;

    /* renamed from: D */
    public C1147A f2142D;

    /* renamed from: E */
    public final C1148B f2143E;

    /* renamed from: F */
    public final C1177y f2144F;

    /* renamed from: G */
    public final C1177y f2145G;

    /* renamed from: H */
    public final String f2146H;

    /* renamed from: I */
    public final String f2147I;

    /* renamed from: J */
    public final C0158m f2148J;

    /* renamed from: K */
    public final C1147A f2149K;

    /* renamed from: L */
    public R0 f2150L;

    /* renamed from: M */
    public boolean f2151M;

    /* renamed from: N */
    public final C1177y f2152N;

    /* renamed from: O */
    public final I.h f2153O;

    /* renamed from: P */
    public final ArrayList f2154P;

    /* renamed from: Q */
    public final C f2155Q;

    /* renamed from: g */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f2156g;

    /* renamed from: h */
    public int f2157h = Integer.MIN_VALUE;

    /* renamed from: i */
    public final C f2158i = new C(this, 0);

    /* renamed from: j */
    public final AccessibilityManager f2159j;

    /* renamed from: k */
    public long f2160k;

    /* renamed from: l */
    public List f2161l;

    /* renamed from: m */
    public final Handler f2162m;

    /* renamed from: n */
    public final C0218y f2163n;

    /* renamed from: o */
    public int f2164o;

    /* renamed from: p */
    public int f2165p;

    /* renamed from: q */
    public C1754d f2166q;

    /* renamed from: r */
    public C1754d f2167r;

    /* renamed from: s */
    public boolean f2168s;

    /* renamed from: t */
    public final C1147A f2169t;

    /* renamed from: u */
    public final C1147A f2170u;

    /* renamed from: v */
    public final k.X f2171v;

    /* renamed from: w */
    public final k.X f2172w;

    /* renamed from: x */
    public int f2173x;

    /* renamed from: y */
    public Integer f2174y;

    /* renamed from: z */
    public final C1160g f2175z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C1178z c1178z = AbstractC1166m.a;
        C1178z c1178z2 = new C1178z(32);
        int i6 = c1178z2.f12592b;
        if (i6 < 0) {
            AbstractC1180a.d(FlexmarkHtmlConverter.DEFAULT_NODE);
            throw null;
        }
        int i7 = i6 + 32;
        c1178z2.b(i7);
        int[] iArr2 = c1178z2.a;
        int i8 = c1178z2.f12592b;
        if (i6 != i8) {
            Y3.k.h0(iArr2, iArr2, i7, i6, i8);
        }
        Y3.k.k0(iArr, iArr2, i6, 0, 12);
        c1178z2.f12592b += 32;
        f2138R = c1178z2;
    }

    public D(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        this.f2156g = viewTreeObserverOnGlobalLayoutListenerC0216x;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC0216x.getContext().getSystemService("accessibility");
        AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f2159j = (AccessibilityManager) systemService;
        this.f2160k = 100L;
        this.f2162m = new Handler(Looper.getMainLooper());
        this.f2163n = new C0218y(this);
        this.f2164o = Integer.MIN_VALUE;
        this.f2165p = Integer.MIN_VALUE;
        this.f2169t = new C1147A();
        this.f2170u = new C1147A();
        this.f2171v = new k.X(0);
        this.f2172w = new k.X(0);
        this.f2173x = -1;
        this.f2175z = new C1160g(0);
        int i6 = 1;
        this.f2139A = AbstractC1120d.a(1, 6, null);
        this.f2140B = true;
        C1147A c1147a = AbstractC1168o.a;
        AbstractC1276k.d(c1147a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2142D = c1147a;
        this.f2143E = new C1148B();
        this.f2144F = new C1177y();
        this.f2145G = new C1177y();
        this.f2146H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f2147I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f2148J = new C0158m(7);
        this.f2149K = new C1147A();
        P0.p a = viewTreeObserverOnGlobalLayoutListenerC0216x.getSemanticsOwner().a();
        AbstractC1276k.d(c1147a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2150L = new R0(a, c1147a);
        int i7 = AbstractC1164k.a;
        this.f2152N = new C1177y();
        viewTreeObserverOnGlobalLayoutListenerC0216x.addOnAttachStateChangeListener(this);
        this.f2153O = new I.h(this, i6);
        this.f2154P = new ArrayList();
        this.f2155Q = new C(this, i6);
    }

    public static Rect E(o0.y yVar, float f6, float f7) {
        if (!(yVar instanceof C1384F) && !(yVar instanceof C1385G)) {
            return null;
        }
        C1354c n3 = yVar.n();
        return new Rect((int) (n3.a + f6), (int) (n3.f13295b + f7), (int) (n3.f13296c + f6), (int) (n3.f13297d + f7));
    }

    public static float[] G(o0.y yVar) {
        if (!(yVar instanceof C1385G)) {
            return null;
        }
        C1385G c1385g = (C1385G) yVar;
        C1355d c1355d = c1385g.f13411f;
        C1355d c1355d2 = c1385g.f13411f;
        return new float[]{Float.intBitsToFloat((int) (c1355d.f13301e >> 32)), Float.intBitsToFloat((int) (c1355d2.f13301e & 4294967295L)), Float.intBitsToFloat((int) (c1355d2.f13302f >> 32)), Float.intBitsToFloat((int) (c1355d2.f13302f & 4294967295L)), Float.intBitsToFloat((int) (c1355d2.f13303g >> 32)), Float.intBitsToFloat((int) (c1355d2.f13303g & 4294967295L)), Float.intBitsToFloat((int) (c1355d2.f13304h >> 32)), Float.intBitsToFloat((int) (4294967295L & c1355d2.f13304h))};
    }

    public static Region H(o0.y yVar, float f6, float f7) {
        if (!(yVar instanceof C1383E)) {
            return null;
        }
        C1383E c1383e = (C1383E) yVar;
        C1354c i6 = c1383e.n().i(f6, f7);
        Region region = new Region(new Rect((int) (i6.a + S.l.f7374V), (int) (i6.f13295b + S.l.f7374V), (int) (i6.f13296c + S.l.f7374V), (int) (i6.f13297d + S.l.f7374V)));
        Region region2 = new Region();
        C1397h c1397h = c1383e.f13409f;
        if (!(c1397h instanceof C1397h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c1397h.a;
        path.offset(f6, f7);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence I(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i6 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i6 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i6);
                AbstractC1276k.d(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String m(P0.p pVar) {
        C0545g c0545g;
        if (pVar != null) {
            P0.m mVar = pVar.f4499d;
            k.M m3 = mVar.f4492c;
            P0.w wVar = P0.t.a;
            if (m3.c(wVar)) {
                return AbstractC1016a.a((List) mVar.c(wVar), ",", null, 62);
            }
            P0.w wVar2 = P0.t.f4512F;
            if (m3.c(wVar2)) {
                Object g3 = m3.g(wVar2);
                if (g3 == null) {
                    g3 = null;
                }
                C0545g c0545g2 = (C0545g) g3;
                if (c0545g2 != null) {
                    return c0545g2.f7630e;
                }
            } else {
                Object g6 = m3.g(P0.t.f4508B);
                if (g6 == null) {
                    g6 = null;
                }
                List list = (List) g6;
                if (list != null && (c0545g = (C0545g) Y3.m.q0(list)) != null) {
                    return c0545g.f7630e;
                }
            }
        }
        return null;
    }

    public static final boolean q(P0.j jVar, float f6) {
        InterfaceC1193a interfaceC1193a = jVar.a;
        if (f6 >= S.l.f7374V || ((Number) interfaceC1193a.b()).floatValue() <= S.l.f7374V) {
            return f6 > S.l.f7374V && ((Number) interfaceC1193a.b()).floatValue() < ((Number) jVar.f4441b.b()).floatValue();
        }
        return true;
    }

    public static final boolean r(P0.j jVar) {
        InterfaceC1193a interfaceC1193a = jVar.a;
        if (((Number) interfaceC1193a.b()).floatValue() > S.l.f7374V) {
            return true;
        }
        ((Number) interfaceC1193a.b()).floatValue();
        ((Number) jVar.f4441b.b()).floatValue();
        return false;
    }

    public static final boolean s(P0.j jVar) {
        InterfaceC1193a interfaceC1193a = jVar.a;
        if (((Number) interfaceC1193a.b()).floatValue() < ((Number) jVar.f4441b.b()).floatValue()) {
            return true;
        }
        ((Number) interfaceC1193a.b()).floatValue();
        return false;
    }

    public static /* synthetic */ void x(D d6, int i6, int i7, Integer num, int i8) {
        if ((i8 & 4) != 0) {
            num = null;
        }
        d6.w(i6, i7, num, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x04d8, code lost:
    
        if (r1.isEmpty() == false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0507, code lost:
    
        if (r3 != null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x050c, code lost:
    
        if (r3 == null) goto L572;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0515  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(k.AbstractC1167n r59) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.D.A(k.n):void");
    }

    public final void B(H0.J j3, C1148B c1148b) {
        P0.m x5;
        if (j3.H() && !this.f2156g.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(j3)) {
            H0.J j4 = null;
            if (!j3.f1721J.d(8)) {
                j3 = j3.v();
                while (true) {
                    if (j3 == null) {
                        j3 = null;
                        break;
                    } else if (j3.f1721J.d(8)) {
                        break;
                    } else {
                        j3 = j3.v();
                    }
                }
            }
            if (j3 == null || (x5 = j3.x()) == null) {
                return;
            }
            if (!x5.f4494f) {
                H0.J v5 = j3.v();
                while (true) {
                    if (v5 != null) {
                        P0.m x6 = v5.x();
                        if (x6 != null && x6.f4494f) {
                            j4 = v5;
                            break;
                        }
                        v5 = v5.v();
                    } else {
                        break;
                    }
                }
                if (j4 != null) {
                    j3 = j4;
                }
            }
            int i6 = j3.f1734e;
            if (c1148b.a(i6)) {
                x(this, t(i6), 2048, 1, 8);
            }
        }
    }

    public final void C(H0.J j3) {
        if (j3.H() && !this.f2156g.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(j3)) {
            int i6 = j3.f1734e;
            P0.j jVar = (P0.j) this.f2169t.b(i6);
            P0.j jVar2 = (P0.j) this.f2170u.b(i6);
            if (jVar == null && jVar2 == null) {
                return;
            }
            AccessibilityEvent h3 = h(i6, 4096);
            if (jVar != null) {
                h3.setScrollX((int) ((Number) jVar.a.b()).floatValue());
                h3.setMaxScrollX((int) ((Number) jVar.f4441b.b()).floatValue());
            }
            if (jVar2 != null) {
                h3.setScrollY((int) ((Number) jVar2.a.b()).floatValue());
                h3.setMaxScrollY((int) ((Number) jVar2.f4441b.b()).floatValue());
            }
            v(h3);
        }
    }

    public final boolean D(P0.p pVar, int i6, int i7, boolean z5) {
        String m3;
        P0.m mVar = pVar.f4499d;
        int i8 = pVar.f4502g;
        P0.w wVar = P0.l.f4475j;
        if (mVar.f4492c.c(wVar) && K.b(pVar)) {
            l4.f fVar = (l4.f) ((P0.a) pVar.f4499d.c(wVar)).f4430b;
            if (fVar != null) {
                return ((Boolean) fVar.d(Integer.valueOf(i6), Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
            }
        } else if ((i6 != i7 || i7 != this.f2173x) && (m3 = m(pVar)) != null) {
            if (i6 < 0 || i6 != i7 || i7 > m3.length()) {
                i6 = -1;
            }
            this.f2173x = i6;
            boolean z6 = m3.length() > 0;
            v(i(t(i8), z6 ? Integer.valueOf(this.f2173x) : null, z6 ? Integer.valueOf(this.f2173x) : null, z6 ? Integer.valueOf(m3.length()) : null, m3));
            z(i8);
            return true;
        }
        return false;
    }

    public final Rect F(float f6, float f7, float f8, float f9) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2156g;
        long v5 = viewTreeObserverOnGlobalLayoutListenerC0216x.v(floatToRawIntBits);
        long v6 = viewTreeObserverOnGlobalLayoutListenerC0216x.v((Float.floatToRawIntBits(f9) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32));
        int i6 = (int) (v5 >> 32);
        int i7 = (int) (v6 >> 32);
        int i8 = (int) (v5 & 4294967295L);
        int i9 = (int) (v6 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7))), (int) Math.floor(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.D.J():void");
    }

    @Override // t1.AbstractC1699b
    public final C0987j a(View view) {
        return this.f2163n;
    }

    public final void c(int i6, C1754d c1754d, String str, Bundle bundle) {
        P0.p pVar;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = c1754d.a;
        P0.q qVar = (P0.q) l().b(i6);
        if (qVar == null || (pVar = qVar.a) == null) {
            return;
        }
        H0.J j3 = pVar.f4498c;
        P0.m mVar = pVar.f4499d;
        k.M m3 = mVar.f4492c;
        String m5 = m(pVar);
        if (AbstractC1276k.b(str, this.f2146H)) {
            int d6 = this.f2144F.d(i6);
            if (d6 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d6);
                return;
            }
            return;
        }
        if (AbstractC1276k.b(str, this.f2147I)) {
            int d7 = this.f2145G.d(i6);
            if (d7 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d7);
                return;
            }
            return;
        }
        boolean c6 = m3.c(P0.l.a);
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2 = this.f2156g;
        boolean z5 = false;
        if (c6 && bundle != null && AbstractC1276k.b(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i7 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i8 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i8 > 0 && i7 >= 0) {
                if (i7 < (m5 != null ? m5.length() : TableCell.NOT_TRACKED)) {
                    S0.L k3 = K.k(mVar);
                    if (k3 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i9 = 0;
                    while (i9 < i8) {
                        int i10 = i7 + i9;
                        if (i10 >= k3.a.a.f7630e.length()) {
                            arrayList.add(z5);
                            viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x2;
                        } else {
                            C1354c b5 = k3.b(i10);
                            H0.i0 d8 = pVar.d();
                            long j4 = 0;
                            if (d8 != null) {
                                if (!d8.W0().f11819q) {
                                    d8 = null;
                                }
                                if (d8 != null) {
                                    j4 = d8.U(0L);
                                }
                            }
                            C1354c j5 = b5.j(j4);
                            C1354c g3 = pVar.g();
                            if ((j5.h(g3) ? j5.f(g3) : null) != null) {
                                long v5 = viewTreeObserverOnGlobalLayoutListenerC0216x2.v((Float.floatToRawIntBits(r9.f13295b) & 4294967295L) | (Float.floatToRawIntBits(r9.a) << 32));
                                long v6 = viewTreeObserverOnGlobalLayoutListenerC0216x2.v((Float.floatToRawIntBits(r9.f13296c) << 32) | (Float.floatToRawIntBits(r9.f13297d) & 4294967295L));
                                viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x2;
                                int i11 = (int) (v5 >> 32);
                                int i12 = (int) (v6 >> 32);
                                float min = Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12));
                                int i13 = (int) (v5 & 4294967295L);
                                int i14 = (int) (v6 & 4294967295L);
                                rectF = new RectF(min, Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)));
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i9++;
                        viewTreeObserverOnGlobalLayoutListenerC0216x2 = viewTreeObserverOnGlobalLayoutListenerC0216x;
                        z5 = false;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        P0.w wVar = P0.t.f4547z;
        if (m3.c(wVar) && bundle != null && AbstractC1276k.b(str, "androidx.compose.ui.semantics.testTag")) {
            Object g6 = m3.g(wVar);
            String str2 = (String) (g6 == null ? null : g6);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC1276k.b(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, pVar.f4502g);
            return;
        }
        if (AbstractC1276k.b(str, "androidx.compose.ui.semantics.shapeType")) {
            Object g7 = m3.g(P0.t.f4522P);
            o0.L l3 = (o0.L) (g7 == null ? null : g7);
            if (l3 != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                C1354c n3 = n(pVar, rect, l3);
                float f6 = n3.f13295b;
                float f7 = n3.a;
                o0.y a = l3.a(n3.d(), j3.f1715D, viewTreeObserverOnGlobalLayoutListenerC0216x2.getDensity());
                if (a instanceof C1384F) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(a, f7, f6));
                    return;
                } else if (a instanceof C1385G) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E(a, f7, f6));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", G(a));
                    return;
                } else {
                    if (!(a instanceof C1383E)) {
                        throw new RuntimeException();
                    }
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", H(a, f7, f6));
                    return;
                }
            }
            return;
        }
        if (AbstractC1276k.b(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object g8 = m3.g(P0.t.f4522P);
            o0.L l5 = (o0.L) (g8 == null ? null : g8);
            if (l5 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                C1354c n5 = n(pVar, rect2, l5);
                Rect E5 = E(l5.a(n5.d(), j3.f1715D, viewTreeObserverOnGlobalLayoutListenerC0216x2.getDensity()), n5.a, n5.f13295b);
                if (E5 != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", E5);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC1276k.b(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object g9 = m3.g(P0.t.f4522P);
            o0.L l6 = (o0.L) (g9 == null ? null : g9);
            if (l6 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] G5 = G(l6.a(n(pVar, rect3, l6).d(), j3.f1715D, viewTreeObserverOnGlobalLayoutListenerC0216x2.getDensity()));
                if (G5 != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", G5);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC1276k.b(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object g10 = m3.g(P0.t.f4522P);
            o0.L l7 = (o0.L) (g10 == null ? null : g10);
            if (l7 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                C1354c n6 = n(pVar, rect4, l7);
                Region H3 = H(l7.a(n6.d(), j3.f1715D, viewTreeObserverOnGlobalLayoutListenerC0216x2.getDensity()), n6.a, n6.f13295b);
                if (H3 != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", H3);
                }
            }
        }
    }

    public final Rect d(P0.q qVar) {
        e1.k kVar = qVar.f4503b;
        return F(kVar.a, kVar.f11573b, kVar.f11574c, kVar.f11575d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f2, code lost:
    
        if (x4.AbstractC1888A.m(r4, r2) == r7) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005d, B:21:0x006f, B:23:0x0077, B:25:0x0080, B:27:0x0085, B:29:0x0094, B:31:0x009d, B:53:0x0047, B:55:0x004e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f2 -> B:14:0x00f5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(d4.c r17) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.D.e(d4.c):java.lang.Object");
    }

    public final boolean f(boolean z5, int i6, long j3) {
        P0.w wVar;
        int i7;
        if (!AbstractC1276k.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        AbstractC1167n l3 = l();
        if (C1353b.c(j3, 9205357640488583168L) || (((9223372034707292159L & j3) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z5) {
            wVar = P0.t.f4543v;
        } else {
            if (z5) {
                throw new RuntimeException();
            }
            wVar = P0.t.f4542u;
        }
        Object[] objArr = l3.f12559c;
        long[] jArr = l3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i8 = 0;
        boolean z6 = false;
        while (true) {
            long j4 = jArr[i8];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j4) < 128) {
                        P0.q qVar = (P0.q) objArr[(i8 << 3) + i11];
                        e1.k kVar = qVar.f4503b;
                        float f6 = kVar.a;
                        i7 = i9;
                        float f7 = kVar.f11573b;
                        float f8 = kVar.f11574c;
                        float f9 = kVar.f11575d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
                        if ((intBitsToFloat2 < f9) & (intBitsToFloat >= f6) & (intBitsToFloat < f8) & (intBitsToFloat2 >= f7)) {
                            Object g3 = qVar.a.f4499d.f4492c.g(wVar);
                            if (g3 == null) {
                                g3 = null;
                            }
                            P0.j jVar = (P0.j) g3;
                            if (jVar != null) {
                                InterfaceC1193a interfaceC1193a = jVar.a;
                                if (i6 < 0) {
                                    if (((Number) interfaceC1193a.b()).floatValue() <= S.l.f7374V) {
                                    }
                                    z6 = true;
                                } else {
                                    if (((Number) interfaceC1193a.b()).floatValue() >= ((Number) jVar.f4441b.b()).floatValue()) {
                                    }
                                    z6 = true;
                                }
                            }
                        }
                    } else {
                        i7 = i9;
                    }
                    j4 >>= i7;
                    i11++;
                    i9 = i7;
                }
                if (i10 != i9) {
                    return z6;
                }
            }
            if (i8 == length) {
                return z6;
            }
            i8++;
        }
    }

    public final void g() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (o()) {
                u(this.f2156g.getSemanticsOwner().a(), this.f2150L);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                A(l());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    J();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent h(int i6, int i7) {
        P0.q qVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i7);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2156g;
        obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0216x.getContext().getPackageName());
        obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0216x, i6);
        if (o() && (qVar = (P0.q) l().b(i6)) != null) {
            P0.p pVar = qVar.a;
            obtain.setPassword(pVar.f4499d.f4492c.c(P0.t.f4517K));
            Object g3 = pVar.f4499d.f4492c.g(P0.t.f4535n);
            if (g3 == null) {
                g3 = null;
            }
            boolean b5 = AbstractC1276k.b(g3, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0857a.g(obtain, b5);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent i(int i6, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent h3 = h(i6, 8192);
        if (num != null) {
            h3.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            h3.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            h3.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            h3.getText().add(charSequence);
        }
        return h3;
    }

    public final int j(P0.p pVar) {
        P0.m mVar = pVar.f4499d;
        P0.m mVar2 = pVar.f4499d;
        P0.w wVar = P0.t.a;
        if (!mVar.f4492c.c(P0.t.a)) {
            P0.w wVar2 = P0.t.f4513G;
            if (mVar2.f4492c.c(wVar2)) {
                return (int) (((S0.O) mVar2.c(wVar2)).a & 4294967295L);
            }
        }
        return this.f2173x;
    }

    public final int k(P0.p pVar) {
        P0.m mVar = pVar.f4499d;
        P0.m mVar2 = pVar.f4499d;
        P0.w wVar = P0.t.a;
        if (!mVar.f4492c.c(P0.t.a)) {
            P0.w wVar2 = P0.t.f4513G;
            if (mVar2.f4492c.c(wVar2)) {
                return (int) (((S0.O) mVar2.c(wVar2)).a >> 32);
            }
        }
        return this.f2173x;
    }

    public final AbstractC1167n l() {
        if (this.f2140B) {
            this.f2140B = false;
            ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2156g;
            this.f2142D = P0.s.b(viewTreeObserverOnGlobalLayoutListenerC0216x.getSemanticsOwner(), C0201p.f2341g);
            if (o()) {
                C1147A c1147a = this.f2142D;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC0216x.getContext().getResources();
                C1177y c1177y = this.f2144F;
                c1177y.a();
                C1177y c1177y2 = this.f2145G;
                c1177y2.a();
                P0.q qVar = (P0.q) c1147a.b(-1);
                P0.p pVar = qVar != null ? qVar.a : null;
                AbstractC1276k.c(pVar);
                ArrayList b5 = P0.y.b(pVar, new B0.G(c1147a, 6), new B0.G(resources, 7), Y4.l.H(pVar));
                int C5 = Y4.l.C(b5);
                int i6 = 1;
                if (1 <= C5) {
                    while (true) {
                        int i7 = ((P0.p) b5.get(i6 - 1)).f4502g;
                        int i8 = ((P0.p) b5.get(i6)).f4502g;
                        c1177y.f(i7, i8);
                        c1177y2.f(i8, i7);
                        if (i6 == C5) {
                            break;
                        }
                        i6++;
                    }
                }
            }
        }
        return this.f2142D;
    }

    public final C1354c n(P0.p pVar, Rect rect, o0.L l3) {
        B b5 = new B(l3);
        H0.J j3 = pVar.f4498c;
        AbstractC1040q abstractC1040q = j3.f1721J.f1919f;
        InterfaceC0155j interfaceC0155j = null;
        if ((abstractC1040q.f11809g & 8) != 0) {
            loop0: while (true) {
                if (abstractC1040q == null) {
                    break;
                }
                if ((abstractC1040q.f11808f & 8) != 0) {
                    AbstractC1040q abstractC1040q2 = abstractC1040q;
                    V.e eVar = null;
                    while (abstractC1040q2 != null) {
                        if (abstractC1040q2 instanceof H0.A0) {
                            ((H0.A0) abstractC1040q2).I(b5);
                            if (b5.f2129c) {
                                interfaceC0155j = abstractC1040q2;
                                break loop0;
                            }
                        } else if ((abstractC1040q2.f11808f & 8) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                            int i6 = 0;
                            for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                if ((abstractC1040q3.f11808f & 8) != 0) {
                                    i6++;
                                    if (i6 == 1) {
                                        abstractC1040q2 = abstractC1040q3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new V.e(new AbstractC1040q[16]);
                                        }
                                        if (abstractC1040q2 != null) {
                                            eVar.b(abstractC1040q2);
                                            abstractC1040q2 = null;
                                        }
                                        eVar.b(abstractC1040q3);
                                    }
                                }
                            }
                            if (i6 == 1) {
                            }
                        }
                        abstractC1040q2 = AbstractC0157l.e(eVar);
                    }
                }
                if ((abstractC1040q.f11809g & 8) == 0) {
                    break;
                }
                abstractC1040q = abstractC1040q.f11811i;
            }
        }
        InterfaceC0155j interfaceC0155j2 = (H0.A0) interfaceC0155j;
        if (interfaceC0155j2 == null || !((AbstractC1040q) interfaceC0155j2).f11806c.f11819q) {
            return AbstractC0137z.f(j3.f1721J.f1917d, false);
        }
        H0.i0 u5 = AbstractC0157l.u(interfaceC0155j2);
        C1354c Q5 = AbstractC0137z.h(u5).Q(u5, true);
        Rect F5 = F(Q5.a, Q5.f13295b, Q5.f13296c, Q5.f13297d);
        float f6 = F5.left - rect.left;
        float f7 = F5.top - rect.top;
        return new C1354c(f6, f7, F5.width() + f6, F5.height() + f7);
    }

    public final boolean o() {
        AccessibilityManager accessibilityManager = this.f2159j;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.f2161l;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f2161l = list;
        }
        return !list.isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z5) {
        this.f2161l = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z5) {
        this.f2161l = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f2159j;
        if (accessibilityManager.isEnabled()) {
            this.f2161l = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2162m.removeCallbacks(this.f2153O);
        AccessibilityManager accessibilityManager = this.f2159j;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void p(H0.J j3) {
        if (this.f2175z.add(j3)) {
            this.f2139A.t(X3.y.a);
        }
    }

    public final int t(int i6) {
        if (i6 == this.f2156g.getSemanticsOwner().a().f4502g) {
            return -1;
        }
        return i6;
    }

    public final void u(P0.p pVar, R0 r02) {
        int[] iArr = AbstractC1169p.a;
        C1148B c1148b = new C1148B();
        List j3 = P0.p.j(4, pVar);
        H0.J j4 = pVar.f4498c;
        int size = j3.size();
        for (int i6 = 0; i6 < size; i6++) {
            P0.p pVar2 = (P0.p) j3.get(i6);
            AbstractC1167n l3 = l();
            int i7 = pVar2.f4502g;
            if (l3.a(i7)) {
                if (!r02.f2241b.b(i7)) {
                    p(j4);
                    return;
                }
                c1148b.a(i7);
            }
        }
        C1148B c1148b2 = r02.f2241b;
        int[] iArr2 = c1148b2.f12437b;
        long[] jArr = c1148b2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr[i8];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j5) < 128 && !c1148b.b(iArr2[(i8 << 3) + i10])) {
                            p(j4);
                            return;
                        }
                        j5 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                }
                if (i8 == length) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        List j6 = P0.p.j(4, pVar);
        int size2 = j6.size();
        for (int i11 = 0; i11 < size2; i11++) {
            P0.p pVar3 = (P0.p) j6.get(i11);
            R0 r03 = (R0) this.f2149K.b(pVar3.f4502g);
            if (r03 != null && l().a(pVar3.f4502g)) {
                u(pVar3, r03);
            }
        }
    }

    public final boolean v(AccessibilityEvent accessibilityEvent) {
        if (!o()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f2168s = true;
        }
        try {
            return ((Boolean) this.f2158i.f(accessibilityEvent)).booleanValue();
        } finally {
            this.f2168s = false;
        }
    }

    public final boolean w(int i6, int i7, Integer num, List list) {
        if (i6 == Integer.MIN_VALUE || !o()) {
            return false;
        }
        AccessibilityEvent h3 = h(i6, i7);
        if (num != null) {
            h3.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            h3.setContentDescription(AbstractC1016a.a(list, ",", null, 62));
        }
        return v(h3);
    }

    public final void y(int i6, int i7, String str) {
        AccessibilityEvent h3 = h(t(i6), 32);
        h3.setContentChangeTypes(i7);
        if (str != null) {
            h3.getText().add(str);
        }
        v(h3);
    }

    public final void z(int i6) {
        C0220z c0220z = this.f2141C;
        if (c0220z != null) {
            P0.p pVar = c0220z.a;
            if (i6 != pVar.f4502g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0220z.f2516f <= 1000) {
                AccessibilityEvent h3 = h(t(pVar.f4502g), PegdownExtensions.SUPPRESS_INLINE_HTML);
                h3.setFromIndex(c0220z.f2514d);
                h3.setToIndex(c0220z.f2515e);
                h3.setAction(c0220z.f2512b);
                h3.setMovementGranularity(c0220z.f2513c);
                h3.getText().add(m(pVar));
                v(h3);
            }
        }
        this.f2141C = null;
    }
}
