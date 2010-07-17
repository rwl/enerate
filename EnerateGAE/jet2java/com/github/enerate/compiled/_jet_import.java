package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_import implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_import() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_userRegion_2_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            2, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_4_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            4, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes", //$NON-NLS-1$
                "eSuperType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_8_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            8, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eSuperType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_9_6 = new TagInfo("c:include", //$NON-NLS-1$
            9, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_80 = new TagInfo("c:get", //$NON-NLS-1$
            9, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eSuperType/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_135 = new TagInfo("c:get", //$NON-NLS-1$
            9, 135,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_13_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            13, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eReferences", //$NON-NLS-1$
                "eReference", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_1 = new TagInfo("c:if", //$NON-NLS-1$
            14, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/@many = 'false' and $eReference/eOpposite/@many = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eReference/eReferenceType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_6 = new TagInfo("c:include", //$NON-NLS-1$
            16, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_80 = new TagInfo("c:get", //$NON-NLS-1$
            16, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eReference/eReferenceType/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_16_150 = new TagInfo("c:get", //$NON-NLS-1$
            16, 150,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_21_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            21, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eAttributes/eAttributeType", //$NON-NLS-1$
                "eAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_1 = new TagInfo("c:if", //$NON-NLS-1$
            22, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttributeType/ePackage/@name) != 'ecore'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_23_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            23, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eAttributeType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_24_6 = new TagInfo("c:include", //$NON-NLS-1$
            24, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_24_87 = new TagInfo("c:get", //$NON-NLS-1$
            24, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttributeType/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_userRegion_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_2_1.setRuntimeParent(null);
        _jettag_c_userRegion_2_1.setTagInfo(_td_c_userRegion_2_1);
        _jettag_c_userRegion_2_1.doStart(context, out);
        while (_jettag_c_userRegion_2_1.okToProcessBody()) {
            out.write("# <<< imports");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_4_1.setRuntimeParent(_jettag_c_userRegion_2_1);
            _jettag_c_initialCode_4_1.setTagInfo(_td_c_initialCode_4_1);
            _jettag_c_initialCode_4_1.doStart(context, out);
            while (_jettag_c_initialCode_4_1.okToProcessBody()) {
                out.write("# @generated");  //$NON-NLS-1$        
                out.write(NL);         
                // Import super classes defined in other packages. 
                RuntimeTagElement _jettag_c_iterate_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_7_1.setRuntimeParent(_jettag_c_initialCode_4_1);
                _jettag_c_iterate_7_1.setTagInfo(_td_c_iterate_7_1);
                _jettag_c_iterate_7_1.doStart(context, out);
                while (_jettag_c_iterate_7_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_8_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_8_1.setRuntimeParent(_jettag_c_iterate_7_1);
                    _jettag_c_setVariable_8_1.setTagInfo(_td_c_setVariable_8_1);
                    _jettag_c_setVariable_8_1.doStart(context, out);
                    _jettag_c_setVariable_8_1.doEnd();
                    out.write("from ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_include_9_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_9_6); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_9_6.setRuntimeParent(_jettag_c_iterate_7_1);
                    _jettag_c_include_9_6.setTagInfo(_td_c_include_9_6);
                    _jettag_c_include_9_6.doStart(context, out);
                    _jettag_c_include_9_6.doEnd();
                    out.write(".");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_80); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_80.setRuntimeParent(_jettag_c_iterate_7_1);
                    _jettag_c_get_9_80.setTagInfo(_td_c_get_9_80);
                    _jettag_c_get_9_80.doStart(context, out);
                    _jettag_c_get_9_80.doEnd();
                    out.write(" import ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_135 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_135); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_135.setRuntimeParent(_jettag_c_iterate_7_1);
                    _jettag_c_get_9_135.setTagInfo(_td_c_get_9_135);
                    _jettag_c_get_9_135.doStart(context, out);
                    _jettag_c_get_9_135.doEnd();
                    out.write(NL);         
                    _jettag_c_iterate_7_1.handleBodyContent(out);
                }
                _jettag_c_iterate_7_1.doEnd();
                out.write(NL);         
                // Import classes referenced by a one-to-many association. 
                RuntimeTagElement _jettag_c_iterate_13_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_13_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_13_1.setRuntimeParent(_jettag_c_initialCode_4_1);
                _jettag_c_iterate_13_1.setTagInfo(_td_c_iterate_13_1);
                _jettag_c_iterate_13_1.doStart(context, out);
                while (_jettag_c_iterate_13_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_if_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_14_1.setRuntimeParent(_jettag_c_iterate_13_1);
                    _jettag_c_if_14_1.setTagInfo(_td_c_if_14_1);
                    _jettag_c_if_14_1.doStart(context, out);
                    while (_jettag_c_if_14_1.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_15_1.setRuntimeParent(_jettag_c_if_14_1);
                        _jettag_c_setVariable_15_1.setTagInfo(_td_c_setVariable_15_1);
                        _jettag_c_setVariable_15_1.doStart(context, out);
                        _jettag_c_setVariable_15_1.doEnd();
                        out.write("from ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_include_16_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_6); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_include_16_6.setRuntimeParent(_jettag_c_if_14_1);
                        _jettag_c_include_16_6.setTagInfo(_td_c_include_16_6);
                        _jettag_c_include_16_6.doStart(context, out);
                        _jettag_c_include_16_6.doEnd();
                        out.write(".");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_16_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_80); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_16_80.setRuntimeParent(_jettag_c_if_14_1);
                        _jettag_c_get_16_80.setTagInfo(_td_c_get_16_80);
                        _jettag_c_get_16_80.doStart(context, out);
                        _jettag_c_get_16_80.doEnd();
                        out.write(" import ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_16_150 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_16_150); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_16_150.setRuntimeParent(_jettag_c_if_14_1);
                        _jettag_c_get_16_150.setTagInfo(_td_c_get_16_150);
                        _jettag_c_get_16_150.doStart(context, out);
                        _jettag_c_get_16_150.doEnd();
                        out.write(NL);         
                        _jettag_c_if_14_1.handleBodyContent(out);
                    }
                    _jettag_c_if_14_1.doEnd();
                    _jettag_c_iterate_13_1.handleBodyContent(out);
                }
                _jettag_c_iterate_13_1.doEnd();
                out.write(NL);         
                // Import custom trait attributes that are not defined in the 'ecore' package. 
                RuntimeTagElement _jettag_c_iterate_21_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_21_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_21_1.setRuntimeParent(_jettag_c_initialCode_4_1);
                _jettag_c_iterate_21_1.setTagInfo(_td_c_iterate_21_1);
                _jettag_c_iterate_21_1.doStart(context, out);
                while (_jettag_c_iterate_21_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_if_22_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_22_1.setRuntimeParent(_jettag_c_iterate_21_1);
                    _jettag_c_if_22_1.setTagInfo(_td_c_if_22_1);
                    _jettag_c_if_22_1.doStart(context, out);
                    while (_jettag_c_if_22_1.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_23_1); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_23_1.setRuntimeParent(_jettag_c_if_22_1);
                        _jettag_c_setVariable_23_1.setTagInfo(_td_c_setVariable_23_1);
                        _jettag_c_setVariable_23_1.doStart(context, out);
                        _jettag_c_setVariable_23_1.doEnd();
                        out.write("from ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_include_24_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_24_6); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_include_24_6.setRuntimeParent(_jettag_c_if_22_1);
                        _jettag_c_include_24_6.setTagInfo(_td_c_include_24_6);
                        _jettag_c_include_24_6.doStart(context, out);
                        _jettag_c_include_24_6.doEnd();
                        out.write(" import ");  //$NON-NLS-1$        
                        RuntimeTagElement _jettag_c_get_24_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_24_87); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_get_24_87.setRuntimeParent(_jettag_c_if_22_1);
                        _jettag_c_get_24_87.setTagInfo(_td_c_get_24_87);
                        _jettag_c_get_24_87.doStart(context, out);
                        _jettag_c_get_24_87.doEnd();
                        out.write(NL);         
                        _jettag_c_if_22_1.handleBodyContent(out);
                    }
                    _jettag_c_if_22_1.doEnd();
                    _jettag_c_iterate_21_1.handleBodyContent(out);
                }
                _jettag_c_iterate_21_1.doEnd();
                out.write(NL);         
                out.write("from google.appengine.ext import db");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_initialCode_4_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_4_1.doEnd();
            out.write("# >>> imports");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_2_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_2_1.doEnd();
    }
}
