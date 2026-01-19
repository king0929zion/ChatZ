package u0;

import android.graphics.Path;
import java.util.List;
import m4.AbstractC1276k;
import o0.AbstractC1399j;
import o0.AbstractC1404o;
import o0.C1397h;
import o0.C1398i;
import q0.InterfaceC1498d;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1748i extends AbstractC1739D {

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1404o f15062b;

    /* renamed from: c, reason: collision with root package name */
    public float f15063c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f15064d;

    /* renamed from: e, reason: collision with root package name */
    public float f15065e;

    /* renamed from: f, reason: collision with root package name */
    public float f15066f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC1404o f15067g;

    /* renamed from: h, reason: collision with root package name */
    public int f15068h;

    /* renamed from: i, reason: collision with root package name */
    public int f15069i;

    /* renamed from: j, reason: collision with root package name */
    public float f15070j;

    /* renamed from: k, reason: collision with root package name */
    public float f15071k;

    /* renamed from: l, reason: collision with root package name */
    public float f15072l;

    /* renamed from: m, reason: collision with root package name */
    public float f15073m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15074n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15075o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15076p;

    /* renamed from: q, reason: collision with root package name */
    public q0.h f15077q;

    /* renamed from: r, reason: collision with root package name */
    public final C1397h f15078r;

    /* renamed from: s, reason: collision with root package name */
    public C1397h f15079s;

    /* renamed from: t, reason: collision with root package name */
    public C1397h f15080t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f15081u;

    public C1748i() {
        int i6 = H.a;
        this.f15064d = Y3.v.f9812c;
        this.f15065e = 1.0f;
        this.f15068h = 0;
        this.f15069i = 0;
        this.f15070j = 4.0f;
        this.f15072l = 1.0f;
        this.f15074n = true;
        this.f15075o = true;
        C1397h a = AbstractC1399j.a();
        this.f15078r = a;
        this.f15079s = a;
        this.f15081u = X3.a.c(X3.g.f9391e, C1747h.f15059f);
    }

    @Override // u0.AbstractC1739D
    public final void a(InterfaceC1498d interfaceC1498d) {
        InterfaceC1498d interfaceC1498d2;
        q0.h hVar;
        if (this.f15074n) {
            AbstractC1741b.e(this.f15064d, this.f15078r);
            e();
        } else if (this.f15076p) {
            e();
        }
        this.f15074n = false;
        this.f15076p = false;
        AbstractC1404o abstractC1404o = this.f15062b;
        if (abstractC1404o != null) {
            interfaceC1498d2 = interfaceC1498d;
            InterfaceC1498d.f(interfaceC1498d2, this.f15079s, abstractC1404o, this.f15063c, null, 56);
        } else {
            interfaceC1498d2 = interfaceC1498d;
        }
        AbstractC1404o abstractC1404o2 = this.f15067g;
        if (abstractC1404o2 != null) {
            q0.h hVar2 = this.f15077q;
            if (this.f15075o || hVar2 == null) {
                q0.h hVar3 = new q0.h(this.f15066f, this.f15070j, this.f15068h, this.f15069i, 16);
                this.f15077q = hVar3;
                this.f15075o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            InterfaceC1498d.f(interfaceC1498d2, this.f15079s, abstractC1404o2, this.f15065e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X3.f] */
    public final void e() {
        float f6 = this.f15071k;
        C1397h c1397h = this.f15078r;
        if (f6 == S.l.f7374V && this.f15072l == 1.0f) {
            this.f15079s = c1397h;
            return;
        }
        if (AbstractC1276k.b(this.f15079s, c1397h)) {
            this.f15079s = AbstractC1399j.a();
        } else {
            Path.FillType fillType = this.f15079s.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z5 = fillType == fillType2;
            this.f15079s.f();
            Path path = this.f15079s.a;
            if (!z5) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f15081u;
        ((C1398i) r02.getValue()).a.setPath(c1397h != null ? c1397h.a : null, false);
        float length = ((C1398i) r02.getValue()).a.getLength();
        float f7 = this.f15071k;
        float f8 = this.f15073m;
        float f9 = ((f7 + f8) % 1.0f) * length;
        float f10 = ((this.f15072l + f8) % 1.0f) * length;
        if (f9 <= f10) {
            ((C1398i) r02.getValue()).a(f9, f10, this.f15079s);
            return;
        }
        C1397h c1397h2 = this.f15080t;
        if (c1397h2 == null) {
            c1397h2 = AbstractC1399j.a();
            this.f15080t = c1397h2;
        }
        c1397h2.e();
        ((C1398i) r02.getValue()).a(f9, length, c1397h2);
        C1397h.a(this.f15079s, c1397h2);
        c1397h2.e();
        ((C1398i) r02.getValue()).a(S.l.f7374V, f10, c1397h2);
        C1397h.a(this.f15079s, c1397h2);
    }

    public final String toString() {
        return this.f15078r.toString();
    }
}
