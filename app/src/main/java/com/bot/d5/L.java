package d5;

import androidx.lifecycle.N;
import com.vladsch.flexmark.util.html.Attribute;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class L extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final y f11461e;

    /* renamed from: b, reason: collision with root package name */
    public final y f11462b;

    /* renamed from: c, reason: collision with root package name */
    public final o f11463c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f11464d;

    static {
        String str = y.f11513e;
        f11461e = N.r("/");
    }

    public L(y yVar, o oVar, LinkedHashMap linkedHashMap) {
        this.f11462b = yVar;
        this.f11463c = oVar;
        this.f11464d = linkedHashMap;
    }

    @Override // d5.o
    public final G a(y yVar) {
        AbstractC1276k.f(yVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // d5.o
    public final void b(y yVar, y yVar2) {
        AbstractC1276k.f(yVar, "source");
        AbstractC1276k.f(yVar2, Attribute.TARGET_ATTR);
        throw new IOException("zip file systems are read-only");
    }

    @Override // d5.o
    public final void c(y yVar) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // d5.o
    public final void d(y yVar) {
        AbstractC1276k.f(yVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // d5.o
    public final List g(y yVar) {
        y yVar2 = f11461e;
        yVar2.getClass();
        e5.g gVar = (e5.g) this.f11464d.get(e5.c.b(yVar2, yVar, true));
        if (gVar != null) {
            return Y3.m.J0(gVar.f11625q);
        }
        throw new IOException("not a directory: " + yVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    @Override // d5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d5.n i(d5.y r26) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.L.i(d5.y):d5.n");
    }

    @Override // d5.o
    public final u j(y yVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // d5.o
    public final G k(y yVar) {
        AbstractC1276k.f(yVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // d5.o
    public final I l(y yVar) {
        Throwable th;
        C c6;
        AbstractC1276k.f(yVar, "file");
        y yVar2 = f11461e;
        yVar2.getClass();
        e5.g gVar = (e5.g) this.f11464d.get(e5.c.b(yVar2, yVar, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + yVar);
        }
        long j3 = gVar.f11614f;
        u j4 = this.f11463c.j(this.f11462b);
        try {
            c6 = AbstractC0942b.c(j4.c(gVar.f11616h));
            try {
                j4.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (j4 != null) {
                try {
                    j4.close();
                } catch (Throwable th4) {
                    X3.a.a(th3, th4);
                }
            }
            th = th3;
            c6 = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC1276k.f(c6, "<this>");
        e5.b.f(c6, null);
        if (gVar.f11615g == 0) {
            return new e5.e(c6, j3, true);
        }
        return new e5.e(new t(AbstractC0942b.c(new e5.e(c6, gVar.f11613e, true)), new Inflater(true)), j3, false);
    }
}
