/* Copyright (C) 2010 Richard Lincoln */

package com.github.enerate.csharp.action;

import com.github.enerate.core.GenerateCodeAction;

public class GenerateCSharpAction extends GenerateCodeAction {

	public GenerateCSharpAction() {
		super();
		this.transformId = "com.github.enerate.csharp";
		this.jobDesc = "Generate C# Code";
	}

}
