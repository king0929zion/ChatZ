package U3;

import Y4.l;
import i4.AbstractC1120d;
import j1.AbstractC1135a;
import java.nio.ByteBuffer;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a {
    public final ByteBuffer a;

    /* renamed from: b, reason: collision with root package name */
    public int f8662b;

    /* renamed from: c, reason: collision with root package name */
    public int f8663c;

    /* renamed from: d, reason: collision with root package name */
    public int f8664d;

    /* renamed from: e, reason: collision with root package name */
    public int f8665e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8666f;

    public a(ByteBuffer byteBuffer) {
        AbstractC1276k.f(byteBuffer, "memory");
        this.a = byteBuffer;
        this.f8665e = byteBuffer.limit();
        this.f8666f = byteBuffer.limit();
    }

    public final void a(int i6) {
        int i7 = this.f8663c;
        int i8 = i7 + i6;
        if (i6 < 0 || i8 > this.f8665e) {
            l.s(i6, this.f8665e - i7);
            throw null;
        }
        this.f8663c = i8;
    }

    public final void b(int i6) {
        int i7 = this.f8665e;
        int i8 = this.f8663c;
        if (i6 < i8) {
            l.s(i6 - i8, i7 - i8);
            throw null;
        }
        if (i6 < i7) {
            this.f8663c = i6;
        } else if (i6 == i7) {
            this.f8663c = i6;
        } else {
            l.s(i6 - i8, i7 - i8);
            throw null;
        }
    }

    public final void c(int i6) {
        if (i6 == 0) {
            return;
        }
        int i7 = this.f8662b;
        int i8 = i7 + i6;
        if (i6 < 0 || i8 > this.f8663c) {
            l.z(i6, this.f8663c - i7);
            throw null;
        }
        this.f8662b = i8;
    }

    public final void d(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "newReadPosition shouldn't be negative: ").toString());
        }
        if (i6 > this.f8662b) {
            StringBuilder k3 = AbstractC1135a.k("newReadPosition shouldn't be ahead of the read position: ", i6, " > ");
            k3.append(this.f8662b);
            throw new IllegalArgumentException(k3.toString().toString());
        }
        this.f8662b = i6;
        if (this.f8664d > i6) {
            this.f8664d = i6;
        }
    }

    public final void e() {
        int i6 = this.f8666f;
        int i7 = i6 - 8;
        int i8 = this.f8663c;
        if (i7 >= i8) {
            this.f8665e = i7;
            return;
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(B3.e.h(i6, "End gap 8 is too big: capacity is "));
        }
        if (i7 < this.f8664d) {
            throw new IllegalArgumentException(AbstractC1135a.i(new StringBuilder("End gap 8 is too big: there are already "), this.f8664d, " bytes reserved in the beginning"));
        }
        if (this.f8662b == i8) {
            this.f8665e = i7;
            this.f8662b = i7;
            this.f8663c = i7;
        } else {
            throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (this.f8663c - this.f8662b) + " content bytes at offset " + this.f8662b);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer[0x");
        int hashCode = hashCode();
        AbstractC1120d.g(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC1276k.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append("](");
        sb.append(this.f8663c - this.f8662b);
        sb.append(" used, ");
        sb.append(this.f8665e - this.f8663c);
        sb.append(" free, ");
        int i6 = this.f8664d;
        int i7 = this.f8665e;
        int i8 = this.f8666f;
        sb.append((i8 - i7) + i6);
        sb.append(" reserved of ");
        return B3.e.q(sb, i8, ')');
    }
}
