package l1;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bot.feature.chat.data.ChatService;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.ArrayList;
import java.util.Iterator;
import k.C1160g;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1184a {
    public final ChatService a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f12667e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f12668f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f12669g;

    /* renamed from: i, reason: collision with root package name */
    public Bundle f12671i;

    /* renamed from: j, reason: collision with root package name */
    public final String f12672j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12673k;

    /* renamed from: l, reason: collision with root package name */
    public final Notification f12674l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f12675m;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12664b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12665c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f12666d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12670h = true;

    public C1184a(ChatService chatService, String str) {
        Notification notification = new Notification();
        this.f12674l = notification;
        this.a = chatService;
        this.f12672j = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f12675m = new ArrayList();
        this.f12673k = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        ArrayList arrayList;
        new ArrayList();
        Bundle bundle = new Bundle();
        int i6 = Build.VERSION.SDK_INT;
        ChatService chatService = this.a;
        String str = this.f12672j;
        Notification.Builder builder = new Notification.Builder(chatService, str);
        Notification notification = this.f12674l;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f12667e).setContentText(this.f12668f).setContentInfo(null).setContentIntent(this.f12669g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & PegdownExtensions.FENCED_CODE_BLOCKS) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(0);
        Iterator it = this.f12664b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Bundle bundle2 = this.f12671i;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        builder.setShowWhen(this.f12670h);
        builder.setLocalOnly(false);
        builder.setGroup(null);
        builder.setSortKey(null);
        builder.setGroupSummary(false);
        builder.setCategory(null);
        builder.setColor(0);
        builder.setVisibility(0);
        builder.setPublicVersion(null);
        builder.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f12675m;
        ArrayList arrayList3 = this.f12665c;
        if (i6 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C1160g c1160g = new C1160g(arrayList2.size() + arrayList.size());
                    c1160g.addAll(arrayList);
                    c1160g.addAll(arrayList2);
                    arrayList2 = new ArrayList(c1160g);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                builder.addPerson((String) obj);
            }
        }
        ArrayList arrayList4 = this.f12666d;
        if (arrayList4.size() > 0) {
            if (this.f12671i == null) {
                this.f12671i = new Bundle();
            }
            Bundle bundle3 = this.f12671i.getBundle("android.car.EXTENSIONS");
            if (bundle3 == null) {
                bundle3 = new Bundle();
            }
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            if (arrayList4.size() > 0) {
                Integer.toString(0);
                if (arrayList4.get(0) != null) {
                    throw new ClassCastException();
                }
                new Bundle();
                throw null;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (this.f12671i == null) {
                this.f12671i = new Bundle();
            }
            this.f12671i.putBundle("android.car.EXTENSIONS", bundle3);
            bundle.putBundle("android.car.EXTENSIONS", bundle4);
        }
        int i8 = Build.VERSION.SDK_INT;
        builder.setExtras(this.f12671i);
        builder.setRemoteInputHistory(null);
        builder.setBadgeIconType(0);
        builder.setSettingsText(null);
        builder.setShortcutId(null);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(str)) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i8 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i8 >= 29) {
            L0.a.i(builder, this.f12673k);
            L0.a.j(builder);
        }
        return builder.build();
    }
}
