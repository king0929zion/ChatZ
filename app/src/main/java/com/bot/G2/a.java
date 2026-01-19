package G2;

import java.util.Locale;
import m4.AbstractC1276k;
import org.jsoup.nodes.DocumentType;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1647f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f1648g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f1649h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f1650i;

    /* renamed from: c, reason: collision with root package name */
    public final String f1651c;

    /* renamed from: e, reason: collision with root package name */
    public final Locale f1652e;

    static {
        Locale locale = Locale.ROOT;
        AbstractC1276k.e(locale, "ROOT");
        a aVar = new a(DocumentType.SYSTEM_KEY, 0, "system", locale);
        f1647f = aVar;
        Locale locale2 = Locale.CHINESE;
        AbstractC1276k.e(locale2, "CHINESE");
        a aVar2 = new a("CHINESE", 1, "zh", locale2);
        f1648g = aVar2;
        Locale locale3 = Locale.ENGLISH;
        AbstractC1276k.e(locale3, "ENGLISH");
        a aVar3 = new a("ENGLISH", 2, "en", locale3);
        f1649h = aVar3;
        f1650i = new a[]{aVar, aVar2, aVar3};
    }

    public a(String str, int i6, String str2, Locale locale) {
        this.f1651c = str2;
        this.f1652e = locale;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1650i.clone();
    }
}
