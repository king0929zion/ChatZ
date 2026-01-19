package P0;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class j {
    public final InterfaceC1193a a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1193a f4441b;

    public j(InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2) {
        this.a = interfaceC1193a;
        this.f4441b = interfaceC1193a2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.b()).floatValue() + ", maxValue=" + ((Number) this.f4441b.b()).floatValue() + ", reverseScrolling=false)";
    }
}
