package M;

import F0.V;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.F;
import H0.InterfaceC0161p;
import H0.J;
import M4.C0263j;
import M4.C0269p;
import M4.T;
import M4.Z;
import Q.B2;
import R.C0513s;
import S0.C0545g;
import S0.O;
import T.C0607g0;
import T.InterfaceC0604f;
import T.M0;
import T.W;
import U.K;
import Y3.C;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0838l;
import androidx.lifecycle.EnumC0842p;
import b0.C0868a;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import h0.AbstractC1040q;
import i4.AbstractC1117a;
import i4.AbstractC1118b;
import j1.AbstractC1135a;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k.C1175w;
import k.I;
import k.M;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import p.x0;
import r.C1589n0;
import r.C1604s0;
import r.InterfaceC1616w0;
import s4.InterfaceC1672b;
import u.AbstractC1734b;
import v.AbstractC1787b;
import x4.AbstractC1888A;
import x4.s0;
import z4.AbstractC2051b;
import z4.C2053d;
import z4.C2054e;
import z4.C2057h;

/* loaded from: classes.dex */
public final class q implements B3.g, X1.b, InterfaceC1616w0, InterfaceC0604f, K, U0.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3178c;

    /* renamed from: e, reason: collision with root package name */
    public Object f3179e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3180f;

    public /* synthetic */ q(int i6, Object obj, Object obj2) {
        this.f3178c = i6;
        this.f3179e = obj;
        this.f3180f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                            public static void l(J j3) {
        if (j3.f1731T > 0) {
            if (j3.f1722K.f1769d == F.f1700h && !j3.p() && !j3.q() && !j3.f1732U && j3.I()) {
                AbstractC1040q abstractC1040q = j3.f1721J.f1919f;
                if ((abstractC1040q.f11809g & PegdownExtensions.WIKILINKS) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.WIKILINKS) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q;
                            int r5 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof InterfaceC0161p) {
                                    InterfaceC0161p interfaceC0161p = (InterfaceC0161p) abstractC0156k;
                                    interfaceC0161p.j0(AbstractC0157l.t(interfaceC0161p, PegdownExtensions.WIKILINKS));
                                } else if ((abstractC0156k.f11808f & PegdownExtensions.WIKILINKS) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q2 = abstractC0156k.f1964s;
                                    int i6 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r5 = r5;
                                    while (abstractC1040q2 != null) {
                                        if ((abstractC1040q2.f11808f & PegdownExtensions.WIKILINKS) != 0) {
                                            i6++;
                                            r5 = r5;
                                            if (i6 == 1) {
                                                abstractC0156k = abstractC1040q2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r5.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r5.b(abstractC1040q2);
                                            }
                                        }
                                        abstractC1040q2 = abstractC1040q2.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r5 = r5;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r5);
                            }
                        }
                        if ((abstractC1040q.f11809g & PegdownExtensions.WIKILINKS) == 0) {
                            break;
                        } else {
                            abstractC1040q = abstractC1040q.f11811i;
                        }
                    }
                }
            }
            j3.f1730S = false;
            V.e z5 = j3.z();
            Object[] objArr = z5.f8759c;
            int i7 = z5.f8761f;
            for (int i8 = 0; i8 < i7; i8++) {
                l((J) objArr[i8]);
            }
        }
    }

    @Override // U0.c
    public int a(int i6) {
        CharSequence charSequence = (CharSequence) this.f3179e;
        do {
            i6 = ((U0.d) this.f3180f).i(i6);
            if (i6 == -1 || i6 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i6)));
        return i6;
    }

    @Override // U0.c
    public int b(int i6) {
        do {
            i6 = ((U0.d) this.f3180f).j(i6);
            if (i6 == -1 || i6 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f3179e).charAt(i6 - 1)));
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #6 {all -> 0x00b9, blocks: (B:61:0x00b8, B:62:0x00bb, B:63:0x00d3), top: B:59:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb A[Catch: all -> 0x00b9, TryCatch #6 {all -> 0x00b9, blocks: (B:61:0x00b8, B:62:0x00bb, B:63:0x00d3), top: B:59:0x00b6 }] */
    @Override // X1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X1.a c(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.q.c(java.lang.String):X1.a");
    }

    @Override // T.InterfaceC0604f
    public void cancel() {
        if (((C0868a) this.f3180f).compareAndSet(1, 1)) {
            return;
        }
        ((A.g) this.f3179e).b();
    }

    @Override // U0.c
    public int d(int i6) {
        do {
            i6 = ((U0.d) this.f3180f).j(i6);
            if (i6 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f3179e).charAt(i6)));
        return i6;
    }

    @Override // U.K
    public List e(Integer num) {
        List e6 = ((K) this.f3179e).e(null);
        M0 m02 = (M0) this.f3180f;
        int i6 = m02.f8006v;
        return i6 < 0 ? e6 : Y3.m.z0(AbstractC1410a.j(m02, num, i6, Integer.valueOf(m02.E(m02.f7986b, i6))), e6);
    }

    @Override // U0.c
    public int f(int i6) {
        do {
            i6 = ((U0.d) this.f3180f).i(i6);
            if (i6 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f3179e).charAt(i6 - 1)));
        return i6;
    }

    @Override // r.InterfaceC1616w0
    public Object g(C1604s0 c1604s0, C1589n0 c1589n0) {
        Object b5 = ((C0513s) this.f3180f).b(x0.f13824e, new A3.e(this, c1604s0, (InterfaceC0905c) null), c1589n0);
        return b5 == EnumC0927a.f11114c ? b5 : X3.y.a;
    }

    public X0.v h(List list) {
        X0.g gVar;
        Exception e6;
        X0.g gVar2;
        try {
            int size = list.size();
            int i6 = 0;
            gVar = null;
            while (i6 < size) {
                try {
                    gVar2 = (X0.g) list.get(i6);
                } catch (Exception e7) {
                    e6 = e7;
                }
                try {
                    gVar2.a((X0.h) this.f3180f);
                    i6++;
                    gVar = gVar2;
                } catch (Exception e8) {
                    e6 = e8;
                    gVar = gVar2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((X0.h) this.f3180f).a.b());
                    sb2.append(", composition=");
                    sb2.append(((X0.h) this.f3180f).c());
                    sb2.append(", selection=");
                    X0.h hVar = (X0.h) this.f3180f;
                    sb2.append((Object) O.h(S0.F.b(hVar.f9104b, hVar.f9105c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    Y3.m.u0(list, sb, SequenceUtils.EOL, new W0.e(3, gVar, this), 60);
                    String sb3 = sb.toString();
                    AbstractC1276k.e(sb3, "toString(...)");
                    throw new RuntimeException(sb3, e6);
                }
            }
            X0.h hVar2 = (X0.h) this.f3180f;
            hVar2.getClass();
            C0545g c0545g = new C0545g(hVar2.a.toString());
            X0.h hVar3 = (X0.h) this.f3180f;
            long b5 = S0.F.b(hVar3.f9104b, hVar3.f9105c);
            O o5 = O.g(((X0.v) this.f3179e).f9125b) ? null : new O(b5);
            X0.v vVar = new X0.v(c0545g, o5 != null ? o5.a : S0.F.b(O.e(b5), O.f(b5)), ((X0.h) this.f3180f).c());
            this.f3179e = vVar;
            return vVar;
        } catch (Exception e9) {
            gVar = null;
            e6 = e9;
        }
    }

    public boolean i() {
        synchronized (this) {
            if (((AtomicBoolean) this.f3180f).get()) {
                return false;
            }
            ((AtomicInteger) this.f3179e).incrementAndGet();
            return true;
        }
    }

    public Bundle j(String str) {
        AbstractC1276k.f(str, "key");
        W1.a aVar = (W1.a) this.f3179e;
        if (!aVar.f8856g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = aVar.f8855f;
        if (bundle == null) {
            return null;
        }
        Bundle t5 = bundle.containsKey(str) ? C.t(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            aVar.f8855f = null;
        }
        return t5;
    }

    @Override // B3.g
    public void k(String str) {
        A3.c cVar = (A3.c) this.f3179e;
        AbstractC1276k.f(str, "message");
        Method method = (Method) this.f3180f;
        if (method == null) {
            cVar.k(str);
            return;
        }
        try {
            method.invoke(null, "Ktor Client", str);
        } catch (Throwable unused) {
            cVar.k(str);
        }
    }

    public KSerializer m(InterfaceC1672b interfaceC1672b) {
        Object putIfAbsent;
        switch (this.f3178c) {
            case 12:
                Object m3 = n.m((C0269p) this.f3180f, AbstractC1117a.o(interfaceC1672b));
                AbstractC1276k.e(m3, "get(...)");
                T t5 = (T) m3;
                Object obj = t5.a.get();
                if (obj == null) {
                    synchronized (t5) {
                        obj = t5.a.get();
                        if (obj == null) {
                            obj = new C0263j((KSerializer) ((l4.c) this.f3179e).f(interfaceC1672b));
                            t5.a = new SoftReference(obj);
                        }
                    }
                }
                return ((C0263j) obj).a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3180f;
                Class o5 = AbstractC1117a.o(interfaceC1672b);
                Object obj2 = concurrentHashMap.get(o5);
                if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(o5, (obj2 = new C0263j((KSerializer) ((l4.c) this.f3179e).f(interfaceC1672b))))) != null) {
                    obj2 = putIfAbsent;
                }
                return ((C0263j) obj2).a;
        }
    }

    public Object n(InterfaceC1672b interfaceC1672b, ArrayList arrayList) {
        Object b5;
        Object b6;
        Object putIfAbsent;
        switch (this.f3178c) {
            case 13:
                Object m3 = n.m((C0269p) this.f3180f, AbstractC1117a.o(interfaceC1672b));
                AbstractC1276k.e(m3, "get(...)");
                T t5 = (T) m3;
                Object obj = t5.a.get();
                if (obj == null) {
                    synchronized (t5) {
                        obj = t5.a.get();
                        if (obj == null) {
                            obj = new Z();
                            t5.a = new SoftReference(obj);
                        }
                    }
                }
                Z z5 = (Z) obj;
                ArrayList arrayList2 = new ArrayList(Y3.n.Z(arrayList, 10));
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    arrayList2.add(new M4.K((s4.f) obj2));
                }
                ConcurrentHashMap concurrentHashMap = z5.a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        b5 = (KSerializer) ((l4.e) this.f3179e).m(interfaceC1672b, arrayList);
                    } catch (Throwable th) {
                        b5 = X3.a.b(th);
                    }
                    X3.l lVar = new X3.l(b5);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, lVar);
                    obj3 = putIfAbsent2 == null ? lVar : putIfAbsent2;
                }
                return ((X3.l) obj3).f9396c;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f3180f;
                Class o5 = AbstractC1117a.o(interfaceC1672b);
                Object obj4 = concurrentHashMap2.get(o5);
                if (obj4 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(o5, (obj4 = new Z()))) != null) {
                    obj4 = putIfAbsent;
                }
                Z z6 = (Z) obj4;
                ArrayList arrayList3 = new ArrayList(Y3.n.Z(arrayList, 10));
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj5 = arrayList.get(i7);
                    i7++;
                    arrayList3.add(new M4.K((s4.f) obj5));
                }
                ConcurrentHashMap concurrentHashMap3 = z6.a;
                Object obj6 = concurrentHashMap3.get(arrayList3);
                if (obj6 == null) {
                    try {
                        b6 = (KSerializer) ((l4.e) this.f3179e).m(interfaceC1672b, arrayList);
                    } catch (Throwable th2) {
                        b6 = X3.a.b(th2);
                    }
                    X3.l lVar2 = new X3.l(b6);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, lVar2);
                    obj6 = putIfAbsent3 == null ? lVar2 : putIfAbsent3;
                }
                return ((X3.l) obj6).f9396c;
        }
    }

        public InputMethodManager o() {
        return (InputMethodManager) this.f3180f.getValue();
    }

    public V p() {
        return (V) ((C0607g0) this.f3180f).getValue();
    }

    public U1.d q() {
        U1.d dVar;
        W1.a aVar = (W1.a) this.f3179e;
        synchronized (aVar.f8852c) {
            Iterator it = aVar.f8853d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                U1.d dVar2 = (U1.d) entry.getValue();
                if (AbstractC1276k.b(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public void r() {
        String str = (String) this.f3179e;
        if (((FileChannel) this.f3180f) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f3180f = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f3180f;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f3180f = null;
            throw new IllegalStateException(AbstractC1135a.s("Unable to lock file: '", str, "'."), th);
        }
    }

    public void s(Bundle bundle) {
        W1.a aVar = (W1.a) this.f3179e;
        U1.e eVar = aVar.a;
        if (!aVar.f8854e) {
            aVar.a();
        }
        if (eVar.g().g().compareTo(EnumC0842p.f10878g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.g().g()).toString());
        }
        if (aVar.f8856g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = C.t("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        aVar.f8855f = bundle2;
        aVar.f8856g = true;
    }

    public void t(Bundle bundle) {
        W1.a aVar = (W1.a) this.f3179e;
        Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
        Bundle bundle2 = aVar.f8855f;
        if (bundle2 != null) {
            d6.putAll(bundle2);
        }
        synchronized (aVar.f8852c) {
            for (Map.Entry entry : aVar.f8853d.entrySet()) {
                AbstractC1410a.F(d6, (String) entry.getKey(), ((U1.d) entry.getValue()).a());
            }
        }
        if (d6.isEmpty()) {
            return;
        }
        AbstractC1410a.F(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", d6);
    }

    public void u(String str, U1.d dVar) {
        AbstractC1276k.f(dVar, "provider");
        W1.a aVar = (W1.a) this.f3179e;
        synchronized (aVar.f8852c) {
            if (aVar.f8853d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            aVar.f8853d.put(str, dVar);
        }
    }

    public void v() {
        if (!((W1.a) this.f3179e).f8857h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        U1.a aVar = (U1.a) this.f3180f;
        if (aVar == null) {
            aVar = new U1.a(this);
        }
        this.f3180f = aVar;
        try {
            C0838l.class.getDeclaredConstructor(null);
            U1.a aVar2 = (U1.a) this.f3180f;
            if (aVar2 != null) {
                aVar2.a.add(C0838l.class.getName());
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + C0838l.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }

    public void w() {
        K.f fVar;
        if (((J.m) this.f3180f) == J.m.f2806c) {
            AbstractC1734b.c("ToolbarRequester is not initialized.");
        }
        J.l lVar = (J.l) this.f3179e;
        if (lVar == null || !lVar.f11819q) {
            return;
        }
        s0 s0Var = lVar.f2803x;
        if ((s0Var == null || !s0Var.d()) && (fVar = (K.f) AbstractC0157l.h(lVar, K.g.f2920b)) != null) {
            lVar.f2803x = AbstractC1888A.y(lVar.A0(), null, new J.k(lVar, fVar, null), 1);
        }
    }

    public void x() {
        synchronized (this) {
            ((AtomicInteger) this.f3179e).decrementAndGet();
            if (((AtomicInteger) this.f3179e).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void y(W w5) {
        Object g3 = ((M) this.f3180f).g(w5);
        if (g3 != null) {
            if (!(g3 instanceof I)) {
                throw new ClassCastException();
            }
            I i6 = (I) g3;
            Object[] objArr = i6.a;
            if (i6.f12466b <= 0) {
                return;
            }
            AbstractC1276k.d(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public /* synthetic */ q(int i6, boolean z5) {
        this.f3178c = i6;
    }

    public q(W1.a aVar, int i6) {
        this.f3178c = i6;
        switch (i6) {
            case 27:
                this.f3179e = aVar;
                this.f3180f = new q(aVar, 26);
                return;
            default:
                this.f3179e = aVar;
                return;
        }
    }

    public q(int i6) {
        this.f3178c = i6;
        switch (i6) {
            case AbstractC1787b.f15287d /* 9 */:
                this.f3179e = new V.e(new Reference[16]);
                this.f3180f = new ReferenceQueue();
                return;
            case AbstractC1787b.f15289f /* 10 */:
                this.f3180f = J.m.f2806c;
                return;
            case 19:
                this.f3179e = new LinkedHashMap();
                this.f3180f = new LinkedHashMap();
                return;
            case 22:
                this.f3179e = new M();
                this.f3180f = new M();
                return;
            case 28:
                this.f3179e = new F2.h(28);
                this.f3180f = new C1175w(16);
                return;
            default:
                this.f3179e = new V.e(new J[16]);
                return;
        }
    }

    public q(J j3, V v5) {
        this.f3178c = 6;
        this.f3179e = j3;
        this.f3180f = T.r.A(v5);
    }

    public q(String str) {
        this.f3178c = 18;
        this.f3179e = str.concat(".lck");
    }

    public q(I.o oVar) {
        this.f3178c = 17;
        this.f3179e = new AtomicInteger(0);
        this.f3180f = new AtomicBoolean(false);
    }

    public q(A.g gVar) {
        this.f3178c = 23;
        this.f3179e = gVar;
        this.f3180f = new AtomicInteger(0);
    }

    public q(Class cls, A3.c cVar) {
        Method method;
        this.f3178c = 3;
        this.f3179e = cVar;
        try {
            method = cls.getDeclaredMethod(FlexmarkHtmlConverter.I_NODE, String.class, String.class);
        } catch (Throwable unused) {
            method = null;
        }
        this.f3180f = method;
    }

    public q(l4.c cVar, int i6) {
        this.f3178c = i6;
        switch (i6) {
            case 14:
                this.f3179e = cVar;
                this.f3180f = new ConcurrentHashMap();
                return;
            default:
                this.f3179e = cVar;
                this.f3180f = new C0269p();
                return;
        }
    }

    public q(N1.r rVar, X1.b bVar) {
        this.f3178c = 16;
        AbstractC1276k.f(bVar, "actual");
        this.f3180f = rVar;
        this.f3179e = bVar;
    }

    public q(View view) {
        this.f3178c = 0;
        this.f3179e = view;
        this.f3180f = X3.a.c(X3.g.f9391e, new A.b(this, 16));
    }

    public q(int i6, l4.e eVar) {
        this.f3178c = i6;
        switch (i6) {
            case 15:
                this.f3179e = eVar;
                this.f3180f = new ConcurrentHashMap();
                return;
            default:
                this.f3179e = eVar;
                this.f3180f = new C0269p();
                return;
        }
    }

    public q(C2057h c2057h, AbstractC2051b abstractC2051b) {
        this.f3178c = 5;
        C2053d c2053d = C2053d.f16334l;
        C2054e c2054e = C2054e.f16335l;
        this.f3179e = c2057h;
        this.f3180f = abstractC2051b;
    }

    public q(C0513s c0513s) {
        this.f3178c = 20;
        this.f3180f = c0513s;
        this.f3179e = new B2(c0513s, 1);
    }
}
