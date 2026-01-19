package T4;

import com.vladsch.flexmark.util.html.Attribute;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8517b;

    /* renamed from: c, reason: collision with root package name */
    public c f8518c;

    /* renamed from: d, reason: collision with root package name */
    public long f8519d;

    public a(String str, boolean z5) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        this.a = str;
        this.f8517b = z5;
        this.f8519d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
