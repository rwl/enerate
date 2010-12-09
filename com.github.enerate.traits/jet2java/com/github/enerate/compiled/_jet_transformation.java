package com.github.enerate.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(20);
    static {
        pathToTemplateOrdinalMap.put("templates/adapter.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/attribute.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/cim/reference.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/class.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/comment.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/grapheditor.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/hierarchy.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/import.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/license.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/module.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/operation.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/package.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/package_name.jet", //$NON-NLS-1$
                Integer.valueOf(14));
        pathToTemplateOrdinalMap.put("templates/queue.jet", //$NON-NLS-1$
                Integer.valueOf(15));
        pathToTemplateOrdinalMap.put("templates/reference.jet", //$NON-NLS-1$
                Integer.valueOf(16));
        pathToTemplateOrdinalMap.put("templates/treeeditor.jet", //$NON-NLS-1$
                Integer.valueOf(17));
        pathToTemplateOrdinalMap.put("templates/treenode.jet", //$NON-NLS-1$
                Integer.valueOf(18));
        pathToTemplateOrdinalMap.put("templates/view.jet", //$NON-NLS-1$
                Integer.valueOf(19));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/adapter.jet
                return new com.github.enerate.compiled._jet_adapter();
            case 1: // templates/attribute.jet
                return new com.github.enerate.compiled._jet_attribute();
            case 2: // templates/cim/reference.jet
                return new com.github.enerate.compiled._jet_reference_0();
            case 3: // templates/class.jet
                return new com.github.enerate.compiled._jet_class();
            case 4: // templates/comment.jet
                return new com.github.enerate.compiled._jet_comment();
            case 5: // templates/dump.jet
                return new com.github.enerate.compiled._jet_dump();
            case 6: // templates/grapheditor.jet
                return new com.github.enerate.compiled._jet_grapheditor();
            case 7: // templates/hierarchy.jet
                return new com.github.enerate.compiled._jet_hierarchy();
            case 8: // templates/import.jet
                return new com.github.enerate.compiled._jet_import();
            case 9: // templates/license.jet
                return new com.github.enerate.compiled._jet_license();
            case 10: // templates/main.jet
                return new com.github.enerate.compiled._jet_main();
            case 11: // templates/module.jet
                return new com.github.enerate.compiled._jet_module();
            case 12: // templates/operation.jet
                return new com.github.enerate.compiled._jet_operation();
            case 13: // templates/package.jet
                return new com.github.enerate.compiled._jet_package();
            case 14: // templates/package_name.jet
                return new com.github.enerate.compiled._jet_package_name();
            case 15: // templates/queue.jet
                return new com.github.enerate.compiled._jet_queue();
            case 16: // templates/reference.jet
                return new com.github.enerate.compiled._jet_reference();
            case 17: // templates/treeeditor.jet
                return new com.github.enerate.compiled._jet_treeeditor();
            case 18: // templates/treenode.jet
                return new com.github.enerate.compiled._jet_treenode();
            case 19: // templates/view.jet
                return new com.github.enerate.compiled._jet_view();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
