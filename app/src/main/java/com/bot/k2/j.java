package k2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f12620c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f12621e;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [k2.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k2.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [k2.j, java.lang.Enum] */
    static {
        ?? r02 = new Enum("IGNORE", 0);
        ?? r12 = new Enum("RESPECT_PERFORMANCE", 1);
        f12620c = r12;
        f12621e = new j[]{r02, r12, new Enum("RESPECT_ALL", 2)};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f12621e.clone();
    }
}
