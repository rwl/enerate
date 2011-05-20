package com.github.enerate.csharp.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_enum implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_enum() {
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
    private static final TagInfo _td_c_get_3_11 = new TagInfo("c:get", //$NON-NLS-1$
            3, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/ePackage/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_5_1 = new TagInfo("f:indent", //$NON-NLS-1$
            5, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_1 = new TagInfo("c:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_97 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 97,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_8_1 = new TagInfo("f:indent", //$NON-NLS-1$
            8, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                " * ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_8_22 = new TagInfo("c:include", //$NON-NLS-1$
            8, 22,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_13 = new TagInfo("c:get", //$NON-NLS-1$
            10, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_12_1 = new TagInfo("f:indent", //$NON-NLS-1$
            12, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                "\t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
                "delimiter", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/eLiterals", //$NON-NLS-1$
                "eLiteral", //$NON-NLS-1$
                ", ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_replaceStrings_14_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            14, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                " ,/,-,�", //$NON-NLS-1$
                "_,_,_,deg", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_54 = new TagInfo("c:get", //$NON-NLS-1$
            14, 54,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eLiteral/@literal", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_include_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_1_1.setRuntimeParent(null);
        _jettag_c_include_1_1.setTagInfo(_td_c_include_1_1);
        _jettag_c_include_1_1.doStart(context, out);
        _jettag_c_include_1_1.doEnd();
        out.write(NL);         
        out.write("namespace ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_11.setRuntimeParent(null);
        _jettag_c_get_3_11.setTagInfo(_td_c_get_3_11);
        _jettag_c_get_3_11.doStart(context, out);
        _jettag_c_get_3_11.doEnd();
        out.write(NL);         
        out.write("{");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_f_indent_5_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_indent_5_1.setRuntimeParent(null);
        _jettag_f_indent_5_1.setTagInfo(_td_f_indent_5_1);
        _jettag_f_indent_5_1.doStart(context, out);
        JET2Writer _jettag_f_indent_5_1_saved_out = out;
        while (_jettag_f_indent_5_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_6_1.setRuntimeParent(_jettag_f_indent_5_1);
            _jettag_c_if_6_1.setTagInfo(_td_c_if_6_1);
            _jettag_c_if_6_1.doStart(context, out);
            while (_jettag_c_if_6_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_6_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_97); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_6_97.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_c_setVariable_6_97.setTagInfo(_td_c_setVariable_6_97);
                _jettag_c_setVariable_6_97.doStart(context, out);
                _jettag_c_setVariable_6_97.doEnd();
                out.write("/*");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_f_indent_8_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_8_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_f_indent_8_1.setRuntimeParent(_jettag_c_if_6_1);
                _jettag_f_indent_8_1.setTagInfo(_td_f_indent_8_1);
                _jettag_f_indent_8_1.doStart(context, out);
                JET2Writer _jettag_f_indent_8_1_saved_out = out;
                while (_jettag_f_indent_8_1.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_include_8_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_8_22); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_8_22.setRuntimeParent(_jettag_f_indent_8_1);
                    _jettag_c_include_8_22.setTagInfo(_td_c_include_8_22);
                    _jettag_c_include_8_22.doStart(context, out);
                    _jettag_c_include_8_22.doEnd();
                    _jettag_f_indent_8_1.handleBodyContent(out);
                }
                out = _jettag_f_indent_8_1_saved_out;
                _jettag_f_indent_8_1.doEnd();
                out.write(NL);         
                out.write(" */");  //$NON-NLS-1$        
                _jettag_c_if_6_1.handleBodyContent(out);
            }
            _jettag_c_if_6_1.doEnd();
            out.write(NL);         
            out.write("public enum ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_10_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_13.setRuntimeParent(_jettag_f_indent_5_1);
            _jettag_c_get_10_13.setTagInfo(_td_c_get_10_13);
            _jettag_c_get_10_13.doStart(context, out);
            _jettag_c_get_10_13.doEnd();
            out.write(NL);         
            out.write("{");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_f_indent_12_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_12_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_12_1.setRuntimeParent(_jettag_f_indent_5_1);
            _jettag_f_indent_12_1.setTagInfo(_td_f_indent_12_1);
            _jettag_f_indent_12_1.doStart(context, out);
            JET2Writer _jettag_f_indent_12_1_saved_out = out;
            while (_jettag_f_indent_12_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_13_1.setRuntimeParent(_jettag_f_indent_12_1);
                _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
                _jettag_c_iterate_13_1.doStart(context, out);
                while (_jettag_c_iterate_13_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_replaceStrings_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_14_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_replaceStrings_14_1.setRuntimeParent(_jettag_c_iterate_13_1);
                    _jettag_c_replaceStrings_14_1.setTagInfo(_td_c_replaceStrings_14_1);
                    _jettag_c_replaceStrings_14_1.doStart(context, out);
                    JET2Writer _jettag_c_replaceStrings_14_1_saved_out = out;
                    while (_jettag_c_replaceStrings_14_1.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_get_14_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_54); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_14_54.setRuntimeParent(_jettag_c_replaceStrings_14_1);
                        _jettag_c_get_14_54.setTagInfo(_td_c_get_14_54);
                        _jettag_c_get_14_54.doStart(context, out);
                        _jettag_c_get_14_54.doEnd();
                        _jettag_c_replaceStrings_14_1.handleBodyContent(out);
                    }
                    out = _jettag_c_replaceStrings_14_1_saved_out;
                    _jettag_c_replaceStrings_14_1.doEnd();
                    _jettag_c_iterate_13_1.handleBodyContent(out);
                }
                _jettag_c_iterate_13_1.doEnd();
                out.write(NL);         
                _jettag_f_indent_12_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_12_1_saved_out;
            _jettag_f_indent_12_1.doEnd();
            out.write("}");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_f_indent_5_1.handleBodyContent(out);
        }
        out = _jettag_f_indent_5_1_saved_out;
        _jettag_f_indent_5_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
