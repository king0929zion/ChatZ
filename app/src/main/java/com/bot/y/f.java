package Y;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: g, reason: collision with root package name */
    public final e f9555g;

    /* renamed from: h, reason: collision with root package name */
    public Object f9556h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9557i;

    /* renamed from: j, reason: collision with root package name */
    public int f9558j;

    public f(e eVar, o[] oVarArr) {
        super(eVar.f9551f, oVarArr);
        this.f9555g = eVar;
        this.f9558j = eVar.f9553h;
    }

    public final void c(int i6, n nVar, Object obj, int i7) {
        int i8 = i7 * 5;
        o[] oVarArr = this.f9546c;
        if (i8 <= 30) {
            int x5 = 1 << AbstractC1410a.x(i6, i8);
            if (nVar.h(x5)) {
                oVarArr[i7].a(nVar.f9572d, Integer.bitCount(nVar.a) * 2, nVar.f(x5));
                this.f9547e = i7;
                return;
            } else {
                int t5 = nVar.t(x5);
                n s5 = nVar.s(t5);
                oVarArr[i7].a(nVar.f9572d, Integer.bitCount(nVar.a) * 2, t5);
                c(i6, s5, obj, i7 + 1);
                return;
            }
        }
        o oVar = oVarArr[i7];
        Object[] objArr = nVar.f9572d;
        oVar.a(objArr, objArr.length, 0);
        while (true) {
            o oVar2 = oVarArr[i7];
            if (AbstractC1276k.b(oVar2.f9573c[oVar2.f9575f], obj)) {
                this.f9547e = i7;
                return;
            } else {
                oVarArr[i7].f9575f += 2;
            }
        }
    }

    @Override // Y.d, java.util.Iterator
    public final Object next() {
        if (this.f9555g.f9553h != this.f9558j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f9548f) {
            throw new NoSuchElementException();
        }
        o oVar = this.f9546c[this.f9547e];
        this.f9556h = oVar.f9573c[oVar.f9575f];
        this.f9557i = true;
        return super.next();
    }

    @Override // Y.d, java.util.Iterator
    public final void remove() {
        if (!this.f9557i) {
            throw new IllegalStateException();
        }
        boolean z5 = this.f9548f;
        e eVar = this.f9555g;
        if (!z5) {
            AbstractC1291z.a(eVar).remove(this.f9556h);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            o oVar = this.f9546c[this.f9547e];
            Object obj = oVar.f9573c[oVar.f9575f];
            AbstractC1291z.a(eVar).remove(this.f9556h);
            c(obj != null ? obj.hashCode() : 0, eVar.f9551f, obj, 0);
        }
        this.f9556h = null;
        this.f9557i = false;
        this.f9558j = eVar.f9553h;
    }
}
