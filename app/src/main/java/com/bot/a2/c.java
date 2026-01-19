package A2;

import Y3.m;
import android.content.Context;
import com.bot.core.database.data.AppDatabase;
import java.io.File;
import t4.f;
import t4.o;

/* loaded from: classes.dex */
public final class c {
    public static void a(Context context) {
        Object next;
        File databasePath = context.getDatabasePath("bothub.db");
        if (databasePath.exists()) {
            return;
        }
        t4.e eVar = new t4.e(new f(new o(new f(m.h0(AppDatabase.f11140k), true, new a(0)), new b(context, 0), 1), true, new a(1)));
        if (eVar.hasNext()) {
            next = eVar.next();
            if (eVar.hasNext()) {
                long lastModified = ((File) next).lastModified();
                do {
                    Object next2 = eVar.next();
                    long lastModified2 = ((File) next2).lastModified();
                    if (lastModified < lastModified2) {
                        next = next2;
                        lastModified = lastModified2;
                    }
                } while (eVar.hasNext());
            }
        } else {
            next = null;
        }
        File file = (File) next;
        if (file == null) {
            return;
        }
        File parentFile = databasePath.getParentFile();
        if (parentFile != null) {
            File file2 = parentFile.exists() ? null : parentFile;
            if (file2 != null) {
                file2.mkdirs();
            }
        }
        if (file.renameTo(databasePath)) {
            File file3 = new File(B3.e.n(file.getPath(), "-wal"));
            File file4 = new File(B3.e.n(databasePath.getPath(), "-wal"));
            if (file3.exists()) {
                file3.renameTo(file4);
            }
            File file5 = new File(B3.e.n(file.getPath(), "-shm"));
            File file6 = new File(B3.e.n(databasePath.getPath(), "-shm"));
            if (file5.exists()) {
                file5.renameTo(file6);
            }
        }
    }
}
