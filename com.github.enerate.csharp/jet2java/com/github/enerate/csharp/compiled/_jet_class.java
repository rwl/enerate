package com.github.enerate.csharp.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_class implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_class() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_1_1 = new TagInfo("c:include", //$NON-NLS-1$
            1, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_11 = new TagInfo("c:get", //$NON-NLS-1$
            5, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/ePackage/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_7_1 = new TagInfo("f:indent", //$NON-NLS-1$
            7, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_1 = new TagInfo("c:if", //$NON-NLS-1$
            8, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_70 = new TagInfo("c:get", //$NON-NLS-1$
            8, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_101 = new TagInfo("c:if", //$NON-NLS-1$
            8, 101,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_148 = new TagInfo("c:get", //$NON-NLS-1$
            8, 148,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_10_1 = new TagInfo("f:indent", //$NON-NLS-1$
            10, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes", //$NON-NLS-1$
                "eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_13_1 = new TagInfo("c:include", //$NON-NLS-1$
            13, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attr.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_1 = new TagInfo("c:include", //$NON-NLS-1$
            17, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/ref.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_8 = new TagInfo("c:get", //$NON-NLS-1$
            20, 8,
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
    private static final TagInfo _td_c_include_25_1 = new TagInfo("c:include", //$NON-NLS-1$
            25, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attr-prop.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_27_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            27, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_1 = new TagInfo("c:include", //$NON-NLS-1$
            29, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/ref-prop.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_include_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_1_1.setRuntimeParent(null);
        _jettag_c_include_1_1.setTagInfo(_td_c_include_1_1);
        _jettag_c_include_1_1.doStart(context, out);
        _jettag_c_include_1_1.doEnd();
        out.write(NL);         
        out.write("using System;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("namespace ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_5_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_5_11.setRuntimeParent(null);
        _jettag_c_get_5_11.setTagInfo(_td_c_get_5_11);
        _jettag_c_get_5_11.doStart(context, out);
        _jettag_c_get_5_11.doEnd();
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_f_indent_7_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_indent_7_1.setRuntimeParent(null);
        _jettag_f_indent_7_1.setTagInfo(_td_f_indent_7_1);
        _jettag_f_indent_7_1.doStart(context, out);
        JET2Writer _jettag_f_indent_7_1_saved_out = out;
        while (_jettag_f_indent_7_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_if_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_1.setRuntimeParent(_jettag_f_indent_7_1);
            _jettag_c_if_8_1.setTagInfo(_td_c_if_8_1);
            _jettag_c_if_8_1.doStart(context, out);
            while (_jettag_c_if_8_1.okToProcessBody()) {
                out.write("abstract ");  //$NON-NLS-1$        
                _jettag_c_if_8_1.handleBodyContent(out);
            }
            _jettag_c_if_8_1.doEnd();
            out.write("public class ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_70); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_70.setRuntimeParent(_jettag_f_indent_7_1);
            _jettag_c_get_8_70.setTagInfo(_td_c_get_8_70);
            _jettag_c_get_8_70.doStart(context, out);
            _jettag_c_get_8_70.doEnd();
            RuntimeTagElement _jettag_c_if_8_101 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_101); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_101.setRuntimeParent(_jettag_f_indent_7_1);
            _jettag_c_if_8_101.setTagInfo(_td_c_if_8_101);
            _jettag_c_if_8_101.doStart(context, out);
            while (_jettag_c_if_8_101.okToProcessBody()) {
                out.write(" : ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_8_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_148); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_8_148.setRuntimeParent(_jettag_c_if_8_101);
                _jettag_c_get_8_148.setTagInfo(_td_c_get_8_148);
                _jettag_c_get_8_148.doStart(context, out);
                _jettag_c_get_8_148.doEnd();
                _jettag_c_if_8_101.handleBodyContent(out);
            }
            _jettag_c_if_8_101.doEnd();
            out.write(NL);         
            out.write("{");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_f_indent_10_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_10_1.setRuntimeParent(_jettag_f_indent_7_1);
            _jettag_f_indent_10_1.setTagInfo(_td_f_indent_10_1);
            _jettag_f_indent_10_1.doStart(context, out);
            JET2Writer _jettag_f_indent_10_1_saved_out = out;
            while (_jettag_f_indent_10_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_11_1.setRuntimeParent(_jettag_f_indent_10_1);
                _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
                _jettag_c_iterate_11_1.doStart(context, out);
                while (_jettag_c_iterate_11_1.okToProcessBody()) {
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_include_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_13_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_13_1.setRuntimeParent(_jettag_c_iterate_11_1);
                    _jettag_c_include_13_1.setTagInfo(_td_c_include_13_1);
                    _jettag_c_include_13_1.doStart(context, out);
                    _jettag_c_include_13_1.doEnd();
                    _jettag_c_iterate_11_1.handleBodyContent(out);
                }
                _jettag_c_iterate_11_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_15_1.setRuntimeParent(_jettag_f_indent_10_1);
                _jettag_c_iterate_15_1.setTagInfo(_td_c_iterate_15_1);
                _jettag_c_iterate_15_1.doStart(context, out);
                while (_jettag_c_iterate_15_1.okToProcessBody()) {
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_include_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_17_1.setRuntimeParent(_jettag_c_iterate_15_1);
                    _jettag_c_include_17_1.setTagInfo(_td_c_include_17_1);
                    _jettag_c_include_17_1.doStart(context, out);
                    _jettag_c_include_17_1.doEnd();
                    _jettag_c_iterate_15_1.handleBodyContent(out);
                }
                _jettag_c_iterate_15_1.doEnd();
                out.write(NL);         
                out.write("public ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_20_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_20_8.setRuntimeParent(_jettag_f_indent_10_1);
                _jettag_c_get_20_8.setTagInfo(_td_c_get_20_8);
                _jettag_c_get_20_8.doStart(context, out);
                _jettag_c_get_20_8.doEnd();
                out.write("()");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("{");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("}");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_23_1.setRuntimeParent(_jettag_f_indent_10_1);
                _jettag_c_iterate_23_1.setTagInfo(_td_c_iterate_23_1);
                _jettag_c_iterate_23_1.doStart(context, out);
                while (_jettag_c_iterate_23_1.okToProcessBody()) {
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_include_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_25_1.setRuntimeParent(_jettag_c_iterate_23_1);
                    _jettag_c_include_25_1.setTagInfo(_td_c_include_25_1);
                    _jettag_c_include_25_1.doStart(context, out);
                    _jettag_c_include_25_1.doEnd();
                    _jettag_c_iterate_23_1.handleBodyContent(out);
                }
                _jettag_c_iterate_23_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_27_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_27_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_27_1.setRuntimeParent(_jettag_f_indent_10_1);
                _jettag_c_iterate_27_1.setTagInfo(_td_c_iterate_27_1);
                _jettag_c_iterate_27_1.doStart(context, out);
                while (_jettag_c_iterate_27_1.okToProcessBody()) {
                    out.write(NL);         
                    RuntimeTagElement _jettag_c_include_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_29_1.setRuntimeParent(_jettag_c_iterate_27_1);
                    _jettag_c_include_29_1.setTagInfo(_td_c_include_29_1);
                    _jettag_c_include_29_1.doStart(context, out);
                    _jettag_c_include_29_1.doEnd();
                    _jettag_c_iterate_27_1.handleBodyContent(out);
                }
                _jettag_c_iterate_27_1.doEnd();
                out.write(NL);         
                _jettag_f_indent_10_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_10_1_saved_out;
            _jettag_f_indent_10_1.doEnd();
            out.write(NL);         
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_f_indent_7_1.handleBodyContent(out);
        }
        out = _jettag_f_indent_7_1_saved_out;
        _jettag_f_indent_7_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
