package Z2;

import H0.C0162q;
import f0.C0996s;
import java.util.ListIterator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class P implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10062c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0996s f10063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f10064f;

    public /* synthetic */ P(C0996s c0996s, C c6, int i6) {
        this.f10062c = i6;
        this.f10063e = c0996s;
        this.f10064f = c6;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f10062c) {
            case 0:
                String str = (String) obj;
                AbstractC1276k.f(str, "value");
                C0996s c0996s = this.f10063e;
                ListIterator listIterator = c0996s.listIterator();
                int i6 = 0;
                while (true) {
                    C0162q c0162q = (C0162q) listIterator;
                    if (!c0162q.hasNext()) {
                        i6 = -1;
                    } else if (!AbstractC1276k.b(((C) c0162q.next()).a, this.f10064f.a)) {
                        i6++;
                    }
                }
                if (i6 >= 0) {
                    c0996s.set(i6, C.a((C) c0996s.get(i6), str, null, 5));
                }
                return X3.y.a;
            default:
                String str2 = (String) obj;
                AbstractC1276k.f(str2, "value");
                C0996s c0996s2 = this.f10063e;
                ListIterator listIterator2 = c0996s2.listIterator();
                int i7 = 0;
                while (true) {
                    C0162q c0162q2 = (C0162q) listIterator2;
                    if (!c0162q2.hasNext()) {
                        i7 = -1;
                    } else if (!AbstractC1276k.b(((C) c0162q2.next()).a, this.f10064f.a)) {
                        i7++;
                    }
                }
                if (i7 >= 0) {
                    c0996s2.set(i7, C.a((C) c0996s2.get(i7), null, str2, 3));
                }
                return X3.y.a;
        }
    }
}
