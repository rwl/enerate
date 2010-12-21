package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attr implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attr() {
        super();
    }
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/eAttributeType/@instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_72 = new TagInfo("c:get", //$NON-NLS-1$
            1, 72,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttribute/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("private ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_72 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_72); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_72.setRuntimeParent(null);
        _jettag_c_get_1_72.setTagInfo(_td_c_get_1_72);
        _jettag_c_get_1_72.doStart(context, out);
        _jettag_c_get_1_72.doEnd();
        out.write(";");  //$NON-NLS-1$        
    }
}
