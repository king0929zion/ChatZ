package v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f15277c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Y[] f15278e;

    /* JADX WARN: Type inference failed for: r0v0, types: [v.Y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v.Y, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Horizontal", 0);
        f15277c = r02;
        f15278e = new Y[]{r02, new Enum("Vertical", 1)};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f15278e.clone();
    }
}
