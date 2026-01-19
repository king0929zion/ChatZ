package d5;

import com.vladsch.flexmark.util.html.Attribute;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public class v extends o {
    @Override // d5.o
    public final G a(y yVar) {
        AbstractC1276k.f(yVar, "file");
        File file = yVar.toFile();
        Logger logger = x.a;
        return new C0944d(1, new FileOutputStream(file, true), new Object());
    }

    @Override // d5.o
    public void b(y yVar, y yVar2) {
        AbstractC1276k.f(yVar, "source");
        AbstractC1276k.f(yVar2, Attribute.TARGET_ATTR);
        if (yVar.toFile().renameTo(yVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + yVar + " to " + yVar2);
    }

    @Override // d5.o
    public final void c(y yVar) {
        if (yVar.toFile().mkdir()) {
            return;
        }
        n i6 = i(yVar);
        if (i6 == null || !i6.f11490b) {
            throw new IOException("failed to create directory: " + yVar);
        }
    }

    @Override // d5.o
    public final void d(y yVar) {
        AbstractC1276k.f(yVar, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = yVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + yVar);
    }

    @Override // d5.o
    public final List g(y yVar) {
        File file = yVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + yVar);
            }
            throw new FileNotFoundException("no such file: " + yVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC1276k.c(str);
            arrayList.add(yVar.d(str));
        }
        Y3.q.a0(arrayList);
        return arrayList;
    }

    @Override // d5.o
    public n i(y yVar) {
        AbstractC1276k.f(yVar, "path");
        File file = yVar.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new n(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // d5.o
    public final u j(y yVar) {
        return new u(new RandomAccessFile(yVar.toFile(), "r"));
    }

    @Override // d5.o
    public final G k(y yVar) {
        AbstractC1276k.f(yVar, "file");
        File file = yVar.toFile();
        Logger logger = x.a;
        return new C0944d(1, new FileOutputStream(file, false), new Object());
    }

    @Override // d5.o
    public final I l(y yVar) {
        AbstractC1276k.f(yVar, "file");
        File file = yVar.toFile();
        Logger logger = x.a;
        return new C0945e(new FileInputStream(file), K.f11458d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
