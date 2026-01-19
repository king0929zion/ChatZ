package P2;

import T.C0607g0;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.Locale;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class P0 {
    public TextToSpeech a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4772b;

    /* renamed from: c, reason: collision with root package name */
    public final C0607g0 f4773c;

    /* renamed from: d, reason: collision with root package name */
    public final C0607g0 f4774d;

    public P0(Context context) {
        AbstractC1276k.f(context, "context");
        this.f4773c = T.r.A(R0.f4779c);
        this.f4774d = T.r.A(null);
        this.a = new TextToSpeech(context, new TextToSpeech.OnInitListener() { // from class: P2.N0
            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i6) {
                boolean z5 = i6 == 0;
                P0 p02 = P0.this;
                p02.f4772b = z5;
                if (z5) {
                    TextToSpeech textToSpeech = p02.a;
                    if (textToSpeech != null) {
                        textToSpeech.setLanguage(Locale.CHINESE);
                    }
                    TextToSpeech textToSpeech2 = p02.a;
                    if (textToSpeech2 != null) {
                        textToSpeech2.setOnUtteranceProgressListener(new O0(p02));
                    }
                }
            }
        });
    }
}
