package B3;

import B0.H;
import T.AbstractC0629s;
import T.InterfaceC0598c;
import com.vladsch.flexmark.parser.PegdownExtensions;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1343r;
import n.C1295D;
import n.H0;
import n.InterfaceC1349x;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class s implements g, InterfaceC0598c, H0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f553c;

    /* renamed from: e, reason: collision with root package name */
    public int f554e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f555f;

    public s(g gVar) {
        this.f553c = 4000;
        this.f554e = 3000;
        this.f555f = gVar;
    }

    @Override // T.InterfaceC0598c
    public void c(int i6, Object obj) {
        ((InterfaceC0598c) this.f555f).c(i6 + (this.f554e == 0 ? this.f553c : 0), obj);
    }

    @Override // T.InterfaceC0598c
    public void d(Object obj) {
        this.f554e++;
        ((InterfaceC0598c) this.f555f).d(obj);
    }

    @Override // T.InterfaceC0598c
    public void e() {
        ((InterfaceC0598c) this.f555f).e();
    }

    @Override // T.InterfaceC0598c
    public void f(int i6, int i7, int i8) {
        int i9 = this.f554e == 0 ? this.f553c : 0;
        ((InterfaceC0598c) this.f555f).f(i6 + i9, i7 + i9, i8);
    }

    @Override // T.InterfaceC0598c
    public void g(int i6, int i7) {
        ((InterfaceC0598c) this.f555f).g(i6 + (this.f554e == 0 ? this.f553c : 0), i7);
    }

    @Override // n.F0
    public AbstractC1343r i(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H) this.f555f).i(j3, abstractC1343r, abstractC1343r2, abstractC1343r3);
    }

    @Override // T.InterfaceC0598c
    public void j() {
        if (!(this.f554e > 0)) {
            AbstractC0629s.a("OffsetApplier up called with no corresponding down");
        }
        this.f554e--;
        ((InterfaceC0598c) this.f555f).j();
    }

    @Override // B3.g
    public void k(String str) {
        AbstractC1276k.f(str, "message");
        g gVar = (g) this.f555f;
        while (true) {
            int length = str.length();
            int i6 = this.f553c;
            if (length <= i6) {
                gVar.k(str);
                return;
            }
            String substring = str.substring(0, i6);
            AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int S5 = AbstractC1776n.S(substring, '\n', 0, 6);
            if (S5 >= this.f554e) {
                substring = substring.substring(0, S5);
                AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                i6 = S5 + 1;
            }
            gVar.k(substring);
            str = str.substring(i6);
            AbstractC1276k.e(str, "this as java.lang.String).substring(startIndex)");
        }
    }

    @Override // T.InterfaceC0598c
    public void l(Object obj, l4.e eVar) {
        ((InterfaceC0598c) this.f555f).l(obj, eVar);
    }

    @Override // T.InterfaceC0598c
    public void m(int i6, Object obj) {
        ((InterfaceC0598c) this.f555f).m(i6 + (this.f554e == 0 ? this.f553c : 0), obj);
    }

    @Override // T.InterfaceC0598c
    public Object o() {
        return ((InterfaceC0598c) this.f555f).o();
    }

    @Override // n.H0
    public int p() {
        return this.f554e;
    }

    @Override // n.F0
    public AbstractC1343r q(long j3, AbstractC1343r abstractC1343r, AbstractC1343r abstractC1343r2, AbstractC1343r abstractC1343r3) {
        return ((H) this.f555f).q(j3, abstractC1343r, abstractC1343r2, abstractC1343r3);
    }

    @Override // n.H0
    public int r() {
        return this.f553c;
    }

    public s() {
        this.f555f = new s[PegdownExtensions.WIKILINKS];
        this.f553c = 0;
        this.f554e = 0;
    }

    public s(int i6, int i7) {
        this.f555f = null;
        this.f553c = i6;
        int i8 = i7 & 7;
        this.f554e = i8 == 0 ? 8 : i8;
    }

    public s(InterfaceC0598c interfaceC0598c, int i6) {
        this.f555f = interfaceC0598c;
        this.f553c = i6;
    }

    public s(int i6, int i7, InterfaceC1193a interfaceC1193a) {
        this.f553c = i6;
        this.f554e = i7;
        this.f555f = interfaceC1193a;
    }

    public s(int i6, int i7, InterfaceC1349x interfaceC1349x) {
        this.f553c = i6;
        this.f554e = i7;
        this.f555f = new H(new C1295D(i6, i7, interfaceC1349x));
    }
}
