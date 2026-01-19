package r2;

import Q4.C0495c;
import Q4.m;
import Q4.n;
import Q4.r;
import Q4.y;
import X3.g;
import android.graphics.Bitmap;
import d5.A;
import d5.C;
import java.util.regex.Pattern;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import org.jsoup.helper.HttpConnection;
import s4.j;
import u4.AbstractC1776n;
import w2.AbstractC1835e;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629b {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14655b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14656c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14657d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14658e;

    /* renamed from: f, reason: collision with root package name */
    public final n f14659f;

    public C1629b(C c6) {
        final int i6 = 0;
        InterfaceC1193a interfaceC1193a = new InterfaceC1193a(this) { // from class: r2.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1629b f14654e;

            {
                this.f14654e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i7 = i6;
                C1629b c1629b = this.f14654e;
                switch (i7) {
                    case 0:
                        C0495c c0495c = C0495c.f6498n;
                        return j.C(c1629b.f14659f);
                    default:
                        String a = c1629b.f14659f.a(HttpConnection.CONTENT_TYPE);
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = r.f6573b;
                        try {
                            return h5.e.W(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        };
        g gVar = g.f9391e;
        this.a = X3.a.c(gVar, interfaceC1193a);
        final char c7 = 1 == true ? 1 : 0;
        this.f14655b = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: r2.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1629b f14654e;

            {
                this.f14654e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i7 = c7;
                C1629b c1629b = this.f14654e;
                switch (i7) {
                    case 0:
                        C0495c c0495c = C0495c.f6498n;
                        return j.C(c1629b.f14659f);
                    default:
                        String a = c1629b.f14659f.a(HttpConnection.CONTENT_TYPE);
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = r.f6573b;
                        try {
                            return h5.e.W(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f14656c = Long.parseLong(c6.A(Long.MAX_VALUE));
        this.f14657d = Long.parseLong(c6.A(Long.MAX_VALUE));
        this.f14658e = Integer.parseInt(c6.A(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(c6.A(Long.MAX_VALUE));
        m mVar = new m(0);
        for (int i7 = 0; i7 < parseInt; i7++) {
            String A5 = c6.A(Long.MAX_VALUE);
            Bitmap.Config[] configArr = AbstractC1835e.a;
            int N5 = AbstractC1776n.N(A5, ':', 0, 6);
            if (N5 != -1) {
                String substring = A5.substring(0, N5);
                AbstractC1276k.e(substring, "substring(...)");
                String obj = AbstractC1776n.l0(substring).toString();
                String substring2 = A5.substring(N5 + 1);
                AbstractC1276k.e(substring2, "substring(...)");
                mVar.b(obj, substring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(A5).toString());
            }
        }
        this.f14659f = mVar.d();
    }

    public final void a(A a) {
        a.d(this.f14656c);
        a.writeByte(10);
        a.d(this.f14657d);
        a.writeByte(10);
        a.d(this.f14658e ? 1L : 0L);
        a.writeByte(10);
        n nVar = this.f14659f;
        a.d(nVar.size());
        a.writeByte(10);
        int size = nVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            a.F(nVar.b(i6));
            a.F(": ");
            a.F(nVar.d(i6));
            a.writeByte(10);
        }
    }

    public C1629b(y yVar) {
        final int i6 = 0;
        InterfaceC1193a interfaceC1193a = new InterfaceC1193a(this) { // from class: r2.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1629b f14654e;

            {
                this.f14654e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i7 = i6;
                C1629b c1629b = this.f14654e;
                switch (i7) {
                    case 0:
                        C0495c c0495c = C0495c.f6498n;
                        return j.C(c1629b.f14659f);
                    default:
                        String a = c1629b.f14659f.a(HttpConnection.CONTENT_TYPE);
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = r.f6573b;
                        try {
                            return h5.e.W(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        };
        g gVar = g.f9391e;
        this.a = X3.a.c(gVar, interfaceC1193a);
        final int i7 = 1;
        this.f14655b = X3.a.c(gVar, new InterfaceC1193a(this) { // from class: r2.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1629b f14654e;

            {
                this.f14654e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i72 = i7;
                C1629b c1629b = this.f14654e;
                switch (i72) {
                    case 0:
                        C0495c c0495c = C0495c.f6498n;
                        return j.C(c1629b.f14659f);
                    default:
                        String a = c1629b.f14659f.a(HttpConnection.CONTENT_TYPE);
                        if (a == null) {
                            return null;
                        }
                        Pattern pattern = r.f6573b;
                        try {
                            return h5.e.W(a);
                        } catch (IllegalArgumentException unused) {
                            return null;
                        }
                }
            }
        });
        this.f14656c = yVar.f6667n;
        this.f14657d = yVar.f6668o;
        this.f14658e = yVar.f6661h != null;
        this.f14659f = yVar.f6662i;
    }
}
