package b;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bot.MainActivity;
import com.vladsch.flexmark.parser.PegdownExtensions;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class o {
    static {
        Color.argb(230, 255, 255, 255);
        Color.argb(PegdownExtensions.FENCED_CODE_BLOCKS, 27, 27, 27);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [m4.l, l4.c] */
    /* JADX WARN: Type inference failed for: r0v5, types: [m4.l, l4.c] */
    /* JADX WARN: Type inference failed for: r1v5, types: [b.p] */
    public static final void a(MainActivity mainActivity, C0856E c0856e, C0856E c0856e2) {
        View decorView = mainActivity.getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        ?? r02 = c0856e.f10910d;
        Resources resources = decorView.getResources();
        AbstractC1276k.e(resources, "view.resources");
        boolean booleanValue = ((Boolean) r02.f(resources)).booleanValue();
        ?? r03 = c0856e2.f10910d;
        Resources resources2 = decorView.getResources();
        AbstractC1276k.e(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) r03.f(resources2)).booleanValue();
        int i6 = Build.VERSION.SDK_INT;
        ?? obj = i6 >= 30 ? new Object() : i6 >= 29 ? new Object() : i6 >= 28 ? new Object() : new Object();
        Window window = mainActivity.getWindow();
        AbstractC1276k.e(window, "window");
        obj.b(c0856e, c0856e2, window, decorView, booleanValue, booleanValue2);
        Window window2 = mainActivity.getWindow();
        AbstractC1276k.e(window2, "window");
        obj.a(window2);
    }
}
