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
    
    private static final TagInfo _td_c_include_3_1 = new TagInfo("c:include", //$NON-NLS-1$
            3, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_1 = new TagInfo("c:if", //$NON-NLS-1$
            6, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_7_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            7, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_7_55 = new TagInfo("c:include", //$NON-NLS-1$
            7, 55,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_1 = new TagInfo("c:include", //$NON-NLS-1$
            11, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/import.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_7 = new TagInfo("c:get", //$NON-NLS-1$
            14, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_14_39 = new TagInfo("c:choose", //$NON-NLS-1$
            14, 39,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_14_85 = new TagInfo("c:when", //$NON-NLS-1$
            14, 85,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_14_119 = new TagInfo("c:otherwise", //$NON-NLS-1$
            14, 119,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_14_132 = new TagInfo("c:get", //$NON-NLS-1$
            14, 132,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_15_5 = new TagInfo("c:if", //$NON-NLS-1$
            15, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_16_9 = new TagInfo("c:setVariable", //$NON-NLS-1$
            16, 9,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_59 = new TagInfo("c:include", //$NON-NLS-1$
            16, 59,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_20_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            20, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_21_11 = new TagInfo("c:get", //$NON-NLS-1$
            21, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_22_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            22, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
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
    private static final TagInfo _td_c_get_29_11 = new TagInfo("c:get", //$NON-NLS-1$
            29, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_32_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            32, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_33_11 = new TagInfo("c:get", //$NON-NLS-1$
            33, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_34_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            34, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_36_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            36, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_37_1 = new TagInfo("c:include", //$NON-NLS-1$
            37, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/reference.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_11 = new TagInfo("c:get", //$NON-NLS-1$
            41, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_44_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            44, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_45_11 = new TagInfo("c:get", //$NON-NLS-1$
            45, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_46_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            46, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_48_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            48, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eOperations", //$NON-NLS-1$
                "eOperation", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_49_1 = new TagInfo("c:include", //$NON-NLS-1$
            49, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/operation.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_53_11 = new TagInfo("c:get", //$NON-NLS-1$
            53, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eClass/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_3_1.setRuntimeParent(null);
        _jettag_c_include_3_1.setTagInfo(_td_c_include_3_1);
        _jettag_c_include_3_1.doStart(context, out);
        _jettag_c_include_3_1.doEnd();
        out.write("#------------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_6_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_1.setRuntimeParent(null);
        _jettag_c_if_6_1.setTagInfo(_td_c_if_6_1);
        _jettag_c_if_6_1.doStart(context, out);
        while (_jettag_c_if_6_1.okToProcessBody()) {
            out.write("\"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_7_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_7_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_7_5.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_setVariable_7_5.setTagInfo(_td_c_setVariable_7_5);
            _jettag_c_setVariable_7_5.doStart(context, out);
            _jettag_c_setVariable_7_5.doEnd();
            RuntimeTagElement _jettag_c_include_7_55 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_7_55); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_7_55.setRuntimeParent(_jettag_c_if_6_1);
            _jettag_c_include_7_55.setTagInfo(_td_c_include_7_55);
            _jettag_c_include_7_55.doStart(context, out);
            _jettag_c_include_7_55.doEnd();
            out.write(NL);         
            out.write("\"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_6_1.handleBodyContent(out);
        }
        _jettag_c_if_6_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_11_1.setRuntimeParent(null);
        _jettag_c_include_11_1.setTagInfo(_td_c_include_11_1);
        _jettag_c_include_11_1.doStart(context, out);
        _jettag_c_include_11_1.doEnd();
        out.write(NL);         
        // Classes with no super classes derive from db.Model.  N.B. No support for multiple inheritance. 
        out.write("class ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_7.setRuntimeParent(null);
        _jettag_c_get_14_7.setTagInfo(_td_c_get_14_7);
        _jettag_c_get_14_7.doStart(context, out);
        _jettag_c_get_14_7.doEnd();
        out.write("(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_choose_14_39 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_14_39); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_14_39.setRuntimeParent(null);
        _jettag_c_choose_14_39.setTagInfo(_td_c_choose_14_39);
        _jettag_c_choose_14_39.doStart(context, out);
        JET2Writer _jettag_c_choose_14_39_saved_out = out;
        while (_jettag_c_choose_14_39.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_14_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_14_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_14_85.setRuntimeParent(_jettag_c_choose_14_39);
            _jettag_c_when_14_85.setTagInfo(_td_c_when_14_85);
            _jettag_c_when_14_85.doStart(context, out);
            JET2Writer _jettag_c_when_14_85_saved_out = out;
            while (_jettag_c_when_14_85.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("db.Model");  //$NON-NLS-1$        
                _jettag_c_when_14_85.handleBodyContent(out);
            }
            out = _jettag_c_when_14_85_saved_out;
            _jettag_c_when_14_85.doEnd();
            RuntimeTagElement _jettag_c_otherwise_14_119 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_14_119); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_otherwise_14_119.setRuntimeParent(_jettag_c_choose_14_39);
            _jettag_c_otherwise_14_119.setTagInfo(_td_c_otherwise_14_119);
            _jettag_c_otherwise_14_119.doStart(context, out);
            JET2Writer _jettag_c_otherwise_14_119_saved_out = out;
            while (_jettag_c_otherwise_14_119.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_get_14_132 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_132); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_14_132.setRuntimeParent(_jettag_c_otherwise_14_119);
                _jettag_c_get_14_132.setTagInfo(_td_c_get_14_132);
                _jettag_c_get_14_132.doStart(context, out);
                _jettag_c_get_14_132.doEnd();
                _jettag_c_otherwise_14_119.handleBodyContent(out);
            }
            out = _jettag_c_otherwise_14_119_saved_out;
            _jettag_c_otherwise_14_119.doEnd();
            _jettag_c_choose_14_39.handleBodyContent(out);
        }
        out = _jettag_c_choose_14_39_saved_out;
        _jettag_c_choose_14_39.doEnd();
        out.write("):");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_15_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_15_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_15_5.setRuntimeParent(null);
        _jettag_c_if_15_5.setTagInfo(_td_c_if_15_5);
        _jettag_c_if_15_5.doStart(context, out);
        while (_jettag_c_if_15_5.okToProcessBody()) {
            out.write("    \"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_16_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_16_9); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_16_9.setRuntimeParent(_jettag_c_if_15_5);
            _jettag_c_setVariable_16_9.setTagInfo(_td_c_setVariable_16_9);
            _jettag_c_setVariable_16_9.doStart(context, out);
            _jettag_c_setVariable_16_9.doEnd();
            RuntimeTagElement _jettag_c_include_16_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_59); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_16_59.setRuntimeParent(_jettag_c_if_15_5);
            _jettag_c_include_16_59.setTagInfo(_td_c_include_16_59);
            _jettag_c_include_16_59.doStart(context, out);
            _jettag_c_include_16_59.doEnd();
            out.write(NL);         
            out.write("    \"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_15_5.handleBodyContent(out);
        }
        _jettag_c_if_15_5.doEnd();
        //    <c:if test="(count($eClass/eReferences) = 0) and (count($eClass/eAttributes) = 0)">pass</c:if>
        RuntimeTagElement _jettag_c_userRegion_20_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_20_1.setRuntimeParent(null);
        _jettag_c_userRegion_20_1.setTagInfo(_td_c_userRegion_20_1);
        _jettag_c_userRegion_20_1.doStart(context, out);
        while (_jettag_c_userRegion_20_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_21_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_21_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_21_11.setRuntimeParent(_jettag_c_userRegion_20_1);
            _jettag_c_get_21_11.setTagInfo(_td_c_get_21_11);
            _jettag_c_get_21_11.doStart(context, out);
            _jettag_c_get_21_11.doEnd();
            out.write(".attributes");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_22_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_22_1.setRuntimeParent(_jettag_c_userRegion_20_1);
            _jettag_c_initialCode_22_1.setTagInfo(_td_c_initialCode_22_1);
            _jettag_c_initialCode_22_1.doStart(context, out);
            while (_jettag_c_initialCode_22_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_24_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_24_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_24_1.setRuntimeParent(_jettag_c_initialCode_22_1);
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
                _jettag_c_initialCode_22_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_22_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_29_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_29_11.setRuntimeParent(_jettag_c_userRegion_20_1);
            _jettag_c_get_29_11.setTagInfo(_td_c_get_29_11);
            _jettag_c_get_29_11.doStart(context, out);
            _jettag_c_get_29_11.doEnd();
            out.write(".attributes");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_20_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_20_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_32_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_32_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_32_1.setRuntimeParent(null);
        _jettag_c_userRegion_32_1.setTagInfo(_td_c_userRegion_32_1);
        _jettag_c_userRegion_32_1.doStart(context, out);
        while (_jettag_c_userRegion_32_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_33_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_33_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_33_11.setRuntimeParent(_jettag_c_userRegion_32_1);
            _jettag_c_get_33_11.setTagInfo(_td_c_get_33_11);
            _jettag_c_get_33_11.doStart(context, out);
            _jettag_c_get_33_11.doEnd();
            out.write(".references");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_34_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_34_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_34_1.setRuntimeParent(_jettag_c_userRegion_32_1);
            _jettag_c_initialCode_34_1.setTagInfo(_td_c_initialCode_34_1);
            _jettag_c_initialCode_34_1.doStart(context, out);
            while (_jettag_c_initialCode_34_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_36_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_36_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_36_1.setRuntimeParent(_jettag_c_initialCode_34_1);
                _jettag_c_iterate_36_1.setTagInfo(_td_c_iterate_36_1);
                _jettag_c_iterate_36_1.doStart(context, out);
                while (_jettag_c_iterate_36_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_include_37_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_37_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_37_1.setRuntimeParent(_jettag_c_iterate_36_1);
                    _jettag_c_include_37_1.setTagInfo(_td_c_include_37_1);
                    _jettag_c_include_37_1.doStart(context, out);
                    _jettag_c_include_37_1.doEnd();
                    out.write(NL);         
                    _jettag_c_iterate_36_1.handleBodyContent(out);
                }
                _jettag_c_iterate_36_1.doEnd();
                _jettag_c_initialCode_34_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_34_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_41_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_41_11.setRuntimeParent(_jettag_c_userRegion_32_1);
            _jettag_c_get_41_11.setTagInfo(_td_c_get_41_11);
            _jettag_c_get_41_11.doStart(context, out);
            _jettag_c_get_41_11.doEnd();
            out.write(".references");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_32_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_32_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_44_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_44_1.setRuntimeParent(null);
        _jettag_c_userRegion_44_1.setTagInfo(_td_c_userRegion_44_1);
        _jettag_c_userRegion_44_1.doStart(context, out);
        while (_jettag_c_userRegion_44_1.okToProcessBody()) {
            out.write("    # <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_45_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_45_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_45_11.setRuntimeParent(_jettag_c_userRegion_44_1);
            _jettag_c_get_45_11.setTagInfo(_td_c_get_45_11);
            _jettag_c_get_45_11.doStart(context, out);
            _jettag_c_get_45_11.doEnd();
            out.write(".operations");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_46_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_46_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_46_1.setRuntimeParent(_jettag_c_userRegion_44_1);
            _jettag_c_initialCode_46_1.setTagInfo(_td_c_initialCode_46_1);
            _jettag_c_initialCode_46_1.doStart(context, out);
            while (_jettag_c_initialCode_46_1.okToProcessBody()) {
                out.write("    # @generated");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_iterate_48_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_48_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_48_1.setRuntimeParent(_jettag_c_initialCode_46_1);
                _jettag_c_iterate_48_1.setTagInfo(_td_c_iterate_48_1);
                _jettag_c_iterate_48_1.doStart(context, out);
                while (_jettag_c_iterate_48_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_include_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_49_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_49_1.setRuntimeParent(_jettag_c_iterate_48_1);
                    _jettag_c_include_49_1.setTagInfo(_td_c_include_49_1);
                    _jettag_c_include_49_1.doStart(context, out);
                    _jettag_c_include_49_1.doEnd();
                    out.write(NL);         
                    _jettag_c_iterate_48_1.handleBodyContent(out);
                }
                _jettag_c_iterate_48_1.doEnd();
                _jettag_c_initialCode_46_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_46_1.doEnd();
            out.write("    # >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_53_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_53_11); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_53_11.setRuntimeParent(_jettag_c_userRegion_44_1);
            _jettag_c_get_53_11.setTagInfo(_td_c_get_53_11);
            _jettag_c_get_53_11.doStart(context, out);
            _jettag_c_get_53_11.doEnd();
            out.write(".operations");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_44_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_44_1.doEnd();
        out.write(NL);         
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
