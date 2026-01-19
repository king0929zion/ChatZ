package i1;

/* renamed from: i1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1080D {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1080D f11959c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1080D f11960e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1080D[] f11961f;

                static {
        EnumC1080D r02 = new EnumC1080D();
        f11959c = r02;
        EnumC1080D r12 = new EnumC1080D();
        f11960e = r12;
        f11961f = new EnumC1080D[]{r02, r12, new Enum("SecureOff", 2)};
    }

    public static EnumC1080D valueOf(String str) {
        return (EnumC1080D) Enum.valueOf(EnumC1080D.class, str);
    }

    public static EnumC1080D[] values() {
        return (EnumC1080D[]) f11961f.clone();
    }
}
