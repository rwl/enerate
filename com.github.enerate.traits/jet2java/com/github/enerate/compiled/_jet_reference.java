package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_reference implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_reference() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_2_1 = new TagInfo("c:if", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_7 = new TagInfo("c:include", //$NON-NLS-1$
            4, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_6_1 = new TagInfo("c:choose", //$NON-NLS-1$
            6, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_7_1 = new TagInfo("c:when", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_5 = new TagInfo("c:get", //$NON-NLS-1$
            8, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_53 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 53,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_127 = new TagInfo("c:include", //$NON-NLS-1$
            8, 127,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_201 = new TagInfo("c:get", //$NON-NLS-1$
            8, 201,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_252 = new TagInfo("c:if", //$NON-NLS-1$
            8, 252,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@required = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_321 = new TagInfo("c:if", //$NON-NLS-1$
            8, 321,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_15 = new TagInfo("c:include", //$NON-NLS-1$
            9, 15,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_68 = new TagInfo("c:if", //$NON-NLS-1$
            9, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($eReference/@transient) = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_10_30 = new TagInfo("c:if", //$NON-NLS-1$
            10, 30,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_19 = new TagInfo("c:get", //$NON-NLS-1$
            11, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_38 = new TagInfo("c:get", //$NON-NLS-1$
            12, 38,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lower-case($eReference/eReferenceType/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_5 = new TagInfo("c:include", //$NON-NLS-1$
            14, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/cim/reference.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_17_1 = new TagInfo("c:when", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many='true' and boolean($eReference/@associated) != 'true' or $eReference/@associated = '0'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_5 = new TagInfo("c:get", //$NON-NLS-1$
            18, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_18_58 = new TagInfo("c:setVariable", //$NON-NLS-1$
            18, 58,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_18_132 = new TagInfo("c:include", //$NON-NLS-1$
            18, 132,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_206 = new TagInfo("c:get", //$NON-NLS-1$
            18, 206,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_258 = new TagInfo("c:if", //$NON-NLS-1$
            18, 258,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_19_15 = new TagInfo("c:include", //$NON-NLS-1$
            19, 15,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_21_1 = new TagInfo("c:when", //$NON-NLS-1$
            21, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many='true' and $eReference/@associated = '1'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_5 = new TagInfo("c:get", //$NON-NLS-1$
            22, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_22_59 = new TagInfo("c:setVariable", //$NON-NLS-1$
            22, 59,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_22_133 = new TagInfo("c:include", //$NON-NLS-1$
            22, 133,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_207 = new TagInfo("c:get", //$NON-NLS-1$
            22, 207,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_259 = new TagInfo("c:if", //$NON-NLS-1$
            22, 259,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eReference/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_23_15 = new TagInfo("c:include", //$NON-NLS-1$
            23, 15,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_1.setRuntimeParent(null);
        _jettag_c_if_2_1.setTagInfo(_td_c_if_2_1);
        _jettag_c_if_2_1.doStart(context, out);
        while (_jettag_c_if_2_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_5.setRuntimeParent(_jettag_c_if_2_1);
            _jettag_c_setVariable_3_5.setTagInfo(_td_c_setVariable_3_5);
            _jettag_c_setVariable_3_5.doStart(context, out);
            _jettag_c_setVariable_3_5.doEnd();
            out.write("    # ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_4_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_4_7.setRuntimeParent(_jettag_c_if_2_1);
            _jettag_c_include_4_7.setTagInfo(_td_c_include_4_7);
            _jettag_c_include_4_7.doStart(context, out);
            _jettag_c_include_4_7.doEnd();
            out.write(NL);         
            _jettag_c_if_2_1.handleBodyContent(out);
        }
        _jettag_c_if_2_1.doEnd();
        RuntimeTagElement _jettag_c_choose_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_6_1.setRuntimeParent(null);
        _jettag_c_choose_6_1.setTagInfo(_td_c_choose_6_1);
        _jettag_c_choose_6_1.doStart(context, out);
        JET2Writer _jettag_c_choose_6_1_saved_out = out;
        while (_jettag_c_choose_6_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_7_1.setRuntimeParent(_jettag_c_choose_6_1);
            _jettag_c_when_7_1.setTagInfo(_td_c_when_7_1);
            _jettag_c_when_7_1.doStart(context, out);
            JET2Writer _jettag_c_when_7_1_saved_out = out;
            while (_jettag_c_when_7_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_5.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_get_8_5.setTagInfo(_td_c_get_8_5);
                _jettag_c_get_8_5.doStart(context, out);
                _jettag_c_get_8_5.doEnd();
                out.write(" = Instance(\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_8_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_53); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_8_53.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_setVariable_8_53.setTagInfo(_td_c_setVariable_8_53);
                _jettag_c_setVariable_8_53.doStart(context, out);
                _jettag_c_setVariable_8_53.doEnd();
                RuntimeTagElement _jettag_c_include_8_127 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_127); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_8_127.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_include_8_127.setTagInfo(_td_c_include_8_127);
                _jettag_c_include_8_127.doStart(context, out);
                _jettag_c_include_8_127.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_201 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_201); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_201.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_get_8_201.setTagInfo(_td_c_get_8_201);
                _jettag_c_get_8_201.doStart(context, out);
                _jettag_c_get_8_201.doEnd();
                out.write("\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_8_252 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_252); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_252.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_if_8_252.setTagInfo(_td_c_if_8_252);
                _jettag_c_if_8_252.doStart(context, out);
                while (_jettag_c_if_8_252.okToProcessBody()) {
                    out.write(", allow_none=False");  //$NON-NLS-1$        
                    _jettag_c_if_8_252.handleBodyContent(out);
                }
                _jettag_c_if_8_252.doEnd();
                RuntimeTagElement _jettag_c_if_8_321 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_321); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_8_321.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_if_8_321.setTagInfo(_td_c_if_8_321);
                _jettag_c_if_8_321.doStart(context, out);
                while (_jettag_c_if_8_321.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        desc=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_include_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_9_15.setRuntimeParent(_jettag_c_if_8_321);
                    _jettag_c_include_9_15.setTagInfo(_td_c_include_9_15);
                    _jettag_c_include_9_15.doStart(context, out);
                    _jettag_c_include_9_15.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    _jettag_c_if_8_321.handleBodyContent(out);
                }
                _jettag_c_if_8_321.doEnd();
                RuntimeTagElement _jettag_c_if_9_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_68); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_68.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_if_9_68.setTagInfo(_td_c_if_9_68);
                _jettag_c_if_9_68.doStart(context, out);
                while (_jettag_c_if_9_68.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        transient=True");  //$NON-NLS-1$        
                    _jettag_c_if_9_68.handleBodyContent(out);
                }
                _jettag_c_if_9_68.doEnd();
                RuntimeTagElement _jettag_c_if_10_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_10_30); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_10_30.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_if_10_30.setTagInfo(_td_c_if_10_30);
                _jettag_c_if_10_30.doStart(context, out);
                while (_jettag_c_if_10_30.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        opposite=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_11_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_19); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_11_19.setRuntimeParent(_jettag_c_if_10_30);
                    _jettag_c_get_11_19.setTagInfo(_td_c_get_11_19);
                    _jettag_c_get_11_19.doStart(context, out);
                    _jettag_c_get_11_19.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    _jettag_c_if_10_30.handleBodyContent(out);
                }
                _jettag_c_if_10_30.doEnd();
                out.write(",");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        editor=InstanceEditor(name=\"_");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_38 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_38); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_38.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_get_12_38.setTagInfo(_td_c_get_12_38);
                _jettag_c_get_12_38.doStart(context, out);
                _jettag_c_get_12_38.doEnd();
                out.write("s\"))");  //$NON-NLS-1$        
                out.write(NL);         
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_14_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_14_5.setRuntimeParent(_jettag_c_when_7_1);
                _jettag_c_include_14_5.setTagInfo(_td_c_include_14_5);
                _jettag_c_include_14_5.doStart(context, out);
                _jettag_c_include_14_5.doEnd();
                _jettag_c_when_7_1.handleBodyContent(out);
            }
            out = _jettag_c_when_7_1_saved_out;
            _jettag_c_when_7_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_17_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_17_1.setRuntimeParent(_jettag_c_choose_6_1);
            _jettag_c_when_17_1.setTagInfo(_td_c_when_17_1);
            _jettag_c_when_17_1.doStart(context, out);
            JET2Writer _jettag_c_when_17_1_saved_out = out;
            while (_jettag_c_when_17_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_5.setRuntimeParent(_jettag_c_when_17_1);
                _jettag_c_get_18_5.setTagInfo(_td_c_get_18_5);
                _jettag_c_get_18_5.doStart(context, out);
                _jettag_c_get_18_5.doEnd();
                out.write(" = List(Instance(\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_18_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_18_58); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_18_58.setRuntimeParent(_jettag_c_when_17_1);
                _jettag_c_setVariable_18_58.setTagInfo(_td_c_setVariable_18_58);
                _jettag_c_setVariable_18_58.doStart(context, out);
                _jettag_c_setVariable_18_58.doEnd();
                RuntimeTagElement _jettag_c_include_18_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_18_132); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_18_132.setRuntimeParent(_jettag_c_when_17_1);
                _jettag_c_include_18_132.setTagInfo(_td_c_include_18_132);
                _jettag_c_include_18_132.doStart(context, out);
                _jettag_c_include_18_132.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_18_206 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_206); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_18_206.setRuntimeParent(_jettag_c_when_17_1);
                _jettag_c_get_18_206.setTagInfo(_td_c_get_18_206);
                _jettag_c_get_18_206.doStart(context, out);
                _jettag_c_get_18_206.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_18_258 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_258); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_18_258.setRuntimeParent(_jettag_c_when_17_1);
                _jettag_c_if_18_258.setTagInfo(_td_c_if_18_258);
                _jettag_c_if_18_258.doStart(context, out);
                while (_jettag_c_if_18_258.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        desc=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_include_19_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_19_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_19_15.setRuntimeParent(_jettag_c_if_18_258);
                    _jettag_c_include_19_15.setTagInfo(_td_c_include_19_15);
                    _jettag_c_include_19_15.doStart(context, out);
                    _jettag_c_include_19_15.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    _jettag_c_if_18_258.handleBodyContent(out);
                }
                _jettag_c_if_18_258.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_17_1.handleBodyContent(out);
            }
            out = _jettag_c_when_17_1_saved_out;
            _jettag_c_when_17_1.doEnd();
            RuntimeTagElement _jettag_c_when_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_21_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_21_1.setRuntimeParent(_jettag_c_choose_6_1);
            _jettag_c_when_21_1.setTagInfo(_td_c_when_21_1);
            _jettag_c_when_21_1.doStart(context, out);
            JET2Writer _jettag_c_when_21_1_saved_out = out;
            while (_jettag_c_when_21_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_5.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_22_5.setTagInfo(_td_c_get_22_5);
                _jettag_c_get_22_5.doStart(context, out);
                _jettag_c_get_22_5.doEnd();
                out.write(" = List(Instance(\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_22_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_22_59); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_22_59.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_setVariable_22_59.setTagInfo(_td_c_setVariable_22_59);
                _jettag_c_setVariable_22_59.doStart(context, out);
                _jettag_c_setVariable_22_59.doEnd();
                RuntimeTagElement _jettag_c_include_22_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_22_133); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_22_133.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_include_22_133.setTagInfo(_td_c_include_22_133);
                _jettag_c_include_22_133.doStart(context, out);
                _jettag_c_include_22_133.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_22_207 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_207); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_22_207.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_get_22_207.setTagInfo(_td_c_get_22_207);
                _jettag_c_get_22_207.doStart(context, out);
                _jettag_c_get_22_207.doEnd();
                out.write("\")");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_22_259 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_259); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_22_259.setRuntimeParent(_jettag_c_when_21_1);
                _jettag_c_if_22_259.setTagInfo(_td_c_if_22_259);
                _jettag_c_if_22_259.doStart(context, out);
                while (_jettag_c_if_22_259.okToProcessBody()) {
                    out.write(",");  //$NON-NLS-1$        
                    out.write(NL);         
                    out.write("        desc=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_include_23_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_23_15); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_23_15.setRuntimeParent(_jettag_c_if_22_259);
                    _jettag_c_include_23_15.setTagInfo(_td_c_include_23_15);
                    _jettag_c_include_23_15.doStart(context, out);
                    _jettag_c_include_23_15.doEnd();
                    out.write("\"");  //$NON-NLS-1$        
                    _jettag_c_if_22_259.handleBodyContent(out);
                }
                _jettag_c_if_22_259.doEnd();
                out.write(")");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_21_1.handleBodyContent(out);
            }
            out = _jettag_c_when_21_1_saved_out;
            _jettag_c_when_21_1.doEnd();
            _jettag_c_choose_6_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_6_1_saved_out;
        _jettag_c_choose_6_1.doEnd();
    }
}
