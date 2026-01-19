package a2;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f10578e = new HashMap();
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final File f10579b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f10580c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f10581d;

    public C0802a(String str, File file, boolean z5) {
        Lock lock;
        this.a = z5;
        this.f10579b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = f10578e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10580c = lock;
    }

    public final void a(boolean z5) {
        this.f10580c.lock();
        if (z5) {
            File file = this.f10579b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f10581d = channel;
            } catch (IOException e6) {
                this.f10581d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e6);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f10581d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f10580c.unlock();
    }
}
