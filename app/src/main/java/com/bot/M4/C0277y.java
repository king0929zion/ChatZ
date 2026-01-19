package M4;

import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* renamed from: M4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277y implements KSerializer {
    public final Enum[] a;

    /* renamed from: b, reason: collision with root package name */
    public final X3.n f3506b;

    public C0277y(String str, Enum[] enumArr) {
        this.a = enumArr;
        this.f3506b = X3.a.d(new D.r(8, this, str));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int f6 = decoder.f(getDescriptor());
        Enum[] enumArr = this.a;
        if (f6 >= 0 && f6 < enumArr.length) {
            return enumArr[f6];
        }
        throw new IllegalArgumentException(f6 + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f3506b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Enum r5 = (Enum) obj;
        AbstractC1276k.f(r5, "value");
        Enum[] enumArr = this.a;
        int v02 = Y3.k.v0(r5, enumArr);
        if (v02 != -1) {
            encoder.j(getDescriptor(), v02);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(enumArr);
        AbstractC1276k.e(arrays, "toString(...)");
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + BlockQuoteParser.MARKER_CHAR;
    }
}
