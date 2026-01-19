package D2;

import D.C0080m;
import com.bot.core.model.ReasoningStrategy$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@I4.d
/* loaded from: classes.dex */
public final class b {
    public static final ReasoningStrategy$Companion Companion;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1266c;

    /* renamed from: e, reason: collision with root package name */
    public static final b f1267e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f1268f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1269g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1270h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1271i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b[] f1272j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, D2.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.bot.core.model.ReasoningStrategy$Companion, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, D2.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, D2.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, D2.b] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, D2.b] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, D2.b] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f1267e = r02;
        ?? r12 = new Enum("SWITCH_MODEL_ID", 1);
        f1268f = r12;
        ?? r22 = new Enum("OPENAI_REASONING_EFFORT", 2);
        f1269g = r22;
        ?? r32 = new Enum("ANTHROPIC_THINKING_BLOCK", 3);
        f1270h = r32;
        ?? r42 = new Enum("GOOGLE_THINKING_CONFIG", 4);
        f1271i = r42;
        f1272j = new b[]{r02, r12, r22, r32, r42, new Enum("X_EXTRA_BODY_PARAM", 5)};
        Companion = new Object();
        f1266c = X3.a.c(X3.g.f9390c, new C0080m(16));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1272j.clone();
    }
}
