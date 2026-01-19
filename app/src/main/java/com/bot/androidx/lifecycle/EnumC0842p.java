package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0842p {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0842p f10875c;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0842p f10876e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0842p f10877f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0842p f10878g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0842p f10879h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0842p[] f10880i;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.p] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f10875c = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f10876e = r12;
        ?? r22 = new Enum("CREATED", 2);
        f10877f = r22;
        ?? r32 = new Enum("STARTED", 3);
        f10878g = r32;
        ?? r42 = new Enum("RESUMED", 4);
        f10879h = r42;
        f10880i = new EnumC0842p[]{r02, r12, r22, r32, r42};
    }

    public static EnumC0842p valueOf(String str) {
        return (EnumC0842p) Enum.valueOf(EnumC0842p.class, str);
    }

    public static EnumC0842p[] values() {
        return (EnumC0842p[]) f10880i.clone();
    }
}
