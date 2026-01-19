package I0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class s1 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final I0.q1 a(I0.AbstractC0171a r6, T.AbstractC0633u r7, b0.C0873f r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = I0.AbstractC0217x0.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            z4.h r0 = i4.AbstractC1120d.a(r2, r0, r3)
            X3.n r2 = I0.X.f2253p
            java.lang.Object r2 = r2.getValue()
            b4.h r2 = (b4.InterfaceC0910h) r2
            C4.c r2 = x4.AbstractC1888A.c(r2)
            I0.w0 r4 = new I0.w0
            r4.<init>(r0, r3)
            r5 = 3
            x4.AbstractC1888A.y(r2, r3, r4, r5)
            B0.G r2 = new B0.G
            r4 = 9
            r2.<init>(r0, r4)
            java.lang.Object r0 = f0.AbstractC0992o.f11707c
            monitor-enter(r0)
            java.lang.Object r4 = f0.AbstractC0992o.f11713i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r2 = Y3.m.A0(r4, r2)     // Catch: java.lang.Throwable -> L3c
            f0.AbstractC0992o.f11713i = r2     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            f0.AbstractC0992o.a()
            goto L3f
        L3c:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L3f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L52
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof I0.ViewTreeObserverOnGlobalLayoutListenerC0216x
            if (r1 == 0) goto L50
            I0.x r0 = (I0.ViewTreeObserverOnGlobalLayoutListenerC0216x) r0
            goto L56
        L50:
            r0 = r3
            goto L56
        L52:
            r6.removeAllViews()
            goto L50
        L56:
            if (r0 != 0) goto L6e
            I0.x r0 = new I0.x
            android.content.Context r1 = r6.getContext()
            b4.h r2 = r7.j()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = I0.s1.a
            r6.addView(r1, r2)
        L6e:
            android.view.View r6 = r0.getView()
            r1 = 2131165309(0x7f07007d, float:1.7944831E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof I0.q1
            if (r2 == 0) goto L80
            r3 = r6
            I0.q1 r3 = (I0.q1) r3
        L80:
            if (r3 != 0) goto L9c
            I0.q1 r3 = new I0.q1
            H0.G0 r6 = new H0.G0
            H0.J r2 = r0.getRoot()
            r6.<init>(r2)
            T.x r2 = new T.x
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9c:
            r3.b(r8)
            b4.h r6 = r0.getCoroutineContext()
            b4.h r8 = r7.j()
            boolean r6 = m4.AbstractC1276k.b(r6, r8)
            if (r6 != 0) goto Lb4
            b4.h r6 = r7.j()
            r0.setCoroutineContext(r6)
        Lb4:
            I0.r1 r6 = new I0.r1
            r6.<init>(r7)
            r0.setFrameEndScheduler$ui(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.s1.a(I0.a, T.u, b0.f):I0.q1");
    }
}
