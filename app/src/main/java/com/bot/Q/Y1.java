package Q;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import i4.AbstractC1121e;
import java.util.ArrayList;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class Y1 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5609c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f5611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5613h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5614i;

    public /* synthetic */ Y1(boolean z5, Context context, c.l lVar, c.l lVar2, InterfaceC1193a interfaceC1193a) {
        this.f5610e = z5;
        this.f5612g = context;
        this.f5613h = lVar;
        this.f5614i = lVar2;
        this.f5611f = interfaceC1193a;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f5609c) {
            case 0:
                return new C0405d2(this.f5610e, this.f5611f, (InterfaceC1193a) this.f5612g, (EnumC0409e2) this.f5613h, (l4.c) this.f5614i);
            default:
                Context context = (Context) this.f5612g;
                c.l lVar = (c.l) this.f5613h;
                c.l lVar2 = (c.l) this.f5614i;
                if (this.f5610e) {
                    AbstractC1276k.f(context, "context");
                    AbstractC1276k.f(lVar, "storagePermissionLauncher");
                    AbstractC1276k.f(lVar2, "installPermissionLauncher");
                    InterfaceC1193a interfaceC1193a = this.f5611f;
                    AbstractC1276k.f(interfaceC1193a, "onPermissionsGranted");
                    ArrayList arrayList = new ArrayList();
                    if (Build.VERSION.SDK_INT <= 28 && AbstractC1121e.g(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    }
                    if (!context.getPackageManager().canRequestPackageInstalls()) {
                        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                        intent.setData(Uri.parse("package:" + context.getPackageName()));
                        lVar2.n0(intent);
                    } else if (arrayList.isEmpty()) {
                        interfaceC1193a.b();
                    } else {
                        lVar.n0(arrayList.toArray(new String[0]));
                    }
                }
                return X3.y.a;
        }
    }

    public /* synthetic */ Y1(boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, EnumC0409e2 enumC0409e2, l4.c cVar) {
        this.f5610e = z5;
        this.f5611f = interfaceC1193a;
        this.f5612g = interfaceC1193a2;
        this.f5613h = enumC0409e2;
        this.f5614i = cVar;
    }
}
