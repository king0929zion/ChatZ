package D;

import F0.InterfaceC0134w;
import H0.C0158m;
import H0.C0162q;
import I0.C0172a0;
import I0.C0207s0;
import M4.C0276x;
import M4.C0277y;
import O.AbstractC0334t0;
import O.AbstractC0336u0;
import O.C0332s0;
import Q.C0405d2;
import Q.C0440m1;
import Q.C0470u0;
import Q.EnumC0409e2;
import Q.I2;
import Q.s3;
import R.C0518x;
import S0.C0545g;
import S0.C0554p;
import T.C0607g0;
import T.C0627q0;
import T.C0628r0;
import T.C0639x;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import android.view.textclassifier.TextClassification;
import b0.C0868a;
import b3.C0889e;
import b3.C0898n;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import f0.C0996s;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.C1288w;
import n0.C1353b;
import u4.AbstractC1776n;
import v.AbstractC1787b;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1146c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1148f;

    public /* synthetic */ r(int i6, Object obj, Object obj2) {
        this.f1146c = i6;
        this.f1147e = obj;
        this.f1148f = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v36, types: [d4.i, l4.c] */
    @Override // l4.InterfaceC1193a
    public final Object b() {
        C0545g c0545g;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        long j3;
        d1 d6;
        C0098v0 c0098v0;
        C0545g c0545g2;
        String[] names;
        L2.c cVar;
        C0639x c0639x;
        R.T t5;
        long j4 = 9205357640488583168L;
        switch (this.f1146c) {
            case 0:
                X0.v vVar = (X0.v) this.f1147e;
                T.X x5 = (T.X) this.f1148f;
                if (!S0.O.b(vVar.f9125b, ((X0.v) x5.getValue()).f9125b) || !AbstractC1276k.b(vVar.f9126c, ((X0.v) x5.getValue()).f9126c)) {
                    x5.setValue(vVar);
                }
                return X3.y.a;
            case 1:
                i1 i1Var = (i1) this.f1147e;
                C0545g c0545g3 = (C0545g) this.f1148f;
                if (i1Var == null) {
                    return c0545g3;
                }
                C0996s c0996s = i1Var.f1039c;
                if (c0996s.isEmpty()) {
                    c0545g = i1Var.f1038b;
                } else {
                    E0 e02 = new E0(i1Var.f1038b);
                    int size = c0996s.size();
                    while (r9 < size) {
                        ((l4.c) c0996s.get(r9)).f(e02);
                        r9++;
                    }
                    c0545g = e02.f757b;
                }
                i1Var.f1038b = c0545g;
                return c0545g == null ? c0545g3 : c0545g;
            case 2:
                ((C1288w) this.f1147e).f12973c = ((InterfaceC1193a) this.f1148f).b();
                return X3.y.a;
            case 3:
                return new e1.j(Y3.C.Q(((K.e) this.f1147e).l((InterfaceC0134w) ((InterfaceC1193a) this.f1148f).b())));
            case 4:
                ((G.d) ((G.b) this.f1147e)).f1639d.f((G.g) this.f1148f);
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                Context context = (Context) this.f1147e;
                TextClassification textClassification = (TextClassification) this.f1148f;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e6) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e6);
                    }
                } else {
                    activity.send();
                }
                return X3.y.a;
            case 6:
                I1.m mVar = (I1.m) this.f1147e;
                I1.j jVar = (I1.j) this.f1148f;
                synchronized (mVar.a) {
                    try {
                        A4.g0 g0Var = mVar.f2553b;
                        Iterable iterable = (Iterable) g0Var.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (AbstractC1276k.b((I1.j) obj, jVar)) {
                                g0Var.getClass();
                                g0Var.l(null, arrayList);
                            } else {
                                arrayList.add(obj);
                            }
                        }
                        g0Var.getClass();
                        g0Var.l(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return X3.y.a;
            case 7:
                ((J1.r) this.f1147e).e((I1.j) this.f1148f, false);
                return X3.y.a;
            case 8:
                C0277y c0277y = (C0277y) this.f1147e;
                String str = (String) this.f1148f;
                Enum[] enumArr = c0277y.a;
                C0276x c0276x = new C0276x(str, enumArr.length);
                for (Enum r02 : enumArr) {
                    c0276x.l(r02.name(), false);
                }
                return c0276x;
            case AbstractC1787b.f15287d /* 9 */:
                C0332s0 c0332s0 = (C0332s0) this.f1147e;
                long j5 = ((e1.l) ((T.X) this.f1148f).getValue()).a;
                O.G f6 = c0332s0.f();
                if (f6 != null) {
                    EnumC0073i0 e7 = c0332s0.e();
                    int i6 = e7 == null ? -1 : AbstractC0334t0.a[e7.ordinal()];
                    if (i6 != -1) {
                        if (i6 == 1) {
                            j4 = AbstractC0336u0.r(c0332s0, j5, f6.a);
                        } else {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    throw new RuntimeException();
                                }
                                throw new IllegalStateException("SelectionContainer does not support cursor");
                            }
                            j4 = AbstractC0336u0.r(c0332s0, j5, f6.f3945b);
                        }
                    }
                }
                return new C1353b(j4);
            case AbstractC1787b.f15289f /* 10 */:
                AbstractC1888A.y((InterfaceC1942y) this.f1147e, null, new O.R0(null, (d4.i) this.f1148f), 1);
                return X3.y.a;
            case 11:
                O.N0 n02 = (O.N0) this.f1147e;
                long j6 = ((e1.l) ((T.X) this.f1148f).getValue()).a;
                C1353b i7 = n02.i();
                if (i7 != null) {
                    long j7 = i7.a;
                    C0545g m3 = n02.m();
                    if (m3 != null && m3.f7630e.length() != 0) {
                        EnumC0073i0 enumC0073i0 = (EnumC0073i0) n02.f4008q.getValue();
                        int i8 = enumC0073i0 == null ? -1 : O.P0.a[enumC0073i0.ordinal()];
                        if (i8 != -1) {
                            if (i8 == 1 || i8 == 2) {
                                long j8 = n02.n().f9125b;
                                int i9 = S0.O.f7611c;
                                j3 = j8 >> 32;
                            } else {
                                if (i8 != 3) {
                                    throw new RuntimeException();
                                }
                                long j9 = n02.n().f9125b;
                                int i10 = S0.O.f7611c;
                                j3 = j9 & 4294967295L;
                            }
                            int i11 = (int) j3;
                            C0098v0 c0098v02 = n02.f3995d;
                            if (c0098v02 != null && (d6 = c0098v02.d()) != null && (c0098v0 = n02.f3995d) != null && (c0545g2 = c0098v0.a.a) != null) {
                                int f7 = AbstractC1117a.f(n02.f3993b.b(i11), 0, c0545g2.f7630e.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d6.d(j7) >> 32));
                                S0.L l3 = d6.a;
                                C0554p c0554p = l3.f7599b;
                                int d7 = c0554p.d(f7);
                                float g3 = l3.g(d7);
                                float h3 = l3.h(d7);
                                float e8 = AbstractC1117a.e(intBitsToFloat, Math.min(g3, h3), Math.max(g3, h3));
                                if (e1.l.b(j6, 0L) || Math.abs(intBitsToFloat - e8) <= ((int) (j6 >> 32)) / 2) {
                                    float f8 = c0554p.f(d7);
                                    j4 = (Float.floatToRawIntBits(e8) << 32) | (Float.floatToRawIntBits(((c0554p.b(d7) - f8) / 2) + f8) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C1353b(j4);
            case 12:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.f1147e;
                N4.c cVar2 = (N4.c) this.f1148f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                N4.h hVar = cVar2.a;
                O4.m.m(cVar2, serialDescriptor);
                int f9 = serialDescriptor.f();
                for (int i12 = 0; i12 < f9; i12++) {
                    List i13 = serialDescriptor.i(i12);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : i13) {
                        if (obj2 instanceof N4.p) {
                            arrayList2.add(obj2);
                        }
                    }
                    N4.p pVar = (N4.p) Y3.m.E0(arrayList2);
                    if (pVar != null && (names = pVar.names()) != null) {
                        for (String str2 : names) {
                            String str3 = AbstractC1276k.b(serialDescriptor.e(), K4.j.f2975f) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                String str4 = "The suggested name '" + str2 + "' for " + str3 + SequenceUtils.SPC + serialDescriptor.g(i12) + " is already one of the names for " + str3 + SequenceUtils.SPC + serialDescriptor.g(((Number) Y3.B.Y(str2, linkedHashMap)).intValue()) + " in " + serialDescriptor;
                                AbstractC1276k.f(str4, "message");
                                throw new IllegalArgumentException(str4);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i12));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? Y3.w.f9813c : linkedHashMap;
            case 13:
                I0.S0 s02 = (I0.S0) this.f1147e;
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f1148f;
                if (s02 != null) {
                    ((C0207s0) s02).a();
                }
                interfaceC1193a.b();
                return X3.y.a;
            case 14:
                P2.P0 p02 = (P2.P0) this.f1147e;
                L2.c cVar3 = (L2.c) this.f1148f;
                if (p02 != null) {
                    C0607g0 c0607g0 = p02.f4774d;
                    C0607g0 c0607g02 = p02.f4773c;
                    String str5 = cVar3.f3059c;
                    String str6 = cVar3.a;
                    AbstractC1276k.f(str5, "text");
                    AbstractC1276k.f(str6, "utteranceId");
                    if (p02.f4772b) {
                        if (((P2.R0) c0607g02.getValue()) == P2.R0.f4780e && AbstractC1276k.b((String) c0607g0.getValue(), str6)) {
                            TextToSpeech textToSpeech = p02.a;
                            if (textToSpeech != null) {
                                textToSpeech.stop();
                            }
                            c0607g02.setValue(P2.R0.f4779c);
                            c0607g0.setValue(null);
                        } else {
                            TextToSpeech textToSpeech2 = p02.a;
                            if (textToSpeech2 != null) {
                                textToSpeech2.speak(str5, 0, null, str6);
                            }
                        }
                    }
                }
                return X3.y.a;
            case 15:
                W2.o oVar = (W2.o) this.f1147e;
                L2.c cVar4 = (L2.c) this.f1148f;
                if (oVar != null) {
                    String str7 = cVar4.a;
                    X2.L l5 = oVar.a;
                    T.X x6 = oVar.f8949b;
                    T.X x7 = oVar.f8950c;
                    T.X x8 = oVar.f8951d;
                    T.X x9 = oVar.f8952e;
                    T.X x10 = oVar.f8953f;
                    T.X x11 = oVar.f8954g;
                    T.X x12 = oVar.f8955h;
                    T.X x13 = oVar.f8956i;
                    AbstractC1276k.f(str7, "aiMessageId");
                    String str8 = (String) x6.getValue();
                    String str9 = (String) x7.getValue();
                    float floatValue = ((Number) x8.getValue()).floatValue();
                    float floatValue2 = ((Number) x9.getValue()).floatValue();
                    Integer num = (Integer) x10.getValue();
                    Integer num2 = (Integer) x11.getValue();
                    String str10 = (String) x12.getValue();
                    String str11 = (String) x13.getValue();
                    C0996s c0996s2 = l5.f9214o;
                    AbstractC1276k.f(str8, "model");
                    AbstractC1276k.f(str9, "prompt");
                    String str12 = (String) l5.f9197D.getValue();
                    if (!AbstractC1776n.Q(str12)) {
                        ListIterator listIterator = c0996s2.listIterator();
                        while (true) {
                            C0162q c0162q = (C0162q) listIterator;
                            if (!c0162q.hasNext()) {
                                r9 = -1;
                            } else if (!AbstractC1276k.b(((L2.c) c0162q.next()).a, str7)) {
                                r9++;
                            }
                        }
                        if (r9 != -1) {
                            int i14 = r9 - 1;
                            while (true) {
                                if (-1 >= i14) {
                                    cVar = null;
                                } else if (((L2.c) c0996s2.get(i14)).f3058b == L2.d.f3069c) {
                                    cVar = (L2.c) c0996s2.get(i14);
                                } else {
                                    i14--;
                                }
                            }
                            if (cVar != null) {
                                l5.f9211l.getClass();
                                String b5 = V2.a.b(cVar.f3059c, cVar.f3061e);
                                AbstractC1888A.y(androidx.lifecycle.O.i(l5), null, new X2.E(l5, str8, num2, str10, str11, str7, str12, b5, cVar.f3060d, X2.L.k(l5, b5, Y3.m.H0(c0996s2, r9), null, 4), str9, floatValue, floatValue2, num, null), 3);
                            }
                        }
                    }
                }
                return X3.y.a;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                C0405d2 c0405d2 = (C0405d2) this.f1147e;
                InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f1148f;
                if (((Boolean) c0405d2.f5767d.f6827d.f(EnumC0409e2.f5778f)).booleanValue()) {
                    AbstractC1888A.y(interfaceC1942y, null, new C0440m1(c0405d2, null), 3);
                }
                return Boolean.TRUE;
            case 17:
                I2 i22 = (I2) this.f1147e;
                C0470u0 c0470u0 = (C0470u0) this.f1148f;
                if (!AbstractC1276k.b(i22, c0470u0.a)) {
                    Y3.r.d0(c0470u0.f6149b, new C0056a(i22, 22));
                    C0627q0 c0627q0 = c0470u0.f6150c;
                    if (c0627q0 != null && (c0639x = c0627q0.a) != null) {
                        c0639x.s(c0627q0, null);
                    }
                }
                return X3.y.a;
            case 18:
                InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) this.f1147e;
                InterfaceC1193a interfaceC1193a3 = (InterfaceC1193a) this.f1148f;
                interfaceC1193a2.b();
                interfaceC1193a3.b();
                return X3.y.a;
            case 19:
                R.V v5 = (R.V) this.f1147e;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1148f;
                v5.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(v5);
                R.U u5 = v5.f6730g;
                if (u5 != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(u5);
                }
                if (Build.VERSION.SDK_INT >= 33 && (t5 = v5.f6731h) != null) {
                    R.S.b(accessibilityManager, G2.b.h(t5));
                }
                return X3.y.a;
            case 20:
                AbstractC1888A.y((InterfaceC1942y) this.f1147e, null, new C0518x((s3) this.f1148f, null), 3);
                return Boolean.TRUE;
            case 21:
                X2.L l6 = (X2.L) this.f1147e;
                boolean z5 = !((Boolean) ((T.d1) this.f1148f).getValue()).booleanValue();
                A4.g0 g0Var2 = l6.f9194A;
                Boolean valueOf = Boolean.valueOf(z5);
                g0Var2.getClass();
                g0Var2.l(null, valueOf);
                return X3.y.a;
            case 22:
                m0.n nVar = (m0.n) this.f1147e;
                l4.c cVar5 = (l4.c) this.f1148f;
                ((m0.q) nVar).b(true);
                cVar5.f(R2.A.f6854c);
                return X3.y.a;
            case 23:
                C0889e c0889e = (C0889e) this.f1147e;
                String str13 = (String) this.f1148f;
                if (c0889e != null) {
                    c0889e.a.setValue(new C0898n(true, Y4.l.H(AbstractC1776n.l0(str13).toString()), 0));
                }
                return X3.y.a;
            case 24:
                C0158m c0158m = (C0158m) this.f1147e;
                C0628r0 c0628r0 = (C0628r0) this.f1148f;
                if (((C0868a) c0158m.f1972e).get() == 0) {
                    c0628r0.b();
                }
                return X3.y.a;
            case 25:
                k.N n3 = (k.N) this.f1147e;
                C0639x c0639x2 = (C0639x) this.f1148f;
                Object[] objArr = n3.f12490b;
                long[] jArr = n3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((255 & j10) < 128) {
                                    c0639x2.A(objArr[(i15 << 3) + i17]);
                                }
                                j10 >>= 8;
                            }
                            if (i16 != 8) {
                            }
                        }
                        if (i15 != length) {
                            i15++;
                        }
                    }
                }
                return X3.y.a;
            case 26:
                ((C0172a0) this.f1147e).a(((U2.o) this.f1148f).a);
                return X3.y.a;
            case 27:
                ((C0172a0) this.f1147e).a((String) this.f1148f);
                return X3.y.a;
            case 28:
                X2.L l7 = (X2.L) this.f1147e;
                I0.S0 s03 = (I0.S0) this.f1148f;
                l7.n(true);
                if (s03 != null) {
                    ((C0207s0) s03).a();
                }
                return X3.y.a;
            default:
                Context context2 = (Context) this.f1147e;
                C0172a0 c0172a0 = (C0172a0) this.f1148f;
                Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&version=1&uin=292036480&card_type=group&source=external")).addFlags(PegdownExtensions.FORCELISTITEMPARA);
                AbstractC1276k.e(addFlags, "addFlags(...)");
                try {
                    context2.startActivity(addFlags);
                } catch (Exception unused) {
                    c0172a0.a("https://qm.qq.com/q/sWqmwBTc76");
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ r(I1.m mVar, I1.j jVar, boolean z5) {
        this.f1146c = 6;
        this.f1147e = mVar;
        this.f1148f = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r(InterfaceC1942y interfaceC1942y, l4.c cVar) {
        this.f1146c = 10;
        this.f1147e = interfaceC1942y;
        this.f1148f = (d4.i) cVar;
    }
}
