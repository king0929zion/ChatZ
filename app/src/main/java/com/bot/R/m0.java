package R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m0[] f6809c = {new Enum("Filled", 0), new Enum("Outlined", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    m0 EF5;

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f6809c.clone();
    }
}
