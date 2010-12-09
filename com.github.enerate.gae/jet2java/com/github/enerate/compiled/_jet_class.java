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
    
    private static final TagInfo _td_c_get_3_7 = new TagInfo("c:get", //$NON-NLS-1$
            3, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_3_39 = new TagInfo("c:choose", //$NON-NLS-1$
            3, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_3_85 = new TagInfo("c:when", //$NON-NLS-1$
            3, 85,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_3_119 = new TagInfo("c:otherwise", //$NON-NLS-1$
            3, 119,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_3_132 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 132,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
                "eSuperTypeIdx", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_199 = new TagInfo("c:get", //$NON-NLS-1$
            3, 199,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[$eSuperTypeIdx]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_3_258 = new TagInfo("c:if", //$NON-NLS-1$
            3, 258,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperTypeIdx != count($eClass/eSuperTypes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_5 = new TagInfo("c:if", //$NON-NLS-1$
            4, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_9 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 9,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_5_59 = new TagInfo("c:include", //$NON-NLS-1$
            5, 59,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_9_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            9, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_10_11 = new TagInfo("c:get", //$NON-NLS-1$
            10, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_11_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            11, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
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
    private static final TagInfo _td_c_include_14_1 = new TagInfo("c:include", //$NON-NLS-1$
            14, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/attribute.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_11 = new TagInfo("c:get", //$NON-NLS-1$
            18, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_21_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            21, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_22_11 = new TagInfo("c:get", //$NON-NLS-1$
            22, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_23_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            23, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_25_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            25, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_26_1 = new TagInfo("c:include", //$NON-NLS-1$
            26, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/reference.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_30_11 = new TagInfo("c:get", //$NON-NLS-1$
            30, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_33_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            33, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_34_11 = new TagInfo("c:get", //$NON-NLS-1$
            34, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_35_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            35, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_37_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            37, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eOperations", //$NON-NLS-1$
                "eOperation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_38_1 = new TagInfo("c:include", //$NON-NLS-1$
            38, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/operation.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_11 = new TagInfo("c:get", //$NON-NLS-1$
            42, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Classes with no super classes derive from db.Model. 
        out.write("class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_7.setRuntimeParent(null);
        _jettag_c_get_3_7.setTagInfo(_td_c_get_3_7);
        _jettag_c_get_3_7.doStart(context, out);
        _jettag_c_get_3_7.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_choose_3_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_3_39); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_3_39.setRuntimeParent(null);
        _jettag_c_choose_3_39.setTagInfo(_td_c_choose_3_39);
        _jettag_c_choose_3_39.doStart(context, out);
        JET2Writer _jettag_c_choose_3_39_saved_out = out;
        while (_jettag_c_choose_3_39.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_3_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_3_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_3_85.setRuntimeParent(_jettag_c_choose_3_39);
            _jettag_c_when_3_85.setTagInfo(_td_c_when_3_85);
            _jettag_c_when_3_85.doStart(context, out);
            JET2Writer _jettag_c_when_3_85_saved_out = out;
            while (_jettag_c_when_3_85.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("db.Model");  //$NON-NLS-1$        
                _jettag_c_when_3_85.handleBodyContent(out);
            }
            out = _jettag_c_when_3_85_saved_out;
            _jettag_c_when_3_85.doEnd();
            RuntimeTagElement _jettag_c_otherwise_3_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_3_119); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_3_119.setRuntimeParent(_jettag_c_choose_3_39);
            _jettag_c_otherwise_3_119.setTagInfo(_td_c_otherwise_3_119);
            _jettag_c_otherwise_3_119.doStart(context, out);
            JET2Writer _jettag_c_otherwise_3_119_saved_out = out;
            while (_jettag_c_otherwise_3_119.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_iterate_3_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_132); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_3_132.setRuntimeParent(_jettag_c_otherwise_3_119);
                _jettag_c_iterate_3_132.setTagInfo(_td_c_iterate_3_132);
                _jettag_c_iterate_3_132.doStart(context, out);
                while (_jettag_c_iterate_3_132.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_get_3_199 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_199); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_3_199.setRuntimeParent(_jettag_c_iterate_3_132);
                    _jettag_c_get_3_199.setTagInfo(_td_c_get_3_199);
                    _jettag_c_get_3_199.doStart(context, out);
                    _jettag_c_get_3_199.doEnd();
                    RuntimeTagElement _jettag_c_if_3_258 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_258); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_3_258.setRuntimeParent(_jettag_c_iterate_3_132);
                    _jettag_c_if_3_258.setTagInfo(_td_c_if_3_258);
                    _jettag_c_if_3_258.doStart(context, out);
                    while (_jettag_c_if_3_258.okToProcessBody()) {
                        out.write(", ");  //$NON-NLS-1$        
                        _jettag_c_if_3_258.handleBodyContent(out);
                    }
                    _jettag_c_if_3_258.doEnd();
                    _jettag_c_iterate_3_132.handleBodyContent(out);
                }
                _jettag_c_iterate_3_132.doEnd();
                _jettag_c_otherwise_3_119.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_3_119_saved_out;
            _jettag_c_otherwise_3_119.doEnd();
            _jettag_c_choose_3_39.handleBodyContent(out);
        }
        out = _jettag_c_choose_3_39_saved_out;
        _jettag_c_choose_3_39.doEnd();
        out.write("):");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_4_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_4_5.setRuntimeParent(null);
        _jettag_c_if_4_5.setTagInfo(_td_c_if_4_5);
        _jettag_c_if_4_5.doStart(context, out);
        while (_jettag_c_if_4_5.okToProcessBody()) {
            out.write("    \"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_5_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_5_9.setRuntimeParent(_jettag_c_if_4_5);
            _jettag_c_setVariable_5_9.setTagInfo(_td_c_setVariable_5_9);
            _jettag_c_setVariable_5_9.doStart(context, out);
            _jettag_c_setVariable_5_9.doEnd();
            RuntimeTagElement _jettag_c_include_5_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_5_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_5_59.setRuntimeParent(_jettag_c_if_4_5);
            _jettag_c_include_5_59.setTagInfo(_td_c_include_5_59);
            _jettag_c_include_5_59.doStart(context, out);
            _jettag_c_include_5_59.doEnd();
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_4_5.handleBodyContent(out);
        }
        _jettag_c_if_4_5.doEnd();
        //    <c:if test="(count($eClass/eReferences) = 0) and (count($eClass/eAttributes) = 0)">pass</c:if>
        RuntimeTagElement _jettag_c_userRegion_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_9_1.setRuntimeParent(null);
        _jettag_c_userRegion_9_1.setTagInfo(_td_c_userRegion_9_1);
        _jettag_c_userRegion_9_1.doStart(context, out);
        while (_jettag_c_userRegion_9_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_10_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_10_11.setRuntimeParent(_jettag_c_userRegion_9_1);
            _jettag_c_get_10_11.setTagInfo(_td_c_get_10_11);
            _jettag_c_get_10_11.doStart(context, out);
            _jettag_c_get_10_11.doEnd();
            out.write(".attributes");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_11_1.setRuntimeParent(_jettag_c_userRegion_9_1);
            _jettag_c_initialCode_11_1.setTagInfo(_td_c_initialCode_11_1);
            _jettag_c_initialCode_11_1.doStart(context, out);
            while (_jettag_c_initialCode_11_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_13_1.setRuntimeParent(_jettag_c_initialCode_11_1);
                _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
                _jettag_c_iterate_13_1.doStart(context, out);
                while (_jettag_c_iterate_13_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_include_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_14_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_14_1.setRuntimeParent(_jettag_c_iterate_13_1);
                    _jettag_c_include_14_1.setTagInfo(_td_c_include_14_1);
                    _jettag_c_include_14_1.doStart(context, out);
                    _jettag_c_include_14_1.doEnd();
                    out.write(NL);         
                    _jettag_c_iterate_13_1.handleBodyContent(out);
                }
                _jettag_c_iterate_13_1.doEnd();
                _jettag_c_initialCode_11_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_11_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_18_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_11.setRuntimeParent(_jettag_c_userRegion_9_1);
            _jettag_c_get_18_11.setTagInfo(_td_c_get_18_11);
            _jettag_c_get_18_11.doStart(context, out);
            _jettag_c_get_18_11.doEnd();
            out.write(".attributes");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_9_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_9_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_21_1.setRuntimeParent(null);
        _jettag_c_userRegion_21_1.setTagInfo(_td_c_userRegion_21_1);
        _jettag_c_userRegion_21_1.doStart(context, out);
        while (_jettag_c_userRegion_21_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_22_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_22_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_22_11.setRuntimeParent(_jettag_c_userRegion_21_1);
            _jettag_c_get_22_11.setTagInfo(_td_c_get_22_11);
            _jettag_c_get_22_11.doStart(context, out);
            _jettag_c_get_22_11.doEnd();
            out.write(".references");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_23_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_23_1.setRuntimeParent(_jettag_c_userRegion_21_1);
            _jettag_c_initialCode_23_1.setTagInfo(_td_c_initialCode_23_1);
            _jettag_c_initialCode_23_1.doStart(context, out);
            while (_jettag_c_initialCode_23_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_25_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_25_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_25_1.setRuntimeParent(_jettag_c_initialCode_23_1);
                _jettag_c_iterate_25_1.setTagInfo(_td_c_iterate_25_1);
                _jettag_c_iterate_25_1.doStart(context, out);
                while (_jettag_c_iterate_25_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_include_26_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_26_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_26_1.setRuntimeParent(_jettag_c_iterate_25_1);
                    _jettag_c_include_26_1.setTagInfo(_td_c_include_26_1);
                    _jettag_c_include_26_1.doStart(context, out);
                    _jettag_c_include_26_1.doEnd();
                    out.write(NL);         
                    _jettag_c_iterate_25_1.handleBodyContent(out);
                }
                _jettag_c_iterate_25_1.doEnd();
                _jettag_c_initialCode_23_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_23_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_30_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_30_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_30_11.setRuntimeParent(_jettag_c_userRegion_21_1);
            _jettag_c_get_30_11.setTagInfo(_td_c_get_30_11);
            _jettag_c_get_30_11.doStart(context, out);
            _jettag_c_get_30_11.doEnd();
            out.write(".references");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_21_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_21_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_33_1.setRuntimeParent(null);
        _jettag_c_userRegion_33_1.setTagInfo(_td_c_userRegion_33_1);
        _jettag_c_userRegion_33_1.doStart(context, out);
        while (_jettag_c_userRegion_33_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_34_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_34_11.setRuntimeParent(_jettag_c_userRegion_33_1);
            _jettag_c_get_34_11.setTagInfo(_td_c_get_34_11);
            _jettag_c_get_34_11.doStart(context, out);
            _jettag_c_get_34_11.doEnd();
            out.write(".operations");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_35_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_35_1.setRuntimeParent(_jettag_c_userRegion_33_1);
            _jettag_c_initialCode_35_1.setTagInfo(_td_c_initialCode_35_1);
            _jettag_c_initialCode_35_1.doStart(context, out);
            while (_jettag_c_initialCode_35_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_37_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_37_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_37_1.setRuntimeParent(_jettag_c_initialCode_35_1);
                _jettag_c_iterate_37_1.setTagInfo(_td_c_iterate_37_1);
                _jettag_c_iterate_37_1.doStart(context, out);
                while (_jettag_c_iterate_37_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_include_38_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_38_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_38_1.setRuntimeParent(_jettag_c_iterate_37_1);
                    _jettag_c_include_38_1.setTagInfo(_td_c_include_38_1);
                    _jettag_c_include_38_1.doStart(context, out);
                    _jettag_c_include_38_1.doEnd();
                    out.write(NL);         
                    _jettag_c_iterate_37_1.handleBodyContent(out);
                }
                _jettag_c_iterate_37_1.doEnd();
                _jettag_c_initialCode_35_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_35_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_42_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_42_11.setRuntimeParent(_jettag_c_userRegion_33_1);
            _jettag_c_get_42_11.setTagInfo(_td_c_get_42_11);
            _jettag_c_get_42_11.doStart(context, out);
            _jettag_c_get_42_11.doEnd();
            out.write(".operations");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_33_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_33_1.doEnd();
    }
}
