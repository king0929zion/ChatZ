package x3;

import Q4.r;
import X3.n;
import d5.A;
import d5.AbstractC0942b;
import d5.C0945e;
import io.ktor.utils.io.y;
import java.io.IOException;
import m4.AbstractC1276k;

/* renamed from: x3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887k extends s4.j {

    /* renamed from: c, reason: collision with root package name */
    public final Long f15636c;

    /* renamed from: d, reason: collision with root package name */
    public final A0.b f15637d;

    public C1887k(Long l3, A0.b bVar) {
        this.f15636c = l3;
        this.f15637d = bVar;
    }

    @Override // s4.j
    public final void R(A a) {
        Long l3;
        try {
            y yVar = (y) this.f15637d.b();
            n nVar = io.ktor.utils.io.jvm.javaio.d.a;
            AbstractC1276k.f(yVar, "<this>");
            Throwable th = null;
            C0945e h3 = AbstractC0942b.h(new io.ktor.utils.io.jvm.javaio.h(null, yVar));
            long j3 = 0;
            while (true) {
                try {
                    long W5 = h3.W(8192L, a.f11441e);
                    if (W5 == -1) {
                        break;
                    }
                    j3 += W5;
                    a.c();
                } catch (Throwable th2) {
                    try {
                        h3.close();
                    } catch (Throwable th3) {
                        X3.a.a(th2, th3);
                    }
                    th = th2;
                    l3 = null;
                }
            }
            l3 = Long.valueOf(j3);
            try {
                h3.close();
            } catch (Throwable th4) {
                th = th4;
            }
            if (th != null) {
                throw th;
            }
            AbstractC1276k.c(l3);
        } catch (IOException e6) {
            throw e6;
        } catch (Throwable th5) {
            throw new IOException(th5);
        }
    }

    @Override // s4.j
    public final long m() {
        Long l3 = this.f15636c;
        if (l3 != null) {
            return l3.longValue();
        }
        return -1L;
    }

    @Override // s4.j
    public final r n() {
        return null;
    }
}
