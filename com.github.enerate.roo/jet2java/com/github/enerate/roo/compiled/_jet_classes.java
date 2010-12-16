package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.*;

public class _jet_classes implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$


private void order(NodeSet queue, List<EClass> ordered) {
	Iterator<EClass> iter = queue.iterator();
	while (iter.hasNext()) {
        EClass c = iter.next();

	    if (c.getESuperTypes().size() > 0) {
	        if (ordered.contains(c.getESuperTypes().get(0)) && !ordered.contains(c))
	            ordered.add(c);
	    } else if (!ordered.contains(c)) {
	        ordered.add(c);
	    }
	}

	if (ordered.size() < queue.size())
		order(queue, ordered);
}

    public _jet_classes() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_23_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            23, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eClasses", //$NON-NLS-1$
                "$ePackage//EClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_33_1 = new TagInfo("c:include", //$NON-NLS-1$
            33, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/entity.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("/* Classes */");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_23_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_23_1.setRuntimeParent(null);
        _jettag_c_setVariable_23_1.setTagInfo(_td_c_setVariable_23_1);
        _jettag_c_setVariable_23_1.doStart(context, out);
        _jettag_c_setVariable_23_1.doEnd();

NodeSet eClasses = (NodeSet) context.getVariable("eClasses");
ArrayList<EClass> ordered = new ArrayList<EClass>();

order(eClasses, ordered);

for (EClass c : ordered) {
    context.setVariable("eClass", c);

        RuntimeTagElement _jettag_c_include_33_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_33_1.setRuntimeParent(null);
        _jettag_c_include_33_1.setTagInfo(_td_c_include_33_1);
        _jettag_c_include_33_1.doStart(context, out);
        _jettag_c_include_33_1.doEnd();

}

    }
}
