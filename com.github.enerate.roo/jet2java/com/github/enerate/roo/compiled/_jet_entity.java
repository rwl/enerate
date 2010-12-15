package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_entity implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_entity() {
        super();
    }
    
    private static final TagInfo _td_c_setVariable_1_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_2_32 = new TagInfo("c:include", //$NON-NLS-1$
            2, 32,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_106 = new TagInfo("c:get", //$NON-NLS-1$
            2, 106,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_2_137 = new TagInfo("c:if", //$NON-NLS-1$
            2, 137,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_3_40 = new TagInfo("c:setVariable", //$NON-NLS-1$
            3, 40,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/eSuperTypes[1]/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_3_137 = new TagInfo("c:include", //$NON-NLS-1$
            3, 137,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_65 = new TagInfo("c:get", //$NON-NLS-1$
            4, 65,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_4_118 = new TagInfo("c:if", //$NON-NLS-1$
            4, 118,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_54 = new TagInfo("c:if", //$NON-NLS-1$
            5, 54,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'false'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_1.setRuntimeParent(null);
        _jettag_c_setVariable_1_1.setTagInfo(_td_c_setVariable_1_1);
        _jettag_c_setVariable_1_1.doStart(context, out);
        _jettag_c_setVariable_1_1.doEnd();
        out.write("entity --class ~.server.domain.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_2_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_2_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_2_32.setRuntimeParent(null);
        _jettag_c_include_2_32.setTagInfo(_td_c_include_2_32);
        _jettag_c_include_2_32.doStart(context, out);
        _jettag_c_include_2_32.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_106 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_106); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_106.setRuntimeParent(null);
        _jettag_c_get_2_106.setTagInfo(_td_c_get_2_106);
        _jettag_c_get_2_106.doStart(context, out);
        _jettag_c_get_2_106.doEnd();
        RuntimeTagElement _jettag_c_if_2_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_2_137); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_2_137.setRuntimeParent(null);
        _jettag_c_if_2_137.setTagInfo(_td_c_if_2_137);
        _jettag_c_if_2_137.doStart(context, out);
        while (_jettag_c_if_2_137.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_3_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_3_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_3_40.setRuntimeParent(_jettag_c_if_2_137);
            _jettag_c_setVariable_3_40.setTagInfo(_td_c_setVariable_3_40);
            _jettag_c_setVariable_3_40.doStart(context, out);
            _jettag_c_setVariable_3_40.doEnd();
            out.write(" --extends ~.server.domain.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_3_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_3_137); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_3_137.setRuntimeParent(_jettag_c_if_2_137);
            _jettag_c_include_3_137.setTagInfo(_td_c_include_3_137);
            _jettag_c_include_3_137.doStart(context, out);
            _jettag_c_include_3_137.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_65 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_65.setRuntimeParent(_jettag_c_if_2_137);
            _jettag_c_get_4_65.setTagInfo(_td_c_get_4_65);
            _jettag_c_get_4_65.doStart(context, out);
            _jettag_c_get_4_65.doEnd();
            _jettag_c_if_2_137.handleBodyContent(out);
        }
        _jettag_c_if_2_137.doEnd();
        RuntimeTagElement _jettag_c_if_4_118 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_4_118); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_4_118.setRuntimeParent(null);
        _jettag_c_if_4_118.setTagInfo(_td_c_if_4_118);
        _jettag_c_if_4_118.doStart(context, out);
        while (_jettag_c_if_4_118.okToProcessBody()) {
            out.write(" --abstract");  //$NON-NLS-1$        
            _jettag_c_if_4_118.handleBodyContent(out);
        }
        _jettag_c_if_4_118.doEnd();
        RuntimeTagElement _jettag_c_if_5_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_54.setRuntimeParent(null);
        _jettag_c_if_5_54.setTagInfo(_td_c_if_5_54);
        _jettag_c_if_5_54.doStart(context, out);
        while (_jettag_c_if_5_54.okToProcessBody()) {
            out.write(" --testAutomatically");  //$NON-NLS-1$        
            _jettag_c_if_5_54.handleBodyContent(out);
        }
        _jettag_c_if_5_54.doEnd();
    }
}
