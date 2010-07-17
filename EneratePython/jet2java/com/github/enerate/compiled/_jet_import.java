package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class _jet_import implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_import() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_4_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass/eSuperTypes", //$NON-NLS-1$
                "eSuperType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_6_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            6, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eSuperType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_5 = new TagInfo("c:if", //$NON-NLS-1$
            8, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string($eSuper/@name) != string($ePackage/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_15_6 = new TagInfo("c:include", //$NON-NLS-1$
            15, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_87 = new TagInfo("c:get", //$NON-NLS-1$
            15, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_31_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            31, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_33_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            33, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Import super classes defined in other packages. 
        RuntimeTagElement _jettag_c_iterate_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_4_1.setRuntimeParent(null);
        _jettag_c_iterate_4_1.setTagInfo(_td_c_iterate_4_1);
        _jettag_c_iterate_4_1.doStart(context, out);
        while (_jettag_c_iterate_4_1.okToProcessBody()) {
            // The package in which the super class is defined. 
            RuntimeTagElement _jettag_c_setVariable_6_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_6_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_6_5.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_setVariable_6_5.setTagInfo(_td_c_setVariable_6_5);
            _jettag_c_setVariable_6_5.doStart(context, out);
            _jettag_c_setVariable_6_5.doEnd();
            // Fixme: Use @nsPrefix aswell. 
            RuntimeTagElement _jettag_c_if_8_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_8_5.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_if_8_5.setTagInfo(_td_c_if_8_5);
            _jettag_c_if_8_5.doStart(context, out);
            while (_jettag_c_if_8_5.okToProcessBody()) {
        
        ArrayList<String> imported = new ArrayList<String>();
        EClass st = (EClass)context.getVariable("eSuperType");
        if ( !imported.contains( st.getName() ) ) {
          imported.add( st.getName() );
        
                out.write("from ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_15_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_15_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_15_6.setRuntimeParent(_jettag_c_if_8_5);
                _jettag_c_include_15_6.setTagInfo(_td_c_include_15_6);
                _jettag_c_include_15_6.doStart(context, out);
                _jettag_c_include_15_6.doEnd();
                out.write(" import ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_15_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_87); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_15_87.setRuntimeParent(_jettag_c_if_8_5);
                _jettag_c_get_15_87.setTagInfo(_td_c_get_15_87);
                _jettag_c_get_15_87.doStart(context, out);
                _jettag_c_get_15_87.doEnd();
                out.write(NL);         
        
        }
        
                _jettag_c_if_8_5.handleBodyContent(out);
            }
            _jettag_c_if_8_5.doEnd();
            _jettag_c_iterate_4_1.handleBodyContent(out);
        }
        _jettag_c_iterate_4_1.doEnd();
        // Import custom trait attributes that are not defined in the 'ecore' package or the template's package. 
        //
        //<c:iterate select="$ePackage/EClass/eAttributes/eAttributeType" var="eAttributeType">
        //<c:if test="string($eAttributeType/ePackage/@name) != 'ecore' and string($eAttributeType/ePackage/@name) != string($ePackage/@name)">
        //<c:setVariable var="eSuper" select="$eAttributeType/ePackage"/>
        //from <c:include template="templates/package_name.jet" passVariables="eSuper"/> import <c:get select="underscore($eAttributeType/@name)"/>
        //</c:if>
        //</c:iterate>
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_31_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_31_1.setRuntimeParent(null);
        _jettag_c_userRegion_31_1.setTagInfo(_td_c_userRegion_31_1);
        _jettag_c_userRegion_31_1.doStart(context, out);
        while (_jettag_c_userRegion_31_1.okToProcessBody()) {
            out.write("# <<< imports");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_33_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_33_1.setRuntimeParent(_jettag_c_userRegion_31_1);
            _jettag_c_initialCode_33_1.setTagInfo(_td_c_initialCode_33_1);
            _jettag_c_initialCode_33_1.doStart(context, out);
            while (_jettag_c_initialCode_33_1.okToProcessBody()) {
                out.write("# @generated");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_initialCode_33_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_33_1.doEnd();
            out.write("# >>> imports");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_31_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_31_1.doEnd();
    }
}
