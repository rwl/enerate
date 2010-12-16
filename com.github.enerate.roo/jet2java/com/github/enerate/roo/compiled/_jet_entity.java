package com.github.enerate.roo.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_entity implements JET2Template {
    private static final String _jetns_en = "com.github.enerate.tag.tagLibrary"; //$NON-NLS-1$
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_entity() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_2_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_3_32 = new TagInfo("c:include", //$NON-NLS-1$
            3, 32,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_3_106 = new TagInfo("en:getRoo", //$NON-NLS-1$
            3, 106,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@name", //$NON-NLS-1$
                "sql,test", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_3_158 = new TagInfo("c:if", //$NON-NLS-1$
            3, 158,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eClass/eSuperTypes) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_4_40 = new TagInfo("c:setVariable", //$NON-NLS-1$
            4, 40,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eClass/eSuperTypes[1]/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_4_137 = new TagInfo("c:include", //$NON-NLS-1$
            4, 137,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_en_getRoo_5_65 = new TagInfo("en:getRoo", //$NON-NLS-1$
            5, 65,
            new String[] {
                "select", //$NON-NLS-1$
                "avoid", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/eSuperTypes[1]/@name", //$NON-NLS-1$
                "sql,test", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_139 = new TagInfo("c:if", //$NON-NLS-1$
            5, 139,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'true'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_6_54 = new TagInfo("c:if", //$NON-NLS-1$
            6, 54,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$eClass/@abstract = 'false'", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_setVariable_2_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_2_1.setRuntimeParent(null);
        _jettag_c_setVariable_2_1.setTagInfo(_td_c_setVariable_2_1);
        _jettag_c_setVariable_2_1.doStart(context, out);
        _jettag_c_setVariable_2_1.doEnd();
        out.write("entity --class ~.server.domain.");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_include_3_32 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_3_32); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_3_32.setRuntimeParent(null);
        _jettag_c_include_3_32.setTagInfo(_td_c_include_3_32);
        _jettag_c_include_3_32.doStart(context, out);
        _jettag_c_include_3_32.doEnd();
        out.write(".");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_en_getRoo_3_106 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_3_106); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_en_getRoo_3_106.setRuntimeParent(null);
        _jettag_en_getRoo_3_106.setTagInfo(_td_en_getRoo_3_106);
        _jettag_en_getRoo_3_106.doStart(context, out);
        _jettag_en_getRoo_3_106.doEnd();
        RuntimeTagElement _jettag_c_if_3_158 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_158); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_3_158.setRuntimeParent(null);
        _jettag_c_if_3_158.setTagInfo(_td_c_if_3_158);
        _jettag_c_if_3_158.doStart(context, out);
        while (_jettag_c_if_3_158.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_4_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_4_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_4_40.setRuntimeParent(_jettag_c_if_3_158);
            _jettag_c_setVariable_4_40.setTagInfo(_td_c_setVariable_4_40);
            _jettag_c_setVariable_4_40.doStart(context, out);
            _jettag_c_setVariable_4_40.doEnd();
            out.write(" --extends ~.server.domain.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_4_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_4_137); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_4_137.setRuntimeParent(_jettag_c_if_3_158);
            _jettag_c_include_4_137.setTagInfo(_td_c_include_4_137);
            _jettag_c_include_4_137.doStart(context, out);
            _jettag_c_include_4_137.doEnd();
            out.write(".");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_en_getRoo_5_65 = context.getTagFactory().createRuntimeTag(_jetns_en, "getRoo", "en:getRoo", _td_en_getRoo_5_65); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_en_getRoo_5_65.setRuntimeParent(_jettag_c_if_3_158);
            _jettag_en_getRoo_5_65.setTagInfo(_td_en_getRoo_5_65);
            _jettag_en_getRoo_5_65.doStart(context, out);
            _jettag_en_getRoo_5_65.doEnd();
            _jettag_c_if_3_158.handleBodyContent(out);
        }
        _jettag_c_if_3_158.doEnd();
        RuntimeTagElement _jettag_c_if_5_139 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_139); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_139.setRuntimeParent(null);
        _jettag_c_if_5_139.setTagInfo(_td_c_if_5_139);
        _jettag_c_if_5_139.doStart(context, out);
        while (_jettag_c_if_5_139.okToProcessBody()) {
            out.write(" --abstract");  //$NON-NLS-1$        
            _jettag_c_if_5_139.handleBodyContent(out);
        }
        _jettag_c_if_5_139.doEnd();
        RuntimeTagElement _jettag_c_if_6_54 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_6_54); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_6_54.setRuntimeParent(null);
        _jettag_c_if_6_54.setTagInfo(_td_c_if_6_54);
        _jettag_c_if_6_54.doStart(context, out);
        while (_jettag_c_if_6_54.okToProcessBody()) {
            out.write(" --testAutomatically");  //$NON-NLS-1$        
            _jettag_c_if_6_54.handleBodyContent(out);
        }
        _jettag_c_if_6_54.doEnd();
        out.write(NL);         
    }
}
