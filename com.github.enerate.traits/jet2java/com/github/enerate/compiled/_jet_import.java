package com.github.enerate.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;
import org.eclipse.emf.ecore.*;
import java.util.*;

public class _jet_import implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_import() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_46_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            46, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass/eSuperTypes", //$NON-NLS-1$
                "eSuperType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_48_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            48, 5,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eSuperType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_50_5 = new TagInfo("c:if", //$NON-NLS-1$
            50, 5,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string($eSuper/@name) != string($ePackage/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_56_6 = new TagInfo("c:include", //$NON-NLS-1$
            56, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_56_87 = new TagInfo("c:get", //$NON-NLS-1$
            56, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eSuperType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_63_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            63, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass/eAttributes/eAttributeType", //$NON-NLS-1$
                "eAttributeType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_64_1 = new TagInfo("c:if", //$NON-NLS-1$
            64, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string($eAttributeType/ePackage/@name) != 'ecore' and string($eAttributeType/ePackage/@name) != string($ePackage/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_65_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            65, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eSuper", //$NON-NLS-1$
                "$eAttributeType/ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_66_6 = new TagInfo("c:include", //$NON-NLS-1$
            66, 6,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/package_name.jet", //$NON-NLS-1$
                "eSuper", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_66_87 = new TagInfo("c:get", //$NON-NLS-1$
            66, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eAttributeType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_71_1 = new TagInfo("c:if", //$NON-NLS-1$
            71, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/EClass[count(eSuperTypes) = 0]) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_75_1 = new TagInfo("c:if", //$NON-NLS-1$
            75, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/EClass/eReferences) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_83_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            83, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EDataType", //$NON-NLS-1$
                "eDataType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_99_1 = new TagInfo("c:if", //$NON-NLS-1$
            99, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($ePackage/EEnum) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_106_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            106, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass/eAttributes/eAttributeType/@name", //$NON-NLS-1$
                "eAttributeTypeName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_108_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            108, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eAttributeTypeName", //$NON-NLS-1$
                "string($eAttributeTypeName)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_userRegion_134_1 = new TagInfo("c:userRegion", //$NON-NLS-1$
            134, 1,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_initialCode_136_1 = new TagInfo("c:initialCode", //$NON-NLS-1$
            136, 1,
            new String[] {
                "unmodifiedMarker", //$NON-NLS-1$
            },
            new String[] {
                "@generated", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        // FIMXE: Remove duplication with the module template. 

HashMap<String, String> instanceTypeNameTraitMap = new HashMap<String, String>();
instanceTypeNameTraitMap.put("boolean", "Bool");
instanceTypeNameTraitMap.put("java.lang.Boolean", "Bool");
instanceTypeNameTraitMap.put("char", "Str");
instanceTypeNameTraitMap.put("java.lang.Character", "Str");
instanceTypeNameTraitMap.put("java.util.Date", "Date");
instanceTypeNameTraitMap.put("double", "Float");
instanceTypeNameTraitMap.put("java.lang.Double", "Float");
instanceTypeNameTraitMap.put("float", "Float");
instanceTypeNameTraitMap.put("java.lang.Float", "Float");
instanceTypeNameTraitMap.put("int", "Int");
instanceTypeNameTraitMap.put("java.lang.Integer", "Int");
instanceTypeNameTraitMap.put("java.lang.Class", "Class");
instanceTypeNameTraitMap.put("java.lang.Object", "Python");
instanceTypeNameTraitMap.put("long", "Long");
instanceTypeNameTraitMap.put("java.lang.Long", "Long");
instanceTypeNameTraitMap.put("java.util.Map", "Dict");
instanceTypeNameTraitMap.put("short", "Int");
instanceTypeNameTraitMap.put("java.lang.Short", "Int");
instanceTypeNameTraitMap.put("java.lang.String", "Str");


ArrayList<String> imported = new ArrayList<String>();
ArrayList<String> traitNames = new ArrayList<String>();
HashMap<String, String> eAttributeTraitMap = new HashMap<String, String>();
eAttributeTraitMap.put("EString", "Str");
eAttributeTraitMap.put("EInt", "Int");
eAttributeTraitMap.put("EBoolean", "Bool");
eAttributeTraitMap.put("EDate", "Date");
eAttributeTraitMap.put("EDouble", "Float");
eAttributeTraitMap.put("EList", "List");
eAttributeTraitMap.put("EEnumerator", "Enum");
eAttributeTraitMap.put("EFloat", "Float");
eAttributeTraitMap.put("ELong", "Long");
eAttributeTraitMap.put("EMap", "Dict");
eAttributeTraitMap.put("EShort", "Int");

eAttributeTraitMap.put("Integer", "Int");
eAttributeTraitMap.put("Boolean", "Bool");

        // Import super classes defined in other packages. 
        RuntimeTagElement _jettag_c_iterate_46_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_46_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_46_1.setRuntimeParent(null);
        _jettag_c_iterate_46_1.setTagInfo(_td_c_iterate_46_1);
        _jettag_c_iterate_46_1.doStart(context, out);
        while (_jettag_c_iterate_46_1.okToProcessBody()) {
            // The package in which the super class is defined. 
            RuntimeTagElement _jettag_c_setVariable_48_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_48_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_48_5.setRuntimeParent(_jettag_c_iterate_46_1);
            _jettag_c_setVariable_48_5.setTagInfo(_td_c_setVariable_48_5);
            _jettag_c_setVariable_48_5.doStart(context, out);
            _jettag_c_setVariable_48_5.doEnd();
            // Fixme: Use @nsPrefix aswell. 
            RuntimeTagElement _jettag_c_if_50_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_50_5); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_50_5.setRuntimeParent(_jettag_c_iterate_46_1);
            _jettag_c_if_50_5.setTagInfo(_td_c_if_50_5);
            _jettag_c_if_50_5.doStart(context, out);
            while (_jettag_c_if_50_5.okToProcessBody()) {
        
        EClass st = (EClass)context.getVariable("eSuperType");
        if ( !imported.contains( st.getName() ) ) {
          imported.add( st.getName() );
        
                out.write("from ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_56_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_56_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_56_6.setRuntimeParent(_jettag_c_if_50_5);
                _jettag_c_include_56_6.setTagInfo(_td_c_include_56_6);
                _jettag_c_include_56_6.doStart(context, out);
                _jettag_c_include_56_6.doEnd();
                out.write(" import ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_56_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_56_87); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_56_87.setRuntimeParent(_jettag_c_if_50_5);
                _jettag_c_get_56_87.setTagInfo(_td_c_get_56_87);
                _jettag_c_get_56_87.doStart(context, out);
                _jettag_c_get_56_87.doEnd();
                out.write(NL);         
        
        }
        
                _jettag_c_if_50_5.handleBodyContent(out);
            }
            _jettag_c_if_50_5.doEnd();
            _jettag_c_iterate_46_1.handleBodyContent(out);
        }
        _jettag_c_iterate_46_1.doEnd();
        // Import custom trait attributes that are not defined in the 'ecore' package or the template's package. 
        RuntimeTagElement _jettag_c_iterate_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_63_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_63_1.setRuntimeParent(null);
        _jettag_c_iterate_63_1.setTagInfo(_td_c_iterate_63_1);
        _jettag_c_iterate_63_1.doStart(context, out);
        while (_jettag_c_iterate_63_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_if_64_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_64_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_64_1.setRuntimeParent(_jettag_c_iterate_63_1);
            _jettag_c_if_64_1.setTagInfo(_td_c_if_64_1);
            _jettag_c_if_64_1.doStart(context, out);
            while (_jettag_c_if_64_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_65_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_65_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_65_1.setRuntimeParent(_jettag_c_if_64_1);
                _jettag_c_setVariable_65_1.setTagInfo(_td_c_setVariable_65_1);
                _jettag_c_setVariable_65_1.doStart(context, out);
                _jettag_c_setVariable_65_1.doEnd();
                out.write("from ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_include_66_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_66_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_66_6.setRuntimeParent(_jettag_c_if_64_1);
                _jettag_c_include_66_6.setTagInfo(_td_c_include_66_6);
                _jettag_c_include_66_6.doStart(context, out);
                _jettag_c_include_66_6.doEnd();
                out.write(" import ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_66_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_66_87); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_66_87.setRuntimeParent(_jettag_c_if_64_1);
                _jettag_c_get_66_87.setTagInfo(_td_c_get_66_87);
                _jettag_c_get_66_87.doStart(context, out);
                _jettag_c_get_66_87.doEnd();
                out.write(NL);         
                _jettag_c_if_64_1.handleBodyContent(out);
            }
            _jettag_c_if_64_1.doEnd();
            _jettag_c_iterate_63_1.handleBodyContent(out);
        }
        _jettag_c_iterate_63_1.doEnd();
        out.write(NL);         
        // Import HasTraits if any classes in the package have no super type. 
        RuntimeTagElement _jettag_c_if_71_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_71_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_71_1.setRuntimeParent(null);
        _jettag_c_if_71_1.setTagInfo(_td_c_if_71_1);
        _jettag_c_if_71_1.doStart(context, out);
        while (_jettag_c_if_71_1.okToProcessBody()) {
     traitNames.add( "HasTraits" ); 
            _jettag_c_if_71_1.handleBodyContent(out);
        }
        _jettag_c_if_71_1.doEnd();
        // Import reference traits. 
        RuntimeTagElement _jettag_c_if_75_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_75_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_75_1.setRuntimeParent(null);
        _jettag_c_if_75_1.setTagInfo(_td_c_if_75_1);
        _jettag_c_if_75_1.doStart(context, out);
        while (_jettag_c_if_75_1.okToProcessBody()) {
    
    traitNames.add( "Instance" );
    traitNames.add( "List" );
    traitNames.add( "Property" );
    
            _jettag_c_if_75_1.handleBodyContent(out);
        }
        _jettag_c_if_75_1.doEnd();
        // Import traits used by any custom traits. 
        RuntimeTagElement _jettag_c_iterate_83_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_83_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_83_1.setRuntimeParent(null);
        _jettag_c_iterate_83_1.setTagInfo(_td_c_iterate_83_1);
        _jettag_c_iterate_83_1.doStart(context, out);
        while (_jettag_c_iterate_83_1.okToProcessBody()) {
    
    EDataType dt = (EDataType)context.getVariable("eDataType");
    String dtn;

    if ( instanceTypeNameTraitMap.containsKey( dt.getInstanceTypeName() ) ) {
        dtn = instanceTypeNameTraitMap.get( dt.getInstanceTypeName() );
    } else {
        dtn = "Str";
    }

    if ( !traitNames.contains( dtn ) ) {
        traitNames.add( dtn );
    }
    
            _jettag_c_iterate_83_1.handleBodyContent(out);
        }
        _jettag_c_iterate_83_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_if_99_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_99_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_99_1.setRuntimeParent(null);
        _jettag_c_if_99_1.setTagInfo(_td_c_if_99_1);
        _jettag_c_if_99_1.doStart(context, out);
        while (_jettag_c_if_99_1.okToProcessBody()) {
    
    if ( !traitNames.contains( "Enum" ) ) {
        traitNames.add( "Enum" );
    }
            _jettag_c_if_99_1.handleBodyContent(out);
        }
        _jettag_c_if_99_1.doEnd();
        out.write(NL);         
        // Import trait attributes. 
        RuntimeTagElement _jettag_c_iterate_106_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_106_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_106_1.setRuntimeParent(null);
        _jettag_c_iterate_106_1.setTagInfo(_td_c_iterate_106_1);
        _jettag_c_iterate_106_1.doStart(context, out);
        while (_jettag_c_iterate_106_1.okToProcessBody()) {
            // Coerce to string. 
            RuntimeTagElement _jettag_c_setVariable_108_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_108_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_108_1.setRuntimeParent(_jettag_c_iterate_106_1);
            _jettag_c_setVariable_108_1.setTagInfo(_td_c_setVariable_108_1);
            _jettag_c_setVariable_108_1.doStart(context, out);
            _jettag_c_setVariable_108_1.doEnd();
    
    String atn = (String)context.getVariable("eAttributeTypeName");
    String tn;

    if ( eAttributeTraitMap.containsKey( atn ) ) {
        tn = eAttributeTraitMap.get( atn );
    } else if ( eAttributeTraitMap.containsValue( atn ) ) {
        tn = atn;
    } else {
      tn = " ";
    }

    if ( !traitNames.contains( tn ) && !tn.equals(" ") ) {
      traitNames.add( tn );
    }
    
            _jettag_c_iterate_106_1.handleBodyContent(out);
        }
        _jettag_c_iterate_106_1.doEnd();

if ( traitNames.size() > 0) {

        out.write("from enthought.traits.api import ");  //$NON-NLS-1$        

  Iterator<String> i = traitNames.iterator();
  if ( i.hasNext() ) {
      
        out.write( i.next() );

      while ( i.hasNext() ) {
          
        out.write(", ");  //$NON-NLS-1$        
        out.write( i.next() );

      }
  }
}
        out.write(NL);         
        RuntimeTagElement _jettag_c_userRegion_134_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "userRegion", "c:userRegion", _td_c_userRegion_134_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_userRegion_134_1.setRuntimeParent(null);
        _jettag_c_userRegion_134_1.setTagInfo(_td_c_userRegion_134_1);
        _jettag_c_userRegion_134_1.doStart(context, out);
        while (_jettag_c_userRegion_134_1.okToProcessBody()) {
            out.write("# <<< imports");  //$NON-NLS-1$        
            out.write(NL);         
            RuntimeTagElement _jettag_c_initialCode_136_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "initialCode", "c:initialCode", _td_c_initialCode_136_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_initialCode_136_1.setRuntimeParent(_jettag_c_userRegion_134_1);
            _jettag_c_initialCode_136_1.setTagInfo(_td_c_initialCode_136_1);
            _jettag_c_initialCode_136_1.doStart(context, out);
            while (_jettag_c_initialCode_136_1.okToProcessBody()) {
                out.write("# @generated");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("from enthought.traits.ui.api import View, Group, Item, HGroup, VGroup, Tabbed, VGrid, InstanceEditor");  //$NON-NLS-1$        
                _jettag_c_initialCode_136_1.handleBodyContent(out);
            }
            _jettag_c_initialCode_136_1.doEnd();
            out.write(NL);         
            out.write("# >>> imports");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_userRegion_134_1.handleBodyContent(out);
        }
        _jettag_c_userRegion_134_1.doEnd();
    }
}
