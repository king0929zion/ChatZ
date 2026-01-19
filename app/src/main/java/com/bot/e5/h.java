package e5;

import X3.y;
import d5.C;
import java.io.IOException;
import m4.AbstractC1277l;
import m4.C1288w;

/* loaded from: classes.dex */
public final class h extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11626e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f11627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1288w f11628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1288w f11629h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1288w f11630i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C c6, C1288w c1288w, C1288w c1288w2, C1288w c1288w3) {
        super(2);
        this.f11627f = c6;
        this.f11628g = c1288w;
        this.f11629h = c1288w2;
        this.f11630i = c1288w3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f11626e) {
            case 0:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                if (intValue == 1) {
                    C1288w c1288w = this.f11628g;
                    if (c1288w.f12973c != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (longValue != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    C c6 = this.f11627f;
                    c1288w.f12973c = Long.valueOf(c6.h());
                    this.f11629h.f12973c = Long.valueOf(c6.h());
                    this.f11630i.f12973c = Long.valueOf(c6.h());
                }
                return y.a;
            default:
                int intValue2 = ((Number) obj).intValue();
                long longValue2 = ((Number) obj2).longValue();
                if (intValue2 == 21589) {
                    if (longValue2 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    C c7 = this.f11627f;
                    byte readByte = c7.readByte();
                    boolean z5 = (readByte & 1) == 1;
                    boolean z6 = (readByte & 2) == 2;
                    boolean z7 = (readByte & 4) == 4;
                    long j3 = z5 ? 5L : 1L;
                    if (z6) {
                        j3 += 4;
                    }
                    if (z7) {
                        j3 += 4;
                    }
                    if (longValue2 < j3) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z5) {
                        this.f11628g.f12973c = Integer.valueOf(c7.f());
                    }
                    if (z6) {
                        this.f11629h.f12973c = Integer.valueOf(c7.f());
                    }
                    if (z7) {
                        this.f11630i.f12973c = Integer.valueOf(c7.f());
                    }
                }
                return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C1288w c1288w, C c6, C1288w c1288w2, C1288w c1288w3) {
        super(2);
        this.f11628g = c1288w;
        this.f11627f = c6;
        this.f11629h = c1288w2;
        this.f11630i = c1288w3;
    }
}
