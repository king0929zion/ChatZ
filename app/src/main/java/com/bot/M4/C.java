package M4;

import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public interface C extends KSerializer {
    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
