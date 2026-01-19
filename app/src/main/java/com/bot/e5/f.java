package e5;

import X3.n;
import Y3.m;
import Y3.r;
import androidx.lifecycle.N;
import com.vladsch.flexmark.util.html.Attribute;
import d5.AbstractC0942b;
import d5.G;
import d5.I;
import d5.o;
import d5.u;
import d5.v;
import d5.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final y f11606e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f11607b;

    /* renamed from: c, reason: collision with root package name */
    public final o f11608c;

    /* renamed from: d, reason: collision with root package name */
    public final n f11609d;

    static {
        String str = y.f11513e;
        f11606e = N.r("/");
    }

    public f(ClassLoader classLoader) {
        v vVar = o.a;
        AbstractC1276k.f(vVar, "systemFileSystem");
        this.f11607b = classLoader;
        this.f11608c = vVar;
        this.f11609d = X3.a.d(new A0.b(this, 14));
    }

    @Override // d5.o
    public final G a(y yVar) {
        AbstractC1276k.f(yVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // d5.o
    public final void b(y yVar, y yVar2) {
        AbstractC1276k.f(yVar, "source");
        AbstractC1276k.f(yVar2, Attribute.TARGET_ATTR);
        throw new IOException(this + " is read-only");
    }

    @Override // d5.o
    public final void c(y yVar) {
        throw new IOException(this + " is read-only");
    }

    @Override // d5.o
    public final void d(y yVar) {
        AbstractC1276k.f(yVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // d5.o
    public final List g(y yVar) {
        y yVar2 = f11606e;
        yVar2.getClass();
        String q3 = c.b(yVar2, yVar, true).c(yVar2).f11514c.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z5 = false;
        for (X3.i iVar : (List) this.f11609d.getValue()) {
            o oVar = (o) iVar.f9393c;
            y yVar3 = (y) iVar.f9394e;
            try {
                List g3 = oVar.g(yVar3.d(q3));
                ArrayList arrayList = new ArrayList();
                for (Object obj : g3) {
                    if (N.g((y) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(Y3.n.Z(arrayList, 10));
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    y yVar4 = (y) obj2;
                    AbstractC1276k.f(yVar4, "<this>");
                    String replace = AbstractC1776n.X(yVar4.f11514c.q(), yVar3.f11514c.q()).replace('\\', '/');
                    AbstractC1276k.e(replace, "replace(...)");
                    arrayList2.add(yVar2.d(replace));
                }
                r.c0(arrayList2, linkedHashSet);
                z5 = true;
            } catch (IOException unused) {
            }
        }
        if (z5) {
            return m.J0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    @Override // d5.o
    public final d5.n i(y yVar) {
        AbstractC1276k.f(yVar, "path");
        if (!N.g(yVar)) {
            return null;
        }
        y yVar2 = f11606e;
        yVar2.getClass();
        String q3 = c.b(yVar2, yVar, true).c(yVar2).f11514c.q();
        for (X3.i iVar : (List) this.f11609d.getValue()) {
            d5.n i6 = ((o) iVar.f9393c).i(((y) iVar.f9394e).d(q3));
            if (i6 != null) {
                return i6;
            }
        }
        return null;
    }

    @Override // d5.o
    public final u j(y yVar) {
        if (!N.g(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f11606e;
        yVar2.getClass();
        String q3 = c.b(yVar2, yVar, true).c(yVar2).f11514c.q();
        for (X3.i iVar : (List) this.f11609d.getValue()) {
            try {
                return ((o) iVar.f9393c).j(((y) iVar.f9394e).d(q3));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    @Override // d5.o
    public final G k(y yVar) {
        AbstractC1276k.f(yVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // d5.o
    public final I l(y yVar) {
        AbstractC1276k.f(yVar, "file");
        if (!N.g(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f11606e;
        yVar2.getClass();
        URL resource = this.f11607b.getResource(c.b(yVar2, yVar, false).c(yVar2).f11514c.q());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        AbstractC1276k.e(inputStream, "getInputStream(...)");
        return AbstractC0942b.h(inputStream);
    }
}
