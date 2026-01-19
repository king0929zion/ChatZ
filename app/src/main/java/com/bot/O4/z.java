package O4;

import e4.C0969b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final z f4381f;

    /* renamed from: g, reason: collision with root package name */
    public static final z f4382g;

    /* renamed from: h, reason: collision with root package name */
    public static final z f4383h;

    /* renamed from: i, reason: collision with root package name */
    public static final z f4384i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ z[] f4385j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C0969b f4386k;

    /* renamed from: c, reason: collision with root package name */
    public final char f4387c;

    /* renamed from: e, reason: collision with root package name */
    public final char f4388e;

    static {
        z zVar = new z("OBJ", 0, '{', '}');
        f4381f = zVar;
        z zVar2 = new z("LIST", 1, '[', ']');
        f4382g = zVar2;
        z zVar3 = new z("MAP", 2, '{', '}');
        f4383h = zVar3;
        z zVar4 = new z("POLY_OBJ", 3, '[', ']');
        f4384i = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        f4385j = zVarArr;
        f4386k = new C0969b(zVarArr);
    }

    public z(String str, int i6, char c6, char c7) {
        this.f4387c = c6;
        this.f4388e = c7;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f4385j.clone();
    }
}
