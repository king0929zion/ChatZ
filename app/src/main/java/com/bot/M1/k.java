package M1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3262b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3263c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3264d;

    public k(int i6, int i7, long j3, long j4) {
        this.a = i6;
        this.f3262b = i7;
        this.f3263c = j3;
        this.f3264d = j4;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.a);
            dataOutputStream.writeInt(this.f3262b);
            dataOutputStream.writeLong(this.f3263c);
            dataOutputStream.writeLong(this.f3264d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f3262b == kVar.f3262b && this.f3263c == kVar.f3263c && this.a == kVar.a && this.f3264d == kVar.f3264d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3262b), Long.valueOf(this.f3263c), Integer.valueOf(this.a), Long.valueOf(this.f3264d));
    }
}
