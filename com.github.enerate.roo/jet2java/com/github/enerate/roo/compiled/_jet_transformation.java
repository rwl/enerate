package com.github.enerate.roo.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(7);
    static {
        pathToTemplateOrdinalMap.put("templates/attr.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/comment.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/field.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/package_name.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/reference.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/script.jet", //$NON-NLS-1$
                Integer.valueOf(6));
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
            case 1: // templates/comment.jet
                return new com.github.enerate.roo.compiled._jet_comment();
            case 2: // templates/field.jet
                return new com.github.enerate.roo.compiled._jet_field();
            case 3: // templates/main.jet
                return new com.github.enerate.roo.compiled._jet_main();
            case 4: // templates/package_name.jet
                return new com.github.enerate.roo.compiled._jet_package_name();
            case 5: // templates/reference.jet
                return new com.github.enerate.roo.compiled._jet_reference();
            case 6: // templates/script.jet
                return new com.github.enerate.roo.compiled._jet_script();
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
