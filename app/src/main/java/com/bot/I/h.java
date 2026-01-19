package I;

import B0.H;
import H0.C0158m;
import I0.D;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import X0.y;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.B;
import androidx.lifecycle.C0848w;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.N;
import b.ViewTreeObserverOnDrawListenerC0866j;
import com.bot.MainActivity;
import com.vladsch.flexmark.html2md.converter.HtmlNodeConverterContext;
import com.vladsch.flexmark.util.html.HtmlAppendableBase;
import f0.C0987j;
import i1.AbstractC1087g;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import java.nio.MappedByteBuffer;
import k.C1147A;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import q1.AbstractC1500a;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2084c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2085e;

    public /* synthetic */ h(Object obj, int i6) {
        this.f2084c = i6;
        this.f2085e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, X3.f] */
    @Override // java.lang.Runnable
    public final void run() {
        View findFocus;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x;
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x2;
        int i6 = 0;
        switch (this.f2084c) {
            case 0:
                ActionMode actionMode = ((i) this.f2085e).f2092h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 1:
                D d6 = (D) this.f2085e;
                Trace.beginSection("measureAndLayout");
                try {
                    d6.f2156g.w(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        d6.g();
                        Trace.endSection();
                        d6.f2151M = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                P.e.a((P.e) this.f2085e);
                return;
            case 3:
                y yVar = (y) this.f2085e;
                C0158m c0158m = yVar.f9133b;
                yVar.f9145n = null;
                V.e eVar = yVar.f9144m;
                View view = yVar.a;
                if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    eVar.g();
                    return;
                }
                Object[] objArr = eVar.f8759c;
                int i7 = eVar.f8761f;
                Boolean bool = null;
                Boolean bool2 = null;
                for (int i8 = 0; i8 < i7; i8++) {
                    X0.x xVar = (X0.x) objArr[i8];
                    int ordinal = xVar.ordinal();
                    if (ordinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (ordinal == 1) {
                        bool = Boolean.FALSE;
                    } else {
                        if (ordinal != 2 && ordinal != 3) {
                            throw new RuntimeException();
                        }
                        if (!AbstractC1276k.b(bool, Boolean.FALSE)) {
                            bool2 = Boolean.valueOf(xVar == X0.x.f9130f);
                        }
                    }
                    bool2 = bool;
                }
                eVar.g();
                if (AbstractC1276k.b(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c0158m.f1973f.getValue()).restartInput((View) c0158m.f1972e);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((C0987j) ((C0987j) c0158m.f1974g).f11690e).F();
                    } else {
                        ((C0987j) ((C0987j) c0158m.f1974g).f11690e).x();
                    }
                }
                if (AbstractC1276k.b(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c0158m.f1973f.getValue()).restartInput((View) c0158m.f1972e);
                    return;
                }
                return;
            case 4:
                B b5 = (B) this.f2085e;
                C0848w c0848w = b5.f10812i;
                if (b5.f10808e == 0) {
                    b5.f10809f = true;
                    c0848w.n(EnumC0841o.ON_PAUSE);
                }
                if (b5.f10807c == 0 && b5.f10809f) {
                    c0848w.n(EnumC0841o.ON_STOP);
                    b5.f10810g = true;
                    return;
                }
                return;
            case AbstractC1787b.f15290g /* 5 */:
                ViewTreeObserverOnDrawListenerC0866j viewTreeObserverOnDrawListenerC0866j = (ViewTreeObserverOnDrawListenerC0866j) this.f2085e;
                Runnable runnable = viewTreeObserverOnDrawListenerC0866j.f10919e;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0866j.f10919e = null;
                    return;
                }
                return;
            case 6:
                try {
                    b.m.h((MainActivity) this.f2085e);
                    return;
                } catch (IllegalStateException e6) {
                    if (!AbstractC1276k.b(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e7) {
                    if (!AbstractC1276k.b(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e7;
                    }
                    return;
                }
            case 7:
                b.n.b((b.n) this.f2085e);
                return;
            case 8:
                ((HtmlNodeConverterContext) this.f2085e).transferIdToParent();
                return;
            case AbstractC1787b.f15287d /* 9 */:
                HtmlAppendableBase.a((boolean[]) this.f2085e);
                return;
            case AbstractC1787b.f15289f /* 10 */:
                j0.d dVar = (j0.d) this.f2085e;
                boolean g3 = dVar.g();
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x3 = dVar.f12323c;
                if (g3) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC0216x3.w(true);
                        C1147A c1147a = dVar.f12334o;
                        int[] iArr = c1147a.f12558b;
                        long[] jArr = c1147a.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i9 = 0;
                            while (true) {
                                long j3 = jArr[i9];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    int i11 = i6;
                                    while (i11 < i10) {
                                        if ((255 & j3) < 128) {
                                            int i12 = iArr[(i9 << 3) + i11];
                                            if (!dVar.e().a(i12)) {
                                                viewTreeObserverOnGlobalLayoutListenerC0216x2 = viewTreeObserverOnGlobalLayoutListenerC0216x3;
                                                dVar.f12326g.add(new j0.e(i12, dVar.f12333n, j0.f.f12342e, null));
                                                dVar.f12330k.t(X3.y.a);
                                                j3 >>= 8;
                                                i11++;
                                                viewTreeObserverOnGlobalLayoutListenerC0216x3 = viewTreeObserverOnGlobalLayoutListenerC0216x2;
                                            }
                                        }
                                        viewTreeObserverOnGlobalLayoutListenerC0216x2 = viewTreeObserverOnGlobalLayoutListenerC0216x3;
                                        j3 >>= 8;
                                        i11++;
                                        viewTreeObserverOnGlobalLayoutListenerC0216x3 = viewTreeObserverOnGlobalLayoutListenerC0216x2;
                                    }
                                    viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x3;
                                    if (i10 == 8) {
                                    }
                                } else {
                                    viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x3;
                                }
                                if (i9 != length) {
                                    i9++;
                                    viewTreeObserverOnGlobalLayoutListenerC0216x3 = viewTreeObserverOnGlobalLayoutListenerC0216x;
                                    i6 = 0;
                                }
                            }
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC0216x = viewTreeObserverOnGlobalLayoutListenerC0216x3;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        dVar.k(viewTreeObserverOnGlobalLayoutListenerC0216x.getSemanticsOwner().a(), dVar.f12335p);
                        Trace.endSection();
                        dVar.b(dVar.e());
                        dVar.o();
                        dVar.f12336q = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 11:
                View view2 = (View) this.f2085e;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
            default:
                y1.r rVar = (y1.r) this.f2085e;
                synchronized (rVar.f15996d) {
                    try {
                        if (rVar.f16000h == null) {
                            return;
                        }
                        try {
                            r1.d c6 = rVar.c();
                            int i13 = c6.f14652e;
                            if (i13 == 2) {
                                synchronized (rVar.f15996d) {
                                }
                            }
                            if (i13 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i13 + ")");
                            }
                            try {
                                int i14 = AbstractC1500a.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                N n3 = rVar.f15995c;
                                Context context = rVar.a;
                                n3.getClass();
                                r1.d[] dVarArr = {c6};
                                io.ktor.utils.io.u uVar = o1.e.a;
                                AbstractC1410a.g("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface g6 = o1.e.a.g(context, dVarArr);
                                    Trace.endSection();
                                    MappedByteBuffer n5 = AbstractC1087g.n(rVar.a, c6.a);
                                    if (n5 == null || g6 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        H h3 = new H(g6, AbstractC1120d.t(n5));
                                        Trace.endSection();
                                        synchronized (rVar.f15996d) {
                                            try {
                                                AbstractC1117a abstractC1117a = rVar.f16000h;
                                                if (abstractC1117a != null) {
                                                    abstractC1117a.s(h3);
                                                }
                                            } finally {
                                            }
                                        }
                                        rVar.b();
                                        return;
                                    } finally {
                                        int i15 = AbstractC1500a.a;
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (Throwable th2) {
                            synchronized (rVar.f15996d) {
                                try {
                                    AbstractC1117a abstractC1117a2 = rVar.f16000h;
                                    if (abstractC1117a2 != null) {
                                        abstractC1117a2.r(th2);
                                    }
                                    rVar.b();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
        }
    }
}
