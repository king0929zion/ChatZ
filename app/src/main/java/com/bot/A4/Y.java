package A4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f224c;

    /* renamed from: e, reason: collision with root package name */
    public static final Y f225e;

    /* renamed from: f, reason: collision with root package name */
    public static final Y f226f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Y[] f227g;

    /* JADX WARN: Type inference failed for: r0v0, types: [A4.Y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [A4.Y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [A4.Y, java.lang.Enum] */
    static {
        ?? r02 = new Enum("START", 0);
        f224c = r02;
        ?? r12 = new Enum("STOP", 1);
        f225e = r12;
        ?? r22 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f226f = r22;
        f227g = new Y[]{r02, r12, r22};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f227g.clone();
    }
}
