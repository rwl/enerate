package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_enum implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

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
    private static final TagInfo _td_c_get_2_9 = new TagInfo("c:get", //$NON-NLS-1$
            2, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/ePackage/@fullyQualifiedName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_1 = new TagInfo("c:if", //$NON-NLS-1$
            4, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eEnum/eAnnotations[@source='http://www.eclipse.org/emf/2002/GenModel']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_97 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 97,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eEnum", //$NON-NLS-1$
            } );
    private static final TagInfo _td_f_indent_6_1 = new TagInfo("f:indent", //$NON-NLS-1$
            6, 1,
            new String[] {
                "text", //$NON-NLS-1$
            },
            new String[] {
                " * ", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_format_6_22 = new TagInfo("java:format", //$NON-NLS-1$
            6, 22,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_6_35 = new TagInfo("c:include", //$NON-NLS-1$
            6, 35,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_13 = new TagInfo("c:get", //$NON-NLS-1$
            8, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eEnum/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 2,
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
    private static final TagInfo _td_c_replaceStrings_10_69 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            10, 69,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                " ,/,-,�", //$NON-NLS-1$
                "_,_,_,deg", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_122 = new TagInfo("c:get", //$NON-NLS-1$
            10, 122,
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
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_9.setRuntimeParent(null);
        _jettag_c_get_2_9.setTagInfo(_td_c_get_2_9);
        _jettag_c_get_2_9.doStart(context, out);
        _jettag_c_get_2_9.doEnd();
        out.write(";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_4_1.setRuntimeParent(null);
        _jettag_c_if_4_1.setTagInfo(_td_c_if_4_1);
        _jettag_c_if_4_1.doStart(context, out);
        while (_jettag_c_if_4_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_4_97 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_97); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_4_97.setRuntimeParent(_jettag_c_if_4_1);
            _jettag_c_setVariable_4_97.setTagInfo(_td_c_setVariable_4_97);
            _jettag_c_setVariable_4_97.doStart(context, out);
            _jettag_c_setVariable_4_97.doEnd();
            out.write("/**");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_f_indent_6_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "indent", "f:indent", _td_f_indent_6_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_f_indent_6_1.setRuntimeParent(_jettag_c_if_4_1);
            _jettag_f_indent_6_1.setTagInfo(_td_f_indent_6_1);
            _jettag_f_indent_6_1.doStart(context, out);
            JET2Writer _jettag_f_indent_6_1_saved_out = out;
            while (_jettag_f_indent_6_1.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_java_format_6_22 = context.getTagFactory().createRuntimeTag(_jetns_java, "format", "java:format", _td_java_format_6_22); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_format_6_22.setRuntimeParent(_jettag_f_indent_6_1);
                _jettag_java_format_6_22.setTagInfo(_td_java_format_6_22);
                _jettag_java_format_6_22.doStart(context, out);
                JET2Writer _jettag_java_format_6_22_saved_out = out;
                while (_jettag_java_format_6_22.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_include_6_35 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_35); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_6_35.setRuntimeParent(_jettag_java_format_6_22);
                    _jettag_c_include_6_35.setTagInfo(_td_c_include_6_35);
                    _jettag_c_include_6_35.doStart(context, out);
                    _jettag_c_include_6_35.doEnd();
                    _jettag_java_format_6_22.handleBodyContent(out);
                }
                out = _jettag_java_format_6_22_saved_out;
                _jettag_java_format_6_22.doEnd();
                _jettag_f_indent_6_1.handleBodyContent(out);
            }
            out = _jettag_f_indent_6_1_saved_out;
            _jettag_f_indent_6_1.doEnd();
            out.write(NL);         
            out.write(" */");  //$NON-NLS-1$        
            _jettag_c_if_4_1.handleBodyContent(out);
        }
        _jettag_c_if_4_1.doEnd();
        out.write(NL);         
        out.write("public enum ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_13); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_13.setRuntimeParent(null);
        _jettag_c_get_8_13.setTagInfo(_td_c_get_8_13);
        _jettag_c_get_8_13.doStart(context, out);
        _jettag_c_get_8_13.doEnd();
        out.write(" {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_10_2.setRuntimeParent(null);
        _jettag_c_iterate_10_2.setTagInfo(_td_c_iterate_10_2);
        _jettag_c_iterate_10_2.doStart(context, out);
        while (_jettag_c_iterate_10_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_replaceStrings_10_69 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_10_69); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_replaceStrings_10_69.setRuntimeParent(_jettag_c_iterate_10_2);
            _jettag_c_replaceStrings_10_69.setTagInfo(_td_c_replaceStrings_10_69);
            _jettag_c_replaceStrings_10_69.doStart(context, out);
            JET2Writer _jettag_c_replaceStrings_10_69_saved_out = out;
            while (_jettag_c_replaceStrings_10_69.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_10_122 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_122); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_122.setRuntimeParent(_jettag_c_replaceStrings_10_69);
                _jettag_c_get_10_122.setTagInfo(_td_c_get_10_122);
                _jettag_c_get_10_122.doStart(context, out);
                _jettag_c_get_10_122.doEnd();
                _jettag_c_replaceStrings_10_69.handleBodyContent(out);
            }
            out = _jettag_c_replaceStrings_10_69_saved_out;
            _jettag_c_replaceStrings_10_69.doEnd();
            _jettag_c_iterate_10_2.handleBodyContent(out);
        }
        _jettag_c_iterate_10_2.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
