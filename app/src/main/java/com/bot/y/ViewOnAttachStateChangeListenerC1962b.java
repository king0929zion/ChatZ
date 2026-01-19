package y;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1962b implements r0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* renamed from: k, reason: collision with root package name */
    public static long f15829k;

    /* renamed from: c, reason: collision with root package name */
    public final View f15830c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15832f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15835i;

    /* renamed from: j, reason: collision with root package name */
    public long f15836j;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityQueue f15831e = new PriorityQueue(11, new H0.C(6));

    /* renamed from: g, reason: collision with root package name */
    public final Choreographer f15833g = Choreographer.getInstance();

    /* renamed from: h, reason: collision with root package name */
    public final C1961a f15834h = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r0 >= 30.0f) goto L11;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, y.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnAttachStateChangeListenerC1962b(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f15830c = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            H0.C r1 = new H0.C
            r2 = 6
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f15831e = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f15833g = r0
            y.a r0 = new y.a
            r0.<init>()
            r4.f15834h = r0
            long r0 = y.ViewOnAttachStateChangeListenerC1962b.f15829k
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            y.ViewOnAttachStateChangeListenerC1962b.f15829k = r0
        L4a:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L56
            r5 = 1
            r4.f15835i = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.ViewOnAttachStateChangeListenerC1962b.<init>(android.view.View):void");
    }

    @Override // y.r0
    public void a(q0 q0Var) {
        this.f15831e.add(new u0(1, q0Var));
        if (this.f15832f) {
            return;
        }
        this.f15832f = true;
        this.f15830c.post(this);
    }

    public final boolean b() {
        C1961a c1961a = this.f15834h;
        long a = c1961a.a();
        Y4.l.W("compose:lazy:prefetch:available_time_nanos", a);
        boolean z5 = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.f15831e;
            Object peek = priorityQueue.peek();
            AbstractC1276k.c(peek);
            if (!((u0) peek).f15938b.c(c1961a)) {
                priorityQueue.poll();
                z5 = false;
            }
            c1961a.a = false;
        }
        return z5;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.f15835i) {
            this.f15836j = j3;
            this.f15830c.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15835i = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15835i = false;
        this.f15830c.removeCallbacks(this);
        this.f15833g.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f15831e;
        if (!priorityQueue.isEmpty() && this.f15832f && this.f15835i) {
            View view = this.f15830c;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z5 = System.nanoTime() > (((long) 2) * f15829k) + nanos;
                C1961a c1961a = this.f15834h;
                c1961a.a = z5;
                c1961a.f15828b = Math.max(this.f15836j, nanos) + f15829k;
                boolean z6 = false;
                while (!priorityQueue.isEmpty() && !z6) {
                    if (c1961a.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z6 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z6 = b();
                    }
                }
                if (z6) {
                    this.f15833g.postFrameCallback(this);
                } else {
                    this.f15832f = false;
                }
                Y4.l.W("compose:lazy:prefetch:available_time_nanos", 0L);
                return;
            }
        }
        this.f15832f = false;
    }
}
