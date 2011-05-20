package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_ref implements JET2Template {
    private static final String _jetns_en = "com.github.enerate.tag.tagLibrary"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_ref() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_choose_2_7 = new TagInfo("c:choose", //$NON-NLS-1$
            2, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_4_1 = new TagInfo("c:when", //$NON-NLS-1$
            4, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_5_23 = new TagInfo("en:getRoo", //$NON-NLS-1$
            5, 23,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_87 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 87,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_6_64 = new TagInfo("c:include", //$NON-NLS-1$
            6, 64,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_6_138 = new TagInfo("en:getRoo", //$NON-NLS-1$
            6, 138,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
                "sql,test", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_6_209 = new TagInfo("c:choose", //$NON-NLS-1$
            6, 209,
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
                "$eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_8_1 = new TagInfo("c:when", //$NON-NLS-1$
            8, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_12_1 = new TagInfo("c:when", //$NON-NLS-1$
            12, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_13_17 = new TagInfo("en:getRoo", //$NON-NLS-1$
            13, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_13_81 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 81,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_64 = new TagInfo("c:include", //$NON-NLS-1$
            14, 64,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_14_138 = new TagInfo("en:getRoo", //$NON-NLS-1$
            14, 138,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
                "sql,test", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_14_209 = new TagInfo("c:choose", //$NON-NLS-1$
            14, 209,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_15_1 = new TagInfo("c:when", //$NON-NLS-1$
            15, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_16_1 = new TagInfo("c:when", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_12 = new TagInfo("c:if", //$NON-NLS-1$
            17, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($eReference/eOpposite) and not($eReference/@primary='true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_18_82 = new TagInfo("en:getRoo", //$NON-NLS-1$
            18, 82,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eOpposite/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_18_155 = new TagInfo("c:if", //$NON-NLS-1$
            18, 155,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@lowerBound > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_48 = new TagInfo("c:get", //$NON-NLS-1$
            19, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@lowerBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_19_96 = new TagInfo("c:if", //$NON-NLS-1$
            19, 96,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@upperBound > -1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_49 = new TagInfo("c:get", //$NON-NLS-1$
            20, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@upperBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_12 = new TagInfo("c:if", //$NON-NLS-1$
            22, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@lowerBound > 0 and not($eReference/@primary='true')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_23_91 = new TagInfo("c:if", //$NON-NLS-1$
            23, 91,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@upperBound = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_24_59 = new TagInfo("c:setVariable", //$NON-NLS-1$
            24, 59,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_25_67 = new TagInfo("c:include", //$NON-NLS-1$
            25, 67,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_25_141 = new TagInfo("en:getRoo", //$NON-NLS-1$
            25, 141,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
                "sql,test", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_25_193 = new TagInfo("c:setVariable", //$NON-NLS-1$
            25, 193,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_26_41 = new TagInfo("c:include", //$NON-NLS-1$
            26, 41,
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
        RuntimeTagElement _jettag_c_choose_2_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_2_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_2_7.setRuntimeParent(null);
        _jettag_c_choose_2_7.setTagInfo(_td_c_choose_2_7);
        _jettag_c_choose_2_7.doStart(context, out);
        JET2Writer _jettag_c_choose_2_7_saved_out = out;
        while (_jettag_c_choose_2_7.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_4_1.setRuntimeParent(_jettag_c_choose_2_7);
            _jettag_c_when_4_1.setTagInfo(_td_c_when_4_1);
            _jettag_c_when_4_1.doStart(context, out);
            JET2Writer _jettag_c_when_4_1_saved_out = out;
            while (_jettag_c_when_4_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("reference --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_5_23 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_5_23); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_5_23.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_en_getRoo_5_23.setTagInfo(_td_en_getRoo_5_23);
                _jettag_en_getRoo_5_23.doStart(context, out);
                _jettag_en_getRoo_5_23.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_5_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_87); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_5_87.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_setVariable_5_87.setTagInfo(_td_c_setVariable_5_87);
                _jettag_c_setVariable_5_87.doStart(context, out);
                _jettag_c_setVariable_5_87.doEnd();
                out.write("~.server.domain.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_6_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_6_64.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_include_6_64.setTagInfo(_td_c_include_6_64);
                _jettag_c_include_6_64.doStart(context, out);
                _jettag_c_include_6_64.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_6_138 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_6_138); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_6_138.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_en_getRoo_6_138.setTagInfo(_td_en_getRoo_6_138);
                _jettag_en_getRoo_6_138.doStart(context, out);
                _jettag_en_getRoo_6_138.doEnd();
                RuntimeTagElement _jettag_c_choose_6_209 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_6_209); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_6_209.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_choose_6_209.setTagInfo(_td_c_choose_6_209);
                _jettag_c_choose_6_209.doStart(context, out);
                JET2Writer _jettag_c_choose_6_209_saved_out = out;
                while (_jettag_c_choose_6_209.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_7_1.setRuntimeParent(_jettag_c_choose_6_209);
                    _jettag_c_when_7_1.setTagInfo(_td_c_when_7_1);
                    _jettag_c_when_7_1.doStart(context, out);
                    JET2Writer _jettag_c_when_7_1_saved_out = out;
                    while (_jettag_c_when_7_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality MANY_TO_ONE");  //$NON-NLS-1$        
                        _jettag_c_when_7_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_7_1_saved_out;
                    _jettag_c_when_7_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_8_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_8_1.setRuntimeParent(_jettag_c_choose_6_209);
                    _jettag_c_when_8_1.setTagInfo(_td_c_when_8_1);
                    _jettag_c_when_8_1.doStart(context, out);
                    JET2Writer _jettag_c_when_8_1_saved_out = out;
                    while (_jettag_c_when_8_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality ONE_TO_ONE");  //$NON-NLS-1$        
                        _jettag_c_when_8_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_8_1_saved_out;
                    _jettag_c_when_8_1.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_6_209.handleBodyContent(out);
                }
                out = _jettag_c_choose_6_209_saved_out;
                _jettag_c_choose_6_209.doEnd();
                _jettag_c_when_4_1.handleBodyContent(out);
            }
            out = _jettag_c_when_4_1_saved_out;
            _jettag_c_when_4_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_12_1.setRuntimeParent(_jettag_c_choose_2_7);
            _jettag_c_when_12_1.setTagInfo(_td_c_when_12_1);
            _jettag_c_when_12_1.doStart(context, out);
            JET2Writer _jettag_c_when_12_1_saved_out = out;
            while (_jettag_c_when_12_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("set --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_13_17 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_13_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_13_17.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_en_getRoo_13_17.setTagInfo(_td_en_getRoo_13_17);
                _jettag_en_getRoo_13_17.doStart(context, out);
                _jettag_en_getRoo_13_17.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_setVariable_13_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_81); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_13_81.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_setVariable_13_81.setTagInfo(_td_c_setVariable_13_81);
                _jettag_c_setVariable_13_81.doStart(context, out);
                _jettag_c_setVariable_13_81.doEnd();
                out.write("~.server.domain.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_14_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_64); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_14_64.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_include_14_64.setTagInfo(_td_c_include_14_64);
                _jettag_c_include_14_64.doStart(context, out);
                _jettag_c_include_14_64.doEnd();
                out.write(".");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_14_138 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_14_138); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_14_138.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_en_getRoo_14_138.setTagInfo(_td_en_getRoo_14_138);
                _jettag_en_getRoo_14_138.doStart(context, out);
                _jettag_en_getRoo_14_138.doEnd();
                RuntimeTagElement _jettag_c_choose_14_209 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_14_209); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_14_209.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_choose_14_209.setTagInfo(_td_c_choose_14_209);
                _jettag_c_choose_14_209.doStart(context, out);
                JET2Writer _jettag_c_choose_14_209_saved_out = out;
                while (_jettag_c_choose_14_209.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_15_1.setRuntimeParent(_jettag_c_choose_14_209);
                    _jettag_c_when_15_1.setTagInfo(_td_c_when_15_1);
                    _jettag_c_when_15_1.doStart(context, out);
                    JET2Writer _jettag_c_when_15_1_saved_out = out;
                    while (_jettag_c_when_15_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality MANY_TO_MANY");  //$NON-NLS-1$        
                        _jettag_c_when_15_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_15_1_saved_out;
                    _jettag_c_when_15_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_16_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_16_1.setRuntimeParent(_jettag_c_choose_14_209);
                    _jettag_c_when_16_1.setTagInfo(_td_c_when_16_1);
                    _jettag_c_when_16_1.doStart(context, out);
                    JET2Writer _jettag_c_when_16_1_saved_out = out;
                    while (_jettag_c_when_16_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --cardinality ONE_TO_MANY");  //$NON-NLS-1$        
                        _jettag_c_when_16_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_16_1_saved_out;
                    _jettag_c_when_16_1.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_14_209.handleBodyContent(out);
                }
                out = _jettag_c_choose_14_209_saved_out;
                _jettag_c_choose_14_209.doEnd();
                RuntimeTagElement _jettag_c_if_17_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_12.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_if_17_12.setTagInfo(_td_c_if_17_12);
                _jettag_c_if_17_12.doStart(context, out);
                while (_jettag_c_if_17_12.okToProcessBody()) {
                    out.write(" --mappedBy ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_en_getRoo_18_82 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_18_82); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_en_getRoo_18_82.setRuntimeParent(_jettag_c_if_17_12);
                    _jettag_en_getRoo_18_82.setTagInfo(_td_en_getRoo_18_82);
                    _jettag_en_getRoo_18_82.doStart(context, out);
                    _jettag_en_getRoo_18_82.doEnd();
                    _jettag_c_if_17_12.handleBodyContent(out);
                }
                _jettag_c_if_17_12.doEnd();
                RuntimeTagElement _jettag_c_if_18_155 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_18_155); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_18_155.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_if_18_155.setTagInfo(_td_c_if_18_155);
                _jettag_c_if_18_155.doStart(context, out);
                while (_jettag_c_if_18_155.okToProcessBody()) {
                    out.write(" --sizeMin ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_19_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_48); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_19_48.setRuntimeParent(_jettag_c_if_18_155);
                    _jettag_c_get_19_48.setTagInfo(_td_c_get_19_48);
                    _jettag_c_get_19_48.doStart(context, out);
                    _jettag_c_get_19_48.doEnd();
                    _jettag_c_if_18_155.handleBodyContent(out);
                }
                _jettag_c_if_18_155.doEnd();
                RuntimeTagElement _jettag_c_if_19_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_19_96); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_19_96.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_if_19_96.setTagInfo(_td_c_if_19_96);
                _jettag_c_if_19_96.doStart(context, out);
                while (_jettag_c_if_19_96.okToProcessBody()) {
                    out.write(" --sizeMax ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_20_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_49); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_20_49.setRuntimeParent(_jettag_c_if_19_96);
                    _jettag_c_get_20_49.setTagInfo(_td_c_get_20_49);
                    _jettag_c_get_20_49.doStart(context, out);
                    _jettag_c_get_20_49.doEnd();
                    _jettag_c_if_19_96.handleBodyContent(out);
                }
                _jettag_c_if_19_96.doEnd();
                _jettag_c_when_12_1.handleBodyContent(out);
            }
            out = _jettag_c_when_12_1_saved_out;
            _jettag_c_when_12_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            _jettag_c_choose_2_7.handleBodyContent(out);
        }
        out = _jettag_c_choose_2_7_saved_out;
        _jettag_c_choose_2_7.doEnd();
        RuntimeTagElement _jettag_c_if_22_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_22_12.setRuntimeParent(null);
        _jettag_c_if_22_12.setTagInfo(_td_c_if_22_12);
        _jettag_c_if_22_12.doStart(context, out);
        while (_jettag_c_if_22_12.okToProcessBody()) {
            out.write(" --notNull");  //$NON-NLS-1$        
            _jettag_c_if_22_12.handleBodyContent(out);
        }
        _jettag_c_if_22_12.doEnd();
        RuntimeTagElement _jettag_c_if_23_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_23_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_23_91.setRuntimeParent(null);
        _jettag_c_if_23_91.setTagInfo(_td_c_if_23_91);
        _jettag_c_if_23_91.doStart(context, out);
        while (_jettag_c_if_23_91.okToProcessBody()) {
            out.write(" --nullRequired");  //$NON-NLS-1$        
            _jettag_c_if_23_91.handleBodyContent(out);
        }
        _jettag_c_if_23_91.doEnd();
        RuntimeTagElement _jettag_c_setVariable_24_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_24_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_24_59.setRuntimeParent(null);
        _jettag_c_setVariable_24_59.setTagInfo(_td_c_setVariable_24_59);
        _jettag_c_setVariable_24_59.doStart(context, out);
        _jettag_c_setVariable_24_59.doEnd();
        out.write(" --class ~.server.domain.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_25_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_67); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_25_67.setRuntimeParent(null);
        _jettag_c_include_25_67.setTagInfo(_td_c_include_25_67);
        _jettag_c_include_25_67.doStart(context, out);
        _jettag_c_include_25_67.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_en_getRoo_25_141 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_25_141); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_en_getRoo_25_141.setRuntimeParent(null);
        _jettag_en_getRoo_25_141.setTagInfo(_td_en_getRoo_25_141);
        _jettag_en_getRoo_25_141.doStart(context, out);
        _jettag_en_getRoo_25_141.doEnd();
        RuntimeTagElement _jettag_c_setVariable_25_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_25_193); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_25_193.setRuntimeParent(null);
        _jettag_c_setVariable_25_193.setTagInfo(_td_c_setVariable_25_193);
        _jettag_c_setVariable_25_193.doStart(context, out);
        _jettag_c_setVariable_25_193.doEnd();
        RuntimeTagElement _jettag_c_include_26_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_26_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_26_41.setRuntimeParent(null);
        _jettag_c_include_26_41.setTagInfo(_td_c_include_26_41);
        _jettag_c_include_26_41.doStart(context, out);
        _jettag_c_include_26_41.doEnd();
        out.write(NL);         
    }
}
