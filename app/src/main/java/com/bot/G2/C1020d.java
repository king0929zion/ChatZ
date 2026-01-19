package g2;

import Y4.l;
import android.os.Build;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h2.C1053c;
import h2.C1056f;
import h2.InterfaceC1055e;

/* renamed from: g2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020d implements InterfaceC1019c {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1055e f11775b;

    public C1020d() {
        this.f11775b = Build.VERSION.SDK_INT >= 34 ? C1056f.f11918b : C1053c.f11913f;
        l.m(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(PegdownExtensions.FENCED_CODE_BLOCKS));
    }
}
