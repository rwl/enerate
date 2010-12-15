package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_ref implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_ref() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_choose_1_7 = new TagInfo("c:choose", //$NON-NLS-1$
            1, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_3_1 = new TagInfo("c:when", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_23 = new TagInfo("c:get", //$NON-NLS-1$
            4, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_66 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 66,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_5_64 = new TagInfo("c:include", //$NON-NLS-1$
            5, 64,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_138 = new TagInfo("c:get", //$NON-NLS-1$
            5, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_5_188 = new TagInfo("c:choose", //$NON-NLS-1$
            5, 188,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_6_1 = new TagInfo("c:when", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_7_1 = new TagInfo("c:when", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_11_1 = new TagInfo("c:when", //$NON-NLS-1$
            11, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_17 = new TagInfo("c:get", //$NON-NLS-1$
            12, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_12_63 = new TagInfo("c:setVariable", //$NON-NLS-1$
            12, 63,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_13_64 = new TagInfo("c:include", //$NON-NLS-1$
            13, 64,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_138 = new TagInfo("c:get", //$NON-NLS-1$
            13, 138,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_13_188 = new TagInfo("c:choose", //$NON-NLS-1$
            13, 188,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_14_1 = new TagInfo("c:when", //$NON-NLS-1$
            14, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_15_1 = new TagInfo("c:when", //$NON-NLS-1$
            15, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_16_12 = new TagInfo("c:if", //$NON-NLS-1$
            16, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($eReference/eOpposite) and not($eReference/@primary='true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_82 = new TagInfo("c:get", //$NON-NLS-1$
            17, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_134 = new TagInfo("c:if", //$NON-NLS-1$
            17, 134,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@lowerBound > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_48 = new TagInfo("c:get", //$NON-NLS-1$
            18, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@lowerBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_96 = new TagInfo("c:if", //$NON-NLS-1$
            18, 96,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@upperBound > -1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_49 = new TagInfo("c:get", //$NON-NLS-1$
            19, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@upperBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_12 = new TagInfo("c:if", //$NON-NLS-1$
            21, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@lowerBound > 0 and not($eReference/@primary='true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_91 = new TagInfo("c:if", //$NON-NLS-1$
            22, 91,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@upperBound = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_23_59 = new TagInfo("c:setVariable", //$NON-NLS-1$
            23, 59,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_24_67 = new TagInfo("c:include", //$NON-NLS-1$
            24, 67,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_141 = new TagInfo("c:get", //$NON-NLS-1$
            24, 141,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_172 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 172,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_41 = new TagInfo("c:include", //$NON-NLS-1$
            25, 41,
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
        RuntimeTagElement _jettag_c_choose_1_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_1_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_1_7.setRuntimeParent(null);
        _jettag_c_choose_1_7.setTagInfo(_td_c_choose_1_7);
        _jettag_c_choose_1_7.doStart(context, out);
        JET2Writer _jettag_c_choose_1_7_saved_out = out;
        while (_jettag_c_choose_1_7.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_3_1.setRuntimeParent(_jettag_c_choose_1_7);
            _jettag_c_when_3_1.setTagInfo(_td_c_when_3_1);
            _jettag_c_when_3_1.doStart(context, out);
            JET2Writer _jettag_c_when_3_1_saved_out = out;
            while (_jettag_c_when_3_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("reference --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_4_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_4_23.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_4_23.setTagInfo(_td_c_get_4_23);
                _jettag_c_get_4_23.doStart(context, out);
                _jettag_c_get_4_23.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_4_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_66); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_4_66.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_setVariable_4_66.setTagInfo(_td_c_setVariable_4_66);
                _jettag_c_setVariable_4_66.doStart(context, out);
                _jettag_c_setVariable_4_66.doEnd();
                out.write("~.server.domain.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_5_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_5_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_5_64.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_include_5_64.setTagInfo(_td_c_include_5_64);
                _jettag_c_include_5_64.doStart(context, out);
                _jettag_c_include_5_64.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_138); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_138.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_get_5_138.setTagInfo(_td_c_get_5_138);
                _jettag_c_get_5_138.doStart(context, out);
                _jettag_c_get_5_138.doEnd();
                RuntimeTagElement _jettag_c_choose_5_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_5_188); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_5_188.setRuntimeParent(_jettag_c_when_3_1);
                _jettag_c_choose_5_188.setTagInfo(_td_c_choose_5_188);
                _jettag_c_choose_5_188.doStart(context, out);
                JET2Writer _jettag_c_choose_5_188_saved_out = out;
                while (_jettag_c_choose_5_188.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_6_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_6_1.setRuntimeParent(_jettag_c_choose_5_188);
                    _jettag_c_when_6_1.setTagInfo(_td_c_when_6_1);
                    _jettag_c_when_6_1.doStart(context, out);
                    JET2Writer _jettag_c_when_6_1_saved_out = out;
                    while (_jettag_c_when_6_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality MANY_TO_ONE");  //$NON-NLS-1$        
                        _jettag_c_when_6_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_6_1_saved_out;
                    _jettag_c_when_6_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_7_1.setRuntimeParent(_jettag_c_choose_5_188);
                    _jettag_c_when_7_1.setTagInfo(_td_c_when_7_1);
                    _jettag_c_when_7_1.doStart(context, out);
                    JET2Writer _jettag_c_when_7_1_saved_out = out;
                    while (_jettag_c_when_7_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality ONE_TO_ONE");  //$NON-NLS-1$        
                        _jettag_c_when_7_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_7_1_saved_out;
                    _jettag_c_when_7_1.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_5_188.handleBodyContent(out);
                }
                out = _jettag_c_choose_5_188_saved_out;
                _jettag_c_choose_5_188.doEnd();
                _jettag_c_when_3_1.handleBodyContent(out);
            }
            out = _jettag_c_when_3_1_saved_out;
            _jettag_c_when_3_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_11_1.setRuntimeParent(_jettag_c_choose_1_7);
            _jettag_c_when_11_1.setTagInfo(_td_c_when_11_1);
            _jettag_c_when_11_1.doStart(context, out);
            JET2Writer _jettag_c_when_11_1_saved_out = out;
            while (_jettag_c_when_11_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("set --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_12_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_17.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_get_12_17.setTagInfo(_td_c_get_12_17);
                _jettag_c_get_12_17.doStart(context, out);
                _jettag_c_get_12_17.doEnd();
                out.write(" --element ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_12_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_12_63); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_12_63.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_setVariable_12_63.setTagInfo(_td_c_setVariable_12_63);
                _jettag_c_setVariable_12_63.doStart(context, out);
                _jettag_c_setVariable_12_63.doEnd();
                out.write("~.server.domain.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_13_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_13_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_13_64.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_include_13_64.setTagInfo(_td_c_include_13_64);
                _jettag_c_include_13_64.doStart(context, out);
                _jettag_c_include_13_64.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_13_138 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_138); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_13_138.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_get_13_138.setTagInfo(_td_c_get_13_138);
                _jettag_c_get_13_138.doStart(context, out);
                _jettag_c_get_13_138.doEnd();
                RuntimeTagElement _jettag_c_choose_13_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_13_188); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_13_188.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_choose_13_188.setTagInfo(_td_c_choose_13_188);
                _jettag_c_choose_13_188.doStart(context, out);
                JET2Writer _jettag_c_choose_13_188_saved_out = out;
                while (_jettag_c_choose_13_188.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_14_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_14_1.setRuntimeParent(_jettag_c_choose_13_188);
                    _jettag_c_when_14_1.setTagInfo(_td_c_when_14_1);
                    _jettag_c_when_14_1.doStart(context, out);
                    JET2Writer _jettag_c_when_14_1_saved_out = out;
                    while (_jettag_c_when_14_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality MANY_TO_MANY");  //$NON-NLS-1$        
                        _jettag_c_when_14_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_14_1_saved_out;
                    _jettag_c_when_14_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_15_1.setRuntimeParent(_jettag_c_choose_13_188);
                    _jettag_c_when_15_1.setTagInfo(_td_c_when_15_1);
                    _jettag_c_when_15_1.doStart(context, out);
                    JET2Writer _jettag_c_when_15_1_saved_out = out;
                    while (_jettag_c_when_15_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality ONE_TO_MANY");  //$NON-NLS-1$        
                        _jettag_c_when_15_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_15_1_saved_out;
                    _jettag_c_when_15_1.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_13_188.handleBodyContent(out);
                }
                out = _jettag_c_choose_13_188_saved_out;
                _jettag_c_choose_13_188.doEnd();
                RuntimeTagElement _jettag_c_if_16_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_16_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_16_12.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_if_16_12.setTagInfo(_td_c_if_16_12);
                _jettag_c_if_16_12.doStart(context, out);
                while (_jettag_c_if_16_12.okToProcessBody()) {
                    out.write(" --mappedBy ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_17_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_17_82.setRuntimeParent(_jettag_c_if_16_12);
                    _jettag_c_get_17_82.setTagInfo(_td_c_get_17_82);
                    _jettag_c_get_17_82.doStart(context, out);
                    _jettag_c_get_17_82.doEnd();
                    _jettag_c_if_16_12.handleBodyContent(out);
                }
                _jettag_c_if_16_12.doEnd();
                RuntimeTagElement _jettag_c_if_17_134 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_134); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_134.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_if_17_134.setTagInfo(_td_c_if_17_134);
                _jettag_c_if_17_134.doStart(context, out);
                while (_jettag_c_if_17_134.okToProcessBody()) {
                    out.write(" --sizeMin ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_18_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_48); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_18_48.setRuntimeParent(_jettag_c_if_17_134);
                    _jettag_c_get_18_48.setTagInfo(_td_c_get_18_48);
                    _jettag_c_get_18_48.doStart(context, out);
                    _jettag_c_get_18_48.doEnd();
                    _jettag_c_if_17_134.handleBodyContent(out);
                }
                _jettag_c_if_17_134.doEnd();
                RuntimeTagElement _jettag_c_if_18_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_96); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_18_96.setRuntimeParent(_jettag_c_when_11_1);
                _jettag_c_if_18_96.setTagInfo(_td_c_if_18_96);
                _jettag_c_if_18_96.doStart(context, out);
                while (_jettag_c_if_18_96.okToProcessBody()) {
                    out.write(" --sizeMax ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_19_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_49); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_49.setRuntimeParent(_jettag_c_if_18_96);
                    _jettag_c_get_19_49.setTagInfo(_td_c_get_19_49);
                    _jettag_c_get_19_49.doStart(context, out);
                    _jettag_c_get_19_49.doEnd();
                    _jettag_c_if_18_96.handleBodyContent(out);
                }
                _jettag_c_if_18_96.doEnd();
                _jettag_c_when_11_1.handleBodyContent(out);
            }
            out = _jettag_c_when_11_1_saved_out;
            _jettag_c_when_11_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            _jettag_c_choose_1_7.handleBodyContent(out);
        }
        out = _jettag_c_choose_1_7_saved_out;
        _jettag_c_choose_1_7.doEnd();
        RuntimeTagElement _jettag_c_if_21_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_21_12.setRuntimeParent(null);
        _jettag_c_if_21_12.setTagInfo(_td_c_if_21_12);
        _jettag_c_if_21_12.doStart(context, out);
        while (_jettag_c_if_21_12.okToProcessBody()) {
            out.write(" --notNull");  //$NON-NLS-1$        
            _jettag_c_if_21_12.handleBodyContent(out);
        }
        _jettag_c_if_21_12.doEnd();
        RuntimeTagElement _jettag_c_if_22_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_22_91.setRuntimeParent(null);
        _jettag_c_if_22_91.setTagInfo(_td_c_if_22_91);
        _jettag_c_if_22_91.doStart(context, out);
        while (_jettag_c_if_22_91.okToProcessBody()) {
            out.write(" --nullRequired");  //$NON-NLS-1$        
            _jettag_c_if_22_91.handleBodyContent(out);
        }
        _jettag_c_if_22_91.doEnd();
        RuntimeTagElement _jettag_c_setVariable_23_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_23_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_23_59.setRuntimeParent(null);
        _jettag_c_setVariable_23_59.setTagInfo(_td_c_setVariable_23_59);
        _jettag_c_setVariable_23_59.doStart(context, out);
        _jettag_c_setVariable_23_59.doEnd();
        out.write(" --class ~.server.domain.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_24_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_24_67); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_24_67.setRuntimeParent(null);
        _jettag_c_include_24_67.setTagInfo(_td_c_include_24_67);
        _jettag_c_include_24_67.doStart(context, out);
        _jettag_c_include_24_67.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_24_141 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_141); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_24_141.setRuntimeParent(null);
        _jettag_c_get_24_141.setTagInfo(_td_c_get_24_141);
        _jettag_c_get_24_141.doStart(context, out);
        _jettag_c_get_24_141.doEnd();
        RuntimeTagElement _jettag_c_setVariable_24_172 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_172); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_24_172.setRuntimeParent(null);
        _jettag_c_setVariable_24_172.setTagInfo(_td_c_setVariable_24_172);
        _jettag_c_setVariable_24_172.doStart(context, out);
        _jettag_c_setVariable_24_172.doEnd();
        RuntimeTagElement _jettag_c_include_25_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_25_41.setRuntimeParent(null);
        _jettag_c_include_25_41.setTagInfo(_td_c_include_25_41);
        _jettag_c_include_25_41.doStart(context, out);
        _jettag_c_include_25_41.doEnd();
        out.write(NL);         
    }
}
