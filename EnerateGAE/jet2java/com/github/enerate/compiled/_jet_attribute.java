package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class _jet_attribute implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attribute() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_29_1 = new TagInfo("c:if", //$NON-NLS-1$
            29, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($eAttribute/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_30_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            30, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$eAttribute", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_31_7 = new TagInfo("c:include", //$NON-NLS-1$
            31, 7,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_32_8 = new TagInfo("c:setVariable", //$NON-NLS-1$
            32, 8,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttribute/eAttributeType/@instanceTypeName)", //$NON-NLS-1$
                "instanceTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_7 = new TagInfo("c:get", //$NON-NLS-1$
            42, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($eAttribute/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // FIXME: Remove duplication with the 'import' template. 

ArrayList<String> imported = new ArrayList<String>();
ArrayList<String> traitNames = new ArrayList<String>();
HashMap<String, String> instanceTypeNamePropertyMap = new HashMap<String, String>();

instanceTypeNamePropertyMap.put("boolean", "db.BooleanProperty()");
instanceTypeNamePropertyMap.put("java.lang.Boolean", "db.BooleanProperty()");
instanceTypeNamePropertyMap.put("char", "db.StringProperty()");
instanceTypeNamePropertyMap.put("java.lang.Character", "db.StringProperty()");
instanceTypeNamePropertyMap.put("java.util.Date", "db.DateTimeProperty()");
instanceTypeNamePropertyMap.put("double", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("java.lang.Double", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("float", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("java.lang.Float", "db.FloatProperty()");
instanceTypeNamePropertyMap.put("int", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Integer", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Class", "db.ReferenceProperty()");
instanceTypeNamePropertyMap.put("java.lang.Object", "db.ReferenceProperty()");
instanceTypeNamePropertyMap.put("long", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Long", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.util.Map", "db.ListProperty()");
instanceTypeNamePropertyMap.put("short", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.Short", "db.IntegerProperty()");
instanceTypeNamePropertyMap.put("java.lang.String", "db.StringProperty()");

        RuntimeTagElement _jettag_c_if_29_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_29_1.setRuntimeParent(null);
        _jettag_c_if_29_1.setTagInfo(_td_c_if_29_1);
        _jettag_c_if_29_1.doStart(context, out);
        while (_jettag_c_if_29_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_30_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_30_1.setRuntimeParent(_jettag_c_if_29_1);
            _jettag_c_setVariable_30_1.setTagInfo(_td_c_setVariable_30_1);
            _jettag_c_setVariable_30_1.doStart(context, out);
            _jettag_c_setVariable_30_1.doEnd();
            out.write("    # ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_include_31_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_31_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_31_7.setRuntimeParent(_jettag_c_if_29_1);
            _jettag_c_include_31_7.setTagInfo(_td_c_include_31_7);
            _jettag_c_include_31_7.doStart(context, out);
            _jettag_c_include_31_7.doEnd();
            out.write(NL);         
            _jettag_c_if_29_1.handleBodyContent(out);
        }
        _jettag_c_if_29_1.doEnd();
        RuntimeTagElement _jettag_c_setVariable_32_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_32_8); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_32_8.setRuntimeParent(null);
        _jettag_c_setVariable_32_8.setTagInfo(_td_c_setVariable_32_8);
        _jettag_c_setVariable_32_8.doStart(context, out);
        _jettag_c_setVariable_32_8.doEnd();

String itn = (String)context.getVariable("instanceTypeName");
// Property name.
String pn;

if ( instanceTypeNamePropertyMap.containsKey( itn ) ) {
    pn = instanceTypeNamePropertyMap.get( itn );
} else {
    pn = itn;
}

        out.write("    ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_7); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_7.setRuntimeParent(null);
        _jettag_c_get_42_7.setTagInfo(_td_c_get_42_7);
        _jettag_c_get_42_7.doStart(context, out);
        _jettag_c_get_42_7.doEnd();
        out.write(" = ");  //$NON-NLS-1$        
        out.write( pn );
        out.write(NL);         
    }
}
