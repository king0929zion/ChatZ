package M;

import D.C0098v0;
import D.EnumC0075j0;
import D.d1;
import I0.X0;
import O.N0;
import S0.C0545g;
import S0.K;
import S0.O;
import X0.C0683a;
import Y3.C;
import android.R;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m4.AbstractC1276k;
import n0.C1354c;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class z implements InputConnection {
    public final A3.c a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3219b;

    /* renamed from: c, reason: collision with root package name */
    public final C0098v0 f3220c;

    /* renamed from: d, reason: collision with root package name */
    public final N0 f3221d;

    /* renamed from: e, reason: collision with root package name */
    public final X0 f3222e;

    /* renamed from: f, reason: collision with root package name */
    public int f3223f;

    /* renamed from: g, reason: collision with root package name */
    public X0.v f3224g;

    /* renamed from: h, reason: collision with root package name */
    public int f3225h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3226i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f3227j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f3228k = true;

    public z(X0.v vVar, A3.c cVar, boolean z5, C0098v0 c0098v0, N0 n02, X0 x02) {
        this.a = cVar;
        this.f3219b = z5;
        this.f3220c = c0098v0;
        this.f3221d = n02;
        this.f3222e = x02;
        this.f3224g = vVar;
    }

    public final void a(X0.g gVar) {
        this.f3223f++;
        try {
            this.f3227j.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i6 = this.f3223f - 1;
        this.f3223f = i6;
        if (i6 == 0) {
            ArrayList arrayList = this.f3227j;
            if (!arrayList.isEmpty()) {
                ((y) this.a.f119e).f3208c.f(Y3.m.K0(arrayList));
                arrayList.clear();
            }
        }
        return this.f3223f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f3228k;
        if (!z5) {
            return z5;
        }
        this.f3223f++;
        return true;
    }

    public final void c(int i6) {
        sendKeyEvent(new KeyEvent(0, i6));
        sendKeyEvent(new KeyEvent(1, i6));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i6) {
        boolean z5 = this.f3228k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f3227j.clear();
        this.f3223f = 0;
        this.f3228k = false;
        ArrayList arrayList = ((y) this.a.f119e).f3215j;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (AbstractC1276k.b(((WeakReference) arrayList.get(i6)).get(), this)) {
                arrayList.remove(i6);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z5 = this.f3228k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i6, Bundle bundle) {
        boolean z5 = this.f3228k;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f3228k;
        return z5 ? this.f3219b : z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i6) {
        boolean z5 = this.f3228k;
        if (z5) {
            a(new C0683a(String.valueOf(charSequence), i6));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i7) {
        boolean z5 = this.f3228k;
        if (!z5) {
            return z5;
        }
        a(new X0.e(i6, i7));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i7) {
        boolean z5 = this.f3228k;
        if (!z5) {
            return z5;
        }
        a(new X0.f(i6, i7));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X0.g, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z5 = this.f3228k;
        if (!z5) {
            return z5;
        }
        a(new Object());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i6) {
        X0.v vVar = this.f3224g;
        return TextUtils.getCapsMode(vVar.a.f7630e, O.f(vVar.f9125b), i6);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i6) {
        boolean z5 = (i6 & 1) != 0;
        this.f3226i = z5;
        if (z5) {
            this.f3225h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return u.d(this.f3224g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i6) {
        if (O.c(this.f3224g.f9125b)) {
            return null;
        }
        return C.v(this.f3224g).f7630e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i6, int i7) {
        return C.w(this.f3224g, i6).f7630e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i6, int i7) {
        return C.x(this.f3224g, i6).f7630e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i6) {
        boolean z5 = this.f3228k;
        if (z5) {
            z5 = false;
            switch (i6) {
                case R.id.selectAll:
                    a(new X0.u(0, this.f3224g.a.f7630e.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i6) {
        int i7;
        boolean z5 = this.f3228k;
        if (z5) {
            z5 = true;
            if (i6 != 0) {
                switch (i6) {
                    case 2:
                        i7 = 2;
                        break;
                    case 3:
                        i7 = 3;
                        break;
                    case 4:
                        i7 = 4;
                        break;
                    case AbstractC1787b.f15290g /* 5 */:
                        i7 = 6;
                        break;
                    case 6:
                        i7 = 7;
                        break;
                    case 7:
                        i7 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i6);
                        break;
                }
                ((y) this.a.f119e).f3209d.f(new X0.j(i7));
            }
            i7 = 1;
            ((y) this.a.f119e).f3209d.f(new X0.j(i7));
        }
        return z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d8  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r20, java.util.concurrent.Executor r21, final java.util.function.IntConsumer r22) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M.z.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f3228k;
        if (z5) {
            return true;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C0098v0 c0098v0;
        C0545g c0545g;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        RectF deletionArea;
        int granularity3;
        RectF selectionArea;
        int granularity4;
        K k3;
        if (Build.VERSION.SDK_INT >= 34 && (c0098v0 = this.f3220c) != null && (c0545g = c0098v0.f1191j) != null) {
            d1 d6 = c0098v0.d();
            if (c0545g.equals((d6 == null || (k3 = d6.a.a) == null) ? null : k3.a)) {
                boolean s5 = I.t.s(previewableHandwritingGesture);
                EnumC0075j0 enumC0075j0 = EnumC0075j0.f1042c;
                N0 n02 = this.f3221d;
                if (s5) {
                    SelectGesture m3 = I.t.m(previewableHandwritingGesture);
                    if (n02 != null) {
                        selectionArea = m3.getSelectionArea();
                        C1354c E5 = o0.y.E(selectionArea);
                        granularity4 = m3.getGranularity();
                        long i6 = u.i(c0098v0, E5, granularity4 != 1 ? 0 : 1);
                        C0098v0 c0098v02 = n02.f3995d;
                        if (c0098v02 != null) {
                            c0098v02.f(i6);
                        }
                        C0098v0 c0098v03 = n02.f3995d;
                        if (c0098v03 != null) {
                            c0098v03.e(O.f7610b);
                        }
                        if (!O.c(i6)) {
                            n02.t(false);
                            n02.q(enumC0075j0);
                        }
                    }
                } else if (n.q(previewableHandwritingGesture)) {
                    DeleteGesture i7 = n.i(previewableHandwritingGesture);
                    if (n02 != null) {
                        deletionArea = i7.getDeletionArea();
                        C1354c E6 = o0.y.E(deletionArea);
                        granularity3 = i7.getGranularity();
                        long i8 = u.i(c0098v0, E6, granularity3 != 1 ? 0 : 1);
                        C0098v0 c0098v04 = n02.f3995d;
                        if (c0098v04 != null) {
                            c0098v04.e(i8);
                        }
                        C0098v0 c0098v05 = n02.f3995d;
                        if (c0098v05 != null) {
                            c0098v05.f(O.f7610b);
                        }
                        if (!O.c(i8)) {
                            n02.t(false);
                            n02.q(enumC0075j0);
                        }
                    }
                } else if (n.v(previewableHandwritingGesture)) {
                    SelectRangeGesture l3 = n.l(previewableHandwritingGesture);
                    if (n02 != null) {
                        selectionStartArea = l3.getSelectionStartArea();
                        C1354c E7 = o0.y.E(selectionStartArea);
                        selectionEndArea = l3.getSelectionEndArea();
                        C1354c E8 = o0.y.E(selectionEndArea);
                        granularity2 = l3.getGranularity();
                        long b5 = u.b(c0098v0, E7, E8, granularity2 != 1 ? 0 : 1);
                        C0098v0 c0098v06 = n02.f3995d;
                        if (c0098v06 != null) {
                            c0098v06.f(b5);
                        }
                        C0098v0 c0098v07 = n02.f3995d;
                        if (c0098v07 != null) {
                            c0098v07.e(O.f7610b);
                        }
                        if (!O.c(b5)) {
                            n02.t(false);
                            n02.q(enumC0075j0);
                        }
                    }
                } else if (n.w(previewableHandwritingGesture)) {
                    DeleteRangeGesture j3 = n.j(previewableHandwritingGesture);
                    if (n02 != null) {
                        deletionStartArea = j3.getDeletionStartArea();
                        C1354c E9 = o0.y.E(deletionStartArea);
                        deletionEndArea = j3.getDeletionEndArea();
                        C1354c E10 = o0.y.E(deletionEndArea);
                        granularity = j3.getGranularity();
                        long b6 = u.b(c0098v0, E9, E10, granularity != 1 ? 0 : 1);
                        C0098v0 c0098v08 = n02.f3995d;
                        if (c0098v08 != null) {
                            c0098v08.e(b6);
                        }
                        C0098v0 c0098v09 = n02.f3995d;
                        if (c0098v09 != null) {
                            c0098v09.f(O.f7610b);
                        }
                        if (!O.c(b6)) {
                            n02.t(false);
                            n02.q(enumC0075j0);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new o(n02, 0));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z5) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f3228k
            if (r0 == 0) goto L77
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            A3.c r4 = r9.a
            java.lang.Object r4 = r4.f119e
            M.y r4 = (M.y) r4
            M.v r4 = r4.f3218m
            java.lang.Object r7 = r4.f3191c
            monitor-enter(r7)
            r4.f3194f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f3195g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f3196h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f3197i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f3193e = r2     // Catch: java.lang.Throwable -> L6f
            X0.v r10 = r4.f3198j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f3192d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M.z.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X3.f] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f3228k;
        if (!z5) {
            return z5;
        }
        ((BaseInputConnection) ((y) this.a.f119e).f3216k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i6, int i7) {
        boolean z5 = this.f3228k;
        if (z5) {
            a(new X0.s(i6, i7));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i6) {
        boolean z5 = this.f3228k;
        if (z5) {
            a(new X0.t(String.valueOf(charSequence), i6));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i6, int i7) {
        boolean z5 = this.f3228k;
        if (!z5) {
            return z5;
        }
        a(new X0.u(i6, i7));
        return true;
    }
}
