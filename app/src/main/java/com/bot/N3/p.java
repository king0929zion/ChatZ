package N3;

/* loaded from: classes.dex */
public abstract class p {
    public static final boolean a;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z5 = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z5 = true;
        }
        a = z5;
    }
}
