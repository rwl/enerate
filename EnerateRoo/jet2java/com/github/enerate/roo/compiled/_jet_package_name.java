package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_package_name implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_package_name() {
        super();
    }
    
    private static final TagInfo _td_c_setVariable_1_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "pkg_name", //$NON-NLS-1$
                "$eSuper/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_2_1 = new TagInfo("c:if", //$NON-NLS-1$
            2, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eSuper/eSuperPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eSuper/eSuperPackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_1 = new TagInfo("c:include", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_82 = new TagInfo("c:get", //$NON-NLS-1$
            4, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$pkg_name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_1.setRuntimeParent(null);
        _jettag_c_setVariable_1_1.setTagInfo(_td_c_setVariable_1_1);
        _jettag_c_setVariable_1_1.doStart(context, out);
        _jettag_c_setVariable_1_1.doEnd();
        RuntimeTagElement _jettag_c_if_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_1.setRuntimeParent(null);
        _jettag_c_if_2_1.setTagInfo(_td_c_if_2_1);
        _jettag_c_if_2_1.doStart(context, out);
        while (_jettag_c_if_2_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_1.setRuntimeParent(_jettag_c_if_2_1);
            _jettag_c_setVariable_3_1.setTagInfo(_td_c_setVariable_3_1);
            _jettag_c_setVariable_3_1.doStart(context, out);
            _jettag_c_setVariable_3_1.doEnd();
            RuntimeTagElement _jettag_c_include_4_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_4_1.setRuntimeParent(_jettag_c_if_2_1);
            _jettag_c_include_4_1.setTagInfo(_td_c_include_4_1);
            _jettag_c_include_4_1.doStart(context, out);
            _jettag_c_include_4_1.doEnd();
            out.write(".");  //$NON-NLS-1$        
            _jettag_c_if_2_1.handleBodyContent(out);
        }
        _jettag_c_if_2_1.doEnd();
        RuntimeTagElement _jettag_c_get_4_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_82); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_82.setRuntimeParent(null);
        _jettag_c_get_4_82.setTagInfo(_td_c_get_4_82);
        _jettag_c_get_4_82.doStart(context, out);
        _jettag_c_get_4_82.doEnd();
    }
}
