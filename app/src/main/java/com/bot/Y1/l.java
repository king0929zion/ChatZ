package y1;

import B0.H;
import i4.AbstractC1117a;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class l extends AbstractC1117a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1117a f15984c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f15985d;

    public l(AbstractC1117a abstractC1117a, ThreadPoolExecutor threadPoolExecutor) {
        this.f15984c = abstractC1117a;
        this.f15985d = threadPoolExecutor;
    }

    @Override // i4.AbstractC1117a
    public final void r(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f15985d;
        try {
            this.f15984c.r(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // i4.AbstractC1117a
    public final void s(H h3) {
        ThreadPoolExecutor threadPoolExecutor = this.f15985d;
        try {
            this.f15984c.s(h3);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
