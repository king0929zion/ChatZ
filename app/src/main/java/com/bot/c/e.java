package C;

/* loaded from: classes.dex */
public abstract class e {
    public static final d a;

    static {
        c cVar = new c(50);
        a = new d(cVar, cVar, cVar, cVar);
    }

    public static final d a(float f6) {
        b bVar = new b(f6);
        return new d(bVar, bVar, bVar, bVar);
    }

    public static final d b(float f6, float f7, float f8, float f9) {
        return new d(new b(f6), new b(f7), new b(f8), new b(f9));
    }

    public static d c(float f6, float f7, float f8, float f9, int i6) {
        if ((i6 & 1) != 0) {
            f6 = 0;
        }
        if ((i6 & 2) != 0) {
            f7 = 0;
        }
        if ((i6 & 4) != 0) {
            f8 = 0;
        }
        if ((i6 & 8) != 0) {
            f9 = 0;
        }
        return b(f6, f7, f8, f9);
    }
}
