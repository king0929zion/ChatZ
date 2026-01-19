package com.vladsch.flexmark.util.html.ui;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.misc.Utils;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextPane;

/* loaded from: classes.dex */
public class HtmlHelpers {
    public static java.awt.Color mixedColor(java.awt.Color color, java.awt.Color color2) {
        float[] RGBtoHSB = java.awt.Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), new float[3]);
        float[] RGBtoHSB2 = java.awt.Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), new float[3]);
        float[] fArr = {RGBtoHSB2[0], Utils.rangeLimit(RGBtoHSB[1], Utils.min(Utils.max(RGBtoHSB2[1], 0.3f), 0.5f), 1.0f), Utils.rangeLimit(RGBtoHSB[2], Utils.min(Utils.max(RGBtoHSB2[2], 0.3f), 0.5f), 1.0f)};
        return java.awt.Color.getHSBColor(fArr[0], fArr[1], fArr[2]);
    }

    public static void setRegExError(String str, JTextPane jTextPane, Font font, BackgroundColor backgroundColor, BackgroundColor backgroundColor2) {
        HtmlBuilder htmlBuilder = new HtmlBuilder();
        htmlBuilder.tag((CharSequence) "html").style("margin:2px;vertical-align:middle;").attr(backgroundColor, font).tag((CharSequence) "body");
        htmlBuilder.attr(backgroundColor2).tag((CharSequence) FlexmarkHtmlConverter.DIV_NODE);
        htmlBuilder.append(toHtmlError(str, true));
        htmlBuilder.closeTag((CharSequence) FlexmarkHtmlConverter.DIV_NODE);
        htmlBuilder.closeTag((CharSequence) "body");
        htmlBuilder.closeTag((CharSequence) "html");
        jTextPane.setVisible(true);
        jTextPane.setText(htmlBuilder.toFinalizedString());
        jTextPane.revalidate();
        jTextPane.getParent().revalidate();
        jTextPane.getParent().getParent().revalidate();
    }

    public static String toHtmlError(String str, boolean z5) {
        String group;
        if (str == null) {
            return null;
        }
        if (z5) {
            Matcher matcher = Pattern.compile("(?:^|\n)(.*\n)(\\s*)\\^(\n?)$").matcher(str);
            if (matcher.find() && (group = matcher.group(2)) != null && !group.isEmpty()) {
                int start = matcher.group(1) != null ? matcher.start(1) : matcher.start(2);
                String repeat = Utils.repeat("&nbsp;", group.length());
                str = str.substring(0, start) + "<span style=\"font-family:monospaced\">" + str.substring(start, matcher.start(2)).replace(SequenceUtils.SPACE, "&nbsp;") + repeat + "^</span>" + group;
            }
        }
        return str.replace(SequenceUtils.EOL, "<br>");
    }

    public static String toHtmlString(java.awt.Color color) {
        return color == null ? "#000000" : String.format("#%02x%02x%02x", Integer.valueOf(color.getRed()), Integer.valueOf(color.getGreen()), Integer.valueOf(color.getBlue()));
    }

    public static String toRgbString(java.awt.Color color) {
        if (color == null) {
            return "rgb(0,0,0)";
        }
        int red = color.getRed();
        int green = color.getGreen();
        return AbstractC1135a.i(AbstractC1135a.j(red, "rgb(", green, ",", ","), color.getBlue(), ")");
    }

    public static String withContext(String str, String str2, int i6, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('\n');
        sb.append(str3);
        sb.append(str2);
        sb.append(str4);
        sb.append('\n');
        for (int i7 = 1; i7 < str3.length(); i7++) {
            sb.append(SequenceUtils.SPC);
        }
        sb.append("^\n");
        return sb.toString();
    }
}
