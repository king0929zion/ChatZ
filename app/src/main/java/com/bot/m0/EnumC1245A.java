package m0;

/* renamed from: m0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1245A {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1245A f12868c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1245A f12869e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1245A f12870f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1245A[] f12871g;

                    static {
        EnumC1245A r02 = new EnumC1245A();
        f12868c = r02;
        EnumC1245A r12 = new EnumC1245A();
        f12869e = r12;
        EnumC1245A r22 = new EnumC1245A();
        EnumC1245A r32 = new EnumC1245A();
        f12870f = r32;
        f12871g = new EnumC1245A[]{r02, r12, r22, r32};
    }

    public static EnumC1245A valueOf(String str) {
        return (EnumC1245A) Enum.valueOf(EnumC1245A.class, str);
    }

    public static EnumC1245A[] values() {
        return (EnumC1245A[]) f12871g.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new RuntimeException();
    }

    public final boolean b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                throw new RuntimeException();
            }
        }
        return true;
    }
}
