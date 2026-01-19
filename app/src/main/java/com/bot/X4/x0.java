package x4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class x0 extends CancellationException implements InterfaceC1937t {

    /* renamed from: c, reason: collision with root package name */
    public final transient InterfaceC1922e0 f15737c;

    public x0(String str, InterfaceC1922e0 interfaceC1922e0) {
        super(str);
        this.f15737c = interfaceC1922e0;
    }

    @Override // x4.InterfaceC1937t
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        x0 x0Var = new x0(message, this.f15737c);
        x0Var.initCause(this);
        return x0Var;
    }
}
