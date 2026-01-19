package O2;

import I2.g;
import I2.w;
import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d4.i;
import java.util.regex.Pattern;
import l4.e;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import u4.C1770h;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class c extends i implements e {

    /* renamed from: h, reason: collision with root package name */
    public int f4319h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f4320i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f4321j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f4322k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f4323l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f4324m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, String str2, String str3, w wVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4320i = dVar;
        this.f4321j = str;
        this.f4322k = str2;
        this.f4323l = str3;
        this.f4324m = wVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new c(this.f4320i, this.f4321j, this.f4322k, this.f4323l, this.f4324m, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        Object o5;
        int i6 = this.f4319h;
        if (i6 == 0) {
            X3.a.e(obj);
            Pattern compile = Pattern.compile("\\s+");
            AbstractC1276k.e(compile, "compile(...)");
            String str = this.f4321j;
            AbstractC1276k.f(str, FlexmarkHtmlConverter.INPUT_NODE);
            String replaceAll = compile.matcher(str).replaceAll(SequenceUtils.SPACE);
            AbstractC1276k.e(replaceAll, "replaceAll(...)");
            String j02 = AbstractC1776n.j0(600, AbstractC1776n.l0(replaceAll).toString());
            Pattern compile2 = Pattern.compile("\\s+");
            AbstractC1276k.e(compile2, "compile(...)");
            String str2 = this.f4322k;
            AbstractC1276k.f(str2, FlexmarkHtmlConverter.INPUT_NODE);
            String replaceAll2 = compile2.matcher(str2).replaceAll(SequenceUtils.SPACE);
            AbstractC1276k.e(replaceAll2, "replaceAll(...)");
            String str3 = "用户：" + j02 + "\n助手：" + AbstractC1776n.j0(600, AbstractC1776n.l0(replaceAll2).toString());
            g gVar = this.f4320i.a;
            this.f4319h = 1;
            o5 = gVar.o(str3, this.f4323l, this.f4324m, "请根据以下对话生成一个简短标题（不超过20字），保持与用户消息相同语言，只输出标题本身，不要引号或前后缀。", 48, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (o5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            o5 = obj;
        }
        String str4 = (String) o5;
        if (str4 != null && !AbstractC1776n.Q(str4)) {
            C1770h c1770h = new C1770h(str4);
            String str5 = (String) (!c1770h.hasNext() ? null : c1770h.next());
            if (str5 == null) {
                str5 = FlexmarkHtmlConverter.DEFAULT_NODE;
            }
            String p02 = AbstractC1776n.p0(AbstractC1776n.m0(AbstractC1776n.l0(AbstractC1776n.X(AbstractC1776n.X(AbstractC1776n.X(AbstractC1776n.X(AbstractC1776n.l0(str5).toString(), "标题:"), "标题："), "Title:"), "Title：")).toString(), '\"', '\'', '\"', '\"', '`'), '-', 8226, 183, '*', '#', SequenceUtils.SPC);
            Pattern compile3 = Pattern.compile("\\s+");
            AbstractC1276k.e(compile3, "compile(...)");
            AbstractC1276k.f(p02, FlexmarkHtmlConverter.INPUT_NODE);
            String replaceAll3 = compile3.matcher(p02).replaceAll(SequenceUtils.SPACE);
            AbstractC1276k.e(replaceAll3, "replaceAll(...)");
            String j03 = AbstractC1776n.j0(30, AbstractC1776n.l0(replaceAll3).toString());
            if (!AbstractC1776n.Q(j03)) {
                return j03;
            }
        }
        return null;
    }
}
