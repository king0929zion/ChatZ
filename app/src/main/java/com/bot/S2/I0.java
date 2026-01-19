package S2;

import S0.C0541c;
import S0.C0542d;
import S0.C0545g;
import T.C0626q;
import T.C0627q0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d1.C0934a;
import i4.AbstractC1120d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import o0.C1389K;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class I0 {
    public static final I0 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final F0 f7711b = new F0(o0.y.d(4289724448L), o0.y.d(4278934701L), o0.y.d(4280452666L), o0.y.d(4285166461L), o0.y.d(4285481665L), o0.y.d(4278934701L), o0.y.d(4289928488L), o0.y.d(4280452666L), o0.y.d(4284441448L));

    /* renamed from: c, reason: collision with root package name */
    public static final F0 f7712c = new F0(o0.y.d(4294933362L), o0.y.d(4286169343L), o0.y.d(4287550334L), o0.y.d(4287337630L), o0.y.d(4291995903L), o0.y.d(4286169343L), o0.y.d(4294944343L), o0.y.d(4287550334L), o0.y.d(4291416537L));

    /* renamed from: d, reason: collision with root package name */
    public static final Object f7713d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7714e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7715f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, S2.I0] */
    static {
        Map Z5 = Y3.B.Z(new X3.i("kotlin", new E0(Y3.k.C0(new String[]{Attribute.CLASS_ATTR, "fun", "val", "var", "if", "else", "when", "for", "while", "return", "import", "package", "data", "sealed", "abstract", "open", "private", "public", "internal", "protected", "override", "suspend", "inline", "companion", "object", "interface", "enum", "annotation", "try", "catch", "finally", "throw", "throws", "null", "true", "false"}), Y3.k.C0(new String[]{"String", "Int", "Long", "Double", "Float", "Boolean", "Any", "Unit"}), false)), new X3.i("java", new E0(Y3.k.C0(new String[]{Attribute.CLASS_ATTR, "public", "private", "protected", "static", "final", "abstract", "interface", "extends", "implements", "import", "package", "if", "else", "for", "while", "do", "switch", "case", "default", "return", "try", "catch", "finally", "throw", "throws", "new", "this", "super", "null", "true", "false", "void"}), Y3.k.C0(new String[]{"String", "int", "long", "double", "float", "boolean", "char", "byte", "short", "Object"}), false)), new X3.i("javascript", new E0(Y3.k.C0(new String[]{"function", "var", "let", "const", "if", "else", "for", "while", "do", "switch", "case", "default", "return", "try", "catch", "finally", "throw", "new", "this", "typeof", "instanceof", "in", "of", "null", "undefined", "true", "false", Attribute.CLASS_ATTR, "extends", "super", "import", "export", "from", "async", "await"}), Y3.k.C0(new String[]{"String", "Number", "Boolean", "Object", "Array", "Function", "Promise"}), false)), new X3.i("typescript", new E0(Y3.k.C0(new String[]{"function", "var", "let", "const", "if", "else", "for", "while", "do", "switch", "case", "default", "return", "try", "catch", "finally", "throw", "new", "this", "typeof", "instanceof", "in", "of", "null", "undefined", "true", "false", Attribute.CLASS_ATTR, "extends", "super", "import", "export", "from", "async", "await", "interface", "type", "enum", "namespace", "declare", "readonly", "keyof"}), Y3.k.C0(new String[]{"string", "number", "boolean", "object", "any", "void", "never", "unknown"}), false)), new X3.i("python", new E0(Y3.k.C0(new String[]{"def", Attribute.CLASS_ATTR, "if", "elif", "else", "for", "while", "try", "except", "finally", "with", "as", "import", "from", "return", "yield", "lambda", "and", "or", "not", "in", "is", "None", "True", "False", "pass", "break", "continue", "global", "nonlocal", "assert", FlexmarkHtmlConverter.DEL_NODE, "raise"}), Y3.k.C0(new String[]{"str", "int", "float", "bool", "list", "dict", "tuple", "set", "type"}), false)), new X3.i("sql", new E0(Y3.k.C0(new String[]{"select", "from", "where", "insert", "update", "delete", "create", "drop", "alter", FlexmarkHtmlConverter.TABLE_NODE, "index", "database", "schema", "view", "procedure", "function", "trigger", "join", "inner", "left", "right", "full", "outer", "on", "group", "by", "order", "having", "limit", "offset", "union", "intersect", "except", "as", "distinct", "null", "not", "and", "or", "set", "values", "into", "like", "between", "in", "is", "exists", "case", "when", "then", "else", "end", "primary", "key", "foreign", "references", "unique", "constraint", "default", "auto_increment", "asc", "desc"}), Y3.k.C0(new String[]{"varchar", "int", "integer", "bigint", "decimal", "date", "time", "timestamp", "boolean", "text", "char", "float", "double", "blob", "clob"}), true)), new X3.i("rust", new E0(Y3.k.C0(new String[]{"fn", "let", "mut", "const", "static", "if", "else", "match", "for", "while", "loop", "break", "continue", "return", "struct", "enum", "impl", "trait", "mod", "use", "pub", "extern", "crate", "self", "Self", "super", "where", "as", "unsafe", "async", "await", "move", "ref", "in", "true", "false", "Some", "None", "Ok", "Err"}), Y3.k.C0(new String[]{"i8", "i16", "i32", "i64", "u8", "u16", "u32", "u64", "f32", "f64", "bool", "char", "str", "String", "Vec", "Option", "Result"}), false)), new X3.i("go", new E0(Y3.k.C0(new String[]{"package", "import", "func", "var", "const", "type", "struct", "interface", "if", "else", "for", "range", "switch", "case", "default", "break", "continue", "return", "go", "defer", "select", "chan", "map", "make", "new", "len", "cap", "append", "copy", "delete", "panic", "recover", "true", "false", "nil"}), Y3.k.C0(new String[]{"int", "int8", "int16", "int32", "int64", "uint", "uint8", "uint16", "uint32", "uint64", "float32", "float64", "bool", "string", "byte", "rune"}), false)), new X3.i("swift", new E0(Y3.k.C0(new String[]{Attribute.CLASS_ATTR, "struct", "enum", "protocol", "extension", "func", "var", "let", "init", "if", "else", "guard", "switch", "case", "default", "for", "in", "while", "repeat", "break", "continue", "return", "throw", "throws", "try", "catch", "defer", "import", "public", "private", "internal", "fileprivate", "open", "final", "static", "lazy", "weak", "unowned", "override", "required", "convenience", "true", "false", "nil", "self", "Self", "super"}), Y3.k.C0(new String[]{"Int", "Float", "Double", "Bool", "String", "Character", "Array", "Dictionary", "Set", "Optional", "Any", "AnyObject", "Void"}), false)), new X3.i("c", new E0(Y3.k.C0(new String[]{"auto", "break", "case", "char", "const", "continue", "default", "do", "double", "else", "enum", "extern", "float", "for", "goto", "if", "inline", "int", "long", "register", "restrict", "return", "short", "signed", "sizeof", "static", "struct", "switch", "typedef", "union", "unsigned", "void", "volatile", "while", "_Bool", "_Complex", "_Imaginary", "true", "false", "NULL"}), Y3.k.C0(new String[]{"int", "char", "float", "double", "void", "long", "short", "unsigned", "signed", "bool", "size_t", "ptrdiff_t"}), false)), new X3.i("csharp", new E0(Y3.k.C0(new String[]{"abstract", "as", "base", "bool", "break", "byte", "case", "catch", "char", "checked", Attribute.CLASS_ATTR, "const", "continue", "decimal", "default", "delegate", "do", "double", "else", "enum", "event", "explicit", "extern", "false", "finally", "fixed", "float", "for", "foreach", "goto", "if", "implicit", "in", "int", "interface", "internal", "is", "lock", "long", "namespace", "new", "null", "object", "operator", "out", "override", "params", "private", "protected", "public", "readonly", "ref", "return", "sbyte", "sealed", "short", "sizeof", "stackalloc", "static", "string", "struct", "switch", "this", "throw", "true", "try", "typeof", "uint", "ulong", "unchecked", "unsafe", "ushort", "using", "virtual", "void", "volatile", "while"}), Y3.k.C0(new String[]{"bool", "byte", "char", "decimal", "double", "float", "int", "long", "object", "sbyte", "short", "string", "uint", "ulong", "ushort", "var", "dynamic"}), false)), new X3.i("php", new E0(Y3.k.C0(new String[]{"abstract", "and", "array", "as", "break", "callable", "case", "catch", Attribute.CLASS_ATTR, "clone", "const", "continue", "declare", "default", "die", "do", "echo", "else", "elseif", "empty", "enddeclare", "endfor", "endforeach", "endif", "endswitch", "endwhile", "eval", "exit", "extends", "final", "finally", "for", "foreach", "function", "global", "goto", "if", "implements", "include", "include_once", "instanceof", "insteadof", "interface", "isset", "list", "namespace", "new", "or", "print", "private", "protected", "public", "require", "require_once", "return", "static", "switch", "throw", "trait", "try", "unset", "use", "var", "while", "xor", "yield", "true", "false", "null"}), Y3.k.C0(new String[]{"int", "float", "string", "bool", "array", "object", "resource", "null", "callable", "iterable", "mixed"}), false)), new X3.i("ruby", new E0(Y3.k.C0(new String[]{"alias", "and", "begin", "break", "case", Attribute.CLASS_ATTR, "def", "defined", "do", "else", "elsif", "end", "ensure", "false", "for", "if", "in", "module", "next", "nil", "not", "or", "redo", "rescue", "retry", "return", "self", "super", "then", "true", "undef", "unless", "until", "when", "while", "yield", "require", "include", "extend", "private", "protected", "public", "attr_reader", "attr_writer", "attr_accessor"}), Y3.k.C0(new String[]{"String", "Integer", "Float", "Array", "Hash", "Symbol", "Class", "Module", "Object", "TrueClass", "FalseClass", "NilClass"}), false)), new X3.i("dart", new E0(Y3.k.C0(new String[]{"abstract", "as", "assert", "async", "await", "break", "case", "catch", Attribute.CLASS_ATTR, "const", "continue", "covariant", "default", "deferred", "do", "dynamic", "else", "enum", "export", "extends", "extension", "external", "factory", "false", "final", "finally", "for", "Function", "get", "hide", "if", "implements", "import", "in", "interface", "is", "library", "mixin", "new", "null", "on", "operator", "part", "required", "rethrow", "return", "set", "show", "static", "super", "switch", "sync", "this", "throw", "true", "try", "typedef", "var", "void", "while", "with", "yield"}), Y3.k.C0(new String[]{"int", "double", "num", "bool", "String", "List", "Map", "Set", "Object", "dynamic", "void", "var", "Function"}), false)), new X3.i("scala", new E0(Y3.k.C0(new String[]{"abstract", "case", "catch", Attribute.CLASS_ATTR, "def", "do", "else", "extends", "false", "final", "finally", "for", "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package", "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "true", "try", "type", "val", "var", "while", "with", "yield"}), Y3.k.C0(new String[]{"Int", "Long", "Float", "Double", "Boolean", "Char", "String", "Unit", "Nothing", "Any", "AnyRef", "AnyVal", "Option", "Some", "None", "List", "Array", "Map", "Set"}), false)), new X3.i("r", new E0(Y3.k.C0(new String[]{"if", "else", "repeat", "while", "function", "for", "in", "next", "break", "TRUE", "FALSE", "NULL", "Inf", "NaN", "NA", "library", "require", "source", "return"}), Y3.k.C0(new String[]{"numeric", "integer", "logical", "character", "complex", "raw", "list", "matrix", "array", "data.frame", "factor"}), false)));
        f7713d = Z5;
        Map Z6 = Y3.B.Z(new X3.i("js", "javascript"), new X3.i("ts", "typescript"), new X3.i("jsx", "javascript"), new X3.i("tsx", "typescript"), new X3.i("py", "python"), new X3.i("rs", "rust"), new X3.i("golang", "go"), new X3.i("cpp", "c"), new X3.i("c++", "c"), new X3.i("cs", "csharp"), new X3.i("rb", "ruby"));
        f7714e = Z6;
        Y3.F.p0(Y3.F.p0(Z5.keySet(), Z6.keySet()), Y3.k.C0(new String[]{"html", "css", "json", "xml", "bash", "shell", "sh", "yaml", "yml", "markdown", "md", "diff", "patch"}));
        f7715f = 8;
    }

    public static C0545g a(String str, C0626q c0626q) {
        int i6;
        int h3;
        int i7;
        c0626q.b0(-1333664985);
        C0542d c0542d = new C0542d();
        F0 f6 = f(c0626q);
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            String substring = str.substring(i8);
            AbstractC1276k.e(substring, "substring(...)");
            if (u4.u.D(substring, "/*", false)) {
                i6 = i8 + 2;
                while (i6 < str.length() - 1 && (str.charAt(i6) != '*' || str.charAt(i6 + 1) != '/')) {
                    i6++;
                }
                if (i6 < str.length() - 1) {
                    i6 += 2;
                }
                h3 = c0542d.h(new S0.G(f6.f7694d, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                try {
                    String substring2 = str.substring(i8, i6);
                    AbstractC1276k.e(substring2, "substring(...)");
                    c0542d.e(substring2);
                    c0542d.f(h3);
                } finally {
                }
            } else {
                if (str.charAt(i8) == '{') {
                    i9++;
                    c0542d.b(str.charAt(i8));
                } else if (str.charAt(i8) == '}') {
                    i9 = Math.max(0, i9 - 1);
                    c0542d.b(str.charAt(i8));
                } else if (i9 == 0 && (str.charAt(i8) == '.' || str.charAt(i8) == '#' || str.charAt(i8) == '@' || Character.isLetter(str.charAt(i8)))) {
                    int i10 = i8;
                    while (i10 < str.length() && str.charAt(i10) != '{' && str.charAt(i10) != '\n') {
                        i10++;
                    }
                    h3 = c0542d.h(new S0.G(f6.a, 0L, W0.k.f8837k, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65530));
                    try {
                        String substring3 = str.substring(i8, i10);
                        AbstractC1276k.e(substring3, "substring(...)");
                        c0542d.e(substring3);
                        c0542d.f(h3);
                        i8 = i10;
                    } finally {
                    }
                } else if (i9 > 0 && Character.isLetter(str.charAt(i8))) {
                    int i11 = i8;
                    while (i11 < str.length() && str.charAt(i11) != ':' && str.charAt(i11) != ';' && str.charAt(i11) != '}' && str.charAt(i11) != '\n') {
                        i11++;
                    }
                    String substring4 = str.substring(i8, i11);
                    AbstractC1276k.e(substring4, "substring(...)");
                    if (i11 >= str.length() || str.charAt(i11) != ':') {
                        c0542d.e(substring4);
                    } else {
                        h3 = c0542d.h(new S0.G(f6.f7692b, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                        try {
                            c0542d.e(substring4);
                        } finally {
                        }
                    }
                    i8 = i11;
                } else if (str.charAt(i8) == '\"' || str.charAt(i8) == '\'') {
                    char charAt = str.charAt(i8);
                    int i12 = i8 + 1;
                    while (i12 < str.length() && str.charAt(i12) != charAt) {
                        if (str.charAt(i12) == '\\') {
                            i12++;
                        }
                        i12++;
                    }
                    if (i12 < str.length()) {
                        i12++;
                    }
                    i6 = i12;
                    h3 = c0542d.h(new S0.G(f6.f7693c, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                    try {
                        String substring5 = str.substring(i8, i6);
                        AbstractC1276k.e(substring5, "substring(...)");
                        c0542d.e(substring5);
                        c0542d.f(h3);
                    } finally {
                    }
                } else if (Character.isDigit(str.charAt(i8)) || (str.charAt(i8) == '-' && (i7 = i8 + 1) < str.length() && Character.isDigit(str.charAt(i7)))) {
                    i6 = str.charAt(i8) == '-' ? i8 + 1 : i8;
                    while (i6 < str.length() && (Character.isDigit(str.charAt(i6)) || str.charAt(i6) == '.')) {
                        i6++;
                    }
                    while (i6 < str.length() && Character.isLetter(str.charAt(i6))) {
                        i6++;
                    }
                    h3 = c0542d.h(new S0.G(f6.f7695e, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                    try {
                        String substring6 = str.substring(i8, i6);
                        AbstractC1276k.e(substring6, "substring(...)");
                        c0542d.e(substring6);
                        c0542d.f(h3);
                    } finally {
                    }
                } else if (i9 <= 0 || str.charAt(i8) != '#' || (i6 = i8 + 1) >= str.length() || !Character.isLetterOrDigit(str.charAt(i6))) {
                    c0542d.b(str.charAt(i8));
                } else {
                    while (i6 < str.length() && Character.isLetterOrDigit(str.charAt(i6))) {
                        i6++;
                    }
                    h3 = c0542d.h(new S0.G(f6.f7693c, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                    try {
                        String substring7 = str.substring(i8, i6);
                        AbstractC1276k.e(substring7, "substring(...)");
                        c0542d.e(substring7);
                        c0542d.f(h3);
                    } finally {
                    }
                }
                i8++;
            }
            i8 = i6;
        }
        C0545g i13 = c0542d.i();
        c0626q.p(false);
        return i13;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.Map, java.lang.Object] */
    public static C0545g b(String str, C0626q c0626q) {
        boolean z5;
        boolean z6;
        String str2;
        long j3;
        C0545g a6;
        boolean z7;
        int i6;
        c0626q.b0(2107957440);
        C0542d c0542d = new C0542d();
        F0 f6 = f(c0626q);
        c0626q.b0(2107966393);
        boolean z8 = false;
        int i7 = 0;
        while (i7 < str.length()) {
            if (u4.u.C(str, "<!--", i7, z8)) {
                c0626q.b0(-1692345520);
                c0626q.p(z8);
                int O5 = AbstractC1776n.O(str, "-->", i7 + 4, z8, 4);
                int length = O5 == -1 ? str.length() : O5 + 3;
                String substring = str.substring(i7, length);
                AbstractC1276k.e(substring, "substring(...)");
                c(c0542d, substring, f6.f7694d, z8);
                i7 = length;
            } else {
                if (str.charAt(i7) == '<') {
                    c0626q.b0(-1691929562);
                    long j4 = f6.f7699i;
                    long j5 = f6.f7698h;
                    long j6 = f6.f7699i;
                    c(c0542d, "<", j4, z8);
                    int i8 = i7 + 1;
                    if (i8 >= str.length() || !(str.charAt(i8) == '/' || str.charAt(i8) == '!' || str.charAt(i8) == '?')) {
                        z6 = z8;
                    } else {
                        c(c0542d, String.valueOf(str.charAt(i8)), j6, z8);
                        boolean z9 = str.charAt(i8) == '/' ? true : z8;
                        i8 = i7 + 2;
                        z6 = z9;
                    }
                    int i9 = i8;
                    while (i9 < str.length()) {
                        char charAt = str.charAt(i9);
                        if (!Character.isLetterOrDigit(charAt) && charAt != ':' && charAt != '-' && charAt != '_') {
                            break;
                        }
                        i9++;
                    }
                    if (i9 > i8) {
                        str2 = str.substring(i8, i9);
                        AbstractC1276k.e(str2, "substring(...)");
                    } else {
                        str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
                    }
                    if (i9 > i8) {
                        String substring2 = str.substring(i8, i9);
                        AbstractC1276k.e(substring2, "substring(...)");
                        j3 = j5;
                        c(c0542d, substring2, f6.f7696f, true);
                    } else {
                        j3 = j5;
                    }
                    boolean z10 = false;
                    while (i9 < str.length() && str.charAt(i9) != '>') {
                        if (AbstractC1120d.r(str.charAt(i9))) {
                            c0542d.b(str.charAt(i9));
                        } else if (str.charAt(i9) == '/') {
                            c(c0542d, "/", j6, false);
                        } else if (str.charAt(i9) == '=') {
                            c(c0542d, "=", j6, false);
                            i9++;
                            z10 = true;
                        } else {
                            if (str.charAt(i9) == '\"' || str.charAt(i9) == '\'') {
                                z7 = z6;
                                long j7 = j3;
                                char charAt2 = str.charAt(i9);
                                int i10 = i9 + 1;
                                while (i10 < str.length() && str.charAt(i10) != charAt2) {
                                    if (str.charAt(i10) == '\\' && (i6 = i10 + 1) < str.length()) {
                                        i10 = i6;
                                    }
                                    i10++;
                                }
                                if (i10 < str.length()) {
                                    i10++;
                                }
                                String substring3 = str.substring(i9, i10);
                                AbstractC1276k.e(substring3, "substring(...)");
                                c(c0542d, substring3, j7, false);
                                j3 = j7;
                                i9 = i10;
                                z10 = false;
                            } else {
                                int i11 = i9;
                                while (i11 < str.length() && !AbstractC1120d.r(str.charAt(i11)) && str.charAt(i11) != '=' && str.charAt(i11) != '>') {
                                    i11++;
                                }
                                String substring4 = str.substring(i9, i11);
                                AbstractC1276k.e(substring4, "substring(...)");
                                if (z10) {
                                    c(c0542d, substring4, j3, false);
                                    z6 = z6;
                                    i9 = i11;
                                    z10 = false;
                                } else {
                                    z7 = z6;
                                    c(c0542d, substring4, f6.f7697g, false);
                                    i9 = i11;
                                    z10 = z10;
                                    j3 = j3;
                                }
                            }
                            z6 = z7;
                        }
                        i9++;
                    }
                    boolean z11 = z6;
                    if (i9 >= str.length() || str.charAt(i9) != '>') {
                        i7 = i9;
                    } else {
                        c(c0542d, ">", j6, false);
                        i7 = i9 + 1;
                    }
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    AbstractC1276k.e(lowerCase, "toLowerCase(...)");
                    int i12 = i9 - 1;
                    while (i12 >= 0 && AbstractC1120d.r(str.charAt(i12))) {
                        i12--;
                    }
                    boolean z12 = i12 >= 0 && str.charAt(i12) == '/';
                    if (z11 || z12 || !(lowerCase.equals("script") || lowerCase.equals(Attribute.STYLE_ATTR))) {
                        z5 = false;
                        c0626q.b0(-1710994035);
                        c0626q.p(false);
                    } else {
                        c0626q.b0(-1688702121);
                        int M5 = AbstractC1776n.M(str, "</".concat(lowerCase), i7, true);
                        if (M5 == -1) {
                            M5 = str.length();
                        }
                        String substring5 = str.substring(i7, M5);
                        AbstractC1276k.e(substring5, "substring(...)");
                        if (substring5.length() > 0) {
                            c0626q.b0(-1688354208);
                            if (lowerCase.equals("script")) {
                                c0626q.b0(-1688279870);
                                E0 e02 = (E0) f7713d.get("javascript");
                                if (e02 != null) {
                                    c0626q.b0(-1688160644);
                                    z5 = false;
                                    a6 = d(substring5, e02, c0626q, 0);
                                    c0626q.p(false);
                                } else {
                                    c0626q.b0(-1688042472);
                                    c0626q.p(false);
                                    StringBuilder sb = new StringBuilder(16);
                                    new ArrayList();
                                    ArrayList arrayList = new ArrayList();
                                    new ArrayList();
                                    sb.append(substring5);
                                    String sb2 = sb.toString();
                                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                                    int size = arrayList.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        arrayList2.add(((C0541c) arrayList.get(i13)).a(sb.length()));
                                    }
                                    a6 = new C0545g(sb2, arrayList2);
                                    z5 = false;
                                }
                                c0626q.p(z5);
                            } else {
                                z5 = false;
                                c0626q.b0(-1687891533);
                                a6 = a(substring5, c0626q);
                                c0626q.p(false);
                            }
                            c0542d.c(a6);
                        } else {
                            z5 = false;
                            c0626q.b0(-1710994035);
                        }
                        c0626q.p(z5);
                        c0626q.p(z5);
                        i7 = M5;
                    }
                    c0626q.p(z5);
                } else {
                    z5 = z8;
                    c0626q.b0(-1687621647);
                    c0626q.p(z5);
                    c0542d.b(str.charAt(i7));
                    i7++;
                }
                z8 = z5;
            }
        }
        boolean z13 = z8;
        c0626q.p(z13);
        C0545g i14 = c0542d.i();
        c0626q.p(z13);
        return i14;
    }

    public static final void c(C0542d c0542d, String str, long j3, boolean z5) {
        int h3 = c0542d.h(new S0.G(j3, 0L, z5 ? W0.k.f8837k : null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65530));
        try {
            c0542d.e(str);
        } finally {
            c0542d.f(h3);
        }
    }

    public static C0545g d(String str, E0 e02, C0626q c0626q, int i6) {
        F0 f6 = f(c0626q);
        c0626q.b0(-1179433633);
        C0542d c0542d = new C0542d();
        a.e(c0542d, str, e02.a, e02.f7689b, e02.f7690c, f6, c0626q, 8 | ((i6 << 3) & 112));
        C0545g i7 = c0542d.i();
        c0626q.p(false);
        return i7;
    }

    public static F0 f(C0626q c0626q) {
        return o0.y.t(((Q.N) c0626q.j(Q.O.a)).f5424n) < 0.5f ? f7712c : f7711b;
    }

    public final void e(C0542d c0542d, String str, Set set, Set set2, boolean z5, F0 f02, C0626q c0626q, int i6) {
        int i7;
        H0 h02;
        String str2;
        H0 h03;
        H0 h04;
        int i8;
        String str3;
        Iterator it;
        int h3;
        int i9;
        int i10;
        c0626q.d0(-336733362);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? c0626q.f(c0542d) : c0626q.h(c0542d) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(str) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(set) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(set2) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.g(z5) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.f(f02) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0626q.h(this) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        }
        boolean z6 = true;
        if (c0626q.S(i7 & 1, (599187 & i7) != 599186)) {
            String str4 = SequenceUtils.EOL;
            Iterator it2 = AbstractC1776n.c0(str, new String[]{SequenceUtils.EOL}).iterator();
            int i11 = 0;
            while (it2.hasNext()) {
                int i12 = i11 + 1;
                String str5 = (String) it2.next();
                if (i11 > 0) {
                    c0542d.e(str4);
                }
                ArrayList arrayList = new ArrayList();
                boolean z7 = z6;
                int i13 = 0;
                while (true) {
                    int length = str5.length();
                    h02 = H0.f7705e;
                    str2 = str4;
                    h03 = H0.f7709i;
                    h04 = H0.f7706f;
                    if (i13 >= length) {
                        i8 = 0;
                        break;
                    }
                    if (AbstractC1120d.r(str5.charAt(i13))) {
                        i9 = i13;
                        while (i9 < str5.length() && AbstractC1120d.r(str5.charAt(i9))) {
                            i9++;
                        }
                        String substring = str5.substring(i13, i9);
                        AbstractC1276k.e(substring, "substring(...)");
                        arrayList.add(new G0(substring, H0.f7708h));
                    } else if (Character.isLetter(str5.charAt(i13)) || str5.charAt(i13) == '_') {
                        i9 = i13;
                        while (i9 < str5.length() && (Character.isLetterOrDigit(str5.charAt(i9)) || str5.charAt(i9) == '_')) {
                            i9++;
                        }
                        String substring2 = str5.substring(i13, i9);
                        AbstractC1276k.e(substring2, "substring(...)");
                        arrayList.add(new G0(substring2, H0.f7704c));
                    } else if (Character.isDigit(str5.charAt(i13))) {
                        i9 = i13;
                        while (i9 < str5.length() && (Character.isDigit(str5.charAt(i9)) || str5.charAt(i9) == '.')) {
                            i9++;
                        }
                        String substring3 = str5.substring(i13, i9);
                        AbstractC1276k.e(substring3, "substring(...)");
                        arrayList.add(new G0(substring3, h04));
                    } else if (str5.charAt(i13) == '\"' || str5.charAt(i13) == '\'') {
                        char charAt = str5.charAt(i13);
                        int i14 = i13 + 1;
                        while (i14 < str5.length() && str5.charAt(i14) != charAt) {
                            if (str5.charAt(i14) == '\\' && (i10 = i14 + 1) < str5.length()) {
                                i14 = i10;
                            }
                            i14++;
                        }
                        if (i14 < str5.length()) {
                            i14++;
                        }
                        String substring4 = str5.substring(i13, i14);
                        AbstractC1276k.e(substring4, "substring(...)");
                        arrayList.add(new G0(substring4, h02));
                        i13 = i14;
                        str4 = str2;
                    } else {
                        String substring5 = str5.substring(i13);
                        AbstractC1276k.e(substring5, "substring(...)");
                        i8 = 0;
                        if (u4.u.D(substring5, "//", false)) {
                            String substring6 = str5.substring(i13);
                            AbstractC1276k.e(substring6, "substring(...)");
                            arrayList.add(new G0(substring6, h03));
                            break;
                        } else {
                            arrayList.add(new G0(String.valueOf(str5.charAt(i13)), H0.f7707g));
                            i13++;
                            str4 = str2;
                        }
                    }
                    i13 = i9;
                    str4 = str2;
                }
                int size = arrayList.size();
                int i15 = i8;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    G0 g02 = (G0) obj;
                    if (z5) {
                        str3 = g02.a.toLowerCase(Locale.ROOT);
                        AbstractC1276k.e(str3, "toLowerCase(...)");
                    } else {
                        str3 = g02.a;
                    }
                    if (set.contains(str3)) {
                        it = it2;
                        h3 = c0542d.h(new S0.G(f02.a, 0L, W0.k.f8837k, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65530));
                        try {
                            c0542d.e(g02.a);
                        } finally {
                        }
                    } else {
                        it = it2;
                        if (set2.contains(str3)) {
                            h3 = c0542d.h(new S0.G(f02.f7692b, 0L, W0.k.f8837k, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65530));
                            try {
                                c0542d.e(g02.a);
                            } finally {
                            }
                        } else {
                            H0 h05 = g02.f7701b;
                            String str6 = g02.a;
                            if (h05 == h02) {
                                h3 = c0542d.h(new S0.G(f02.f7693c, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                                try {
                                    c0542d.e(str6);
                                    c0542d.f(h3);
                                } finally {
                                }
                            } else if (h05 == h03) {
                                h3 = c0542d.h(new S0.G(f02.f7694d, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                                try {
                                    c0542d.e(str6);
                                    c0542d.f(h3);
                                } finally {
                                }
                            } else if (h05 == h04) {
                                h3 = c0542d.h(new S0.G(f02.f7695e, 0L, (W0.k) null, (W0.i) null, (W0.j) null, (W0.p) null, (String) null, 0L, (C0934a) null, (d1.p) null, (Z0.b) null, 0L, (d1.l) null, (C1389K) null, 65534));
                                try {
                                    c0542d.e(str6);
                                    c0542d.f(h3);
                                } finally {
                                }
                            } else {
                                c0542d.e(str6);
                            }
                        }
                    }
                    it2 = it;
                }
                i11 = i12;
                z6 = z7;
                str4 = str2;
            }
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new Q.J(this, c0542d, str, set, set2, z5, f02, i6, 2);
        }
    }
}
