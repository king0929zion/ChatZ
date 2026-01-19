package u3;

import i1.AbstractC1087g;

/* renamed from: u3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1762f extends C1759c {

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f15168i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f15169j;

    public C1762f(t3.d dVar, E3.b bVar, F3.c cVar, byte[] bArr) {
        super(dVar);
        this.f15168i = bArr;
        this.f15162e = new C3.b(this, bVar, 1);
        this.f15163f = new F3.a(this, bArr, cVar);
        this.f15169j = true;
    }

    @Override // u3.C1759c
    public final boolean b() {
        return this.f15169j;
    }

    @Override // u3.C1759c
    public final Object f() {
        return AbstractC1087g.b(this.f15168i);
    }
}
