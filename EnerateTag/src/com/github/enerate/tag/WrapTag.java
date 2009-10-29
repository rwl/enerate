package com.github.enerate.tag;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.taglib.AbstractFunctionTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;

public class WrapTag extends AbstractFunctionTag {

	public String doFunction(TagInfo td, JET2Context context, String bodyContent)
			throws JET2TagException {

//		String wrapLength = getAttribute("wrapLength");
//		String indentDepth = getAttribute("indentDepth");

		final String NEW_LINE = System.getProperty("line.separator");
		String newLineStr = StringUtils.leftPad(NEW_LINE, 8);

		String wrapped = WordUtils.wrap(bodyContent, 80, newLineStr, true);

		return wrapped;
	}

}
