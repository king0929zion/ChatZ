package S2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.tencent.mmkv.R;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: S2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0585q implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7852c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f7853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7854f;

    public /* synthetic */ C0585q(Context context, String str, int i6) {
        this.f7852c = i6;
        this.f7853e = context;
        this.f7854f = str;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f7852c) {
            case 0:
                Context context = this.f7853e;
                Object systemService = context.getSystemService("clipboard");
                AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(context.getString(R.string.clipboard_label_code), this.f7854f));
                Toast.makeText(context, context.getString(R.string.markdown_code_copied), 0).show();
                break;
            case 1:
                Context context2 = this.f7853e;
                Object systemService2 = context2.getSystemService("clipboard");
                AbstractC1276k.d(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(context2.getString(R.string.clipboard_label_code), this.f7854f));
                break;
            case 2:
                Context context3 = this.f7853e;
                Object systemService3 = context3.getSystemService("clipboard");
                AbstractC1276k.d(systemService3, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService3).setPrimaryClip(ClipData.newPlainText(context3.getString(R.string.clipboard_label_inline_formula), this.f7854f));
                Toast.makeText(context3, context3.getString(R.string.markdown_inline_formula_copied), 0).show();
                break;
            case 3:
                Context context4 = this.f7853e;
                Object systemService4 = context4.getSystemService("clipboard");
                AbstractC1276k.d(systemService4, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService4).setPrimaryClip(ClipData.newPlainText(context4.getString(R.string.clipboard_label_image_link), this.f7854f));
                Toast.makeText(context4, context4.getString(R.string.markdown_image_link_copied), 0).show();
                break;
            default:
                Context context5 = this.f7853e;
                Object systemService5 = context5.getSystemService("clipboard");
                AbstractC1276k.d(systemService5, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService5).setPrimaryClip(ClipData.newPlainText(context5.getString(R.string.clipboard_label_image_caption), this.f7854f));
                Toast.makeText(context5, context5.getString(R.string.markdown_image_caption_copied), 0).show();
                break;
        }
        return X3.y.a;
    }
}
