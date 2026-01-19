package m2;

import android.webkit.MimeTypeMap;
import androidx.lifecycle.N;
import b4.InterfaceC0905c;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import d5.o;
import d5.y;
import java.io.File;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* renamed from: m2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259h implements InterfaceC1258g {
    public final File a;

    public C1259h(File file) {
        this.a = file;
    }

    @Override // m2.InterfaceC1258g
    public final Object a(InterfaceC0905c interfaceC0905c) {
        String str = y.f11513e;
        File file = this.a;
        k2.m mVar = new k2.m(N.s(file), o.a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        AbstractC1276k.e(name, "getName(...)");
        return new C1264m(mVar, singleton.getMimeTypeFromExtension(AbstractC1776n.g0('.', name, FlexmarkHtmlConverter.DEFAULT_NODE)), k2.f.f12612f);
    }
}
