package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_class implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_class() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_4_7 = new TagInfo("c:get", //$NON-NLS-1$
            4, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_4_39 = new TagInfo("c:choose", //$NON-NLS-1$
            4, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_4_85 = new TagInfo("c:when", //$NON-NLS-1$
            4, 85,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_4_117 = new TagInfo("c:otherwise", //$NON-NLS-1$
            4, 117,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_4_130 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 130,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
                "eSuperTypeIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_197 = new TagInfo("c:get", //$NON-NLS-1$
            4, 197,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[$eSuperTypeIdx]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_256 = new TagInfo("c:if", //$NON-NLS-1$
            4, 256,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperTypeIdx != count($eClass/eSuperTypes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_5 = new TagInfo("c:if", //$NON-NLS-1$
            5, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_9 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 9,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_6_59 = new TagInfo("c:include", //$NON-NLS-1$
            6, 59,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_9_1 = new TagInfo("c:if", //$NON-NLS-1$
            9, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "(count($eClass/eReferences) = 0) and (count($eClass/eAttributes) = 0)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_12_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            12, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_13_11 = new TagInfo("c:get", //$NON-NLS-1$
            13, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_14_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            14, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_5 = new TagInfo("c:include", //$NON-NLS-1$
            16, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/init.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_11 = new TagInfo("c:get", //$NON-NLS-1$
            18, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_22_1 = new TagInfo("c:include", //$NON-NLS-1$
            22, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/reference.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eOperations", //$NON-NLS-1$
                "eOperation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_26_1 = new TagInfo("c:include", //$NON-NLS-1$
            26, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/operation.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_29_1 = new TagInfo("c:include", //$NON-NLS-1$
            29, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/serialize.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // Classes with no super classes derive from HasTraits. 
        out.write("class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_7.setRuntimeParent(null);
        _jettag_c_get_4_7.setTagInfo(_td_c_get_4_7);
        _jettag_c_get_4_7.doStart(context, out);
        _jettag_c_get_4_7.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_choose_4_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_4_39); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_4_39.setRuntimeParent(null);
        _jettag_c_choose_4_39.setTagInfo(_td_c_choose_4_39);
        _jettag_c_choose_4_39.doStart(context, out);
        JET2Writer _jettag_c_choose_4_39_saved_out = out;
        while (_jettag_c_choose_4_39.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_4_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_4_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_4_85.setRuntimeParent(_jettag_c_choose_4_39);
            _jettag_c_when_4_85.setTagInfo(_td_c_when_4_85);
            _jettag_c_when_4_85.doStart(context, out);
            JET2Writer _jettag_c_when_4_85_saved_out = out;
            while (_jettag_c_when_4_85.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("object");  //$NON-NLS-1$        
                _jettag_c_when_4_85.handleBodyContent(out);
            }
            out = _jettag_c_when_4_85_saved_out;
            _jettag_c_when_4_85.doEnd();
            RuntimeTagElement _jettag_c_otherwise_4_117 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_4_117); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_4_117.setRuntimeParent(_jettag_c_choose_4_39);
            _jettag_c_otherwise_4_117.setTagInfo(_td_c_otherwise_4_117);
            _jettag_c_otherwise_4_117.doStart(context, out);
            JET2Writer _jettag_c_otherwise_4_117_saved_out = out;
            while (_jettag_c_otherwise_4_117.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_4_130 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_130); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_4_130.setRuntimeParent(_jettag_c_otherwise_4_117);
                _jettag_c_iterate_4_130.setTagInfo(_td_c_iterate_4_130);
                _jettag_c_iterate_4_130.doStart(context, out);
                while (_jettag_c_iterate_4_130.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_4_197 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_197); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_4_197.setRuntimeParent(_jettag_c_iterate_4_130);
                    _jettag_c_get_4_197.setTagInfo(_td_c_get_4_197);
                    _jettag_c_get_4_197.doStart(context, out);
                    _jettag_c_get_4_197.doEnd();
                    RuntimeTagElement _jettag_c_if_4_256 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_256); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_4_256.setRuntimeParent(_jettag_c_iterate_4_130);
                    _jettag_c_if_4_256.setTagInfo(_td_c_if_4_256);
                    _jettag_c_if_4_256.doStart(context, out);
                    while (_jettag_c_if_4_256.okToProcessBody()) {
                        out.write(", ");  //$NON-NLS-1$        
                        _jettag_c_if_4_256.handleBodyContent(out);
                    }
                    _jettag_c_if_4_256.doEnd();
                    _jettag_c_iterate_4_130.handleBodyContent(out);
                }
                _jettag_c_iterate_4_130.doEnd();
                _jettag_c_otherwise_4_117.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_4_117_saved_out;
            _jettag_c_otherwise_4_117.doEnd();
            _jettag_c_choose_4_39.handleBodyContent(out);
        }
        out = _jettag_c_choose_4_39_saved_out;
        _jettag_c_choose_4_39.doEnd();
        out.write("):");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_5_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_5.setRuntimeParent(null);
        _jettag_c_if_5_5.setTagInfo(_td_c_if_5_5);
        _jettag_c_if_5_5.doStart(context, out);
        while (_jettag_c_if_5_5.okToProcessBody()) {
            out.write("    \"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_6_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_6_9.setRuntimeParent(_jettag_c_if_5_5);
            _jettag_c_setVariable_6_9.setTagInfo(_td_c_setVariable_6_9);
            _jettag_c_setVariable_6_9.doStart(context, out);
            _jettag_c_setVariable_6_9.doEnd();
            RuntimeTagElement _jettag_c_include_6_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_6_59.setRuntimeParent(_jettag_c_if_5_5);
            _jettag_c_include_6_59.setTagInfo(_td_c_include_6_59);
            _jettag_c_include_6_59.doStart(context, out);
            _jettag_c_include_6_59.doEnd();
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_5_5.handleBodyContent(out);
        }
        _jettag_c_if_5_5.doEnd();
        RuntimeTagElement _jettag_c_if_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_9_1.setRuntimeParent(null);
        _jettag_c_if_9_1.setTagInfo(_td_c_if_9_1);
        _jettag_c_if_9_1.doStart(context, out);
        while (_jettag_c_if_9_1.okToProcessBody()) {
            out.write("    pass");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_9_1.handleBodyContent(out);
        }
        _jettag_c_if_9_1.doEnd();
        RuntimeTagElement _jettag_c_userRegion_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_12_1.setRuntimeParent(null);
        _jettag_c_userRegion_12_1.setTagInfo(_td_c_userRegion_12_1);
        _jettag_c_userRegion_12_1.doStart(context, out);
        while (_jettag_c_userRegion_12_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_13_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_13_11.setRuntimeParent(_jettag_c_userRegion_12_1);
            _jettag_c_get_13_11.setTagInfo(_td_c_get_13_11);
            _jettag_c_get_13_11.doStart(context, out);
            _jettag_c_get_13_11.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_14_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_14_1.setRuntimeParent(_jettag_c_userRegion_12_1);
            _jettag_c_initialCode_14_1.setTagInfo(_td_c_initialCode_14_1);
            _jettag_c_initialCode_14_1.doStart(context, out);
            while (_jettag_c_initialCode_14_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_16_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_16_5.setRuntimeParent(_jettag_c_initialCode_14_1);
                _jettag_c_include_16_5.setTagInfo(_td_c_include_16_5);
                _jettag_c_include_16_5.doStart(context, out);
                _jettag_c_include_16_5.doEnd();
                _jettag_c_initialCode_14_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_14_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_18_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_11.setRuntimeParent(_jettag_c_userRegion_12_1);
            _jettag_c_get_18_11.setTagInfo(_td_c_get_18_11);
            _jettag_c_get_18_11.doStart(context, out);
            _jettag_c_get_18_11.doEnd();
            out.write(NL);         
            _jettag_c_userRegion_12_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_12_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_21_1.setRuntimeParent(null);
        _jettag_c_iterate_21_1.setTagInfo(_td_c_iterate_21_1);
        _jettag_c_iterate_21_1.doStart(context, out);
        while (_jettag_c_iterate_21_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_22_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_22_1.setRuntimeParent(_jettag_c_iterate_21_1);
            _jettag_c_include_22_1.setTagInfo(_td_c_include_22_1);
            _jettag_c_include_22_1.doStart(context, out);
            _jettag_c_include_22_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_21_1.handleBodyContent(out);
        }
        _jettag_c_iterate_21_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_25_1.setRuntimeParent(null);
        _jettag_c_iterate_25_1.setTagInfo(_td_c_iterate_25_1);
        _jettag_c_iterate_25_1.doStart(context, out);
        while (_jettag_c_iterate_25_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_26_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_26_1.setRuntimeParent(_jettag_c_iterate_25_1);
            _jettag_c_include_26_1.setTagInfo(_td_c_include_26_1);
            _jettag_c_include_26_1.doStart(context, out);
            _jettag_c_include_26_1.doEnd();
            _jettag_c_iterate_25_1.handleBodyContent(out);
        }
        _jettag_c_iterate_25_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_29_1.setRuntimeParent(null);
        _jettag_c_include_29_1.setTagInfo(_td_c_include_29_1);
        _jettag_c_include_29_1.doStart(context, out);
        _jettag_c_include_29_1.doEnd();
    }
}
