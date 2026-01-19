package H0;

import com.vladsch.flexmark.parser.internal.PostProcessorManager;
import com.vladsch.flexmark.util.sequence.builder.SegmentedSequenceStats;
import java.util.Comparator;
import java.util.Map;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i6) {
        this.a = i6;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                J j3 = (J) obj;
                J j4 = (J) obj2;
                float f6 = j3.f1722K.f1781p.f1861I;
                float f7 = j4.f1722K.f1781p.f1861I;
                return f6 == f7 ? AbstractC1276k.g(j3.w(), j4.w()) : Float.compare(f6, f7);
            case 1:
                return AbstractC1276k.g(((T.N) obj).f8009b, ((T.N) obj2).f8009b);
            case 2:
                X3.i iVar = (X3.i) obj;
                X3.i iVar2 = (X3.i) obj2;
                return (((Number) iVar.f9394e).intValue() - ((Number) iVar.f9393c).intValue()) - (((Number) iVar2.f9394e).intValue() - ((Number) iVar2.f9393c).intValue());
            case 3:
                return PostProcessorManager.a((Map.Entry) obj, (Map.Entry) obj2);
            case 4:
                return ((SegmentedSequenceStats.StatsEntry) obj).compareTo((SegmentedSequenceStats.StatsEntry) obj2);
            case AbstractC1787b.f15290g /* 5 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b5 = bArr[i6];
                    byte b6 = bArr2[i6];
                    if (b5 != b6) {
                        return b5 - b6;
                    }
                }
                return 0;
            case 6:
                return AbstractC1276k.g(((y.u0) obj2).a, ((y.u0) obj).a);
            default:
                return AbstractC1276k.g(((x.m) obj).a, ((x.m) obj2).a);
        }
    }
}
