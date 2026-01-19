package I3;

import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class k {
    public static final Set a = Y3.k.C0(new Character[]{'(', ')', '<', Character.valueOf(BlockQuoteParser.MARKER_CHAR), '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', Character.valueOf(SequenceUtils.SPC), '\t', '\n', '\r'});
}
