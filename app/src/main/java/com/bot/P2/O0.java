package P2;

import android.speech.tts.UtteranceProgressListener;

/* loaded from: classes.dex */
public final class O0 extends UtteranceProgressListener {
    public final /* synthetic */ P0 a;

    public O0(P0 p02) {
        this.a = p02;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        R0 r02 = R0.f4779c;
        P0 p02 = this.a;
        p02.f4773c.setValue(r02);
        p02.f4774d.setValue(null);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        R0 r02 = R0.f4781f;
        P0 p02 = this.a;
        p02.f4773c.setValue(r02);
        p02.f4774d.setValue(null);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        R0 r02 = R0.f4780e;
        P0 p02 = this.a;
        p02.f4773c.setValue(r02);
        p02.f4774d.setValue(str);
    }
}
