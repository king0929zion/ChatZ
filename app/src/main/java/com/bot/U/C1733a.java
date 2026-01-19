package u;

import android.os.Parcel;
import e1.o;
import e1.p;
import o0.s;
import s4.j;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1733a {
    public Parcel a;

    public long a() {
        int i6 = s.f13482i;
        long readLong = this.a.readLong();
        long j3 = 63 & readLong;
        return j3 < 16 ? readLong : (readLong & (-64)) | (j3 + 1);
    }

    public long b() {
        Parcel parcel = this.a;
        byte readByte = parcel.readByte();
        long j3 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return p.a(j3, 0L) ? o.f11580c : j.B(parcel.readFloat(), j3);
    }

    public void c(byte b5) {
        this.a.writeByte(b5);
    }

    public void d(float f6) {
        this.a.writeFloat(f6);
    }

    public void e(long j3) {
        long b5 = o.b(j3);
        byte b6 = 0;
        if (!p.a(b5, 0L)) {
            if (p.a(b5, 4294967296L)) {
                b6 = 1;
            } else if (p.a(b5, 8589934592L)) {
                b6 = 2;
            }
        }
        c(b6);
        if (p.a(o.b(j3), 0L)) {
            return;
        }
        d(o.c(j3));
    }
}
