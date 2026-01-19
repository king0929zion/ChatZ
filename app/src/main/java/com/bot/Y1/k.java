package y1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.InterfaceC0832f;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;

/* loaded from: classes.dex */
public final class k implements InterfaceC0832f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f15983c;

    public k(EmojiCompatInitializer emojiCompatInitializer, O o5) {
        this.f15983c = o5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.lifecycle.InterfaceC0832f
    public final void c(InterfaceC0846u interfaceC0846u) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC1988b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Object(), 500L);
        this.f15983c.j(this);
    }
}
