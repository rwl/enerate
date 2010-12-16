package com.github.enerate.roo.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(13);
    static {
        pathToTemplateOrdinalMap.put("templates/annotate.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/attr.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/attributes.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/classes.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/comment.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/entity.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/enums.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/package_name.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/ref.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/references.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/root.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/sets.jet", //$NON-NLS-1$
                Integer.valueOf(12));
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
            case 0: // templates/annotate.jet
                return new com.github.enerate.roo.compiled._jet_annotate();
            case 1: // templates/attr.jet
                return new com.github.enerate.roo.compiled._jet_attr();
            case 2: // templates/attributes.jet
                return new com.github.enerate.roo.compiled._jet_attributes();
            case 3: // templates/classes.jet
                return new com.github.enerate.roo.compiled._jet_classes();
            case 4: // templates/comment.jet
                return new com.github.enerate.roo.compiled._jet_comment();
            case 5: // templates/entity.jet
                return new com.github.enerate.roo.compiled._jet_entity();
            case 6: // templates/enums.jet
                return new com.github.enerate.roo.compiled._jet_enums();
            case 7: // templates/main.jet
                return new com.github.enerate.roo.compiled._jet_main();
            case 8: // templates/package_name.jet
                return new com.github.enerate.roo.compiled._jet_package_name();
            case 9: // templates/ref.jet
                return new com.github.enerate.roo.compiled._jet_ref();
            case 10: // templates/references.jet
                return new com.github.enerate.roo.compiled._jet_references();
            case 11: // templates/root.jet
                return new com.github.enerate.roo.compiled._jet_root();
            case 12: // templates/sets.jet
                return new com.github.enerate.roo.compiled._jet_sets();
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
