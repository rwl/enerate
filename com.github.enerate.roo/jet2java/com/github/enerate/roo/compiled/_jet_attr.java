package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attr implements JET2Template {
    private static final String _jetns_en = "com.github.enerate.tag.tagLibrary"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attr() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_2_7 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 7,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_2_96 = new TagInfo("c:choose", //$NON-NLS-1$
            2, 96,
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
                "($type='boolean') or ($type='java.lang.Boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_5_21 = new TagInfo("en:getRoo", //$NON-NLS-1$
            5, 21,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
                "ignoreCase", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_96 = new TagInfo("c:if", //$NON-NLS-1$
            5, 96,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_51 = new TagInfo("c:get", //$NON-NLS-1$
            6, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_8_1 = new TagInfo("c:when", //$NON-NLS-1$
            8, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='java.lang.String') or ($type='char') or ($type='java.lang.Character')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_9_20 = new TagInfo("en:getRoo", //$NON-NLS-1$
            9, 20,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
                "ignoreCase", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_95 = new TagInfo("c:if", //$NON-NLS-1$
            9, 95,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_51 = new TagInfo("c:get", //$NON-NLS-1$
            10, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_12_1 = new TagInfo("c:when", //$NON-NLS-1$
            12, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='float') or ($type='java.lang.Float') or ($type='double') or ($type='java.lang.Double') or ($type='int') or ($type='java.lang.Integer') or ($type='short') or ($type='java.lang.Short') or ($type='long') or ($type='java.lang.Long')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_13_20 = new TagInfo("en:getRoo", //$NON-NLS-1$
            13, 20,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
                "ignoreCase", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_95 = new TagInfo("c:if", //$NON-NLS-1$
            13, 95,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_51 = new TagInfo("c:get", //$NON-NLS-1$
            14, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_14_108 = new TagInfo("c:choose", //$NON-NLS-1$
            14, 108,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_16_1 = new TagInfo("c:when", //$NON-NLS-1$
            16, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='float') or ($type='java.lang.Float')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_17_1 = new TagInfo("c:when", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='double') or ($type='java.lang.Double')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_18_1 = new TagInfo("c:when", //$NON-NLS-1$
            18, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='int') or ($type='java.lang.Integer')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_19_1 = new TagInfo("c:when", //$NON-NLS-1$
            19, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='short') or ($type='java.lang.Short')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_20_1 = new TagInfo("c:when", //$NON-NLS-1$
            20, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='long') or ($type='java.lang.Long')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_21_12 = new TagInfo("c:if", //$NON-NLS-1$
            21, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@iD = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_24_1 = new TagInfo("c:when", //$NON-NLS-1$
            24, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$type='java.util.Date'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_25_18 = new TagInfo("en:getRoo", //$NON-NLS-1$
            25, 18,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
                "ignoreCase", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_101 = new TagInfo("c:get", //$NON-NLS-1$
            25, 101,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_25_124 = new TagInfo("c:if", //$NON-NLS-1$
            25, 124,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_26_51 = new TagInfo("c:get", //$NON-NLS-1$
            26, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_28_1 = new TagInfo("c:when", //$NON-NLS-1$
            28, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/eLiterals", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_29_18 = new TagInfo("en:getRoo", //$NON-NLS-1$
            29, 18,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
                "ignoreCase", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_29_117 = new TagInfo("en:getRoo", //$NON-NLS-1$
            29, 117,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@name", //$NON-NLS-1$
                "sql", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_31_1 = new TagInfo("c:when", //$NON-NLS-1$
            31, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@upperBound > 1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_32_17 = new TagInfo("en:getRoo", //$NON-NLS-1$
            32, 17,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
                "ignoreCase", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_103 = new TagInfo("c:get", //$NON-NLS-1$
            32, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_32_136 = new TagInfo("c:get", //$NON-NLS-1$
            32, 136,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/lowerBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_33_46 = new TagInfo("c:get", //$NON-NLS-1$
            33, 46,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/upperBound", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_35_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            35, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_en_getRoo_36_19 = new TagInfo("en:getRoo", //$NON-NLS-1$
            36, 19,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
                "ignoreCase", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
                "sql,java", //$NON-NLS-1$
                "false", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_36_102 = new TagInfo("c:get", //$NON-NLS-1$
            36, 102,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_36_125 = new TagInfo("c:if", //$NON-NLS-1$
            36, 125,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_37_51 = new TagInfo("c:get", //$NON-NLS-1$
            37, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@defaultValueLiteral", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_39_12 = new TagInfo("c:if", //$NON-NLS-1$
            39, 12,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@transient = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_40_60 = new TagInfo("c:if", //$NON-NLS-1$
            40, 60,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@lowerBound = 1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_41_54 = new TagInfo("c:if", //$NON-NLS-1$
            41, 54,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@upperBound = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_59 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 59,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_43_67 = new TagInfo("c:include", //$NON-NLS-1$
            43, 67,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_43_141 = new TagInfo("en:getRoo", //$NON-NLS-1$
            43, 141,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
                "sql,test", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_43_193 = new TagInfo("c:setVariable", //$NON-NLS-1$
            43, 193,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_44_41 = new TagInfo("c:include", //$NON-NLS-1$
            44, 41,
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
        RuntimeTagElement _jettag_c_setVariable_2_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_2_7.setRuntimeParent(null);
        _jettag_c_setVariable_2_7.setTagInfo(_td_c_setVariable_2_7);
        _jettag_c_setVariable_2_7.doStart(context, out);
        _jettag_c_setVariable_2_7.doEnd();
        RuntimeTagElement _jettag_c_choose_2_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_2_96); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_2_96.setRuntimeParent(null);
        _jettag_c_choose_2_96.setTagInfo(_td_c_choose_2_96);
        _jettag_c_choose_2_96.doStart(context, out);
        JET2Writer _jettag_c_choose_2_96_saved_out = out;
        while (_jettag_c_choose_2_96.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_4_1.setRuntimeParent(_jettag_c_choose_2_96);
            _jettag_c_when_4_1.setTagInfo(_td_c_when_4_1);
            _jettag_c_when_4_1.doStart(context, out);
            JET2Writer _jettag_c_when_4_1_saved_out = out;
            while (_jettag_c_when_4_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("boolean --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_5_21 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_5_21); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_5_21.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_en_getRoo_5_21.setTagInfo(_td_en_getRoo_5_21);
                _jettag_en_getRoo_5_21.doStart(context, out);
                _jettag_en_getRoo_5_21.doEnd();
                RuntimeTagElement _jettag_c_if_5_96 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_96); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_5_96.setRuntimeParent(_jettag_c_when_4_1);
                _jettag_c_if_5_96.setTagInfo(_td_c_if_5_96);
                _jettag_c_if_5_96.doStart(context, out);
                while (_jettag_c_if_5_96.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_6_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_51.setRuntimeParent(_jettag_c_if_5_96);
                    _jettag_c_get_6_51.setTagInfo(_td_c_get_6_51);
                    _jettag_c_get_6_51.doStart(context, out);
                    _jettag_c_get_6_51.doEnd();
                    _jettag_c_if_5_96.handleBodyContent(out);
                }
                _jettag_c_if_5_96.doEnd();
                _jettag_c_when_4_1.handleBodyContent(out);
            }
            out = _jettag_c_when_4_1_saved_out;
            _jettag_c_when_4_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_8_1.setRuntimeParent(_jettag_c_choose_2_96);
            _jettag_c_when_8_1.setTagInfo(_td_c_when_8_1);
            _jettag_c_when_8_1.doStart(context, out);
            JET2Writer _jettag_c_when_8_1_saved_out = out;
            while (_jettag_c_when_8_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("string --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_9_20 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_9_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_9_20.setRuntimeParent(_jettag_c_when_8_1);
                _jettag_en_getRoo_9_20.setTagInfo(_td_en_getRoo_9_20);
                _jettag_en_getRoo_9_20.doStart(context, out);
                _jettag_en_getRoo_9_20.doEnd();
                RuntimeTagElement _jettag_c_if_9_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_9_95.setRuntimeParent(_jettag_c_when_8_1);
                _jettag_c_if_9_95.setTagInfo(_td_c_if_9_95);
                _jettag_c_if_9_95.doStart(context, out);
                while (_jettag_c_if_9_95.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_10_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_10_51.setRuntimeParent(_jettag_c_if_9_95);
                    _jettag_c_get_10_51.setTagInfo(_td_c_get_10_51);
                    _jettag_c_get_10_51.doStart(context, out);
                    _jettag_c_get_10_51.doEnd();
                    _jettag_c_if_9_95.handleBodyContent(out);
                }
                _jettag_c_if_9_95.doEnd();
                _jettag_c_when_8_1.handleBodyContent(out);
            }
            out = _jettag_c_when_8_1_saved_out;
            _jettag_c_when_8_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_12_1.setRuntimeParent(_jettag_c_choose_2_96);
            _jettag_c_when_12_1.setTagInfo(_td_c_when_12_1);
            _jettag_c_when_12_1.doStart(context, out);
            JET2Writer _jettag_c_when_12_1_saved_out = out;
            while (_jettag_c_when_12_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("number --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_13_20 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_13_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_13_20.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_en_getRoo_13_20.setTagInfo(_td_en_getRoo_13_20);
                _jettag_en_getRoo_13_20.doStart(context, out);
                _jettag_en_getRoo_13_20.doEnd();
                RuntimeTagElement _jettag_c_if_13_95 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_95); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_95.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_if_13_95.setTagInfo(_td_c_if_13_95);
                _jettag_c_if_13_95.doStart(context, out);
                while (_jettag_c_if_13_95.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_14_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_14_51.setRuntimeParent(_jettag_c_if_13_95);
                    _jettag_c_get_14_51.setTagInfo(_td_c_get_14_51);
                    _jettag_c_get_14_51.doStart(context, out);
                    _jettag_c_get_14_51.doEnd();
                    _jettag_c_if_13_95.handleBodyContent(out);
                }
                _jettag_c_if_13_95.doEnd();
                RuntimeTagElement _jettag_c_choose_14_108 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_14_108); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_14_108.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_choose_14_108.setTagInfo(_td_c_choose_14_108);
                _jettag_c_choose_14_108.doStart(context, out);
                JET2Writer _jettag_c_choose_14_108_saved_out = out;
                while (_jettag_c_choose_14_108.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    // GWT does not currently support primitive types in an entity. 
                    RuntimeTagElement _jettag_c_when_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_16_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_16_1.setRuntimeParent(_jettag_c_choose_14_108);
                    _jettag_c_when_16_1.setTagInfo(_td_c_when_16_1);
                    _jettag_c_when_16_1.doStart(context, out);
                    JET2Writer _jettag_c_when_16_1_saved_out = out;
                    while (_jettag_c_when_16_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Float");  //$NON-NLS-1$        
                        _jettag_c_when_16_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_16_1_saved_out;
                    _jettag_c_when_16_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_17_1.setRuntimeParent(_jettag_c_choose_14_108);
                    _jettag_c_when_17_1.setTagInfo(_td_c_when_17_1);
                    _jettag_c_when_17_1.doStart(context, out);
                    JET2Writer _jettag_c_when_17_1_saved_out = out;
                    while (_jettag_c_when_17_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Double");  //$NON-NLS-1$        
                        _jettag_c_when_17_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_17_1_saved_out;
                    _jettag_c_when_17_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_18_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_18_1.setRuntimeParent(_jettag_c_choose_14_108);
                    _jettag_c_when_18_1.setTagInfo(_td_c_when_18_1);
                    _jettag_c_when_18_1.doStart(context, out);
                    JET2Writer _jettag_c_when_18_1_saved_out = out;
                    while (_jettag_c_when_18_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Integer");  //$NON-NLS-1$        
                        _jettag_c_when_18_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_18_1_saved_out;
                    _jettag_c_when_18_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_19_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_19_1.setRuntimeParent(_jettag_c_choose_14_108);
                    _jettag_c_when_19_1.setTagInfo(_td_c_when_19_1);
                    _jettag_c_when_19_1.doStart(context, out);
                    JET2Writer _jettag_c_when_19_1_saved_out = out;
                    while (_jettag_c_when_19_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Short");  //$NON-NLS-1$        
                        _jettag_c_when_19_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_19_1_saved_out;
                    _jettag_c_when_19_1.doEnd();
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_when_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_20_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_20_1.setRuntimeParent(_jettag_c_choose_14_108);
                    _jettag_c_when_20_1.setTagInfo(_td_c_when_20_1);
                    _jettag_c_when_20_1.doStart(context, out);
                    JET2Writer _jettag_c_when_20_1_saved_out = out;
                    while (_jettag_c_when_20_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write(" --type java.lang.Long");  //$NON-NLS-1$        
                        _jettag_c_when_20_1.handleBodyContent(out);
                    }
                    out = _jettag_c_when_20_1_saved_out;
                    _jettag_c_when_20_1.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_14_108.handleBodyContent(out);
                }
                out = _jettag_c_choose_14_108_saved_out;
                _jettag_c_choose_14_108.doEnd();
                RuntimeTagElement _jettag_c_if_21_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_21_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_21_12.setRuntimeParent(_jettag_c_when_12_1);
                _jettag_c_if_21_12.setTagInfo(_td_c_if_21_12);
                _jettag_c_if_21_12.doStart(context, out);
                while (_jettag_c_if_21_12.okToProcessBody()) {
                    out.write(" --unique");  //$NON-NLS-1$        
                    _jettag_c_if_21_12.handleBodyContent(out);
                }
                _jettag_c_if_21_12.doEnd();
                _jettag_c_when_12_1.handleBodyContent(out);
            }
            out = _jettag_c_when_12_1_saved_out;
            _jettag_c_when_12_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_24_1.setRuntimeParent(_jettag_c_choose_2_96);
            _jettag_c_when_24_1.setTagInfo(_td_c_when_24_1);
            _jettag_c_when_24_1.doStart(context, out);
            JET2Writer _jettag_c_when_24_1_saved_out = out;
            while (_jettag_c_when_24_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("date --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_25_18 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_25_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_25_18.setRuntimeParent(_jettag_c_when_24_1);
                _jettag_en_getRoo_25_18.setTagInfo(_td_en_getRoo_25_18);
                _jettag_en_getRoo_25_18.doStart(context, out);
                _jettag_en_getRoo_25_18.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_25_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_101); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_25_101.setRuntimeParent(_jettag_c_when_24_1);
                _jettag_c_get_25_101.setTagInfo(_td_c_get_25_101);
                _jettag_c_get_25_101.doStart(context, out);
                _jettag_c_get_25_101.doEnd();
                RuntimeTagElement _jettag_c_if_25_124 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_25_124); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_25_124.setRuntimeParent(_jettag_c_when_24_1);
                _jettag_c_if_25_124.setTagInfo(_td_c_if_25_124);
                _jettag_c_if_25_124.doStart(context, out);
                while (_jettag_c_if_25_124.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_26_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_26_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_26_51.setRuntimeParent(_jettag_c_if_25_124);
                    _jettag_c_get_26_51.setTagInfo(_td_c_get_26_51);
                    _jettag_c_get_26_51.doStart(context, out);
                    _jettag_c_get_26_51.doEnd();
                    _jettag_c_if_25_124.handleBodyContent(out);
                }
                _jettag_c_if_25_124.doEnd();
                _jettag_c_when_24_1.handleBodyContent(out);
            }
            out = _jettag_c_when_24_1_saved_out;
            _jettag_c_when_24_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_28_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_28_1.setRuntimeParent(_jettag_c_choose_2_96);
            _jettag_c_when_28_1.setTagInfo(_td_c_when_28_1);
            _jettag_c_when_28_1.doStart(context, out);
            JET2Writer _jettag_c_when_28_1_saved_out = out;
            while (_jettag_c_when_28_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("enum --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_29_18 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_29_18); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_29_18.setRuntimeParent(_jettag_c_when_28_1);
                _jettag_en_getRoo_29_18.setTagInfo(_td_en_getRoo_29_18);
                _jettag_en_getRoo_29_18.doStart(context, out);
                _jettag_en_getRoo_29_18.doEnd();
                out.write(" --type ~.client.shared.");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_29_117 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_29_117); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_29_117.setRuntimeParent(_jettag_c_when_28_1);
                _jettag_en_getRoo_29_117.setTagInfo(_td_en_getRoo_29_117);
                _jettag_en_getRoo_29_117.doStart(context, out);
                _jettag_en_getRoo_29_117.doEnd();
                _jettag_c_when_28_1.handleBodyContent(out);
            }
            out = _jettag_c_when_28_1_saved_out;
            _jettag_c_when_28_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_when_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_31_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_31_1.setRuntimeParent(_jettag_c_choose_2_96);
            _jettag_c_when_31_1.setTagInfo(_td_c_when_31_1);
            _jettag_c_when_31_1.doStart(context, out);
            JET2Writer _jettag_c_when_31_1_saved_out = out;
            while (_jettag_c_when_31_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("set --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_32_17 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_32_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_32_17.setRuntimeParent(_jettag_c_when_31_1);
                _jettag_en_getRoo_32_17.setTagInfo(_td_en_getRoo_32_17);
                _jettag_en_getRoo_32_17.doStart(context, out);
                _jettag_en_getRoo_32_17.doEnd();
                out.write(" --element ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_103.setRuntimeParent(_jettag_c_when_31_1);
                _jettag_c_get_32_103.setTagInfo(_td_c_get_32_103);
                _jettag_c_get_32_103.doStart(context, out);
                _jettag_c_get_32_103.doEnd();
                out.write(" --sizeMin ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_32_136 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_32_136); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_32_136.setRuntimeParent(_jettag_c_when_31_1);
                _jettag_c_get_32_136.setTagInfo(_td_c_get_32_136);
                _jettag_c_get_32_136.doStart(context, out);
                _jettag_c_get_32_136.doEnd();
                out.write(" --sizeMax ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_33_46 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_46); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_33_46.setRuntimeParent(_jettag_c_when_31_1);
                _jettag_c_get_33_46.setTagInfo(_td_c_get_33_46);
                _jettag_c_get_33_46.doStart(context, out);
                _jettag_c_get_33_46.doEnd();
                _jettag_c_when_31_1.handleBodyContent(out);
            }
            out = _jettag_c_when_31_1_saved_out;
            _jettag_c_when_31_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            RuntimeTagElement _jettag_c_otherwise_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_35_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_35_1.setRuntimeParent(_jettag_c_choose_2_96);
            _jettag_c_otherwise_35_1.setTagInfo(_td_c_otherwise_35_1);
            _jettag_c_otherwise_35_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_35_1_saved_out = out;
            while (_jettag_c_otherwise_35_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("other --fieldName ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_en_getRoo_36_19 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_36_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_en_getRoo_36_19.setRuntimeParent(_jettag_c_otherwise_35_1);
                _jettag_en_getRoo_36_19.setTagInfo(_td_en_getRoo_36_19);
                _jettag_en_getRoo_36_19.doStart(context, out);
                _jettag_en_getRoo_36_19.doEnd();
                out.write(" --type ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_36_102 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_36_102); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_36_102.setRuntimeParent(_jettag_c_otherwise_35_1);
                _jettag_c_get_36_102.setTagInfo(_td_c_get_36_102);
                _jettag_c_get_36_102.doStart(context, out);
                _jettag_c_get_36_102.doEnd();
                RuntimeTagElement _jettag_c_if_36_125 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_36_125); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_36_125.setRuntimeParent(_jettag_c_otherwise_35_1);
                _jettag_c_if_36_125.setTagInfo(_td_c_if_36_125);
                _jettag_c_if_36_125.doStart(context, out);
                while (_jettag_c_if_36_125.okToProcessBody()) {
                    out.write(" --value ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_37_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_37_51); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_37_51.setRuntimeParent(_jettag_c_if_36_125);
                    _jettag_c_get_37_51.setTagInfo(_td_c_get_37_51);
                    _jettag_c_get_37_51.doStart(context, out);
                    _jettag_c_get_37_51.doEnd();
                    _jettag_c_if_36_125.handleBodyContent(out);
                }
                _jettag_c_if_36_125.doEnd();
                _jettag_c_otherwise_35_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_35_1_saved_out;
            _jettag_c_otherwise_35_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            _jettag_c_choose_2_96.handleBodyContent(out);
        }
        out = _jettag_c_choose_2_96_saved_out;
        _jettag_c_choose_2_96.doEnd();
        RuntimeTagElement _jettag_c_if_39_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_39_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_39_12.setRuntimeParent(null);
        _jettag_c_if_39_12.setTagInfo(_td_c_if_39_12);
        _jettag_c_if_39_12.doStart(context, out);
        while (_jettag_c_if_39_12.okToProcessBody()) {
            out.write(" --transient");  //$NON-NLS-1$        
            _jettag_c_if_39_12.handleBodyContent(out);
        }
        _jettag_c_if_39_12.doEnd();
        RuntimeTagElement _jettag_c_if_40_60 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_40_60); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_40_60.setRuntimeParent(null);
        _jettag_c_if_40_60.setTagInfo(_td_c_if_40_60);
        _jettag_c_if_40_60.doStart(context, out);
        while (_jettag_c_if_40_60.okToProcessBody()) {
            out.write(" --notNull");  //$NON-NLS-1$        
            _jettag_c_if_40_60.handleBodyContent(out);
        }
        _jettag_c_if_40_60.doEnd();
        RuntimeTagElement _jettag_c_if_41_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_41_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_41_54.setRuntimeParent(null);
        _jettag_c_if_41_54.setTagInfo(_td_c_if_41_54);
        _jettag_c_if_41_54.doStart(context, out);
        while (_jettag_c_if_41_54.okToProcessBody()) {
            out.write(" --nullRequired");  //$NON-NLS-1$        
            _jettag_c_if_41_54.handleBodyContent(out);
        }
        _jettag_c_if_41_54.doEnd();
        RuntimeTagElement _jettag_c_setVariable_42_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_42_59.setRuntimeParent(null);
        _jettag_c_setVariable_42_59.setTagInfo(_td_c_setVariable_42_59);
        _jettag_c_setVariable_42_59.doStart(context, out);
        _jettag_c_setVariable_42_59.doEnd();
        out.write(" --class ~.server.domain.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_43_67 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_43_67); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_43_67.setRuntimeParent(null);
        _jettag_c_include_43_67.setTagInfo(_td_c_include_43_67);
        _jettag_c_include_43_67.doStart(context, out);
        _jettag_c_include_43_67.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_en_getRoo_43_141 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_43_141); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_en_getRoo_43_141.setRuntimeParent(null);
        _jettag_en_getRoo_43_141.setTagInfo(_td_en_getRoo_43_141);
        _jettag_en_getRoo_43_141.doStart(context, out);
        _jettag_en_getRoo_43_141.doEnd();
        RuntimeTagElement _jettag_c_setVariable_43_193 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_43_193); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_43_193.setRuntimeParent(null);
        _jettag_c_setVariable_43_193.setTagInfo(_td_c_setVariable_43_193);
        _jettag_c_setVariable_43_193.doStart(context, out);
        _jettag_c_setVariable_43_193.doEnd();
        RuntimeTagElement _jettag_c_include_44_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_44_41); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_44_41.setRuntimeParent(null);
        _jettag_c_include_44_41.setTagInfo(_td_c_include_44_41);
        _jettag_c_include_44_41.doStart(context, out);
        _jettag_c_include_44_41.doEnd();
        out.write(NL);         
    }
}
