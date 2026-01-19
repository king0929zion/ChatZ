package Y;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public abstract class d implements Iterator, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final o[] f9546c;

    /* renamed from: e, reason: collision with root package name */
    public int f9547e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9548f = true;

    public d(n nVar, o[] oVarArr) {
        this.f9546c = oVarArr;
        oVarArr[0].a(nVar.f9572d, Integer.bitCount(nVar.a) * 2, 0);
        this.f9547e = 0;
        a();
    }

    public final void a() {
        int i6 = this.f9547e;
        o[] oVarArr = this.f9546c;
        o oVar = oVarArr[i6];
        if (oVar.f9575f < oVar.f9574e) {
            return;
        }
        while (-1 < i6) {
            int b5 = b(i6);
            if (b5 == -1) {
                o oVar2 = oVarArr[i6];
                int i7 = oVar2.f9575f;
                Object[] objArr = oVar2.f9573c;
                if (i7 < objArr.length) {
                    int length = objArr.length;
                    oVar2.f9575f = i7 + 1;
                    b5 = b(i6);
                }
            }
            if (b5 != -1) {
                this.f9547e = b5;
                return;
            }
            if (i6 > 0) {
                o oVar3 = oVarArr[i6 - 1];
                int i8 = oVar3.f9575f;
                int length2 = oVar3.f9573c.length;
                oVar3.f9575f = i8 + 1;
            }
            oVarArr[i6].a(n.f9569e.f9572d, 0, 0);
            i6--;
        }
        this.f9548f = false;
    }

    public final int b(int i6) {
        o[] oVarArr = this.f9546c;
        o oVar = oVarArr[i6];
        int i7 = oVar.f9575f;
        if (i7 < oVar.f9574e) {
            return i6;
        }
        Object[] objArr = oVar.f9573c;
        if (i7 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i7];
        AbstractC1276k.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        n nVar = (n) obj;
        if (i6 == 6) {
            o oVar2 = oVarArr[i6 + 1];
            Object[] objArr2 = nVar.f9572d;
            oVar2.a(objArr2, objArr2.length, 0);
        } else {
            oVarArr[i6 + 1].a(nVar.f9572d, Integer.bitCount(nVar.a) * 2, 0);
        }
        return b(i6 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9548f;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f9548f) {
            throw new NoSuchElementException();
        }
        Object next = this.f9546c[this.f9547e].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
