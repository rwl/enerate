package com.github.enerate.java.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_package implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_package() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_java_package_1_1 = new TagInfo("java:package", //$NON-NLS-1$
            1, 1,
            new String[] {
                "name", //$NON-NLS-1$
            },
            new String[] {
                "{$ePackage/@fullyQualifiedName}", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/EClass", //$NON-NLS-1$
                "eClass", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_5_5 = new TagInfo("java:class", //$NON-NLS-1$
            5, 5,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{$eClass/@name}", //$NON-NLS-1$
                "templates/class.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$ePackage/eSubpackages", //$NON-NLS-1$
                "ePackage", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_10_5 = new TagInfo("c:include", //$NON-NLS-1$
            10, 5,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/package.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_java_package_1_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_package_1_1.setRuntimeParent(null);
        _jettag_java_package_1_1.setTagInfo(_td_java_package_1_1);
        _jettag_java_package_1_1.doStart(context, out);
        while (_jettag_java_package_1_1.okToProcessBody()) {
            out.write(NL);         
            // java:class and java:resource tags here will be relative to org.example 
            RuntimeTagElement _jettag_c_iterate_4_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_3.setRuntimeParent(_jettag_java_package_1_1);
            _jettag_c_iterate_4_3.setTagInfo(_td_c_iterate_4_3);
            _jettag_c_iterate_4_3.doStart(context, out);
            while (_jettag_c_iterate_4_3.okToProcessBody()) {
                out.write("    ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_java_class_5_5 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_5_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_class_5_5.setRuntimeParent(_jettag_c_iterate_4_3);
                _jettag_java_class_5_5.setTagInfo(_td_java_class_5_5);
                _jettag_java_class_5_5.doStart(context, out);
                _jettag_java_class_5_5.doEnd();
                out.write(NL);         
                _jettag_c_iterate_4_3.handleBodyContent(out);
            }
            _jettag_c_iterate_4_3.doEnd();
            out.write(NL);         
            // Recursively call the package template with any subpackages. 
            RuntimeTagElement _jettag_c_iterate_9_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_9_3.setRuntimeParent(_jettag_java_package_1_1);
            _jettag_c_iterate_9_3.setTagInfo(_td_c_iterate_9_3);
            _jettag_c_iterate_9_3.doStart(context, out);
            while (_jettag_c_iterate_9_3.okToProcessBody()) {
                RuntimeTagElement _jettag_c_include_10_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_10_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_10_5.setRuntimeParent(_jettag_c_iterate_9_3);
                _jettag_c_include_10_5.setTagInfo(_td_c_include_10_5);
                _jettag_c_include_10_5.doStart(context, out);
                _jettag_c_include_10_5.doEnd();
                _jettag_c_iterate_9_3.handleBodyContent(out);
            }
            _jettag_c_iterate_9_3.doEnd();
            _jettag_java_package_1_1.handleBodyContent(out);
        }
        _jettag_java_package_1_1.doEnd();
    }
}
