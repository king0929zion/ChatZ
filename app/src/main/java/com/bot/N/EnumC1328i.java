package n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1328i {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1328i f13161c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1328i f13162e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1328i[] f13163f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n.i] */
    static {
        ?? r02 = new Enum("BoundReached", 0);
        f13161c = r02;
        ?? r12 = new Enum("Finished", 1);
        f13162e = r12;
        f13163f = new EnumC1328i[]{r02, r12};
    }

    public static EnumC1328i valueOf(String str) {
        return (EnumC1328i) Enum.valueOf(EnumC1328i.class, str);
    }

    public static EnumC1328i[] values() {
        return (EnumC1328i[]) f13163f.clone();
    }
}
