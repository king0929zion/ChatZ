package W4;

import d5.C0949i;
import d5.I;
import d5.K;
import d5.r;
import java.io.IOException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class b implements I {

    /* renamed from: c, reason: collision with root package name */
    public final r f9024c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f9026f;

    public b(h hVar) {
        this.f9026f = hVar;
        this.f9024c = new r(hVar.f9041c.timeout());
    }

    @Override // d5.I
    public long W(long j3, C0949i c0949i) {
        h hVar = this.f9026f;
        AbstractC1276k.f(c0949i, "sink");
        try {
            return hVar.f9041c.W(j3, c0949i);
        } catch (IOException e6) {
            hVar.f9040b.k();
            c();
            throw e6;
        }
    }

    public final void c() {
        h hVar = this.f9026f;
        int i6 = hVar.f9043e;
        if (i6 == 6) {
            return;
        }
        if (i6 != 5) {
            throw new IllegalStateException("state: " + hVar.f9043e);
        }
        r rVar = this.f9024c;
        K k3 = rVar.f11499e;
        rVar.f11499e = K.f11458d;
        k3.a();
        k3.b();
        hVar.f9043e = 6;
    }

    @Override // d5.I
    public final K timeout() {
        return this.f9024c;
    }
}
