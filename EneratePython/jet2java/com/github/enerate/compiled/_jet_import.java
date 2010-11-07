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
                "$eClass/eSuperTypes", //$NON-NLS-1$
                "eSuperType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_5_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            5, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eSuperType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_6_6 = new TagInfo("c:include", //$NON-NLS-1$
            6, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_80 = new TagInfo("c:get", //$NON-NLS-1$
            6, 80,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_123 = new TagInfo("c:get", //$NON-NLS-1$
            6, 123,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // Import super classes defined in other packages. 
        RuntimeTagElement _jettag_c_iterate_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_4_1.setRuntimeParent(null);
        _jettag_c_iterate_4_1.setTagInfo(_td_c_iterate_4_1);
        _jettag_c_iterate_4_1.doStart(context, out);
        while (_jettag_c_iterate_4_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_5_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_5_1.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_setVariable_5_1.setTagInfo(_td_c_setVariable_5_1);
            _jettag_c_setVariable_5_1.doStart(context, out);
            _jettag_c_setVariable_5_1.doEnd();
            out.write("from ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_6_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_6_6.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_include_6_6.setTagInfo(_td_c_include_6_6);
            _jettag_c_include_6_6.doStart(context, out);
            _jettag_c_include_6_6.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_80 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_80); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_80.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_get_6_80.setTagInfo(_td_c_get_6_80);
            _jettag_c_get_6_80.doStart(context, out);
            _jettag_c_get_6_80.doEnd();
            out.write(" import ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_123 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_123); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_123.setRuntimeParent(_jettag_c_iterate_4_1);
            _jettag_c_get_6_123.setTagInfo(_td_c_get_6_123);
            _jettag_c_get_6_123.doStart(context, out);
            _jettag_c_get_6_123.doEnd();
            out.write(NL);         
            _jettag_c_iterate_4_1.handleBodyContent(out);
        }
        _jettag_c_iterate_4_1.doEnd();
    }
}
