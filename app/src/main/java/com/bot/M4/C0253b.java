package M4;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: M4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253b extends L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0253b(SerialDescriptor serialDescriptor, int i6) {
        super(serialDescriptor);
        this.f3446b = i6;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        switch (this.f3446b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
