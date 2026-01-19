package S0;

import d1.C0937d;
import d1.C0938e;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class u implements InterfaceC0540b {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7665b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7666c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.q f7667d;

    /* renamed from: e, reason: collision with root package name */
    public final w f7668e;

    /* renamed from: f, reason: collision with root package name */
    public final d1.i f7669f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7671h;

    /* renamed from: i, reason: collision with root package name */
    public final d1.s f7672i;

    public u(int i6, int i7, long j3, d1.q qVar, w wVar, d1.i iVar, int i8, int i9, d1.s sVar) {
        this.a = i6;
        this.f7665b = i7;
        this.f7666c = j3;
        this.f7667d = qVar;
        this.f7668e = wVar;
        this.f7669f = iVar;
        this.f7670g = i8;
        this.f7671h = i9;
        this.f7672i = sVar;
        if (e1.o.a(j3, e1.o.f11580c) || e1.o.c(j3) >= S.l.f7374V) {
            return;
        }
        Y0.a.b("lineHeight can't be negative (" + e1.o.c(j3) + ')');
    }

    public final u a(u uVar) {
        return uVar == null ? this : v.a(this, uVar.a, uVar.f7665b, uVar.f7666c, uVar.f7667d, uVar.f7668e, uVar.f7669f, uVar.f7670g, uVar.f7671h, uVar.f7672i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.f7665b == uVar.f7665b && e1.o.a(this.f7666c, uVar.f7666c) && AbstractC1276k.b(this.f7667d, uVar.f7667d) && AbstractC1276k.b(this.f7668e, uVar.f7668e) && AbstractC1276k.b(this.f7669f, uVar.f7669f) && this.f7670g == uVar.f7670g && this.f7671h == uVar.f7671h && AbstractC1276k.b(this.f7672i, uVar.f7672i);
    }

    public final int hashCode() {
        int b5 = AbstractC1135a.b(this.f7665b, Integer.hashCode(this.a) * 31, 31);
        e1.p[] pVarArr = e1.o.f11579b;
        int c6 = AbstractC1135a.c(b5, 31, this.f7666c);
        d1.q qVar = this.f7667d;
        int hashCode = (c6 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        w wVar = this.f7668e;
        int hashCode2 = (hashCode + (wVar != null ? wVar.hashCode() : 0)) * 31;
        d1.i iVar = this.f7669f;
        int b6 = AbstractC1135a.b(this.f7671h, AbstractC1135a.b(this.f7670g, (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        d1.s sVar = this.f7672i;
        return b6 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) d1.k.a(this.a)) + ", textDirection=" + ((Object) d1.m.a(this.f7665b)) + ", lineHeight=" + ((Object) e1.o.d(this.f7666c)) + ", textIndent=" + this.f7667d + ", platformStyle=" + this.f7668e + ", lineHeightStyle=" + this.f7669f + ", lineBreak=" + ((Object) C0938e.a(this.f7670g)) + ", hyphens=" + ((Object) C0937d.a(this.f7671h)) + ", textMotion=" + this.f7672i + ')';
    }
}
