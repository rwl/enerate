package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_operation implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_operation() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_userRegion_1_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            1, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_2_11 = new TagInfo("c:get", //$NON-NLS-1$
            2, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eOperation/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_3_5 = new TagInfo("c:initialCode", //$NON-NLS-1$
            3, 5,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eOperation/EGenericType/eClassifier/@name", //$NON-NLS-1$
                "returnType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_5 = new TagInfo("c:if", //$NON-NLS-1$
            6, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$returnType = $eOperation/eContainingClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_9 = new TagInfo("c:get", //$NON-NLS-1$
            9, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eOperation/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_9_57 = new TagInfo("c:choose", //$NON-NLS-1$
            9, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$returnType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_10_3 = new TagInfo("c:when", //$NON-NLS-1$
            10, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eOperation/eContainingClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_11_3 = new TagInfo("c:otherwise", //$NON-NLS-1$
            11, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_iterate_12_12 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 12,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eOperation/eParameters", //$NON-NLS-1$
                "eParameter", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_12_73 = new TagInfo("c:choose", //$NON-NLS-1$
            12, 73,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_13_3 = new TagInfo("c:when", //$NON-NLS-1$
            13, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eParameter/@upperBound > 1", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_49 = new TagInfo("c:get", //$NON-NLS-1$
            13, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eParameter/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_14_3 = new TagInfo("c:when", //$NON-NLS-1$
            14, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eParameter/eType/@name = 'EMap'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_55 = new TagInfo("c:get", //$NON-NLS-1$
            14, 55,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eParameter/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_15_3 = new TagInfo("c:otherwise", //$NON-NLS-1$
            15, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_15_18 = new TagInfo("c:get", //$NON-NLS-1$
            15, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eParameter/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_13 = new TagInfo("c:if", //$NON-NLS-1$
            17, 13,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eOperation/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_62 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 62,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eOperation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_18_9 = new TagInfo("c:include", //$NON-NLS-1$
            18, 9,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_11 = new TagInfo("c:get", //$NON-NLS-1$
            24, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eOperation/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_userRegion_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_1_1.setRuntimeParent(null);
        _jettag_c_userRegion_1_1.setTagInfo(_td_c_userRegion_1_1);
        _jettag_c_userRegion_1_1.doStart(context, out);
        while (_jettag_c_userRegion_1_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_2_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_11.setRuntimeParent(_jettag_c_userRegion_1_1);
            _jettag_c_get_2_11.setTagInfo(_td_c_get_2_11);
            _jettag_c_get_2_11.doStart(context, out);
            _jettag_c_get_2_11.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_3_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_3_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_3_5.setRuntimeParent(_jettag_c_userRegion_1_1);
            _jettag_c_initialCode_3_5.setTagInfo(_td_c_initialCode_3_5);
            _jettag_c_initialCode_3_5.doStart(context, out);
            while (_jettag_c_initialCode_3_5.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_4_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_4_5.setRuntimeParent(_jettag_c_initialCode_3_5);
                _jettag_c_setVariable_4_5.setTagInfo(_td_c_setVariable_4_5);
                _jettag_c_setVariable_4_5.doStart(context, out);
                _jettag_c_setVariable_4_5.doEnd();
                // Define a class method if it returns an instance of the parent class. 
                RuntimeTagElement _jettag_c_if_6_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_6_5.setRuntimeParent(_jettag_c_initialCode_3_5);
                _jettag_c_if_6_5.setTagInfo(_td_c_if_6_5);
                _jettag_c_if_6_5.doStart(context, out);
                while (_jettag_c_if_6_5.okToProcessBody()) {
                    out.write("    @classmethod");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_6_5.handleBodyContent(out);
                }
                _jettag_c_if_6_5.doEnd();
                out.write("    def ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_9.setRuntimeParent(_jettag_c_initialCode_3_5);
                _jettag_c_get_9_9.setTagInfo(_td_c_get_9_9);
                _jettag_c_get_9_9.doStart(context, out);
                _jettag_c_get_9_9.doEnd();
                out.write("(");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_choose_9_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_9_57); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_9_57.setRuntimeParent(_jettag_c_initialCode_3_5);
                _jettag_c_choose_9_57.setTagInfo(_td_c_choose_9_57);
                _jettag_c_choose_9_57.doStart(context, out);
                JET2Writer _jettag_c_choose_9_57_saved_out = out;
                while (_jettag_c_choose_9_57.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write(NL);         
                    out.write("  ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_when_10_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_10_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_10_3.setRuntimeParent(_jettag_c_choose_9_57);
                    _jettag_c_when_10_3.setTagInfo(_td_c_when_10_3);
                    _jettag_c_when_10_3.doStart(context, out);
                    JET2Writer _jettag_c_when_10_3_saved_out = out;
                    while (_jettag_c_when_10_3.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("cls");  //$NON-NLS-1$        
                        _jettag_c_when_10_3.handleBodyContent(out);
                    }
                    out = _jettag_c_when_10_3_saved_out;
                    _jettag_c_when_10_3.doEnd();
                    out.write(NL);         
                    out.write("  ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_otherwise_11_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_11_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_11_3.setRuntimeParent(_jettag_c_choose_9_57);
                    _jettag_c_otherwise_11_3.setTagInfo(_td_c_otherwise_11_3);
                    _jettag_c_otherwise_11_3.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_11_3_saved_out = out;
                    while (_jettag_c_otherwise_11_3.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("self");  //$NON-NLS-1$        
                        _jettag_c_otherwise_11_3.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_11_3_saved_out;
                    _jettag_c_otherwise_11_3.doEnd();
                    out.write(NL);         
                    _jettag_c_choose_9_57.handleBodyContent(out);
                }
                out = _jettag_c_choose_9_57_saved_out;
                _jettag_c_choose_9_57.doEnd();
                RuntimeTagElement _jettag_c_iterate_12_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_12); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_12_12.setRuntimeParent(_jettag_c_initialCode_3_5);
                _jettag_c_iterate_12_12.setTagInfo(_td_c_iterate_12_12);
                _jettag_c_iterate_12_12.doStart(context, out);
                while (_jettag_c_iterate_12_12.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_choose_12_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_12_73); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_choose_12_73.setRuntimeParent(_jettag_c_iterate_12_12);
                    _jettag_c_choose_12_73.setTagInfo(_td_c_choose_12_73);
                    _jettag_c_choose_12_73.doStart(context, out);
                    JET2Writer _jettag_c_choose_12_73_saved_out = out;
                    while (_jettag_c_choose_12_73.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        out.write("  ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_when_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_13_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_13_3.setRuntimeParent(_jettag_c_choose_12_73);
                        _jettag_c_when_13_3.setTagInfo(_td_c_when_13_3);
                        _jettag_c_when_13_3.doStart(context, out);
                        JET2Writer _jettag_c_when_13_3_saved_out = out;
                        while (_jettag_c_when_13_3.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write(", *");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_13_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_49); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_13_49.setRuntimeParent(_jettag_c_when_13_3);
                            _jettag_c_get_13_49.setTagInfo(_td_c_get_13_49);
                            _jettag_c_get_13_49.doStart(context, out);
                            _jettag_c_get_13_49.doEnd();
                            _jettag_c_when_13_3.handleBodyContent(out);
                        }
                        out = _jettag_c_when_13_3_saved_out;
                        _jettag_c_when_13_3.doEnd();
                        out.write(NL);         
                        out.write("  ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_when_14_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_14_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_when_14_3.setRuntimeParent(_jettag_c_choose_12_73);
                        _jettag_c_when_14_3.setTagInfo(_td_c_when_14_3);
                        _jettag_c_when_14_3.doStart(context, out);
                        JET2Writer _jettag_c_when_14_3_saved_out = out;
                        while (_jettag_c_when_14_3.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write(", **");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_14_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_55); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_14_55.setRuntimeParent(_jettag_c_when_14_3);
                            _jettag_c_get_14_55.setTagInfo(_td_c_get_14_55);
                            _jettag_c_get_14_55.doStart(context, out);
                            _jettag_c_get_14_55.doEnd();
                            _jettag_c_when_14_3.handleBodyContent(out);
                        }
                        out = _jettag_c_when_14_3_saved_out;
                        _jettag_c_when_14_3.doEnd();
                        out.write(NL);         
                        out.write("  ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_otherwise_15_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_15_3); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_otherwise_15_3.setRuntimeParent(_jettag_c_choose_12_73);
                        _jettag_c_otherwise_15_3.setTagInfo(_td_c_otherwise_15_3);
                        _jettag_c_otherwise_15_3.doStart(context, out);
                        JET2Writer _jettag_c_otherwise_15_3_saved_out = out;
                        while (_jettag_c_otherwise_15_3.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            out.write(", ");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_c_get_15_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_18); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_get_15_18.setRuntimeParent(_jettag_c_otherwise_15_3);
                            _jettag_c_get_15_18.setTagInfo(_td_c_get_15_18);
                            _jettag_c_get_15_18.doStart(context, out);
                            _jettag_c_get_15_18.doEnd();
                            _jettag_c_otherwise_15_3.handleBodyContent(out);
                        }
                        out = _jettag_c_otherwise_15_3_saved_out;
                        _jettag_c_otherwise_15_3.doEnd();
                        out.write(NL);         
                        _jettag_c_choose_12_73.handleBodyContent(out);
                    }
                    out = _jettag_c_choose_12_73_saved_out;
                    _jettag_c_choose_12_73.doEnd();
                    _jettag_c_iterate_12_12.handleBodyContent(out);
                }
                _jettag_c_iterate_12_12.doEnd();
                out.write("):");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\" ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_if_17_13 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_13); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_17_13.setRuntimeParent(_jettag_c_initialCode_3_5);
                _jettag_c_if_17_13.setTagInfo(_td_c_if_17_13);
                _jettag_c_if_17_13.doStart(context, out);
                while (_jettag_c_if_17_13.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_17_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_62); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_17_62.setRuntimeParent(_jettag_c_if_17_13);
                    _jettag_c_setVariable_17_62.setTagInfo(_td_c_setVariable_17_62);
                    _jettag_c_setVariable_17_62.doStart(context, out);
                    _jettag_c_setVariable_17_62.doEnd();
                    RuntimeTagElement _jettag_c_include_18_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_18_9); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_18_9.setRuntimeParent(_jettag_c_if_17_13);
                    _jettag_c_include_18_9.setTagInfo(_td_c_include_18_9);
                    _jettag_c_include_18_9.doStart(context, out);
                    _jettag_c_include_18_9.doEnd();
                    out.write(NL);         
                    out.write("            ");  //$NON-NLS-1$        
                    _jettag_c_if_17_13.handleBodyContent(out);
                }
                _jettag_c_if_17_13.doEnd();
                out.write("@generated");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        \"\"\"");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("        pass");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_initialCode_3_5.handleBodyContent(out);
            }
            _jettag_c_initialCode_3_5.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_24_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_24_11.setRuntimeParent(_jettag_c_userRegion_1_1);
            _jettag_c_get_24_11.setTagInfo(_td_c_get_24_11);
            _jettag_c_get_24_11.doStart(context, out);
            _jettag_c_get_24_11.doEnd();
            out.write(NL);         
            _jettag_c_userRegion_1_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_1_1.doEnd();
    }
}
