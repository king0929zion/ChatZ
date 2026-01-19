package C4;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m4.AbstractC1276k;
import x4.AbstractRunnableC1905S;
import x4.C1906T;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f722b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public AbstractRunnableC1905S[] a;

    public final void a(AbstractRunnableC1905S abstractRunnableC1905S) {
        abstractRunnableC1905S.c((C1906T) this);
        AbstractRunnableC1905S[] abstractRunnableC1905SArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f722b;
        if (abstractRunnableC1905SArr == null) {
            abstractRunnableC1905SArr = new AbstractRunnableC1905S[4];
            this.a = abstractRunnableC1905SArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC1905SArr.length) {
            Object[] copyOf = Arrays.copyOf(abstractRunnableC1905SArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            abstractRunnableC1905SArr = (AbstractRunnableC1905S[]) copyOf;
            this.a = abstractRunnableC1905SArr;
        }
        int i6 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i6 + 1);
        abstractRunnableC1905SArr[i6] = abstractRunnableC1905S;
        abstractRunnableC1905S.f15667e = i6;
        c(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x4.AbstractRunnableC1905S b(int r9) {
        /*
            r8 = this;
            x4.S[] r0 = r8.a
            m4.AbstractC1276k.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = C4.y.f722b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            m4.AbstractC1276k.c(r4)
            r5 = r0[r2]
            m4.AbstractC1276k.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            x4.S[] r5 = r8.a
            m4.AbstractC1276k.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            m4.AbstractC1276k.c(r6)
            r7 = r5[r4]
            m4.AbstractC1276k.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            m4.AbstractC1276k.c(r4)
            r5 = r5[r2]
            m4.AbstractC1276k.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            m4.AbstractC1276k.c(r9)
            r2 = 0
            r9.c(r2)
            r9.f15667e = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: C4.y.b(int):x4.S");
    }

    public final void c(int i6) {
        while (i6 > 0) {
            AbstractRunnableC1905S[] abstractRunnableC1905SArr = this.a;
            AbstractC1276k.c(abstractRunnableC1905SArr);
            int i7 = (i6 - 1) / 2;
            AbstractRunnableC1905S abstractRunnableC1905S = abstractRunnableC1905SArr[i7];
            AbstractC1276k.c(abstractRunnableC1905S);
            AbstractRunnableC1905S abstractRunnableC1905S2 = abstractRunnableC1905SArr[i6];
            AbstractC1276k.c(abstractRunnableC1905S2);
            if (abstractRunnableC1905S.compareTo(abstractRunnableC1905S2) <= 0) {
                return;
            }
            d(i6, i7);
            i6 = i7;
        }
    }

    public final void d(int i6, int i7) {
        AbstractRunnableC1905S[] abstractRunnableC1905SArr = this.a;
        AbstractC1276k.c(abstractRunnableC1905SArr);
        AbstractRunnableC1905S abstractRunnableC1905S = abstractRunnableC1905SArr[i7];
        AbstractC1276k.c(abstractRunnableC1905S);
        AbstractRunnableC1905S abstractRunnableC1905S2 = abstractRunnableC1905SArr[i6];
        AbstractC1276k.c(abstractRunnableC1905S2);
        abstractRunnableC1905SArr[i6] = abstractRunnableC1905S;
        abstractRunnableC1905SArr[i7] = abstractRunnableC1905S2;
        abstractRunnableC1905S.f15667e = i6;
        abstractRunnableC1905S2.f15667e = i7;
    }
}
