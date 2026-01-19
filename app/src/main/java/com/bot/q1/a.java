package Q1;

import java.util.Locale;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class a implements X1.a {

    /* renamed from: c, reason: collision with root package name */
    public final Y1.a f6343c;

    public a(Y1.a aVar) {
        AbstractC1276k.f(aVar, "db");
        this.f6343c = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Q1.e, Q1.g] */
    @Override // X1.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g c0(String str) {
        String str2;
        int i6;
        AbstractC1276k.f(str, "sql");
        Y1.a aVar = this.f6343c;
        AbstractC1276k.f(aVar, "db");
        String upperCase = AbstractC1776n.l0(str).toString().toUpperCase(Locale.ROOT);
        AbstractC1276k.e(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i7 = -1;
        if (length >= 0) {
            int i8 = 0;
            loop0: while (i8 < length) {
                char charAt = upperCase.charAt(i8);
                if (AbstractC1276k.g(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i9 = i8 + 1;
                            if (upperCase.charAt(i9) != '*') {
                            }
                            do {
                                i9 = AbstractC1776n.N(upperCase, '*', i9 + 1, 4);
                                if (i9 >= 0) {
                                    i6 = i9 + 1;
                                    if (i6 >= length) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } while (upperCase.charAt(i6) != '/');
                            i8 = i9 + 2;
                        }
                        i7 = i8;
                        break;
                    }
                    if (upperCase.charAt(i8 + 1) == '-') {
                        i8 = AbstractC1776n.N(upperCase, '\n', i8 + 2, 4);
                        if (i8 < 0) {
                            break;
                        }
                    } else {
                        i7 = i8;
                        break;
                    }
                }
                i8++;
            }
        }
        if (i7 < 0 || i7 > upperCase.length()) {
            str2 = null;
        } else {
            str2 = upperCase.substring(i7, Math.min(i7 + 3, upperCase.length()));
            AbstractC1276k.e(str2, "substring(...)");
        }
        if (str2 == null) {
            return new f(aVar, str);
        }
        int hashCode = str2.hashCode();
        if (hashCode == 79487 ? !str2.equals("PRA") : hashCode == 81978 ? !str2.equals("SEL") : !(hashCode == 85954 && str2.equals("WIT"))) {
            return new f(aVar, str);
        }
        ?? gVar = new g(aVar, str);
        gVar.f6350g = new int[0];
        gVar.f6351h = new long[0];
        gVar.f6352i = new double[0];
        gVar.f6353j = new String[0];
        gVar.f6354k = new byte[0];
        return gVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6343c.close();
    }
}
