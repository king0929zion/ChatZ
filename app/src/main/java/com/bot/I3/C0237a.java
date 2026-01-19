package I3;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;
import o0.C1387I;

/* renamed from: I3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237a extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2734e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2736g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237a(StringBuilder sb, boolean z5) {
        super(1);
        this.f2736g = sb;
        this.f2735f = z5;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2734e) {
            case 0:
                byte byteValue = ((Number) obj).byteValue();
                StringBuilder sb = (StringBuilder) this.f2736g;
                if (AbstractC0238b.a.contains(Byte.valueOf(byteValue)) || AbstractC0238b.f2739d.contains(Byte.valueOf(byteValue))) {
                    sb.append((char) byteValue);
                } else if (this.f2735f && byteValue == 32) {
                    sb.append('+');
                } else {
                    sb.append(AbstractC0238b.a(byteValue));
                }
                return X3.y.a;
            default:
                ((C1387I) obj).g(!this.f2735f && ((Boolean) ((InterfaceC1193a) this.f2736g).b()).booleanValue());
                return X3.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237a(boolean z5, InterfaceC1193a interfaceC1193a) {
        super(1);
        this.f2735f = z5;
        this.f2736g = interfaceC1193a;
    }
}
