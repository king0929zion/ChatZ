package T2;

import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class C {
    public static final Set a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f8398b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f8399c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f8400d;

    static {
        Character valueOf = Character.valueOf(SequenceUtils.SPC);
        Character valueOf2 = Character.valueOf(BlockQuoteParser.MARKER_CHAR);
        Character valueOf3 = Character.valueOf(WikiNode.SEPARATOR_CHAR);
        a = Y3.k.C0(new Character[]{valueOf, '\t', '\n', '\r', '.', ',', ';', ':', '!', '?', '(', ')', '[', ']', '{', '}', '<', valueOf2, '\"', '\'', '/', '\\', valueOf3, '-', '+', '=', '@', '#', '$', '%', '^', '&', '*', '~', '`'});
        f8398b = Y3.k.C0(new Character[]{'-', '*', '+', 8226, 9702, 9642});
        Y3.k.C0(new Character[]{'`', '~'});
        f8399c = Y3.k.C0(new Character[]{'\\', '`', '*', '_', '{', '}', '[', ']', '(', ')', '#', '+', '-', '.', '!', valueOf3, '$', '<', valueOf2, '~', '^', '='});
        f8400d = Y3.k.C0(new Character[]{valueOf, '\t', '\n', '\r', '\"', '\'', '<', valueOf2, '[', ']', 65292, 12290, 65281, 65311, 65307, 65306, 8220, 8221, 8216, 8217});
    }

    public static boolean a(char c6) {
        if ('a' > c6 || c6 >= '{') {
            return 'A' <= c6 && c6 < '[';
        }
        return true;
    }

    public static boolean b(char c6) {
        return '0' <= c6 && c6 < ':';
    }

    public static boolean c(char c6) {
        if (f8400d.contains(Character.valueOf(c6))) {
            return false;
        }
        if (19968 <= c6 && c6 < 40960) {
            return false;
        }
        if (13312 <= c6 && c6 < 19904) {
            return false;
        }
        if (12288 > c6 || c6 >= 12352) {
            return 65280 > c6 || c6 >= 65520;
        }
        return false;
    }
}
