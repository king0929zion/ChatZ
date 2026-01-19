package k2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f12620c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f12621e;

    /* JADX INFO: Fake field, exist only in values array */
    j EF0;

                static {
        j r02 = new j();
        j r12 = new j();
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
