package S0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: S0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542d implements Appendable {

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f7623c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7624e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7625f;

    public C0542d() {
        this.f7623c = new StringBuilder(16);
        this.f7624e = new ArrayList();
        this.f7625f = new ArrayList();
        new ArrayList();
    }

    public final void a(G g3, int i6, int i7) {
        this.f7625f.add(new C0541c(g3, i6, i7, 8));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0545g) {
            c((C0545g) charSequence);
            return this;
        }
        this.f7623c.append(charSequence);
        return this;
    }

    public final void b(char c6) {
        this.f7623c.append(c6);
    }

    public final void c(C0545g c0545g) {
        StringBuilder sb = this.f7623c;
        int length = sb.length();
        sb.append(c0545g.f7630e);
        List list = c0545g.f7629c;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0543e c0543e = (C0543e) list.get(i6);
                this.f7625f.add(new C0541c(c0543e.a, c0543e.f7626b + length, c0543e.f7627c + length, c0543e.f7628d));
            }
        }
    }

    public final void d(C0545g c0545g, int i6, int i7) {
        StringBuilder sb = this.f7623c;
        int length = sb.length();
        sb.append((CharSequence) c0545g.f7630e, i6, i7);
        List a = AbstractC0546h.a(c0545g, i6, i7, null);
        if (a != null) {
            int size = a.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0543e c0543e = (C0543e) a.get(i8);
                this.f7625f.add(new C0541c(c0543e.a, c0543e.f7626b + length, c0543e.f7627c + length, c0543e.f7628d));
            }
        }
    }

    public final void e(String str) {
        this.f7623c.append(str);
    }

    public final void f(int i6) {
        ArrayList arrayList = this.f7624e;
        if (i6 >= arrayList.size()) {
            Y0.a.b(i6 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i6) {
            if (arrayList.isEmpty()) {
                Y0.a.b("Nothing to pop.");
            }
            ((C0541c) arrayList.remove(arrayList.size() - 1)).f7621c = this.f7623c.length();
        }
    }

    public final int g(AbstractC0552n abstractC0552n) {
        C0541c c0541c = new C0541c(abstractC0552n, this.f7623c.length(), 0, 12);
        this.f7624e.add(c0541c);
        this.f7625f.add(c0541c);
        return r5.size() - 1;
    }

    public final int h(G g3) {
        C0541c c0541c = new C0541c(g3, this.f7623c.length(), 0, 12);
        this.f7624e.add(c0541c);
        this.f7625f.add(c0541c);
        return r5.size() - 1;
    }

    public final C0545g i() {
        StringBuilder sb = this.f7623c;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f7625f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList2.add(((C0541c) arrayList.get(i6)).a(sb.length()));
        }
        return new C0545g(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i6, int i7) {
        if (charSequence instanceof C0545g) {
            d((C0545g) charSequence, i6, i7);
            return this;
        }
        this.f7623c.append(charSequence, i6, i7);
        return this;
    }

    public C0542d(C0545g c0545g) {
        this();
        c(c0545g);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) {
        this.f7623c.append(c6);
        return this;
    }
}
