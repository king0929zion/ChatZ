package O4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class m {
    public static final n a = new Object();

    public static final i a(Number number, String str, String str2) {
        AbstractC1276k.f(str, "key");
        AbstractC1276k.f(str2, "output");
        return e(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(-1, str2)));
    }

    public static final l b(Number number, String str) {
        return new l("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) l(-1, str)));
    }

    public static final l c(SerialDescriptor serialDescriptor) {
        return new l("Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final i d(int i6, CharSequence charSequence, String str) {
        AbstractC1276k.f(str, "message");
        AbstractC1276k.f(charSequence, FlexmarkHtmlConverter.INPUT_NODE);
        return e(i6, str + "\nJSON input: " + ((Object) l(i6, charSequence)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [O4.i, java.lang.IllegalArgumentException] */
    public static final i e(int i6, String str) {
        AbstractC1276k.f(str, "message");
        if (i6 >= 0) {
            str = "Unexpected JSON token at offset " + i6 + ": " + str;
        }
        AbstractC1276k.f(str, "message");
        return new IllegalArgumentException(str);
    }

    public static final SerialDescriptor f(SerialDescriptor serialDescriptor, F2.h hVar) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        AbstractC1276k.f(hVar, "module");
        if (!AbstractC1276k.b(serialDescriptor.e(), K4.j.f2974e)) {
            return serialDescriptor.h() ? f(serialDescriptor.j(0), hVar) : serialDescriptor;
        }
        s4.j.v(serialDescriptor);
        return serialDescriptor;
    }

    public static final byte g(char c6) {
        if (c6 < '~') {
            return e.f4334b[c6];
        }
        return (byte) 0;
    }

    public static final String h(N4.c cVar, SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        AbstractC1276k.f(cVar, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof N4.g) {
                return ((N4.g) annotation).discriminator();
            }
        }
        return cVar.a.f3903g;
    }

    public static final int i(SerialDescriptor serialDescriptor, N4.c cVar, String str) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        AbstractC1276k.f(cVar, "json");
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        m(cVar, serialDescriptor);
        int d6 = serialDescriptor.d(str);
        if (d6 != -3 || !cVar.a.f3905i) {
            return d6;
        }
        A3.c cVar2 = cVar.f3884c;
        D.r rVar = new D.r(12, serialDescriptor, cVar);
        cVar2.getClass();
        n nVar = a;
        Object l3 = cVar2.l(serialDescriptor, nVar);
        if (l3 == null) {
            l3 = rVar.b();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar2.f119e;
            Object obj = concurrentHashMap.get(serialDescriptor);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj);
            }
            ((Map) obj).put(nVar, l3);
        }
        Integer num = (Integer) ((Map) l3).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int j(SerialDescriptor serialDescriptor, N4.c cVar, String str, String str2) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        AbstractC1276k.f(cVar, "json");
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "suffix");
        int i6 = i(serialDescriptor, cVar, str);
        if (i6 != -3) {
            return i6;
        }
        throw new IllegalArgumentException(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final void k(L1.l lVar, String str) {
        lVar.o("Trailing comma before the end of JSON ".concat(str), lVar.f3045b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence l(int i6, CharSequence charSequence) {
        AbstractC1276k.f(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i6 != -1) {
                int i7 = i6 - 30;
                int i8 = i6 + 30;
                String str = i7 <= 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : ".....";
                String str2 = i8 >= charSequence.length() ? FlexmarkHtmlConverter.DEFAULT_NODE : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i7 < 0) {
                    i7 = 0;
                }
                int length = charSequence.length();
                if (i8 > length) {
                    i8 = length;
                }
                sb.append(charSequence.subSequence(i7, i8).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void m(N4.c cVar, SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "<this>");
        AbstractC1276k.f(cVar, "json");
        AbstractC1276k.b(serialDescriptor.e(), K4.k.f2976e);
    }

    public static final z n(N4.c cVar, SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "desc");
        Y4.l e6 = serialDescriptor.e();
        if (e6 instanceof K4.d) {
            return z.f4384i;
        }
        boolean b5 = AbstractC1276k.b(e6, K4.k.f2977f);
        z zVar = z.f4382g;
        if (b5) {
            return zVar;
        }
        if (!AbstractC1276k.b(e6, K4.k.f2978g)) {
            return z.f4381f;
        }
        SerialDescriptor f6 = f(serialDescriptor.j(0), cVar.f3883b);
        Y4.l e7 = f6.e();
        if ((e7 instanceof K4.f) || AbstractC1276k.b(e7, K4.j.f2975f)) {
            return z.f4383h;
        }
        if (cVar.a.f3900d) {
            return zVar;
        }
        throw c(f6);
    }

    public static final void o(L1.l lVar, Number number) {
        L1.l.p(lVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String p(byte b5) {
        return b5 == 1 ? "quotation mark '\"'" : b5 == 2 ? "string escape sequence '\\'" : b5 == 4 ? "comma ','" : b5 == 5 ? "colon ':'" : b5 == 6 ? "start of the object '{'" : b5 == 7 ? "end of the object '}'" : b5 == 8 ? "start of the array '['" : b5 == 9 ? "end of the array ']'" : b5 == 10 ? "end of the input" : b5 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
