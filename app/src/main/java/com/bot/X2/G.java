package X2;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class G extends d4.i implements l4.h {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f9180h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ R2.A f9181i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ String f9182j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f9183k;

    /* JADX WARN: Type inference failed for: r7v2, types: [d4.i, X2.G] */
    @Override // l4.h
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj4).longValue();
        ?? iVar = new d4.i(5, (InterfaceC0905c) obj5);
        iVar.f9180h = booleanValue;
        iVar.f9181i = (R2.A) obj2;
        iVar.f9182j = (String) obj3;
        iVar.f9183k = longValue;
        return iVar.r(X3.y.a);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        boolean z5 = this.f9180h;
        R2.A a = this.f9181i;
        String str = this.f9182j;
        long j3 = this.f9183k;
        X3.a.e(obj);
        return new X3.o(new X3.i(Boolean.valueOf(z5), a), str, new Long(j3));
    }
}
