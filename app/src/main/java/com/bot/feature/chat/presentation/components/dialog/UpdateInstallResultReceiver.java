package com.bot.feature.chat.presentation.components.dialog;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public final class UpdateInstallResultReceiver extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r8 != null) goto L27;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            m4.AbstractC1276k.f(r7, r0)
            java.lang.String r0 = "intent"
            m4.AbstractC1276k.f(r8, r0)
            java.lang.String r0 = "android.content.pm.extra.STATUS"
            r1 = 1
            int r0 = r8.getIntExtra(r0, r1)
            r2 = -1
            if (r0 != r2) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L21
            java.lang.Object r8 = G2.b.p(r8)
            android.content.Intent r8 = (android.content.Intent) r8
            goto L29
        L21:
            java.lang.String r0 = "android.intent.extra.INTENT"
            android.os.Parcelable r8 = r8.getParcelableExtra(r0)
            android.content.Intent r8 = (android.content.Intent) r8
        L29:
            if (r8 == 0) goto L30
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r8.addFlags(r0)
        L30:
            if (r8 == 0) goto L59
            r7.startActivity(r8)
            return
        L36:
            if (r0 != 0) goto L5a
            java.lang.String r0 = "extra_download_id"
            r2 = -1
            long r4 = r8.getLongExtra(r0, r2)
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L59
            java.lang.String r8 = "download"
            java.lang.Object r7 = r7.getSystemService(r8)
            java.lang.String r8 = "null cannot be cast to non-null type android.app.DownloadManager"
            m4.AbstractC1276k.d(r7, r8)
            android.app.DownloadManager r7 = (android.app.DownloadManager) r7
            long[] r8 = new long[r1]
            r0 = 0
            r8[r0] = r4
            r7.remove(r8)
        L59:
            return
        L5a:
            java.lang.String r2 = "android.content.pm.extra.STATUS_MESSAGE"
            java.lang.String r8 = r8.getStringExtra(r2)
            if (r8 == 0) goto L6d
            boolean r2 = u4.AbstractC1776n.Q(r8)
            if (r2 != 0) goto L69
            goto L6a
        L69:
            r8 = 0
        L6a:
            if (r8 == 0) goto L6d
            goto L73
        L6d:
            java.lang.String r8 = "状态: "
            java.lang.String r8 = B3.e.h(r0, r8)
        L73:
            r0 = 2131427757(0x7f0b01ad, float:1.847714E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = r7.getString(r0, r8)
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r1)
            r7.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bot.feature.chat.presentation.components.dialog.UpdateInstallResultReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
