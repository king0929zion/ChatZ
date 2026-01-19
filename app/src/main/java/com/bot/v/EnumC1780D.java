package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1780D {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1780D f15205c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1780D[] f15206e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1780D EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v.D] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v.D] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, v.D] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, v.D] */
    static {
        ?? r02 = new Enum("Visible", 0);
        ?? r12 = new Enum("Clip", 1);
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
