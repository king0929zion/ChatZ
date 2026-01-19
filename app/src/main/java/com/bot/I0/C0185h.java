package I0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

/* renamed from: I0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185h implements InterfaceC0194l0 {
    public final C0187i a;

    public C0185h(C0187i c0187i) {
        this.a = c0187i;
    }

    public final void a(C0192k0 c0192k0) {
        ClipboardManager clipboardManager = this.a.a;
        if (c0192k0 != null) {
            clipboardManager.setPrimaryClip(c0192k0.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(FlexmarkHtmlConverter.DEFAULT_NODE, FlexmarkHtmlConverter.DEFAULT_NODE));
        }
    }
}
