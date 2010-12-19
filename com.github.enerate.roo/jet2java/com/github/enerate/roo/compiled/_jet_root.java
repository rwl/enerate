package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_root implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_root() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_5_1 = new TagInfo("c:if", //$NON-NLS-1$
            5, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EEnum) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_15 = new TagInfo("c:get", //$NON-NLS-1$
            6, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_8_1 = new TagInfo("c:if", //$NON-NLS-1$
            8, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EClass[count(eSuperTypes) = 0]) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_15 = new TagInfo("c:get", //$NON-NLS-1$
            9, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_14_1 = new TagInfo("c:if", //$NON-NLS-1$
            14, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EReference[@many='false']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_15_15 = new TagInfo("c:get", //$NON-NLS-1$
            15, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_17_1 = new TagInfo("c:if", //$NON-NLS-1$
            17, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage//EReference[@many='true']) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_18_15 = new TagInfo("c:get", //$NON-NLS-1$
            18, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("project --topLevelPackage com.example");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("persistence setup --provider HIBERNATE --database HYPERSONIC_IN_MEMORY");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_1.setRuntimeParent(null);
        _jettag_c_if_5_1.setTagInfo(_td_c_if_5_1);
        _jettag_c_if_5_1.doStart(context, out);
        while (_jettag_c_if_5_1.okToProcessBody()) {
            out.write("script --file ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_15.setRuntimeParent(_jettag_c_if_5_1);
            _jettag_c_get_6_15.setTagInfo(_td_c_get_6_15);
            _jettag_c_get_6_15.doStart(context, out);
            _jettag_c_get_6_15.doEnd();
            out.write("-enums.roo");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_5_1.handleBodyContent(out);
        }
        _jettag_c_if_5_1.doEnd();
        RuntimeTagElement _jettag_c_if_8_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_8_1.setRuntimeParent(null);
        _jettag_c_if_8_1.setTagInfo(_td_c_if_8_1);
        _jettag_c_if_8_1.doStart(context, out);
        while (_jettag_c_if_8_1.okToProcessBody()) {
            out.write("script --file ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_9_15.setRuntimeParent(_jettag_c_if_8_1);
            _jettag_c_get_9_15.setTagInfo(_td_c_get_9_15);
            _jettag_c_get_9_15.doStart(context, out);
            _jettag_c_get_9_15.doEnd();
            out.write("-classes.roo");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_8_1.handleBodyContent(out);
        }
        _jettag_c_if_8_1.doEnd();
        //<c:if test="count($ePackage//EAttribute) > 0">
        //script --file <c:get select="$ePackage/@name"/>-attributes.roo
        //</c:if>
        RuntimeTagElement _jettag_c_if_14_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_14_1.setRuntimeParent(null);
        _jettag_c_if_14_1.setTagInfo(_td_c_if_14_1);
        _jettag_c_if_14_1.doStart(context, out);
        while (_jettag_c_if_14_1.okToProcessBody()) {
            out.write("script --file ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_15_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_15_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_15_15.setRuntimeParent(_jettag_c_if_14_1);
            _jettag_c_get_15_15.setTagInfo(_td_c_get_15_15);
            _jettag_c_get_15_15.doStart(context, out);
            _jettag_c_get_15_15.doEnd();
            out.write("-references.roo");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_14_1.handleBodyContent(out);
        }
        _jettag_c_if_14_1.doEnd();
        RuntimeTagElement _jettag_c_if_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_17_1.setRuntimeParent(null);
        _jettag_c_if_17_1.setTagInfo(_td_c_if_17_1);
        _jettag_c_if_17_1.doStart(context, out);
        while (_jettag_c_if_17_1.okToProcessBody()) {
            out.write("script --file ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_18_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_18_15); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_18_15.setRuntimeParent(_jettag_c_if_17_1);
            _jettag_c_get_18_15.setTagInfo(_td_c_get_18_15);
            _jettag_c_get_18_15.doStart(context, out);
            _jettag_c_get_18_15.doEnd();
            out.write("-sets.roo");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_17_1.handleBodyContent(out);
        }
        _jettag_c_if_17_1.doEnd();
        out.write(NL);         
        out.write("gwt setup");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("logging setup --level DEBUG");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
