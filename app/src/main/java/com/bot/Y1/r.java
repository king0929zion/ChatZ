package y1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.lifecycle.N;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements i {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.c f15994b;

    /* renamed from: c, reason: collision with root package name */
    public final N f15995c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15996d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Handler f15997e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f15998f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f15999g;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC1117a f16000h;

    public r(Context context, r1.c cVar) {
        AbstractC1120d.f(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.f15994b = cVar;
        this.f15995c = s.f16001d;
    }

    @Override // y1.i
    public final void a(AbstractC1117a abstractC1117a) {
        synchronized (this.f15996d) {
            this.f16000h = abstractC1117a;
        }
        synchronized (this.f15996d) {
            try {
                if (this.f16000h == null) {
                    return;
                }
                if (this.f15998f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1987a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f15999g = threadPoolExecutor;
                    this.f15998f = threadPoolExecutor;
                }
                this.f15998f.execute(new I.h(this, 12));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f15996d) {
            try {
                this.f16000h = null;
                Handler handler = this.f15997e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f15997e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f15999g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f15998f = null;
                this.f15999g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final r1.d c() {
        try {
            N n3 = this.f15995c;
            Context context = this.a;
            r1.c cVar = this.f15994b;
            n3.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0.c a = r1.b.a(context, Collections.unmodifiableList(arrayList));
            int i6 = a.f648b;
            if (i6 != 0) {
                throw new RuntimeException(B3.e.l("fetchFonts failed (", i6, ")"));
            }
            r1.d[] dVarArr = (r1.d[]) ((List) a.f649c).get(0);
            if (dVarArr == null || dVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return dVarArr[0];
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }
}
