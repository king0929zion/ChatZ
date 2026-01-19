package d5;

import java.nio.channels.WritableByteChannel;

/* renamed from: d5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0950j extends G, WritableByteChannel {
    InterfaceC0950j F(String str);

    InterfaceC0950j L(long j3);

    @Override // d5.G, java.io.Flushable
    void flush();

    InterfaceC0950j m(C0952l c0952l);

    InterfaceC0950j write(byte[] bArr);

    InterfaceC0950j writeByte(int i6);

    InterfaceC0950j writeInt(int i6);

    InterfaceC0950j writeShort(int i6);
}
