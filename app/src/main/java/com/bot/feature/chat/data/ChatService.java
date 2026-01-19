package com.bot.feature.chat.data;

import C4.c;
import C4.o;
import E4.e;
import I2.n;
import Y4.d;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.N;
import com.bot.MainActivity;
import com.tencent.mmkv.R;
import i5.a;
import l1.C1184a;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.t0;

/* loaded from: classes.dex */
public final class ChatService extends Service {
    public static final n Companion = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final c f11262c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11263e;

    public ChatService() {
        t0 e6 = AbstractC1888A.e();
        e eVar = AbstractC1898K.a;
        this.f11262c = AbstractC1888A.c(d.P(e6, o.a));
    }

    public final void a() {
        if (this.f11263e) {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.setFlags(603979776);
            C1184a c1184a = new C1184a(this, "chat_reply_channel");
            c1184a.f12667e = C1184a.b(getString(R.string.chat_reply_notification_title));
            c1184a.f12668f = C1184a.b(getString(R.string.chat_reply_notification_text));
            c1184a.f12674l.icon = R.drawable.ic_sms;
            c1184a.f12669g = PendingIntent.getActivity(this, 0, intent, 201326592);
            c1184a.f12674l.flags |= 16;
            Notification a = c1184a.a();
            AbstractC1276k.e(a, "build(...)");
            Object systemService = getSystemService("notification");
            AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(2, a);
            a.a.getClass();
            N.k(new Object[0]);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        NotificationChannel notificationChannel = new NotificationChannel("chat_service_channel", getString(R.string.chat_service_channel_name), 2);
        notificationChannel.setDescription(getString(R.string.chat_service_channel_description));
        notificationChannel.setShowBadge(false);
        Object systemService = getSystemService("notification");
        AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        NotificationChannel notificationChannel2 = new NotificationChannel("chat_reply_channel", getString(R.string.chat_reply_channel_name), 3);
        notificationChannel2.setDescription(getString(R.string.chat_reply_channel_description));
        notificationChannel2.setShowBadge(true);
        Object systemService2 = getSystemService("notification");
        AbstractC1276k.d(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService2).createNotificationChannel(notificationChannel2);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        AbstractC1888A.j(this.f11262c, null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i7) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1198668675) {
                if (hashCode == 1164413677 && action.equals("SHOW_NOTIFICATION")) {
                    a();
                    return 1;
                }
            } else if (action.equals("SET_BACKGROUND_STATE")) {
                this.f11263e = intent.getBooleanExtra("app_in_background", false);
                a.a.getClass();
                N.k(new Object[0]);
                return 1;
            }
        }
        C1184a c1184a = new C1184a(this, "chat_service_channel");
        c1184a.f12667e = C1184a.b(getString(R.string.chat_service_notification_title));
        c1184a.f12668f = C1184a.b(getString(R.string.chat_service_notification_text));
        c1184a.f12674l.icon = R.drawable.ic_sms;
        c1184a.f12669g = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 201326592);
        c1184a.f12674l.flags |= 2;
        Notification a = c1184a.a();
        AbstractC1276k.e(a, "build(...)");
        startForeground(1, a);
        if (intent != null) {
            if (intent.hasExtra("app_in_background")) {
                this.f11263e = intent.getBooleanExtra("app_in_background", false);
            }
            if (intent.hasExtra("show_notification")) {
                a();
            }
        }
        return 1;
    }
}
