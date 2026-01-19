package d5;

import androidx.lifecycle.N;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class y implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f11513e;

    /* renamed from: c, reason: collision with root package name */
    public final C0952l f11514c;

    static {
        String str = File.separator;
        AbstractC1276k.e(str, "separator");
        f11513e = str;
    }

    public y(C0952l c0952l) {
        AbstractC1276k.f(c0952l, "bytes");
        this.f11514c = c0952l;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a = e5.c.a(this);
        C0952l c0952l = this.f11514c;
        if (a == -1) {
            a = 0;
        } else if (a < c0952l.d() && c0952l.i(a) == 92) {
            a++;
        }
        int d6 = c0952l.d();
        int i6 = a;
        while (a < d6) {
            if (c0952l.i(a) == 47 || c0952l.i(a) == 92) {
                arrayList.add(c0952l.n(i6, a));
                i6 = a + 1;
            }
            a++;
        }
        if (i6 < c0952l.d()) {
            arrayList.add(c0952l.n(i6, c0952l.d()));
        }
        return arrayList;
    }

    public final y b() {
        C0952l c0952l = e5.c.f11600d;
        C0952l c0952l2 = this.f11514c;
        if (AbstractC1276k.b(c0952l2, c0952l)) {
            return null;
        }
        C0952l c0952l3 = e5.c.a;
        if (AbstractC1276k.b(c0952l2, c0952l3)) {
            return null;
        }
        C0952l c0952l4 = e5.c.f11598b;
        if (AbstractC1276k.b(c0952l2, c0952l4)) {
            return null;
        }
        C0952l c0952l5 = e5.c.f11601e;
        c0952l2.getClass();
        AbstractC1276k.f(c0952l5, "suffix");
        int d6 = c0952l2.d();
        byte[] bArr = c0952l5.f11484c;
        if (c0952l2.l(d6 - bArr.length, c0952l5, bArr.length) && (c0952l2.d() == 2 || c0952l2.l(c0952l2.d() - 3, c0952l3, 1) || c0952l2.l(c0952l2.d() - 3, c0952l4, 1))) {
            return null;
        }
        int k3 = C0952l.k(c0952l2, c0952l3);
        if (k3 == -1) {
            k3 = C0952l.k(c0952l2, c0952l4);
        }
        if (k3 == 2 && f() != null) {
            if (c0952l2.d() == 3) {
                return null;
            }
            return new y(C0952l.o(c0952l2, 0, 3, 1));
        }
        if (k3 == 1) {
            AbstractC1276k.f(c0952l4, "prefix");
            if (c0952l2.l(0, c0952l4, c0952l4.d())) {
                return null;
            }
        }
        if (k3 != -1 || f() == null) {
            return k3 == -1 ? new y(c0952l) : k3 == 0 ? new y(C0952l.o(c0952l2, 0, 1, 1)) : new y(C0952l.o(c0952l2, 0, k3, 1));
        }
        if (c0952l2.d() == 2) {
            return null;
        }
        return new y(C0952l.o(c0952l2, 0, 2, 1));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [d5.i, java.lang.Object] */
    public final y c(y yVar) {
        AbstractC1276k.f(yVar, "other");
        C0952l c0952l = yVar.f11514c;
        int a = e5.c.a(this);
        C0952l c0952l2 = this.f11514c;
        y yVar2 = a == -1 ? null : new y(c0952l2.n(0, a));
        int a6 = e5.c.a(yVar);
        if (!AbstractC1276k.b(yVar2, a6 != -1 ? new y(c0952l.n(0, a6)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + yVar).toString());
        }
        ArrayList a7 = a();
        ArrayList a8 = yVar.a();
        int min = Math.min(a7.size(), a8.size());
        int i6 = 0;
        while (i6 < min && AbstractC1276k.b(a7.get(i6), a8.get(i6))) {
            i6++;
        }
        if (i6 == min && c0952l2.d() == c0952l.d()) {
            return N.r(".");
        }
        if (a8.subList(i6, a8.size()).indexOf(e5.c.f11601e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + yVar).toString());
        }
        Object obj = new Object();
        C0952l c6 = e5.c.c(yVar);
        if (c6 == null && (c6 = e5.c.c(this)) == null) {
            c6 = e5.c.f(f11513e);
        }
        int size = a8.size();
        for (int i7 = i6; i7 < size; i7++) {
            obj.N(e5.c.f11601e);
            obj.N(c6);
        }
        int size2 = a7.size();
        while (i6 < size2) {
            obj.N((C0952l) a7.get(i6));
            obj.N(c6);
            i6++;
        }
        return e5.c.d(obj, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        AbstractC1276k.f(yVar, "other");
        return this.f11514c.compareTo(yVar.f11514c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d5.i, java.lang.Object] */
    public final y d(String str) {
        AbstractC1276k.f(str, "child");
        Object obj = new Object();
        obj.g0(str);
        return e5.c.b(this, e5.c.d(obj, false), false);
    }

    public final Path e() {
        Path path = Paths.get(this.f11514c.q(), new String[0]);
        AbstractC1276k.e(path, "get(...)");
        return path;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && AbstractC1276k.b(((y) obj).f11514c, this.f11514c);
    }

    public final Character f() {
        C0952l c0952l = e5.c.a;
        C0952l c0952l2 = this.f11514c;
        if (C0952l.g(c0952l2, c0952l) != -1 || c0952l2.d() < 2 || c0952l2.i(1) != 58) {
            return null;
        }
        char i6 = (char) c0952l2.i(0);
        if (('a' > i6 || i6 >= '{') && ('A' > i6 || i6 >= '[')) {
            return null;
        }
        return Character.valueOf(i6);
    }

    public final int hashCode() {
        return this.f11514c.hashCode();
    }

    public final File toFile() {
        return new File(this.f11514c.q());
    }

    public final String toString() {
        return this.f11514c.q();
    }
}
