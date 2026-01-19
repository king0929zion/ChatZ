package e2;

import B3.e;
import android.os.Parcel;
import android.util.SparseIntArray;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import k.C1159f;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0963b extends AbstractC0962a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f11583d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f11584e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11585f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11586g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11587h;

    /* renamed from: i, reason: collision with root package name */
    public int f11588i;

    /* renamed from: j, reason: collision with root package name */
    public int f11589j;

    /* renamed from: k, reason: collision with root package name */
    public int f11590k;

    public C0963b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), FlexmarkHtmlConverter.DEFAULT_NODE, new C1159f(0), new C1159f(0), new C1159f(0));
    }

    @Override // e2.AbstractC0962a
    public final C0963b a() {
        Parcel parcel = this.f11584e;
        int dataPosition = parcel.dataPosition();
        int i6 = this.f11589j;
        if (i6 == this.f11585f) {
            i6 = this.f11586g;
        }
        return new C0963b(parcel, dataPosition, i6, e.s(new StringBuilder(), this.f11587h, "  "), this.a, this.f11581b, this.f11582c);
    }

    @Override // e2.AbstractC0962a
    public final boolean e(int i6) {
        while (this.f11589j < this.f11586g) {
            int i7 = this.f11590k;
            if (i7 == i6) {
                return true;
            }
            if (String.valueOf(i7).compareTo(String.valueOf(i6)) > 0) {
                return false;
            }
            int i8 = this.f11589j;
            Parcel parcel = this.f11584e;
            parcel.setDataPosition(i8);
            int readInt = parcel.readInt();
            this.f11590k = parcel.readInt();
            this.f11589j += readInt;
        }
        return this.f11590k == i6;
    }

    @Override // e2.AbstractC0962a
    public final void h(int i6) {
        int i7 = this.f11588i;
        SparseIntArray sparseIntArray = this.f11583d;
        Parcel parcel = this.f11584e;
        if (i7 >= 0) {
            int i8 = sparseIntArray.get(i7);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i8);
            parcel.writeInt(dataPosition - i8);
            parcel.setDataPosition(dataPosition);
        }
        this.f11588i = i6;
        sparseIntArray.put(i6, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i6);
    }

    public C0963b(Parcel parcel, int i6, int i7, String str, C1159f c1159f, C1159f c1159f2, C1159f c1159f3) {
        super(c1159f, c1159f2, c1159f3);
        this.f11583d = new SparseIntArray();
        this.f11588i = -1;
        this.f11590k = -1;
        this.f11584e = parcel;
        this.f11585f = i6;
        this.f11586g = i7;
        this.f11589j = i6;
        this.f11587h = str;
    }
}
