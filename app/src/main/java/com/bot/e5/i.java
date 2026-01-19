package e5;

import X3.y;
import d5.C;
import java.io.IOException;
import m4.AbstractC1277l;
import m4.C1283r;
import m4.C1287v;
import m4.C1288w;

/* loaded from: classes.dex */
public final class i extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1283r f11631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1287v f11633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C f11634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1287v f11635i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1287v f11636j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1288w f11637k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1288w f11638l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1288w f11639m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1283r c1283r, long j3, C1287v c1287v, C c6, C1287v c1287v2, C1287v c1287v3, C1288w c1288w, C1288w c1288w2, C1288w c1288w3) {
        super(2);
        this.f11631e = c1283r;
        this.f11632f = j3;
        this.f11633g = c1287v;
        this.f11634h = c6;
        this.f11635i = c1287v2;
        this.f11636j = c1287v3;
        this.f11637k = c1288w;
        this.f11638l = c1288w2;
        this.f11639m = c1288w3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        C c6 = this.f11634h;
        if (intValue == 1) {
            C1283r c1283r = this.f11631e;
            if (c1283r.f12968c) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c1283r.f12968c = true;
            if (longValue < this.f11632f) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C1287v c1287v = this.f11633g;
            long j3 = c1287v.f12972c;
            if (j3 == 4294967295L) {
                j3 = c6.h();
            }
            c1287v.f12972c = j3;
            C1287v c1287v2 = this.f11635i;
            c1287v2.f12972c = c1287v2.f12972c == 4294967295L ? c6.h() : 0L;
            C1287v c1287v3 = this.f11636j;
            c1287v3.f12972c = c1287v3.f12972c == 4294967295L ? c6.h() : 0L;
        } else if (intValue == 10) {
            if (longValue < 4) {
                throw new IOException("bad zip: NTFS extra too short");
            }
            c6.skip(4L);
            b.e(c6, (int) (longValue - 4), new h(this.f11637k, c6, this.f11638l, this.f11639m));
        }
        return y.a;
    }
}
