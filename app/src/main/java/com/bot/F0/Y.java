package F0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f1461c;

    /* renamed from: e, reason: collision with root package name */
    public static final Y f1462e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Y[] f1463f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, F0.Y] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, F0.Y] */
    static {
        ?? r02 = new Enum("Min", 0);
        f1461c = r02;
        ?? r12 = new Enum("Max", 1);
        f1462e = r12;
        f1463f = new Y[]{r02, r12};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f1463f.clone();
    }
}
