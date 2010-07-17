package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;

public class _jet_map implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_map() {
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
    private static final TagInfo _td_c_get_9_1 = new TagInfo("c:get", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($ePackage/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_11_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            11, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_6 = new TagInfo("c:get", //$NON-NLS-1$
            12, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_41 = new TagInfo("c:include", //$NON-NLS-1$
            12, 41,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_92 = new TagInfo("c:get", //$NON-NLS-1$
            12, 92,
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
        out.write("\"\"\" Defines a map of class names to their module.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_get_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_1.setRuntimeParent(null);
        _jettag_c_get_9_1.setTagInfo(_td_c_get_9_1);
        _jettag_c_get_9_1.doStart(context, out);
        _jettag_c_get_9_1.doEnd();
        out.write("_pkg_map = {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_10_1.setRuntimeParent(null);
        _jettag_c_iterate_10_1.setTagInfo(_td_c_iterate_10_1);
        _jettag_c_iterate_10_1.doStart(context, out);
        while (_jettag_c_iterate_10_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_11_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_11_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_11_5.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_setVariable_11_5.setTagInfo(_td_c_setVariable_11_5);
            _jettag_c_setVariable_11_5.doStart(context, out);
            _jettag_c_setVariable_11_5.doEnd();
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_6.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_get_12_6.setTagInfo(_td_c_get_12_6);
            _jettag_c_get_12_6.doStart(context, out);
            _jettag_c_get_12_6.doEnd();
            out.write("\": \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_12_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_12_41.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_include_12_41.setTagInfo(_td_c_include_12_41);
            _jettag_c_include_12_41.doStart(context, out);
            _jettag_c_include_12_41.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_92 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_92); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_92.setRuntimeParent(_jettag_c_iterate_10_1);
            _jettag_c_get_12_92.setTagInfo(_td_c_get_12_92);
            _jettag_c_get_12_92.doStart(context, out);
            _jettag_c_get_12_92.doEnd();
            out.write("\",");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_10_1.handleBodyContent(out);
        }
        _jettag_c_iterate_10_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("# EOF -------------------------------------------------------------------------");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
