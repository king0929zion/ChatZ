package com.vladsch.flexmark.util.misc;

import S.l;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.AffineTransform;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageObserver;
import java.awt.image.RGBImageFilter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

/* loaded from: classes.dex */
public class ImageUtils {
    public static Color TRANSPARENT = new Color(0, 0, 0, 0);
    private static final Pattern BASE64_ENCODING_PATTERN = Pattern.compile("^data:image/[a-z0-9_-]+;base64,", 2);

    public static BufferedImage addBorder(BufferedImage bufferedImage, Color color, int i6, int i7) {
        int i8 = i6 * 2;
        int width = bufferedImage.getWidth() + i8;
        int height = bufferedImage.getHeight() + i8;
        BufferedImage bufferedImage2 = new BufferedImage(width, height, 2);
        Graphics2D createGraphics = bufferedImage2.createGraphics();
        createGraphics.setColor(color);
        createGraphics.drawImage(bufferedImage, i6, i6, bufferedImage.getWidth(), bufferedImage.getHeight(), (ImageObserver) null);
        float f6 = i6;
        createGraphics.setStroke(new BasicStroke(f6, 2, 0, f6));
        createGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int i9 = (width - i6) - 1;
        int i10 = (height - i6) - 1;
        int i11 = i6 / 2;
        if (i7 > 0) {
            int i12 = i7 + i6;
            createGraphics.drawRoundRect(i11, i11, i9, i10, i12, i12);
        } else {
            createGraphics.drawRect(i11, i11, i9, i10);
        }
        createGraphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage base64Decode(File file) {
        String str;
        int indexOf;
        if (file != null && file.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[(int) file.length()];
                if (fileInputStream.read(bArr) != -1 && (indexOf = (str = new String(bArr, StandardCharsets.UTF_8)).indexOf(44)) >= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.getDecoder().decode(str.substring(indexOf + 1)));
                    BufferedImage read = ImageIO.read(byteArrayInputStream);
                    byteArrayInputStream.close();
                    return read;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String base64Encode(BufferedImage bufferedImage) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = null;
        try {
            ImageIO.write(bufferedImage, "PNG", byteArrayOutputStream);
            str = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray()).replace("\r", FlexmarkHtmlConverter.DEFAULT_NODE).replace(SequenceUtils.EOL, FlexmarkHtmlConverter.DEFAULT_NODE);
            byteArrayOutputStream.close();
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        return AbstractC1135a.f("data:image/png;base64,", str);
    }

    public static BufferedImage cropImage(BufferedImage bufferedImage, int i6, int i7, int i8, int i9) {
        return bufferedImage.getSubimage(i6, i8, (bufferedImage.getWidth() - i6) - i7, (bufferedImage.getHeight() - i8) - i9);
    }

    public static BufferedImage drawHighlightOval(BufferedImage bufferedImage, int i6, int i7, int i8, int i9, Color color, int i10, Color color2) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        Graphics2D createGraphics = bufferedImage2.createGraphics();
        createGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        boolean z5 = color2.getAlpha() != 0;
        createGraphics.drawImage(bufferedImage, 0, 0, (ImageObserver) null);
        if (z5) {
            createGraphics.setColor(color2);
            createGraphics.fillOval(i6, i7, i8, i9);
        }
        if (i10 > 0) {
            createGraphics.setColor(color);
            float f6 = i10;
            createGraphics.setStroke(new BasicStroke(f6, 2, 0, f6));
            createGraphics.drawOval(i6, i7, i8, i9);
        }
        createGraphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage drawHighlightRectangle(BufferedImage bufferedImage, int i6, int i7, int i8, int i9, Color color, int i10, int i11, Color color2) {
        Graphics2D graphics2D;
        Graphics2D graphics2D2;
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        Graphics2D createGraphics = bufferedImage2.createGraphics();
        createGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        boolean z5 = color2.getAlpha() != 0;
        createGraphics.drawImage(bufferedImage, 0, 0, (ImageObserver) null);
        if (i11 > 0) {
            if (z5) {
                createGraphics.setColor(color2);
                graphics2D2 = createGraphics;
                graphics2D2.fillRoundRect(i6, i7, i8, i9, i11, i11);
            } else {
                graphics2D2 = createGraphics;
            }
            if (i10 > 0) {
                graphics2D2.setColor(color);
                float f6 = i10;
                graphics2D2.setStroke(new BasicStroke(f6, 2, 0, f6));
                graphics2D2.drawRoundRect(i6, i7, i8, i9, i11, i11);
            }
            graphics2D = graphics2D2;
        } else {
            graphics2D = createGraphics;
            if (z5) {
                graphics2D.setColor(color2);
                graphics2D.fillRect(i6, i7, i8, i9);
            }
            if (i10 > 0) {
                graphics2D.setColor(color);
                float f7 = i10;
                graphics2D.setStroke(new BasicStroke(f7, 2, 0, f7));
                graphics2D.drawRect(i6, i7, i8, i9);
            }
        }
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage drawOval(BufferedImage bufferedImage, int i6, int i7, int i8, int i9, Color color, int i10, float[] fArr, float f6) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        Graphics2D createGraphics = bufferedImage2.createGraphics();
        Color color2 = color == null ? Color.getColor(FlexmarkHtmlConverter.DEFAULT_NODE, ~(bufferedImage.getRGB((i8 / 2) + i6, (i9 / 2) + i7) & 16777215)) : color;
        createGraphics.drawImage(bufferedImage, 0, 0, (ImageObserver) null);
        if (fArr != null) {
            float f7 = i10;
            createGraphics.setStroke(new BasicStroke(f7, 2, 0, f7, fArr, f6));
        } else {
            float f8 = i10;
            createGraphics.setStroke(new BasicStroke(f8, 2, 0, f8));
        }
        createGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        createGraphics.setColor(color2);
        createGraphics.drawOval(i6, i7, i8, i9);
        createGraphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage drawRectangle(BufferedImage bufferedImage, int i6, int i7, int i8, int i9, Color color, int i10, int i11) {
        return drawRectangle(bufferedImage, i6, i7, i8, i9, color, i10, i11, null, l.f7374V);
    }

    public static byte[] getImageBytes(BufferedImage bufferedImage) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ImageIO.write(bufferedImage, "PNG", byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    public static Image getImageFromClipboard() {
        return getImageFromTransferable(Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null));
    }

    public static Image getImageFromTransferable(Transferable transferable) {
        if (transferable != null) {
            try {
                if (transferable.isDataFlavorSupported(DataFlavor.imageFlavor)) {
                    return (Image) transferable.getTransferData(DataFlavor.imageFlavor);
                }
            } catch (IOException unused) {
                throw new RuntimeException();
            } catch (UnsupportedFlavorException e6) {
                e6.printStackTrace();
            }
        }
        return null;
    }

    public static boolean isEncodedImage(String str) {
        return str != null && str.startsWith("data:image/") && BASE64_ENCODING_PATTERN.matcher(str).find();
    }

    public static boolean isPossiblyEncodedImage(String str) {
        return str != null && str.startsWith("data:image/");
    }

    public static BufferedImage loadImageFromContent(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                BufferedImage read = ImageIO.read(byteArrayInputStream);
                try {
                    byteArrayInputStream.close();
                    return read;
                } catch (IOException e6) {
                    e6.printStackTrace();
                    return read;
                }
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                throw th;
            }
        } catch (IOException | IndexOutOfBoundsException unused) {
            System.err.print("*");
            System.err.println("could not read from image bytes for " + str);
            try {
                byteArrayInputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            return null;
        }
    }

    public static BufferedImage loadImageFromFile(File file) {
        if (file != null && file.isFile()) {
            for (int i6 = 0; i6 < 3; i6++) {
                try {
                    try {
                        BufferedImage read = ImageIO.read(file);
                        if (i6 > 0) {
                            System.err.println();
                        }
                        return read;
                    } catch (IndexOutOfBoundsException unused) {
                        System.err.print("*");
                        System.err.println("could not read" + file);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        return null;
    }

    public static BufferedImage loadImageFromURL(String str) {
        return loadImageFromURL(str, false);
    }

    public static BufferedImage makeRoundedCorner(BufferedImage bufferedImage, int i6, int i7) {
        float f6 = i6;
        if (f6 == l.f7374V) {
            return bufferedImage;
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        BufferedImage bufferedImage2 = new BufferedImage(width, height, 2);
        Graphics2D createGraphics = bufferedImage2.createGraphics();
        createGraphics.setComposite(AlphaComposite.Src);
        createGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        createGraphics.setColor(Color.WHITE);
        createGraphics.fill(new RoundRectangle2D.Float(l.f7374V, l.f7374V, width, height, f6, f6));
        createGraphics.setComposite(AlphaComposite.SrcAtop);
        createGraphics.drawImage(bufferedImage, 0, 0, (ImageObserver) null);
        createGraphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage punchOuterHighlightOval(BufferedImage bufferedImage, BufferedImage bufferedImage2, int i6, int i7, int i8, int i9, int i10, Color color, int i11, int i12, boolean z5) {
        if (color.getAlpha() == 0) {
            return bufferedImage2;
        }
        BufferedImage bufferedImage3 = bufferedImage2 != null ? bufferedImage2 : new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        Graphics2D createGraphics = bufferedImage3.createGraphics();
        createGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (bufferedImage2 == null) {
            createGraphics.setColor(color);
            if (i12 > 0) {
                int i13 = i11 * 2;
                createGraphics.fillRoundRect(i11, i11, width - i13, height - i13, i12, i12);
            } else {
                int i14 = i11 * 2;
                createGraphics.fillRect(i11, i11, width - i14, height - i14);
            }
        }
        createGraphics.setColor(TRANSPARENT);
        createGraphics.setComposite(AlphaComposite.Src);
        int i15 = i10 / 2;
        createGraphics.fillOval(Utils.minLimit(0, i6 - i15), Utils.minLimit(0, i7 - i15), i8 + i10, i9 + i10);
        if (z5) {
            createGraphics.setComposite(AlphaComposite.DstOver);
            createGraphics.drawImage(bufferedImage, 0, 0, (ImageObserver) null);
        }
        createGraphics.dispose();
        return bufferedImage3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.awt.image.BufferedImage punchOuterHighlightRectangle(java.awt.image.BufferedImage r8, java.awt.image.BufferedImage r9, int r10, int r11, int r12, int r13, int r14, int r15, java.awt.Color r16, int r17, int r18, boolean r19) {
        /*
            int r0 = r16.getAlpha()
            if (r0 == 0) goto Laf
            if (r9 == 0) goto La
            r7 = r9
            goto L19
        La:
            java.awt.image.BufferedImage r0 = new java.awt.image.BufferedImage
            int r1 = r8.getWidth()
            int r2 = r8.getHeight()
            r3 = 2
            r0.<init>(r1, r2, r3)
            r7 = r0
        L19:
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            r2 = r0
            java.awt.Graphics2D r0 = r7.createGraphics()
            java.awt.RenderingHints$Key r3 = java.awt.RenderingHints.KEY_ANTIALIASING
            java.lang.Object r4 = java.awt.RenderingHints.VALUE_ANTIALIAS_ON
            r0.setRenderingHint(r3, r4)
            if (r9 != 0) goto L47
            r9 = r16
            r0.setColor(r9)
            if (r18 <= 0) goto L49
            int r9 = r17 * 2
            int r3 = r2 - r9
            int r4 = r1 - r9
            r2 = r17
            r6 = r18
            r1 = r17
            r5 = r18
            r0.fillRoundRect(r1, r2, r3, r4, r5, r6)
        L47:
            r9 = r0
            goto L53
        L49:
            r9 = r0
            r0 = r17
            int r3 = r0 * 2
            int r2 = r2 - r3
            int r1 = r1 - r3
            r9.fillRect(r0, r0, r2, r1)
        L53:
            r0 = 0
            if (r15 <= 0) goto L7d
            java.awt.Color r1 = com.vladsch.flexmark.util.misc.ImageUtils.TRANSPARENT
            r9.setColor(r1)
            java.awt.AlphaComposite r1 = java.awt.AlphaComposite.Src
            r9.setComposite(r1)
            int r1 = r14 / 2
            int r10 = r10 - r1
            int[] r10 = new int[]{r10}
            int r10 = com.vladsch.flexmark.util.misc.Utils.minLimit(r0, r10)
            int r11 = r11 - r1
            int[] r11 = new int[]{r11}
            int r11 = com.vladsch.flexmark.util.misc.Utils.minLimit(r0, r11)
            int r12 = r12 + r14
            int r13 = r13 + r14
            int r14 = r14 + r15
            r1 = r14
            r15 = r1
            r9.fillRoundRect(r10, r11, r12, r13, r14, r15)
            goto La0
        L7d:
            java.awt.Color r1 = com.vladsch.flexmark.util.misc.ImageUtils.TRANSPARENT
            r9.setColor(r1)
            java.awt.AlphaComposite r1 = java.awt.AlphaComposite.Src
            r9.setComposite(r1)
            int r1 = r14 / 2
            int r10 = r10 - r1
            int[] r10 = new int[]{r10}
            int r10 = com.vladsch.flexmark.util.misc.Utils.minLimit(r0, r10)
            int r11 = r11 - r1
            int[] r11 = new int[]{r11}
            int r11 = com.vladsch.flexmark.util.misc.Utils.minLimit(r0, r11)
            int r12 = r12 + r14
            int r13 = r13 + r14
            r9.fillRect(r10, r11, r12, r13)
        La0:
            if (r19 == 0) goto Lab
            java.awt.AlphaComposite r10 = java.awt.AlphaComposite.DstOver
            r9.setComposite(r10)
            r10 = 0
            r9.drawImage(r8, r0, r0, r10)
        Lab:
            r9.dispose()
            return r7
        Laf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.misc.ImageUtils.punchOuterHighlightRectangle(java.awt.image.BufferedImage, java.awt.image.BufferedImage, int, int, int, int, int, int, java.awt.Color, int, int, boolean):java.awt.image.BufferedImage");
    }

    public static BufferedImage removeAlpha(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth((ImageObserver) null), bufferedImage.getHeight((ImageObserver) null), 1);
        Graphics2D createGraphics = bufferedImage2.createGraphics();
        createGraphics.drawImage(bufferedImage, 0, 0, bufferedImage2.getWidth(), bufferedImage2.getHeight(), Color.WHITE, (ImageObserver) null);
        createGraphics.dispose();
        return bufferedImage2;
    }

    public static void save(BufferedImage bufferedImage, File file, String str) {
        try {
            ImageIO.write(bufferedImage, str, file);
        } catch (Throwable th) {
            System.out.println("Write error for " + file.getPath() + ": " + th.getMessage());
        }
    }

    public static BufferedImage scaleImage(BufferedImage bufferedImage, int i6, int i7, int i8) {
        if (bufferedImage == null || i6 == 0 || i7 == 0) {
            return null;
        }
        AffineTransform scaleInstance = AffineTransform.getScaleInstance(i6 / bufferedImage.getWidth((ImageObserver) null), i7 / bufferedImage.getHeight((ImageObserver) null));
        if (i8 == 0) {
            i8 = 2;
        }
        return new AffineTransformOp(scaleInstance, i8).filter(bufferedImage, (BufferedImage) null);
    }

    public static BufferedImage toBufferedImage(Image image) {
        if (image == null) {
            return null;
        }
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }
        int width = image.getWidth((ImageObserver) null);
        int height = image.getHeight((ImageObserver) null);
        if (width < 0 || height < 0) {
            return null;
        }
        BufferedImage bufferedImage = new BufferedImage(width, height, 2);
        Graphics2D createGraphics = bufferedImage.createGraphics();
        createGraphics.drawImage(image, 0, 0, (ImageObserver) null);
        createGraphics.dispose();
        return bufferedImage;
    }

    public static Image toTransparent(BufferedImage bufferedImage, Color color, int i6) {
        return Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(bufferedImage.getSource(), new RGBImageFilter(color, i6) { // from class: com.vladsch.flexmark.util.misc.ImageUtils.1
            public final int markerRGB;
            final int radius;
            final /* synthetic */ Color val$color;
            final /* synthetic */ int val$tolerance; {
                this.val$color = color;
                this.val$tolerance = i6;
                this.markerRGB = color.getRGB() | (-16777216);
                this.radius = i6 * i6 * 3;
            }

            public final int filterRGB(int i7, int i8, int i9) {
                if (this.val$tolerance == 0 && (i9 | (-16777216)) == this.markerRGB) {
                    return i9 & 16777215;
                }
                if ((i9 & (-16777216)) == -16777216) {
                    int i10 = this.markerRGB;
                    int i11 = ((i9 & 16711680) >> 16) - ((16711680 & i10) >> 16);
                    int i12 = ((i9 & 65280) >> 8) - ((65280 & i10) >> 8);
                    int i13 = (i9 & 255) - (i10 & 255);
                    if ((i13 * i13) + (i12 * i12) + (i11 * i11) <= this.radius) {
                        return i9 & 16777215;
                    }
                }
                return i9;
            }
        }));
    }

    public static BufferedImage drawRectangle(BufferedImage bufferedImage, int i6, int i7, int i8, int i9, Color color, int i10, int i11, float[] fArr, float f6) {
        Graphics2D graphics2D;
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        Graphics2D createGraphics = bufferedImage2.createGraphics();
        Color color2 = color == null ? Color.getColor(FlexmarkHtmlConverter.DEFAULT_NODE, ~(bufferedImage.getRGB((i8 / 2) + i6, (i9 / 2) + i7) & 16777215)) : color;
        createGraphics.drawImage(bufferedImage, 0, 0, (ImageObserver) null);
        if (fArr != null) {
            float f7 = i10;
            createGraphics.setStroke(new BasicStroke(f7, 2, 0, f7, fArr, f6));
        } else {
            float f8 = i10;
            createGraphics.setStroke(new BasicStroke(f8, 2, 0, f8));
        }
        createGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        createGraphics.setColor(color2);
        if (i11 > 0) {
            graphics2D = createGraphics;
            graphics2D.drawRoundRect(i6, i7, i8, i9, i11, i11);
        } else {
            graphics2D = createGraphics;
            graphics2D.drawRect(i6, i7, i8, i9);
        }
        graphics2D.dispose();
        return bufferedImage2;
    }

    public static BufferedImage loadImageFromURL(String str, boolean z5) {
        if (str == null) {
            return null;
        }
        try {
            return toBufferedImage(ImageIO.read(new URL(str)));
        } catch (IOException e6) {
            if (!z5) {
                return null;
            }
            e6.printStackTrace();
            return null;
        }
    }

    public static BufferedImage base64Decode(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                int indexOf = str.indexOf(44);
                if (indexOf >= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.getDecoder().decode(str.substring(indexOf + 1)));
                    BufferedImage read = ImageIO.read(byteArrayInputStream);
                    byteArrayInputStream.close();
                    return read;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String base64Encode(File file) {
        if (file != null && file.isFile()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[(int) file.length()];
                if (fileInputStream.read(bArr) != -1) {
                    return "data:image/png;base64," + Base64.getEncoder().encodeToString(bArr).replace("\r", FlexmarkHtmlConverter.DEFAULT_NODE).replace(SequenceUtils.EOL, FlexmarkHtmlConverter.DEFAULT_NODE);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
