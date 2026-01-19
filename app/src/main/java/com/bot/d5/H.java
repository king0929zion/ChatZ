package d5;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class H extends C0946f {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f11457m;

    public H(Socket socket) {
        this.f11457m = socket;
    }

    @Override // d5.C0946f
    public final void j() {
        Socket socket = this.f11457m;
        try {
            socket.close();
        } catch (AssertionError e6) {
            if (!AbstractC0942b.f(e6)) {
                throw e6;
            }
            x.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        } catch (Exception e7) {
            x.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
