package I2;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.format.TableCell;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import m4.AbstractC1276k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import u4.C1772j;
import u4.C1774l;

/* loaded from: classes.dex */
public final class D {
    public static final String[] a = {"text/plain", "text/markdown", "text/csv", "application/json", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "image/*"};

    /* renamed from: b, reason: collision with root package name */
    public static final C1774l f2613b = new C1774l("sheet(\\d+)\\.xml");

    /* renamed from: c, reason: collision with root package name */
    public static final C1774l f2614c = new C1774l("slide(\\d+)\\.xml");

    public static final int a(String str) {
        String str2;
        Integer E5;
        C1772j a6 = C1774l.a(f2613b, str);
        return (a6 == null || (str2 = (String) Y3.m.r0(a6.a(), 1)) == null || (E5 = u4.u.E(str2)) == null) ? TableCell.NOT_TRACKED : E5.intValue();
    }

    public static final int b(String str) {
        String str2;
        Integer E5;
        C1772j a6 = C1774l.a(f2614c, str);
        return (a6 == null || (str2 = (String) Y3.m.r0(a6.a(), 1)) == null || (E5 = u4.u.E(str2)) == null) ? TableCell.NOT_TRACKED : E5.intValue();
    }

    public static boolean c(String str, String str2) {
        return (str != null && u4.u.D(str, "image/", false)) || u4.u.w(str2, ".jpg", false) || u4.u.w(str2, ".jpeg", false) || u4.u.w(str2, ".png", false) || u4.u.w(str2, ".webp", false) || u4.u.w(str2, ".bmp", false) || u4.u.w(str2, ".gif", false);
    }

    public static boolean d(String str, String str2) {
        return (str2 != null && u4.u.D(str2, "text/", false)) || AbstractC1276k.b(str2, "application/json") || u4.u.w(str, ".txt", false) || u4.u.w(str, ".md", false) || u4.u.w(str, ".json", false) || u4.u.w(str, ".csv", false);
    }

