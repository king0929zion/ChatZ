package P1;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class h implements X1.a, H4.a {

    /* renamed from: c, reason: collision with root package name */
    public final X1.a f4578c;

    /* renamed from: e, reason: collision with root package name */
    public final H4.a f4579e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0910h f4580f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f4581g;

    public h(X1.a aVar) {
        H4.c cVar = new H4.c();
        AbstractC1276k.f(aVar, "delegate");
        this.f4578c = aVar;
        this.f4579e = cVar;
    }

    @Override // H4.a
    public final void c(Object obj) {
        this.f4579e.c(null);
    }

    @Override // X1.a
    public final X1.c c0(String str) {
        AbstractC1276k.f(str, "sql");
        return this.f4578c.c0(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f4578c.close();
    }

    @Override // H4.a
    public final Object d(InterfaceC0905c interfaceC0905c) {
        return this.f4579e.d(interfaceC0905c);
    }

    public final void f(StringBuilder sb) {
        if (this.f4580f == null && this.f4581g == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        InterfaceC0910h interfaceC0910h = this.f4580f;
        if (interfaceC0910h != null) {
            sb.append("\t\tCoroutine: " + interfaceC0910h);
            sb.append('\n');
        }
        Throwable th = this.f4581g;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            AbstractC1276k.e(stringWriter2, "toString(...)");
            Iterator it = Y3.m.k0(AbstractC1776n.U(stringWriter2)).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f4578c.toString();
    }
}
