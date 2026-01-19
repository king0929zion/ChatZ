package v;

import T.C0616l;
import T.C0626q;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC0961c;
import h0.C1026c;
import h0.C1033j;
import h0.InterfaceC1041r;
import java.util.WeakHashMap;

/* renamed from: v.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1810p implements InterfaceC1809o, InterfaceC1793e {

    /* renamed from: b, reason: collision with root package name */
    public static final C1810p f15333b = new C1810p(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1810p f15334c = new C1810p(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C1810p(int i6) {
        this.a = i6;
    }

    public static final C1785a b(int i6, String str) {
        WeakHashMap weakHashMap = G0.f15220w;
        return new C1785a(i6, str);
    }

    public static final C0 d(int i6, String str) {
        WeakHashMap weakHashMap = G0.f15220w;
        return new C0(new S(0, 0, 0, 0), str);
    }

    public static G0 f(C0626q c0626q) {
        View view = (View) c0626q.j(AndroidCompositionLocals_androidKt.f10784f);
        G0 g3 = g(view);
        boolean h3 = c0626q.h(g3) | c0626q.h(view);
        Object P5 = c0626q.P();
        if (h3 || P5 == C0616l.a) {
            P5 = new Z2.X(21, g3, view);
            c0626q.m0(P5);
        }
        T.r.d(g3, (l4.c) P5, c0626q);
        return g3;
    }

    public static G0 g(View view) {
        G0 g02;
        WeakHashMap weakHashMap = G0.f15220w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new G0(view);
                    weakHashMap.put(view, obj);
                }
                g02 = (G0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g02;
    }

    @Override // v.InterfaceC1793e
    public void c(InterfaceC0961c interfaceC0961c, int i6, int[] iArr, e1.m mVar, int[] iArr2) {
        switch (this.a) {
            case 2:
                AbstractC1799h.b(iArr, iArr2, false);
                return;
            case 3:
                AbstractC1799h.c(i6, iArr, iArr2, false);
                return;
            case 4:
                if (mVar == e1.m.f11576c) {
                    AbstractC1799h.c(i6, iArr, iArr2, false);
                    return;
                } else {
                    AbstractC1799h.b(iArr, iArr2, true);
                    return;
                }
            default:
                if (mVar == e1.m.f11576c) {
                    AbstractC1799h.b(iArr, iArr2, false);
                    return;
                } else {
                    AbstractC1799h.c(i6, iArr, iArr2, true);
                    return;
                }
        }
    }

    public InterfaceC1041r e(InterfaceC1041r interfaceC1041r, C1033j c1033j) {
        return interfaceC1041r.c(new C1801i(c1033j, false));
    }

    public InterfaceC1041r h() {
        return new C1801i(C1026c.f11790h, true);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "AbsoluteArrangement#Left";
            case 3:
                return "AbsoluteArrangement#Right";
            case 4:
                return "Arrangement#End";
            case AbstractC1787b.f15290g /* 5 */:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
