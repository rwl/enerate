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
    
    private static final TagInfo _td_c_get_4_5 = new TagInfo("c:get", //$NON-NLS-1$
            4, 5,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
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
    private static final TagInfo _td_c_otherwise_7_120 = new TagInfo("c:otherwise", //$NON-NLS-1$
            7, 120,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_7_133 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 133,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
                "eSuperTypeIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_200 = new TagInfo("c:get", //$NON-NLS-1$
            7, 200,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[$eSuperTypeIdx]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_259 = new TagInfo("c:if", //$NON-NLS-1$
            7, 259,
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
    private static final TagInfo _td_c_setVariable_9_9 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 9,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_59 = new TagInfo("c:include", //$NON-NLS-1$
            9, 59,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_1 = new TagInfo("c:if", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eReferences) = 0 and count($eClass/eAttributes) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_20_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            20, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_21_1 = new TagInfo("c:include", //$NON-NLS-1$
            21, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/reference.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_24_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            24, 1,
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
                "templates/attribute.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_28_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            28, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_30_15 = new TagInfo("c:get", //$NON-NLS-1$
            30, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_32_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            32, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_35_19 = new TagInfo("c:include", //$NON-NLS-1$
            35, 19,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/view.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_13 = new TagInfo("c:get", //$NON-NLS-1$
            38, 13,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eOperations", //$NON-NLS-1$
                "eOperation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_42_1 = new TagInfo("c:include", //$NON-NLS-1$
            42, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/operation.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Classes with no super classes derive from HasTraits. 
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#  \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_5.setRuntimeParent(null);
        _jettag_c_get_4_5.setTagInfo(_td_c_get_4_5);
        _jettag_c_get_4_5.doStart(context, out);
        _jettag_c_get_4_5.doEnd();
        out.write("\" class:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
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
                out.write("HasTraits");  //$NON-NLS-1$        
                _jettag_c_when_7_85.handleBodyContent(out);
            }
            out = _jettag_c_when_7_85_saved_out;
            _jettag_c_when_7_85.doEnd();
            RuntimeTagElement _jettag_c_otherwise_7_120 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_7_120); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_7_120.setRuntimeParent(_jettag_c_choose_7_39);
            _jettag_c_otherwise_7_120.setTagInfo(_td_c_otherwise_7_120);
            _jettag_c_otherwise_7_120.doStart(context, out);
            JET2Writer _jettag_c_otherwise_7_120_saved_out = out;
            while (_jettag_c_otherwise_7_120.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_7_133 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_133); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_7_133.setRuntimeParent(_jettag_c_otherwise_7_120);
                _jettag_c_iterate_7_133.setTagInfo(_td_c_iterate_7_133);
                _jettag_c_iterate_7_133.doStart(context, out);
                while (_jettag_c_iterate_7_133.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_7_200 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_200); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_7_200.setRuntimeParent(_jettag_c_iterate_7_133);
                    _jettag_c_get_7_200.setTagInfo(_td_c_get_7_200);
                    _jettag_c_get_7_200.doStart(context, out);
                    _jettag_c_get_7_200.doEnd();
                    RuntimeTagElement _jettag_c_if_7_259 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_259); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_7_259.setRuntimeParent(_jettag_c_iterate_7_133);
                    _jettag_c_if_7_259.setTagInfo(_td_c_if_7_259);
                    _jettag_c_if_7_259.doStart(context, out);
                    while (_jettag_c_if_7_259.okToProcessBody()) {
                        out.write(", ");  //$NON-NLS-1$        
                        _jettag_c_if_7_259.handleBodyContent(out);
                    }
                    _jettag_c_if_7_259.doEnd();
                    _jettag_c_iterate_7_133.handleBodyContent(out);
                }
                _jettag_c_iterate_7_133.doEnd();
                _jettag_c_otherwise_7_120.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_7_120_saved_out;
            _jettag_c_otherwise_7_120.doEnd();
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
            out.write("    \"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_9_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_9_9.setRuntimeParent(_jettag_c_if_8_5);
            _jettag_c_setVariable_9_9.setTagInfo(_td_c_setVariable_9_9);
            _jettag_c_setVariable_9_9.doStart(context, out);
            _jettag_c_setVariable_9_9.doEnd();
            RuntimeTagElement _jettag_c_include_9_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_9_59.setRuntimeParent(_jettag_c_if_8_5);
            _jettag_c_include_9_59.setTagInfo(_td_c_include_9_59);
            _jettag_c_include_9_59.doStart(context, out);
            _jettag_c_include_9_59.doEnd();
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #  Trait definitions:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            _jettag_c_if_8_5.handleBodyContent(out);
        }
        _jettag_c_if_8_5.doEnd();
        RuntimeTagElement _jettag_c_if_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_17_1.setRuntimeParent(null);
        _jettag_c_if_17_1.setTagInfo(_td_c_if_17_1);
        _jettag_c_if_17_1.doStart(context, out);
        while (_jettag_c_if_17_1.okToProcessBody()) {
            out.write("    pass");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_17_1.handleBodyContent(out);
        }
        _jettag_c_if_17_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_20_1.setRuntimeParent(null);
        _jettag_c_iterate_20_1.setTagInfo(_td_c_iterate_20_1);
        _jettag_c_iterate_20_1.doStart(context, out);
        while (_jettag_c_iterate_20_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_21_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_21_1.setRuntimeParent(_jettag_c_iterate_20_1);
            _jettag_c_include_21_1.setTagInfo(_td_c_include_21_1);
            _jettag_c_include_21_1.doStart(context, out);
            _jettag_c_include_21_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_20_1.handleBodyContent(out);
        }
        _jettag_c_iterate_20_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_24_1.setRuntimeParent(null);
        _jettag_c_iterate_24_1.setTagInfo(_td_c_iterate_24_1);
        _jettag_c_iterate_24_1.doStart(context, out);
        while (_jettag_c_iterate_24_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_25_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_25_1.setRuntimeParent(_jettag_c_iterate_24_1);
            _jettag_c_include_25_1.setTagInfo(_td_c_include_25_1);
            _jettag_c_include_25_1.doStart(context, out);
            _jettag_c_include_25_1.doEnd();
            out.write(NL);         
            _jettag_c_iterate_24_1.handleBodyContent(out);
        }
        _jettag_c_iterate_24_1.doEnd();
        RuntimeTagElement _jettag_c_userRegion_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_28_1.setRuntimeParent(null);
        _jettag_c_userRegion_28_1.setTagInfo(_td_c_userRegion_28_1);
        _jettag_c_userRegion_28_1.doStart(context, out);
        while (_jettag_c_userRegion_28_1.okToProcessBody()) {
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #  Begin \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_30_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_15.setRuntimeParent(_jettag_c_userRegion_28_1);
            _jettag_c_get_30_15.setTagInfo(_td_c_get_30_15);
            _jettag_c_get_30_15.doStart(context, out);
            _jettag_c_get_30_15.doEnd();
            out.write("\" user definitions:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_32_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_32_1.setRuntimeParent(_jettag_c_userRegion_28_1);
            _jettag_c_initialCode_32_1.setTagInfo(_td_c_initialCode_32_1);
            _jettag_c_initialCode_32_1.doStart(context, out);
            while (_jettag_c_initialCode_32_1.okToProcessBody()) {
                out.write(NL);         
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    traits_view = ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_35_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_35_19); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_35_19.setRuntimeParent(_jettag_c_initialCode_32_1);
                _jettag_c_include_35_19.setTagInfo(_td_c_include_35_19);
                _jettag_c_include_35_19.doStart(context, out);
                _jettag_c_include_35_19.doEnd();
                out.write(NL);         
                _jettag_c_initialCode_32_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_32_1.doEnd();
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #  End \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_38_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_13); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_38_13.setRuntimeParent(_jettag_c_userRegion_28_1);
            _jettag_c_get_38_13.setTagInfo(_td_c_get_38_13);
            _jettag_c_get_38_13.doStart(context, out);
            _jettag_c_get_38_13.doEnd();
            out.write("\" user definitions:");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    #--------------------------------------------------------------------------");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_28_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_28_1.doEnd();
        RuntimeTagElement _jettag_c_iterate_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_41_1.setRuntimeParent(null);
        _jettag_c_iterate_41_1.setTagInfo(_td_c_iterate_41_1);
        _jettag_c_iterate_41_1.doStart(context, out);
        while (_jettag_c_iterate_41_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_42_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_42_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_42_1.setRuntimeParent(_jettag_c_iterate_41_1);
            _jettag_c_include_42_1.setTagInfo(_td_c_include_42_1);
            _jettag_c_include_42_1.doStart(context, out);
            _jettag_c_include_42_1.doEnd();
            _jettag_c_iterate_41_1.handleBodyContent(out);
        }
        _jettag_c_iterate_41_1.doEnd();
    }
}
