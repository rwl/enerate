package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_class implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_class() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_2_1 = new TagInfo("c:include", //$NON-NLS-1$
            2, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_9 = new TagInfo("c:get", //$NON-NLS-1$
            3, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/ePackage/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_importsLocation_5_1 = new TagInfo("java:importsLocation", //$NON-NLS-1$
            5, 1,
            new String[] {
                "package", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/ePackage/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_1 = new TagInfo("c:if", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 4,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_54 = new TagInfo("c:include", //$NON-NLS-1$
            9, 54,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_14 = new TagInfo("c:get", //$NON-NLS-1$
            12, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_45 = new TagInfo("c:if", //$NON-NLS-1$
            12, 45,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_98 = new TagInfo("java:import", //$NON-NLS-1$
            12, 98,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_12_111 = new TagInfo("c:get", //$NON-NLS-1$
            12, 111,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_14_1 = new TagInfo("f:indent", //$NON-NLS-1$
            14, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_14_20 = new TagInfo("c:include", //$NON-NLS-1$
            14, 20,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attr.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_13 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 13,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_16_1 = new TagInfo("f:indent", //$NON-NLS-1$
            16, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_20 = new TagInfo("c:include", //$NON-NLS-1$
            16, 20,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/ref.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_19_12 = new TagInfo("c:get", //$NON-NLS-1$
            19, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_24_1 = new TagInfo("f:indent", //$NON-NLS-1$
            24, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_24_20 = new TagInfo("c:include", //$NON-NLS-1$
            24, 20,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attr-accessors.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_26_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            26, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_27_1 = new TagInfo("f:indent", //$NON-NLS-1$
            27, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_27_20 = new TagInfo("c:include", //$NON-NLS-1$
            27, 20,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/ref-accessors.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // the class template 
        RuntimeTagElement _jettag_c_include_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_2_1.setRuntimeParent(null);
        _jettag_c_include_2_1.setTagInfo(_td_c_include_2_1);
        _jettag_c_include_2_1.doStart(context, out);
        _jettag_c_include_2_1.doEnd();
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_9.setRuntimeParent(null);
        _jettag_c_get_3_9.setTagInfo(_td_c_get_3_9);
        _jettag_c_get_3_9.doStart(context, out);
        _jettag_c_get_3_9.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        // setup location for automatical import statement insertion 
        RuntimeTagElement _jettag_java_importsLocation_5_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "importsLocation", "java:importsLocation", _td_java_importsLocation_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_importsLocation_5_1.setRuntimeParent(null);
        _jettag_java_importsLocation_5_1.setTagInfo(_td_java_importsLocation_5_1);
        _jettag_java_importsLocation_5_1.doStart(context, out);
        _jettag_java_importsLocation_5_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_7_1.setRuntimeParent(null);
        _jettag_c_if_7_1.setTagInfo(_td_c_if_7_1);
        _jettag_c_if_7_1.doStart(context, out);
        while (_jettag_c_if_7_1.okToProcessBody()) {
            out.write("/**");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" * ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_9_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_4); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_9_4.setRuntimeParent(_jettag_c_if_7_1);
            _jettag_c_setVariable_9_4.setTagInfo(_td_c_setVariable_9_4);
            _jettag_c_setVariable_9_4.doStart(context, out);
            _jettag_c_setVariable_9_4.doEnd();
            RuntimeTagElement _jettag_c_include_9_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_54); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_9_54.setRuntimeParent(_jettag_c_if_7_1);
            _jettag_c_include_9_54.setTagInfo(_td_c_include_9_54);
            _jettag_c_include_9_54.doStart(context, out);
            _jettag_c_include_9_54.doEnd();
            out.write(NL);         
            out.write(" */");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_7_1.handleBodyContent(out);
        }
        _jettag_c_if_7_1.doEnd();
        out.write("public class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_14.setRuntimeParent(null);
        _jettag_c_get_12_14.setTagInfo(_td_c_get_12_14);
        _jettag_c_get_12_14.doStart(context, out);
        _jettag_c_get_12_14.doEnd();
        RuntimeTagElement _jettag_c_if_12_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_45); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_12_45.setRuntimeParent(null);
        _jettag_c_if_12_45.setTagInfo(_td_c_if_12_45);
        _jettag_c_if_12_45.doStart(context, out);
        while (_jettag_c_if_12_45.okToProcessBody()) {
            out.write(" extends ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_12_98 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_98); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_12_98.setRuntimeParent(_jettag_c_if_12_45);
            _jettag_java_import_12_98.setTagInfo(_td_java_import_12_98);
            _jettag_java_import_12_98.doStart(context, out);
            JET2Writer _jettag_java_import_12_98_saved_out = out;
            while (_jettag_java_import_12_98.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_12_111 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_111); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_111.setRuntimeParent(_jettag_java_import_12_98);
                _jettag_c_get_12_111.setTagInfo(_td_c_get_12_111);
                _jettag_c_get_12_111.doStart(context, out);
                _jettag_c_get_12_111.doEnd();
                _jettag_java_import_12_98.handleBodyContent(out);
            }
            out = _jettag_java_import_12_98_saved_out;
            _jettag_java_import_12_98.doEnd();
            _jettag_c_if_12_45.handleBodyContent(out);
        }
        _jettag_c_if_12_45.doEnd();
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_13_1.setRuntimeParent(null);
        _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
        _jettag_c_iterate_13_1.doStart(context, out);
        while (_jettag_c_iterate_13_1.okToProcessBody()) {
            RuntimeTagElement _jettag_f_indent_14_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_14_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_14_1.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_f_indent_14_1.setTagInfo(_td_f_indent_14_1);
            _jettag_f_indent_14_1.doStart(context, out);
            JET2Writer _jettag_f_indent_14_1_saved_out = out;
            while (_jettag_f_indent_14_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_14_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_14_20.setRuntimeParent(_jettag_f_indent_14_1);
                _jettag_c_include_14_20.setTagInfo(_td_c_include_14_20);
                _jettag_c_include_14_20.doStart(context, out);
                _jettag_c_include_14_20.doEnd();
                _jettag_f_indent_14_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_14_1_saved_out;
            _jettag_f_indent_14_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_13_1.handleBodyContent(out);
        }
        _jettag_c_iterate_13_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_15_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_15_13.setRuntimeParent(null);
        _jettag_c_iterate_15_13.setTagInfo(_td_c_iterate_15_13);
        _jettag_c_iterate_15_13.doStart(context, out);
        while (_jettag_c_iterate_15_13.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_f_indent_16_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_16_1.setRuntimeParent(_jettag_c_iterate_15_13);
            _jettag_f_indent_16_1.setTagInfo(_td_f_indent_16_1);
            _jettag_f_indent_16_1.doStart(context, out);
            JET2Writer _jettag_f_indent_16_1_saved_out = out;
            while (_jettag_f_indent_16_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_16_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_16_20.setRuntimeParent(_jettag_f_indent_16_1);
                _jettag_c_include_16_20.setTagInfo(_td_c_include_16_20);
                _jettag_c_include_16_20.doStart(context, out);
                _jettag_c_include_16_20.doEnd();
                _jettag_f_indent_16_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_16_1_saved_out;
            _jettag_f_indent_16_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_15_13.handleBodyContent(out);
        }
        _jettag_c_iterate_15_13.doEnd();
        out.write(NL);         
        out.write("\tprotected ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_19_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_19_12); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_19_12.setRuntimeParent(null);
        _jettag_c_get_19_12.setTagInfo(_td_c_get_19_12);
        _jettag_c_get_19_12.doStart(context, out);
        _jettag_c_get_19_12.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_23_1.setRuntimeParent(null);
        _jettag_c_iterate_23_1.setTagInfo(_td_c_iterate_23_1);
        _jettag_c_iterate_23_1.doStart(context, out);
        while (_jettag_c_iterate_23_1.okToProcessBody()) {
            RuntimeTagElement _jettag_f_indent_24_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_24_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_24_1.setRuntimeParent(_jettag_c_iterate_23_1);
            _jettag_f_indent_24_1.setTagInfo(_td_f_indent_24_1);
            _jettag_f_indent_24_1.doStart(context, out);
            JET2Writer _jettag_f_indent_24_1_saved_out = out;
            while (_jettag_f_indent_24_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_24_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_24_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_24_20.setRuntimeParent(_jettag_f_indent_24_1);
                _jettag_c_include_24_20.setTagInfo(_td_c_include_24_20);
                _jettag_c_include_24_20.doStart(context, out);
                _jettag_c_include_24_20.doEnd();
                _jettag_f_indent_24_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_24_1_saved_out;
            _jettag_f_indent_24_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_23_1.handleBodyContent(out);
        }
        _jettag_c_iterate_23_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_26_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_26_1.setRuntimeParent(null);
        _jettag_c_iterate_26_1.setTagInfo(_td_c_iterate_26_1);
        _jettag_c_iterate_26_1.doStart(context, out);
        while (_jettag_c_iterate_26_1.okToProcessBody()) {
            RuntimeTagElement _jettag_f_indent_27_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_27_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_27_1.setRuntimeParent(_jettag_c_iterate_26_1);
            _jettag_f_indent_27_1.setTagInfo(_td_f_indent_27_1);
            _jettag_f_indent_27_1.doStart(context, out);
            JET2Writer _jettag_f_indent_27_1_saved_out = out;
            while (_jettag_f_indent_27_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_27_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_27_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_27_20.setRuntimeParent(_jettag_f_indent_27_1);
                _jettag_c_include_27_20.setTagInfo(_td_c_include_27_20);
                _jettag_c_include_27_20.doStart(context, out);
                _jettag_c_include_27_20.doEnd();
                _jettag_f_indent_27_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_27_1_saved_out;
            _jettag_f_indent_27_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_26_1.handleBodyContent(out);
        }
        _jettag_c_iterate_26_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
