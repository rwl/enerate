package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_refaccessors implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_refaccessors() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_2_37 = new TagInfo("c:get", //$NON-NLS-1$
            2, 37,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
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
                "$eReference", //$NON-NLS-1$
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
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_8 = new TagInfo("c:if", //$NON-NLS-1$
            8, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_8_48 = new TagInfo("java:import", //$NON-NLS-1$
            8, 48,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_8_90 = new TagInfo("java:import", //$NON-NLS-1$
            8, 90,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_8_103 = new TagInfo("c:get", //$NON-NLS-1$
            8, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_189 = new TagInfo("c:if", //$NON-NLS-1$
            8, 189,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_9_37 = new TagInfo("java:import", //$NON-NLS-1$
            9, 37,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_50 = new TagInfo("c:get", //$NON-NLS-1$
            9, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_139 = new TagInfo("c:get", //$NON-NLS-1$
            9, 139,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_14 = new TagInfo("c:get", //$NON-NLS-1$
            11, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_34 = new TagInfo("c:get", //$NON-NLS-1$
            15, 34,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_47 = new TagInfo("c:get", //$NON-NLS-1$
            17, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_16 = new TagInfo("c:get", //$NON-NLS-1$
            19, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eReference/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_19_68 = new TagInfo("c:if", //$NON-NLS-1$
            19, 68,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_20_36 = new TagInfo("java:import", //$NON-NLS-1$
            20, 36,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_java_import_20_78 = new TagInfo("java:import", //$NON-NLS-1$
            20, 78,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_20_91 = new TagInfo("c:get", //$NON-NLS-1$
            20, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_20_177 = new TagInfo("c:if", //$NON-NLS-1$
            20, 177,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_21_37 = new TagInfo("java:import", //$NON-NLS-1$
            21, 37,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_21_50 = new TagInfo("c:get", //$NON-NLS-1$
            21, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_22_7 = new TagInfo("c:get", //$NON-NLS-1$
            22, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Returns the value of the '<b><em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_37 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_37); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_37.setRuntimeParent(null);
        _jettag_c_get_2_37.setTagInfo(_td_c_get_2_37);
        _jettag_c_get_2_37.doStart(context, out);
        _jettag_c_get_2_37.doEnd();
        out.write("</b></em>' reference.");  //$NON-NLS-1$        
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
        out.write("</em>' reference.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_8_8.setRuntimeParent(null);
        _jettag_c_if_8_8.setTagInfo(_td_c_if_8_8);
        _jettag_c_if_8_8.doStart(context, out);
        while (_jettag_c_if_8_8.okToProcessBody()) {
            RuntimeTagElement _jettag_java_import_8_48 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_48); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_8_48.setRuntimeParent(_jettag_c_if_8_8);
            _jettag_java_import_8_48.setTagInfo(_td_java_import_8_48);
            _jettag_java_import_8_48.doStart(context, out);
            JET2Writer _jettag_java_import_8_48_saved_out = out;
            while (_jettag_java_import_8_48.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("java.util.List");  //$NON-NLS-1$        
                _jettag_java_import_8_48.handleBodyContent(out);
            }
            out = _jettag_java_import_8_48_saved_out;
            _jettag_java_import_8_48.doEnd();
            out.write("<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_8_90 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_8_90); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_8_90.setRuntimeParent(_jettag_c_if_8_8);
            _jettag_java_import_8_90.setTagInfo(_td_java_import_8_90);
            _jettag_java_import_8_90.doStart(context, out);
            JET2Writer _jettag_java_import_8_90_saved_out = out;
            while (_jettag_java_import_8_90.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_8_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_103); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_103.setRuntimeParent(_jettag_java_import_8_90);
                _jettag_c_get_8_103.setTagInfo(_td_c_get_8_103);
                _jettag_c_get_8_103.doStart(context, out);
                _jettag_c_get_8_103.doEnd();
                _jettag_java_import_8_90.handleBodyContent(out);
            }
            out = _jettag_java_import_8_90_saved_out;
            _jettag_java_import_8_90.doEnd();
            out.write(">");  //$NON-NLS-1$        
            _jettag_c_if_8_8.handleBodyContent(out);
        }
        _jettag_c_if_8_8.doEnd();
        RuntimeTagElement _jettag_c_if_8_189 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_189); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_8_189.setRuntimeParent(null);
        _jettag_c_if_8_189.setTagInfo(_td_c_if_8_189);
        _jettag_c_if_8_189.doStart(context, out);
        while (_jettag_c_if_8_189.okToProcessBody()) {
            RuntimeTagElement _jettag_java_import_9_37 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_9_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_9_37.setRuntimeParent(_jettag_c_if_8_189);
            _jettag_java_import_9_37.setTagInfo(_td_java_import_9_37);
            _jettag_java_import_9_37.doStart(context, out);
            JET2Writer _jettag_java_import_9_37_saved_out = out;
            while (_jettag_java_import_9_37.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_9_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_50.setRuntimeParent(_jettag_java_import_9_37);
                _jettag_c_get_9_50.setTagInfo(_td_c_get_9_50);
                _jettag_c_get_9_50.doStart(context, out);
                _jettag_c_get_9_50.doEnd();
                _jettag_java_import_9_37.handleBodyContent(out);
            }
            out = _jettag_java_import_9_37_saved_out;
            _jettag_java_import_9_37.doEnd();
            _jettag_c_if_8_189.handleBodyContent(out);
        }
        _jettag_c_if_8_189.doEnd();
        out.write(" get");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_139 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_139); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_139.setRuntimeParent(null);
        _jettag_c_get_9_139.setTagInfo(_td_c_get_9_139);
        _jettag_c_get_9_139.doStart(context, out);
        _jettag_c_get_9_139.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\treturn this.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_14.setRuntimeParent(null);
        _jettag_c_get_11_14.setTagInfo(_td_c_get_11_14);
        _jettag_c_get_11_14.doStart(context, out);
        _jettag_c_get_11_14.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/**");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * Sets the value of the '<b><em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_15_34 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_34); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_15_34.setRuntimeParent(null);
        _jettag_c_get_15_34.setTagInfo(_td_c_get_15_34);
        _jettag_c_get_15_34.doStart(context, out);
        _jettag_c_get_15_34.doEnd();
        out.write("</b></em>' references.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" * @param value the new the value of the '<em>");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_17_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_47); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_17_47.setRuntimeParent(null);
        _jettag_c_get_17_47.setTagInfo(_td_c_get_17_47);
        _jettag_c_get_17_47.doStart(context, out);
        _jettag_c_get_17_47.doEnd();
        out.write("</em>' reference.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(" */");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public void set");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_16.setRuntimeParent(null);
        _jettag_c_get_19_16.setTagInfo(_td_c_get_19_16);
        _jettag_c_get_19_16.doStart(context, out);
        _jettag_c_get_19_16.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_19_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_19_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_19_68.setRuntimeParent(null);
        _jettag_c_if_19_68.setTagInfo(_td_c_if_19_68);
        _jettag_c_if_19_68.doStart(context, out);
        while (_jettag_c_if_19_68.okToProcessBody()) {
            RuntimeTagElement _jettag_java_import_20_36 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_20_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_20_36.setRuntimeParent(_jettag_c_if_19_68);
            _jettag_java_import_20_36.setTagInfo(_td_java_import_20_36);
            _jettag_java_import_20_36.doStart(context, out);
            JET2Writer _jettag_java_import_20_36_saved_out = out;
            while (_jettag_java_import_20_36.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("java.util.List");  //$NON-NLS-1$        
                _jettag_java_import_20_36.handleBodyContent(out);
            }
            out = _jettag_java_import_20_36_saved_out;
            _jettag_java_import_20_36.doEnd();
            out.write("<");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_20_78 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_20_78); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_20_78.setRuntimeParent(_jettag_c_if_19_68);
            _jettag_java_import_20_78.setTagInfo(_td_java_import_20_78);
            _jettag_java_import_20_78.doStart(context, out);
            JET2Writer _jettag_java_import_20_78_saved_out = out;
            while (_jettag_java_import_20_78.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_20_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_91); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_91.setRuntimeParent(_jettag_java_import_20_78);
                _jettag_c_get_20_91.setTagInfo(_td_c_get_20_91);
                _jettag_c_get_20_91.doStart(context, out);
                _jettag_c_get_20_91.doEnd();
                _jettag_java_import_20_78.handleBodyContent(out);
            }
            out = _jettag_java_import_20_78_saved_out;
            _jettag_java_import_20_78.doEnd();
            out.write(">");  //$NON-NLS-1$        
            _jettag_c_if_19_68.handleBodyContent(out);
        }
        _jettag_c_if_19_68.doEnd();
        RuntimeTagElement _jettag_c_if_20_177 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_20_177); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_20_177.setRuntimeParent(null);
        _jettag_c_if_20_177.setTagInfo(_td_c_if_20_177);
        _jettag_c_if_20_177.doStart(context, out);
        while (_jettag_c_if_20_177.okToProcessBody()) {
            RuntimeTagElement _jettag_java_import_21_37 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_21_37); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_21_37.setRuntimeParent(_jettag_c_if_20_177);
            _jettag_java_import_21_37.setTagInfo(_td_java_import_21_37);
            _jettag_java_import_21_37.doStart(context, out);
            JET2Writer _jettag_java_import_21_37_saved_out = out;
            while (_jettag_java_import_21_37.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_21_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_50); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_21_50.setRuntimeParent(_jettag_java_import_21_37);
                _jettag_c_get_21_50.setTagInfo(_td_c_get_21_50);
                _jettag_c_get_21_50.doStart(context, out);
                _jettag_c_get_21_50.doEnd();
                _jettag_java_import_21_37.handleBodyContent(out);
            }
            out = _jettag_java_import_21_37_saved_out;
            _jettag_java_import_21_37.doEnd();
            _jettag_c_if_20_177.handleBodyContent(out);
        }
        _jettag_c_if_20_177.doEnd();
        out.write(" value) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tthis.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_22_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_22_7.setRuntimeParent(null);
        _jettag_c_get_22_7.setTagInfo(_td_c_get_22_7);
        _jettag_c_get_22_7.doStart(context, out);
        _jettag_c_get_22_7.doEnd();
        out.write(" = value;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
    }
}
