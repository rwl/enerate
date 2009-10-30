package com.github.enerate.tag;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.WordUtils;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.taglib.AbstractFunctionTag;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;

public class WrapTag extends AbstractFunctionTag {

	public String doFunction(TagInfo td, JET2Context context, String bodyContent)
			throws JET2TagException {

		int wrapLength = Integer.parseInt(getAttribute("wrapLength"));
		String linePrefix = getAttribute("linePrefix");

		final String NEW_LINE = SystemUtils.LINE_SEPARATOR;
//		String newLineStr = StringUtils.rightPad(NEW_LINE, 8);
		String newLineStr = NEW_LINE + linePrefix;

		String wrapped = WordUtils.wrap(bodyContent, wrapLength, newLineStr, false);

		return wrapped;
	}

}
