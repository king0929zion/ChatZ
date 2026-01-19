package D;

import I0.C0207s0;
import N1.C0290l;
import Q.AbstractC0451p0;
import Q.C0439m0;
import Q.s3;
import Z2.C0789z;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.bot.feature.settings.data.ModelConfig;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.AbstractC0992o;
import f0.C0979b;
import f0.C0989l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import v.AbstractC1787b;
import x4.C1928k;
import z0.AbstractC2013a;
import z0.AbstractC2015c;
import z0.C2014b;

/* renamed from: D.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069g0 implements l4.c, Q4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1024c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1025e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1026f;

    public /* synthetic */ C0069g0(int i6, Object obj, Object obj2) {
        this.f1024c = i6;
        this.f1025e = obj;
        this.f1026f = obj2;
    }

    @Override // Q4.e
    public void a(U4.i iVar, IOException iOException) {
        if (iVar.f8725q) {
            return;
        }
        ((C1928k) this.f1026f).k(X3.a.b(iOException));
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean z5;
        long j3;
        switch (this.f1024c) {
            case 0:
                KeyEvent keyEvent = ((C2014b) obj).a;
                if (((C0098v0) this.f1025e).a() == EnumC0075j0.f1043e && keyEvent.getKeyCode() == 4) {
                    z5 = true;
                    if (AbstractC2015c.c(keyEvent) == 1) {
                        ((O.N0) this.f1026f).g(null);
                        return Boolean.valueOf(z5);
                    }
                }
                z5 = false;
                return Boolean.valueOf(z5);
            case 1:
                KeyEvent keyEvent2 = ((C2014b) obj).a;
                m0.n nVar = (m0.n) this.f1026f;
                InputDevice device = keyEvent2.getDevice();
                boolean z6 = false;
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && AbstractC2015c.c(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (AbstractC0090r0.m(19, keyEvent2)) {
                        z6 = ((m0.q) nVar).i(5, true);
                    } else if (AbstractC0090r0.m(20, keyEvent2)) {
                        z6 = ((m0.q) nVar).i(6, true);
                    } else if (AbstractC0090r0.m(21, keyEvent2)) {
                        z6 = ((m0.q) nVar).i(3, true);
                    } else if (AbstractC0090r0.m(22, keyEvent2)) {
                        z6 = ((m0.q) nVar).i(4, true);
                    } else if (AbstractC0090r0.m(23, keyEvent2)) {
                        I0.S0 s02 = ((C0098v0) this.f1025e).f1184c;
                        if (s02 != null) {
                            ((C0207s0) s02).b();
                        }
                        z6 = true;
                    }
                }
                return Boolean.valueOf(z6);
            case 2:
                return ((I2.x) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 3:
                return ((I2.x) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 4:
                return ((I2.x) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case AbstractC1787b.f15290g /* 5 */:
                KeyEvent keyEvent3 = ((C2014b) obj).a;
                T.X x5 = (T.X) this.f1026f;
                C0439m0 c0439m0 = (C0439m0) this.f1025e;
                if (AbstractC2015c.c(keyEvent3) == 1 && (AbstractC0451p0.b(keyEvent3) || AbstractC2013a.a(AbstractC2015c.a(keyEvent3.getKeyCode()), AbstractC2013a.f16207q))) {
                    c0439m0.b();
                }
                Boolean bool = Boolean.FALSE;
                x5.setValue(bool);
                return bool;
            case 6:
                return ((C0056a) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 7:
                KeyEvent keyEvent4 = ((C2014b) obj).a;
                T.X x6 = (T.X) this.f1026f;
                if (!((s3) this.f1025e).b()) {
                    x6.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 8:
                return ((P2.D0) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case AbstractC1787b.f15287d /* 9 */:
                C0290l c0290l = (C0290l) this.f1025e;
                Object obj2 = c0290l.f3755b;
                C1928k c1928k = (C1928k) this.f1026f;
                synchronized (obj2) {
                    ((ArrayList) c0290l.f3756c).remove(c1928k);
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                int intValue = ((Number) obj).intValue();
                return ((S0.A) this.f1025e).m(Integer.valueOf(intValue), ((List) this.f1026f).get(intValue));
            case 11:
                return ((S2.Y) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 12:
                return ((S2.Y) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 13:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((l4.e) this.f1025e).m(((ModelConfig) this.f1026f).a, bool2);
                return X3.y.a;
            case 14:
                return ((S2.Y) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 15:
                int intValue2 = ((Number) obj).intValue();
                return ((C0789z) this.f1025e).m(Integer.valueOf(intValue2), ((List) this.f1026f).get(intValue2));
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return ((S2.Y) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 17:
                return ((S2.Y) this.f1025e).f(((List) this.f1026f).get(((Number) obj).intValue()));
            case 18:
                C0989l c0989l = (C0989l) obj;
                synchronized (AbstractC0992o.f11707c) {
                    j3 = AbstractC0992o.f11709e;
                    AbstractC0992o.f11709e = 1 + j3;
                }
                return new C0979b(j3, c0989l, (l4.c) this.f1025e, (l4.c) this.f1026f);
            default:
                try {
                    ((U4.i) this.f1025e).d();
                } catch (Throwable unused) {
                }
                return X3.y.a;
        }
    }

    @Override // Q4.e
    public void g(U4.i iVar, Q4.y yVar) {
        ((C1928k) this.f1026f).k(yVar);
    }

    public C0069g0(C0439m0 c0439m0, boolean z5, T.X x5) {
        this.f1024c = 5;
        this.f1025e = c0439m0;
        this.f1026f = x5;
    }

    public C0069g0(m0.n nVar, C0098v0 c0098v0) {
        this.f1024c = 1;
        this.f1026f = nVar;
        this.f1025e = c0098v0;
    }
}
