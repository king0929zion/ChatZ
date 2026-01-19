package r2;

import I0.V;
import Q4.n;
import Q4.v;
import android.graphics.Bitmap;
import com.vladsch.flexmark.util.format.TableCell;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import m4.AbstractC1276k;
import u4.u;
import w2.AbstractC1835e;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630c {
    public final v a;

    /* renamed from: b, reason: collision with root package name */
    public final C1629b f14660b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f14661c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14662d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f14663e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14664f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f14665g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14666h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14667i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14668j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14669k;

    public C1630c(v vVar, C1629b c1629b) {
        int i6;
        int i7;
        Date date;
        Date date2;
        Date date3;
        DateFormat dateFormat;
        this.a = vVar;
        this.f14660b = c1629b;
        this.f14669k = -1;
        if (c1629b != null) {
            this.f14666h = c1629b.f14656c;
            this.f14667i = c1629b.f14657d;
            n nVar = c1629b.f14659f;
            int size = nVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size) {
                String b5 = nVar.b(i9);
                if (u.x(b5, "Date", true)) {
                    String a = nVar.a("Date");
                    if (a != null) {
                        V v5 = V4.c.a;
                        if (a.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(i8);
                            Date parse = ((DateFormat) V4.c.a.get()).parse(a, parsePosition);
                            if (parsePosition.getIndex() == a.length()) {
                                date3 = parse;
                            } else {
                                String[] strArr = V4.c.f8808b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i10 = i8;
                                        while (i10 < length) {
                                            DateFormat[] dateFormatArr = V4.c.f8809c;
                                            DateFormat dateFormat2 = dateFormatArr[i10];
                                            if (dateFormat2 == null) {
                                                dateFormat = new SimpleDateFormat(V4.c.f8808b[i10], Locale.US);
                                                dateFormat.setTimeZone(R4.b.f7081d);
                                                dateFormatArr[i10] = dateFormat;
                                                i8 = 0;
                                            } else {
                                                dateFormat = dateFormat2;
                                            }
                                            parsePosition.setIndex(i8);
                                            Date parse2 = dateFormat.parse(a, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date3 = parse2;
                                                break;
                                            } else {
                                                i10++;
                                                i8 = 0;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            this.f14661c = date3;
                            this.f14662d = nVar.d(i9);
                        }
                    }
                    date3 = null;
                    this.f14661c = date3;
                    this.f14662d = nVar.d(i9);
                } else if (u.x(b5, "Expires", true)) {
                    String a6 = nVar.a("Expires");
                    if (a6 != null) {
                        V v6 = V4.c.a;
                        if (a6.length() != 0) {
                            ParsePosition parsePosition2 = new ParsePosition(0);
                            Date parse3 = ((DateFormat) V4.c.a.get()).parse(a6, parsePosition2);
                            if (parsePosition2.getIndex() == a6.length()) {
                                date2 = parse3;
                            } else {
                                String[] strArr2 = V4.c.f8808b;
                                synchronized (strArr2) {
                                    try {
                                        int length2 = strArr2.length;
                                        for (int i11 = 0; i11 < length2; i11++) {
                                            DateFormat[] dateFormatArr2 = V4.c.f8809c;
                                            DateFormat dateFormat3 = dateFormatArr2[i11];
                                            if (dateFormat3 == null) {
                                                dateFormat3 = new SimpleDateFormat(V4.c.f8808b[i11], Locale.US);
                                                dateFormat3.setTimeZone(R4.b.f7081d);
                                                dateFormatArr2[i11] = dateFormat3;
                                            }
                                            parsePosition2.setIndex(0);
                                            date2 = dateFormat3.parse(a6, parsePosition2);
                                            if (parsePosition2.getIndex() != 0) {
                                                break;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            this.f14665g = date2;
                        }
                    }
                    date2 = null;
                    this.f14665g = date2;
                } else {
                    if (u.x(b5, "Last-Modified", true)) {
                        String a7 = nVar.a("Last-Modified");
                        if (a7 != null) {
                            V v7 = V4.c.a;
                            if (a7.length() != 0) {
                                ParsePosition parsePosition3 = new ParsePosition(0);
                                Date parse4 = ((DateFormat) V4.c.a.get()).parse(a7, parsePosition3);
                                if (parsePosition3.getIndex() == a7.length()) {
                                    date = parse4;
                                    i6 = 0;
                                } else {
                                    String[] strArr3 = V4.c.f8808b;
                                    synchronized (strArr3) {
                                        try {
                                            int length3 = strArr3.length;
                                            for (int i12 = 0; i12 < length3; i12++) {
                                                DateFormat[] dateFormatArr3 = V4.c.f8809c;
                                                DateFormat dateFormat4 = dateFormatArr3[i12];
                                                if (dateFormat4 == null) {
                                                    dateFormat4 = new SimpleDateFormat(V4.c.f8808b[i12], Locale.US);
                                                    dateFormat4.setTimeZone(R4.b.f7081d);
                                                    dateFormatArr3[i12] = dateFormat4;
                                                }
                                                i6 = 0;
                                                parsePosition3.setIndex(0);
                                                date = dateFormat4.parse(a7, parsePosition3);
                                                if (parsePosition3.getIndex() != 0) {
                                                    break;
                                                }
                                            }
                                            i6 = 0;
                                            date = null;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                this.f14663e = date;
                                this.f14664f = nVar.d(i9);
                            }
                        }
                        i6 = 0;
                        date = null;
                        this.f14663e = date;
                        this.f14664f = nVar.d(i9);
                    } else {
                        i6 = 0;
                        if (u.x(b5, "ETag", true)) {
                            this.f14668j = nVar.d(i9);
                        } else if (u.x(b5, "Age", true)) {
                            String d6 = nVar.d(i9);
                            Bitmap.Config[] configArr = AbstractC1835e.a;
                            AbstractC1276k.f(d6, "<this>");
                            Long F5 = u.F(10, d6);
                            if (F5 != null) {
                                long longValue = F5.longValue();
                                i7 = longValue > 2147483647L ? TableCell.NOT_TRACKED : longValue < 0 ? 0 : (int) longValue;
                            } else {
                                i7 = -1;
                            }
                            this.f14669k = i7;
                        }
                    }
                    i9++;
                    i8 = i6;
                }
                i6 = 0;
                i9++;
                i8 = i6;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r9 > 0) goto L55;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X3.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r2.C1631d a() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.C1630c.a():r2.d");
    }
}
