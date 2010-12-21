package com.github.enerate.java.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(10);
    static {
        pathToTemplateOrdinalMap.put("templates/annotate.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/attr-accessors.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/attr.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/class.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/license.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/package.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/package_name.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/ref-accessors.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/ref.jet", //$NON-NLS-1$
                Integer.valueOf(9));
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
                return new com.github.enerate.java.compiled._jet_annotate();
            case 1: // templates/attr-accessors.jet
                return new com.github.enerate.java.compiled._jet_attraccessors();
            case 2: // templates/attr.jet
                return new com.github.enerate.java.compiled._jet_attr();
            case 3: // templates/class.jet
                return new com.github.enerate.java.compiled._jet_class();
            case 4: // templates/license.jet
                return new com.github.enerate.java.compiled._jet_license();
            case 5: // templates/main.jet
                return new com.github.enerate.java.compiled._jet_main();
            case 6: // templates/package.jet
                return new com.github.enerate.java.compiled._jet_package();
            case 7: // templates/package_name.jet
                return new com.github.enerate.java.compiled._jet_package_name();
            case 8: // templates/ref-accessors.jet
                return new com.github.enerate.java.compiled._jet_refaccessors();
            case 9: // templates/ref.jet
                return new com.github.enerate.java.compiled._jet_ref();
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
