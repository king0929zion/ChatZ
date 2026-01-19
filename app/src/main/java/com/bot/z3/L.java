package z3;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.io.IOException;
import java.util.Map;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class L extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f16250h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f16251i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E3.d f16252j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1922e0 f16253k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Long l3, E3.d dVar, InterfaceC1922e0 interfaceC1922e0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16251i = l3;
        this.f16252j = dVar;
        this.f16253k = interfaceC1922e0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((L) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new L(this.f16251i, this.f16252j, this.f16253k, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f16250h;
        if (i6 == 0) {
            X3.a.e(obj);
            long longValue = this.f16251i.longValue();
            this.f16250h = 1;
            Object m3 = AbstractC1888A.m(longValue, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (m3 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        E3.d dVar = this.f16252j;
        AbstractC1276k.f(dVar, "request");
        I3.B b5 = dVar.a;
        b5.a();
        StringBuilder sb = new StringBuilder(PegdownExtensions.WIKILINKS);
        Y4.d.h(b5, sb);
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "appendTo(StringBuilder(256)).toString()");
        M m5 = N.f16254d;
        Map map = (Map) dVar.f1309f.e(w3.f.a);
        K k3 = (K) (map != null ? map.get(m5) : null);
        Object obj2 = k3 != null ? k3.a : null;
        StringBuilder t5 = B3.e.t("Request timeout has expired [url=", sb2, ", request_timeout=");
        if (obj2 == null) {
            obj2 = "unknown";
        }
        t5.append(obj2);
        t5.append(" ms]");
        IOException iOException = new IOException(t5.toString());
        O.a.c("Request timeout: " + b5);
        String message = iOException.getMessage();
        AbstractC1276k.c(message);
        this.f16253k.f(AbstractC1888A.a(message, iOException));
        return X3.y.a;
    }
}
