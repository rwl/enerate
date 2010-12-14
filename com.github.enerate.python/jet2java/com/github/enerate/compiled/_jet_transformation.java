package com.github.enerate.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(14);
    static {
        pathToTemplateOrdinalMap.put("templates/attribute.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/class.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/comment.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/constructor.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/datatype.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/import.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/init.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/license.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/map.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/operation.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/package.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/package_name.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/reference.jet", //$NON-NLS-1$
                Integer.valueOf(13));
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
            case 0: // templates/attribute.jet
                return new com.github.enerate.compiled._jet_attribute();
            case 1: // templates/class.jet
                return new com.github.enerate.compiled._jet_class();
            case 2: // templates/comment.jet
                return new com.github.enerate.compiled._jet_comment();
            case 3: // templates/constructor.jet
                return new com.github.enerate.compiled._jet_constructor();
            case 4: // templates/datatype.jet
                return new com.github.enerate.compiled._jet_datatype();
            case 5: // templates/import.jet
                return new com.github.enerate.compiled._jet_import();
            case 6: // templates/init.jet
                return new com.github.enerate.compiled._jet_init();
            case 7: // templates/license.jet
                return new com.github.enerate.compiled._jet_license();
            case 8: // templates/main.jet
                return new com.github.enerate.compiled._jet_main();
            case 9: // templates/map.jet
                return new com.github.enerate.compiled._jet_map();
            case 10: // templates/operation.jet
                return new com.github.enerate.compiled._jet_operation();
            case 11: // templates/package.jet
                return new com.github.enerate.compiled._jet_package();
            case 12: // templates/package_name.jet
                return new com.github.enerate.compiled._jet_package_name();
            case 13: // templates/reference.jet
                return new com.github.enerate.compiled._jet_reference();
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
