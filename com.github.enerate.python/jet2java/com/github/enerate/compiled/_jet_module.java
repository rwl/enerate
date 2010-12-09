package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_module implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_module() {
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
    private static final TagInfo _td_c_include_4_1 = new TagInfo("c:include", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/import.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_7 = new TagInfo("c:get", //$NON-NLS-1$
            7, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_7_39 = new TagInfo("c:choose", //$NON-NLS-1$
            7, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_7_85 = new TagInfo("c:when", //$NON-NLS-1$
            7, 85,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_7_117 = new TagInfo("c:otherwise", //$NON-NLS-1$
            7, 117,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_7_130 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 130,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
                "eSuperTypeIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_197 = new TagInfo("c:get", //$NON-NLS-1$
            7, 197,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[$eSuperTypeIdx]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_256 = new TagInfo("c:if", //$NON-NLS-1$
            7, 256,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperTypeIdx != count($eClass/eSuperTypes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_5 = new TagInfo("c:if", //$NON-NLS-1$
            8, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_8 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 8,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_58 = new TagInfo("c:include", //$NON-NLS-1$
            9, 58,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_5 = new TagInfo("c:include", //$NON-NLS-1$
            16, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/constructor.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_18_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            18, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_19_1 = new TagInfo("c:include", //$NON-NLS-1$
            19, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/reference.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_22_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            22, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eOperations", //$NON-NLS-1$
                "eOperation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_23_1 = new TagInfo("c:include", //$NON-NLS-1$
            23, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/operation.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_include_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_2_1.setRuntimeParent(null);
        _jettag_c_include_2_1.setTagInfo(_td_c_include_2_1);
        _jettag_c_include_2_1.doStart(context, out);
        _jettag_c_include_2_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_4_1.setRuntimeParent(null);
        _jettag_c_include_4_1.setTagInfo(_td_c_include_4_1);
        _jettag_c_include_4_1.doStart(context, out);
        _jettag_c_include_4_1.doEnd();
        out.write(NL);         
        // Classes with no super classes derive from 'object'. 
        out.write("class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_7.setRuntimeParent(null);
        _jettag_c_get_7_7.setTagInfo(_td_c_get_7_7);
        _jettag_c_get_7_7.doStart(context, out);
        _jettag_c_get_7_7.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_choose_7_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_7_39); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_7_39.setRuntimeParent(null);
        _jettag_c_choose_7_39.setTagInfo(_td_c_choose_7_39);
        _jettag_c_choose_7_39.doStart(context, out);
        JET2Writer _jettag_c_choose_7_39_saved_out = out;
        while (_jettag_c_choose_7_39.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_7_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_7_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_7_85.setRuntimeParent(_jettag_c_choose_7_39);
            _jettag_c_when_7_85.setTagInfo(_td_c_when_7_85);
            _jettag_c_when_7_85.doStart(context, out);
            JET2Writer _jettag_c_when_7_85_saved_out = out;
            while (_jettag_c_when_7_85.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("object");  //$NON-NLS-1$        
                _jettag_c_when_7_85.handleBodyContent(out);
            }
            out = _jettag_c_when_7_85_saved_out;
            _jettag_c_when_7_85.doEnd();
            RuntimeTagElement _jettag_c_otherwise_7_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_7_117); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_7_117.setRuntimeParent(_jettag_c_choose_7_39);
            _jettag_c_otherwise_7_117.setTagInfo(_td_c_otherwise_7_117);
            _jettag_c_otherwise_7_117.doStart(context, out);
            JET2Writer _jettag_c_otherwise_7_117_saved_out = out;
            while (_jettag_c_otherwise_7_117.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_7_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_130); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_7_130.setRuntimeParent(_jettag_c_otherwise_7_117);
                _jettag_c_iterate_7_130.setTagInfo(_td_c_iterate_7_130);
                _jettag_c_iterate_7_130.doStart(context, out);
                while (_jettag_c_iterate_7_130.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_7_197 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_197); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_7_197.setRuntimeParent(_jettag_c_iterate_7_130);
                    _jettag_c_get_7_197.setTagInfo(_td_c_get_7_197);
                    _jettag_c_get_7_197.doStart(context, out);
                    _jettag_c_get_7_197.doEnd();
                    RuntimeTagElement _jettag_c_if_7_256 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_256); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_7_256.setRuntimeParent(_jettag_c_iterate_7_130);
                    _jettag_c_if_7_256.setTagInfo(_td_c_if_7_256);
                    _jettag_c_if_7_256.doStart(context, out);
                    while (_jettag_c_if_7_256.okToProcessBody()) {
                        out.write(", ");  //$NON-NLS-1$        
                        _jettag_c_if_7_256.handleBodyContent(out);
                    }
                    _jettag_c_if_7_256.doEnd();
                    _jettag_c_iterate_7_130.handleBodyContent(out);
                }
                _jettag_c_iterate_7_130.doEnd();
                _jettag_c_otherwise_7_117.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_7_117_saved_out;
            _jettag_c_otherwise_7_117.doEnd();
            _jettag_c_choose_7_39.handleBodyContent(out);
        }
        out = _jettag_c_choose_7_39_saved_out;
        _jettag_c_choose_7_39.doEnd();
        out.write("):");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_8_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_8_5.setRuntimeParent(null);
        _jettag_c_if_8_5.setTagInfo(_td_c_if_8_5);
        _jettag_c_if_8_5.doStart(context, out);
        while (_jettag_c_if_8_5.okToProcessBody()) {
            out.write("    \"\"\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_9_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_9_8.setRuntimeParent(_jettag_c_if_8_5);
            _jettag_c_setVariable_9_8.setTagInfo(_td_c_setVariable_9_8);
            _jettag_c_setVariable_9_8.doStart(context, out);
            _jettag_c_setVariable_9_8.doEnd();
            RuntimeTagElement _jettag_c_include_9_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_9_58.setRuntimeParent(_jettag_c_if_8_5);
            _jettag_c_include_9_58.setTagInfo(_td_c_include_9_58);
            _jettag_c_include_9_58.doStart(context, out);
            _jettag_c_include_9_58.doEnd();
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_8_5.handleBodyContent(out);
        }
        _jettag_c_if_8_5.doEnd();
        out.write(NL);         
        // <c:if test="(count($eClass/eReferences) = 0) and (count($eClass/eAttributes) = 0)">
        //    pass
        //</c:if> 
        RuntimeTagElement _jettag_c_include_16_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_16_5.setRuntimeParent(null);
        _jettag_c_include_16_5.setTagInfo(_td_c_include_16_5);
        _jettag_c_include_16_5.doStart(context, out);
        _jettag_c_include_16_5.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_18_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_18_1.setRuntimeParent(null);
        _jettag_c_iterate_18_1.setTagInfo(_td_c_iterate_18_1);
        _jettag_c_iterate_18_1.doStart(context, out);
        while (_jettag_c_iterate_18_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_19_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_19_1.setRuntimeParent(_jettag_c_iterate_18_1);
            _jettag_c_include_19_1.setTagInfo(_td_c_include_19_1);
            _jettag_c_include_19_1.doStart(context, out);
            _jettag_c_include_19_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_18_1.handleBodyContent(out);
        }
        _jettag_c_iterate_18_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_22_1.setRuntimeParent(null);
        _jettag_c_iterate_22_1.setTagInfo(_td_c_iterate_22_1);
        _jettag_c_iterate_22_1.doStart(context, out);
        while (_jettag_c_iterate_22_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_23_1.setRuntimeParent(_jettag_c_iterate_22_1);
            _jettag_c_include_23_1.setTagInfo(_td_c_include_23_1);
            _jettag_c_include_23_1.doStart(context, out);
            _jettag_c_include_23_1.doEnd();
            _jettag_c_iterate_22_1.handleBodyContent(out);
        }
        _jettag_c_iterate_22_1.doEnd();
    }
}
