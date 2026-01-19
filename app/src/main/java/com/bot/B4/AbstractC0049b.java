package B4;

import A4.V;
import b4.InterfaceC0905c;
import com.vladsch.flexmark.util.format.TableCell;
import java.util.Arrays;
import m4.AbstractC1276k;
import z4.EnumC2050a;

/* renamed from: B4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0049b {

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0051d[] f575c;

    /* renamed from: e, reason: collision with root package name */
    public int f576e;

    /* renamed from: f, reason: collision with root package name */
    public int f577f;

    /* renamed from: g, reason: collision with root package name */
    public G f578g;

    public final AbstractC0051d d() {
        AbstractC0051d abstractC0051d;
        G g3;
        synchronized (this) {
            try {
                AbstractC0051d[] abstractC0051dArr = this.f575c;
                if (abstractC0051dArr == null) {
                    abstractC0051dArr = f();
                    this.f575c = abstractC0051dArr;
                } else if (this.f576e >= abstractC0051dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0051dArr, abstractC0051dArr.length * 2);
                    AbstractC1276k.e(copyOf, "copyOf(...)");
                    this.f575c = (AbstractC0051d[]) copyOf;
                    abstractC0051dArr = (AbstractC0051d[]) copyOf;
                }
                int i6 = this.f577f;
                do {
                    abstractC0051d = abstractC0051dArr[i6];
                    if (abstractC0051d == null) {
                        abstractC0051d = e();
                        abstractC0051dArr[i6] = abstractC0051d;
                    }
                    i6++;
                    if (i6 >= abstractC0051dArr.length) {
                        i6 = 0;
                    }
                } while (!abstractC0051d.a(this));
                this.f577f = i6;
                this.f576e++;
                g3 = this.f578g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g3 != null) {
            g3.w(1);
        }
        return abstractC0051d;
    }

    public abstract AbstractC0051d e();

    public abstract AbstractC0051d[] f();

    public final void g(AbstractC0051d abstractC0051d) {
        G g3;
        int i6;
        InterfaceC0905c[] b5;
        synchronized (this) {
            try {
                int i7 = this.f576e - 1;
                this.f576e = i7;
                g3 = this.f578g;
                if (i7 == 0) {
                    this.f577f = 0;
                }
                AbstractC1276k.d(abstractC0051d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b5 = abstractC0051d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0905c interfaceC0905c : b5) {
            if (interfaceC0905c != null) {
                interfaceC0905c.k(X3.y.a);
            }
        }
        if (g3 != null) {
            g3.w(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [A4.V, B4.G] */
    public final G i() {
        G g3;
        synchronized (this) {
            G g6 = this.f578g;
            g3 = g6;
            if (g6 == null) {
                int i6 = this.f576e;
                V v5 = new V(1, TableCell.NOT_TRACKED, EnumC2050a.f16328e);
                v5.h(Integer.valueOf(i6));
                this.f578g = v5;
                g3 = v5;
            }
        }
        return g3;
    }
}
