package u4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import i4.AbstractC1121e;

/* renamed from: u4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1767e {
    public static final C1767e a;

    /* JADX WARN: Type inference failed for: r0v0, types: [u4.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        if (!AbstractC1121e.c("  ") && !AbstractC1121e.c(FlexmarkHtmlConverter.DEFAULT_NODE) && !AbstractC1121e.c(FlexmarkHtmlConverter.DEFAULT_NODE)) {
            AbstractC1121e.c(FlexmarkHtmlConverter.DEFAULT_NODE);
        }
        a = obj;
    }

    public final void a(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(TableCell.NOT_TRACKED);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(TableCell.NOT_TRACKED);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append(FlexmarkHtmlConverter.DEFAULT_NODE);
        sb.append("\",");
        sb.append('\n');
        B3.e.z(sb, str, "bytePrefix = \"", FlexmarkHtmlConverter.DEFAULT_NODE, "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append(FlexmarkHtmlConverter.DEFAULT_NODE);
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