    public static boolean e(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC1276k.e(lowerCase, "toLowerCase(...)");
        return d(lowerCase, str2) || u4.u.w(lowerCase, ".docx", false) || AbstractC1276k.b(str2, "application/vnd.openxmlformats-officedocument.wordprocessingml.document") || u4.u.w(lowerCase, ".xlsx", false) || AbstractC1276k.b(str2, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") || u4.u.w(lowerCase, ".pptx", false) || AbstractC1276k.b(str2, "application/vnd.openxmlformats-officedocument.presentationml.presentation");
    }

    public static String f(ByteArrayInputStream byteArrayInputStream) {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(byteArrayInputStream, null);
        StringBuilder sb = new StringBuilder();
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name != null) {
                    int hashCode = name.hashCode();
                    if (hashCode != 116) {
                        if (hashCode == 3152) {
                            if (!name.equals(FlexmarkHtmlConverter.BR_NODE)) {
                            }
                            sb.append('\n');
                        } else if (hashCode == 3183) {
                            if (!name.equals("cr")) {
                            }
                            sb.append('\n');
                        } else if (hashCode == 114581 && name.equals("tab")) {
                            sb.append('\t');
                        }
                    } else if (name.equals("t")) {
                        sb.append(newPullParser.nextText());
                    }
                }
            } else if (eventType == 3 && AbstractC1276k.b(newPullParser.getName(), FlexmarkHtmlConverter.P_NODE)) {
                sb.append('\n');
            }
        }
        return B3.e.p("toString(...)", sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList g(java.io.ByteArrayInputStream r9) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            r1 = 1
            r0.setNamespaceAware(r1)
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            r2 = 0
            r0.setInput(r9, r2)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.getEventType()
            r4 = 0
            r5 = r4
        L20:
            if (r3 == r1) goto Lb6
            r6 = 2
            java.lang.String r7 = "si"
            if (r3 == r6) goto L47
            r6 = 3
            if (r3 == r6) goto L2c
            goto Lb0
        L2c:
            java.lang.String r3 = r0.getName()
            boolean r3 = m4.AbstractC1276k.b(r3, r7)
            if (r3 == 0) goto Lb0
            if (r5 == 0) goto Lb0
            java.lang.String r3 = r2.toString()
            java.lang.String r5 = "toString(...)"
            m4.AbstractC1276k.e(r3, r5)
            r9.add(r3)
            r5 = r4
            goto Lb0
        L47:
            java.lang.String r3 = r0.getName()
            if (r3 == 0) goto Lb0
            int r6 = r3.hashCode()
            r8 = 116(0x74, float:1.63E-43)
            if (r6 == r8) goto L9e
            r8 = 3152(0xc50, float:4.417E-42)
            if (r6 == r8) goto L8d
            r8 = 3183(0xc6f, float:4.46E-42)
            if (r6 == r8) goto L84
            r8 = 3670(0xe56, float:5.143E-42)
            if (r6 == r8) goto L78
            r7 = 114581(0x1bf95, float:1.60562E-40)
            if (r6 == r7) goto L67
            goto Lb0
        L67:
            java.lang.String r6 = "tab"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L70
            goto Lb0
        L70:
            if (r5 == 0) goto Lb0
            r3 = 9
            r2.append(r3)
            goto Lb0
        L78:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L7f
            goto Lb0
        L7f:
            r2.setLength(r4)
            r5 = r1
            goto Lb0
        L84:
            java.lang.String r6 = "cr"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L96
            goto Lb0
        L8d:
            java.lang.String r6 = "br"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L96
            goto Lb0
        L96:
            if (r5 == 0) goto Lb0
            r3 = 10
            r2.append(r3)
            goto Lb0
        L9e:
            java.lang.String r6 = "t"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto La7
            goto Lb0
        La7:
            if (r5 == 0) goto Lb0
            java.lang.String r3 = r0.nextText()
            r2.append(r3)
        Lb0:
            int r3 = r0.next()
            goto L20
        Lb6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.D.g(java.io.ByteArrayInputStream):java.util.ArrayList");
    }

    public static String h(ByteArrayInputStream byteArrayInputStream, List list) {
        String str;
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(byteArrayInputStream, null);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str2 = null;
        boolean z5 = false;
        boolean z6 = false;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name != null) {
                    int hashCode = name.hashCode();
                    if (hashCode != 99) {
                        if (hashCode != 116) {
                            if (hashCode != 118) {
                                if (hashCode == 113114 && name.equals("row")) {
                                    sb2.setLength(0);
                                    z5 = false;
                                }
                            } else if (name.equals("v") && z6) {
                                String nextText = newPullParser.nextText();
                                AbstractC1276k.c(nextText);
                                if (AbstractC1276k.b(str2, "s")) {
                                    Integer E5 = u4.u.E(nextText);
                                    if (E5 != null && (str = (String) Y3.m.r0(list, E5.intValue())) != null) {
                                        nextText = str;
                                    }
                                } else if (AbstractC1276k.b(str2, FlexmarkHtmlConverter.B_NODE)) {
                                    nextText = nextText.equals("1") ? "TRUE" : "FALSE";
                                }
                                sb3.setLength(0);
                                sb3.append(nextText);
                            }
                        } else if (name.equals("t") && z6 && AbstractC1276k.b(str2, "inlineStr")) {
                            sb3.append(newPullParser.nextText());
                        }
                    } else if (name.equals("c")) {
                        str2 = newPullParser.getAttributeValue(null, "t");
                        sb3.setLength(0);
                        z6 = true;
                    }
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (AbstractC1276k.b(name2, "c")) {
                    String p5 = B3.e.p("toString(...)", sb3);
                    if (p5.length() > 0) {
                        if (z5) {
                            sb2.append('\t');
                        }
                        sb2.append(p5);
                        z5 = true;
                    }
                    str2 = null;
                    z6 = false;
                } else if (AbstractC1276k.b(name2, "row") && z5) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(sb2.toString());
                }
            }
        }
        return B3.e.p("toString(...)", sb);
    }

    public static LinkedHashMap i(InputStream inputStream, l4.c cVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(inputStream));
        try {
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    AbstractC1276k.e(name, "getName(...)");
                    if (((Boolean) cVar.f(name)).booleanValue()) {
                        String name2 = nextEntry.getName();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        for (int read = zipInputStream.read(bArr); read > 0; read = zipInputStream.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC1276k.e(byteArray, "toByteArray(...)");
                        linkedHashMap.put(name2, byteArray);
                    }
                }
            }
            zipInputStream.close();
            return linkedHashMap;
        } finally {
        }
    }
}
