package V;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k.T;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1374c;

/* loaded from: classes.dex */
public final class c implements List, InterfaceC1374c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8752c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8753e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8754f;

    /* renamed from: g, reason: collision with root package name */
    public int f8755g;

    public /* synthetic */ c(List list, int i6, int i7, int i8) {
        this.f8752c = i8;
        this.f8753e = list;
        this.f8754f = i6;
        this.f8755g = i7;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g;
                this.f8755g = i6 + 1;
                this.f8753e.add(i6, obj);
                return true;
            default:
                int i7 = this.f8755g;
                this.f8755g = i7 + 1;
                this.f8753e.add(i7, obj);
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final boolean addAll(int i6, Collection collection) {
        switch (this.f8752c) {
            case 0:
                this.f8753e.addAll(i6 + this.f8754f, collection);
                int size = collection.size();
                this.f8755g += size;
                return size > 0;
            default:
                AbstractC1276k.f(collection, "elements");
                this.f8753e.addAll(i6 + this.f8754f, collection);
                this.f8755g = collection.size() + this.f8755g;
                return collection.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g - 1;
                int i7 = this.f8754f;
                if (i7 <= i6) {
                    while (true) {
                        this.f8753e.remove(i6);
                        if (i6 != i7) {
                            i6--;
                        }
                    }
                }
                this.f8755g = i7;
                return;
            default:
                int i8 = this.f8755g - 1;
                int i9 = this.f8754f;
                if (i9 <= i8) {
                    while (true) {
                        this.f8753e.remove(i8);
                        if (i8 != i9) {
                            i8--;
                        }
                    }
                }
                this.f8755g = i9;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g;
                for (int i7 = this.f8754f; i7 < i6; i7++) {
                    if (AbstractC1276k.b(this.f8753e.get(i7), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i8 = this.f8755g;
                for (int i9 = this.f8754f; i9 < i8; i9++) {
                    if (AbstractC1276k.b(this.f8753e.get(i9), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f8752c) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                AbstractC1276k.f(collection, "elements");
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object get(int i6) {
        switch (this.f8752c) {
            case 0:
                f.a(this, i6);
                return this.f8753e.get(i6 + this.f8754f);
            default:
                T.a(this, i6);
                return this.f8753e.get(i6 + this.f8754f);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g;
                int i7 = this.f8754f;
                for (int i8 = i7; i8 < i6; i8++) {
                    if (AbstractC1276k.b(this.f8753e.get(i8), obj)) {
                        return i8 - i7;
                    }
                }
                return -1;
            default:
                int i9 = this.f8755g;
                int i10 = this.f8754f;
                for (int i11 = i10; i11 < i9; i11++) {
                    if (AbstractC1276k.b(this.f8753e.get(i11), obj)) {
                        return i11 - i10;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f8752c) {
            case 0:
                return this.f8755g == this.f8754f;
            default:
                return this.f8755g == this.f8754f;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8752c) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g - 1;
                int i7 = this.f8754f;
                if (i7 <= i6) {
                    while (!AbstractC1276k.b(this.f8753e.get(i6), obj)) {
                        if (i6 != i7) {
                            i6--;
                        }
                    }
                    return i6 - i7;
                }
                return -1;
            default:
                int i8 = this.f8755g - 1;
                int i9 = this.f8754f;
                if (i9 <= i8) {
                    while (!AbstractC1276k.b(this.f8753e.get(i8), obj)) {
                        if (i8 != i9) {
                            i8--;
                        }
                    }
                    return i8 - i9;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f8752c) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g;
                for (int i7 = this.f8754f; i7 < i6; i7++) {
                    ?? r22 = this.f8753e;
                    if (AbstractC1276k.b(r22.get(i7), obj)) {
                        r22.remove(i7);
                        this.f8755g--;
                        return true;
                    }
                }
                return false;
            default:
                int i8 = this.f8755g;
                for (int i9 = this.f8754f; i9 < i8; i9++) {
                    ?? r23 = this.f8753e;
                    if (AbstractC1276k.b(r23.get(i9), obj)) {
                        r23.remove(i9);
                        this.f8755g--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i6 != this.f8755g;
            default:
                AbstractC1276k.f(collection, "elements");
                int i7 = this.f8755g;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i7 != this.f8755g;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f8752c) {
            case 0:
                int i6 = this.f8755g;
                int i7 = i6 - 1;
                int i8 = this.f8754f;
                if (i8 <= i7) {
                    while (true) {
                        ?? r32 = this.f8753e;
                        if (!collection.contains(r32.get(i7))) {
                            r32.remove(i7);
                            this.f8755g--;
                        }
                        if (i7 != i8) {
                            i7--;
                        }
                    }
                }
                return i6 != this.f8755g;
            default:
                AbstractC1276k.f(collection, "elements");
                int i9 = this.f8755g;
                int i10 = i9 - 1;
                int i11 = this.f8754f;
                if (i11 <= i10) {
                    while (true) {
                        ?? r33 = this.f8753e;
                        if (!collection.contains(r33.get(i10))) {
                            r33.remove(i10);
                            this.f8755g--;
                        }
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                return i9 != this.f8755g;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object set(int i6, Object obj) {
        switch (this.f8752c) {
            case 0:
                f.a(this, i6);
                return this.f8753e.set(i6 + this.f8754f, obj);
            default:
                T.a(this, i6);
                return this.f8753e.set(i6 + this.f8754f, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i6;
        int i7;
        switch (this.f8752c) {
            case 0:
                i6 = this.f8755g;
                i7 = this.f8754f;
                break;
            default:
                i6 = this.f8755g;
                i7 = this.f8754f;
                break;
        }
        return i6 - i7;
    }

    @Override // java.util.List
    public final List subList(int i6, int i7) {
        switch (this.f8752c) {
            case 0:
                f.b(this, i6, i7);
                return new c(this, i6, i7, 0);
            default:
                T.b(this, i6, i7);
                return new c(this, i6, i7, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f8752c) {
            case 0:
                return AbstractC1275j.a(this);
            default:
                return AbstractC1275j.a(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final void add(int i6, Object obj) {
        switch (this.f8752c) {
            case 0:
                this.f8753e.add(i6 + this.f8754f, obj);
                this.f8755g++;
                return;
            default:
                this.f8753e.add(i6 + this.f8754f, obj);
                this.f8755g++;
                return;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i6) {
        switch (this.f8752c) {
            case 0:
                return new d(this, i6, 0);
            default:
                return new d(this, i6, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f8752c) {
            case 0:
                return AbstractC1275j.b(this, objArr);
            default:
                AbstractC1276k.f(objArr, "array");
                return AbstractC1275j.b(this, objArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f8752c) {
            case 0:
                this.f8753e.addAll(this.f8755g, collection);
                int size = collection.size();
                this.f8755g += size;
                return size > 0;
            default:
                AbstractC1276k.f(collection, "elements");
                this.f8753e.addAll(this.f8755g, collection);
                this.f8755g = collection.size() + this.f8755g;
                return collection.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object remove(int i6) {
        switch (this.f8752c) {
            case 0:
                f.a(this, i6);
                this.f8755g--;
                return this.f8753e.remove(i6 + this.f8754f);
            default:
                T.a(this, i6);
                this.f8755g--;
                return this.f8753e.remove(i6 + this.f8754f);
        }
    }
}
