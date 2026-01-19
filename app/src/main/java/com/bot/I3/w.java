package I3;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.LinkedHashMap;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final w f2764f;

    /* renamed from: g, reason: collision with root package name */
    public static final w f2765g;

    /* renamed from: h, reason: collision with root package name */
    public static final w f2766h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f2767i;

    /* renamed from: j, reason: collision with root package name */
    public static final w f2768j;

    /* renamed from: c, reason: collision with root package name */
    public final int f2769c;

    /* renamed from: e, reason: collision with root package name */
    public final String f2770e;

    static {
        w wVar = new w(100, "Continue");
        w wVar2 = new w(101, "Switching Protocols");
        w wVar3 = new w(102, "Processing");
        w wVar4 = new w(200, "OK");
        w wVar5 = new w(201, "Created");
        w wVar6 = new w(202, "Accepted");
        w wVar7 = new w(203, "Non-Authoritative Information");
        w wVar8 = new w(204, "No Content");
        w wVar9 = new w(205, "Reset Content");
        w wVar10 = new w(206, "Partial Content");
        w wVar11 = new w(207, "Multi-Status");
        w wVar12 = new w(300, "Multiple Choices");
        w wVar13 = new w(301, "Moved Permanently");
        f2764f = wVar13;
        w wVar14 = new w(302, "Found");
        f2765g = wVar14;
        w wVar15 = new w(303, "See Other");
        f2766h = wVar15;
        w wVar16 = new w(304, "Not Modified");
        w wVar17 = new w(305, "Use Proxy");
        w wVar18 = new w(306, "Switch Proxy");
        w wVar19 = new w(307, "Temporary Redirect");
        f2767i = wVar19;
        w wVar20 = new w(308, "Permanent Redirect");
        f2768j = wVar20;
        List I5 = Y4.l.I(wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, wVar15, wVar16, wVar17, wVar18, wVar19, wVar20, new w(400, "Bad Request"), new w(401, "Unauthorized"), new w(402, "Payment Required"), new w(403, "Forbidden"), new w(404, "Not Found"), new w(405, "Method Not Allowed"), new w(406, "Not Acceptable"), new w(407, "Proxy Authentication Required"), new w(408, "Request Timeout"), new w(409, "Conflict"), new w(410, "Gone"), new w(411, "Length Required"), new w(412, "Precondition Failed"), new w(413, "Payload Too Large"), new w(414, "Request-URI Too Long"), new w(415, "Unsupported Media Type"), new w(416, "Requested Range Not Satisfiable"), new w(417, "Expectation Failed"), new w(422, "Unprocessable Entity"), new w(423, "Locked"), new w(424, "Failed Dependency"), new w(425, "Too Early"), new w(426, "Upgrade Required"), new w(429, "Too Many Requests"), new w(431, "Request Header Fields Too Large"), new w(500, "Internal Server Error"), new w(501, "Not Implemented"), new w(502, "Bad Gateway"), new w(503, "Service Unavailable"), new w(504, "Gateway Timeout"), new w(505, "HTTP Version Not Supported"), new w(506, "Variant Also Negotiates"), new w(507, "Insufficient Storage"));
        int H3 = Y3.C.H(Y3.n.Z(I5, 10));
        if (H3 < 16) {
            H3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H3);
        for (Object obj : I5) {
            linkedHashMap.put(Integer.valueOf(((w) obj).f2769c), obj);
        }
    }

    public w(int i6, String str) {
        AbstractC1276k.f(str, "description");
        this.f2769c = i6;
        this.f2770e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w wVar = (w) obj;
        AbstractC1276k.f(wVar, "other");
        return this.f2769c - wVar.f2769c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && ((w) obj).f2769c == this.f2769c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2769c);
    }

    public final String toString() {
        return this.f2769c + SequenceUtils.SPC + this.f2770e;
    }
}
