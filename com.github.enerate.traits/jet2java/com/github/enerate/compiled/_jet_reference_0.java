package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_reference_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_reference_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_14 = new TagInfo("c:get", //$NON-NLS-1$
            1, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lower-case($eReference/eReferenceType/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_7_22 = new TagInfo("c:include", //$NON-NLS-1$
            7, 22,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_7_73 = new TagInfo("c:get", //$NON-NLS-1$
            7, 73,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eReference/eReferenceType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_6 = new TagInfo("c:get", //$NON-NLS-1$
            11, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lower-case($eReference/eReferenceType/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_11_91 = new TagInfo("c:get", //$NON-NLS-1$
            11, 91,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lower-case($eReference/eReferenceType/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("    def _get_");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_14.setRuntimeParent(null);
        _jettag_c_get_1_14.setTagInfo(_td_c_get_1_14);
        _jettag_c_get_1_14.doStart(context, out);
        _jettag_c_get_1_14.doEnd();
        out.write("s(self):");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\" Property getter.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        \"\"\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        if self.Model is not None:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return [e for e in self.Model.Elements \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                if \"%s.%s\" % (e.__module__, e.__class__.__name__) == \\");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("                    \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_7_22 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_7_22); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_7_22.setRuntimeParent(null);
        _jettag_c_include_7_22.setTagInfo(_td_c_include_7_22);
        _jettag_c_include_7_22.doStart(context, out);
        _jettag_c_include_7_22.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_7_73 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_7_73); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_7_73.setRuntimeParent(null);
        _jettag_c_get_7_73.setTagInfo(_td_c_get_7_73);
        _jettag_c_get_7_73.doStart(context, out);
        _jettag_c_get_7_73.doEnd();
        out.write("\" ]");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("        else:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("            return []");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("    _");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_6.setRuntimeParent(null);
        _jettag_c_get_11_6.setTagInfo(_td_c_get_11_6);
        _jettag_c_get_11_6.doStart(context, out);
        _jettag_c_get_11_6.doEnd();
        out.write("s = Property(fget=_get_");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_11_91 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_11_91); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_11_91.setRuntimeParent(null);
        _jettag_c_get_11_91.setTagInfo(_td_c_get_11_91);
        _jettag_c_get_11_91.doStart(context, out);
        _jettag_c_get_11_91.doEnd();
        out.write("s)");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
