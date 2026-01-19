package q4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import m4.AbstractC1276k;
import p4.AbstractC1488a;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1508a extends AbstractC1488a {
    @Override // p4.AbstractC1488a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC1276k.e(current, "current(...)");
        return current;
    }
}
