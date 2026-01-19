package x4;

/* loaded from: classes.dex */
public abstract class v0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static AbstractC1908V a() {
        ThreadLocal threadLocal = a;
        AbstractC1908V abstractC1908V = (AbstractC1908V) threadLocal.get();
        if (abstractC1908V != null) {
            return abstractC1908V;
        }
        C1924g c1924g = new C1924g(Thread.currentThread());
        threadLocal.set(c1924g);
        return c1924g;
    }
}
