package O;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    public static final E f3930c;

    /* renamed from: e, reason: collision with root package name */
    public static final E f3931e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ E[] f3932f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, O.E] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, O.E] */
    static {
        ?? r02 = new Enum("EditableText", 0);
        f3930c = r02;
        ?? r12 = new Enum("StaticText", 1);
        f3931e = r12;
        f3932f = new E[]{r02, r12};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f3932f.clone();
    }
}
