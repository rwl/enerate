/* Copyright (c) 2009 Richard Lincoln */

package com.github.enerate.gae.action;

import com.github.enerate.core.GenerateCodeAction;

public class GenerateAppEngineAction extends GenerateCodeAction {

	public GenerateAppEngineAction() {
		super();
		this.transformId = "com.github.enerate.gae";
		this.jobDesc = "Googel App Engine Code Generation.";
	}

}
