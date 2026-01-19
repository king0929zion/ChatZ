package Z3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class c extends e implements Iterator, InterfaceC1372a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10517h;

    public c(f fVar, int i6) {
        this.f10517h = i6;
        AbstractC1276k.f(fVar, "map");
        this.f10524g = fVar;
        this.f10522e = -1;
        this.f10523f = fVar.f10533k;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10517h) {
            case 0:
                b();
                int i6 = this.f10521c;
                f fVar = (f) this.f10524g;
                if (i6 >= fVar.f10531i) {
                    throw new NoSuchElementException();
                }
                this.f10521c = i6 + 1;
                this.f10522e = i6;
                d dVar = new d(fVar, i6);
                c();
                return dVar;
            case 1:
                b();
                int i7 = this.f10521c;
                f fVar2 = (f) this.f10524g;
                if (i7 >= fVar2.f10531i) {
                    throw new NoSuchElementException();
                }
                this.f10521c = i7 + 1;
                this.f10522e = i7;
                Object obj = fVar2.f10526c[i7];
                c();
                return obj;
            default:
                b();
                int i8 = this.f10521c;
                f fVar3 = (f) this.f10524g;
                if (i8 >= fVar3.f10531i) {
                    throw new NoSuchElementException();
                }
                this.f10521c = i8 + 1;
                this.f10522e = i8;
                Object[] objArr = fVar3.f10527e;
                AbstractC1276k.c(objArr);
                Object obj2 = objArr[this.f10522e];
                c();
                return obj2;
        }
    }
}
