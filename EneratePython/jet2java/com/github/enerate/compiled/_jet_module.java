package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;
import org.eclipse.jet.xpath.XPathUtil;

public class _jet_module implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_module() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_include_28_1 = new TagInfo("c:include", //$NON-NLS-1$
            28, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/license.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_30_1 = new TagInfo("c:if", //$NON-NLS-1$
            30, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/eAnnotations) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_31_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            31, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAnnotated", //$NON-NLS-1$
                "$ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_31_57 = new TagInfo("c:include", //$NON-NLS-1$
            31, 57,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/comment.jet", //$NON-NLS-1$
                "eAnnotated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_35_1 = new TagInfo("c:include", //$NON-NLS-1$
            35, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/import.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_14 = new TagInfo("c:get", //$NON-NLS-1$
            66, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@nsPrefix", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_11 = new TagInfo("c:get", //$NON-NLS-1$
            68, 11,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/@nsURI", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_70_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            70, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_73_3 = new TagInfo("c:choose", //$NON-NLS-1$
            73, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "count( $eClass/eSuperTypes/ePackage[@name = $ePackage/@name] )", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_74_5 = new TagInfo("c:when", //$NON-NLS-1$
            74, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_76_1 = new TagInfo("c:include", //$NON-NLS-1$
            76, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/class.jet", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_79_5 = new TagInfo("c:otherwise", //$NON-NLS-1$
            79, 5,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_86_1 = new TagInfo("c:include", //$NON-NLS-1$
            86, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/hierarchy.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_103_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            103, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_104_7 = new TagInfo("c:get", //$NON-NLS-1$
            104, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($ePackage/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_initialCode_105_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            105, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_108_7 = new TagInfo("c:get", //$NON-NLS-1$
            108, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "underscore($ePackage/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

ArrayList<String> defined = new ArrayList<String>();
ArrayList<String> queue = new ArrayList<String>();
HashMap<String, String> instanceTypeNameTraitMap = new HashMap<String, String>();
instanceTypeNameTraitMap.put("boolean", "False");
instanceTypeNameTraitMap.put("java.lang.Boolean", "False");
instanceTypeNameTraitMap.put("char", "''");
instanceTypeNameTraitMap.put("java.lang.Character", "''");
instanceTypeNameTraitMap.put("java.util.Date", "''");
instanceTypeNameTraitMap.put("double", "0.0");
instanceTypeNameTraitMap.put("java.lang.Double", "0.0");
instanceTypeNameTraitMap.put("float", "0.0");
instanceTypeNameTraitMap.put("java.lang.Float", "0.0");
instanceTypeNameTraitMap.put("int", "0");
instanceTypeNameTraitMap.put("java.lang.Integer", "0");
instanceTypeNameTraitMap.put("java.lang.Class", "None");
instanceTypeNameTraitMap.put("java.lang.Object", "None");
instanceTypeNameTraitMap.put("long", "0");
instanceTypeNameTraitMap.put("java.lang.Long", "0");
instanceTypeNameTraitMap.put("java.util.Map", "{}");
instanceTypeNameTraitMap.put("short", "0");
instanceTypeNameTraitMap.put("java.lang.Short", "0");
instanceTypeNameTraitMap.put("java.lang.String", "''");

        RuntimeTagElement _jettag_c_include_28_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_28_1.setRuntimeParent(null);
        _jettag_c_include_28_1.setTagInfo(_td_c_include_28_1);
        _jettag_c_include_28_1.doStart(context, out);
        _jettag_c_include_28_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_30_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_30_1.setRuntimeParent(null);
        _jettag_c_if_30_1.setTagInfo(_td_c_if_30_1);
        _jettag_c_if_30_1.doStart(context, out);
        while (_jettag_c_if_30_1.okToProcessBody()) {
            out.write("\"\"\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_setVariable_31_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_31_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_31_5.setRuntimeParent(_jettag_c_if_30_1);
            _jettag_c_setVariable_31_5.setTagInfo(_td_c_setVariable_31_5);
            _jettag_c_setVariable_31_5.doStart(context, out);
            _jettag_c_setVariable_31_5.doEnd();
            RuntimeTagElement _jettag_c_include_31_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_31_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_31_57.setRuntimeParent(_jettag_c_if_30_1);
            _jettag_c_include_31_57.setTagInfo(_td_c_include_31_57);
            _jettag_c_include_31_57.doStart(context, out);
            _jettag_c_include_31_57.doEnd();
            out.write(NL);         
            out.write("\"\"\"");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_if_30_1.handleBodyContent(out);
        }
        _jettag_c_if_30_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_include_35_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_35_1.setRuntimeParent(null);
        _jettag_c_include_35_1.setTagInfo(_td_c_include_35_1);
        _jettag_c_include_35_1.doStart(context, out);
        _jettag_c_include_35_1.doEnd();
        out.write(NL);         
        //
        //<c:iterate select="$ePackage/EDataType" var="eDataType"><%
        //EDataType dt = (EDataType)context.getVariable("eDataType");
        //String tn;
        //
        //if ( instanceTypeNameTraitMap.containsKey( dt.getInstanceTypeName() ) ) {
        //    tn = instanceTypeNameTraitMap.get( dt.getInstanceTypeName() );
        //} else {
        //    tn = "''";
        //}
        //%>
        //<c:if test="count($eDataType/eAnnotations) > 0"><c:setVariable var="eAnnotated" select="$eDataType"/># <c:include template="templates/comment.jet" passVariables="eAnnotated"/>"</c:if>
        //<c:get select="underscore($eDataType/@name)"/> = <%= tn %>
        //</c:iterate>
        //
        //<c:iterate select="$ePackage/EEnum" var="eEnum">
        //<c:setVariable var="eAnnotated" select="$eEnum"/>
        //<c:if test="count($eEnum/eAnnotations) > 0"># <c:include template="templates/comment.jet" passVariables="eAnnotated"/></c:if>
        //<c:choose select="count($eEnum/eLiterals)">
        //<c:when test="0">
        //<c:get select="underscore($eEnum/@name)"/> = Str
        //</c:when>
        //<c:otherwise>
        //<c:get select="$eEnum/@name"/> = Enum(<c:iterate select="count($eEnum/eLiterals)" var="eLiteralIdx">"<c:get select="$eEnum/eLiterals[$eLiteralIdx]/@literal"/>"<c:if test="$eLiteralIdx != count($eEnum/eLiterals)">, </c:if></c:iterate><c:if test="count($eEnum/eAnnotations) > 0">, desc="<c:include template="templates/comment.jet" passVariables="eAnnotated"/>"</c:if>)
        //</c:otherwise>
        //</c:choose>
        //</c:iterate>
        out.write("ns_prefix = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_66_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_14); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_66_14.setRuntimeParent(null);
        _jettag_c_get_66_14.setTagInfo(_td_c_get_66_14);
        _jettag_c_get_66_14.doStart(context, out);
        _jettag_c_get_66_14.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("ns_uri = \"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_68_11 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_11); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_68_11.setRuntimeParent(null);
        _jettag_c_get_68_11.setTagInfo(_td_c_get_68_11);
        _jettag_c_get_68_11.doStart(context, out);
        _jettag_c_get_68_11.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        // Call the class template for any EClass objects. 
        RuntimeTagElement _jettag_c_iterate_70_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_70_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_70_1.setRuntimeParent(null);
        _jettag_c_iterate_70_1.setTagInfo(_td_c_iterate_70_1);
        _jettag_c_iterate_70_1.doStart(context, out);
        while (_jettag_c_iterate_70_1.okToProcessBody()) {
     EClass ec = (EClass)context.getVariable("eClass"); 
            // Classes with no super type or classes with super types defined in other classes may be defined in any order. 
            RuntimeTagElement _jettag_c_choose_73_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_73_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_73_3.setRuntimeParent(_jettag_c_iterate_70_1);
            _jettag_c_choose_73_3.setTagInfo(_td_c_choose_73_3);
            _jettag_c_choose_73_3.doStart(context, out);
            JET2Writer _jettag_c_choose_73_3_saved_out = out;
            while (_jettag_c_choose_73_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_74_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_74_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_74_5.setRuntimeParent(_jettag_c_choose_73_3);
                _jettag_c_when_74_5.setTagInfo(_td_c_when_74_5);
                _jettag_c_when_74_5.doStart(context, out);
                JET2Writer _jettag_c_when_74_5_saved_out = out;
                while (_jettag_c_when_74_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             defined.add( ec.getName() ); 
                    RuntimeTagElement _jettag_c_include_76_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_76_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_include_76_1.setRuntimeParent(_jettag_c_when_74_5);
                    _jettag_c_include_76_1.setTagInfo(_td_c_include_76_1);
                    _jettag_c_include_76_1.doStart(context, out);
                    _jettag_c_include_76_1.doEnd();
                    out.write(NL);         
                    _jettag_c_when_74_5.handleBodyContent(out);
                }
                out = _jettag_c_when_74_5_saved_out;
                _jettag_c_when_74_5.doEnd();
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_otherwise_79_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_79_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_79_5.setRuntimeParent(_jettag_c_choose_73_3);
                _jettag_c_otherwise_79_5.setTagInfo(_td_c_otherwise_79_5);
                _jettag_c_otherwise_79_5.doStart(context, out);
                JET2Writer _jettag_c_otherwise_79_5_saved_out = out;
                while (_jettag_c_otherwise_79_5.okToProcessBody()) {
                    out = out.newNestedContentWriter();
             queue.add( ec.getName() ); 
                    _jettag_c_otherwise_79_5.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_79_5_saved_out;
                _jettag_c_otherwise_79_5.doEnd();
                out.write(NL);         
                _jettag_c_choose_73_3.handleBodyContent(out);
            }
            out = _jettag_c_choose_73_3_saved_out;
            _jettag_c_choose_73_3.doEnd();
            _jettag_c_iterate_70_1.handleBodyContent(out);
        }
        _jettag_c_iterate_70_1.doEnd();

context.setVariable( "classQueue", XPathUtil.asNodeSet(queue) );
context.setVariable( "definedClasses", XPathUtil.asNodeSet(defined) );

        RuntimeTagElement _jettag_c_include_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_86_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_86_1.setRuntimeParent(null);
        _jettag_c_include_86_1.setTagInfo(_td_c_include_86_1);
        _jettag_c_include_86_1.doStart(context, out);
        _jettag_c_include_86_1.doEnd();
        out.write(NL);         
        //
        //<%
        //Iterator<String> i = queue.iterator();
        //while ( i.hasNext() )
        //{
        //  context.setVariable("eClassName", i.next());
        //
        //      %>
        //<c:setVariable var="eClass" select="$ePackage/EClass[@name = $eClassName]"/>
        //<c:include template="templates/class.jet" passVariables="eClass"/>
        //
        //<%
        //}
        //%>
        RuntimeTagElement _jettag_c_userRegion_103_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_103_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_103_1.setRuntimeParent(null);
        _jettag_c_userRegion_103_1.setTagInfo(_td_c_userRegion_103_1);
        _jettag_c_userRegion_103_1.doStart(context, out);
        while (_jettag_c_userRegion_103_1.okToProcessBody()) {
            out.write("# <<< ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_104_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_104_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_104_7.setRuntimeParent(_jettag_c_userRegion_103_1);
            _jettag_c_get_104_7.setTagInfo(_td_c_get_104_7);
            _jettag_c_get_104_7.doStart(context, out);
            _jettag_c_get_104_7.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_105_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_105_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_105_1.setRuntimeParent(_jettag_c_userRegion_103_1);
            _jettag_c_initialCode_105_1.setTagInfo(_td_c_initialCode_105_1);
            _jettag_c_initialCode_105_1.doStart(context, out);
            while (_jettag_c_initialCode_105_1.okToProcessBody()) {
                out.write("# @generated");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_initialCode_105_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_105_1.doEnd();
            out.write("# >>> ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_108_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_108_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_108_7.setRuntimeParent(_jettag_c_userRegion_103_1);
            _jettag_c_get_108_7.setTagInfo(_td_c_get_108_7);
            _jettag_c_get_108_7.doStart(context, out);
            _jettag_c_get_108_7.doEnd();
            out.write(NL);         
            _jettag_c_userRegion_103_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_103_1.doEnd();
    }
}
