package D;

import S0.C0545g;
import com.vladsch.flexmark.util.format.TableCell;
import e1.InterfaceC0961c;
import java.util.List;

/* loaded from: classes.dex */
public final class G0 {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.P f768b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f771e;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0961c f773g;

    /* renamed from: h, reason: collision with root package name */
    public final W0.d f774h;

    /* renamed from: j, reason: collision with root package name */
    public E1.b f776j;

    /* renamed from: k, reason: collision with root package name */
    public e1.m f777k;

    /* renamed from: c, reason: collision with root package name */
    public final int f769c = TableCell.NOT_TRACKED;

    /* renamed from: d, reason: collision with root package name */
    public final int f770d = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f772f = 1;

    /* renamed from: i, reason: collision with root package name */
    public final List f775i = Y3.v.f9812c;

    public G0(C0545g c0545g, S0.P p5, boolean z5, InterfaceC0961c interfaceC0961c, W0.d dVar, int i6) {
        this.a = c0545g;
        this.f768b = p5;
        this.f771e = z5;
        this.f773g = interfaceC0961c;
        this.f774h = dVar;
    }

    public final void a(e1.m mVar) {
        E1.b bVar = this.f776j;
        if (bVar == null || mVar != this.f777k || bVar.a()) {
            this.f777k = mVar;
            bVar = new E1.b(this.a, S0.F.h(this.f768b, mVar), this.f775i, this.f773g, this.f774h);
        }
        this.f776j = bVar;
    }
}
