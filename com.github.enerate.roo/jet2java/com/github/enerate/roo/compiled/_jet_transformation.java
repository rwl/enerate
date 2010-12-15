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
        pathToTemplateOrdinalMap.put("templates/attr.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/attributes.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/classes.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/comment.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/entity.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/enums.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/package_name.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/ref.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/references.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/root.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/sets.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/subclasses.jet", //$NON-NLS-1$
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
            case 0: // templates/attr.jet
                return new com.github.enerate.roo.compiled._jet_attr();
            case 1: // templates/attributes.jet
                return new com.github.enerate.roo.compiled._jet_attributes();
            case 2: // templates/classes.jet
                return new com.github.enerate.roo.compiled._jet_classes();
            case 3: // templates/comment.jet
                return new com.github.enerate.roo.compiled._jet_comment();
            case 4: // templates/entity.jet
                return new com.github.enerate.roo.compiled._jet_entity();
            case 5: // templates/enums.jet
                return new com.github.enerate.roo.compiled._jet_enums();
            case 6: // templates/main.jet
                return new com.github.enerate.roo.compiled._jet_main();
            case 7: // templates/package_name.jet
                return new com.github.enerate.roo.compiled._jet_package_name();
            case 8: // templates/ref.jet
                return new com.github.enerate.roo.compiled._jet_ref();
            case 9: // templates/references.jet
                return new com.github.enerate.roo.compiled._jet_references();
            case 10: // templates/root.jet
                return new com.github.enerate.roo.compiled._jet_root();
            case 11: // templates/sets.jet
                return new com.github.enerate.roo.compiled._jet_sets();
            case 12: // templates/subclasses.jet
                return new com.github.enerate.roo.compiled._jet_subclasses();
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
