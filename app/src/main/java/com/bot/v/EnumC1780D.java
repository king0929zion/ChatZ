package v;

/* renamed from: v.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1780D {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1780D f15205c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1780D[] f15206e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1780D EF0;

                    static {
        EnumC1780D r02 = new EnumC1780D();
        EnumC1780D r12 = new EnumC1780D();
        f15205c = r12;
        f15206e = new EnumC1780D[]{r02, r12, new Enum("ExpandIndicator", 2), new Enum("ExpandOrCollapseIndicator", 3)};
    }

    public static EnumC1780D valueOf(String str) {
        return (EnumC1780D) Enum.valueOf(EnumC1780D.class, str);
    }

    public static EnumC1780D[] values() {
        return (EnumC1780D[]) f15206e.clone();
    }
}
