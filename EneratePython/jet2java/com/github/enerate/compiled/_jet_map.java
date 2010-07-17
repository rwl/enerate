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
    
    private static final TagInfo _td_c_include_2_1 = new TagInfo("c:include", //$NON-NLS-1$
            2, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage//EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_6 = new TagInfo("c:get", //$NON-NLS-1$
            11, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_41 = new TagInfo("c:include", //$NON-NLS-1$
            11, 41,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_include_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_2_1.setRuntimeParent(null);
        _jettag_c_include_2_1.setTagInfo(_td_c_include_2_1);
        _jettag_c_include_2_1.doStart(context, out);
        _jettag_c_include_2_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        out.write("\"\"\" Defines a map of class names to their module.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("klass_module_map = {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_9_1.setRuntimeParent(null);
        _jettag_c_iterate_9_1.setTagInfo(_td_c_iterate_9_1);
        _jettag_c_iterate_9_1.doStart(context, out);
        while (_jettag_c_iterate_9_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_10_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_10_5.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_setVariable_10_5.setTagInfo(_td_c_setVariable_10_5);
            _jettag_c_setVariable_10_5.doStart(context, out);
            _jettag_c_setVariable_10_5.doEnd();
            out.write("    \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_11_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_11_6.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_get_11_6.setTagInfo(_td_c_get_11_6);
            _jettag_c_get_11_6.doStart(context, out);
            _jettag_c_get_11_6.doEnd();
            out.write("\": \"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_11_41 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_41); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_11_41.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_include_11_41.setTagInfo(_td_c_include_11_41);
            _jettag_c_include_11_41.doStart(context, out);
            _jettag_c_include_11_41.doEnd();
            out.write("\",");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_9_1.handleBodyContent(out);
        }
        _jettag_c_iterate_9_1.doEnd();
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
