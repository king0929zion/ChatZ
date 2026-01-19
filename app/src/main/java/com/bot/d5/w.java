package d5;

import androidx.lifecycle.N;
import com.vladsch.flexmark.util.html.Attribute;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w extends v {
    public static Long m(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // d5.v, d5.o
    public final void b(y yVar, y yVar2) {
        AbstractC1276k.f(yVar, "source");
        AbstractC1276k.f(yVar2, Attribute.TARGET_ATTR);
        try {
            Files.move(yVar.e(), yVar2.e(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e6) {
            throw new FileNotFoundException(e6.getMessage());
        }
    }

    @Override // d5.v, d5.o
    public final n i(y yVar) {
        y yVar2;
        AbstractC1276k.f(yVar, "path");
        Path e6 = yVar.e();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(e6, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(e6) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = y.f11513e;
                yVar2 = N.r(readSymbolicLink.toString());
            } else {
                yVar2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long m3 = creationTime != null ? m(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long m5 = lastModifiedTime != null ? m(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new n(isRegularFile, isDirectory, yVar2, valueOf, m3, m5, lastAccessTime != null ? m(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // d5.v
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
