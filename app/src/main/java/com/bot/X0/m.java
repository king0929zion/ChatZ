package X0;

import B0.G;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class m implements InputConnection {
    public final G a;

    /* renamed from: b, reason: collision with root package name */
    public M.z f9114b;

    public m(M.z zVar, G g3) {
        this.a = g3;
        this.f9114b = zVar;
    }

    public final void a(M.z zVar) {
        zVar.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.clearMetaKeyStates(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            if (zVar != null) {
                a(zVar);
                this.f9114b = null;
            }
            this.a.f(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i6, Bundle bundle) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.commitContent(inputContentInfo, i6, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.commitText(charSequence, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i7) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.deleteSurroundingText(i6, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i7) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.deleteSurroundingTextInCodePoints(i6, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.getCursorCapsMode(i6);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.getExtractedText(extractedTextRequest, i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.getSelectedText(i6);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i6, int i7) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.getTextAfterCursor(i6, i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i6, int i7) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.getTextBeforeCursor(i6, i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.performContextMenuAction(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.performEditorAction(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z5) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.requestCursorUpdates(i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i6, int i7) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.setComposingRegion(i6, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i6) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.setComposingText(charSequence, i6);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i6, int i7) {
        M.z zVar = this.f9114b;
        if (zVar != null) {
            return zVar.setSelection(i6, i7);
        }
        return false;
    }
}
