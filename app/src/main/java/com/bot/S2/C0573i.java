package S2;

import b4.InterfaceC0905c;
import java.util.LinkedHashMap;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: S2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573i extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f7778h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f7779i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f7780j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f7781k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f7782l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0573i(String str, long j3, long j4, long j5, long j6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f7778h = str;
        this.f7779i = j3;
        this.f7780j = j4;
        this.f7781k = j5;
        this.f7782l = j6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0573i) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0573i(this.f7778h, this.f7779i, this.f7780j, this.f7781k, this.f7782l, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        List H3;
        String str = this.f7778h;
        X3.a.e(obj);
        try {
            H3 = AbstractC0570g0.e(str);
        } catch (Exception unused) {
            H3 = Y4.l.H(new V(str));
        } catch (OutOfMemoryError unused2) {
            H3 = Y4.l.H(new V("内容过大，无法解析"));
        }
        List list = H3;
        try {
            LinkedHashMap linkedHashMap = AbstractC0570g0.a;
            return AbstractC0570g0.b(list, this.f7779i, this.f7780j, this.f7781k, this.f7782l);
        } catch (Exception unused3) {
            return list;
        }
    }
}
