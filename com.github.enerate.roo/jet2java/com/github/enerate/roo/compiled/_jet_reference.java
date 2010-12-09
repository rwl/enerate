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
    private static final TagInfo _td_c_get_3_59 = new TagInfo("c:get", //$NON-NLS-1$
            3, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_30 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 30,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_96 = new TagInfo("c:include", //$NON-NLS-1$
            4, 96,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_65 = new TagInfo("c:get", //$NON-NLS-1$
            5, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_97 = new TagInfo("c:if", //$NON-NLS-1$
            5, 97,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_50 = new TagInfo("c:if", //$NON-NLS-1$
            6, 50,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_53 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 53,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_50 = new TagInfo("c:include", //$NON-NLS-1$
            8, 50,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_124 = new TagInfo("c:get", //$NON-NLS-1$
            8, 124,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_45 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 45,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_99 = new TagInfo("c:include", //$NON-NLS-1$
            9, 99,
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
        out.write(" --fieldName ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_59.setRuntimeParent(null);
        _jettag_c_get_3_59.setTagInfo(_td_c_get_3_59);
        _jettag_c_get_3_59.doStart(context, out);
        _jettag_c_get_3_59.doEnd();
        RuntimeTagElement _jettag_c_setVariable_4_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_30); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_4_30.setRuntimeParent(null);
        _jettag_c_setVariable_4_30.setTagInfo(_td_c_setVariable_4_30);
        _jettag_c_setVariable_4_30.doStart(context, out);
        _jettag_c_setVariable_4_30.doEnd();
        out.write(" --class ~.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_4_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_96); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_4_96.setRuntimeParent(null);
        _jettag_c_include_4_96.setTagInfo(_td_c_include_4_96);
        _jettag_c_include_4_96.doStart(context, out);
        _jettag_c_include_4_96.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_65); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_65.setRuntimeParent(null);
        _jettag_c_get_5_65.setTagInfo(_td_c_get_5_65);
        _jettag_c_get_5_65.doStart(context, out);
        _jettag_c_get_5_65.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_5_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_97); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_97.setRuntimeParent(null);
        _jettag_c_if_5_97.setTagInfo(_td_c_if_5_97);
        _jettag_c_if_5_97.doStart(context, out);
        while (_jettag_c_if_5_97.okToProcessBody()) {
            out.write("--type");  //$NON-NLS-1$        
            _jettag_c_if_5_97.handleBodyContent(out);
        }
        _jettag_c_if_5_97.doEnd();
        RuntimeTagElement _jettag_c_if_6_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_50.setRuntimeParent(null);
        _jettag_c_if_6_50.setTagInfo(_td_c_if_6_50);
        _jettag_c_if_6_50.doStart(context, out);
        while (_jettag_c_if_6_50.okToProcessBody()) {
            out.write("--element");  //$NON-NLS-1$        
            _jettag_c_if_6_50.handleBodyContent(out);
        }
        _jettag_c_if_6_50.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_setVariable_7_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_53); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_7_53.setRuntimeParent(null);
        _jettag_c_setVariable_7_53.setTagInfo(_td_c_setVariable_7_53);
        _jettag_c_setVariable_7_53.doStart(context, out);
        _jettag_c_setVariable_7_53.doEnd();
        out.write("~.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_8_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_50); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_8_50.setRuntimeParent(null);
        _jettag_c_include_8_50.setTagInfo(_td_c_include_8_50);
        _jettag_c_include_8_50.doStart(context, out);
        _jettag_c_include_8_50.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_124); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_124.setRuntimeParent(null);
        _jettag_c_get_8_124.setTagInfo(_td_c_get_8_124);
        _jettag_c_get_8_124.doStart(context, out);
        _jettag_c_get_8_124.doEnd();
        RuntimeTagElement _jettag_c_setVariable_9_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_9_45.setRuntimeParent(null);
        _jettag_c_setVariable_9_45.setTagInfo(_td_c_setVariable_9_45);
        _jettag_c_setVariable_9_45.doStart(context, out);
        _jettag_c_setVariable_9_45.doEnd();
        RuntimeTagElement _jettag_c_include_9_99 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_99); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_9_99.setRuntimeParent(null);
        _jettag_c_include_9_99.setTagInfo(_td_c_include_9_99);
        _jettag_c_include_9_99.doStart(context, out);
        _jettag_c_include_9_99.doEnd();
        out.write(NL);         
    }
}
