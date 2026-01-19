package u4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1121e;

/* renamed from: u4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1768f {

    /* renamed from: b, reason: collision with root package name */
    public static final C1768f f15179b = new C1768f();
    public final boolean a = true;

    public C1768f() {
        if (AbstractC1121e.c(FlexmarkHtmlConverter.DEFAULT_NODE)) {
            return;
        }
        AbstractC1121e.c(FlexmarkHtmlConverter.DEFAULT_NODE);
    }

    public final void a(String str, StringBuilder sb) {
        B3.e.z(sb, str, "prefix = \"", FlexmarkHtmlConverter.DEFAULT_NODE, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append(FlexmarkHtmlConverter.DEFAULT_NODE);
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
