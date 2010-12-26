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
    private static final TagInfo _td_c_if_12_7 = new TagInfo("c:if", //$NON-NLS-1$
            12, 7,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_70 = new TagInfo("c:get", //$NON-NLS-1$
            12, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_12_101 = new TagInfo("c:if", //$NON-NLS-1$
            12, 101,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_12_154 = new TagInfo("java:import", //$NON-NLS-1$
            12, 154,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_12_167 = new TagInfo("c:get", //$NON-NLS-1$
            12, 167,
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
    private static final TagInfo _td_f_indent_15_1 = new TagInfo("f:indent", //$NON-NLS-1$
            15, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_15_20 = new TagInfo("c:include", //$NON-NLS-1$
            15, 20,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attr.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_17_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_18_1 = new TagInfo("f:indent", //$NON-NLS-1$
            18, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_18_20 = new TagInfo("c:include", //$NON-NLS-1$
            18, 20,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/ref.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_21_9 = new TagInfo("c:get", //$NON-NLS-1$
            21, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_26_1 = new TagInfo("f:indent", //$NON-NLS-1$
            26, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_26_20 = new TagInfo("c:include", //$NON-NLS-1$
            26, 20,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attr-accessors.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_28_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            28, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_29_1 = new TagInfo("f:indent", //$NON-NLS-1$
            29, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_20 = new TagInfo("c:include", //$NON-NLS-1$
            29, 20,
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
        out.write("public");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_if_12_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_12_7.setRuntimeParent(null);
        _jettag_c_if_12_7.setTagInfo(_td_c_if_12_7);
        _jettag_c_if_12_7.doStart(context, out);
        while (_jettag_c_if_12_7.okToProcessBody()) {
            out.write(" abstract");  //$NON-NLS-1$        
            _jettag_c_if_12_7.handleBodyContent(out);
        }
        _jettag_c_if_12_7.doEnd();
        out.write(" class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_70); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_70.setRuntimeParent(null);
        _jettag_c_get_12_70.setTagInfo(_td_c_get_12_70);
        _jettag_c_get_12_70.doStart(context, out);
        _jettag_c_get_12_70.doEnd();
        RuntimeTagElement _jettag_c_if_12_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_12_101); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_12_101.setRuntimeParent(null);
        _jettag_c_if_12_101.setTagInfo(_td_c_if_12_101);
        _jettag_c_if_12_101.doStart(context, out);
        while (_jettag_c_if_12_101.okToProcessBody()) {
            out.write(" extends ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_java_import_12_154 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_12_154); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_import_12_154.setRuntimeParent(_jettag_c_if_12_101);
            _jettag_java_import_12_154.setTagInfo(_td_java_import_12_154);
            _jettag_java_import_12_154.doStart(context, out);
            JET2Writer _jettag_java_import_12_154_saved_out = out;
            while (_jettag_java_import_12_154.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_12_167 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_167); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_12_167.setRuntimeParent(_jettag_java_import_12_154);
                _jettag_c_get_12_167.setTagInfo(_td_c_get_12_167);
                _jettag_c_get_12_167.doStart(context, out);
                _jettag_c_get_12_167.doEnd();
                _jettag_java_import_12_154.handleBodyContent(out);
            }
            out = _jettag_java_import_12_154_saved_out;
            _jettag_java_import_12_154.doEnd();
            _jettag_c_if_12_101.handleBodyContent(out);
        }
        _jettag_c_if_12_101.doEnd();
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_13_1.setRuntimeParent(null);
        _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
        _jettag_c_iterate_13_1.doStart(context, out);
        while (_jettag_c_iterate_13_1.okToProcessBody()) {
            out.write(NL);         
            RuntimeTagElement _jettag_f_indent_15_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_15_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_15_1.setRuntimeParent(_jettag_c_iterate_13_1);
            _jettag_f_indent_15_1.setTagInfo(_td_f_indent_15_1);
            _jettag_f_indent_15_1.doStart(context, out);
            JET2Writer _jettag_f_indent_15_1_saved_out = out;
            while (_jettag_f_indent_15_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_15_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_15_20.setRuntimeParent(_jettag_f_indent_15_1);
                _jettag_c_include_15_20.setTagInfo(_td_c_include_15_20);
                _jettag_c_include_15_20.doStart(context, out);
                _jettag_c_include_15_20.doEnd();
                _jettag_f_indent_15_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_15_1_saved_out;
            _jettag_f_indent_15_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_13_1.handleBodyContent(out);
        }
        _jettag_c_iterate_13_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_17_1.setRuntimeParent(null);
        _jettag_c_iterate_17_1.setTagInfo(_td_c_iterate_17_1);
        _jettag_c_iterate_17_1.doStart(context, out);
        while (_jettag_c_iterate_17_1.okToProcessBody()) {
            RuntimeTagElement _jettag_f_indent_18_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_18_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_18_1.setRuntimeParent(_jettag_c_iterate_17_1);
            _jettag_f_indent_18_1.setTagInfo(_td_f_indent_18_1);
            _jettag_f_indent_18_1.doStart(context, out);
            JET2Writer _jettag_f_indent_18_1_saved_out = out;
            while (_jettag_f_indent_18_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_18_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_18_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_18_20.setRuntimeParent(_jettag_f_indent_18_1);
                _jettag_c_include_18_20.setTagInfo(_td_c_include_18_20);
                _jettag_c_include_18_20.doStart(context, out);
                _jettag_c_include_18_20.doEnd();
                _jettag_f_indent_18_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_18_1_saved_out;
            _jettag_f_indent_18_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_17_1.handleBodyContent(out);
        }
        _jettag_c_iterate_17_1.doEnd();
        out.write(NL);         
        out.write("\tpublic ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_21_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_21_9.setRuntimeParent(null);
        _jettag_c_get_21_9.setTagInfo(_td_c_get_21_9);
        _jettag_c_get_21_9.doStart(context, out);
        _jettag_c_get_21_9.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsuper();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_25_1.setRuntimeParent(null);
        _jettag_c_iterate_25_1.setTagInfo(_td_c_iterate_25_1);
        _jettag_c_iterate_25_1.doStart(context, out);
        while (_jettag_c_iterate_25_1.okToProcessBody()) {
            RuntimeTagElement _jettag_f_indent_26_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_26_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_26_1.setRuntimeParent(_jettag_c_iterate_25_1);
            _jettag_f_indent_26_1.setTagInfo(_td_f_indent_26_1);
            _jettag_f_indent_26_1.doStart(context, out);
            JET2Writer _jettag_f_indent_26_1_saved_out = out;
            while (_jettag_f_indent_26_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_26_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_26_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_26_20.setRuntimeParent(_jettag_f_indent_26_1);
                _jettag_c_include_26_20.setTagInfo(_td_c_include_26_20);
                _jettag_c_include_26_20.doStart(context, out);
                _jettag_c_include_26_20.doEnd();
                _jettag_f_indent_26_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_26_1_saved_out;
            _jettag_f_indent_26_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_25_1.handleBodyContent(out);
        }
        _jettag_c_iterate_25_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_28_1.setRuntimeParent(null);
        _jettag_c_iterate_28_1.setTagInfo(_td_c_iterate_28_1);
        _jettag_c_iterate_28_1.doStart(context, out);
        while (_jettag_c_iterate_28_1.okToProcessBody()) {
            RuntimeTagElement _jettag_f_indent_29_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_29_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_29_1.setRuntimeParent(_jettag_c_iterate_28_1);
            _jettag_f_indent_29_1.setTagInfo(_td_f_indent_29_1);
            _jettag_f_indent_29_1.doStart(context, out);
            JET2Writer _jettag_f_indent_29_1_saved_out = out;
            while (_jettag_f_indent_29_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_29_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_20); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_29_20.setRuntimeParent(_jettag_f_indent_29_1);
                _jettag_c_include_29_20.setTagInfo(_td_c_include_29_20);
                _jettag_c_include_29_20.doStart(context, out);
                _jettag_c_include_29_20.doEnd();
                _jettag_f_indent_29_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_29_1_saved_out;
            _jettag_f_indent_29_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_28_1.handleBodyContent(out);
        }
        _jettag_c_iterate_28_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
