package o0;

import android.graphics.Paint;
import android.graphics.Shader;
import f0.C0987j;
import m4.AbstractC1276k;
import n0.C1356e;

/* renamed from: o0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1388J implements 
    public C0987j a;

    /* renamed from: b, reason: collision with root package name */
    public long f13434b = 9205357640488583168L;

    @Override // o0.AbstractC1404o
    public final void a(float f6, long j3, L1.d dVar) {
        C0987j c0987j = this.a;
        if (c0987j == null || !C1356e.a(this.f13434b, j3)) {
            if (C1356e.e(j3)) {
                this.a = null;
                this.f13434b = 9205357640488583168L;
                c0987j = null;
            } else {
                c0987j = this.a;
                if (c0987j == null) {
                    c0987j = new C0987j(11, false);
                    this.a = c0987j;
                }
                c0987j.f11690e = b(j3);
                this.a = c0987j;
                this.f13434b = j3;
            }
        }
        long c6 = y.c(((Paint) dVar.f3002b).getColor());
        long j4 = s.f13475b;
        if (!s.d(c6, j4)) {
            dVar.e(j4);
        }
        if (!AbstractC1276k.b((Shader) dVar.f3003c, c0987j != null ? (Shader) c0987j.f11690e : null)) {
            dVar.h(c0987j != null ? (Shader) c0987j.f11690e : null);
        }
        if (((Paint) dVar.f3002b).getAlpha() / 255.0f == f6) {
            return;
        }
        dVar.c(f6);
    }

    public abstract Shader b(long j3);
}
