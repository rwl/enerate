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
                "count($eClass/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_93 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 93,
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
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_9_8 = new TagInfo("java:import", //$NON-NLS-1$
            9, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_21 = new TagInfo("c:get", //$NON-NLS-1$
            9, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_9_59 = new TagInfo("c:choose", //$NON-NLS-1$
            9, 59,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_9_69 = new TagInfo("c:when", //$NON-NLS-1$
            9, 69,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($type='boolean') or ($type='java.lang.Boolean')", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_10_69 = new TagInfo("c:otherwise", //$NON-NLS-1$
            10, 69,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_10_110 = new TagInfo("c:get", //$NON-NLS-1$
            10, 110,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_9 = new TagInfo("c:get", //$NON-NLS-1$
            12, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_34 = new TagInfo("c:get", //$NON-NLS-1$
            16, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_47 = new TagInfo("c:get", //$NON-NLS-1$
            18, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_16 = new TagInfo("c:get", //$NON-NLS-1$
            20, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eAttribute/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_20_68 = new TagInfo("java:import", //$NON-NLS-1$
            20, 68,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_20_81 = new TagInfo("c:get", //$NON-NLS-1$
            20, 81,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$type", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_2 = new TagInfo("c:get", //$NON-NLS-1$
            21, 2,
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
            RuntimeTagElement _jettag_c_setVariable_3_93 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_93); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_93.setRuntimeParent(_jettag_c_if_2_93);
            _jettag_c_setVariable_3_93.setTagInfo(_td_c_setVariable_3_93);
            _jettag_c_setVariable_3_93.doStart(context, out);
            _jettag_c_setVariable_3_93.doEnd();
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
        RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_8_1.setRuntimeParent(null);
        _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
        _jettag_c_setVariable_8_1.doStart(context, out);
        _jettag_c_setVariable_8_1.doEnd();
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_9_8 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_9_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_9_8.setRuntimeParent(null);
        _jettag_java_import_9_8.setTagInfo(_td_java_import_9_8);
        _jettag_java_import_9_8.doStart(context, out);
        JET2Writer _jettag_java_import_9_8_saved_out = out;
        while (_jettag_java_import_9_8.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_9_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_21); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_21.setRuntimeParent(_jettag_java_import_9_8);
            _jettag_c_get_9_21.setTagInfo(_td_c_get_9_21);
            _jettag_c_get_9_21.doStart(context, out);
            _jettag_c_get_9_21.doEnd();
            _jettag_java_import_9_8.handleBodyContent(out);
        }
        out = _jettag_java_import_9_8_saved_out;
        _jettag_java_import_9_8.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_choose_9_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_9_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_9_59.setRuntimeParent(null);
        _jettag_c_choose_9_59.setTagInfo(_td_c_choose_9_59);
        _jettag_c_choose_9_59.doStart(context, out);
        JET2Writer _jettag_c_choose_9_59_saved_out = out;
        while (_jettag_c_choose_9_59.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_9_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_9_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_9_69.setRuntimeParent(_jettag_c_choose_9_59);
            _jettag_c_when_9_69.setTagInfo(_td_c_when_9_69);
            _jettag_c_when_9_69.doStart(context, out);
            JET2Writer _jettag_c_when_9_69_saved_out = out;
            while (_jettag_c_when_9_69.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("is");  //$NON-NLS-1$        
                _jettag_c_when_9_69.handleBodyContent(out);
            }
            out = _jettag_c_when_9_69_saved_out;
            _jettag_c_when_9_69.doEnd();
            RuntimeTagElement _jettag_c_otherwise_10_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_10_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_10_69.setRuntimeParent(_jettag_c_choose_9_59);
            _jettag_c_otherwise_10_69.setTagInfo(_td_c_otherwise_10_69);
            _jettag_c_otherwise_10_69.doStart(context, out);
            JET2Writer _jettag_c_otherwise_10_69_saved_out = out;
            while (_jettag_c_otherwise_10_69.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("get");  //$NON-NLS-1$        
                _jettag_c_otherwise_10_69.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_10_69_saved_out;
            _jettag_c_otherwise_10_69.doEnd();
            _jettag_c_choose_9_59.handleBodyContent(out);
        }
        out = _jettag_c_choose_9_59_saved_out;
        _jettag_c_choose_9_59.doEnd();
        RuntimeTagElement _jettag_c_get_10_110 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_110); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_110.setRuntimeParent(null);
        _jettag_c_get_10_110.setTagInfo(_td_c_get_10_110);
        _jettag_c_get_10_110.doStart(context, out);
        _jettag_c_get_10_110.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\treturn ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_9.setRuntimeParent(null);
        _jettag_c_get_12_9.setTagInfo(_td_c_get_12_9);
        _jettag_c_get_12_9.doStart(context, out);
        _jettag_c_get_12_9.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Sets the value of the '<b><em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_16_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_16_34.setRuntimeParent(null);
        _jettag_c_get_16_34.setTagInfo(_td_c_get_16_34);
        _jettag_c_get_16_34.doStart(context, out);
        _jettag_c_get_16_34.doEnd();
        out.write("</b></em>' attribute.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * @param value the new the value of the '<em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_18_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_18_47.setRuntimeParent(null);
        _jettag_c_get_18_47.setTagInfo(_td_c_get_18_47);
        _jettag_c_get_18_47.doStart(context, out);
        _jettag_c_get_18_47.doEnd();
        out.write("</em>' attribute.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public void set");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_16.setRuntimeParent(null);
        _jettag_c_get_20_16.setTagInfo(_td_c_get_20_16);
        _jettag_c_get_20_16.doStart(context, out);
        _jettag_c_get_20_16.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_20_68 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_20_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_20_68.setRuntimeParent(null);
        _jettag_java_import_20_68.setTagInfo(_td_java_import_20_68);
        _jettag_java_import_20_68.doStart(context, out);
        JET2Writer _jettag_java_import_20_68_saved_out = out;
        while (_jettag_java_import_20_68.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_get_20_81 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_81); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_20_81.setRuntimeParent(_jettag_java_import_20_68);
            _jettag_c_get_20_81.setTagInfo(_td_c_get_20_81);
            _jettag_c_get_20_81.doStart(context, out);
            _jettag_c_get_20_81.doEnd();
            _jettag_java_import_20_68.handleBodyContent(out);
        }
        out = _jettag_java_import_20_68_saved_out;
        _jettag_java_import_20_68.doEnd();
        out.write(" value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_2.setRuntimeParent(null);
        _jettag_c_get_21_2.setTagInfo(_td_c_get_21_2);
        _jettag_c_get_21_2.doStart(context, out);
        _jettag_c_get_21_2.doEnd();
        out.write(" = value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
