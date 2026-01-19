package v4;

import java.util.concurrent.TimeUnit;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1827c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f15393c;

    EnumC1827c(TimeUnit timeUnit) {
        this.f15393c = timeUnit;
    }
}
