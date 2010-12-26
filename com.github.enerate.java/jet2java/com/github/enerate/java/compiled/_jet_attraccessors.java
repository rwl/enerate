package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attraccessors implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_attraccessors() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_37 = new TagInfo("c:get", //$NON-NLS-1$
            2, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_2_93 = new TagInfo("c:if", //$NON-NLS-1$
            2, 93,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_97 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 97,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_format_4_4 = new TagInfo("java:format", //$NON-NLS-1$
            4, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_4_17 = new TagInfo("c:include", //$NON-NLS-1$
            4, 17,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_34 = new TagInfo("c:get", //$NON-NLS-1$
            6, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_8_1 = new TagInfo("c:choose", //$NON-NLS-1$
            8, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_9_1 = new TagInfo("c:when", //$NON-NLS-1$
            9, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_12_1 = new TagInfo("c:otherwise", //$NON-NLS-1$
            12, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_13_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@fullyQualifiedName)", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_16_8 = new TagInfo("java:import", //$NON-NLS-1$
            16, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_16_21 = new TagInfo("c:get", //$NON-NLS-1$
            16, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_16_59 = new TagInfo("c:choose", //$NON-NLS-1$
            16, 59,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_16_69 = new TagInfo("c:when", //$NON-NLS-1$
            16, 69,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='boolean') or ($type='java.lang.Boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_17_69 = new TagInfo("c:otherwise", //$NON-NLS-1$
            17, 69,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_17_110 = new TagInfo("c:get", //$NON-NLS-1$
            17, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_14 = new TagInfo("c:get", //$NON-NLS-1$
            19, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_34 = new TagInfo("c:get", //$NON-NLS-1$
            23, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_25_47 = new TagInfo("c:get", //$NON-NLS-1$
            25, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_27_16 = new TagInfo("c:get", //$NON-NLS-1$
            27, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_27_68 = new TagInfo("java:import", //$NON-NLS-1$
            27, 68,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_27_81 = new TagInfo("c:get", //$NON-NLS-1$
            27, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_7 = new TagInfo("c:get", //$NON-NLS-1$
            28, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Returns the value of the '<em><b>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_37); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_37.setRuntimeParent(null);
        _jettag_c_get_2_37.setTagInfo(_td_c_get_2_37);
        _jettag_c_get_2_37.doStart(context, out);
        _jettag_c_get_2_37.doEnd();
        out.write("</b></em>' attribute.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_2_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_93); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_93.setRuntimeParent(null);
        _jettag_c_if_2_93.setTagInfo(_td_c_if_2_93);
        _jettag_c_if_2_93.doStart(context, out);
        while (_jettag_c_if_2_93.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_97.setRuntimeParent(_jettag_c_if_2_93);
            _jettag_c_setVariable_3_97.setTagInfo(_td_c_setVariable_3_97);
            _jettag_c_setVariable_3_97.doStart(context, out);
            _jettag_c_setVariable_3_97.doEnd();
            out.write(" * ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_format_4_4 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_4_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_format_4_4.setRuntimeParent(_jettag_c_if_2_93);
            _jettag_java_format_4_4.setTagInfo(_td_java_format_4_4);
            _jettag_java_format_4_4.doStart(context, out);
            JET2Writer _jettag_java_format_4_4_saved_out = out;
            while (_jettag_java_format_4_4.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_4_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_17); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_4_17.setRuntimeParent(_jettag_java_format_4_4);
                _jettag_c_include_4_17.setTagInfo(_td_c_include_4_17);
                _jettag_c_include_4_17.doStart(context, out);
                _jettag_c_include_4_17.doEnd();
                _jettag_java_format_4_4.handleBodyContent(out);
            }
            out = _jettag_java_format_4_4_saved_out;
            _jettag_java_format_4_4.doEnd();
            _jettag_c_if_2_93.handleBodyContent(out);
        }
        _jettag_c_if_2_93.doEnd();
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * @return the value of the '<em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_34.setRuntimeParent(null);
        _jettag_c_get_6_34.setTagInfo(_td_c_get_6_34);
        _jettag_c_get_6_34.doStart(context, out);
        _jettag_c_get_6_34.doEnd();
        out.write("</em>' attribute.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_8_1.setRuntimeParent(null);
        _jettag_c_choose_8_1.setTagInfo(_td_c_choose_8_1);
        _jettag_c_choose_8_1.doStart(context, out);
        JET2Writer _jettag_c_choose_8_1_saved_out = out;
        while (_jettag_c_choose_8_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_9_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_9_1.setRuntimeParent(_jettag_c_choose_8_1);
            _jettag_c_when_9_1.setTagInfo(_td_c_when_9_1);
            _jettag_c_when_9_1.doStart(context, out);
            JET2Writer _jettag_c_when_9_1_saved_out = out;
            while (_jettag_c_when_9_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                // Enum 
                RuntimeTagElement _jettag_c_setVariable_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_10_1.setRuntimeParent(_jettag_c_when_9_1);
                _jettag_c_setVariable_10_1.setTagInfo(_td_c_setVariable_10_1);
                _jettag_c_setVariable_10_1.doStart(context, out);
                _jettag_c_setVariable_10_1.doEnd();
                _jettag_c_when_9_1.handleBodyContent(out);
            }
            out = _jettag_c_when_9_1_saved_out;
            _jettag_c_when_9_1.doEnd();
            RuntimeTagElement _jettag_c_otherwise_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_12_1.setRuntimeParent(_jettag_c_choose_8_1);
            _jettag_c_otherwise_12_1.setTagInfo(_td_c_otherwise_12_1);
            _jettag_c_otherwise_12_1.doStart(context, out);
            JET2Writer _jettag_c_otherwise_12_1_saved_out = out;
            while (_jettag_c_otherwise_12_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_setVariable_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_13_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_13_1.setRuntimeParent(_jettag_c_otherwise_12_1);
                _jettag_c_setVariable_13_1.setTagInfo(_td_c_setVariable_13_1);
                _jettag_c_setVariable_13_1.doStart(context, out);
                _jettag_c_setVariable_13_1.doEnd();
                _jettag_c_otherwise_12_1.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_12_1_saved_out;
            _jettag_c_otherwise_12_1.doEnd();
            _jettag_c_choose_8_1.handleBodyContent(out);
        }
        out = _jettag_c_choose_8_1_saved_out;
        _jettag_c_choose_8_1.doEnd();
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_16_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_16_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_16_8.setRuntimeParent(null);
        _jettag_java_import_16_8.setTagInfo(_td_java_import_16_8);
        _jettag_java_import_16_8.doStart(context, out);
        JET2Writer _jettag_java_import_16_8_saved_out = out;
        while (_jettag_java_import_16_8.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_16_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_16_21.setRuntimeParent(_jettag_java_import_16_8);
            _jettag_c_get_16_21.setTagInfo(_td_c_get_16_21);
            _jettag_c_get_16_21.doStart(context, out);
            _jettag_c_get_16_21.doEnd();
            _jettag_java_import_16_8.handleBodyContent(out);
        }
        out = _jettag_java_import_16_8_saved_out;
        _jettag_java_import_16_8.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_choose_16_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_16_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_16_59.setRuntimeParent(null);
        _jettag_c_choose_16_59.setTagInfo(_td_c_choose_16_59);
        _jettag_c_choose_16_59.doStart(context, out);
        JET2Writer _jettag_c_choose_16_59_saved_out = out;
        while (_jettag_c_choose_16_59.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_16_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_16_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_16_69.setRuntimeParent(_jettag_c_choose_16_59);
            _jettag_c_when_16_69.setTagInfo(_td_c_when_16_69);
            _jettag_c_when_16_69.doStart(context, out);
            JET2Writer _jettag_c_when_16_69_saved_out = out;
            while (_jettag_c_when_16_69.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("is");  //$NON-NLS-1$        
                _jettag_c_when_16_69.handleBodyContent(out);
            }
            out = _jettag_c_when_16_69_saved_out;
            _jettag_c_when_16_69.doEnd();
            RuntimeTagElement _jettag_c_otherwise_17_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_17_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_17_69.setRuntimeParent(_jettag_c_choose_16_59);
            _jettag_c_otherwise_17_69.setTagInfo(_td_c_otherwise_17_69);
            _jettag_c_otherwise_17_69.doStart(context, out);
            JET2Writer _jettag_c_otherwise_17_69_saved_out = out;
            while (_jettag_c_otherwise_17_69.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("get");  //$NON-NLS-1$        
                _jettag_c_otherwise_17_69.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_17_69_saved_out;
            _jettag_c_otherwise_17_69.doEnd();
            _jettag_c_choose_16_59.handleBodyContent(out);
        }
        out = _jettag_c_choose_16_59_saved_out;
        _jettag_c_choose_16_59.doEnd();
        RuntimeTagElement _jettag_c_get_17_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_110); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_110.setRuntimeParent(null);
        _jettag_c_get_17_110.setTagInfo(_td_c_get_17_110);
        _jettag_c_get_17_110.doStart(context, out);
        _jettag_c_get_17_110.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\treturn this.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_14.setRuntimeParent(null);
        _jettag_c_get_19_14.setTagInfo(_td_c_get_19_14);
        _jettag_c_get_19_14.doStart(context, out);
        _jettag_c_get_19_14.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Sets the value of the '<b><em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_34.setRuntimeParent(null);
        _jettag_c_get_23_34.setTagInfo(_td_c_get_23_34);
        _jettag_c_get_23_34.doStart(context, out);
        _jettag_c_get_23_34.doEnd();
        out.write("</b></em>' attribute.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * @param value the new the value of the '<em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_25_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_25_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_25_47.setRuntimeParent(null);
        _jettag_c_get_25_47.setTagInfo(_td_c_get_25_47);
        _jettag_c_get_25_47.doStart(context, out);
        _jettag_c_get_25_47.doEnd();
        out.write("</em>' attribute.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public void set");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_27_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_27_16.setRuntimeParent(null);
        _jettag_c_get_27_16.setTagInfo(_td_c_get_27_16);
        _jettag_c_get_27_16.doStart(context, out);
        _jettag_c_get_27_16.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_27_68 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_27_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_27_68.setRuntimeParent(null);
        _jettag_java_import_27_68.setTagInfo(_td_java_import_27_68);
        _jettag_java_import_27_68.doStart(context, out);
        JET2Writer _jettag_java_import_27_68_saved_out = out;
        while (_jettag_java_import_27_68.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_27_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_27_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_27_81.setRuntimeParent(_jettag_java_import_27_68);
            _jettag_c_get_27_81.setTagInfo(_td_c_get_27_81);
            _jettag_c_get_27_81.doStart(context, out);
            _jettag_c_get_27_81.doEnd();
            _jettag_java_import_27_68.handleBodyContent(out);
        }
        out = _jettag_java_import_27_68_saved_out;
        _jettag_java_import_27_68.doEnd();
        out.write(" value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tthis.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_28_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_28_7.setRuntimeParent(null);
        _jettag_c_get_28_7.setTagInfo(_td_c_get_28_7);
        _jettag_c_get_28_7.doStart(context, out);
        _jettag_c_get_28_7.doEnd();
        out.write(" = value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
