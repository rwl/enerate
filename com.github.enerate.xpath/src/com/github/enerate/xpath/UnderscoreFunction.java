package com.github.enerate.xpath;

import java.util.List;
import org.eclipse.jet.xpath.XPathFunction;
import org.eclipse.jet.xpath.XPathUtil;
// import org.eclipse.jet.internal.xpath.functions.StringFunction;

public class UnderscoreFunction implements XPathFunction {

    public UnderscoreFunction() {
        super();
    }

  public Object evaluate(List args) {
    /**
     * @param string
     *            in the "camel" notation like "beMyCamel"
     * @return the resulting string in usual notation like "be_my_camel"
     *
     * @see AnyEdit Tools (TextUtil.java) by by Andrei Loskutov
     */
    String buffer = XPathUtil.xpathString(args.get(0));
    int size = buffer.length();
    StringBuffer sb = new StringBuffer(size);
    for (int i = 0; i < size; i++) {
        char c = buffer.charAt(i);
        if (i > 0) {
            char next = 'a';
            if (i < size - 1) {
                next = buffer.charAt(i + 1);
            }
            char prev = buffer.charAt(i - 1);
            if (Character.isUpperCase(c)
                    && Character.isJavaIdentifierPart(next)
                    && Character.isJavaIdentifierPart(prev)
                    && (prev != '_')
                    && !Character.isUpperCase(prev)) {
                sb.append('_');
            }
        }
        c = Character.toLowerCase(c);
        sb.append(c);
    }
    return sb;
  }
}
