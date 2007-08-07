/***************************************************************************************************
 * Copyright (c) 2005 Eteration A.S. and Gorkem Ercan. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Gorkem Ercan - initial API and implementation
 *               
 **************************************************************************************************/
package org.eclipse.jst.server.generic.ui.internal;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
/**
 * SWT Utility class.
 * Copied from org.eclipse.wst.server.ui.internal.
 */
public class SWTUtil {
	private static FontMetrics fontMetrics;

	protected static void initializeDialogUnits(Control testControl) {
		// Compute and store a font metric
		GC gc = new GC(testControl);
		gc.setFont(JFaceResources.getDialogFont());
		fontMetrics = gc.getFontMetrics();
		gc.dispose();
	}

	/**
	 * Returns a width hint for a button control.
	 */
	protected static int getButtonWidthHint(Button button) {
		int widthHint = Dialog.convertHorizontalDLUsToPixels(fontMetrics, IDialogConstants.BUTTON_WIDTH);
		return Math.max(widthHint, button.computeSize(SWT.DEFAULT, SWT.DEFAULT, true).x);
	}

	/**
	 * Create a new button with the standard size.
	 * 
	 * @param comp the component to add the button to
	 * @param label the button label
	 * @return a button
	 */
	public static Button createButton(Composite comp, String label) {
		Button b = new Button(comp, SWT.PUSH);
		b.setText(label);
		if (fontMetrics == null)
			initializeDialogUnits(comp);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_BEGINNING);
		data.widthHint = getButtonWidthHint(b);
		b.setLayoutData(data);
		return b;
	}
	
	/**
	 * Convert DLUs to pixels.
	 * 
	 * @param comp a component
	 * @param x pixels
	 * @return dlus
	 */
	public static int convertHorizontalDLUsToPixels(Composite comp, int x) {
		if (fontMetrics == null)
			initializeDialogUnits(comp);
		return Dialog.convertHorizontalDLUsToPixels(fontMetrics, x);
	}

	/**
	 * Convert DLUs to pixels.
	 * 
	 * @param comp a component
	 * @param y pixels
	 * @return dlus
	 */
	public static int convertVerticalDLUsToPixels(Composite comp, int y) {
		if (fontMetrics == null)
			initializeDialogUnits(comp);
		return Dialog.convertVerticalDLUsToPixels(fontMetrics, y);
	}
}