package I0;

import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import m4.AbstractC1276k;

/* renamed from: I0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0173b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public String f2279b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2280c;

    public AbstractC0173b(String str, List list) {
        this.a = 1;
        AbstractC1276k.f(str, "content");
        AbstractC1276k.f(list, "parameters");
        this.f2279b = str;
        this.f2280c = list;
    }

    public abstract int[] a(int i6);

    public int[] b(int i6, int i7) {
        if (i6 < 0 || i7 < 0 || i6 == i7) {
            return null;
        }
        int[] iArr = (int[]) this.f2280c;
        iArr[0] = i6;
        iArr[1] = i7;
        return iArr;
    }

    public String c() {
        String str = this.f2279b;
        if (str != null) {
            return str;
        }
        AbstractC1276k.k("text");
        throw null;
    }

    public String d(String str) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        List list = (List) this.f2280c;
        int C5 = Y4.l.C(list);
        if (C5 < 0) {
            return null;
        }
        int i6 = 0;
        while (true) {
            I3.j jVar = (I3.j) list.get(i6);
            if (u4.u.x(jVar.a, str, true)) {
                return jVar.f2748b;
            }
            if (i6 == C5) {
                return null;
            }
            i6++;
        }
    }

    public abstract int[] e(int i6);

    /* JADX WARN: Removed duplicated region for block: B:41:0x012e A[LOOP:1: B:16:0x004f->B:41:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.AbstractC0173b.toString():java.lang.String");
    }

    public AbstractC0173b() {
        this.a = 0;
        this.f2280c = new int[2];
    }
}
