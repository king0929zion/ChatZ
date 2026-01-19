package L1;

import android.content.Context;
import i4.AbstractC1117a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y1.ThreadFactoryC1987a;

/* loaded from: classes.dex */
public final class e implements y1.i {
    public final Context a;

    public /* synthetic */ e(Context context, boolean z5) {
        this.a = context;
    }

    @Override // y1.i
    public void a(AbstractC1117a abstractC1117a) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1987a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new I.g(this, abstractC1117a, threadPoolExecutor, 2));
    }

    public e(Context context) {
        this.a = context.getApplicationContext();
    }
}
