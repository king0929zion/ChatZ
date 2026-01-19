package Q3;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import io.ktor.utils.io.H;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: e, reason: collision with root package name */
    public final List f6472e;

    /* renamed from: f, reason: collision with root package name */
    public final k f6473f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6474g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0905c[] f6475h;

    /* renamed from: i, reason: collision with root package name */
    public int f6476i;

    /* renamed from: j, reason: collision with root package name */
    public int f6477j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Object obj, Object obj2, List list) {
        super(obj2);
        AbstractC1276k.f(obj, "initial");
        AbstractC1276k.f(obj2, "context");
        AbstractC1276k.f(list, "blocks");
        this.f6472e = list;
        this.f6473f = new k(this);
        this.f6474g = obj;
        this.f6475h = new InterfaceC0905c[list.size()];
        this.f6476i = -1;
    }

    @Override // Q3.f
    public final Object a(Object obj, d4.c cVar) {
        this.f6477j = 0;
        if (this.f6472e.size() == 0) {
            return obj;
        }
        AbstractC1276k.f(obj, "<set-?>");
        this.f6474g = obj;
        if (this.f6476i < 0) {
            return d(cVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // Q3.f
    public final Object b() {
        return this.f6474g;
    }

    @Override // x4.InterfaceC1942y
    public final InterfaceC0910h c() {
        return this.f6473f.o();
    }

    @Override // Q3.f
    public final Object d(InterfaceC0905c interfaceC0905c) {
        Object obj;
        int i6 = this.f6477j;
        int size = this.f6472e.size();
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (i6 == size) {
            obj = this.f6474g;
        } else {
            InterfaceC0905c K2 = Y4.d.K(interfaceC0905c);
            int i7 = this.f6476i + 1;
            this.f6476i = i7;
            InterfaceC0905c[] interfaceC0905cArr = this.f6475h;
            interfaceC0905cArr[i7] = K2;
            if (f(true)) {
                int i8 = this.f6476i;
                if (i8 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f6476i = i8 - 1;
                interfaceC0905cArr[i8] = null;
                obj = this.f6474g;
            } else {
                obj = enumC0927a;
            }
        }
        if (obj == enumC0927a) {
            AbstractC1276k.f(interfaceC0905c, "frame");
        }
        return obj;
    }

    @Override // Q3.f
    public final Object e(InterfaceC0905c interfaceC0905c, Object obj) {
        AbstractC1276k.f(obj, "<set-?>");
        this.f6474g = obj;
        return d(interfaceC0905c);
    }

    public final boolean f(boolean z5) {
        int i6;
        List list;
        do {
            i6 = this.f6477j;
            list = this.f6472e;
            if (i6 == list.size()) {
                if (z5) {
                    return true;
                }
                g(this.f6474g);
                return false;
            }
            this.f6477j = i6 + 1;
            try {
            } catch (Throwable th) {
                g(X3.a.b(th));
                return false;
            }
        } while (((l4.f) list.get(i6)).d(this, this.f6474g, this.f6473f) != EnumC0927a.f11114c);
        return false;
    }

    public final void g(Object obj) {
        Throwable b5;
        int i6 = this.f6476i;
        if (i6 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        InterfaceC0905c[] interfaceC0905cArr = this.f6475h;
        InterfaceC0905c interfaceC0905c = interfaceC0905cArr[i6];
        AbstractC1276k.c(interfaceC0905c);
        int i7 = this.f6476i;
        this.f6476i = i7 - 1;
        interfaceC0905cArr[i7] = null;
        if (!(obj instanceof X3.k)) {
            interfaceC0905c.k(obj);
            return;
        }
        Throwable a = X3.l.a(obj);
        AbstractC1276k.c(a);
        try {
            Throwable cause = a.getCause();
            if (cause != null && !AbstractC1276k.b(a.getCause(), cause) && (b5 = H.b(a, cause)) != null) {
                b5.setStackTrace(a.getStackTrace());
                a = b5;
            }
        } catch (Throwable unused) {
        }
        interfaceC0905c.k(X3.a.b(a));
    }
}
