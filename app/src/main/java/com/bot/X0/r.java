package X0;

import S0.O;
import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class r implements InputConnection {
    public final A3.c a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9115b;

    /* renamed from: c, reason: collision with root package name */
    public int f9116c;

    /* renamed from: d, reason: collision with root package name */
    public v f9117d;

    /* renamed from: e, reason: collision with root package name */
    public int f9118e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9119f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9120g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f9121h = true;

    public r(v vVar, A3.c cVar, boolean z5) {
        this.a = cVar;
        this.f9115b = z5;
        this.f9117d = vVar;
    }

    public final void a(g gVar) {
        this.f9116c++;
        try {
            this.f9120g.add(gVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i6 = this.f9116c - 1;
        this.f9116c = i6;
        if (i6 == 0) {
            ArrayList arrayList = this.f9120g;
            if (!arrayList.isEmpty()) {
                ((y) this.a.f119e).f9136e.f(Y3.m.K0(arrayList));
                arrayList.clear();
            }
        }
        return this.f9116c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z5 = this.f9121h;
        if (!z5) {
            return z5;
        }
        this.f9116c++;
        return true;
    }

    public final void c(int i6) {
        sendKeyEvent(new KeyEvent(0, i6));
        sendKeyEvent(new KeyEvent(1, i6));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i6) {
        boolean z5 = this.f9121h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f9120g.clear();
        this.f9116c = 0;
        this.f9121h = false;
        ArrayList arrayList = ((y) this.a.f119e).f9140i;
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
        boolean z5 = this.f9121h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i6, Bundle bundle) {
        boolean z5 = this.f9121h;
        if (z5) {
            return false;
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z5 = this.f9121h;
        return z5 ? this.f9115b : z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i6) {
        boolean z5 = this.f9121h;
        if (z5) {
            a(new C0683a(String.valueOf(charSequence), i6));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i7) {
        boolean z5 = this.f9121h;
        if (!z5) {
            return z5;
        }
        a(new e(i6, i7));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i7) {
        boolean z5 = this.f9121h;
        if (!z5) {
            return z5;
        }
        a(new f(i6, i7));
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
        boolean z5 = this.f9121h;
        if (!z5) {
            return z5;
        }
        a(new Object());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i6) {
        v vVar = this.f9117d;
        return TextUtils.getCapsMode(vVar.a.f7630e, O.f(vVar.f9125b), i6);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i6) {
        boolean z5 = (i6 & 1) != 0;
        this.f9119f = z5;
        if (z5) {
            this.f9118e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return Y4.d.X(this.f9117d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i6) {
        if (O.c(this.f9117d.f9125b)) {
            return null;
        }
        return Y3.C.v(this.f9117d).f7630e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i6, int i7) {
        return Y3.C.w(this.f9117d, i6).f7630e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i6, int i7) {
        return Y3.C.x(this.f9117d, i6).f7630e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i6) {
        boolean z5 = this.f9121h;
        if (z5) {
            z5 = false;
            switch (i6) {
                case R.id.selectAll:
                    a(new u(0, this.f9117d.a.f7630e.length()));
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
        boolean z5 = this.f9121h;
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
                ((y) this.a.f119e).f9137f.f(new j(i7));
            }
            i7 = 1;
            ((y) this.a.f119e).f9137f.f(new j(i7));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z5 = this.f9121h;
        if (z5) {
            return true;
        }
        return z5;
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
            boolean r0 = r9.f9121h
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
            X0.y r4 = (X0.y) r4
            X0.c r4 = r4.f9143l
            java.lang.Object r7 = r4.f9086c
            monitor-enter(r7)
            r4.f9089f = r5     // Catch: java.lang.Throwable -> L6f
            r4.f9090g = r6     // Catch: java.lang.Throwable -> L6f
            r4.f9091h = r1     // Catch: java.lang.Throwable -> L6f
            r4.f9092i = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.f9088e = r2     // Catch: java.lang.Throwable -> L6f
            X0.v r10 = r4.f9093j     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.a()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L75
        L71:
            r4.f9087d = r3     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L75:
            monitor-exit(r7)
            throw r10
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X0.r.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X3.f] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f9121h;
        if (!z5) {
            return z5;
        }
        ((BaseInputConnection) ((y) this.a.f119e).f9141j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i6, int i7) {
        boolean z5 = this.f9121h;
        if (z5) {
            a(new s(i6, i7));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i6) {
        boolean z5 = this.f9121h;
        if (z5) {
            a(new t(String.valueOf(charSequence), i6));
        }
        return z5;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i6, int i7) {
        boolean z5 = this.f9121h;
        if (!z5) {
            return z5;
        }
        a(new u(i6, i7));
        return true;
    }
}
