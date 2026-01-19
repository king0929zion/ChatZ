package d5;

import androidx.lifecycle.N;
import java.io.FileNotFoundException;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class o {
    public static final v a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [d5.v] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        Object r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        a = r02;
        String str = y.f11513e;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC1276k.e(property, "getProperty(...)");
        N.r(property);
        ClassLoader classLoader = e5.f.class.getClassLoader();
        AbstractC1276k.e(classLoader, "getClassLoader(...)");
        new e5.f(classLoader);
    }

    public abstract G a(y yVar);

    public abstract void b(y yVar, y yVar2);

    public abstract void c(y yVar);

    public abstract void d(y yVar);

    public final void e(y yVar) {
        AbstractC1276k.f(yVar, "path");
        d(yVar);
    }

    public final boolean f(y yVar) {
        AbstractC1276k.f(yVar, "path");
        return i(yVar) != null;
    }

    public abstract List g(y yVar);

    public final n h(y yVar) {
        AbstractC1276k.f(yVar, "path");
        n i6 = i(yVar);
        if (i6 != null) {
            return i6;
        }
        throw new FileNotFoundException("no such file: " + yVar);
    }

    public abstract n i(y yVar);

    public abstract u j(y yVar);

    public abstract G k(y yVar);

    public abstract I l(y yVar);
}
