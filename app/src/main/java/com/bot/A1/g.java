package A1;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f72A;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f73B;

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f74C;

    /* renamed from: D, reason: collision with root package name */
    public static final d f75D;

    /* renamed from: E, reason: collision with root package name */
    public static final d[][] f76E;

    /* renamed from: F, reason: collision with root package name */
    public static final d[] f77F;

    /* renamed from: G, reason: collision with root package name */
    public static final HashMap[] f78G;

    /* renamed from: H, reason: collision with root package name */
    public static final HashMap[] f79H;

    /* renamed from: I, reason: collision with root package name */
    public static final HashSet f80I;

    /* renamed from: J, reason: collision with root package name */
    public static final HashMap f81J;

    /* renamed from: K, reason: collision with root package name */
    public static final Charset f82K;

    /* renamed from: L, reason: collision with root package name */
    public static final byte[] f83L;

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f84M;

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f85k = Log.isLoggable("ExifInterface", 3);

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f86l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f87m;

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f88n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f89o;

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f90p;

    /* renamed from: q, reason: collision with root package name */
    public static final byte[] f91q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f92r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f93s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f94t;

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f95u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f96v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f97w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f98x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f99y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f100z;
    public final FileDescriptor a;

    /* renamed from: b, reason: collision with root package name */
    public int f101b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap[] f102c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f103d;

    /* renamed from: e, reason: collision with root package name */
    public ByteOrder f104e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f105f;

    /* renamed from: g, reason: collision with root package name */
    public int f106g;

    /* renamed from: h, reason: collision with root package name */
    public int f107h;

    /* renamed from: i, reason: collision with root package name */
    public int f108i;

    /* renamed from: j, reason: collision with root package name */
    public int f109j;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f86l = new int[]{8, 8, 8};
        f87m = new int[]{8};
        f88n = new byte[]{-1, -40, -1};
        f89o = new byte[]{102, 116, 121, 112};
        f90p = new byte[]{109, 105, 102, 49};
        f91q = new byte[]{104, 101, 105, 99};
        f92r = new byte[]{79, 76, 89, 77, 80, 0};
        f93s = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f94t = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f95u = new byte[]{101, 88, 73, 102};
        f96v = new byte[]{73, 72, 68, 82};
        f97w = new byte[]{73, 69, 78, 68};
        f98x = new byte[]{82, 73, 70, 70};
        f99y = new byte[]{87, 69, 66, 80};
        f100z = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f72A = new String[]{FlexmarkHtmlConverter.DEFAULT_NODE, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f73B = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f74C = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(PegdownExtensions.WIKILINKS, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, 10, "GPSLatitude"), new d("GPSLongitudeRef", 3, 2), new d(4, 5, 10, "GPSLongitude"), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(PegdownExtensions.WIKILINKS, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, 4, "StripOffsets"), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, 4, "DefaultCropSize")};
        f75D = new d("StripOffsets", 273, 3);
        f76E = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", PegdownExtensions.WIKILINKS, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f77F = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f78G = new HashMap[10];
        f79H = new HashMap[10];
        f80I = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f81J = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f82K = forName;
        f83L = "Exif\u0000\u0000".getBytes(forName);
        f84M = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            d[][] dVarArr6 = f76E;
            if (i6 >= dVarArr6.length) {
                HashMap hashMap = f81J;
                d[] dVarArr7 = f77F;
                hashMap.put(Integer.valueOf(dVarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(dVarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(dVarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(dVarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(dVarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(dVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f78G[i6] = new HashMap();
            f79H[i6] = new HashMap();
            for (d dVar : dVarArr6[i6]) {
                f78G[i6].put(Integer.valueOf(dVar.a), dVar);
                f79H[i6].put(dVar.f68b, dVar);
            }
            i6++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002e, blocks: (B:3:0x001f, B:5:0x0022, B:7:0x0037, B:13:0x0054, B:15:0x005f, B:16:0x0075, B:25:0x0066, B:28:0x006e, B:29:0x0072, B:30:0x007f, B:32:0x0088, B:34:0x008e, B:36:0x0094, B:38:0x009a, B:48:0x00a8), top: B:2:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(k2.i r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            r8.<init>()
            A1.d[][] r1 = A1.g.f76E
            int r2 = r1.length
            java.util.HashMap[] r2 = new java.util.HashMap[r2]
            r8.f102c = r2
            java.util.HashSet r2 = new java.util.HashSet
            int r3 = r1.length
            r2.<init>(r3)
            r8.f103d = r2
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f104e = r2
            r2 = 0
            r8.a = r2
            boolean r2 = A1.g.f85k
            r3 = 0
            r4 = r3
        L1f:
            int r5 = r1.length     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            if (r4 >= r5) goto L37
            java.util.HashMap[] r5 = r8.f102c     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r6.<init>()     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r5[r4] = r6     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r4 = r4 + 1
            goto L1f
        L2e:
            r9 = move-exception
            goto Lae
        L31:
            r9 = move-exception
            goto La6
        L34:
            r9 = move-exception
            goto La6
        L37:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r4 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r9, r4)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r9 = r8.f(r1)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r8.f101b = r9     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L7f
            if (r9 == r6) goto L7f
            if (r9 == r5) goto L7f
            if (r9 != r4) goto L54
            goto L7f
        L54:
            A1.f r9 = new A1.f     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r1 = r8.f101b     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r3 = 12
            if (r1 != r3) goto L63
            r8.d(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L75
        L63:
            r3 = 7
            if (r1 != r3) goto L6a
            r8.g(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L75
        L6a:
            r3 = 10
            if (r1 != r3) goto L72
            r8.k(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L75
        L72:
            r8.j(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
        L75:
            int r1 = r8.f106g     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r9.d(r3)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r8.u(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L9d
        L7f:
            A1.b r9 = new A1.b     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            int r1 = r8.f101b     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            if (r1 != r7) goto L8c
            r8.e(r9, r3, r3)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L9d
        L8c:
            if (r1 != r5) goto L92
            r8.h(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L9d
        L92:
            if (r1 != r6) goto L98
            r8.i(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
            goto L9d
        L98:
            if (r1 != r4) goto L9d
            r8.l(r9)     // Catch: java.lang.Throwable -> L2e java.lang.UnsupportedOperationException -> L31 java.io.IOException -> L34
        L9d:
            r8.a()
            if (r2 == 0) goto Lbd
        La2:
            r8.p()
            goto Lbd
        La6:
            if (r2 == 0) goto Lb7
            java.lang.String r1 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r0, r1, r9)     // Catch: java.lang.Throwable -> L2e
            goto Lb7
        Lae:
            r8.a()
            if (r2 == 0) goto Lb6
            r8.p()
        Lb6:
            throw r9
        Lb7:
            r8.a()
            if (r2 == 0) goto Lbd
            goto La2
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.g.<init>(k2.i):void");
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void a() {
        String b5 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f102c;
        if (b5 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b5.concat("\u0000").getBytes(f82K);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f104e));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f104e));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f104e));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f104e));
        }
    }

    public final String b(String str) {
        c c6 = c(str);
        if (c6 != null) {
            int i6 = c6.a;
            if (!f80I.contains(str)) {
                return c6.f(this.f104e);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i6 != 5 && i6 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i6);
                    return null;
                }
                e[] eVarArr = (e[]) c6.g(this.f104e);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer valueOf = Integer.valueOf((int) (((float) eVar.a) / ((float) eVar.f71b)));
                e eVar2 = eVarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.a) / ((float) eVar2.f71b)));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.a) / ((float) eVar3.f71b))));
            }
            try {
                return Double.toString(c6.d(this.f104e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < f76E.length; i6++) {
            c cVar = (c) this.f102c[i6].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f102c;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f104e));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.f104e));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", c.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f104e));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.d(parseInt2);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i6 = parseInt2 + 6;
                    int i7 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f83L)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    fVar.readFully(bArr2);
                    this.f106g = i6;
                    r(bArr2, 0);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0154, code lost:
    
        r23.f62f = r22.f104e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0158, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0063. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0141 A[LOOP:0: B:9:0x0024->B:32:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(A1.b r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.g.e(A1.b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00b2, code lost:
    
        if (r6 == null) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) {
        int i6;
        int i7;
        j(fVar);
        HashMap[] hashMapArr = this.f102c;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f67d);
            fVar2.f62f = this.f104e;
            byte[] bArr = f92r;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.d(0L);
            byte[] bArr3 = f93s;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.d(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f104e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i8 = iArr[2];
                int i9 = iArr[0];
                if (i8 <= i9 || (i6 = iArr[3]) <= (i7 = iArr[1])) {
                    return;
                }
                int i10 = (i8 - i9) + 1;
                int i11 = (i6 - i7) + 1;
                if (i10 < i11) {
                    int i12 = i10 + i11;
                    i11 = i12 - i11;
                    i10 = i12 - i11;
                }
                c c6 = c.c(i10, this.f104e);
                c c7 = c.c(i11, this.f104e);
                hashMapArr[0].put("ImageWidth", c6);
                hashMapArr[0].put("ImageLength", c7);
            }
        }
    }

    public final void h(b bVar) {
        if (f85k) {
            Objects.toString(bVar);
        }
        bVar.f62f = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f94t;
        bVar.c(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i6 = length + 8;
                if (i6 == 16 && !Arrays.equals(bArr2, f96v)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f97w)) {
                    return;
                }
                if (Arrays.equals(bArr2, f95u)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f106g = i6;
                        r(bArr3, 0);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i7 = readInt + 4;
                bVar.c(i7);
                length = i6 + i7;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        if (f85k) {
            Objects.toString(bVar);
        }
        bVar.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i7 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i7];
        bVar.c(i6 - bVar.f61e);
        bVar.readFully(bArr4);
        e(new b(bArr4), i6, 5);
        bVar.c(i8 - bVar.f61e);
        bVar.f62f = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i9 = 0; i9 < readInt; i9++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f75D.a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c6 = c.c(readShort, this.f104e);
                c c7 = c.c(readShort2, this.f104e);
                HashMap[] hashMapArr = this.f102c;
                hashMapArr[0].put("ImageLength", c6);
                hashMapArr[0].put("ImageWidth", c7);
                return;
            }
            bVar.c(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f101b == 8) {
            HashMap[] hashMapArr = this.f102c;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f67d);
                fVar2.f62f = this.f104e;
                fVar2.c(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f85k) {
            Objects.toString(fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f102c;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f67d), (int) cVar.f66c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) {
        if (f85k) {
            Objects.toString(bVar);
        }
        bVar.f62f = ByteOrder.LITTLE_ENDIAN;
        bVar.c(f98x.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f99y;
        bVar.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i6 = length + 8;
                if (Arrays.equals(f100z, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f106g = i6;
                    r(bArr3, 0);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i6 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.c(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int e6 = cVar.e(this.f104e);
        int e7 = cVar2.e(this.f104e);
        if (this.f101b == 7) {
            e6 += this.f107h;
        }
        if (e6 <= 0 || e7 <= 0 || this.a != null) {
            return;
        }
        bVar.c(e6);
        bVar.readFully(new byte[e7]);
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f104e) <= 512 && cVar2.e(this.f104e) <= 512;
    }

    public final void o(f fVar) {
        ByteOrder q3 = q(fVar);
        this.f104e = q3;
        fVar.f62f = q3;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i6 = this.f101b;
        if (i6 != 7 && i6 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt < 8) {
            throw new IOException(B3.e.h(readInt, "Invalid first Ifd offset: "));
        }
        int i7 = readInt - 8;
        if (i7 > 0) {
            fVar.c(i7);
        }
    }

    public final void p() {
        int i6 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f102c;
            if (i6 >= hashMapArr.length) {
                return;
            }
            hashMapArr[i6].size();
            for (Map.Entry entry : hashMapArr[i6].entrySet()) {
                c cVar = (c) entry.getValue();
                cVar.toString();
                cVar.f(this.f104e);
            }
            i6++;
        }
    }

    public final void r(byte[] bArr, int i6) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(A1.f r27, int r28) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.g.s(A1.f, int):void");
    }

    public final void t(String str, int i6, String str2) {
        HashMap[] hashMapArr = this.f102c;
        if (hashMapArr[i6].isEmpty() || hashMapArr[i6].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i6];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i6].remove(str);
    }

    public final void u(b bVar) {
        c cVar;
        HashMap hashMap = this.f102c[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 == null) {
            m(bVar, hashMap);
            return;
        }
        int e6 = cVar2.e(this.f104e);
        if (e6 != 1) {
            if (e6 == 6) {
                m(bVar, hashMap);
                return;
            } else if (e6 != 7) {
                return;
            }
        }
        c cVar3 = (c) hashMap.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f104e);
            int[] iArr2 = f86l;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f101b != 3 || (cVar = (c) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int e7 = cVar.e(this.f104e);
                if ((e7 != 1 || !Arrays.equals(iArr, f87m)) && (e7 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            c cVar4 = (c) hashMap.get("StripOffsets");
            c cVar5 = (c) hashMap.get("StripByteCounts");
            if (cVar4 == null || cVar5 == null) {
                return;
            }
            long[] v5 = Y4.d.v(cVar4.g(this.f104e));
            long[] v6 = Y4.d.v(cVar5.g(this.f104e));
            if (v5 == null || v5.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (v6 == null || v6.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (v5.length != v6.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j3 = 0;
            for (long j4 : v6) {
                j3 += j4;
            }
            byte[] bArr = new byte[(int) j3];
            this.f105f = true;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < v5.length; i8++) {
                int i9 = (int) v5[i8];
                int i10 = (int) v6[i8];
                if (i8 < v5.length - 1 && i9 + i10 != v5[i8 + 1]) {
                    this.f105f = false;
                }
                int i11 = i9 - i6;
                if (i11 >= 0) {
                    try {
                        bVar.c(i11);
                        int i12 = i6 + i11;
                        byte[] bArr2 = new byte[i10];
                        bVar.readFully(bArr2);
                        i6 = i12 + i10;
                        System.arraycopy(bArr2, 0, bArr, i7, i10);
                        i7 += i10;
                    } catch (EOFException unused) {
                        return;
                    }
                }
                return;
            }
            if (this.f105f) {
                long j5 = v5[0];
            }
        }
    }

    public final void v(int i6, int i7) {
        HashMap[] hashMapArr = this.f102c;
        if (hashMapArr[i6].isEmpty() || hashMapArr[i7].isEmpty()) {
            return;
        }
        c cVar = (c) hashMapArr[i6].get("ImageLength");
        c cVar2 = (c) hashMapArr[i6].get("ImageWidth");
        c cVar3 = (c) hashMapArr[i7].get("ImageLength");
        c cVar4 = (c) hashMapArr[i7].get("ImageWidth");
        if (cVar == null || cVar2 == null || cVar3 == null || cVar4 == null) {
            return;
        }
        int e6 = cVar.e(this.f104e);
        int e7 = cVar2.e(this.f104e);
        int e8 = cVar3.e(this.f104e);
        int e9 = cVar4.e(this.f104e);
        if (e6 >= e8 || e7 >= e9) {
            return;
        }
        HashMap hashMap = hashMapArr[i6];
        hashMapArr[i6] = hashMapArr[i7];
        hashMapArr[i7] = hashMap;
    }

    public final void w(f fVar, int i6) {
        c c6;
        c c7;
        HashMap[] hashMapArr = this.f102c;
        c cVar = (c) hashMapArr[i6].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i6].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i6].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i6].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i6].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f104e);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                c6 = c.b(eVarArr[0], this.f104e);
                c7 = c.b(eVarArr[1], this.f104e);
            } else {
                int[] iArr = (int[]) cVar.g(this.f104e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c6 = c.c(iArr[0], this.f104e);
                c7 = c.c(iArr[1], this.f104e);
            }
            hashMapArr[i6].put("ImageWidth", c6);
            hashMapArr[i6].put("ImageLength", c7);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e6 = cVar2.e(this.f104e);
            int e7 = cVar4.e(this.f104e);
            int e8 = cVar5.e(this.f104e);
            int e9 = cVar3.e(this.f104e);
            if (e7 <= e6 || e8 <= e9) {
                return;
            }
            c c8 = c.c(e7 - e6, this.f104e);
            c c9 = c.c(e8 - e9, this.f104e);
            hashMapArr[i6].put("ImageLength", c8);
            hashMapArr[i6].put("ImageWidth", c9);
            return;
        }
        c cVar6 = (c) hashMapArr[i6].get("ImageLength");
        c cVar7 = (c) hashMapArr[i6].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i6].get("JPEGInterchangeFormat");
            c cVar9 = (c) hashMapArr[i6].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int e10 = cVar8.e(this.f104e);
            int e11 = cVar8.e(this.f104e);
            fVar.d(e10);
            byte[] bArr = new byte[e11];
            fVar.readFully(bArr);
            e(new b(bArr), e10, i6);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.f102c;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        n(hashMapArr[4]);
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
