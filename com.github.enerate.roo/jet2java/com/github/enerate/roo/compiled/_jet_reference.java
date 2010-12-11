package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_reference implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_reference() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_7 = new TagInfo("c:if", //$NON-NLS-1$
            1, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_2_53 = new TagInfo("c:if", //$NON-NLS-1$
            2, 53,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_46 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 46,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_3_126 = new TagInfo("c:include", //$NON-NLS-1$
            3, 126,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_65 = new TagInfo("c:get", //$NON-NLS-1$
            4, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_109 = new TagInfo("c:get", //$NON-NLS-1$
            4, 109,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_144 = new TagInfo("c:if", //$NON-NLS-1$
            4, 144,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_52 = new TagInfo("c:if", //$NON-NLS-1$
            5, 52,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_54 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 54,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_7_64 = new TagInfo("c:include", //$NON-NLS-1$
            7, 64,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_138 = new TagInfo("c:get", //$NON-NLS-1$
            7, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_45 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 45,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_99 = new TagInfo("c:include", //$NON-NLS-1$
            8, 99,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("field ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_1_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_7.setRuntimeParent(null);
        _jettag_c_if_1_7.setTagInfo(_td_c_if_1_7);
        _jettag_c_if_1_7.doStart(context, out);
        while (_jettag_c_if_1_7.okToProcessBody()) {
            out.write("reference");  //$NON-NLS-1$        
            _jettag_c_if_1_7.handleBodyContent(out);
        }
        _jettag_c_if_1_7.doEnd();
        RuntimeTagElement _jettag_c_if_2_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_53.setRuntimeParent(null);
        _jettag_c_if_2_53.setTagInfo(_td_c_if_2_53);
        _jettag_c_if_2_53.doStart(context, out);
        while (_jettag_c_if_2_53.okToProcessBody()) {
            out.write("set");  //$NON-NLS-1$        
            _jettag_c_if_2_53.handleBodyContent(out);
        }
        _jettag_c_if_2_53.doEnd();
        RuntimeTagElement _jettag_c_setVariable_3_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_46); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_3_46.setRuntimeParent(null);
        _jettag_c_setVariable_3_46.setTagInfo(_td_c_setVariable_3_46);
        _jettag_c_setVariable_3_46.doStart(context, out);
        _jettag_c_setVariable_3_46.doEnd();
        out.write(" --class ~.server.domain.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_3_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_3_126); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_3_126.setRuntimeParent(null);
        _jettag_c_include_3_126.setTagInfo(_td_c_include_3_126);
        _jettag_c_include_3_126.doStart(context, out);
        _jettag_c_include_3_126.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_65.setRuntimeParent(null);
        _jettag_c_get_4_65.setTagInfo(_td_c_get_4_65);
        _jettag_c_get_4_65.doStart(context, out);
        _jettag_c_get_4_65.doEnd();
        out.write(" --fieldName ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_109 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_109); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_109.setRuntimeParent(null);
        _jettag_c_get_4_109.setTagInfo(_td_c_get_4_109);
        _jettag_c_get_4_109.doStart(context, out);
        _jettag_c_get_4_109.doEnd();
        RuntimeTagElement _jettag_c_if_4_144 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_144); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_4_144.setRuntimeParent(null);
        _jettag_c_if_4_144.setTagInfo(_td_c_if_4_144);
        _jettag_c_if_4_144.doStart(context, out);
        while (_jettag_c_if_4_144.okToProcessBody()) {
            out.write(" --type ");  //$NON-NLS-1$        
            _jettag_c_if_4_144.handleBodyContent(out);
        }
        _jettag_c_if_4_144.doEnd();
        RuntimeTagElement _jettag_c_if_5_52 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_52); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_52.setRuntimeParent(null);
        _jettag_c_if_5_52.setTagInfo(_td_c_if_5_52);
        _jettag_c_if_5_52.doStart(context, out);
        while (_jettag_c_if_5_52.okToProcessBody()) {
            out.write(" --element ");  //$NON-NLS-1$        
            _jettag_c_if_5_52.handleBodyContent(out);
        }
        _jettag_c_if_5_52.doEnd();
        RuntimeTagElement _jettag_c_setVariable_6_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_6_54.setRuntimeParent(null);
        _jettag_c_setVariable_6_54.setTagInfo(_td_c_setVariable_6_54);
        _jettag_c_setVariable_6_54.doStart(context, out);
        _jettag_c_setVariable_6_54.doEnd();
        out.write("~.server.domain.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_7_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_7_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_7_64.setRuntimeParent(null);
        _jettag_c_include_7_64.setTagInfo(_td_c_include_7_64);
        _jettag_c_include_7_64.doStart(context, out);
        _jettag_c_include_7_64.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_138); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_138.setRuntimeParent(null);
        _jettag_c_get_7_138.setTagInfo(_td_c_get_7_138);
        _jettag_c_get_7_138.doStart(context, out);
        _jettag_c_get_7_138.doEnd();
        RuntimeTagElement _jettag_c_setVariable_8_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_45.setRuntimeParent(null);
        _jettag_c_setVariable_8_45.setTagInfo(_td_c_setVariable_8_45);
        _jettag_c_setVariable_8_45.doStart(context, out);
        _jettag_c_setVariable_8_45.doEnd();
        RuntimeTagElement _jettag_c_include_8_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_99); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_8_99.setRuntimeParent(null);
        _jettag_c_include_8_99.setTagInfo(_td_c_include_8_99);
        _jettag_c_include_8_99.doStart(context, out);
        _jettag_c_include_8_99.doEnd();
        out.write(NL);         
    }
}
