package V3;

import B3.e;
import U3.h;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class c {
    public static final byte[] a = new byte[0];

    public static final void a(h hVar, b bVar) {
        AbstractC1276k.f(hVar, "<this>");
        int i6 = bVar.f8666f;
        if (bVar == hVar) {
            return;
        }
        int i7 = bVar.f8663c;
        int i8 = bVar.f8662b;
        if (i7 <= i8) {
            hVar.d(bVar);
            return;
        }
        if (i6 - bVar.f8665e >= 8) {
            hVar.f8682g = i8;
            return;
        }
        b h3 = bVar.h();
        if (h3 == null) {
            hVar.f(bVar);
            return;
        }
        int i9 = bVar.f8663c - bVar.f8662b;
        int min = Math.min(i9, 8 - (i6 - bVar.f8665e));
        if (h3.f8664d < min) {
            hVar.f(bVar);
            return;
        }
        h3.d(h3.f8662b - min);
        if (i9 > min) {
            bVar.f8665e = i6;
            hVar.f8683h = bVar.f8663c;
            hVar.u(hVar.f8684i + min);
        } else {
            hVar.y(h3);
            hVar.u(hVar.f8684i - ((h3.f8663c - h3.f8662b) - min));
            bVar.f();
            bVar.j(hVar.f8679c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0112, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ec, code lost:
    
        c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ef, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(java.nio.ByteBuffer r22, java.lang.CharSequence r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.c.b(java.nio.ByteBuffer, java.lang.CharSequence, int, int, int, int):int");
    }

    public static final void c(int i6) {
        throw new IllegalArgumentException(e.l("Malformed code-point ", i6, " found"));
    }

    public static final b d(h hVar, int i6) {
        AbstractC1276k.f(hVar, "<this>");
        return hVar.q(i6, hVar.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b e(h hVar, b bVar) {
        AbstractC1276k.f(hVar, "<this>");
        if (bVar != hVar) {
            return hVar.d(bVar);
        }
        if (hVar.f8682g == hVar.f8683h && hVar.f8684i == 0) {
            return null;
        }
        return (b) hVar;
    }

    public static final b f(U3.c cVar, int i6, b bVar) {
        AbstractC1276k.f(cVar, "<this>");
        if (bVar != null) {
            cVar.c();
        }
        return cVar.h(i6);
    }
}
