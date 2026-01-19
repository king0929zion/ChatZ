package com.vladsch.flexmark.util.html.ui;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.util.HashMap;
import java.util.Locale;
import org.jsoup.internal.SharedConstants;

/* loaded from: classes.dex */
public class ColorStyler extends HtmlStylerBase<java.awt.Color> {
    public static final HashMap<Integer, String> colorNameMap = new HashMap<>();
    public static final HashMap<String, Integer> nameColorMap = new HashMap<>();

    static {
        addColorName(0, "black");
        addColorName(PegdownExtensions.FENCED_CODE_BLOCKS, "navy");
        addColorName(139, "darkblue");
        addColorName(205, "mediumblue");
        addColorName(255, "blue");
        addColorName(25600, "darkgreen");
        addColorName(SharedConstants.DefaultBufferSize, "green");
        addColorName(32896, "teal");
        addColorName(35723, "darkcyan");
        addColorName(49151, "deepskyblue");
        addColorName(52945, "darkturquoise");
        addColorName(64154, "mediumspringgreen");
        addColorName(65280, "lime");
        addColorName(65407, "springgreen");
        addColorName(65535, "aqua");
        addColorName(1644912, "midnightblue");
        addColorName(2003199, "dodgerblue");
        addColorName(2142890, "lightseagreen");
        addColorName(2263842, "forestgreen");
        addColorName(3050327, "seagreen");
        addColorName(3100495, "darkslategray");
        addColorName(3100495, "darkslategrey");
        addColorName(3329330, "limegreen");
        addColorName(3978097, "mediumseagreen");
        addColorName(4251856, "turquoise");
        addColorName(4286945, "royalblue");
        addColorName(4620980, "steelblue");
        addColorName(4734347, "darkslateblue");
        addColorName(4772300, "mediumturquoise");
        addColorName(4915330, "indigo");
        addColorName(5597999, "darkolivegreen");
        addColorName(6266528, "cadetblue");
        addColorName(6591981, "cornflowerblue");
        addColorName(6697881, "rebeccapurple");
        addColorName(6737322, "mediumaquamarine");
        addColorName(6908265, "dimgray");
        addColorName(6908265, "dimgrey");
        addColorName(6970061, "slateblue");
        addColorName(7048739, "olivedrab");
        addColorName(7372944, "slategray");
        addColorName(7372944, "slategrey");
        addColorName(7833753, "lightslategray");
        addColorName(7833753, "lightslategrey");
        addColorName(8087790, "mediumslateblue");
        addColorName(8190976, "lawngreen");
        addColorName(8388352, "chartreuse");
        addColorName(8388564, "aquamarine");
        addColorName(PegdownExtensions.EXTANCHORLINKS_WRAP, "maroon");
        addColorName(8388736, "purple");
        addColorName(8421376, "olive");
        addColorName(8421504, "gray");
        addColorName(8421504, "grey");
        addColorName(8900331, "skyblue");
        addColorName(8900346, "lightskyblue");
        addColorName(9055202, "blueviolet");
        addColorName(9109504, "darkred");
        addColorName(9109643, "darkmagenta");
        addColorName(9127187, "saddlebrown");
        addColorName(9419919, "darkseagreen");
        addColorName(9498256, "lightgreen");
        addColorName(9662683, "mediumpurple");
        addColorName(9699539, "darkviolet");
        addColorName(10025880, "palegreen");
        addColorName(10040012, "darkorchid");
        addColorName(10145074, "yellowgreen");
        addColorName(10506797, "sienna");
        addColorName(10824234, "brown");
        addColorName(11119017, "darkgray");
        addColorName(11119017, "darkgrey");
        addColorName(11393254, "lightblue");
        addColorName(11403055, "greenyellow");
        addColorName(11529966, "paleturquoise");
        addColorName(11584734, "lightsteelblue");
        addColorName(11591910, "powderblue");
        addColorName(11674146, "firebrick");
        addColorName(12092939, "darkgoldenrod");
        addColorName(12211667, "mediumorchid");
        addColorName(12357519, "rosybrown");
        addColorName(12433259, "darkkhaki");
        addColorName(12632256, "silver");
        addColorName(13047173, "mediumvioletred");
        addColorName(13458524, "indianred");
        addColorName(13468991, "peru");
        addColorName(13789470, "chocolate");
        addColorName(13808780, "tan");
        addColorName(13882323, "lightgray");
        addColorName(13882323, "lightgrey");
        addColorName(14204888, "thistle");
        addColorName(14315734, "orchid");
        addColorName(14329120, "goldenrod");
        addColorName(14381203, "palevioletred");
        addColorName(14423100, "crimson");
        addColorName(14474460, "gainsboro");
        addColorName(14524637, "plum");
        addColorName(14596231, "burlywood");
        addColorName(14745599, "lightcyan");
        addColorName(15132410, "lavender");
        addColorName(15308410, "darksalmon");
        addColorName(15631086, "violet");
        addColorName(15657130, "palegoldenrod");
        addColorName(15761536, "lightcoral");
        addColorName(15787660, "khaki");
        addColorName(15792383, "aliceblue");
        addColorName(15794160, "honeydew");
        addColorName(15794175, "azure");
        addColorName(16032864, "sandybrown");
        addColorName(16113331, "wheat");
        addColorName(16119260, "beige");
        addColorName(16119285, "whitesmoke");
        addColorName(16121850, "mintcream");
        addColorName(16316671, "ghostwhite");
        addColorName(16416882, "salmon");
        addColorName(16444375, "antiquewhite");
        addColorName(16445670, "linen");
        addColorName(16448210, "lightgoldenrodyellow");
        addColorName(16643558, "oldlace");
        addColorName(16711680, "red");
        addColorName(16711935, "fuchsia");
        addColorName(16716947, "deeppink");
        addColorName(16729344, "orangered");
        addColorName(16737095, "tomato");
        addColorName(16738740, "hotpink");
        addColorName(16744272, "coral");
        addColorName(16747520, "darkorange");
        addColorName(16752762, "lightsalmon");
        addColorName(16753920, "orange");
        addColorName(16758465, "lightpink");
        addColorName(16761035, "pink");
        addColorName(16766720, "gold");
        addColorName(16767673, "peachpuff");
        addColorName(16768685, "navajowhite");
        addColorName(16770229, "moccasin");
        addColorName(16770244, "bisque");
        addColorName(16770273, "mistyrose");
        addColorName(16772045, "blanchedalmond");
        addColorName(16773077, "papayawhip");
        addColorName(16773365, "lavenderblush");
        addColorName(16774638, "seashell");
        addColorName(16775388, "cornsilk");
        addColorName(16775885, "lemonchiffon");
        addColorName(16775920, "floralwhite");
        addColorName(16775930, "snow");
        addColorName(16776960, "yellow");
        addColorName(16777184, "lightyellow");
        addColorName(16777200, "ivory");
        addColorName(16777215, "white");
    }

