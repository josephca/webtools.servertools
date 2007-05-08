/*******************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - Initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.server.ui.tests.editor;

import junit.framework.TestCase;

import org.eclipse.wst.server.ui.editor.ServerEditorSection;

public class ServerEditorSectionTestCase extends TestCase {
	protected static ServerEditorSection section;

	public void test00Create() {
		section = new ServerEditorSection() {
			// do nothing
		};
	}

	public void test01Init() {
		section.init(null, null);
	}
	
	public void test02CreateSection() {
		section.createSection(null);
	}
	
	public void test03Dispose() {
		section.dispose();
	}
	
	public void test04GetErrorMessage() {
		section.getErrorMessage();
	}
	
	public void test05GetSaveStatus() {
		section.getSaveStatus();
	}
	
	public void test06GetShell() {
		try {
			section.getShell();
		} catch (Exception e) {
			// ignore
		}
	}
	
	public void test07SetServerEditorPart() {
		section.setServerEditorPart(null);
	}
	
	public void test08SetErrorMessage() {
		section.setErrorMessage(null);
	}
}