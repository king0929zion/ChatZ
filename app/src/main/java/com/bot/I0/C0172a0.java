package I0;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: I0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172a0 {
    public final Context a;

    public C0172a0(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e6) {
            throw new IllegalArgumentException(B3.e.g('.', "Can't open ", str), e6);
        }
    }
}