    private static void addColorName(int i6, String str) {
        colorNameMap.put(Integer.valueOf(i6), str);
        nameColorMap.put(str, Integer.valueOf(i6));
    }

    public static String getColorName(java.awt.Color color) {
        if (color != null) {
            return colorNameMap.get(Integer.valueOf(color.getRGB() & 16777215));
        }
        return null;
    }

    public static String getColorNameOrRGB(java.awt.Color color) {
        if (color == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        String str = colorNameMap.get(Integer.valueOf(color.getRGB() & 16777215));
        if (str != null) {
            return str;
        }
        Locale locale = Locale.US;
        int red = color.getRed();
        int green = color.getGreen();
        return AbstractC1135a.i(AbstractC1135a.j(red, "rgb(", green, ",", ","), color.getBlue(), ")");
    }

    public static String getColorValue(java.awt.Color color) {
        if (color == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        if (color.getAlpha() == 255) {
            return String.format(Locale.US, "%02x%02x%02x", Integer.valueOf(color.getRed()), Integer.valueOf(color.getGreen()), Integer.valueOf(color.getBlue()));
        }
        Locale locale = Locale.US;
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        int alpha = color.getAlpha();
        StringBuilder j3 = AbstractC1135a.j(red, "rgba(", green, ",", ",");
        j3.append(blue);
        j3.append(",");
        j3.append(alpha);
        j3.append(")");
        return j3.toString();
    }

    public static java.awt.Color getNamedColor(String str) {
        String substring;
        String substring2;
        String substring3;
        if (!str.startsWith("#")) {
            Integer num = nameColorMap.get(str);
            if (num == null) {
                return null;
            }
            return new java.awt.Color(num.intValue());
        }
        if (SequenceUtils.parseIntOrNull(str.substring(1), 16) == null) {
            return null;
        }
        String substring4 = str.substring(1);
        int length = substring4.length();
        String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (length == 3) {
            substring = substring4.substring(0, 1);
            substring2 = substring4.substring(1, 2);
            substring3 = substring4.substring(2, 3);
        } else if (length == 4) {
            substring = substring4.substring(0, 1);
            substring2 = substring4.substring(1, 2);
            String substring5 = substring4.substring(2, 3);
            str2 = substring4.substring(3, 4);
            substring3 = substring5;
        } else if (length == 6) {
            substring = substring4.substring(0, 2);
            substring2 = substring4.substring(2, 4);
            substring3 = substring4.substring(4, 6);
        } else {
            if (length != 8) {
                return null;
            }
            substring = substring4.substring(0, 2);
            substring2 = substring4.substring(2, 4);
            substring4.substring(4, 6);
            substring3 = substring4.substring(6, 8);
        }
        if (substring.length() == 1) {
            substring = substring.concat(substring);
        }
        if (substring2.length() == 1) {
            substring2 = substring2.concat(substring2);
        }
        if (substring3.length() == 1) {
            substring3 = substring3.concat(substring3);
        }
        if (str2.length() == 1) {
            str2 = str2.concat(str2);
        }
        if (str2.isEmpty()) {
            str2 = "ff";
        }
        return new java.awt.Color(parse(substring), parse(substring2), parse(substring3), parse(str2));
    }

    public static int parse(String str) {
        return Integer.parseInt(str, 16);
    }

    @Override // com.vladsch.flexmark.util.html.ui.HtmlStylerBase, com.vladsch.flexmark.util.html.ui.HtmlStyler
    public String getStyle(java.awt.Color color) {
        if (color instanceof BackgroundColor) {
            return AbstractC1135a.f("background-color:#", getColorValue(color));
        }
        if (color == null) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        return AbstractC1135a.f("color:#", getColorValue(color));
    }
}
